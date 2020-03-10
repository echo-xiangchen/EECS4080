package verifier.composite;

import verifier.visitor.*;

public class IntConst extends NumConst {

	// normal constant
	public IntConst(String name) {
		super(name);
	}
	
	// array count
	public IntConst(String name, boolean value) {
		super(name, value);
	}
	
	public void accept(Visitor v) {
		v.visitIntConst(this);
	}
}
