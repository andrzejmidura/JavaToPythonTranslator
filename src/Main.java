import antlr.javaLexer;
import antlr.javaParser;
import expression.OurVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream in = CharStreams.fromFileName(".\\src\\tests\\test.txt");
        javaLexer lexer = new javaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);

        String str = new OurVisitor().visit(parser.prog());
        System.out.println(str);
    }
}
