package logic.composite;

import java.util.*;

import logic.visitor.*;
import modes.*;

public class IntArrayVar extends ArrayVar {

	// uninitialized declaration
	public IntArrayVar(String name, modes.mode mode) {
		super(name, mode);
		arrayContent = new ArrayList<String>();
	}
	
	// verification
	public IntArrayVar(String name, Logic index, mode mode) {
		super(name, index, mode);
		arrayContent = new ArrayList<String>();
	}
		
		
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

}
