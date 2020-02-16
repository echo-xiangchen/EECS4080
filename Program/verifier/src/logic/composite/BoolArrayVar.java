package logic.composite;

import logic.visitor.*;
import modes.*;

public class BoolArrayVar extends ArrayVar {
	
	// uninitialized declaration
	public BoolArrayVar(String name, mode mode) {
		super(name, mode);
	}
	
	// verification
	public BoolArrayVar(String name, mode mode, Logic index) {
		super(name, mode, index);
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
}
