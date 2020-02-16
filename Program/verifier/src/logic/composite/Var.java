package logic.composite;

import java.util.ArrayList;
import java.util.List;

import modes.*;

public abstract class Var extends Logic {
	
	// normal variable value (bool, int, real)
	public Logic value;
	
	// variable mode
	public mode mode;
	
	// array variable value
	public List<Logic> arrayValue;
	
	// array variable index
	public Logic index;
	
	
	//used for uninitialized declaration and verification
	public Var(String name, mode mode) {
		this.name = name;
		this.mode = mode;
		varDeclList = new ArrayList<Logic>();
		arrayValue = new ArrayList<Logic>();
	}
	
	// used for normal variable initialized declaration
	public Var(String name, Logic value, mode mode) {
		this.name = name;
		this.value = value;
		this.mode = mode;
		varDeclList = new ArrayList<Logic>();
		arrayValue = new ArrayList<Logic>();
	}
	
	// used for array variable verification with index value
	public Var(String name, mode mode, Logic index) {
		this.name = name;
		this.index = index;
		this.mode = mode;
		varDeclList = new ArrayList<Logic>();
		arrayValue = new ArrayList<Logic>();
	}
	
	// used for quantification declaration
	public Var(List<String> list, mode mode) {
		varDeclList = new ArrayList<Logic>();
		arrayValue = new ArrayList<Logic>();
	}
	
	// used for initialized array declaration
	// List<Logic> contains all the elements of its values
	public Var(String name, List<Logic> arrayValue, mode mode) {
		this.name = name;
		this.arrayValue = arrayValue;
		this.mode = mode;
		arrayValue = new ArrayList<Logic>();
	}
}
