package verifier.composite;

import java.util.*;

public class Quantification extends Logic {
	public List<Verifier> quantifyList;
	
	public Verifier expr;
	
	public Quantification(List<Verifier> list, Verifier verifier) {
		quantifyList = new ArrayList<Verifier>();
		
		for (int i = 0; i < list.size(); i++) {
			quantifyList.addAll(list.get(i).varDeclList);
		}
		
		this.expr = verifier;
	}
}
