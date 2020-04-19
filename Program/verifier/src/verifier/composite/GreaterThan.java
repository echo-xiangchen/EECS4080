package verifier.composite;

import verifier.visitor.*;

public class GreaterThan extends RelationalExpr {
	public GreaterThan(Verifier verifier, Verifier verifier2) {
		super(verifier, verifier2);
	}
	
	public void accept(Visitor v) {
		v.visitGreaterThan(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new GreaterThan(this.left().copy(), this.right().copy());
	}

	@Override
	public boolean isEqual(Verifier v) {
		if (this == null || v == null) {
			return false;
		}
		
		if (this == v) {
			return true;
		}
		
		if (this.getClass().equals(v.getClass())) {
			return this.left().equals(v.left()) && this.right().equals(v.right());
		}
		return false;
	}
}
