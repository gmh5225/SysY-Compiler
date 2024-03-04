package compiler.symbol;
import compiler.scope.Scope;
import compiler.type.Type;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

public class BaseSymbol implements Symbol {
    private String name;
    private final Type type;
    private final Scope scope;
    private LLVMValueRef llvmValueRef;

    public BaseSymbol(String name, Type type, Scope scope, LLVMValueRef llvmValueRef) {
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.llvmValueRef = llvmValueRef;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getType() {
        return this.type.toString();
    }
    @Override
    public Type getRealType() {
        return this.type;
    }
    @Override
    public Scope getScope() {
        return this.scope;
    }
    @Override
    public LLVMValueRef getLLVMValueRef() {
        return this.llvmValueRef;
    }
    @Override
    public void setLLVMValueRef(LLVMValueRef llvmValueRef) {
        this.llvmValueRef = llvmValueRef;
    }


    @Override
    public String toString() {
        // for debugging use!!!
        StringBuilder sb = new StringBuilder();
        sb.append("Symbol ").append(name).append(" in scope ").append(scope.getName()).append(" Type ").append(type);
        return sb.toString();
    }
}

