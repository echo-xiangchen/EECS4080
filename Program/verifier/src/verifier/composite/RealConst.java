package verifier.composite;

import verifier.visitor.Visitor;

public class RealConst extends NumConst {

	public RealConst(String name) {
		super(name);
		typeIndicator = "Real";
		typeStr = "REAL";
	}
	
	public void accept(Visitor v) {
		v.visitRealConst(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new RealConst(this.name);
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
