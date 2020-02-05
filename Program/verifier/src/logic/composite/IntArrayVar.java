package logic.composite;

import logic.visitor.Visitor;

public class IntArrayVar extends ArrayVar {

	public IntArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

}
