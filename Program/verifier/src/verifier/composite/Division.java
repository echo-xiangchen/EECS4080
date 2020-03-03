package verifier.composite;

import verifier.visitor.*;

public class Division extends ArithmeticExpr {
	public Division(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitDivision(this);
	}
}
