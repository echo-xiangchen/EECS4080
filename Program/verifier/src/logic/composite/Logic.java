package logic.composite;

import logic.visitor.*;

public abstract class Logic {
	
	public String name;
	
	public void accept(Visitor v){};
}
