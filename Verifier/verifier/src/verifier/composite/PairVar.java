package verifier.composite;

import java.util.List;

import modes.*;
import verifier.visitor.*;

public class PairVar extends Var {
	
	// uninitialized named pair declaration
	// left: first element
	// right: second element
	// p : PAIR[x: BOOLEAN; y: INTEGER]
	public PairVar(String name, Verifier left, Verifier right, mode mode) {
		super(name, left, right, mode);
		children.add(left);
		children.add(right);
	}
	
	// initialized pair declaration
	// p : PAIR[x: BOOLEAN; y: REAL] = [true, 2.3]
	public PairVar(String name, Verifier left, Verifier right, List<Verifier> elementValue, mode mode) {
		super(name, left, right, elementValue, mode);
		children.add(left);
		children.add(right);
		this.elementValue = elementValue;
	}
	
	// pair re-assignment
	public PairVar(String name, List<Verifier> elementValue, mode mode) {
		super(name, elementValue, mode);
	}
	
	// verification
	public PairVar(String name, String element, mode mode) {
		super(name, element, mode);
	}
	
	
	public Verifier leftvalue() {
		return this.elementValue.get(0);
	}
	
	public Verifier rightvalue() {
		return this.elementValue.get(1);
	}

	@Override
	public Verifier copy() {
		return new PairVar(this.name, this.element ,this.mode);
	}
	
	public void accept(Visitor v) {
		v.visitPair(this);
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
			return this.name.equals(v.name) && this.element.equals(((PairVar) v).element);
		}
		return false;
	}
}
