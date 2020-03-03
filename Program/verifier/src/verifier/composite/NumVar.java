package verifier.composite;

import java.util.List;

import modes.mode;

public class NumVar extends Var {

	public NumVar(String name, modes.mode mode) {
		super(name, mode);
	}
	
	public NumVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
			
	}
	
	public NumVar(List<String> list, mode mode) {
		super(list, mode);
	}

}
