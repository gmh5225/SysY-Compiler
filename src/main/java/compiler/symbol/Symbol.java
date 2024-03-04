package compiler.symbol;
import compiler.scope.Scope;
import compiler.type.Type;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

public interface Symbol {
    public String getName();

    public void setName(String name);

    public String getType();

    public Type getRealType();

    public Scope getScope(); // get scope of this symbol

    public LLVMValueRef getLLVMValueRef();

    public void setLLVMValueRef(LLVMValueRef llvmValueRef);
}
