package compiler;

import compiler.gen.parser.SysYLexer;
import compiler.gen.parser.SysYParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bytedeco.javacpp.BytePointer;

import java.io.IOException;

import static org.bytedeco.llvm.global.LLVM.LLVMDisposeMessage;
import static org.bytedeco.llvm.global.LLVM.LLVMPrintModuleToFile;


public class Main {
    public static final BytePointer error = new BytePointer();

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Missing arguments!");
        }
        String source = args[0];
        CharStream input = CharStreams.fromFileName(source);
        SysYLexer lexer = new SysYLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SysYParser parser = new SysYParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener, tree);
        if (LLVMPrintModuleToFile(listener.getModule(), args[1], error) != 0) {
            LLVMDisposeMessage(error);
        }
    }
}
