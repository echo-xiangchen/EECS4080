package verifier.composite;

import java.util.*;


public abstract class BinaryExpr extends Expr{
	
	
	public BinaryExpr(Verifier verifier, Verifier verifier2) {
		children = new ArrayList<Verifier>();
		children.add(verifier);
		children.add(verifier2);
	}
}

