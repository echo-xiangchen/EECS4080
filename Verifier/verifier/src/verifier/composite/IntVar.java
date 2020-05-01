package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class IntVar extends NumVar {

	
	// uninitialized declaration and verification
	public IntVar(String name, mode mode) {
		super(name, mode);
		typeIndicator = "Int";
		typeStr = "INTEGER";
	}
	
	// initialized declaration
	public IntVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
		typeIndicator = "Int";
		typeStr = "INTEGER";
			
	}
	
	// anonymous variable declaration
	public IntVar(mode mode) {
		super(mode);
		typeIndicator = "Int";
		typeStr = "INTEGER";
	}

	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}
	
	public Verifier copy() {

		return new IntVar(this.name, this.mode);
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
