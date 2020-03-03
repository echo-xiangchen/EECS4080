package verifier.composite;

import java.util.List;

import modes.mode;
import verifier.visitor.Visitor;

public class RealVar extends NumVar {
	
	// mode 0: uninitialized declaration
	// mode 1: verification
	// mode 2: initialized declaration
	// mode 3: quantification declaration
	
	// mode 0 and 1 and 3
	public RealVar(String name, mode mode) {
		super(name, mode);
	}
	
	// mode 2
	public RealVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
	}
	
	// mode 3 
	public RealVar(List<String> list, mode mode) {
		super(list, mode);
		for (int i = 0; i < list.size(); i++) {
			varDeclList.add(new RealVar(list.get(i), mode));
		}
	}
	
	public void accept(Visitor v) {
		v.visitRealVar(this);
	}
}
