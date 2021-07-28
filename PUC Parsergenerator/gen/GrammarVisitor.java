// Generated from C:/Users/JanKo/OneDrive/Desktop/TH Semester/Sommersemster 21/ST 2/Klausur/PUC Parsergenerator/src\Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#equalsValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsValue(GrammarParser.EqualsValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(GrammarParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(GrammarParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(GrammarParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#booleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleans(GrammarParser.BooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#privPubl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivPubl(GrammarParser.PrivPublContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(GrammarParser.ReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifthen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthen(GrammarParser.IfthenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(GrammarParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning(GrammarParser.ReturningContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(GrammarParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
}