package verifier.composite;

import org.antlr.v4.runtime.misc.Pair;

import verifier.visitor.*;

public class VariantStat extends LoopStats {
	
	public Pair<String, Verifier> variant;
	
	public VariantStat(Pair<String, Verifier> variant) {
		this.variant = variant;
	}
	
	public void accept(Visitor v) {
		v.visitVariantStat(this);
	}
	
	@Override
	public Verifier copy() {
		Pair<String, Verifier> variantCopy = new Pair<String, Verifier>
		(this.variant.a, this.variant.b.copy());
	
	return new VariantStat(variantCopy);
	}

	@Override
	public boolean isEqual(Verifier v) {
		// TODO Auto-generated method stub
		return false;
	}

}
