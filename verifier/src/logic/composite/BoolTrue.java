package logic.composite;

import logic.visitor.*;

public class BoolTrue extends BoolConst {

	public BoolTrue(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolTrue(this);
	}

}
