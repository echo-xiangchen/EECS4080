package logic;
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
	 * Visit a parse tree produced by {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LogicParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LogicParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(LogicParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LogicParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LogicParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LogicParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(LogicParser.ParenContext ctx);
}