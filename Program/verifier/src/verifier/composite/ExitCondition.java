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
		Verifier conditionCopy = this.condition.copy();
		
		return new ExitCondition(conditionCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}

}
