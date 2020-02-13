package logic.composite;

import java.util.*;

import logic.visitor.*;

public class BoolArrayVar extends ArrayVar {
	
	// uninitialized declaration
	public BoolArrayVar(String name, modes.mode mode) {
		super(name, mode);
		arrayContent = new ArrayList<String>();
	}
	
	// verification
	public BoolArrayVar(String name, Logic index, modes.mode mode) {
		super(name, index, mode);
		arrayContent = new ArrayList<String>();
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
}
