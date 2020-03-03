package verifier.composite;

import verifier.visitor.*;

public class Subtraction extends ArithmeticExpr {
	public Subtraction(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitSubtraction(this);
	}
}
