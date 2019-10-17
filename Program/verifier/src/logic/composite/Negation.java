package logic.composite;

import logic.visitor.*;

public class Negation extends UnaryExpr{
	public Negation(Logic e) {
		super(e);
	}

	public void accept(Visitor v) {
		v.visitNot(this);
	}
}
