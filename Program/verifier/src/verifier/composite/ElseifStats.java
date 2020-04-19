package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class ElseifStats extends AlternationStats {
	
	// condition of else-if statement
	public Verifier condition;
	
	// list of implementations of each else-if statement
	public List<Verifier> elseifImps;
	
	public ElseifStats(Verifier condition, List<Verifier> elseifImps) {
		this.condition = condition;
		this.elseifImps = elseifImps;
	}
	
	public void accept(Visitor v) {
		v.visitElseifStats(this);
	}
	
	@Override
	public Verifier copy() {
		Verifier conditionCopy = this.condition.copy();
		
		List<Verifier> elseifImpsCopy = new ArrayList<Verifier>();
		for (int i = 0; i < this.elseifImps.size(); i++) {
			elseifImpsCopy.add(this.elseifImps.get(i).copy());
		}
		
		return new ElseifStats(conditionCopy, elseifImpsCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
