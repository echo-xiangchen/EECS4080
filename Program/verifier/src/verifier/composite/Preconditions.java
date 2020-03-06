package verifier.composite;

import verifier.visitor.*;

public class Preconditions extends Contracts {

	// precondition with tag
	Preconditions(String name, Verifier expr) {
		super(name, expr);
	}
	
	// precondition without tag
	Preconditions(Verifier expr){
		super(expr);
	}
	
	
	public void accept(Visitor v) {
		v.visitPreconditions(this);
	}

}
