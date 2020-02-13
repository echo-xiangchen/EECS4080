package logic.composite;

import java.util.*;

public class Quantification extends Logic {
	public List<Logic> quantifyList;
	
	public Logic expr;
	
	public Quantification(List<Logic> list, Logic logic) {
		quantifyList = new ArrayList<Logic>();
		
		for (int i = 0; i < list.size(); i++) {
			quantifyList.addAll(list.get(i).varDeclList);
		}
		
		this.expr = logic;
	}
}
