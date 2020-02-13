package antlr;
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
	 * Visit a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVar(LogicParser.SingleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValueDecl(LogicParser.BoolValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValueDecl(LogicParser.NumValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(LogicParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValueDecl}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueDecl(LogicParser.ArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyBoolExpr(LogicParser.VerifyBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LogicParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(LogicParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIndexBoolArray}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIndexBoolArray(LogicParser.ExprIndexBoolArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(LogicParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LogicParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(LogicParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(LogicParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelate(LogicParser.RelateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LogicParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(LogicParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall(LogicParser.ForallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(LogicParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(LogicParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link LogicParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifyVar(LogicParser.QuantifyVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(LogicParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(LogicParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(LogicParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqual(LogicParser.GreaterOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link LogicParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqual(LogicParser.LessOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticVar(LogicParser.ArithmeticVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNum(LogicParser.IntNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithParen(LogicParser.ArithParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LogicParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LogicParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIndexArithmeticArray}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIndexArithmeticArray(LogicParser.ExprIndexArithmeticArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNum(LogicParser.RealNumContext ctx);
}