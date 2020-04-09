package verifier.composite;

import verifier.visitor.*;

public class GreaterOrEqual extends RelationalExpr {
	public GreaterOrEqual(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterOrEqual(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new GreaterOrEqual(this.left().copy(), this.right().copy());
	}
}
