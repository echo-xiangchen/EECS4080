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
		// TODO Auto-generated method stub
		return null;
	}
}
