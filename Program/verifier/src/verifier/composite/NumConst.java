package verifier.composite;

public class NumConst extends Const{
	
	//used for uninitialized declaration and verification
	public NumConst(String name) {
		super(name);
	}
	
	// used for array count
	public NumConst(String name, String indicator, boolean value) {
		super(name, indicator, value);
	}
}
