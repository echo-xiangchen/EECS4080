package verifier.composite;

import verifier.visitor.Visitor;

public class Results extends ProgramVerify {
	public Verifier index;
	
	public Results() {
		this.name = "Result";
	}
	
	public Results(Verifier index) {
		this.name = "Result";
		this.index = index;
	}
	
	public void accept(Visitor v) {
		v.visitResults(this);
	}
}
