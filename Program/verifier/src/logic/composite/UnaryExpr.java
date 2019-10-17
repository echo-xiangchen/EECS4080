package logic.composite;

public class UnaryExpr extends Expr{
	public Logic child;
	
	public UnaryExpr(Logic u) {
		this.child = u;
	}
}
