package verifier.composite;

import verifier.visitor.*;

public class BoolFalse extends BoolConst {

	public BoolFalse(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolFalse(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolFalse(this.name);
	}
}
