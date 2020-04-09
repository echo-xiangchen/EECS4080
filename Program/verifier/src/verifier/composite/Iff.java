package verifier.composite;

import verifier.visitor.*;

public class Iff extends LogicalExpr{

	public Iff(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitIff(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Iff(this.left().copy(), this.right().copy());
	}
}

