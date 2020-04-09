package verifier.composite;

import verifier.visitor.*;

public class Implication extends LogicalExpr{

	public Implication(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitImplies(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Implication(this.left().copy(), this.right().copy());
	}

}
