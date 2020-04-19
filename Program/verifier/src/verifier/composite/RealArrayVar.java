package verifier.composite;

import java.util.List;

import modes.mode;
import verifier.visitor.Visitor;

public class RealArrayVar extends ArrayVar{

	// uninitialized declaration
	public RealArrayVar(String name, modes.mode mode) {
		super(name, mode);
		typeIndicator = "Real";
		typeStr = "ARRAY[REAL]";
	}
	
	// verification
	public RealArrayVar(String name, mode mode, Verifier verifier) {
		super(name, mode, verifier);
		typeIndicator = "Real";
		typeStr = "ARRAY[REAL]";
	}
	
	// initialized declaration
	public RealArrayVar(String name, List<Verifier> arrayValue, mode mode) {
		super(name, arrayValue, mode);
		typeIndicator = "Real";
		typeStr = "ARRAY[REAL]";
	}
	
	// anonymous variable declaration
	public RealArrayVar(mode mode) {
		super(mode);
		typeIndicator = "Real";
		typeStr = "ARRAY[REAL]";
	}
	
	public void accept(Visitor v) {
		v.visitRealArrayVar(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new RealArrayVar(this.name, this.mode, this.index.copy());
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
