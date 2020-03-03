package verifier.composite;

import verifier.visitor.*;

public class BoolFalse extends BoolConst {

	public BoolFalse(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolFalse(this);
	}
}
