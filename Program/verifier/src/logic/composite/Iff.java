package logic.composite;

import logic.visitor.*;

public class Iff extends LogicalExpr{

	public Iff(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitIff(this);
	}

}

