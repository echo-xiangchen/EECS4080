package logic.visitor;

import logic.composite.*;


public interface Visitor {
	
	void visitNot(Negation e);
	
	void visitAnd(Conjunction e);
	
	void visitOr(Disjunction e);
	
	void visitImplies(Implication e);
	
	void visitIff(Iff e);
	
	
	void visitEqual(Equal e);
	
	void visitGreaterThan(GreaterThan e);
	
	void visitLessThan(LessThan e);
	
	void visitGreaterOrEqual(GreaterOrEqual e);
	
	void visitLessOrEqual(LessOrEqual e);
	
	
	void visitAddition(Addition e);
	
	void visitSubtraction(Subtraction e);
	
	void visitMultiplication(Multiplication e);
	
	void visitDivision(Division e);
	
	

	void visitBoolVar(BoolVar v);
	
	void visitBoolTrue(BoolTrue c);

	void visitBoolFalse(BoolFalse c);
	
	
	void visitIntVar(IntVar v);

	void visitNumConst(NumConst c);

	
	
	void visitForall(Forall q);

	void visitExists(Exists q);

	
}
