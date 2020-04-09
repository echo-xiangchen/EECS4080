package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class BoolArrayVar extends ArrayVar {
	
	// uninitialized declaration
	public BoolArrayVar(String name, mode mode) {
		super(name, mode);
	}
	
	// verification
	public BoolArrayVar(String name, mode mode, Verifier index) {
		super(name, mode, index);
	}
	
	// initialized declaration
	public BoolArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
	}
	
	// anonymous variable declaration
	public BoolArrayVar(mode mode) {
		super(mode);
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolArrayVar(this.name, this.mode, this.index.copy());
	}
}
