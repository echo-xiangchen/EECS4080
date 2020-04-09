package verifier.composite;

import verifier.visitor.*;

public class Negation extends UnaryExpr{
	public Negation(Verifier verifier) {
		super(verifier);
	}

	public void accept(Visitor v) {
		v.visitNot(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Negation(this.child.copy());
	}
}
