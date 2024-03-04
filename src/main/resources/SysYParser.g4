parser grammar SysYParser;

options {
    tokenVocab = SysYLexer; // import lexer rules
}

program: compUnit;

compUnit: (funcDef | decl)+ EOF;

decl: constDecl | varDecl; // declare

constDecl: CONST bType constDef (COMMA constDef)* SEMICOLON; // 'const int a, b;' is ok

bType: INT; // basic type

constDef: IDENT (L_BRACKT constExp R_BRACKT)* ASSIGN constInitVal; // const define

constInitVal: constExp
            | L_BRACE (constInitVal (COMMA constInitVal)*)? R_BRACE;

varDecl: bType varDef (COMMA varDef)* SEMICOLON;

varDef: IDENT (L_BRACKT constExp R_BRACKT)*
        | IDENT (L_BRACKT constExp R_BRACKT)* ASSIGN initVal;

initVal: exp
        | L_BRACE (initVal (COMMA initVal)*)?R_BRACE;

funcDef: funcType IDENT L_PAREN funcFParams? R_PAREN block;

funcType: VOID | INT;

funcFParams: funcFParam (COMMA funcFParam)*;

funcFParam: bType IDENT (L_BRACKT R_BRACKT (L_BRACKT exp R_BRACKT)*)?;

block: L_BRACE blockItem* R_BRACE;

blockItem: decl | stmt;

stmt: lVal ASSIGN exp SEMICOLON # stmtAssign
    | (exp)? SEMICOLON # stmtExp
    | block # stmtBlock
    | IF L_PAREN cond R_PAREN stmt (ELSE stmt)? # stmtIf
    | WHILE L_PAREN cond R_PAREN stmt # stmtWhile
    | BREAK SEMICOLON # stmtBreak
    | CONTINUE SEMICOLON # stmtContinue
    | RETURN (exp)? SEMICOLON # stmtReturn
    ;

exp: L_PAREN exp R_PAREN # expParen
    | lVal # expLVal
    | number # expNum
    | IDENT L_PAREN funcRParams? R_PAREN # expCallFunc
    | unaryOp exp # expUnary
    | exp (MUL | DIV | MOD) exp # expMul
    | exp (PLUS | MINUS) exp # expPlus
    ;

cond: exp
    | cond (LT | GT | LE | GE) cond
    | cond (EQ | NEQ) cond
    | cond AND cond
    | cond OR cond ;

lVal: IDENT (L_BRACKT exp R_BRACKT)*; // a[3]

number: INTEGR_CONST;

unaryOp: PLUS
    | MINUS
    | NOT;

funcRParams: param (COMMA param)*;

param: exp;

constExp: exp;