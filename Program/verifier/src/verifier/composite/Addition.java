package verifier.composite;

import verifier.visitor.*;

public class Addition extends ArithmeticExpr {
	public Addition(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitAddition(this);
	}
}
