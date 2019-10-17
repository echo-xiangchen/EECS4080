package logic.composite;

import logic.visitor.*;

public class Multiplication extends ArithmeticExpr {
	public Multiplication(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitMultiplication(this);
	}
}
