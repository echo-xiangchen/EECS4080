package verifier.composite;

import verifier.visitor.Visitor;

public class Results extends Keywords {
	
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
	
	public Verifier copy() {
		if (this.index != null) {
			return new Results(this.index.copy());
		}
		else {
			return new Results();
		}
	}
}
