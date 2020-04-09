package verifier.composite;

import verifier.visitor.*;

public class GreaterThan extends RelationalExpr {
	public GreaterThan(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterThan(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new GreaterThan(this.left().copy(), this.right().copy());
	}
}
