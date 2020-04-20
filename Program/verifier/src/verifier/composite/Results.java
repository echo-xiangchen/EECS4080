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

	@Override
	public boolean isEqual(Verifier v) {
		if (this == null || v == null) {
			return false;
		}
		
		if (this == v) {
			return true;
		}
		if (this.getClass().equals(v.getClass())) {
			return this.name.equals(v.name);
		}
		return false;
	}
}
