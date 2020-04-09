// class that represents undeclared number variables
package verifier.composite;

import verifier.visitor.*;
import modes.*;

public class NIL extends Var {

	public NIL(String name, mode mode) {
		super(name, mode);
	}
	
	public void accept(Visitor v) {
		v.visitNIL(this);
	}
	
	public Verifier copy() {
		return new NIL(this.name, this.mode);
	}
}
