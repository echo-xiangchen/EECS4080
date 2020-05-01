package verifier.composite;

import java.util.*;

import modes.mode;

public abstract class ArrayVar extends Var {
	
	// uninitialized declaration
	public ArrayVar(String name, mode mode) {
		super(name, mode);
	}
	
	// verification
	// name, mode, index
	public ArrayVar(String name, mode mode, Verifier index) {
		super(name, mode, index);
	}
	
	// initialized declaration
	public ArrayVar(String name, List<Verifier> elementValue, mode mode) {
		super(name, elementValue, mode);
		this.elementValue = elementValue;
	}
	
	// anonymous variable declaration
	public ArrayVar(mode mode) {
		super(mode);
	}
}
