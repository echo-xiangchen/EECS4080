package verifier.composite;

public abstract class Const extends Logic{
	
	// indicates if it's used for array count
	public boolean isArrayCount;
	
	// indicates if it's for count, lower, or upper
	public String indicator;
	
	//used for uninitialized declaration and verification
	public Const(String name) {
		this.name = name;
	}
	
	// used for array count
	public Const(String name, String indicator,boolean value) {
		this.name = name;
		this.indicator = indicator;
		this.isArrayCount = value;
	}
	
	
	
}

