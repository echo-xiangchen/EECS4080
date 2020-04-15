package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class InitImp extends LoopStats {

	// list of implementation
	public List<Verifier> initImp;
	
	public InitImp(List<Verifier> initImp) {
		this.initImp = initImp;
	}
	
	public void accept(Visitor v) {
		v.visitInitImp(this);
	}
	
	
	@Override
	public Verifier copy() {
		List<Verifier> initImpCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.initImp.size(); i++) {
			initImpCopy.add(this.initImp.get(i).copy());
		}
		
		return new InitImp(initImpCopy);
	}
}
