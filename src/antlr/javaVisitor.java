// Generated from .\java.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(javaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#imps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImps(javaParser.ImpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpac(javaParser.FpacContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#clss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClss(javaParser.ClssContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(javaParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_head(javaParser.Cls_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls_body(javaParser.Cls_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(javaParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(javaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#mth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMth(javaParser.MthContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMth_head(javaParser.Mth_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSarg(javaParser.SargContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#marg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarg(javaParser.MargContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#blck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlck(javaParser.BlckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_line(javaParser.Statement_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_line(javaParser.If_statement_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement_line(javaParser.While_statement_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Do_while_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement_line(javaParser.Do_while_statement_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comment_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_line(javaParser.Comment_lineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement_line(javaParser.Return_statement_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_stat(javaParser.Ret_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(javaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgn(javaParser.AsgnContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(javaParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjCreationCall(javaParser.ObjCreationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjFuncCall(javaParser.ObjFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNthFuncCall(javaParser.NthFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(javaParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(javaParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(javaParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(javaParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(javaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(javaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(javaParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#access_mod}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	String visitAccess_mod(javaParser.Access_modContext ctx);
}