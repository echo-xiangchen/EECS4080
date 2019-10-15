package logic.composite;

import logic.visitor.*;

public class Disjunction extends LogicalExpr{

	public Disjunction(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitOr(this);
	}
}
