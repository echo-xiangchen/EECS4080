package logic.composite;

import java.util.*;
import logic.visitor.*;

public class Forall extends Quantification {

	public Forall(List<Logic> list, Logic logic) {
		super(list, logic);
	}

	public void accept(Visitor v) {
		v.visitForall(this);
	}
}
