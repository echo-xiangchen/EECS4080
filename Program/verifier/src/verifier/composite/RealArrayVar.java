package verifier.composite;

import java.util.List;

import modes.mode;
import verifier.visitor.Visitor;

public class RealArrayVar extends ArrayVar{

	// uninitialized declaration
	public RealArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public RealArrayVar(String name, mode mode, Verifier verifier) {
		super(name, mode, verifier);
	}
	
	// initialized declaration
	public RealArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
	}
	
	public void accept(Visitor v) {
		v.visitRealArrayVar(this);
	}

}
