package verifier.composite;

import types.*;
import verifier.visitor.*;

public class Olds extends Keywords {
	
	public VarType type;
	
	// normal variables
	public Olds(String name, VarType type) {
		this.name = name;
		this.type = type;
	}
	
	// array variables
	public Olds(String name, Verifier index, VarType type) {
		this.name = name;
		this.index = index;
		this.type = type;
	}
	
	//pair variables
	public Olds(String name, String element, VarType type) {
		this.name = name;
		this.element = element;
		this.type = type;
	}
	
	public void accept(Visitor v) {
		v.visitOlds(this);
	}
	
	public Verifier copy() {
		if (this.index != null) {
			return new Olds(this.name, this.index.copy(), this.type);
		}
		else {
			return new Olds(this.name, this.type);
		}
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
