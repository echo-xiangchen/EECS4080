package logic.composite;

import logic.visitor.*;

public class Addition extends ArithmeticExpr {
	public Addition(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitAddition(this);
	}
}
