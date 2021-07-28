// Generated from C:/Users/JanKo/OneDrive/Desktop/TH Semester/Sommersemster 21/ST 2/Klausur/PUC Parsergenerator/src\Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equalsValue}.
	 * @param ctx the parse tree
	 */
	void enterEqualsValue(GrammarParser.EqualsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equalsValue}.
	 * @param ctx the parse tree
	 */
	void exitEqualsValue(GrammarParser.EqualsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(GrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(GrammarParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(GrammarParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(GrammarParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(GrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(GrammarParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(GrammarParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(GrammarParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(GrammarParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#privPubl}.
	 * @param ctx the parse tree
	 */
	void enterPrivPubl(GrammarParser.PrivPublContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#privPubl}.
	 * @param ctx the parse tree
	 */
	void exitPrivPubl(GrammarParser.PrivPublContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(GrammarParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(GrammarParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void enterIfthen(GrammarParser.IfthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void exitIfthen(GrammarParser.IfthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(GrammarParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(GrammarParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returning}.
	 * @param ctx the parse tree
	 */
	void enterReturning(GrammarParser.ReturningContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returning}.
	 * @param ctx the parse tree
	 */
	void exitReturning(GrammarParser.ReturningContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(GrammarParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(GrammarParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
}