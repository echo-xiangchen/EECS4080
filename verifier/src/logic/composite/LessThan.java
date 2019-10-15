package logic.composite;

import logic.visitor.*;

public class LessThan extends RelationalExpr {
	public LessThan(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitLessThan(this);
	}
}
