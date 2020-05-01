package verifier.composite;

import java.util.*;


public abstract class BinaryExpr extends Expr{
	
	
	public BinaryExpr(Verifier verifier1, Verifier verifier2) {
		children = new ArrayList<Verifier>();
		children.add(verifier1);
		children.add(verifier2);
	}
}

