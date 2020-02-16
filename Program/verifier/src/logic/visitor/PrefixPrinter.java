package logic.visitor;

// class that used for z3 encoding (prefix version)
import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import logic.composite.*;

public class PrefixPrinter implements Visitor{
	
	public String prefixOutput;
	
	public String quantifyVar;
	
	// map that stores all the declared variables
	public static Map<String, Pair<String, String>> completeVarMap = new HashMap<String, Pair<String,String>>();  
	
	// hashmap that only store the necessary variables
	public static Map<String, Pair<String, String>> inclusiveVarMap = new HashMap<String, Pair<String,String>>();
	
	// map that stores the array name and its values
	
	public PrefixPrinter() {
		prefixOutput = "";
		quantifyVar = "";
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		PrefixPrinter leftPrinter = new PrefixPrinter();
		PrefixPrinter rightPrinter = new PrefixPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
		prefixOutput = prefixOutput.concat("(" + op + " " + leftPrinter.prefixOutput + " " + rightPrinter.prefixOutput + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		PrefixPrinter p = new PrefixPrinter();
		
		u.child.accept(p);
		
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
		
		prefixOutput = "(" + quantifyVar + ")(not " + p2.prefixOutput + ")";
		
	}
	
	
	
	@Override
	public void visitForall(Forall q) {
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
		//System.out.println(prefixOutput);
	}

	@Override
	public void visitExists(Exists q) {
		QuantifyPrinter(q);
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
		// mode 0: uninitialized declaration
		// e.g. p : BOOLEAN
		if(v.mode instanceof modes.UninitializedDecl) {
			completeVarMap.put(v.name, new Pair<String, String>("Bool", null));
		}
		// mode 1: verification
		// e.g. verify p => q
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
			
		}
		// mode 2: initialized declaration
		// e.g. p : BOOLEAN = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Bool", h.prefixOutput));
		}
		// mode 3: quantification declaration
		// e.g. forall p : BOOLEAN; @ not p
		else if (v.mode instanceof modes.QuantifyBool) {
			completeVarMap.put(v.name, new Pair<String, String>("Bool", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Bool)");
		}
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. j : INTEGER
		if(v.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(v.name, new Pair<String, String>("Int", null));
		}
		// mode 1: verification
		// e.g. verify i > 0
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
		}
		// mode 2: initialized declaration
		// e.g. i : INT = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Int", h.prefixOutput));
		}
		// mode 3: quantification declaration
		// e.g. forall i : INT; @ i > 0
		else if (v.mode instanceof modes.QuantifyInt) {
			completeVarMap.put(v.name, new Pair<String, String>("Int", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Int)");
		}
	}
	
	// real variable declaration
	@Override
	public void visitRealVar(RealVar v) {
		// mode 0: uninitialized declaration
		// e.g. j : REAL
		if(v.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(v.name, new Pair<String, String>("Real", null));
		}
		// mode 1: verification
		// e.g. verify i > 0
		else if (v.mode instanceof modes.Verification) {
			prefixOutput = prefixOutput.concat(v.name);
			
			if (!inclusiveVarMap.containsKey(v.name)) {
				inclusiveVarMap.put(v.name, new Pair<String, String>(completeVarMap.get(v.name).a, completeVarMap.get(v.name).b));
			}
		}
		// mode 2: initialized declaration
		// e.g. i : REAL = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			completeVarMap.put(v.name, new Pair<String, String>("Real", h.prefixOutput));
		}
		// mode 3: quantification declaration
		// e.g. forall i : REAL; @ i > 0
		else if (v.mode instanceof modes.QuantifyInt) {
			completeVarMap.put(v.name, new Pair<String, String>("Real", "Quantification"));
			quantifyVar = quantifyVar.concat("(" + v.name + " " + "Real)");
		}
	}
	
	// boolean array variable
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// mode 0: uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Bool", "Array"));
		}
		// mode 1: verification
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
	}
	
	// integer array variable
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// mode 0: uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Int", "Array"));
		}
		// mode 1: verification
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
	}
	
	// real array variable
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// mode 0: uninitialized declaration
		// e.g. a : ARRAY[REAL]
		if(a.mode instanceof modes.UninitializedDecl) {
			
			completeVarMap.put(a.name, new Pair<String, String>("Real", "Array"));
		}
		// mode 1: verification
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
