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
		// TODO Auto-generated method stub
		return null;
	}
}
