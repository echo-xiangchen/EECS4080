package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Forall extends Quantification {

	public Forall(List<Verifier> list, Verifier verifier) {
		super(list, verifier);
	}

	public void accept(Visitor v) {
		v.visitForall(this);
	}
}
