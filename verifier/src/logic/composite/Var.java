package logic.composite;

import modes.*;

public class Var extends Logic {
	
public String name;
	
	public Logic value;
	
	public Mode mode;
	
	//used for uninitialized declaration and verification
	public Var(String name, Mode mode) {
		this.name = name;
		this.mode = mode;
	}
	
	// used for initialized declaration
	public Var(String name, Logic value, Mode mode) {
		this.name = name;
		this.value = value;
		this.mode = mode;
	}
}
