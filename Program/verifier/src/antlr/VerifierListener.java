// Generated from Verifier.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerifierParser}.
 */
public interface VerifierListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerifierParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VerifierParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerifierParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VerifierParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(VerifierParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(VerifierParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefineMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void enterDefineMethod(VerifierParser.DefineMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefineMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void exitDefineMethod(VerifierParser.DefineMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void enterVerifyBoolExpr(VerifierParser.VerifyBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VerifyBoolExpr}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void exitVerifyBoolExpr(VerifierParser.VerifyBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VerifyMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void enterVerifyMethod(VerifierParser.VerifyMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VerifyMethod}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void exitVerifyMethod(VerifierParser.VerifyMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MutatorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMutatorMethod(VerifierParser.MutatorMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MutatorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMutatorMethod(VerifierParser.MutatorMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 */
	void enterAccessorMethod(VerifierParser.AccessorMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessorMethod}
	 * labeled alternative in {@link VerifierParser#method}.
	 * @param ctx the parse tree
	 */
	void exitAccessorMethod(VerifierParser.AccessorMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mutators}
	 * labeled alternative in {@link VerifierParser#mutator}.
	 * @param ctx the parse tree
	 */
	void enterMutators(VerifierParser.MutatorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mutators}
	 * labeled alternative in {@link VerifierParser#mutator}.
	 * @param ctx the parse tree
	 */
	void exitMutators(VerifierParser.MutatorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Accessors}
	 * labeled alternative in {@link VerifierParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessors(VerifierParser.AccessorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Accessors}
	 * labeled alternative in {@link VerifierParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessors(VerifierParser.AccessorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preContract}
	 * labeled alternative in {@link VerifierParser#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPreContract(VerifierParser.PreContractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preContract}
	 * labeled alternative in {@link VerifierParser#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPreContract(VerifierParser.PreContractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postContract}
	 * labeled alternative in {@link VerifierParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void enterPostContract(VerifierParser.PostContractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postContract}
	 * labeled alternative in {@link VerifierParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void exitPostContract(VerifierParser.PostContractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Contracts}
	 * labeled alternative in {@link VerifierParser#contract}.
	 * @param ctx the parse tree
	 */
	void enterContracts(VerifierParser.ContractsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Contracts}
	 * labeled alternative in {@link VerifierParser#contract}.
	 * @param ctx the parse tree
	 */
	void exitContracts(VerifierParser.ContractsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalDecl}
	 * labeled alternative in {@link VerifierParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(VerifierParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalDecl}
	 * labeled alternative in {@link VerifierParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(VerifierParser.LocalDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(VerifierParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(VerifierParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarAssign(VerifierParser.SingleVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarAssign(VerifierParser.SingleVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssign(VerifierParser.BoolAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssign(VerifierParser.BoolAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArithAssign(VerifierParser.ArithAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArithAssign(VerifierParser.ArithAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArraySingleVarAssign(VerifierParser.ArraySingleVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySingleVarAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArraySingleVarAssign(VerifierParser.ArraySingleVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayAssign(VerifierParser.BoolArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayAssign(VerifierParser.BoolArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArithArrayAssign(VerifierParser.ArithArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithArrayAssign}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArithArrayAssign(VerifierParser.ArithArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UninitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterUninitialVarDecl(VerifierParser.UninitialVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UninitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitUninitialVarDecl(VerifierParser.UninitialVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitialVarDecl(VerifierParser.InitialVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialVarDecl}
	 * labeled alternative in {@link VerifierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitialVarDecl(VerifierParser.InitialVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(VerifierParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleVar}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(VerifierParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(VerifierParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(VerifierParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedPairDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedPairDecl(VerifierParser.NamedPairDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedPairDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedPairDecl(VerifierParser.NamedPairDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolValueDecl(VerifierParser.BoolValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolValueDecl(VerifierParser.BoolValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNumValueDecl(VerifierParser.NumValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNumValueDecl(VerifierParser.NumValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayValueDecl(VerifierParser.BoolArrayValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayValueDecl(VerifierParser.BoolArrayValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayValueDecl(VerifierParser.IntArrayValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayValueDecl(VerifierParser.IntArrayValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterRealArrayValueDecl(VerifierParser.RealArrayValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealArrayValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitRealArrayValueDecl(VerifierParser.RealArrayValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedBoolBoolPairValueDecl(VerifierParser.UnnamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedBoolBoolPairValueDecl(VerifierParser.UnnamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedBoolArithPairValueDecl(VerifierParser.UnnamedBoolArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedBoolArithPairValueDecl(VerifierParser.UnnamedBoolArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedIntBoolPairValueDecl(VerifierParser.UnnamedIntBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedIntBoolPairValueDecl(VerifierParser.UnnamedIntBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedIntArithPairValueDecl(VerifierParser.UnnamedIntArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedIntArithPairValueDecl(VerifierParser.UnnamedIntArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedRealBoolPairValueDecl(VerifierParser.UnnamedRealBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedRealBoolPairValueDecl(VerifierParser.UnnamedRealBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedRealArithPairValueDecl(VerifierParser.UnnamedRealArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedRealArithPairValueDecl(VerifierParser.UnnamedRealArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedBoolBoolPairValueDecl(VerifierParser.NamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedBoolBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedBoolBoolPairValueDecl(VerifierParser.NamedBoolBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedBoolArithPairValueDecl(VerifierParser.NamedBoolArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedBoolArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedBoolArithPairValueDecl(VerifierParser.NamedBoolArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedIntBoolPairValueDecl(VerifierParser.NamedIntBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedIntBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedIntBoolPairValueDecl(VerifierParser.NamedIntBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedIntArithPairValueDecl(VerifierParser.NamedIntArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedIntArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedIntArithPairValueDecl(VerifierParser.NamedIntArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedRealBoolPairValueDecl(VerifierParser.NamedRealBoolPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedRealBoolPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedRealBoolPairValueDecl(VerifierParser.NamedRealBoolPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedRealArithPairValueDecl(VerifierParser.NamedRealArithPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedRealArithPairValueDecl}
	 * labeled alternative in {@link VerifierParser#initialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedRealArithPairValueDecl(VerifierParser.NamedRealArithPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedSingleVarDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedSingleVarDecl(VerifierParser.UnnamedSingleVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedSingleVarDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedSingleVarDecl(VerifierParser.UnnamedSingleVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedArrayDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedArrayDecl(VerifierParser.UnnamedArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedArrayDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedArrayDecl(VerifierParser.UnnamedArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedPairValueDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedPairValueDecl(VerifierParser.UnnamedPairValueDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedPairValueDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedPairValueDecl(VerifierParser.UnnamedPairValueDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedPairDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedPairDecl(VerifierParser.UnnamedPairDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedPairDecl}
	 * labeled alternative in {@link VerifierParser#unnamedDecl}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedPairDecl(VerifierParser.UnnamedPairDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(VerifierParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(VerifierParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldBoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldBoolVar(VerifierParser.OldBoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldBoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldBoolVar(VerifierParser.OldBoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldBoolArray(VerifierParser.OldBoolArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldBoolArray(VerifierParser.OldBoolArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterIff(VerifierParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iff}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitIff(VerifierParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(VerifierParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(VerifierParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(VerifierParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(VerifierParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplies(VerifierParser.ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplies(VerifierParser.ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExists(VerifierParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExists(VerifierParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolResult(VerifierParser.BoolResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolResult(VerifierParser.BoolResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelate(VerifierParser.RelateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relate}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelate(VerifierParser.RelateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(VerifierParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(VerifierParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(VerifierParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(VerifierParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexBoolArray(VerifierParser.IndexBoolArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexBoolArray}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexBoolArray(VerifierParser.IndexBoolArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterForall(VerifierParser.ForallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Forall}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitForall(VerifierParser.ForallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(VerifierParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(VerifierParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayResult(VerifierParser.BoolArrayResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayResult(VerifierParser.BoolArrayResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterParen(VerifierParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitParen(VerifierParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link VerifierParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterQuantifyVar(VerifierParser.QuantifyVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuantifyVar}
	 * labeled alternative in {@link VerifierParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitQuantifyVar(VerifierParser.QuantifyVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterEqual(VerifierParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitEqual(VerifierParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(VerifierParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(VerifierParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(VerifierParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(VerifierParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(VerifierParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(VerifierParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(VerifierParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link VerifierParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(VerifierParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldArithArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterOldArithArray(VerifierParser.OldArithArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldArithArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitOldArithArray(VerifierParser.OldArithArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVar(VerifierParser.ArithmeticVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVar(VerifierParser.ArithmeticVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntNum(VerifierParser.IntNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntNum(VerifierParser.IntNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithResult(VerifierParser.ArithResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithResult(VerifierParser.ArithResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithParen(VerifierParser.ArithParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithParen(VerifierParser.ArithParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(VerifierParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(VerifierParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(VerifierParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(VerifierParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRealNum(VerifierParser.RealNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRealNum(VerifierParser.RealNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithArrayResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithArrayResult(VerifierParser.ArithArrayResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithArrayResult}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithArrayResult(VerifierParser.ArithArrayResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIndexArithmeticArray(VerifierParser.IndexArithmeticArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIndexArithmeticArray(VerifierParser.IndexArithmeticArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CountArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterCountArray(VerifierParser.CountArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CountArray}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitCountArray(VerifierParser.CountArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldArithVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterOldArithVar(VerifierParser.OldArithVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldArithVar}
	 * labeled alternative in {@link VerifierParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitOldArithVar(VerifierParser.OldArithVarContext ctx);
}