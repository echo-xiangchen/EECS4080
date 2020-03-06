package verifier.composite;

import java.util.List;

import modes.mode;
import verifier.visitor.Visitor;

public class RealVar extends NumVar {
	
	
	// uninitialized declaration and verification
	public RealVar(String name, mode mode) {
		super(name, mode);
	}
	
	// initialized declaration
	public RealVar(String name, Verifier verifier, mode mode) {
		super(name, verifier, mode);
	}
	
	// anonymous variable declaration
	public RealVar(mode mode) {
		super(mode);
	}
	
	// quantification declaration
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
