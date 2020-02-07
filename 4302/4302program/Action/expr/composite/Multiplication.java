package expr.composite;

import expr.visitor.*;

public class Multiplication extends Expr {
	public Multiplication(Expr left, Expr right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitMultiplication(this);
	}
}
