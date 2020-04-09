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
	 * Visit a parse tree produced by the {@code AssignDecl}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDecl(VerifierParser.AssignDeclContext ctx);
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
	 * Visit a parse tree produced by the {@code preContract}
	 * labeled alternative in {@link VerifierParser#precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreContract(VerifierParser.PreContractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postContract}
	 * labeled alternative in {@link VerifierParser#postcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostContract(VerifierParser.PostContractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Contracts}
	 * labeled alternative in {@link VerifierParser#contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContracts(VerifierParser.ContractsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalDecl}
	 * labeled alternative in {@link VerifierParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecl(VerifierParser.LocalDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpAssignment(VerifierParser.ImpAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpAlternation}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpAlternation(VerifierParser.ImpAlternationContext ctx);
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
	 * Visit a parse tree produced by the {@code BoolArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayInitialize(VerifierParser.BoolArrayInitializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithArrayInitialize(VerifierParser.ArithArrayInitializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySingleVarAssign(VerifierParser.ArraySingleVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayAssign(VerifierParser.BoolArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithArrayAssign(VerifierParser.ArithArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleVarResultAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVarResultAssign(VerifierParser.SingleVarResultAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValueResultAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueResultAssign(VerifierParser.ArrayValueResultAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlternationBody}
	 * labeled alternative in {@link VerifierParser#alternation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternationBody(VerifierParser.AlternationBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link VerifierParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(VerifierParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link VerifierParser#elseifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(VerifierParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link VerifierParser#elsestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(VerifierParser.ElseStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code UnnamedSingleVarDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedSingleVarDecl(VerifierParser.UnnamedSingleVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedArrayDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedArrayDecl(VerifierParser.UnnamedArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedPairValueDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedPairValueDecl(VerifierParser.UnnamedPairValueDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnnamedPairDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedPairDecl(VerifierParser.UnnamedPairDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(VerifierParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OldBoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldBoolVar(VerifierParser.OldBoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OldBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldBoolArray(VerifierParser.OldBoolArrayContext ctx);
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
	 * Visit a parse tree produced by the {@code BoolResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolResult(VerifierParser.BoolResultContext ctx);
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
	 * Visit a parse tree produced by the {@code BoolArrayResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayResult(VerifierParser.BoolArrayResultContext ctx);
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
	 * Visit a parse tree produced by the {@code UpperArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperArray(VerifierParser.UpperArrayContext ctx);
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
	/**
	 * Visit a parse tree produced by the {@code OldArithArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldArithArray(VerifierParser.OldArithArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithResult(VerifierParser.ArithResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowerArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerArray(VerifierParser.LowerArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithArrayResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithArrayResult(VerifierParser.ArithArrayResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CountArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountArray(VerifierParser.CountArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OldArithVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldArithVar(VerifierParser.OldArithVarContext ctx);
}