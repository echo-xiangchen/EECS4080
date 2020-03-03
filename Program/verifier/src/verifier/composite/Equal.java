package verifier.composite;

import verifier.visitor.*;

public class Equal extends RelationalExpr {
	public Equal(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitEqual(this);
	}
}
