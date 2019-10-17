package logic.composite;

public abstract class Const extends Logic{
	public String name;
	
	//used for uninitialized declaration and verification
	public Const(String name) {
		this.name = name;
	}
	
}

