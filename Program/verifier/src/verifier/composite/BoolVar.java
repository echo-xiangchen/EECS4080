package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class BoolVar extends Var {
	// uninitialized declaration and verification
	public BoolVar(String name, mode mode) {
		super(name, mode);
		typeIndicator = "Bool";
		typeStr = "BOOLEAN";
	}
	
	// initialized declaration
	public BoolVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
		typeIndicator = "Bool";
		typeStr = "BOOLEAN";
	}
	
	// anonymous variable declaration
	public BoolVar(mode mode) {
		super(mode);
		typeIndicator = "Bool";
		typeStr = "BOOLEAN";
	}
	
	public void accept(Visitor v) {
		v.visitBoolVar(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolVar(this.name, this.mode);
	}

	@Override
	public boolean isEqual(Verifier v) {
		if (this == null || v == null) {
			return false;
		}
		
		if (this == v) {
			return true;
		}
		if (this.getClass().equals(v.getClass())) {
			return this.name.equals(v.name);
		}
		return false;
	}
}
