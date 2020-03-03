// Generated from Verifier.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerifierParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerifierVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerifierParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(VerifierParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(VerifierParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineMethod(VerifierParser.DefineMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyBoolExpr(VerifierParser.VerifyBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerifyMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerifyMethod(VerifierParser.VerifyMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MutatorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutatorMethod(VerifierParser.MutatorMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessorMethod(VerifierParser.AccessorMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mutators}
	 * labeled alternative in {@link VerifierParser#mutator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutators(VerifierParser.MutatorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Accessors}
	 * labeled alternative in {@link VerifierParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessors(VerifierParser.AccessorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UninitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninitialVarDecl(VerifierParser.UninitialVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialVarDecl(VerifierParser.InitialVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVar(VerifierParser.SingleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(VerifierParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedPairDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedPairDecl(VerifierParser.UnnamedPairDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedPairDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedPairDecl(VerifierParser.NamedPairDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValueDecl(VerifierParser.BoolValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValueDecl(VerifierParser.NumValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayValueDecl(VerifierParser.BoolArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayValueDecl(VerifierParser.IntArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealArrayValueDecl(VerifierParser.RealArrayValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedBoolBoolPairValueDecl(VerifierParser.UnnamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedBoolArithPairValueDecl(VerifierParser.UnnamedBoolArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedIntBoolPairValueDecl(VerifierParser.UnnamedIntBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedIntArithPairValueDecl(VerifierParser.UnnamedIntArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedRealBoolPairValueDecl(VerifierParser.UnnamedRealBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedRealArithPairValueDecl(VerifierParser.UnnamedRealArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedBoolBoolPairValueDecl(VerifierParser.NamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedBoolArithPairValueDecl(VerifierParser.NamedBoolArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedIntBoolPairValueDecl(VerifierParser.NamedIntBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedIntArithPairValueDecl(VerifierParser.NamedIntArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedRealBoolPairValueDecl(VerifierParser.NamedRealBoolPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedRealArithPairValueDecl(VerifierParser.NamedRealArithPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(VerifierParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarAssign(VerifierParser.SingleVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssign(VerifierParser.BoolAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAssign(VerifierParser.ArithAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(VerifierParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(VerifierParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(VerifierParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(VerifierParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(VerifierParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(VerifierParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelate(VerifierParser.RelateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(VerifierParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(VerifierParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexBoolArray(VerifierParser.IndexBoolArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall(VerifierParser.ForallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(VerifierParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(VerifierParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link VerifierParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifyVar(VerifierParser.QuantifyVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(VerifierParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(VerifierParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(VerifierParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqual(VerifierParser.GreaterOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqual(VerifierParser.LessOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticVar(VerifierParser.ArithmeticVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNum(VerifierParser.IntNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithParen(VerifierParser.ArithParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(VerifierParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(VerifierParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNum(VerifierParser.RealNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexArithmeticArray(VerifierParser.IndexArithmeticArrayContext ctx);
}