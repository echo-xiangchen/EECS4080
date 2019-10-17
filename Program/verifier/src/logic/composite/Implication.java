package logic.composite;

import logic.visitor.*;

public class Implication extends LogicalExpr{

	public Implication(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitImplies(this);
	}

}
