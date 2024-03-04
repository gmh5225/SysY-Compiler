package compiler.scope;


import compiler.symbol.Symbol;

import java.util.Map;

public interface Scope {
    public void setName(String name); // set name of this scope

    public String getName(); // get name of this scope

    public void define(String name, Symbol symbol); // define(insert) a symbol in this scope

    public Symbol resolve(String name); // Search a symbol using its name

    public Map<String, Symbol> getSymbols(); // Return symbol table of this scope

    public Scope getEnclosingScope(); // get outer(parent) scope of this scope
}
