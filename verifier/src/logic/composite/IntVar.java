package logic.composite;

import logic.visitor.*;
import modes.*;

public class IntVar extends Var {

	// mode 0: uninitialized declaration
	// mode 1: verification
	// mode 2: initialized declaration
	
	// mode 0 and 1
	public IntVar(String name, Mode mode) {
		super(name, mode);
		// TODO Auto-generated constructor stub
	}
	
	// mode 2
	public IntVar(String name, Logic value, Mode mode) {
		super(name, value, mode);
			
	}
	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}

}
