package verifier.composite;

import verifier.visitor.*;

public class Multiplication extends ArithmeticExpr {
	public Multiplication(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitMultiplication(this);
	}
}
