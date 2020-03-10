package verifier.composite;

public abstract class Const extends Logic{
	
	// indicates if it's used for array count
	public boolean isArrayCount;
	
	//used for uninitialized declaration and verification
	public Const(String name) {
		this.name = name;
	}
	
	// used for array count
	public Const(String name, boolean value) {
		this.name = name;
		this.isArrayCount = value;
	}
	
	
	
}

