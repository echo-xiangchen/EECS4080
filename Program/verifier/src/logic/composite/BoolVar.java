package logic.composite;

import logic.visitor.*;
import modes.*;

public class BoolVar extends Var {

	// variable 0: uninitialized declaration
	// variable 1: verification
	// variable 2: initialized declaration
	
	// variable 0 and 1
	public BoolVar(String name, Variable variable) {
		super(name, variable);
	}
	
	// variable 2
	public BoolVar(String name, Logic value, Variable variable) {
		super(name, value, variable);
		
	}
	
	public void accept(Visitor v) {
		v.visitBoolVar(this);
	}

}
