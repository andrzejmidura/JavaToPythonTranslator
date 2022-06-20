// Generated from .\java.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParser}.
 */
public interface javaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(javaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(javaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#imps}.
	 * @param ctx the parse tree
	 */
	void enterImps(javaParser.ImpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#imps}.
	 * @param ctx the parse tree
	 */
	void exitImps(javaParser.ImpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 */
	void enterFpac(javaParser.FpacContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 */
	void exitFpac(javaParser.FpacContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#clss}.
	 * @param ctx the parse tree
	 */
	void enterClss(javaParser.ClssContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#clss}.
	 * @param ctx the parse tree
	 */
	void exitClss(javaParser.ClssContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(javaParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(javaParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 */
	void enterCls_head(javaParser.Cls_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 */
	void exitCls_head(javaParser.Cls_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 */
	void enterCls_body(javaParser.Cls_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 */
	void exitCls_body(javaParser.Cls_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(javaParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(javaParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(javaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(javaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#mth}.
	 * @param ctx the parse tree
	 */
	void enterMth(javaParser.MthContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#mth}.
	 * @param ctx the parse tree
	 */
	void exitMth(javaParser.MthContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 */
	void enterMth_head(javaParser.Mth_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 */
	void exitMth_head(javaParser.Mth_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 */
	void enterSarg(javaParser.SargContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 */
	void exitSarg(javaParser.SargContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#marg}.
	 * @param ctx the parse tree
	 */
	void enterMarg(javaParser.MargContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#marg}.
	 * @param ctx the parse tree
	 */
	void exitMarg(javaParser.MargContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#blck}.
	 * @param ctx the parse tree
	 */
	void enterBlck(javaParser.BlckContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#blck}.
	 * @param ctx the parse tree
	 */
	void exitBlck(javaParser.BlckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterStatement_line(javaParser.Statement_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitStatement_line(javaParser.Statement_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement_line(javaParser.If_statement_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement_line(javaParser.If_statement_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement_line(javaParser.While_statement_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement_line(javaParser.While_statement_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Do_while_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement_line(javaParser.Do_while_statement_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Do_while_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement_line(javaParser.Do_while_statement_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comment_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterComment_line(javaParser.Comment_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comment_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitComment_line(javaParser.Comment_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement_line(javaParser.Return_statement_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return_statement_line}
	 * labeled alternative in {@link javaParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement_line(javaParser.Return_statement_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 */
	void enterRet_stat(javaParser.Ret_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 */
	void exitRet_stat(javaParser.Ret_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(javaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(javaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 */
	void enterAsgn(javaParser.AsgnContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 */
	void exitAsgn(javaParser.AsgnContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(javaParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(javaParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 */
	void enterObjCreationCall(javaParser.ObjCreationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 */
	void exitObjCreationCall(javaParser.ObjCreationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 */
	void enterObjFuncCall(javaParser.ObjFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 */
	void exitObjFuncCall(javaParser.ObjFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 */
	void enterNthFuncCall(javaParser.NthFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 */
	void exitNthFuncCall(javaParser.NthFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(javaParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(javaParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(javaParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(javaParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(javaParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(javaParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(javaParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(javaParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(javaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(javaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(javaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(javaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(javaParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(javaParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#access_mod}.
	 * @param ctx the parse tree
	 */
	void enterAccess_mod(javaParser.Access_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#access_mod}.
	 * @param ctx the parse tree
	 */
	void exitAccess_mod(javaParser.Access_modContext ctx);
}