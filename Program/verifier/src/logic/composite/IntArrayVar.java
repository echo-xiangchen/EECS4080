package logic.composite;

import java.util.*;

import logic.visitor.*;
import modes.*;

public class IntArrayVar extends ArrayVar {

	// uninitialized declaration
	public IntArrayVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	// verification
	public IntArrayVar(String name, mode mode, Logic index) {
		super(name, mode, index);
	}
		
		
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

}
