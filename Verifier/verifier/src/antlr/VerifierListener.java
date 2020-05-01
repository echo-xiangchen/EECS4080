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
	 * Enter a parse tree produced by the {@code AssignDecl}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void enterAssignDecl(VerifierParser.AssignDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignDecl}
	 * labeled alternative in {@link VerifierParser#line}.
	 * @param ctx the parse tree
	 */
	void exitAssignDecl(VerifierParser.AssignDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code ImpAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImpAssignment(VerifierParser.ImpAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpAssignment}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImpAssignment(VerifierParser.ImpAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImpAlternation}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImpAlternation(VerifierParser.ImpAlternationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpAlternation}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImpAlternation(VerifierParser.ImpAlternationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImpLoop}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImpLoop(VerifierParser.ImpLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpLoop}
	 * labeled alternative in {@link VerifierParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImpLoop(VerifierParser.ImpLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayInitialize(VerifierParser.BoolArrayInitializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayInitialize(VerifierParser.BoolArrayInitializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArithArrayInitialize(VerifierParser.ArithArrayInitializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithArrayInitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArithArrayInitialize(VerifierParser.ArithArrayInitializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairReinitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairReinitialize(VerifierParser.PairReinitializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairReinitialize}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairReinitialize(VerifierParser.PairReinitializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToNormalVar(VerifierParser.NormalVarAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToNormalVar(VerifierParser.NormalVarAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToArrayE(VerifierParser.NormalVarAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToArrayE(VerifierParser.NormalVarAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToPairFS(VerifierParser.NormalVarAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToPairFS(VerifierParser.NormalVarAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToPairE(VerifierParser.NormalVarAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToPairE(VerifierParser.NormalVarAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToBoolE(VerifierParser.NormalVarAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToBoolE(VerifierParser.NormalVarAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVarAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalVarAssignToArithE(VerifierParser.NormalVarAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVarAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalVarAssignToArithE(VerifierParser.NormalVarAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToNormalVar(VerifierParser.ArrayEAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToNormalVar(VerifierParser.ArrayEAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToArrayE(VerifierParser.ArrayEAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToArrayE(VerifierParser.ArrayEAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToPairFS(VerifierParser.ArrayEAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToPairFS(VerifierParser.ArrayEAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToPairE(VerifierParser.ArrayEAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToPairE(VerifierParser.ArrayEAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToBoolE(VerifierParser.ArrayEAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToBoolE(VerifierParser.ArrayEAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayEAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayEAssignToArithE(VerifierParser.ArrayEAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayEAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayEAssignToArithE(VerifierParser.ArrayEAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToNormalVar(VerifierParser.PairEAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToNormalVar(VerifierParser.PairEAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToArrayE(VerifierParser.PairEAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToArrayE(VerifierParser.PairEAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToPairFS(VerifierParser.PairEAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToPairFS(VerifierParser.PairEAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToPairE(VerifierParser.PairEAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToPairE(VerifierParser.PairEAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToBoolE(VerifierParser.PairEAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToBoolE(VerifierParser.PairEAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairEAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairEAssignToArithE(VerifierParser.PairEAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairEAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairEAssignToArithE(VerifierParser.PairEAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToNormalVar(VerifierParser.NormalResultAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToNormalVar(VerifierParser.NormalResultAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToArrayE(VerifierParser.NormalResultAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToArrayE(VerifierParser.NormalResultAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToPairFS(VerifierParser.NormalResultAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToPairFS(VerifierParser.NormalResultAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToPairE(VerifierParser.NormalResultAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToPairE(VerifierParser.NormalResultAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToBoolE(VerifierParser.NormalResultAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToBoolE(VerifierParser.NormalResultAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNormalResultAssignToArithE(VerifierParser.NormalResultAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNormalResultAssignToArithE(VerifierParser.NormalResultAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToNormalVar(VerifierParser.ArrayResultAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToNormalVar(VerifierParser.ArrayResultAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToArrayE(VerifierParser.ArrayResultAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToArrayE(VerifierParser.ArrayResultAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToPairFS(VerifierParser.ArrayResultAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToPairFS(VerifierParser.ArrayResultAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToPairE(VerifierParser.ArrayResultAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToPairE(VerifierParser.ArrayResultAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToBoolE(VerifierParser.ArrayResultAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToBoolE(VerifierParser.ArrayResultAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayResultAssignToArithE(VerifierParser.ArrayResultAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayResultAssignToArithE(VerifierParser.ArrayResultAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToNormalVar(VerifierParser.PairResultAssignToNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToNormalVar}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToNormalVar(VerifierParser.PairResultAssignToNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToArrayE(VerifierParser.PairResultAssignToArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToArrayE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToArrayE(VerifierParser.PairResultAssignToArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToPairFS(VerifierParser.PairResultAssignToPairFSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToPairFS}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToPairFS(VerifierParser.PairResultAssignToPairFSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToPairE(VerifierParser.PairResultAssignToPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToPairE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToPairE(VerifierParser.PairResultAssignToPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToBoolE(VerifierParser.PairResultAssignToBoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToBoolE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToBoolE(VerifierParser.PairResultAssignToBoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPairResultAssignToArithE(VerifierParser.PairResultAssignToArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairResultAssignToArithE}
	 * labeled alternative in {@link VerifierParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPairResultAssignToArithE(VerifierParser.PairResultAssignToArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlternationBody}
	 * labeled alternative in {@link VerifierParser#alternation}.
	 * @param ctx the parse tree
	 */
	void enterAlternationBody(VerifierParser.AlternationBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlternationBody}
	 * labeled alternative in {@link VerifierParser#alternation}.
	 * @param ctx the parse tree
	 */
	void exitAlternationBody(VerifierParser.AlternationBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link VerifierParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(VerifierParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link VerifierParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(VerifierParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link VerifierParser#elseifstat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(VerifierParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStatement}
	 * labeled alternative in {@link VerifierParser#elseifstat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(VerifierParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link VerifierParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(VerifierParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStatement}
	 * labeled alternative in {@link VerifierParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(VerifierParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loops}
	 * labeled alternative in {@link VerifierParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoops(VerifierParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loops}
	 * labeled alternative in {@link VerifierParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoops(VerifierParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopInitialImps}
	 * labeled alternative in {@link VerifierParser#initImp}.
	 * @param ctx the parse tree
	 */
	void enterLoopInitialImps(VerifierParser.LoopInitialImpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopInitialImps}
	 * labeled alternative in {@link VerifierParser#initImp}.
	 * @param ctx the parse tree
	 */
	void exitLoopInitialImps(VerifierParser.LoopInitialImpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopInvariant}
	 * labeled alternative in {@link VerifierParser#invariantStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopInvariant(VerifierParser.LoopInvariantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopInvariant}
	 * labeled alternative in {@link VerifierParser#invariantStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopInvariant(VerifierParser.LoopInvariantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopExitCondition}
	 * labeled alternative in {@link VerifierParser#exitCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopExitCondition(VerifierParser.LoopExitConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopExitCondition}
	 * labeled alternative in {@link VerifierParser#exitCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopExitCondition(VerifierParser.LoopExitConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopBodyImps}
	 * labeled alternative in {@link VerifierParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBodyImps(VerifierParser.LoopBodyImpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopBodyImps}
	 * labeled alternative in {@link VerifierParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBodyImps(VerifierParser.LoopBodyImpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopVariant}
	 * labeled alternative in {@link VerifierParser#variantStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariant(VerifierParser.LoopVariantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopVariant}
	 * labeled alternative in {@link VerifierParser#variantStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariant(VerifierParser.LoopVariantContext ctx);
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
	 * Enter a parse tree produced by the {@code NamedPairUnnamedEleDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void enterNamedPairUnnamedEleDecl(VerifierParser.NamedPairUnnamedEleDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedPairUnnamedEleDecl}
	 * labeled alternative in {@link VerifierParser#uninitialDecl}.
	 * @param ctx the parse tree
	 */
	void exitNamedPairUnnamedEleDecl(VerifierParser.NamedPairUnnamedEleDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolE}
	 * labeled alternative in {@link VerifierParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolE(VerifierParser.BoolEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolE}
	 * labeled alternative in {@link VerifierParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolE(VerifierParser.BoolEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithE}
	 * labeled alternative in {@link VerifierParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithE(VerifierParser.ArithEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithE}
	 * labeled alternative in {@link VerifierParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithE(VerifierParser.ArithEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldBoolArrayE}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldBoolArrayE(VerifierParser.OldBoolArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldBoolArrayE}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldBoolArrayE(VerifierParser.OldBoolArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldBoolPairE}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldBoolPairE(VerifierParser.OldBoolPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldBoolPairE}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldBoolPairE(VerifierParser.OldBoolPairEContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolPairElement}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolPairElement(VerifierParser.BoolPairElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolPairElement}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolPairElement(VerifierParser.BoolPairElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolPairFirst}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolPairFirst(VerifierParser.BoolPairFirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolPairFirst}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolPairFirst(VerifierParser.BoolPairFirstContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolPairResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolPairResult(VerifierParser.BoolPairResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolPairResult}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolPairResult(VerifierParser.BoolPairResultContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolPairSecond}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolPairSecond(VerifierParser.BoolPairSecondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolPairSecond}
	 * labeled alternative in {@link VerifierParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolPairSecond(VerifierParser.BoolPairSecondContext ctx);
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
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(VerifierParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(VerifierParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(VerifierParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(VerifierParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(VerifierParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(VerifierParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqual(VerifierParser.GreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOrEqual}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqual(VerifierParser.GreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqual(VerifierParser.LessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqual}
	 * labeled alternative in {@link VerifierParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqual(VerifierParser.LessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVar(VerifierParser.ArithmeticVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVar}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVar(VerifierParser.ArithmeticVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntNum(VerifierParser.IntNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNum}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntNum(VerifierParser.IntNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithParen(VerifierParser.ArithParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithParen}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithParen(VerifierParser.ArithParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(VerifierParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(VerifierParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(VerifierParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(VerifierParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithPairElement}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithPairElement(VerifierParser.ArithPairElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithPairElement}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithPairElement(VerifierParser.ArithPairElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpperArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterUpperArray(VerifierParser.UpperArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpperArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitUpperArray(VerifierParser.UpperArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterRealNum(VerifierParser.RealNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitRealNum(VerifierParser.RealNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexArithmeticArray(VerifierParser.IndexArithmeticArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexArithmeticArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexArithmeticArray(VerifierParser.IndexArithmeticArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithResult(VerifierParser.ArithResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithResult(VerifierParser.ArithResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LowerArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterLowerArray(VerifierParser.LowerArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LowerArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitLowerArray(VerifierParser.LowerArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldArithPairE}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldArithPairE(VerifierParser.OldArithPairEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldArithPairE}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldArithPairE(VerifierParser.OldArithPairEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithPairResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithPairResult(VerifierParser.ArithPairResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithPairResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithPairResult(VerifierParser.ArithPairResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithPairSecond}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithPairSecond(VerifierParser.ArithPairSecondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithPairSecond}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithPairSecond(VerifierParser.ArithPairSecondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldArithArrayE}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldArithArrayE(VerifierParser.OldArithArrayEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldArithArrayE}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldArithArrayE(VerifierParser.OldArithArrayEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithArrayResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithArrayResult(VerifierParser.ArithArrayResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithArrayResult}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithArrayResult(VerifierParser.ArithArrayResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CountArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterCountArray(VerifierParser.CountArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CountArray}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitCountArray(VerifierParser.CountArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithPairFirst}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithPairFirst(VerifierParser.ArithPairFirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithPairFirst}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithPairFirst(VerifierParser.ArithPairFirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OldArithVar}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterOldArithVar(VerifierParser.OldArithVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OldArithVar}
	 * labeled alternative in {@link VerifierParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitOldArithVar(VerifierParser.OldArithVarContext ctx);
}