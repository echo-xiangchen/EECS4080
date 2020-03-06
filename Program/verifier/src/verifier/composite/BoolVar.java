package verifier.composite;

import java.util.*;

import modes.*;
import verifier.visitor.*;

public class BoolVar extends Var {

	
	
	// uninitialized declaration and verification
	public BoolVar(String name, mode mode) {
		super(name, mode);
	}
	
	// initialized declaration
	public BoolVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
	}
	
	// anonymous variable declaration
	public BoolVar(mode mode) {
		super(mode);
	}
	
	// quantification declaration
	public BoolVar(List<String> list, mode mode) {
		super(list, mode);
		for (int i = 0; i < list.size(); i++) {
			varDeclList.add(new BoolVar(list.get(i), mode));
		}
	}
	
	public void accept(Visitor v) {
		v.visitBoolVar(this);
	}

}
