package verifier.composite;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NameList;

import modes.*;

public abstract class Var extends Logic {
	
	// normal variable value (bool, int, real)
	public Verifier value;
	
	// array variable value and pair values
	public List<Verifier> elementValue;
	
	
	// anonymous variable declaration
	public Var(mode mode) {
		this.mode = mode;
	}
	
	// uninitialized declaration and verification
	public Var(String name, mode mode) {
		this.name = name;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		elementValue = new ArrayList<Verifier>();
	}
	
	// initialized normal variable declaration
	// and normal variable assignment
	public Var(String name, Verifier verifier, mode mode) {
		this.name = name;
		this.value = verifier;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		elementValue = new ArrayList<Verifier>();
	}
	
	// array variable verification with index value
	public Var(String name, mode mode, Verifier index) {
		this.name = name;
		this.index = index;
		this.mode = mode;
		varDeclList = new ArrayList<Verifier>();
		elementValue = new ArrayList<Verifier>();
	}
	
	// quantification declaration
	public Var(List<Verifier> list, mode mode) {
		varDeclList = new ArrayList<Verifier>();
		elementValue = new ArrayList<Verifier>();
		
		for (int i = 0; i < list.size(); i++) {
			varDeclList.add(list.get(i));
		}
		
		this.mode = mode;
	}
	
	// initialized array declaration
	// array and pair assignment
	// List<Verifier> contains all the elements of its values
	public Var(String name, List<Verifier> elementValue, mode mode) {
		this.name = name;
		this.elementValue = elementValue;
		this.mode = mode;
	}
	
	
	// uninitialized pair declaration
	// with named left and right element
	public Var(String name, Verifier left, Verifier right, mode mode) {
		this.name = name;
		this.children = new ArrayList<Verifier>();
		this.mode = mode;
	}
	
	// initialized pair declaration
	public Var(String name, Verifier left, Verifier right, List<Verifier> elementValue, mode mode) {
		this.name = name;
		this.children = new ArrayList<Verifier>();
		this.elementValue = new ArrayList<Verifier>();
		this.mode = mode;
	}
	
	// pair verification
	public Var(String name, String element, mode mode) {
		this.name = name;
		this.element = element;
		this.mode = mode;
	}
}
