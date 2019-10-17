package logic.composite;

import logic.visitor.*;

public class NumConst extends IntConst {

	// variable 0: declaration
	// variable 1: verification
	public NumConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitNumConst(this);
	}

}
