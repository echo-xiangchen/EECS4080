package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class BoolVar extends Var {

	
	
	// uninitialized declaration and verification
	public BoolVar(String name, mode mode) {
		super(name, mode);
	}
	
	// initialized declaration
	public BoolVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
	}
	
	// anonymous variable declaration
	public BoolVar(mode mode) {
		super(mode);
	}
	
	public void accept(Visitor v) {
		v.visitBoolVar(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolVar(this.name, this.mode);
	}
}
