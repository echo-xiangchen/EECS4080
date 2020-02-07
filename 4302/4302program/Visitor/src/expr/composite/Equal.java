package expr.composite;

import expr.visitor.*;

public class Equal extends Term {
	
	public Equal(Expr left, Expr right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitEqual(this);
	}
}
