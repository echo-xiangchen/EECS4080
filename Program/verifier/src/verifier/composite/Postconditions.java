package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Postconditions extends Contracts {
	

	// add the contracts to the list
	public Postconditions(List<Verifier> contracts) {
		super(contracts);
	}
	
	public void accept(Visitor v) {
		v.visitPostconditions(this);
	}
	
	public Verifier copy() {
		List<Verifier> contractsCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.contracts.size(); i++) {
			contractsCopy.add(this.contracts.get(i).copy());
		}
		
		return new Postconditions(contractsCopy);
	}

}
