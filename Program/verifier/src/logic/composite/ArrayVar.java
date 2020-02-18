package logic.composite;

import java.util.*;

import modes.mode;

public class ArrayVar extends Var {
	
	// uninitialized declaration
	public ArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public ArrayVar(String name, mode mode, Logic index) {
		super(name, mode, index);
	}
	
	// initialized declaration
	public ArrayVar(String name, List<Logic> arrayValue, mode mode) {
		super(name, arrayValue, mode);
		this.arrayValue = arrayValue;
	}
}
