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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link javaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(javaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Imports}
	 * labeled alternative in {@link javaParser#imps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(javaParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Full_package}
	 * labeled alternative in {@link javaParser#fpac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_package(javaParser.Full_packageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link javaParser#clss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(javaParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Class_definition}
	 * labeled alternative in {@link javaParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(javaParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Class_header}
	 * labeled alternative in {@link javaParser#cls_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_header(javaParser.Class_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Class_body}
	 * labeled alternative in {@link javaParser#cls_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(javaParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable_definition}
	 * labeled alternative in {@link javaParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(javaParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(javaParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(javaParser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicative_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(javaParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses_expression(javaParser.Parentheses_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object_creation_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_call_expression(javaParser.Object_creation_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_expression(javaParser.Identifier_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object_function_call_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_function_call_expression(javaParser.Object_function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Additive_expression}
	 * labeled alternative in {@link javaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(javaParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link javaParser#mth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(javaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Method_header}
	 * labeled alternative in {@link javaParser#mth_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_header(javaParser.Method_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Single_arg}
	 * labeled alternative in {@link javaParser#sarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_arg(javaParser.Single_argContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiple_arg}
	 * labeled alternative in {@link javaParser#marg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_arg(javaParser.Multiple_argContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link javaParser#blck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(javaParser.BlockContext ctx);
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
	 * Visit a parse tree produced by the {@code Return_statement}
	 * labeled alternative in {@link javaParser#ret_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(javaParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link javaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(javaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assigment}
	 * labeled alternative in {@link javaParser#asgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(javaParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function_call}
	 * labeled alternative in {@link javaParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(javaParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object_creation_call}
	 * labeled alternative in {@link javaParser#objCreationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_call(javaParser.Object_creation_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object_function_call}
	 * labeled alternative in {@link javaParser#objFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_function_call(javaParser.Object_function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nth_func_call}
	 * labeled alternative in {@link javaParser#nthFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNth_func_call(javaParser.Nth_func_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link javaParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(javaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else_if_statement}
	 * labeled alternative in {@link javaParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement(javaParser.Else_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link javaParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(javaParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link javaParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(javaParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Do_while_statement}
	 * labeled alternative in {@link javaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(javaParser.Do_while_statementContext ctx);
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
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_mod(javaParser.Access_modContext ctx);
}