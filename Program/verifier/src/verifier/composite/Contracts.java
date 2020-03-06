package verifier.composite;

public class Contracts extends ProgramVerify{
	
	Verifier expr;
	
	// contracts with tag
	Contracts(String name, Verifier expr){
		this.name = name;
		this.expr = expr;
	}
	
	// contracts without tag
	Contracts(Verifier expr){
		this.expr = expr;
	}
}
