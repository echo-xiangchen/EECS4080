package verifier.composite;

import verifier.visitor.*;

public class GreaterOrEqual extends RelationalExpr {
	public GreaterOrEqual(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterOrEqual(this);
	}
}
