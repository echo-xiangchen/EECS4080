package logic.composite;

import logic.visitor.Visitor;

public class BoolArrayVar extends ArrayVar {

	public BoolArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public BoolArrayVar(String name, Logic index, modes.mode mode) {
		super(name, index, mode);
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
}
