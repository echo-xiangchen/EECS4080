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
		// TODO Auto-generated method stub
		return null;
	}

}
