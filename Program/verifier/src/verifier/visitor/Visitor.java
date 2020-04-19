package verifier.visitor;

import verifier.composite.*;


public interface Visitor {
	
	// logical expr
	void visitNot(Negation e);
	
	void visitAnd(Conjunction e);
	
	void visitOr(Disjunction e);
	
	void visitImplies(Implication e);
	
	void visitIff(Iff e);
	
	// relational expr
	void visitEqual(Equal e);
	
	void visitGreaterThan(GreaterThan e);
	
	void visitLessThan(LessThan e);
	
	void visitGreaterOrEqual(GreaterOrEqual e);
	
	void visitLessOrEqual(LessOrEqual e);
	
	// arithmetic expr
	void visitAddition(Addition e);
	
	void visitSubtraction(Subtraction e);
	
	void visitMultiplication(Multiplication e);
	
	void visitDivision(Division e);
	
	
	// variable
	void visitVarLists(VarLists v);
	
	void visitBoolVar(BoolVar v);
	
	void visitIntVar(IntVar v);
	
	void visitRealVar(RealVar realVar);
	
	
	// logical constant
	void visitBoolTrue(BoolTrue c);

	void visitBoolFalse(BoolFalse c);
	
	
	// arithmetic constant
	void visitIntConst(IntConst c);
	
	void visitRealConst(RealConst c);

	
	// quantification
	void visitForall(Forall q);

	void visitExists(Exists q);
	
	
	// array variable
	void visitBoolArrayVar(BoolArrayVar a);

	void visitIntArrayVar(IntArrayVar a);

	void visitRealArrayVar(RealArrayVar a);

	
	// pair
	void visitPair(PairVar p);
	
	
	// unknown variable
	void visitUnknownVar(UnknownVar n);

	
	
	// method
	void visitMethods(Methods m);
	
	
	// assignment
	void visitAssignment(Assignments a);
	
	
	// if-else statement
	void visitAlternations(Alternations a);
	
	void visitIfStats(IfStats s);
	
	void visitElseifStats(ElseifStats s);
	
	void visitElseStats(ElseStats s);
	
	
	// loops
	void visitLoops(Loops l);
	
	void visitInitImp(InitImp s);
	
	void visitInvariantStat(InvariantStat s);
	
	void visitExitCondition(ExitCondition s);
	
	void visitLoopBody(LoopBody s);
	
	void visitVariantStat(VariantStat s);
	

	// contracts
	void visitPreconditions(Preconditions p);

	void visitPostconditions(Postconditions p);
	
	void visitContractExpr(ContractExpr c);
	
	
	// keywords
	void visitLocals(Locals l);

	void visitOlds(Olds o);

	void visitResults(Results r);

	

	

	

	

	

	

	

	

	

	

	

	

	

	
	
}
