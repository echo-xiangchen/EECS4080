package logic.composite;

import java.util.List;

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
	
	// initialized declaration
	public IntArrayVar(String name, List<Logic> arrayValue, mode mode) {
		super(name, arrayValue, mode);
	}
		
		
	public void accept(Visitor v) {
		v.visitIntArrayVar(this);
	}

}
