package verifier.composite;

import java.util.ArrayList;
import java.util.List;

import modes.*;

public abstract class Var extends Logic {
	
	// normal variable value (bool, int, real)
	public Verifier value;
	
	// variable mode
	public mode mode;
	
	// array variable value
	public List<Verifier> arrayValue;
	
	// array variable index
	public Verifier index;
	
	
	//used for uninitialized declaration and verification
	public Var(String name, mode mode) {
		this.name = name;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// used for normal variable initialized declaration
	public Var(String name, Verifier verifier, mode mode) {
		this.name = name;
		this.value = verifier;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// used for array variable verification with index value
	public Var(String name, mode mode, Verifier index) {
		this.name = name;
		this.index = index;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// used for quantification declaration
	public Var(List<String> list, mode mode) {
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// used for initialized array declaration
	// List<Logic> contains all the elements of its values
	public Var(String name, List<Verifier> arrayValue, mode mode) {
		this.name = name;
		this.arrayValue = arrayValue;
		this.mode = mode;
		arrayValue = new ArrayList<Verifier>();
	}
}
