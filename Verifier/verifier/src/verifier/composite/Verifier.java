package verifier.composite;

import java.util.*;
import modes.*;
import verifier.visitor.*;

public abstract class Verifier {
	
	// variable name
	public String name;
	
	// variable mode
	public mode mode;
	
	// variable type
	// for z3 input
	// e.g. Bool, Int, Real
	public String typeIndicator;
	
	// variable type output
	// for console output
	// e.g. BOOLEAN, INTEGER, REAL
	public String typeStr;
	
	
	// element name for pair verification
	// first, second, or element name
	public String element;
	
	
	
	
	// array variable index
	public Verifier index;
	
	// attribute for binary expr and pair
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
	
	// method for comparasion
	public abstract boolean isEqual(Verifier v);
	
	
	public void accept(Visitor v){};
}
