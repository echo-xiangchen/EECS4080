// Generated from Logic.g4 by ANTLR 4.7.2

	package antlr;

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
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LogicParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineMethod}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineMethod(LogicParser.DefineMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyBoolExpr(LogicParser.VerifyBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerifyProgram}
	 * labeled alternative in {@link LogicParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyProgram(LogicParser.VerifyProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MutatorMethod}
	 * labeled alternative in {@link LogicParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutatorMethod(LogicParser.MutatorMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessorMethod}
	 * labeled alternative in {@link LogicParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorMethod(LogicParser.AccessorMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#mutator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutator(LogicParser.MutatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor(LogicParser.AccessorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVar(LogicParser.SingleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValueDecl(LogicParser.BoolValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValueDecl(LogicParser.NumValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(LogicParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayValueDecl(LogicParser.BoolArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArrayValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayValueDecl(LogicParser.IntArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealArrayValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealArrayValueDecl(LogicParser.RealArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedPairDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedPairDecl(LogicParser.UnnamedPairDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedPairDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedPairDecl(LogicParser.NamedPairDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedBoolBoolPairValueDecl(LogicParser.UnnamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedBoolArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedBoolArithPairValueDecl(LogicParser.UnnamedBoolArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedIntBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedIntBoolPairValueDecl(LogicParser.UnnamedIntBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedIntArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedIntArithPairValueDecl(LogicParser.UnnamedIntArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedRealBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedRealBoolPairValueDecl(LogicParser.UnnamedRealBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedRealArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedRealArithPairValueDecl(LogicParser.UnnamedRealArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedBoolBoolPairValueDecl(LogicParser.NamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedBoolArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedBoolArithPairValueDecl(LogicParser.NamedBoolArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedIntBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedIntBoolPairValueDecl(LogicParser.NamedIntBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedIntArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedIntArithPairValueDecl(LogicParser.NamedIntArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedRealBoolPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedRealBoolPairValueDecl(LogicParser.NamedRealBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedRealArithPairValueDecl}
	 * labeled alternative in {@link LogicParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedRealArithPairValueDecl(LogicParser.NamedRealArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link LogicParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(LogicParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAssign}
	 * labeled alternative in {@link LogicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssign(LogicParser.BoolAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithAssign}
	 * labeled alternative in {@link LogicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAssign(LogicParser.ArithAssignContext ctx);
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
	 * Visit a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link LogicParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexBoolArray(LogicParser.IndexBoolArrayContext ctx);
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
	 * Visit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNum(LogicParser.RealNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link LogicParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexArithmeticArray(LogicParser.IndexArithmeticArrayContext ctx);
}