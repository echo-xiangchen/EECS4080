package verifier.composite;

public abstract class UnaryExpr extends Expr{
	
	public UnaryExpr(Verifier verifier) {
		this.child = verifier;
	}
}
