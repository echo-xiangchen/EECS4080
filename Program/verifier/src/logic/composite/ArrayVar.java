package logic.composite;

import java.util.*;

import modes.mode;

public class ArrayVar extends Var {
	
	List<String> arrayContent;
	
	// uninitialized declaration
	public ArrayVar(String name, modes.mode mode) {
		super(name, mode);
		arrayContent = new ArrayList<String>();
	}
	
	// verification
	public ArrayVar(String name, Logic index, mode mode) {
		super(name, index, mode);
		arrayContent = new ArrayList<String>();
	}
	
	// used for quantification declaration
	public ArrayVar(List<String> list, mode mode) {
		super(list, mode);
	}
}
