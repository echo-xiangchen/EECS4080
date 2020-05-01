package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class Methods extends Verifier {
	
	// parameter
	public List<Verifier> parameters;
	
	// return value
	public Verifier returnValue;
	
	// precondition expression
	public Verifier precondition;
	
	// local variables
	public Verifier locals;
	
	// implementations of the method
	public List<Verifier> implementations;
	
	// postcondition expression
	public Verifier postcondition;
	
	
	// method declaration
	public Methods(String name, List<Verifier> parameters, Verifier returnValue, 
			Verifier pre, Verifier locals, List<Verifier> imp, 
			Verifier post, mode mode) {
		this.name = name;
		this.parameters = parameters;
		this.returnValue = returnValue;
		this.precondition = pre;
		this.locals = locals;
		this.implementations = imp;
		this.postcondition = post;
		this.mode = mode;
	}
	
	// method verification
	public Methods(String name, mode mode) {
		this.name = name;
		this.mode = mode;
	}
	
	public void accept(Visitor v) {
		v.visitMethods(this);
	}
	
	@Override
	public Verifier copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
