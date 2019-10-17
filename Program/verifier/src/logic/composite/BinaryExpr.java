package logic.composite;

import java.util.*;


public class BinaryExpr extends Expr{
	public List<Logic> children;
	
	public Logic left() {
		return children.get(0);
	};
	public Logic right() {
		return children.get(1);
	};
	
	public BinaryExpr(Logic left, Logic right) {
		children = new ArrayList<Logic>();
		children.add(left);
		children.add(right);
	}
}

