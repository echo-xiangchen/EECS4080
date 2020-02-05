package logic.composite;

import logic.visitor.Visitor;

public class RealArrayVar extends ArrayVar{

	public RealArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public void accept(Visitor v) {
		v.visitRealArrayVar(this);
	}

}
