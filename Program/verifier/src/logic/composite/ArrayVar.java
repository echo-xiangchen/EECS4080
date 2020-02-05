package logic.composite;

import modes.mode;

public class ArrayVar extends Var {
	
	// uninitialized declaration
	public ArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public ArrayVar(String name, Logic index, mode mode) {
		super(name, index, mode);
	}
	
	
}
