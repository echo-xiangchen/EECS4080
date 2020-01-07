package logic.composite;

import java.util.*;

public class Quantification extends Logic {
	public List<Var> quantifyList;
	
	public Logic expr;
	
	public Quantification(List<Var> list, Logic logic) {
		quantifyList = new ArrayList<Var>();
		
		for (int i = 0; i < list.size(); i++) {
			quantifyList.addAll(list.get(i).varDeclList);
		}
		
		this.expr = logic;
	}
}
