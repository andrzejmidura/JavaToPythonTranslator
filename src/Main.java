import antlr.javaLexer;
import antlr.javaParser;
import expression.PrettyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream in = CharStreams.fromFileName("C:\\Users\\ppyrc\\IdeaProjects\\JavaToPythonTranslator\\src\\antlr\\test1.txt");
        javaLexer lexer = new javaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);

        String str = new PrettyVisitor().visit(parser.imps());
        System.out.println(str);
    }
}
