package logic.composite;

import java.util.ArrayList;
import java.util.List;

import modes.*;

public abstract class Var extends Logic {
	
	public String name;
	
	public Logic value;
	
	public mode mode;
	
	public List<Var> varDeclList;
	
	
	//used for uninitialized declaration and verification
	public Var(String name, mode mode) {
		this.name = name;
		this.mode = mode;
	}
	
	// used for initialized declaration
	public Var(String name, Logic value, mode mode) {
		this.name = name;
		this.value = value;
		this.mode = mode;
	}
	
	// used for quantification declaration
	public Var(List<String> list, mode mode) {
		varDeclList = new ArrayList<Var>();
	}
}
