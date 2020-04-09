package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public abstract class Verifier {
	
	// variable name
	public String name;
	
	// array variable index
	public Verifier index;
	
	// attribute for binary expr
	public List<Verifier> children;
	
	public Verifier left() {
		return children.get(0);
	}
	public Verifier right() {
		return children.get(1);
	}
	
	// attribute for unary expr
	public Verifier child;
	
	// list that stores the quantification variables
	public List<Verifier> varDeclList;
	
	// method for deep copy
	public abstract Verifier copy();
	
	public void accept(Visitor v){};
}
