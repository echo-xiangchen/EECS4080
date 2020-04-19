package verifier.composite;

import java.util.*;
import verifier.visitor.*;

public class VarLists extends Var {

	public VarLists(List<Verifier> list, modes.mode mode) {
		super(list, mode);
	}
	
	public void accept(Visitor v) {
		v.visitVarLists(this);
	}


	public Verifier copy() {
		List<Verifier> list = new ArrayList<Verifier>();
		for (int i = 0; i < this.varDeclList.size(); i++) {
			list.add(this.varDeclList.get(i).copy());
		}
		
		return new VarLists(list, this.mode);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}

}
