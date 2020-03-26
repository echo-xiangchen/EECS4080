package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class Alternations extends Implementations {
	
	// condition for the if statement
	public Verifier condition;
	
	// implementations for the main body
	public List<Verifier> ifImps;
	
	// implementations for the else statement
	public List<Verifier> elseImps;
	
	public Alternations(Verifier condition, List<Verifier> ifImps, List<Verifier> elseImps) {
		this.condition = condition;
		this.ifImps = ifImps;
		this.elseImps = elseImps;	
	}
	
	public void accept(Visitor v) {
		v.visitAlternations(this);
	}
}
