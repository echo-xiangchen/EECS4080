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
		// TODO Auto-generated method stub
		return null;
	}

}
