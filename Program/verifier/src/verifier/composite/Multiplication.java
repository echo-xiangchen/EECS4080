package verifier.composite;

import verifier.visitor.*;

public class Multiplication extends ArithmeticExpr {
	public Multiplication(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitMultiplication(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Multiplication(this.left().copy(), this.right().copy());
	}
}
