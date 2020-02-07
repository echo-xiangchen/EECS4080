package expr.visitor;

import expr.composite.*;


public interface Visitor {
	
	
	
	void visitEqual(Equal e);
	
	void visitLessThan(LessThan e);
	
	
	
	
	void visitAddition(Addition e);
	
	void visitMultiplication(Multiplication e);
	
	
	
	void visitNum(Num c);

}
