package verifier.composite;

import verifier.visitor.*;

public class BoolFalse extends BoolConst {
	

	public BoolFalse(String name) {
		super(name);
		typeIndicator = "Bool";
		typeStr = "BOOLEAN";
	}
	
	public void accept(Visitor v) {
		v.visitBoolFalse(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolFalse(this.name);
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
			return this.name.equals(v.name);
		}
		return false;
	}
}
