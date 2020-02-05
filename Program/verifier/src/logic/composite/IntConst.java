package logic.composite;

import logic.visitor.*;

public class IntConst extends NumConst {

	// mode 0: declaration
	// mode 1: verification
	public IntConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitIntConst(this);
	}
}
