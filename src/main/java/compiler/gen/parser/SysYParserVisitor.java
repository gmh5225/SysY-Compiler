// Generated from D:/OneDrive/����/SysYCompiler/src/main/resources/SysYParser.g4 by ANTLR 4.13.1
package compiler.gen.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SysYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SysYParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SysYParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SysYParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(SysYParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SysYParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SysYParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(SysYParser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(SysYParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(SysYParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SysYParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(SysYParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(SysYParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(SysYParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(SysYParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#funcFParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParams(SysYParser.FuncFParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#funcFParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParam(SysYParser.FuncFParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SysYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(SysYParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(SysYParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExp}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExp(SysYParser.StmtExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBlock}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(SysYParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(SysYParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(SysYParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBreak(SysYParser.StmtBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtContinue(SysYParser.StmtContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link SysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(SysYParser.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expUnary}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnary(SysYParser.ExpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNum}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNum(SysYParser.ExpNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParen}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParen(SysYParser.ExpParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLVal}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLVal(SysYParser.ExpLValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPlus(SysYParser.ExpPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCallFunc}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCallFunc(SysYParser.ExpCallFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMul}
	 * labeled alternative in {@link SysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMul(SysYParser.ExpMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SysYParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(SysYParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SysYParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(SysYParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(SysYParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SysYParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(SysYParser.ConstExpContext ctx);
}