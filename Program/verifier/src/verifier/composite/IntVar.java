package verifier.composite;

import java.util.*;

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
	
	// quantification declaration
	public IntVar(List<String> list, mode mode) {
		super(list, mode);
		for (int i = 0; i < list.size(); i++) {
			varDeclList.add(new IntVar(list.get(i), mode));
		}
	}
	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}

}
