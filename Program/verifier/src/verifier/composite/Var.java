package verifier.composite;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NameList;

import modes.*;

public abstract class Var extends Logic {
	
	// normal variable value (bool, int, real)
	public Verifier value;
	
	// variable mode
	public mode mode;
	
	// array variable value
	public List<Verifier> arrayValue;
	
	// element name for pair verification
	public String element;
	
	
	// anonymous variable declaration
	public Var(mode mode) {
		this.mode = mode;
	}
	
	// uninitialized declaration and verification
	public Var(String name, mode mode) {
		this.name = name;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// initialized normal variable declaration
	// and normal variable assignment
	public Var(String name, Verifier verifier, mode mode) {
		this.name = name;
		this.value = verifier;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// array variable verification with index value
	public Var(String name, mode mode, Verifier index) {
		this.name = name;
		this.index = index;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
	}
	
	// quantification declaration
	public Var(List<Verifier> list, mode mode) {
		varDeclList = new ArrayList<Verifier>();
		arrayValue = new ArrayList<Verifier>();
		
		for (int i = 0; i < list.size(); i++) {
			varDeclList.add(list.get(i));
		}
		
		this.mode = mode;
	}
	
	// initialized array declaration
	// and array assignment
	// List<Verifier> contains all the elements of its values
	public Var(String name, List<Verifier> arrayValue, mode mode) {
		this.name = name;
		this.arrayValue = arrayValue;
		this.mode = mode;
		arrayValue = new ArrayList<Verifier>();
	}
	
	
	// uninitialized pair declaration
	// with named left and right element
	public Var(String name, Verifier left, Verifier right, mode mode) {
		this.name = name;
		children = new ArrayList<Verifier>();
		children.add(left);
		children.add(right);
		this.mode = mode;
	}
	
	// initialized pair declaration
	public Var(String name, Verifier left, Verifier right, Verifier leftElement, Verifier rightElement, mode mode) {
		this.name = name;
		children = new ArrayList<Verifier>();
		children.add(left);
		children.add(right);
		pairValues = new ArrayList<Verifier>();
		pairValues.add(leftElement);
		pairValues.add(rightElement);
		this.mode = mode;
	}
	
	// pair verification
	public Var(String name, String element, mode mode) {
		this.name = name;
		this.element = element;
		this.mode = mode;
	}
}
