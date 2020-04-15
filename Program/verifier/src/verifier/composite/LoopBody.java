package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class LoopBody extends LoopStats {

	public List<Verifier> loopBodyImps;
	
	public LoopBody(List<Verifier> loopBodyImps) {
		this.loopBodyImps = loopBodyImps;
	}
	
	public void accept(Visitor v) {
		v.visitLoopBody(this);
	}
	
	@Override
	public Verifier copy() {
		List<Verifier> loopBodyImpsCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.loopBodyImps.size(); i++) {
			loopBodyImpsCopy.add(this.loopBodyImps.get(i).copy());
		}
		
		return new LoopBody(loopBodyImpsCopy);
	}

}
