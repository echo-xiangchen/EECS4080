package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Exists extends Quantification {

	public Exists(List<Verifier> list, Verifier verifier) {
		super(list, verifier);
	}
	
	public void accept(Visitor v) {
		v.visitExists(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		return new Exists(this.quantifyList, this.expr.copy());
	}

}
