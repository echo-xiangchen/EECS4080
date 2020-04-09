package verifier.composite;

import org.antlr.v4.runtime.misc.Pair;

import verifier.visitor.*;

public class InvariantStat extends LoopStats {

	public Pair<String, Verifier> invariant;
	
	public InvariantStat(Pair<String, Verifier> invariant) {
		this.invariant = invariant;
	}
	
	public void accept(Visitor v) {
		v.visitInvariantStat(this);
	}
	
	
	
	@Override
	public Verifier copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
