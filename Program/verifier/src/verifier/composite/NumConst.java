package verifier.composite;

public class NumConst extends Const{
	
	//used for uninitialized declaration and verification
	public NumConst(String name) {
		super(name);
	}
	
	// used for array count
	public NumConst(String name, boolean value) {
		super(name, value);
	}
}
