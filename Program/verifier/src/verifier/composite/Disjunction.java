package verifier.composite;

import verifier.visitor.*;

public class Disjunction extends LogicalExpr{

	public Disjunction(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitOr(this);
	}
}
