package verifier.composite;

import verifier.visitor.*;

public class Assignments extends Implementations{

	
	public Verifier assignValue;
	
	
	public Assignments(String variable, Verifier assignValue) {
		this.name = variable;
		this.assignValue = assignValue;
	}
	
	public void accept(Visitor v) {
		v.visitAssignment(this);
	}
}
