package verifier.composite;

import verifier.visitor.*;

public class Postconditions extends Contracts {

	// postcondition with tag
	public Postconditions(String name, Verifier expr) {
		super(name, expr);
	}
	
	// postcondition without tag
	public Postconditions(Verifier expr) {
		super(expr);
	}
	
	public void accept(Visitor v) {
		v.visitPostconditions(this);
	}

}
