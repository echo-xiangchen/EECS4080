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
		Pair<String, Verifier> invariantCopy = new Pair<String, Verifier>
			(this.invariant.a, this.invariant.b.copy());
		
		return new InvariantStat(invariantCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}

}
