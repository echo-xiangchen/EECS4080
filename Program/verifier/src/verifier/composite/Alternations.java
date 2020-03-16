package verifier.composite;

import java.util.*;

public class Alternations extends Implementations {
	
	// condition for the if statement
	Verifier condition;
	
	// implementations for the main body
	List<Verifier> ifImps;
	
	// implementations for the else statement
	List<Verifier> elseImps;
	
	public Alternations(Verifier condition, List<Verifier> ifImps, List<Verifier> elseImps) {
		this.condition = condition;
		this.ifImps = ifImps;
		this.elseImps = elseImps;	
	}
}
