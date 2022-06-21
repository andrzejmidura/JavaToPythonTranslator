import antlr.javaLexer;
import antlr.javaParser;
import expression.OurVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream test_valid = CharStreams.fromFileName(".\\src\\tests\\test_valid.txt");
        CharStream test_empty_block_error = CharStreams.fromFileName(".\\src\\tests\\test_empty_block_error.txt");

        javaLexer lexer = new javaLexer(test_empty_block_error);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);

        String str = new OurVisitor().visit(parser.prog());
        System.out.println(str);
    }
}
