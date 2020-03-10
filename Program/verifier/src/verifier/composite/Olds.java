package verifier.composite;

import types.*;
import verifier.visitor.*;

public class Olds extends ProgramVerify {
	
	public VarType type;
	
	public Verifier index;
	
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
	
	public void accept(Visitor v) {
		v.visitOlds(this);
	}
}
