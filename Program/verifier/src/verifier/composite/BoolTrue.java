package verifier.composite;

import verifier.visitor.*;

public class BoolTrue extends BoolConst {

	public BoolTrue(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolTrue(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolTrue(this.name);
	}

}
