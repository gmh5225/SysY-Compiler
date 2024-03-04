package compiler.scope;

public class LocalScope extends BaseScope {
    public LocalScope(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }
}
