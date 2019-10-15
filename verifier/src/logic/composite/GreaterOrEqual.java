package logic.composite;

import logic.visitor.*;

public class GreaterOrEqual extends RelationalExpr {
	public GreaterOrEqual(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterOrEqual(this);
	}
}
