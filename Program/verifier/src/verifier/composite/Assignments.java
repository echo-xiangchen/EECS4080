package verifier.composite;

import verifier.visitor.*;

public class Assignments extends Implementations{

	
	public Verifier assignValue;
	
	public Verifier index;
	
	
	public Assignments(String variable, Verifier assignValue) {
		this.name = variable;
		this.assignValue = assignValue;
	}
	
	public Assignments(String variable, Verifier index, Verifier assignValue) {
		this.name = variable;
		this.index = index;
		this.assignValue = assignValue;
	}
	
	public void accept(Visitor v) {
		v.visitAssignment(this);
	}
	
	public Verifier copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
