package logic.composite;

import logic.visitor.*;

public class NumConst extends IntConst {

	// mode 0: declaration
	// mode 1: verification
	public NumConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitNumConst(this);
	}

}
