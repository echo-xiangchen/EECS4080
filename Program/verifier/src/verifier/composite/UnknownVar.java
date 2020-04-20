// class that represents undeclared number variables
package verifier.composite;

import verifier.visitor.*;
import modes.*;

public class UnknownVar extends Var {

	public UnknownVar(String name, mode mode) {
		super(name, mode);
	}
	
	public void accept(Visitor v) {
		v.visitUnknownVar(this);
	}
	
	public Verifier copy() {
		return new UnknownVar(this.name, this.mode);
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
