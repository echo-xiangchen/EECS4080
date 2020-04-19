package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class IntArrayVar extends ArrayVar {

	// uninitialized declaration
	public IntArrayVar(String name, modes.mode mode) {
		super(name, mode);
		typeIndicator = "Int";
		typeStr = "ARRAY[INTEGER]";
	}
	
	// verification
	public IntArrayVar(String name, mode mode, Verifier index) {
		super(name, mode, index);
		typeIndicator = "Int";
		typeStr = "ARRAY[INTEGER]";
	}
	
	// initialized declaration
	public IntArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
		typeIndicator = "Int";
		typeStr = "ARRAY[INTEGER]";
	}
	
	// anonymous variable declaration
	public IntArrayVar(mode mode) {
		super(mode);
		typeIndicator = "Int";
		typeStr = "ARRAY[INTEGER]";
	}
		
		
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

	// method for deep copy
	public Verifier copy() {
		return new IntArrayVar(this.name, this.mode, this.index.copy());
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
			return this.name.equals(v.name) && this.index.equals(v.index);
		}
		return false;
	}
}
