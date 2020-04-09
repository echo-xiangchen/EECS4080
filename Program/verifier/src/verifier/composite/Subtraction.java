package verifier.composite;

import verifier.visitor.*;

public class Subtraction extends ArithmeticExpr {
	public Subtraction(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitSubtraction(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Subtraction(this.left().copy(), this.right().copy());
	}
}
