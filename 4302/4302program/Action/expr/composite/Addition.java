package expr.composite;

import expr.visitor.*;

public class Addition extends Expr {
	
	public Addition(Expr left, Expr right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitAddition(this);
	}
}
