package expr.composite;

import expr.visitor.*;

public class LessThan extends Term {
	
	public LessThan(Expr left, Expr right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitLessThan(this);
	}
}
