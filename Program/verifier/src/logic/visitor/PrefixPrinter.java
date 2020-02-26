package logic.visitor;

// class that used for z3 encoding (prefix version)
import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import logic.composite.*;

public class PrefixPrinter implements Visitor{
	
	public String prefixOutput;
	
	// prints the variable for quantification declaration
	public String quantifyVar;
	
	// indicates "forall" or "exists"
	public String quantifyIndicator;
	
	// indicates if contains nested quantification
	public static boolean isNestedQuantifier;
	
	// map that stores all the declared variables
	public static Map<String, Pair<String, String>> completeVarMap = new LinkedHashMap<String, Pair<String,String>>();  
	
	// hashmap that only store the necessary variables
	public static Map<String, Pair<String, String>> inclusiveVarMap = new LinkedHashMap<String, Pair<String,String>>();
	
	// map that stores the array name and its values
	public static Map<String, List<String>> arrayMap = new LinkedHashMap<String, List<String>>();
	
	public PrefixPrinter() {
		prefixOutput = "";
		quantifyVar = "";
		quantifyIndicator = "";
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		PrefixPrinter leftPrinter = new PrefixPrinter();
		PrefixPrinter rightPrinter = new PrefixPrinter();
		
		// check if left child is quantifier
		if (b.left() instanceof logic.composite.Quantification) {
			isNestedQuantifier = true;
		}
		b.left().accept(leftPrinter);
		isNestedQuantifier = false;
		
		// check if right child is quantifier
		if (b.right() instanceof logic.composite.Quantification) {
			isNestedQuantifier = true;
		}
		b.right().accept(rightPrinter);
		isNestedQuantifier = false;
		
		prefixOutput = prefixOutput.concat("(" + op + " " 
				+ leftPrinter.prefixOutput + " " + rightPrinter.prefixOutput + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		PrefixPrinter p = new PrefixPrinter();
		
		// check if child is quantifier
		if (u.child instanceof logic.composite.Quantification) {
			isNestedQuantifier = true;
		}
		u.child.accept(p);
		isNestedQuantifier = false;
		
		prefixOutput = prefixOutput.concat("(" + op + " " + p.prefixOutput + ")");
	}
	
	public void QuantifyPrinter (Quantification q) {
		// recursively accept all the variables in the list first
		PrefixPrinter p1 = new PrefixPrinter();
		for (int i = 0; i < q.quantifyList.size(); i++) {
			q.quantifyList.get(i).accept(p1);
		}
		quantifyVar = p1.quantifyVar;
		// then accept the boolexpr next
		PrefixPrinter p2 = new PrefixPrinter();
		q.expr.accept(p2);
		
		prefixOutput = "(" + quantifyIndicator + "(" + quantifyVar + ")" + p2.prefixOutput + ")";
		
	}
	
	
	
	@Override
	public void visitForall(Forall q) {
		// if the boolean expr is another exists quantifier
		// set "isNestedQuantifier" to be true
		if (q.expr instanceof logic.composite.Exists) {
			isNestedQuantifier = true;
		}
		
		
		// check if "isNestedQuantifier" is true
		// check to see if "isNestedQuantifier" in PrettyPrinter is true as well
		if (isNestedQuantifier || PrettyPrinter.isNestedQuantifier) {
			quantifyIndicator = "forall";
			QuantifyPrinter(q);
			// after calling the method, set "isNestedQuantifier" to false again
			isNestedQuantifier = false;
		}
		// if it is stand alone quantifier
		else {
			// recursively accept all the variables in the list first
			PrefixPrinter p1 = new PrefixPrinter();
			for (int i = 0; i < q.quantifyList.size(); i++) {
				q.quantifyList.get(i).accept(p1);
			}
			quantifyVar = p1.quantifyVar;
			// then accept the boolexpr next
			PrefixPrinter p2 = new PrefixPrinter();
			q.expr.accept(p2);
					
			prefixOutput = p2.prefixOutput;
		}
	}

	@Override
	public void visitExists(Exists q) {
		if (q.expr instanceof logic.composite.Quantification) {
			isNestedQuantifier = true;
		}
		
		quantifyIndicator = "exists";
		QuantifyPrinter(q);
		isNestedQuantifier = false;
		//System.out.println(prefixOutput);
	}
	
	
	
	@Override
	public void visitNot(Negation e) {
			visitUnaryExpr(e, "not");
	}
	
	@Override
	public void visitAnd(Conjunction e) {
			visitBinaryExpr(e, "and");
	}

	@Override
	public void visitOr(Disjunction e) {
		visitBinaryExpr(e, "or");
	}

	@Override
	public void visitImplies(Implication e) {
		visitBinaryExpr(e, "=>");
	}
	

	@Override
	public void visitIff(Iff e) {
		visitBinaryExpr(e, "=");
	}
	
	@Override
	public void visitEqual(Equal e) {
		visitBinaryExpr(e, "=");
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		visitBinaryExpr(e, ">");
	}

	@Override
	public void visitLessThan(LessThan e) {
		visitBinaryExpr(e, "<");
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		visitBinaryExpr(e, ">=");
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		visitBinaryExpr(e, "<=");
	}

	@Override
	public void visitAddition(Addition e) {
		visitBinaryExpr(e, "+");
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		visitBinaryExpr(e, "-");
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		visitBinaryExpr(e, "*");
	}

	@Override
	public void visitDivision(Division e) {
		visitBinaryExpr(e, "/");
	}

	// boolean variable declaration
	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. p : BOOLEAN
		if(v.mode instanceof modes.UninitializedDecl) {
			completeVarMap.put(v.name, new Pair<String, String>("Bool", null));
		}
		// verification
		// e.g. verify p => q
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (TypeChecker.varMap.get(v.name).b != null) {
				PrefixPrinter p = new PrefixPrinter();
				TypeChecker.varMap.get(v.name).b.accept(p);
			}
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
			
		}
		// initialized declaration
		// e.g. p : BOOLEAN = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Bool", h.prefixOutput));
		}
		// quantification declaration
		// e.g. forall p : BOOLEAN; @ not p
		else if (v.mode instanceof modes.QuantifyBool) {
			completeVarMap.put(v.name, new Pair<String, String>("Bool", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Bool)");
		}
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// uninitialized declaration
		// e.g. j : INTEGER
		if(v.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(v.name, new Pair<String, String>("Int", null));
		}
		// verification
		// e.g. verify i > 0
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
		}
		// initialized declaration
		// e.g. i : INT = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Int", h.prefixOutput));
		}
		// quantification declaration
		// e.g. forall i : INT; @ i > 0
		else if (v.mode instanceof modes.QuantifyInt) {
			completeVarMap.put(v.name, new Pair<String, String>("Int", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Int)");
		}
	}
	
	// real variable declaration
	@Override
	public void visitRealVar(RealVar v) {
		// uninitialized declaration
		// e.g. j : REAL
		if(v.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(v.name, new Pair<String, String>("Real", null));
		}
		// verification
		// e.g. verify i > 0
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
		}
		// initialized declaration
		// e.g. i : REAL = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Real", h.prefixOutput));
		}
		// quantification declaration
		// e.g. forall i : REAL; @ i > 0
		else if (v.mode instanceof modes.QuantifyReal) {
			completeVarMap.put(v.name, new Pair<String, String>("Real", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Real)");
		}
	}
	
	// boolean array variable
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Bool", "Array"));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			PrefixPrinter p = new PrefixPrinter();
			a.index.accept(p);
			// (select a 1)
			prefixOutput = prefixOutput.concat("(select " + a.name + " " + p.prefixOutput + ")");
			
			if (!inclusiveVarMap.containsKey(a.name)) {
				inclusiveVarMap.put(a.name, new Pair<String, String>(completeVarMap.get(a.name).a, completeVarMap.get(a.name).b));
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[BOOLEAN] = <<p, q>>
		else if (a.mode instanceof modes.InitializedDecl) {
			completeVarMap.put(a.name, new Pair<String, String>("Bool", "ValuedArray"));
			List<String> value = new ArrayList<String>();
			for (int i = 0; i < a.arrayValue.size(); i++) {
				PrefixPrinter p = new PrefixPrinter();
				a.arrayValue.get(i).accept(p);
				value.add(p.prefixOutput);
			}
			arrayMap.put(a.name, value);
		}
		
	}
	
	// integer array variable
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Int", "Array"));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			PrefixPrinter p = new PrefixPrinter();
			a.index.accept(p);
			// (select a 1)
			prefixOutput = prefixOutput.concat("(select " + a.name + " " + p.prefixOutput + ")");
			
			if (!inclusiveVarMap.containsKey(a.name)) {
				inclusiveVarMap.put(a.name, new Pair<String, String>(completeVarMap.get(a.name).a, completeVarMap.get(a.name).b));
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = <<1, 2, 9>>
		else if (a.mode instanceof modes.InitializedDecl) {
			completeVarMap.put(a.name, new Pair<String, String>("Int", "ValuedArray"));
			List<String> value = new ArrayList<String>();
			for (int i = 0; i < a.arrayValue.size(); i++) {
				PrefixPrinter p = new PrefixPrinter();
				a.arrayValue.get(i).accept(p);
				value.add(p.prefixOutput);
			}
			arrayMap.put(a.name, value);
		}
	}
	
	// real array variable
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Real", "Array"));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			PrefixPrinter p = new PrefixPrinter();
			a.index.accept(p);
			// (select a 1)
			prefixOutput = prefixOutput.concat("(select " + a.name + " " + p.prefixOutput + ")");
			
			if (!inclusiveVarMap.containsKey(a.name)) {
				inclusiveVarMap.put(a.name, new Pair<String, String>(completeVarMap.get(a.name).a, completeVarMap.get(a.name).b));
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = <<1, 2, 9>>
		else if (a.mode instanceof modes.InitializedDecl) {
			completeVarMap.put(a.name, new Pair<String, String>("Real", "ValuedArray"));
			List<String> value = new ArrayList<String>();
			for (int i = 0; i < a.arrayValue.size(); i++) {
				PrefixPrinter p = new PrefixPrinter();
				a.arrayValue.get(i).accept(p);
				value.add(p.prefixOutput);
			}
			arrayMap.put(a.name, value);
		}
	}


	@Override
	public void visitBoolTrue(BoolTrue c) {
		prefixOutput = prefixOutput.concat(c.name);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		prefixOutput = prefixOutput.concat(c.name);	
	}

	@Override
	public void visitIntConst(IntConst c) {
		prefixOutput = prefixOutput.concat(c.name);
	}

	@Override
	public void visitRealConst(RealConst c) {
		prefixOutput = prefixOutput.concat(c.name);
	}
	
	
	


	@Override
	public void visitNIL(NIL n) {
		// TODO Auto-generated method stub
		
	}
}
