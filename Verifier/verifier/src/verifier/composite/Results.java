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
	
	public Results(String element) {
		this.name = "Result";
		this.element = element;
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
			if (v.index != null) {
				return this.name.equals(v.name) && this.index.isEqual(v.index);
			}
			else if (v.element != null) {
				return this.name.equals(v.name) && this.element.equals(v.element);
			}
			else {
				return this.name.equals(v.name);
			}
		}
		return false;
	}
}
