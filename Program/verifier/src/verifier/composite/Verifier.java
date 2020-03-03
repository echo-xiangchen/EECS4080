package verifier.composite;

import java.util.*;

import verifier.visitor.*;

public class Verifier {
	
	public String name;
	
	public List<Verifier> varDeclList;
	
	public void accept(Visitor v){};
}
