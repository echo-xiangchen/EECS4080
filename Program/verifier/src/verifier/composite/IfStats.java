package verifier.composite;

import java.util.*;

import verifier.visitor.Visitor;

public class IfStats extends AlternationStats {
	
	public Verifier condition;
	
	public List<Verifier> ifImps;
	
	public IfStats(Verifier condition, List<Verifier> ifImps) {
		this.condition = condition;
		this.ifImps = ifImps;
	}
	
	public void accept(Visitor v) {
		v.visitIfStats(this);
	}
	
	public Verifier copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
