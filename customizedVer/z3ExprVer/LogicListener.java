// Generated from Logic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicParser}.
 */
public interface LogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LogicParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LogicParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleBool}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterSingleBool(LogicParser.SingleBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleBool}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitSingleBool(LogicParser.SingleBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleInt}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterSingleInt(LogicParser.SingleIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleInt}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitSingleInt(LogicParser.SingleIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvalBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterEvalBoolExpr(LogicParser.EvalBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvalBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitEvalBoolExpr(LogicParser.EvalBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Blank}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LogicParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Blank}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LogicParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(LogicParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(LogicParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(LogicParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(LogicParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LogicParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LogicParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterIff(LogicParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitIff(LogicParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(LogicParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(LogicParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterParen(LogicParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitParen(LogicParser.ParenContext ctx);
}