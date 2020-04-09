package verifier.composite;

import java.util.*;
import org.antlr.v4.runtime.misc.Pair;

public abstract class Contracts extends ProgramVerify{
	
	// single contract
	public Pair<String, Verifier> contract;
	
	public Contracts(Pair<String, Verifier> contract) {
		this.contract = contract;
	}
	
	// list of contract
	public List<Verifier> contracts;
	
	public Contracts(List<Verifier> contracts) {
		this.contracts = contracts;
	}
}
