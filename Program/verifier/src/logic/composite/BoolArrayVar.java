package logic.composite;

import java.util.List;

import logic.visitor.*;
import modes.*;

public class BoolArrayVar extends ArrayVar {
	
	// uninitialized declaration
	public BoolArrayVar(String name, mode mode) {
		super(name, mode);
	}
	
	// verification
	public BoolArrayVar(String name, mode mode, Logic index) {
		super(name, mode, index);
	}
	
	// initialized declaration
	public BoolArrayVar(String name, List<Logic> arrayValue, mode mode) {
		super(name, arrayValue, mode);
	}
	
	public void accept(Visitor v) {
		v.visitBoolArrayVar(this);
	}
}
