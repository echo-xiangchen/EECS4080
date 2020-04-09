package verifier.composite;

import verifier.visitor.*;

public class IntConst extends NumConst {

	// normal constant
	public IntConst(String name) {
		super(name);
	}
	
	// array count
	public IntConst(String name, String indicator, boolean value) {
		super(name, indicator, value);
	}
	
	public void accept(Visitor v) {
		v.visitIntConst(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new IntConst(this.name, this.indicator, this.isArray);
	}
}
