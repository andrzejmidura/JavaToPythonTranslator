package expression;

import antlr.javaBaseVisitor;
import antlr.javaParser;

import java.util.*;

public class OurVisitor extends javaBaseVisitor<String> {
    List<String> classNames = new ArrayList<>();
    List<String> errors = new ArrayList<>();
    HashMap<String, LinkedList<String>> types = new HashMap<>(5);
    Set<String> keywords = new HashSet<>();
    int currIndent = 0;
    int currLine = 1;

    public OurVisitor() {
        types.put("int", new LinkedList<>());
        types.put("float", new LinkedList<>());
        types.put("char", new LinkedList<>());
        types.put("bool", new LinkedList<>());

        keywords.add("abstract");
        keywords.add("boolean");
        keywords.add("class");
        keywords.add("case");
        keywords.add("char");
        keywords.add("do");
        keywords.add("else");
        keywords.add("extends");
        keywords.add("float");
        keywords.add("if");
        keywords.add("implements");
        keywords.add("import");
        keywords.add("int");
        keywords.add("new");
        keywords.add("private");
        keywords.add("protected");
        keywords.add("public");
        keywords.add("return");
        keywords.add("short");
        keywords.add("void");
        keywords.add("while");
    }

    private boolean isKeyword(String id) {
        if (keywords.contains(id)) return true;
        else return false;
    }

    @Override
    public String visitProg(javaParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder("");
        if (ctx.imps()!=null) sb.append(this.visitImps(ctx.imps()));
        if (ctx.clss()!=null) sb.append(this.visitClss(ctx.clss()));



        sb.append("\n\nErrors:\n");
        errors.forEach(sb::append);
        return sb.toString();
    }

    @Override
    public String visitImps(javaParser.ImpsContext ctx) {
        StringBuilder sb = new StringBuilder("");
        sb.append(ctx.children.get(0));
        sb.append(" ");
        for (int i = 0; i<ctx.fpac().size(); i++) {
            sb.append(this.visitFpac(ctx.fpac().get(i)));
        }
        sb.append("\n");
        currLine++;
        return sb.toString();
    }

    @Override
    public String visitFpac(javaParser.FpacContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitClss(javaParser.ClssContext ctx) {
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<ctx.classDef().size(); i++) {
            sb.append(this.visitClassDef(ctx.classDef(i)));

        }
        return sb.toString();
    }

    @Override
    public String visitClassDef(javaParser.ClassDefContext ctx) {
        StringBuilder sb = new StringBuilder("");

        sb.append(this.visitCls_head(ctx.cls_head()));
        currIndent += 1;
        sb.append(this.visitCls_body(ctx.cls_body()));
        currIndent -= 1;

        return sb.toString();
    }

