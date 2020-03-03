package verifier.composite;

public class UnaryExpr extends Expr{
	public Verifier child;
	
	public UnaryExpr(Verifier verifier) {
		this.child = verifier;
	}
}
