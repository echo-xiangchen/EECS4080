package antlr;
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
	 * Enter a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(LogicParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(LogicParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterBoolValueDecl(LogicParser.BoolValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitBoolValueDecl(LogicParser.BoolValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterNumValueDecl(LogicParser.NumValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitNumValueDecl(LogicParser.NumValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(LogicParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(LogicParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterArrayValueDecl(LogicParser.ArrayValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitArrayValueDecl(LogicParser.ArrayValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterVerifyBoolExpr(LogicParser.VerifyBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitVerifyBoolExpr(LogicParser.VerifyBoolExprContext ctx);
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
	 * Enter a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExists(LogicParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExists(LogicParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelate(LogicParser.RelateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelate(LogicParser.RelateContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(LogicParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(LogicParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexBoolArray(LogicParser.IndexBoolArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexBoolArray(LogicParser.IndexBoolArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterForall(LogicParser.ForallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitForall(LogicParser.ForallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(LogicParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(LogicParser.BoolTrueContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterQuantifyVar(LogicParser.QuantifyVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitQuantifyVar(LogicParser.QuantifyVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterEqual(LogicParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitEqual(LogicParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(LogicParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(LogicParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(LogicParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(LogicParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(LogicParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(LogicParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(LogicParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(LogicParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVar(LogicParser.ArithmeticVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVar(LogicParser.ArithmeticVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntNum(LogicParser.IntNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntNum(LogicParser.IntNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithParen(LogicParser.ArithParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithParen(LogicParser.ArithParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LogicParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LogicParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LogicParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LogicParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRealNum(LogicParser.RealNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRealNum(LogicParser.RealNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIndexArithmeticArray(LogicParser.IndexArithmeticArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIndexArithmeticArray(LogicParser.IndexArithmeticArrayContext ctx);
}