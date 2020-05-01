package verifier.composite;

import verifier.visitor.*;

public class BoolTrue extends BoolConst {

	public BoolTrue(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolTrue(this);
		typeIndicator = "Bool";
		typeStr = "BOOLEAN";
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolTrue(this.name);
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
