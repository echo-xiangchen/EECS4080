package verifier.composite;

import java.util.*;


public class BinaryExpr extends Expr{
	public List<Verifier> children;
	
	public Verifier left() {
		return children.get(0);
	};
	public Verifier right() {
		return children.get(1);
	};
	
	public BinaryExpr(Verifier verifier, Verifier verifier2) {
		children = new ArrayList<Verifier>();
		children.add(verifier);
		children.add(verifier2);
	}
}

