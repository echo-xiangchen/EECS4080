package verifier.composite;

import org.antlr.v4.runtime.misc.Pair;

import verifier.visitor.Visitor;

public class ContractExpr extends Contracts {
	
	public ContractExpr(Pair<String, Verifier> contract) {
		super(contract);
	}
	
	public void accept(Visitor v) {
		v.visitContractExpr(this);
	}
	
	public Verifier copy() {
		Pair<String, Verifier> contractCopy = 
				new Pair<String, Verifier>(this.contract.a, this.contract.b.copy());
		return new ContractExpr(contractCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}
}
