package verifier.composite;

import java.util.*;

import modes.mode;

public class ArrayVar extends Var {
	
	// uninitialized declaration
	public ArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public ArrayVar(String name, mode mode, Verifier verifier) {
		super(name, mode, verifier);
	}
	
	// initialized declaration
	public ArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
		this.arrayValue = arrayValue;
	}
	
	// anonymous variable declaration
	public ArrayVar(mode mode) {
		super(mode);
	}
}
