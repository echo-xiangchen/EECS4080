package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class Locals extends Keywords {
	
	public List<Verifier> localVars;
	
	public Locals(List<Verifier> vars) {
		this.localVars = vars;
	}
	
	public void accept(Visitor v) {
		v.visitLocals(this);
	}
	
	public Verifier copy() {
		List<Verifier> localVarsCopy = new ArrayList<Verifier>();
		
		for (int i = 0; i < this.localVars.size(); i++) {
			localVarsCopy.add(this.localVars.get(i).copy());
		}
		
		return new Locals(localVarsCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
