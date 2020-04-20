package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Forall extends Quantification {

	public Forall(List<Verifier> list, Verifier verifier) {
		super(list, verifier);
	}

	public void accept(Visitor v) {
		v.visitForall(this);
	}
	
	// method for deep copy
	public Verifier copy() {
		List<Verifier> list = new ArrayList<Verifier>();
		for (int i = 0; i < this.quantifyList.size(); i++) {
			list.add(this.quantifyList.get(i).copy());
		}
		return new Forall(list, this.expr.copy());
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
			for (int i = 0; i < this.quantifyList.size(); i++) {
				if (!this.quantifyList.get(i).equals(((Exists) v).quantifyList.get(i))) {
					return false;
				}
			}
			return this.expr.equals(((Exists) v).expr);
		}
		return false;
	}
}
