package verifier.composite;

import modes.mode;
import verifier.visitor.Visitor;

public class RealVar extends NumVar {
	
	
	// uninitialized declaration and verification
	public RealVar(String name, mode mode) {
		super(name, mode);
		typeIndicator = "Real";
		typeStr = "REAL";
	}
	
	// initialized declaration
	public RealVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
		typeIndicator = "Real";
		typeStr = "REAL";
	}
	
	// anonymous variable declaration
	public RealVar(mode mode) {
		super(mode);
		typeIndicator = "Real";
		typeStr = "REAL";
	}
	
	public void accept(Visitor v) {
		v.visitRealVar(this);
	}
	
	public Verifier copy() {
		return new RealVar(this.name, this.mode);
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
