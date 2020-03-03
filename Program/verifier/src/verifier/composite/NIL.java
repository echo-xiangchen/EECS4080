// class that represents undeclared number variables
package verifier.composite;

import verifier.visitor.*;

public class NIL extends Var {

	public NIL(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public void accept(Visitor v) {
		v.visitNIL(this);
	}

}
