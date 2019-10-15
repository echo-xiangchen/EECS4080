package logic.composite;

import logic.visitor.*;
import modes.*;

public class BoolVar extends Var {

	// mode 0: uninitialized declaration
	// mode 1: verification
	// mode 2: initialized declaration
	
	// mode 0 and 1
	public BoolVar(String name, Mode mode) {
		super(name, mode);
	}
	
	// mode 2
	public BoolVar(String name, Logic value, Mode mode) {
		super(name, value, mode);
		
	}
	
	public void accept(Visitor v) {
		v.visitBoolVar(this);
	}

}
