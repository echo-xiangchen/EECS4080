package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class ElseStats extends AlternationStats {
	
	public List<Verifier> elseImps;
	
	public ElseStats(List<Verifier> elseImps) {
		this.elseImps = elseImps;
	}
	
	public void accept(Visitor v) {
		v.visitElseStats(this);
	}
	
	public Verifier copy() {
		List<Verifier> elseImpsCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.elseImps.size(); i++) {
			elseImpsCopy.add(this.elseImps.get(i).copy());
		}
		
		return new ElseStats(elseImpsCopy);
	}
}
