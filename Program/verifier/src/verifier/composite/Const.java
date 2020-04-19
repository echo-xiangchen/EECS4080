package verifier.composite;

public abstract class Const extends Logic{
	
	// indicates if it's used for array count
	public boolean isArray;
	
	// indicates if it's for count, lower, or upper
	public String indicator;
	
	// used for normal constant declaration and verification
	public Const(String name) {
		this.name = name;
	}
	
	// if "isArray" is true, means it's array count
	// if "isArray" is false, means it's normal integer constant
	public Const(String name, String indicator,boolean isArray) {
		this.name = name;
		this.indicator = indicator;
		this.isArray = isArray;
	}
}

