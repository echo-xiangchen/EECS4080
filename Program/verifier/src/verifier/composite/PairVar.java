package verifier.composite;

import modes.*;
import verifier.visitor.*;

public class PairVar extends Var {
	

	// uninitialized named pair declaration
	// left: first element
	// right: second element
	// p : PAIR[x: BOOLEAN; y: INTEGER]
	public PairVar(String name, Verifier left, Verifier right, mode mode) {
		super(name, left, right, mode);
	}
	
	// initialized pair declaration
	// p : PAIR[x: BOOLEAN; y: REAL] = [true, 2.3]
	public PairVar(String name, Verifier left, Verifier right, Verifier leftElement, Verifier rightElement, mode mode) {
		super(name, left, right, leftElement, rightElement, mode);
	}
	
	// verification
	public PairVar(String name, String element, mode mode) {
		super(name, element, mode);
	}

	@Override
	public Verifier copy() {
		Verifier leftCopy = this.left().copy();
		Verifier rightCopy = this.right().copy();
		
		return new PairVar(this.name, leftCopy, rightCopy, this.mode);
	}
	
	public void accept(Visitor v) {
		v.visitPair(this);
	}
	
	
	
}
