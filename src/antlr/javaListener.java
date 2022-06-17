// Generated from .\java.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParser}.
 */
public interface javaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link javaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(javaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link javaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(javaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Imports}
	 * labeled alternative in {@link javaParser#imps}.
	 * @param ctx the parse tree
	 */
	void enterImports(javaParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Imports}
	 * labeled alternative in {@link javaParser#imps}.
	 * @param ctx the parse tree
	 */
	void exitImports(javaParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Full_package}
	 * labeled alternative in {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 */
	void enterFull_package(javaParser.Full_packageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Full_package}
	 * labeled alternative in {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 */
	void exitFull_package(javaParser.Full_packageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link javaParser#clss}.
	 * @param ctx the parse tree
	 */
	void enterClasses(javaParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link javaParser#clss}.
	 * @param ctx the parse tree
	 */
	void exitClasses(javaParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Class_definition}
	 * labeled alternative in {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(javaParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Class_definition}
	 * labeled alternative in {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(javaParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Class_header}
	 * labeled alternative in {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 */
	void enterClass_header(javaParser.Class_headerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Class_header}
	 * labeled alternative in {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 */
	void exitClass_header(javaParser.Class_headerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Class_body}
	 * labeled alternative in {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(javaParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Class_body}
	 * labeled alternative in {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(javaParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable_definition}
	 * labeled alternative in {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(javaParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable_definition}
	 * labeled alternative in {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(javaParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(javaParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(javaParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(javaParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(javaParser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicative_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(javaParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicative_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(javaParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses_expression(javaParser.Parentheses_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses_expression(javaParser.Parentheses_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object_creation_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_call_expression(javaParser.Object_creation_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object_creation_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_call_expression(javaParser.Object_creation_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_expression(javaParser.Identifier_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_expression(javaParser.Identifier_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object_function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObject_function_call_expression(javaParser.Object_function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object_function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObject_function_call_expression(javaParser.Object_function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Additive_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(javaParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Additive_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(javaParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Method}
	 * labeled alternative in {@link javaParser#mth}.
	 * @param ctx the parse tree
	 */
	void enterMethod(javaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link javaParser#mth}.
	 * @param ctx the parse tree
	 */
	void exitMethod(javaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Method_header}
	 * labeled alternative in {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 */
	void enterMethod_header(javaParser.Method_headerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Method_header}
	 * labeled alternative in {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 */
	void exitMethod_header(javaParser.Method_headerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single_arg}
	 * labeled alternative in {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 */
	void enterSingle_arg(javaParser.Single_argContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single_arg}
	 * labeled alternative in {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 */
	void exitSingle_arg(javaParser.Single_argContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiple_arg}
	 * labeled alternative in {@link javaParser#marg}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_arg(javaParser.Multiple_argContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiple_arg}
	 * labeled alternative in {@link javaParser#marg}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_arg(javaParser.Multiple_argContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link javaParser#blck}.
	 * @param ctx the parse tree
	 */
	void enterBlock(javaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link javaParser#blck}.
	 * @param ctx the parse tree
	 */
	void exitBlock(javaParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code Return_statement}
	 * labeled alternative in {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(javaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return_statement}
	 * labeled alternative in {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(javaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link javaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatement(javaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link javaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatement(javaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assigment}
	 * labeled alternative in {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(javaParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assigment}
	 * labeled alternative in {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(javaParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function_call}
	 * labeled alternative in {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(javaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function_call}
	 * labeled alternative in {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(javaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object_creation_call}
	 * labeled alternative in {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_call(javaParser.Object_creation_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object_creation_call}
	 * labeled alternative in {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_call(javaParser.Object_creation_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object_function_call}
	 * labeled alternative in {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 */
	void enterObject_function_call(javaParser.Object_function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object_function_call}
	 * labeled alternative in {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 */
	void exitObject_function_call(javaParser.Object_function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nth_func_call}
	 * labeled alternative in {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 */
	void enterNth_func_call(javaParser.Nth_func_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nth_func_call}
	 * labeled alternative in {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 */
	void exitNth_func_call(javaParser.Nth_func_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(javaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(javaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else_if_statement}
	 * labeled alternative in {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(javaParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else_if_statement}
	 * labeled alternative in {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(javaParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(javaParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(javaParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(javaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(javaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Do_while_statement}
	 * labeled alternative in {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(javaParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Do_while_statement}
	 * labeled alternative in {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(javaParser.Do_while_statementContext ctx);
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