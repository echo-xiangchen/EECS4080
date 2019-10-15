package logic.composite;

import logic.visitor.*;

public class BoolFalse extends BoolConst {

	public BoolFalse(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitBoolFalse(this);
	}
}
