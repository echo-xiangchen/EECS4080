package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class IntVar extends NumVar {

	
	// uninitialized declaration and verification
	public IntVar(String name, mode mode) {
		super(name, mode);
	}
	
	// initialized declaration
	public IntVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
			
	}
	
	// anonymous variable declaration
	public IntVar(mode mode) {
		super(mode);
	}

	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}
	
	public Verifier copy() {
//		if (this.mode instanceof QuantificationList) {
//			List<Verifier> list = new ArrayList<Verifier>();
//			for (int i = 0; i < this.varDeclList.size(); i++) {
//				list.add(this.varDeclList.get(i).copy());
//			}
//			return new IntVar(list, this.mode);
//		}
		return new IntVar(this.name, this.mode);
	}

}
