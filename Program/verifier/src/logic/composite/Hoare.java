package logic.composite;

import java.util.*;

public class Hoare extends Logic {
	public List<Logic> hoareTriple;
	
	public Logic precondition() {
		return hoareTriple.get(0);
	}
	
	public Logic invariant() {
		return hoareTriple.get(1);
	}
	
	public Logic postcondition() {
		return hoareTriple.get(2);
	}
	
	public Hoare(Logic l1, Logic l2, Logic l3) {
		hoareTriple = new ArrayList<Logic>();
		hoareTriple.add(l1);
		hoareTriple.add(l2);
		hoareTriple.add(l3);
	}
}
