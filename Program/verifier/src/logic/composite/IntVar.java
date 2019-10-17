package logic.composite;

import logic.visitor.*;
import modes.*;

public class IntVar extends Var {

	// variable 0: uninitialized declaration
	// variable 1: verification
	// variable 2: initialized declaration
	
	// variable 0 and 1
	public IntVar(String name, Variable variable) {
		super(name, variable);
		// TODO Auto-generated constructor stub
	}
	
	// variable 2
	public IntVar(String name, Logic value, Variable variable) {
		super(name, value, variable);
			
	}
	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}

}
