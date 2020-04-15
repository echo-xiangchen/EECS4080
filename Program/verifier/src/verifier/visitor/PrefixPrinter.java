package verifier.visitor;

// class that used for z3 encoding (prefix version)
import org.antlr.v4.runtime.misc.Pair;
import verifier.composite.*;
import java.util.*;

public class PrefixPrinter implements Visitor{
	
	public String prefixOutput;
	
	// prints the variable for quantification declaration
	public String quantifyVar;
	
	// indicates "forall" or "exists"
	public String quantifyIndicator;
	
	// indicates if contains nested quantification
	public static boolean isNestedQuantifier;
	
	// map that stores all the declared variables
	// name, type, value
	public static Map<String, Pair<String, String>> completeVarMap = new LinkedHashMap<String, Pair<String,String>>();  
	
	// hashmap that only store the necessary variables
	public static Map<String, Pair<String, String>> inclusiveVarMap = new LinkedHashMap<String, Pair<String,String>>();
	
	
	// map that stores the array name and its values
	public static Map<String, List<String>> arrayMap = new LinkedHashMap<String, List<String>>();
	
	// integer that counts how many spaces are needed for the indentation
	public static int indentationInt = 0;
	
	// initial indentation
	public String indentationStr;
	
	/* *****************************************************************************************
	 * TODO methods attributes 
	 * *****************************************************************************************
	 */
	
	// indicates if there is any loop inside the implementation
	public static boolean containsLoop;
	
	// hashmap that stores the old variable caches
	public static Map<String, String> oldVarMap = new LinkedHashMap<String, String>();
	
	// hashmap that stores the assignments
	public static Map<String, String> assignMap = new LinkedHashMap<String, String>();
	
	// map that stores the method name and its precondition, postcondition
	// 0: precondition
	// 1: postcondition
	public static Map<String, List<Verifier>> methodContractMap = new LinkedHashMap<String, List<Verifier>>();
	
	// method local variables
	public static Map<String, Verifier> methodLocalMap = new LinkedHashMap<String, Verifier>();
	
	// method return value
	public static Map<String, Verifier> methodReturnMap = new LinkedHashMap<String, Verifier>();
	// method parameters
	public static Map<String, List<Verifier>> methodParameterMap = new LinkedHashMap<String, List<Verifier>>();
	
	// map that stores the method name and its implementations
	public static Map<String, List<Verifier>> methodImpMap = new LinkedHashMap<String, List<Verifier>>();
	
	// map that stores the five small parts if the method contains any loop
	public static Map<String, List<Verifier>> methodLoopWpMap = new LinkedHashMap<String, List<Verifier>>();
	
	// List that stores the method and its wp
	public static Map<String, Verifier> methodWpMap = new LinkedHashMap<String, Verifier>();
	
	public PrefixPrinter() {
		prefixOutput = "";
		quantifyVar = "";
		quantifyIndicator = "";
		indentationStr = "  ";
	}
	
	/* *****************************************************************************************
	 * TODO helper methods
	 * *****************************************************************************************
	 */
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		PrefixPrinter leftPrinter = new PrefixPrinter();
		PrefixPrinter rightPrinter = new PrefixPrinter();
		
