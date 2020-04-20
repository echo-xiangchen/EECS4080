package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Preconditions extends Contracts {

	// add the contracts to the list
	public Preconditions(List<Verifier> contracts) {
		super(contracts);
	}
	
	
	public void accept(Visitor v) {
		v.visitPreconditions(this);
	}
	
	public Verifier copy() {
		List<Verifier> contractsCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.contracts.size(); i++) {
			contractsCopy.add(this.contracts.get(i).copy());
		}
		
		return new Preconditions(contractsCopy);
	}


	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}

}
