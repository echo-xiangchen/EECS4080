package verifier.composite;

import verifier.visitor.Visitor;

public class RealConst extends NumConst {

	public RealConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitRealConst(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new RealConst(this.name);
	}
}
