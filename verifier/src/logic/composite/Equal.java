package logic.composite;

import logic.visitor.*;

public class Equal extends RelationalExpr {
	public Equal(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitEqual(this);
	}
}
