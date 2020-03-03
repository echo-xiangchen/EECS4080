package verifier.visitor;

import org.antlr.v4.runtime.misc.Pair;

import verifier.composite.*;

import java.util.*;

public class VarPrinter implements Visitor {
	
	// Map<name, Pair<type, value>>

	// map that stores all the declared variables
	public static Map<String, Pair<String, String>> allVarMap = new LinkedHashMap<String, Pair<String,String>>();  
		
	// hashmap that only store the unused variables
	public static Map<String, Pair<String, String>> unusedVarMap = new LinkedHashMap<String, Pair<String,String>>();
	
	public void visitBinaryExpr (BinaryExpr b) {
		VarPrinter leftPrinter = new VarPrinter();
		VarPrinter rightPrinter = new VarPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
	}
	
	public void visitUnaryExpr(UnaryExpr u) {
		
		VarPrinter p = new VarPrinter();
		
		u.child.accept(p);
	}
	
	public void visitQuantifier (Quantification q) {
		// accept the list of variables
		for (int i = 0; i < q.quantifyList.size(); i++) {
			VarPrinter c1 = new VarPrinter();
			q.quantifyList.get(i).accept(c1);
			
		}
		// accept the boolean expression
		VarPrinter c2 = new VarPrinter();
		q.expr.accept(c2);
		
	}
	
	
	@Override
	public void visitForall(Forall q) {
		visitQuantifier(q);
	}

	@Override
	public void visitExists(Exists q) {
		visitQuantifier(q);
	}
	
	
	
	
	@Override
	public void visitNot(Negation e) {
		visitUnaryExpr(e);
	}

	@Override
	public void visitAnd(Conjunction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitOr(Disjunction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitImplies(Implication e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitIff(Iff e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitEqual(Equal e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitLessThan(LessThan e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitAddition(Addition e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitDivision(Division e) {
		visitBinaryExpr(e);
	}
	
	
	/* *****************************************************************************************
	 * Methods for normal Var
	 * *****************************************************************************************
	 */

	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. p : BOOLEAN
		
		// and quantification declaration
		// e.g. forall p : BOOLEAN; | not p
		if((v.mode instanceof modes.UninitializedDecl) || (v.mode instanceof modes.QuantifyBool)) {
			// add the mode to both allVarMap and unusedVarMap
			allVarMap.put(v.name, new Pair<String, String>("BOOLEAN", null));
			unusedVarMap.put(v.name, new Pair<String, String>("BOOLEAN", null));
		}
		// verification
		// e.g. verify p => q
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
		}
		// initialized declaration
		// e.g. p : BOOLEAN = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("BOOLEAN", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("BOOLEAN", h.infixOutput));
		}
	}

	
	// int number
	@Override
	public void visitIntVar(IntVar v) {
		// uninitialized declaration
		// e.g. j : INTEGER
	
		// and quantification declaration
		// e.g. forall j: INTEGER; | i > 0
		if((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {	
			allVarMap.put(v.name, new Pair<String, String>("INTEGER", null));
			unusedVarMap.put(v.name, new Pair<String, String>("INTEGER", null));
		}
		// verification
		// e.g. verify p > 0
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
		}
		// initialized declaration
		// e.g. i: INTEGER = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("INTEGER", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("INTEGER", h.infixOutput));
		}
	}
	
	// Real number
	@Override
	public void visitRealVar(RealVar v) {
		// uninitialized declaration
		// e.g. i : REAL
				
		// and quantification declaration
		// e.g. forall i : REAL; @ i > 0
		if((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyReal)) {	
			allVarMap.put(v.name, new Pair<String, String>("REAL", null));
			unusedVarMap.put(v.name, new Pair<String, String>("REAL", null));
		}
		// verification
		// e.g. verify j >= 0
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
		}
		// initialized declaration
		// e.g. i : REAL = 2.1
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
							
			allVarMap.put(v.name, new Pair<String, String>("REAL", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("REAL", h.infixOutput));
		}
	}
	
	/* *****************************************************************************************
	 * Methods for Array Var
	 * *****************************************************************************************
	 */
	
	// boolean array
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]		
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[BOOLEAN] = << p, q, p and q >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
		}
		
	}
	
	// Integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
				
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = << 1, 2, 6, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
		}
	}

	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
				
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[REAL] = << 1.5, 2, 6.0, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", value));
		}
	}
	
	
	
	@Override
	public void visitBoolTrue(BoolTrue c) {
		
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		
	}
	
	@Override
	public void visitIntConst(IntConst c) {

	}

	@Override
	public void visitRealConst(RealConst c) {
		
	}

	
	
	
	
	
	
	
	
	

	@Override
	public void visitNIL(NIL n) {
		// TODO Auto-generated method stub
	}

	
	
	
	@Override
	public void visitAssignment(Assignments a) {
		// delete the mode if it has been used
		if (unusedVarMap.containsKey(a.name)) {
			unusedVarMap.remove(a.name);
		}
		
	}

	@Override
	public void visitMethods(Methods m) {
		if (m.mode instanceof modes.Declaration) {
			// call the varprinter first to accept the parameters
			if (m.parameters != null) {
				for (int i = 0; i < m.parameters.size(); i++) {
					VarPrinter p = new VarPrinter();
					m.parameters.get(i).accept(p);
				}
			
			// call the varprinter first to accept the implementations
			}
			for (int i = 0; i < m.implementations.size(); i++) {
				VarPrinter p = new VarPrinter();
				m.implementations.get(i).accept(p);
			}
		}
		
	}
}
