package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class IntArrayVar extends ArrayVar {

	// uninitialized declaration
	public IntArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public IntArrayVar(String name, mode mode, Verifier verifier) {
		super(name, mode, verifier);
	}
	
	// initialized declaration
	public IntArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
	}
		
		
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

}
