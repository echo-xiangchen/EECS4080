package verifier.composite;

import verifier.visitor.*;

public class Negation extends UnaryExpr{
	public Negation(Verifier verifier) {
		super(verifier);
	}

	public void accept(Visitor v) {
		v.visitNot(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Negation(this.child.copy());
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
			return this.child.equals(v.child);
		}
		return false;
	}
}
