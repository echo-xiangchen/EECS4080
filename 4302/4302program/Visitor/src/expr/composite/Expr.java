package expr.composite;

import java.util.*;

import expr.visitor.*;

public abstract class Expr {
	
	public String name;
	
public List<Expr> children;
	
	// Constructor for binary expr
	public Expr(Expr left, Expr right) {
		children = new ArrayList<Expr>();
		children.add(left);
		children.add(right);
	}
	
	// Constructor for number
	public Expr(String name) {
		this.name = name;
	}
	
	// return left child
	public Expr left() {
		return children.get(0);
	}
	
	// return right child
	public Expr right() {
		return children.get(1);
	}
	
	public void accept(Visitor v){};
}
