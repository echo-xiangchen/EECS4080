package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class Assignments extends Implementations{

	
	public Verifier assignValue;
	
	// index for array assignment
	public Verifier index;
	
	// element for pair assignment
	public String element;
	
	// normal variable assignment
	public Assignments(String name, Verifier assignValue, mode mode) {
		this.name = name;
		this.assignValue = assignValue;
		this.mode = mode;
	}
	
	// array variable assignment
	public Assignments(String name, Verifier index, Verifier assignValue, mode mode) {
		this.name = name;
		this.index = index;
		this.assignValue = assignValue;
		this.mode = mode;
	}
	
	// pair variable assignment
	public Assignments(String name, String element, Verifier assignValue, mode mode) {
		this.name = name;
		this.element = element;
		this.assignValue = assignValue;
		this.mode = mode;
	}
	public void accept(Visitor v) {
		v.visitAssignment(this);
	}
	
	public Verifier copy() {
		if (this.index != null) {
			return new Assignments(this.name, this.index.copy(), this.assignValue.copy(), this.mode);
		}
		else {
			return new Assignments(this.name, this.assignValue.copy(), this.mode);
		}
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
