package verifier.composite;

import verifier.visitor.*;

public class Loops extends Implementations {
	
	public Verifier initImp;
	
	public Verifier invariant;
	
	public Verifier exitCondition;
	
	public Verifier loopBody;
	
	public Verifier variant;
	
	public Loops(Verifier initImp, Verifier invariant, Verifier exitCondition,
					Verifier loopBody, Verifier variant) {
		this.initImp = initImp;
		this.invariant = invariant;
		this.exitCondition = exitCondition;
		this.loopBody = loopBody;
		this.variant = variant;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitLoops(this);
	}
	
	
	
	@Override
	public Verifier copy() {
		Verifier initImpCopy = this.initImp.copy();
		
		Verifier invariantCopy = this.invariant.copy();
		
		Verifier exitConditionCopy = this.exitCondition.copy();
		
		Verifier loopBodyCopy = this.loopBody.copy();
		
		Verifier variantCopy = this.variant.copy();
		
		return new Loops(initImpCopy, invariantCopy, exitConditionCopy, 
				loopBodyCopy, variantCopy);
	}

}
