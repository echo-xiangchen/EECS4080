package verifier.composite;

import verifier.visitor.*;

public class Conjunction extends LogicalExpr{

	public Conjunction(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitAnd(this);
	}

}
