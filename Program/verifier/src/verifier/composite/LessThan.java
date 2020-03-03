package verifier.composite;

import verifier.visitor.*;

public class LessThan extends RelationalExpr {
	public LessThan(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitLessThan(this);
	}
}
