package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class Locals extends ProgramVerify {
	
	public List<Verifier> localVars;
	
	public Locals(List<Verifier> vars) {
		this.localVars = vars;
	}
	
	public void accept(Visitor v) {
		v.visitLocals(this);
	}
}
