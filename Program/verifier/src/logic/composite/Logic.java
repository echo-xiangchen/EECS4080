package logic.composite;

import java.util.*;

import logic.visitor.*;

public abstract class Logic {
	
	public String name;
	
	public List<Logic> varDeclList;
	
	public void accept(Visitor v){};
}
