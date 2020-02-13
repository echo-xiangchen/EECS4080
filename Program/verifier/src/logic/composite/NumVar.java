package logic.composite;

import java.util.List;

import modes.mode;

public class NumVar extends Var {

	public NumVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public NumVar(String name, Logic value, mode mode) {
		super(name, value, mode);
			
	}
	
	public NumVar(List<String> list, mode mode) {
		super(list, mode);
	}

}