    @Override
    public String visitCls_head(javaParser.Cls_headContext ctx) {
        StringBuilder sb = new StringBuilder("");

        sb.append(ctx.KW_CLASS()).append(" ");
        if (classNames.contains(ctx.ID(0).toString())) {
            try {
                throw new Exception("Class '" + ctx.ID(0).toString() + "' already defined!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sb.append(ctx.ID(0));
        classNames.add(ctx.ID(0).toString());
        sb.append(":\n");
        currLine++;

        return sb.toString();
    }

    @Override
    public String visitCls_body(javaParser.Cls_bodyContext ctx) {
        StringBuilder sb = new StringBuilder("");
        int vd = 0;
        int mt = 0;
        for (int i=0; i<ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof javaParser.Var_defContext) {
                for (int j=0; j<currIndent; j++) sb.append("\t");
                sb.append(this.visitVar_def(ctx.var_def(vd)));
                sb.append("\n");
                currLine++;
                vd++;
            }
            else {
                for (int j=0; j<currIndent; j++) sb.append("\t");
                sb.append(this.visitMth(ctx.mth(mt)));
                mt++;
            }
        }

        return sb.toString();
    }

    @Override
    public String visitVar_def(javaParser.Var_defContext ctx) {
        StringBuilder sb = new StringBuilder("");
        if (ctx.SEP_ASS()!=null) {
            if (isKeyword(ctx.ID().toString())) errors.add("Variable name error: can't be a keyword!");
            if (visitAccess_mod(ctx.access_mod()).equals("private")) {
                sb.append("__");
            }

            else if (visitAccess_mod(ctx.access_mod()).equals("protected")) {
                sb.append("_");
            }

            sb.append(ctx.ID());
            sb.append(" ");
            sb.append(ctx.SEP_ASS());
            sb.append(" ");
            sb.append(this.visitExpr(ctx.expr()));
        }

        return sb.toString();
    }

    @Override
    public String visitExpr(javaParser.ExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMth(javaParser.MthContext ctx) {
        StringBuilder sb = new StringBuilder("");
        if (ctx.mth_head()!=null && ctx.blck()!=null) {
            sb.append(this.visitMth_head(ctx.mth_head()));
            currIndent += 1;
            sb.append(this.visitBlck(ctx.blck()));
            currIndent -= 1;
        }
        return sb.toString();
    }

    @Override
    public String visitMth_head(javaParser.Mth_headContext ctx) {
        StringBuilder sb = new StringBuilder("");
        sb.append("def ");
        if (visitAccess_mod(ctx.access_mod()).equals("private")) {
            sb.append("__");
            sb.append(ctx.ID()).append("__").append(" ").append(ctx.SEP_PARL()).append("self");
        }

        else if (visitAccess_mod(ctx.access_mod()).equals("protected")) {
            sb.append("_");
            sb.append(ctx.ID()).append("_").append(" ").append(ctx.SEP_PARL()).append("self");
        }

        else {
            sb.append(ctx.ID()).append(" ").append(ctx.SEP_PARL()).append("self");
        }

        if (ctx.marg()!=null) sb.append(this.visitMarg(ctx.marg()));
        sb.append(ctx.SEP_PARR()).append(":\n");
        return sb.toString();
    }

    @Override
    public String visitSarg(javaParser.SargContext ctx) {
        return ctx.ID().toString();
    }

    @Override
    public String visitMarg(javaParser.MargContext ctx) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < ctx.sarg().size(); i++) {
            sb.append(", ").append(this.visitSarg(ctx.sarg(i)));
        }
        return sb.toString();
    }

    @Override
    public String visitBlck(javaParser.BlckContext ctx) {
        StringBuilder sb = new StringBuilder("");
        boolean appended = false;
        if (ctx.children.size()<3) errors.add("Indent expected; line: " + currLine + "\n");
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof javaParser.Statement_lineContext)                {sb.append("\t".repeat(currIndent)); sb.append(this.visitStatement_line(((javaParser.Statement_lineContext) ctx.children.get(i)))); appended=true;}
            else if (ctx.children.get(i) instanceof javaParser.If_statement_lineContext)        {sb.append("\t".repeat(currIndent)); sb.append(this.visitIf_statement_line(((javaParser.If_statement_lineContext) ctx.children.get(i)))); appended=true;}
            else if (ctx.children.get(i) instanceof javaParser.While_statement_lineContext)     {sb.append("\t".repeat(currIndent)); sb.append(this.visitWhile_statement_line((javaParser.While_statement_lineContext) ctx.children.get(i))); appended=true;}
            else if (ctx.children.get(i) instanceof javaParser.Do_while_statement_lineContext)  {sb.append("\t".repeat(currIndent)); sb.append(this.visitDo_while_statement_line((javaParser.Do_while_statement_lineContext) ctx.children.get(i))); appended=true;}
            else if (ctx.children.get(i) instanceof javaParser.Comment_lineContext)             {sb.append("\t".repeat(currIndent)); sb.append(this.visitComment_line((javaParser.Comment_lineContext) ctx.children.get(i))); appended=true;}
            else if (ctx.children.get(i) instanceof javaParser.Return_statement_lineContext)    {sb.append("\t".repeat(currIndent)); sb.append(this.visitReturn_statement_line((javaParser.Return_statement_lineContext) ctx.children.get(i))); appended=true;}
            if (appended) {
                sb.append("\n");
                currLine++;
            }
            appended = false;
        }
        return sb.toString();
    }

    @Override
    public String visitStatement_line(javaParser.Statement_lineContext ctx) {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.visitStat(ctx.stat()));
        return sb.toString();
    }

    @Override
    public String visitIf_statement_line(javaParser.If_statement_lineContext ctx) {
        return this.visitIfStat(ctx.ifStat());
    }

    @Override
    public String visitWhile_statement_line(javaParser.While_statement_lineContext ctx) {
        return this.visitWhileStat(ctx.whileStat());
    }

    @Override
    public String visitDo_while_statement_line(javaParser.Do_while_statement_lineContext ctx) {
        return super.visitDo_while_statement_line(ctx);
    }

    @Override
    public String visitComment_line(javaParser.Comment_lineContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(ctx.getText().substring(2).trim());
        return sb.toString();
    }

    @Override
    public String visitReturn_statement_line(javaParser.Return_statement_lineContext ctx) {
        return this.visitRet_stat(ctx.ret_stat());
    }

    @Override
    public String visitRet_stat(javaParser.Ret_statContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.KW_RETURN()).append(" ");
        sb.append(this.visitExpr(ctx.expr()));
        return sb.toString();
    }

    @Override
    public String visitStat(javaParser.StatContext ctx) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof javaParser.Var_defContext)           sb.append(this.visitVar_def(((javaParser.Var_defContext) ctx.children.get(i))));
            else if (ctx.children.get(i) instanceof javaParser.AsgnContext)         sb.append(this.visitAsgn(((javaParser.AsgnContext) ctx.children.get(i))));
            else if (ctx.children.get(i) instanceof javaParser.FuncCallContext)     sb.append(this.visitFuncCall((javaParser.FuncCallContext) ctx.children.get(i)));
            else if (ctx.children.get(i) instanceof javaParser.ObjFuncCallContext)  sb.append(this.visitObjFuncCall((javaParser.ObjFuncCallContext) ctx.children.get(i)));
        }
        return sb.toString();
    }

    @Override
    public String visitAsgn(javaParser.AsgnContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFuncCall(javaParser.FuncCallContext ctx) {
        return super.visitFuncCall(ctx);
    }

    @Override
    public String visitObjCreationCall(javaParser.ObjCreationCallContext ctx) {
        return super.visitObjCreationCall(ctx);
    }

    @Override
    public String visitObjFuncCall(javaParser.ObjFuncCallContext ctx) {
        return super.visitObjFuncCall(ctx);
    }

    @Override
    public String visitNthFuncCall(javaParser.NthFuncCallContext ctx) {
        return super.visitNthFuncCall(ctx);
    }

    @Override
    public String visitIfStat(javaParser.IfStatContext ctx) {
        StringBuilder sb = new StringBuilder("");
        sb.append(ctx.KW_IF()).append(" ");
        sb.append(this.visitExpr(ctx.expr())).append(":\n");
        currIndent += 1;
        currLine++;
        sb.append(this.visitBlck(ctx.blck()));
        currIndent -= 1;
        for (int i = 0; i < ctx.elseIfStat().size(); i++) {
            sb.append(this.visitElseIfStat(ctx.elseIfStat(i)));
        }
        if (ctx.elseStat()!=null) sb.append(this.visitElseStat(ctx.elseStat()));
        return sb.toString();
    }

    @Override
    public String visitElseIfStat(javaParser.ElseIfStatContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t".repeat(currIndent));
        sb.append(ctx.KW_ELSE()).append(" ").append(ctx.KW_IF()).append(" ");
        sb.append(this.visitExpr(ctx.expr())).append(":\n");
        currLine++;
        currIndent += 1;
        sb.append(this.visitBlck(ctx.blck()));
        currIndent -= 1;
        return sb.toString();
    }

    @Override
    public String visitElseStat(javaParser.ElseStatContext ctx) {
        StringBuilder sb = new StringBuilder("");
        sb.append("\t".repeat(currIndent));
        sb.append(ctx.KW_ELSE()).append(":\n");
        currLine++;
        currIndent += 1;
        sb.append(this.visitBlck(ctx.blck()));
        currIndent -= 1;
        return sb.toString();
    }

    @Override
    public String visitWhileStat(javaParser.WhileStatContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.KW_WHILE()).append(" ");
        sb.append(this.visitExpr(ctx.expr())).append(":\n");
        currLine++;
        currIndent += 1;
        sb.append(this.visitBlck(ctx.blck()));
        currIndent -= 1;
        return sb.toString();
    }

    @Override
    public String visitDoWhileStatement(javaParser.DoWhileStatementContext ctx) {
        return super.visitDoWhileStatement(ctx);
    }

    @Override
    public String visitType(javaParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public String visitLit(javaParser.LitContext ctx) {
        return super.visitLit(ctx);
    }

    @Override
    public String visitAccess_mod(javaParser.Access_modContext ctx) {

        return ctx == null ? "private" : ctx.getText();

    }
}
