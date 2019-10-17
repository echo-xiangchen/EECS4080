package logic.composite;

import modes.*;

public abstract class Var extends Logic {
	
	public String name;
	
	public Logic value;
	
	public Variable variable;
	
	//used for uninitialized declaration and verification
	public Var(String name, Variable variable) {
		this.name = name;
		this.variable = variable;
	}
	
	// used for initialized declaration
	public Var(String name, Logic value, Variable variable) {
		this.name = name;
		this.value = value;
		this.variable = variable;
	}
}
