package verifier.composite;

import verifier.visitor.*;

public class IntConst extends NumConst {

	// normal constant
	public IntConst(String name) {
		super(name);
		typeIndicator = "Int";
		typeStr = "INTEGER";
	}
	
	// array count
	public IntConst(String name, String indicator, boolean isArray) {
		super(name, indicator, isArray);
		typeIndicator = "Int";
		typeStr = "INTEGER";
	}
	
	public void accept(Visitor v) {
		v.visitIntConst(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new IntConst(this.name, this.indicator, this.isArray);
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
			if (this.isArray) {
				return this.name.equals(v.name) && this.indicator.equals(((IntConst)v).indicator);
			}
			else {
				return this.name.equals(v.name);
			}
		}
		return false;
	}
}
