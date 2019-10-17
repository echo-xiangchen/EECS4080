package logic.composite;

import logic.visitor.*;

public class Subtraction extends ArithmeticExpr {
	public Subtraction(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitSubtraction(this);
	}
}
