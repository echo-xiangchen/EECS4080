// Generated from Logic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LogicParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleBool}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleBool(LogicParser.SingleBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleInt}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInt(LogicParser.SingleIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalBoolExpr(LogicParser.EvalBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Blank}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LogicParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LogicParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LogicParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LogicParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(LogicParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(LogicParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(LogicParser.ParenContext ctx);
}