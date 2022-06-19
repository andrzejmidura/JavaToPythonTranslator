package expression;

import antlr.javaBaseVisitor;
import antlr.javaParser;

public class PrettyVisitor extends javaBaseVisitor<String> {
    @Override
    public String visitImports(javaParser.ImportsContext ctx) {
        return ctx.getText();
    }


}