		// check if left child is quantifier
		if (b.left() instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		b.left().accept(leftPrinter);
		isNestedQuantifier = false;
		
		// check if right child is quantifier
		if (b.right() instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		b.right().accept(rightPrinter);
		isNestedQuantifier = false;
		
		
		// add the indentation
		indentationInt++;
		
		for (int i = 0; i < indentationInt; i++) {
			indentationStr = indentationStr + " ";
		}
		prefixOutput = prefixOutput.concat("(" + op + " "
				+ leftPrinter.prefixOutput + " " + rightPrinter.prefixOutput + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		PrefixPrinter p = new PrefixPrinter();
		
		// check if child is quantifier
		if (u.child instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		u.child.accept(p);
		isNestedQuantifier = false;
		
		// add the indentation
		indentationInt++;
		
		for (int i = 0; i < indentationInt; i++) {
			indentationStr = indentationStr + " ";
		}
		prefixOutput = prefixOutput.concat("(" + op + " " + p.prefixOutput + ")");
	}
	
	public void QuantifyPrinter (Quantification q) {
		// recursively accept all the variables in the list first
		
		for (int i = 0; i < q.quantifyList.size(); i++) {
			PrefixPrinter p1 = new PrefixPrinter();
			q.quantifyList.get(i).accept(p1);
			quantifyVar = quantifyVar.concat(p1.quantifyVar);
		}
		//quantifyVar = p1.quantifyVar;
		// then accept the boolexpr next
		PrefixPrinter p2 = new PrefixPrinter();
		q.expr.accept(p2);
		
		// add the indentation
		indentationInt++;
		
		for (int i = 0; i < indentationInt; i++) {
			indentationStr = indentationStr + "  ";
		}
		prefixOutput = "(" + quantifyIndicator + "(" + quantifyVar + ")" + p2.prefixOutput + ")";
		
	}
	
	
	
	@Override
	public void visitForall(Forall q) {
		// if the boolean expr is another exists quantifier
		// set "isNestedQuantifier" to be true
		if (q.expr instanceof verifier.composite.Exists) {
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
				quantifyVar = quantifyVar.concat(p1.quantifyVar);
			}
			// then accept the boolexpr next
			PrefixPrinter p2 = new PrefixPrinter();
			q.expr.accept(p2);
					
			prefixOutput = p2.prefixOutput;
		}
	}

	@Override
	public void visitExists(Exists q) {
		if (q.expr instanceof verifier.composite.Quantification) {
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
	
	/* *****************************************************************************************
	 * TODO normal variable
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitVarLists(VarLists v) {
		if (v.mode instanceof modes.QuantificationList) {
			for (int i = 0; i < v.varDeclList.size(); i++) {
				PrefixPrinter printer = new PrefixPrinter();
				v.varDeclList.get(i).accept(printer);
				quantifyVar = quantifyVar.concat(printer.quantifyVar);
				prefixOutput = prefixOutput.concat(printer.prefixOutput);
			}
		}
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
		// unnamed decl
		// used for method return value - find_max(a : ARRAY[INTEGER]) : INTEGER
		// or pair element - p : PAIR[BOOLEAN; INTEGER]
		else if (v.mode instanceof modes.AnonymousDecl) {
			if (v.name != null) {
				completeVarMap.put(v.name, new Pair<String, String>("Bool", null));
			}
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
		// unnamed decl
		// used for method return value - find_max(a : ARRAY[INTEGER]) : INTEGER
		// or pair element - p : PAIR[BOOLEAN; INTEGER]
		else if (v.mode instanceof modes.AnonymousDecl) {
			if (v.name != null) {
				completeVarMap.put(v.name, new Pair<String, String>("Int", null));
			}
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
		// unnamed decl
		// used for method return value - find_max(a : ARRAY[INTEGER]) : INTEGER
		// or pair element - p : PAIR[BOOLEAN; INTEGER]
		else if (v.mode instanceof modes.AnonymousDecl) {
			if (v.name != null) {
				completeVarMap.put(v.name, new Pair<String, String>("Real", null));
			}
		}
	}
	
	
	/* *****************************************************************************************
	 * TODO array variable
	 * *****************************************************************************************
	 */
	
	
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
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
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
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
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
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
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
	
	/* *****************************************************************************************
	 * TODO Constants
	 * *****************************************************************************************
	 */

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
		if (c.isArray) {
			if (c.indicator.equals("count") || c.indicator.equals("upper")) {
				if (VarPrinter.arrayCount.containsKey(c.name)) {
					prefixOutput = prefixOutput.concat(VarPrinter.arrayCount.get(c.name));
				}
				else {
					prefixOutput = prefixOutput.concat(Integer.toString(Integer.MAX_VALUE));
				}
				
			}
			else if (c.indicator.equals("lower")) {
				prefixOutput = prefixOutput.concat(" 1 ");
			}
		}
		else {
			prefixOutput = prefixOutput.concat(c.name);
		}
	}

	@Override
	public void visitRealConst(RealConst c) {
		prefixOutput = prefixOutput.concat(c.name);
	}
	
	
	
	
	
	/* *****************************************************************************************
	 * TODO Methods
	 * *****************************************************************************************
	 */
	

	@Override
	public void visitMethods(Methods m) {
		// method declaration
		if (m.mode instanceof modes.Declaration) {
			completeVarMap.put(m.name, new Pair<String, String>("Method", null));
			
			
			// add the parameters to the map
			if (!m.parameters.isEmpty()) {
				List<Verifier> parameterlist = new ArrayList<Verifier>();
				for (int i = 0; i < m.parameters.size(); i++) {
					// add each parameters to the list
					parameterlist.add(m.parameters.get(i));
				}
				methodParameterMap.put(m.name, parameterlist);
			}
			
			// add the return value
			if (m.returnValue != null) {
				methodReturnMap.put(m.name, m.returnValue);
			}
			
			// add the local variable
			if (m.locals != null) {
				methodLocalMap.put(m.name, m.locals);
			}
						
			// add the contracts to the map
			List<Verifier> conatraclist = new ArrayList<Verifier>();
			conatraclist.add(m.precondition);
			conatraclist.add(m.postcondition);
			methodContractMap.put(m.name, conatraclist);
			
			
			// add the implementations to the map
			List<Verifier> impList = new ArrayList<Verifier>();
			for (int i = 0; i < m.implementations.size(); i++) {
				// add each implementation to the list
				impList.add(m.implementations.get(i));
			}
			methodImpMap.put(m.name, impList);
		}
		else if (m.mode instanceof modes.Verification) {
			isNestedQuantifier = true;
			
			// call prefixprinter to print each parameters
			if (methodParameterMap.containsKey(m.name)) {
				for (int i = 0; i < methodParameterMap.get(m.name).size(); i++) {
					PrefixPrinter paraPrinter = new PrefixPrinter();
					methodParameterMap.get(m.name).get(i).accept(paraPrinter);
				}
			}
			
			// print the return value
			if (methodReturnMap.containsKey(m.name)) {
				PrefixPrinter returnvaluePrinter = new PrefixPrinter();
				methodReturnMap.get(m.name).accept(returnvaluePrinter);
			}
			
			// print the local variables
			if (methodLocalMap.containsKey(m.name)) {
				PrefixPrinter localPrinter = new PrefixPrinter();
				methodLocalMap.get(m.name).accept(localPrinter);
			}
			
			
			// print the precondition
			PrefixPrinter prefixPrePrinter = new PrefixPrinter();
			methodContractMap.get(m.name).get(0).accept(prefixPrePrinter);
			
			
			// print the implementation
			for (int i = 0; i < methodImpMap.get(m.name).size(); i++) {
				PrefixPrinter impPrinter = new PrefixPrinter();
				methodImpMap.get(m.name).get(i).accept(impPrinter);
			}
			
			// print the postcondition
			PrefixPrinter prefixPostPrinter = new PrefixPrinter();
			methodContractMap.get(m.name).get(1).accept(prefixPostPrinter);
			
			
			/* *****************************************************************************************
			 * TODO do the wp calculation
			 * *****************************************************************************************
			 */
			
			// assign the initial value
			Verifier precondition = null;
			Verifier postcondition = null;
			
			// if there is only one contract in the precondition
			if (((Preconditions) methodContractMap.get(m.name).get(0)).contracts.size() <= 1) {
				precondition = ((ContractExpr)((Preconditions) methodContractMap.get(m.name).get(0)).contracts.get(0)).contract.b.copy();
			}
			else {
				Verifier precondition1 = ((ContractExpr)((Preconditions) methodContractMap.get(m.name).get(0)).contracts.get(0)).contract.b.copy();
				Verifier precondition2 = ((ContractExpr)((Preconditions) methodContractMap.get(m.name).get(0)).contracts.get(1)).contract.b.copy();
				
				precondition = new Conjunction(precondition1, precondition2);
				
				for (int i = 2; i < ((Preconditions) methodContractMap.get(m.name).get(0)).contracts.size(); i++) {
					precondition = new Conjunction(precondition, ((ContractExpr)((Preconditions) methodContractMap.get(m.name).get(0)).contracts.get(i)).contract.b.copy());
				}
			}
			
			// if there is only one contract in the postcondition
			if (((Postconditions) methodContractMap.get(m.name).get(1)).contracts.size() <= 1) {
				postcondition = ((ContractExpr)((Postconditions) methodContractMap.get(m.name).get(1)).contracts.get(0)).contract.b.copy();
			}
			// if there are more than one contracts in the postcondition
			else {
				Verifier postcondition1 = ((ContractExpr)((Postconditions) methodContractMap.get(m.name).get(1)).contracts.get(0)).contract.b.copy();
				Verifier postcondition2 = ((ContractExpr)((Postconditions) methodContractMap.get(m.name).get(1)).contracts.get(1)).contract.b.copy();
				
				postcondition = new Conjunction(postcondition1, postcondition2);
				
				for (int i = 2; i < ((Postconditions) methodContractMap.get(m.name).get(1)).contracts.size(); i++) {
					postcondition = new Conjunction(postcondition, ((ContractExpr)((Postconditions) methodContractMap.get(m.name).get(1)).contracts.get(i)).contract.b.copy());
				}
			}
			
			// print wp before
//			PrefixPrinter beforewpPrinter = new PrefixPrinter();
//			postcondition.accept(beforewpPrinter);
//			
//			System.out.println("before: " + beforewpPrinter.prefixOutput);
//			
			int index = -1;
			// try to test if there is any loop in the implementation
			for (int i = 0; i < methodImpMap.get(m.name).size(); i++) {
				if (methodImpMap.get(m.name).get(i) instanceof Loops) {
					index = i;
				}
			}
			
			//System.out.println("index: " + index);
			
			// index = -1 means there is no loop inside the implementations
			if (index == -1) {
				containsLoop = false;
				// for each implementation, do the calculation in reverse order
				for (int i = methodImpMap.get(m.name).size() - 1; i >= 0; i--) {
					WpCalculator calculator = new WpCalculator(precondition, postcondition);
					methodImpMap.get(m.name).get(i).accept(calculator);
					
					
					//System.out.println(i + ": " + postcondition);
					//System.out.println(i + ": " + calculator.substitutePair);
					
					postcondition = calculator.postcondition.copy();
				}
				
				// add the postcondition to the map
				methodWpMap.put(m.name, postcondition.copy());
				
				// print wp after
				PrefixPrinter afterwpPrinter = new PrefixPrinter();
				postcondition.accept(afterwpPrinter);
				
				// final formula is precondition => wp
				prefixOutput = prefixOutput.concat("(=> " 
						+ prefixPrePrinter.prefixOutput + " " + afterwpPrinter.prefixOutput + ")");	
			}
			// if there is any loop inside the implementation
			else {
				containsLoop = true;
				
				// first calculate the wp after the loop, and let it be the postcondition for the loop
				// if there is nothing after the loop, the postcondition won't change
				for (int i = methodImpMap.get(m.name).size() - 1; i > index; i--) {
					System.out.println("check check");
					WpCalculator calculator = new WpCalculator(precondition, postcondition);
					methodImpMap.get(m.name).get(i).accept(calculator);
					
					postcondition = calculator.postcondition.copy();
				}
				
				// then add all the implementations before the loop to Sinit
				List<Verifier> beforeLoop = new ArrayList<Verifier>();
				for (int i = 0; i < index; i++) {
					beforeLoop.add(methodImpMap.get(m.name).get(i));
				}
				
				// then create new Sinit and then create the new Loop object
				for (int i = 0; i < ((InitImp) ((Loops) methodImpMap.get(m.name).get(index)).initImp).initImp.size(); i++) {
					beforeLoop.add(((InitImp) ((Loops) methodImpMap.get(m.name).get(index)).initImp).initImp.get(i));
				}
				
				// create the new Loop object
				InitImp newInitImp = new InitImp(beforeLoop);
				
				Loops newLoop = new Loops(newInitImp, ((Loops) methodImpMap.get(m.name).get(index)).invariant, 
						((Loops) methodImpMap.get(m.name).get(index)).exitCondition, ((Loops) methodImpMap.get(m.name).get(index)).loopBody, 
						((Loops) methodImpMap.get(m.name).get(index)).variant);
				
				// call the wpcalculator and then store the five predicates into the newLoopList
				WpCalculator newCalculator = new WpCalculator(precondition, postcondition);
				newLoop.accept(newCalculator);
				
				List<Verifier> newLoopList = new ArrayList<Verifier>(newCalculator.loopWpList);
				
				// then add it to the methodLoopMap
				methodLoopWpMap.put(m.name, newLoopList);
				
				for (int i = 0; i < newLoopList.size(); i++) {
					PrefixPrinter loopWpPrinter = new PrefixPrinter();
					newLoopList.get(i).accept(loopWpPrinter);
					
					// add the prefixoutput
					prefixOutput = prefixOutput.concat("(assert (not " + loopWpPrinter.prefixOutput + "))\n");
				}
			}
			
			
			
			
//			System.out.println("after: " + afterwpPrinter.prefixOutput);
			
			
			
			// reset isNestedQuantifier
			isNestedQuantifier = false;
		}
	}

	@Override
	public void visitPreconditions(Preconditions p) {
		// if there is only one contract
		if (p.contracts.size() <= 1) {
			PrefixPrinter p1 = new PrefixPrinter();
			p.contracts.get(0).accept(p1);
			
			prefixOutput = prefixOutput.concat(p1.prefixOutput);
		}
		// if there are more than one contract
		else {
			PrefixPrinter p1 = new PrefixPrinter();
			p.contracts.get(0).accept(p1);
			
			PrefixPrinter p2 = new PrefixPrinter();
			p.contracts.get(1).accept(p2);
			
			prefixOutput = prefixOutput.concat("(and " + p1.prefixOutput 
						+ " " + p2.prefixOutput + ")");
			
			for (int i = 2; i < p.contracts.size(); i++) {
				PrefixPrinter printer = new PrefixPrinter();
				p.contracts.get(i).accept(printer);
				
				prefixOutput = "(and " + prefixOutput + " " + printer.prefixOutput;
			}
		}
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// if there is only one contract
		if (p.contracts.size() <= 1) {
			PrefixPrinter p1 = new PrefixPrinter();
			p.contracts.get(0).accept(p1);
			
			prefixOutput = prefixOutput.concat(p1.prefixOutput);
		}
		// if there are more than one contract
		else {
			PrefixPrinter p1 = new PrefixPrinter();
			p.contracts.get(0).accept(p1);
			
			PrefixPrinter p2 = new PrefixPrinter();
			p.contracts.get(1).accept(p2);
			
			prefixOutput = prefixOutput.concat("(and " + p1.prefixOutput + p2.prefixOutput + ")");
			
			for (int i = 2; i < p.contracts.size(); i++) {
				PrefixPrinter printer = new PrefixPrinter();
				p.contracts.get(i).accept(printer);
				
				prefixOutput = "(and " + prefixOutput + printer.prefixOutput;
			}
		}
	}

	@Override
	public void visitContractExpr(ContractExpr c) {
		PrefixPrinter contractPrinter = new PrefixPrinter();
		c.contract.b.accept(contractPrinter);
		
		prefixOutput = prefixOutput.concat(contractPrinter.prefixOutput);
	}

	
	/* *****************************************************************************************
	 * TODO Implementations
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitAssignment(Assignments a) {
		// add the used variable to the inclusiveVarMap
		if (!inclusiveVarMap.containsKey(a.name)) {
			inclusiveVarMap.put(a.name, new Pair<String, String>(completeVarMap.get(a.name).a, completeVarMap.get(a.name).b));
		}
		// test if it's array element assignment
		if (a.index != null) {
			PrefixPrinter indexPrinter = new PrefixPrinter();
			a.index.accept(indexPrinter);
			
			PrefixPrinter valuePrinter = new PrefixPrinter();
			a.assignValue.accept(valuePrinter);
			
			// for array assignments, need to create a new array in Z3
			if (completeVarMap.get(a.name).b.equals("ValuedArray")) {
				inclusiveVarMap.put("new_" + a.name, new Pair<String, String>
				(completeVarMap.get(a.name).a, "Array"));
			}
			else {
				inclusiveVarMap.put("new_" + a.name, new Pair<String, String>
				(completeVarMap.get(a.name).a, completeVarMap.get(a.name).b));
			}
			
		
			assignMap.put("new_" + a.name, "(store " + a.name + " " + indexPrinter.prefixOutput 
						+ " " + valuePrinter.prefixOutput + " ) ");
		}
		else {
			PrefixPrinter valuePrinter = new PrefixPrinter();
			a.assignValue.accept(valuePrinter);
			
			//assignMap.put(a.name, valuePrinter.prefixOutput);
		}
	}
	
	@Override
	public void visitAlternations(Alternations a) {
		// print the if statement
		PrefixPrinter ifPrinter = new PrefixPrinter();
		a.ifStat.accept(ifPrinter);
		
		// print the elseif statement
		for (int i = 0; i < a.elseifStat.size(); i++) {
			PrefixPrinter elseifPrinter = new PrefixPrinter();
			a.elseifStat.get(i).accept(elseifPrinter);
		}
		
		// print the else statement
		if (a.elseStat != null) {
			PrefixPrinter elsePrinter = new PrefixPrinter();
			a.elseStat.accept(elsePrinter);
		}
	}
	
	@Override
	public void visitIfStats(IfStats s) {
		// print the condition
		PrefixPrinter conditionPrinter = new PrefixPrinter();
		s.condition.accept(conditionPrinter);
		
		// print the implementation in if statement
		for (int i = 0; i < s.ifImps.size(); i++) {
			PrefixPrinter ifimpPrinter = new PrefixPrinter();
			s.ifImps.get(i).accept(ifimpPrinter);
		}
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// print the condition
		PrefixPrinter conditionPrinter = new PrefixPrinter();
		s.condition.accept(conditionPrinter);
		
		// print the implementation in elseif statement
		for (int i = 0; i < s.elseifImps.size(); i++) {
			PrefixPrinter elseifimpPrinter = new PrefixPrinter();
			s.elseifImps.get(i).accept(elseifimpPrinter);
		}
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// print the implementations
		for (int i = 0; i < s.elseImps.size(); i++) {
			PrefixPrinter elseimpPrinter = new PrefixPrinter();
			s.elseImps.get(i).accept(elseimpPrinter);
		}
	}
	
	@Override
	public void visitLoops(Loops l) {
		// print initial implementation
		PrefixPrinter initPrint = new PrefixPrinter();
		l.initImp.accept(initPrint);
		
		
		// print invariant
		PrefixPrinter invariantPrint = new PrefixPrinter();
		l.invariant.accept(invariantPrint);
		
		
		// print exitcondition
		PrefixPrinter exitPrint = new PrefixPrinter();
		l.exitCondition.accept(exitPrint);
		
		
		//print loopbody
		PrefixPrinter loopbodyPrint = new PrefixPrinter();
		l.loopBody.accept(loopbodyPrint);
		
		
		// print variant
		PrefixPrinter variantPrint = new PrefixPrinter();
		l.variant.accept(variantPrint);
	}

	@Override
	public void visitInitImp(InitImp s) {
		// print the implementations
		for (int i = 0; i < s.initImp.size(); i++) {
			PrefixPrinter initImpPrinter = new PrefixPrinter();
			s.initImp.get(i).accept(initImpPrinter);
		}
	}

	@Override
	public void visitInvariantStat(InvariantStat s) {
		// print the expr first
		// Pair<String, Verifier> invariant
		PrefixPrinter exprPrinter = new PrefixPrinter();
		s.invariant.b.accept(exprPrinter);
	}

	@Override
	public void visitExitCondition(ExitCondition s) {
		// print the expr
		PrefixPrinter exitPrinter = new PrefixPrinter();
		s.condition.accept(exitPrinter);
	}

	@Override
	public void visitLoopBody(LoopBody s) {
		// print the implementations
		for (int i = 0; i < s.loopBodyImps.size(); i++) {
			PrefixPrinter initImpPrinter = new PrefixPrinter();
			s.loopBodyImps.get(i).accept(initImpPrinter);
		}
	}

	@Override
	public void visitVariantStat(VariantStat s) {
		// TODO Auto-generated method stub
		
	}

	/* *****************************************************************************************
	 * TODO Keywords
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitLocals(Locals l) {
		// List<Verifier> localVars;
		PrefixPrinter localPrinter = new PrefixPrinter();
		for (int i = 0; i < l.localVars.size(); i++) {
			l.localVars.get(i).accept(localPrinter);
		}
	}
	
	@Override
	public void visitOlds(Olds o) {
		// store the variable cache
		completeVarMap.put("old_" + o.name, new Pair<String, String>
			(completeVarMap.get(o.name).a, completeVarMap.get(o.name).b));
		
		// if it's array using the old keyword
		// if use "ValuedArray", then there will be error in PrettyPrinter because
		// cannot find the old_a in arrayMap
		if (!(completeVarMap.get(o.name).b == null) && completeVarMap.get(o.name).b.equals("ValuedArray")) {
			inclusiveVarMap.put("old_" + o.name, new Pair<String, String>
			(completeVarMap.get(o.name).a, "Array"));
		}
		else {
			inclusiveVarMap.put("old_" + o.name, new Pair<String, String>
			(completeVarMap.get(o.name).a, completeVarMap.get(o.name).b));
		}
		
		
		oldVarMap.put("old_" + o.name, o.name);
		
		if (o.index != null) {
			PrefixPrinter indexPrinter = new PrefixPrinter();
			o.index.accept(indexPrinter);
			
			prefixOutput = prefixOutput.concat("(select " + "old_" 
					+ o.name + " " + indexPrinter.prefixOutput + ")");
		}
		else {
			prefixOutput = prefixOutput.concat("old_" + o.name);
		}
	}
	
	@Override
	public void visitResults(Results r) {
		// TODO Auto-generated method stub
		prefixOutput = prefixOutput.concat("Result");
	}
	
	
	@Override
	public void visitNIL(NIL n) {
		// TODO Auto-generated method stub
		
	}
}
