package logic.composite;

import logic.visitor.*;

public class GreaterThan extends RelationalExpr {
	public GreaterThan(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterThan(this);
	}
}
