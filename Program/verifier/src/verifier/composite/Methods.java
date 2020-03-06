package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class Methods extends Verifier {
	
	// method mode
	public mode mode;
	
	// parameter
	public List<Verifier> parameters;
	
	// return value
	public Verifier returnValue;
	
	// precondition expression
	public Verifier precondition;
	
	// implementations of the method
	public List<Implementations> implementations;
	
	// postcondition expression
	public Verifier postcondition;
	
	
	// method declaration
	public Methods(String name, List<Verifier> parameters, Verifier returnValue, 
			Verifier pre, List<Implementations> imp, Verifier post, mode mode) {
		this.name = name;
		this.parameters = parameters;
		this.returnValue = returnValue;
		this.precondition = pre;
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
}
