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

}
