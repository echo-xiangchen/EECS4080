package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class Alternations extends Implementations {
	
	// condition for the if statement
	public Verifier ifStat;
	
	// implementations for the main body
	public List<Verifier> elseifStat;
	
	// implementations for the else statement
	public Verifier elseStat;
	
	public Alternations(Verifier ifStat, List<Verifier> elseifStat, Verifier elseStat) {
		this.ifStat = ifStat;
		this.elseifStat = elseifStat;
		this.elseStat = elseStat;	
	}
	
	public void accept(Visitor v) {
		v.visitAlternations(this);
	}
	
	public Verifier copy() {
		Verifier ifStatCopy = this.ifStat.copy();
		
		List<Verifier> elseifStatCopy = new ArrayList<Verifier>();
		for (int i = 0; i < this.elseifStat.size(); i++) {
			elseifStatCopy.add(this.elseifStat.get(i).copy());
		}
		
		Verifier elseStatCopy;
		if (this.elseStat != null) {
			elseStatCopy = this.elseStat.copy();
		}
		else {
			elseStatCopy = null;
		}
		 
		
		return new Alternations(ifStatCopy, elseifStatCopy, elseStatCopy);
	}
}
