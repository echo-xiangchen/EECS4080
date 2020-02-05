package logic.composite;

import java.util.*;

import logic.visitor.*;
import modes.*;

public class IntVar extends Var {

	// mode 0: uninitialized declaration
	// mode 1: verification
	// mode 2: initialized declaration
	// mode 3: quantification declaration
	
	// mode 0 and 1
	public IntVar(String name, mode mode) {
		super(name, mode);
	}
	
	// mode 2
	public IntVar(String name, Logic value, mode mode) {
		super(name, value, mode);
			
	}
	
	// mode 3 
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
