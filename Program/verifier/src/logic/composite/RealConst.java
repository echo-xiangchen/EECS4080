package logic.composite;

import logic.visitor.Visitor;

public class RealConst extends NumConst {

	public RealConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitRealConst(this);
	}

}
