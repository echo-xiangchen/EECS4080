package verifier.composite;

import modes.mode;
import verifier.visitor.Visitor;

public class RealVar extends NumVar {
	
	
	// uninitialized declaration and verification
	public RealVar(String name, mode mode) {
		super(name, mode);
	}
	
	// initialized declaration
	public RealVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
	}
	
	// anonymous variable declaration
	public RealVar(mode mode) {
		super(mode);
	}
	
	public void accept(Visitor v) {
		v.visitRealVar(this);
	}
	
	public Verifier copy() {
		return new RealVar(this.name, this.mode);
	}
}
