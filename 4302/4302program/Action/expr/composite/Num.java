package expr.composite;

import expr.visitor.*;

public class Num extends Expr {

	public Num(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitNum(this);
	}
}
