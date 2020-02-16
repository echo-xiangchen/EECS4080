package logic.composite;

import logic.visitor.Visitor;
import modes.mode;

public class RealArrayVar extends ArrayVar{

	// uninitialized declaration
	public RealArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public RealArrayVar(String name, mode mode, Logic index) {
		super(name, mode, index);
	}
	
	public void accept(Visitor v) {
		v.visitRealArrayVar(this);
	}

}
