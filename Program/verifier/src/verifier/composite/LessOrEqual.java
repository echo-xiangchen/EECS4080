package verifier.composite;

import verifier.visitor.*;

public class LessOrEqual extends RelationalExpr {
	public LessOrEqual(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitLessOrEqual(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new LessOrEqual(this.left().copy(), this.right().copy());
	}
}
