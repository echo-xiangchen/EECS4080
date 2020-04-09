package verifier.composite;

import verifier.visitor.*;

public class ExitCondition extends LoopStats {

	public Verifier condition;
	
	public ExitCondition(Verifier condition) {
		this.condition = condition;
	}
	
	public void accept(Visitor v) {
		v.visitExitCondition(this);
	}
	
	@Override
	public Verifier copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
