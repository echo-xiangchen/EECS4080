package verifier.composite;

import verifier.visitor.*;

public class Conjunction extends LogicalExpr{

	public Conjunction(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitAnd(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Conjunction(this.left().copy(), this.right().copy());
	}
}
