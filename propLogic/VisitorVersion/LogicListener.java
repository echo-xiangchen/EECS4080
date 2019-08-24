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
	 * Enter a parse tree produced by {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LogicParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LogicParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterNot(LogicParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitNot(LogicParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterEquals(LogicParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitEquals(LogicParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterOr(LogicParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitOr(LogicParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterVar(LogicParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitVar(LogicParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LogicParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LogicParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterParen(LogicParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitParen(LogicParser.ParenContext ctx);
}