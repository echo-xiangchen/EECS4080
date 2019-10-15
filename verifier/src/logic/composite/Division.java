package logic.composite;

import logic.visitor.*;

public class Division extends ArithmeticExpr {
	public Division(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitDivision(this);
	}
}
