package logic.composite;

import logic.visitor.*;

public class Conjunction extends LogicalExpr{

	public Conjunction(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitAnd(this);
	}

}
