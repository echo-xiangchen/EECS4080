package logic.composite;

import java.util.*;
import logic.visitor.*;

public class Exists extends Quantification {

	public Exists(List<Logic> list, Logic logic) {
		super(list, logic);
	}
	
	public void accept(Visitor v) {
		v.visitExists(this);
	}

}
