package logic.composite;

import logic.visitor.*;

public class LessOrEqual extends RelationalExpr {
	public LessOrEqual(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitLessOrEqual(this);
	}
}
