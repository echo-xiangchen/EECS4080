package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class BoolArrayVar extends ArrayVar {
	
	// uninitialized declaration
	public BoolArrayVar(String name, mode mode) {
		super(name, mode);
		typeIndicator = "Bool";
		typeStr = "ARRAY[BOOLEAN]";
	}
	
	// verification
	public BoolArrayVar(String name, mode mode, Verifier index) {
		super(name, mode, index);
		typeIndicator = "Bool";
		typeStr = "ARRAY[BOOLEAN]";
	}
	
	// initialized declaration
	public BoolArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
		typeIndicator = "Bool";
		typeStr = "ARRAY[BOOLEAN]";
	}
	
	// anonymous variable declaration
	public BoolArrayVar(mode mode) {
		super(mode);
		typeIndicator = "Bool";
		typeStr = "ARRAY[BOOLEAN]";
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new BoolArrayVar(this.name, this.mode, this.index.copy());
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
			return this.name.equals(v.name) && this.index.isEqual(v.index);
		}
		return false;
	}
}
