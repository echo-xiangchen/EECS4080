package verifier.composite;

import verifier.visitor.*;

public class Implication extends LogicalExpr{

	public Implication(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitImplies(this);
	}

}
