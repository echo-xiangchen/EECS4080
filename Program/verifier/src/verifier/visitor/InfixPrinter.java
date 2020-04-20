// class to print the formula as infix version

package verifier.visitor;

import java.util.*;
import verifier.composite.*;

public class InfixPrinter implements Visitor{
	
	public String infixOutput;
	public List<String> quantifyVar;
	
	// precondition without tag
	public String preWithoutTag;
	
	// postcondition without tag
	public String postWithoutTag;
	
	// contract string
	public String contracStr;
	
	// map that stores the method preconditions
	public static Map<String, String> preconditions = new LinkedHashMap<String, String>();
	
	// map that stores the method implementations
	public static Map<String, String> imps = new LinkedHashMap<String, String>();
	
	// map that stores the method postconditions
	public static Map<String, String> postconditions = new LinkedHashMap<String, String>();
	
	// map that stores the wps
	public static Map<String, String> wps = new LinkedHashMap<String, String>();
	
	// test if needs pretty print
	public static boolean needPrettyPrint;
	
	public InfixPrinter() {
		preWithoutTag = "";
		postWithoutTag = "";
		contracStr = "";
		infixOutput = "";
		quantifyVar = new ArrayList<String>();
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		InfixPrinter leftPrinter = new InfixPrinter();
		b.left().accept(leftPrinter);
		
		InfixPrinter rightPrinter = new InfixPrinter();
		b.right().accept(rightPrinter);
		infixOutput = infixOutput.concat("(" + leftPrinter.infixOutput + " " + op + " " + rightPrinter.infixOutput + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		InfixPrinter p = new InfixPrinter();
		
		u.child.accept(p);
		
		infixOutput = infixOutput.concat("(" + op + " " + p.infixOutput + ")");
	}
	
	
	public void visitQuantifier (Quantification q) {
		
		for (int i = 0; i < q.quantifyList.size(); i++) {
			InfixPrinter p1 = new InfixPrinter();
			q.quantifyList.get(i).accept(p1);
			quantifyVar.addAll(p1.quantifyVar);
		}
		
		InfixPrinter p2 = new InfixPrinter();
		q.expr.accept(p2);
		
		for (int i = 0; i < quantifyVar.size(); i++) {
			infixOutput = infixOutput.concat(quantifyVar.get(i) + ",");
		}
		
		// remove the last comma
		infixOutput = infixOutput.substring(0, infixOutput.length() - 1);
		
		
		infixOutput = infixOutput.concat(" | " + p2.infixOutput);
	}
	
	
	@Override
	public void visitForall(Forall q) {
		visitQuantifier(q);
		infixOutput = "forall " + infixOutput;
	}

	@Override
	public void visitExists(Exists q) {
		visitQuantifier(q);
		infixOutput = "exists " + infixOutput;
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
				InfixPrinter printer = new InfixPrinter();
				v.varDeclList.get(i).accept(printer);
				quantifyVar.addAll(printer.quantifyVar);
			}
		}
	}

	// boolean variable declaration
	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. p : BOOLEAN
		if(v.mode instanceof modes.UninitializedDecl) {
			infixOutput = infixOutput.concat(v.name + " : BOOLEAN");
		}
		// verification
		// e.g. verify p => q
		else if (v.mode instanceof modes.Verification) {
			infixOutput = infixOutput.concat(v.name);
		}
		// initialized declaration
		// e.g. p : BOOLEAN = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
		}
		// quantification declaration
		// e.g. forall p : BOOLEAN; | not p
		else if (v.mode instanceof modes.QuantifyBool) {
			quantifyVar.add(v.name);
		}
		// unnamed declaration
		else if (v.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("BOOLEAN");
		}
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// uninitialized declaration
		// e.g. j : INTEGER
		if(v.mode instanceof modes.UninitializedDecl) {
			infixOutput = infixOutput.concat(v.name + " : INTEGER");
		}
		// verification
		// e.g. verify j > 2
		else if (v.mode instanceof modes.Verification) {
			infixOutput = infixOutput.concat(v.name);
		}
		// initialized declaration
		// e.g. i : INTEGER = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
		}
		// quantification declaration
		// e.g. forall p : BOOLEAN; @ not p
		else if (v.mode instanceof modes.QuantifyInt) {
			quantifyVar.add(v.name);
		}
		// unnamed declaration
		else if (v.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("INTEGER");
		}
	}
	
	
	// real variable declaration
	@Override
	public void visitRealVar(RealVar v) {
		// uninitialized declaration
		// e.g. j : REAL
		if(v.mode instanceof modes.UninitializedDecl) {
			infixOutput = infixOutput.concat(v.name + " : REAL");
		}
		// verification
		// e.g. verify j > 2
		else if (v.mode instanceof modes.Verification) {
			infixOutput = infixOutput.concat(v.name);
		}
		// initialized declaration
		// e.g. i : REAL = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
		}
		// quantification declaration
		// e.g. forall p : REAL; | p > 0
		else if (v.mode instanceof modes.QuantifyReal) {
			quantifyVar.add(v.name);
		}
		// unnamed declaration
		else if (v.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("REAL");
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
			infixOutput = infixOutput.concat(a.name + " : ARRAY[BOOLEAN]");
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			InfixPrinter h = new InfixPrinter();
			a.index.accept(h);
			
			infixOutput = infixOutput.concat(a.name + "[" + h.infixOutput + "]");
		}
		// initialized declaration
		// e.g. i : ARRAY[BOOLEAN] = <<true, p and q>>
		else if (a.mode instanceof modes.InitializedDecl) {
			
		}
		// unnamed declaration
		else if (a.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("ARRAY[BOOLEAN]");
		}
		// assignment
		else if (a.mode instanceof modes.Assignment) {
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
			infixOutput = infixOutput.concat("  " + a.name + " := " + value);
		}
	}
	
	// integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
		if(a.mode instanceof modes.UninitializedDecl) {
			infixOutput = infixOutput.concat(a.name + " : ARRAY[INTEGER]");
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			InfixPrinter h = new InfixPrinter();
			a.index.accept(h);
			
			infixOutput = infixOutput.concat(a.name + "[" + h.infixOutput + "]");
		}
		// initialized declaration
		// e.g. i : ARRAY[BOOLEAN] = <<true, p and q>>
		else if (a.mode instanceof modes.InitializedDecl) {

		}
		// unnamed declaration
		else if (a.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("ARRAY[INTEGER]");
		}
		// assignment
		else if (a.mode instanceof modes.Assignment) {
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
			infixOutput = infixOutput.concat("  " + a.name + " := " + value);
		}
	}
	
	// real array
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
		if(a.mode instanceof modes.UninitializedDecl) {
			infixOutput = infixOutput.concat(a.name + " : ARRAY[REAL]");
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			InfixPrinter h = new InfixPrinter();
			a.index.accept(h);
			
			infixOutput = infixOutput.concat(a.name + "[" + h.infixOutput + "]");
		}
		// initialized declaration
		// e.g. i : ARRAY[BOOLEAN] = <<true, p and q>>
		else if (a.mode instanceof modes.InitializedDecl) {
			
		}
		// unnamed declaration
		else if (a.mode instanceof modes.AnonymousDecl) {
			infixOutput = infixOutput.concat("ARRAY[REAL]");
		}
		// assignment
		else if (a.mode instanceof modes.Assignment) {
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
			infixOutput = infixOutput.concat("  " + a.name + " := " + value);
		}
	}
	
	/* *****************************************************************************************
	 * TODO Pair variable
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitPair(PairVar p) {
		if (p.mode instanceof modes.UninitializedDecl) {
			InfixPrinter left = new InfixPrinter();
			InfixPrinter right = new InfixPrinter();
			
			p.left().accept(left);
			p.right().accept(right);
			
			infixOutput = infixOutput.concat(p.name + " : PAIR[" + left.infixOutput + " ; " + right.infixOutput + "]"); 
		}
		else if (p.mode instanceof modes.Verification) {
			if (p.element.equals("first")) {
				infixOutput = infixOutput.concat(p.name + ".first");
			}
			else if (p.element.equals("second")) {
				infixOutput = infixOutput.concat(p.name + ".second");
			}
			else {
				infixOutput = infixOutput.concat(p.name + "." + p.element);
			}
		}
		else if (p.mode instanceof modes.InitializedDecl) {
			// print left and right element to remove used variable
			InfixPrinter leftPrinter = new InfixPrinter();
			InfixPrinter rightPrinter = new InfixPrinter();
			
			p.left().accept(leftPrinter);
			p.right().accept(rightPrinter);
			
			// print left and right value to remove used variable
			InfixPrinter leftvaluePrinter = new InfixPrinter();
			InfixPrinter rightvaluePrinter = new InfixPrinter();
			
			p.leftvalue().accept(leftvaluePrinter);
			p.rightvalue().accept(rightvaluePrinter);
		}
		
	}
	
	/* *****************************************************************************************
	 * TODO Constants
	 * *****************************************************************************************
	 */

	@Override
	public void visitBoolTrue(BoolTrue c) {
		infixOutput = infixOutput.concat(c.name);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		infixOutput = infixOutput.concat(c.name);
		
	}

	@Override
	public void visitIntConst(IntConst c) {
		if (c.isArray) {
			if (c.indicator.equals("count")) {
				infixOutput = infixOutput.concat(c.name + ".count");
			}
			else if (c.indicator.equals("lower")) {
				infixOutput = infixOutput.concat(c.name + ".lower");
			}
			else if (c.indicator.equals("upper")) {
				infixOutput = infixOutput.concat(c.name + ".upper");
			}
			
		}
		else {
			infixOutput = infixOutput.concat(c.name);
		}
	}

	@Override
	public void visitRealConst(RealConst c) {
		infixOutput = infixOutput.concat(c.name);
	}

	
	
	/* *****************************************************************************************
	 * TODO Methods
	 * *****************************************************************************************
	 */
	
	

	@Override
	public void visitMethods(Methods m) {
		String parameterStr = "";
		// if the parameters are not empty
		
		// print the parameters
		if (PrefixPrinter.methodParameterMap.containsKey(m.name)) {
			for (int i = 0; i < PrefixPrinter.methodParameterMap.get(m.name).size(); i++) {
				InfixPrinter paraPrinter = new InfixPrinter();
				PrefixPrinter.methodParameterMap.get(m.name).get(i).accept(paraPrinter);
				parameterStr = parameterStr + paraPrinter.infixOutput + ";";
			}
			parameterStr = parameterStr.substring(0, parameterStr.length() - 1);
			
			// if there is return type
			if (PrefixPrinter.methodReturnMap.containsKey(m.name)) {
				InfixPrinter returnPrinter = new InfixPrinter();
				PrefixPrinter.methodReturnMap.get(m.name).accept(returnPrinter);
				
				infixOutput = infixOutput.concat(m.name + "(" + parameterStr + ")" 
						+ " : " + returnPrinter.infixOutput + "\n");
				
			}
			// if return type is empty
			else {
				infixOutput = infixOutput.concat(m.name + "(" + parameterStr + ")"+ "\n");
			}
		}
		// if parameters are empty, simply add the method name
		else {
			if (PrefixPrinter.methodReturnMap.containsKey(m.name)) {
				InfixPrinter returnPrinter = new InfixPrinter();
				PrefixPrinter.methodReturnMap.get(m.name).accept(returnPrinter);
				
				infixOutput = infixOutput.concat(m.name + " : " 
						+ returnPrinter.infixOutput + "\n");
			}
			else {
				infixOutput = infixOutput.concat(m.name + "\n");
			}
		}
		
		// print the local variables
		if (PrefixPrinter.methodLocalMap.containsKey(m.name)) {
			InfixPrinter localPrinter = new InfixPrinter();
			PrefixPrinter.methodLocalMap.get(m.name).accept(localPrinter);
			infixOutput = infixOutput.concat(localPrinter.infixOutput);
		}
		
		// print the precondition
		// precondition in methodMap starts at index 0
		InfixPrinter infixPrePrinter = new InfixPrinter();
		// use the methodMap in prefixprinter to print the precondition
		PrefixPrinter.methodContractMap.get(m.name).get(0).accept(infixPrePrinter);
		infixOutput = infixOutput.concat("require\n");
		infixOutput = infixOutput.concat(infixPrePrinter.infixOutput);
		
		// add the output to the map for printing method output
		preconditions.put(m.name, infixPrePrinter.infixOutput);
		
		
		// print the implementations
		String impStr = "";
		for (int i = 0; i < PrefixPrinter.methodImpMap.get(m.name).size(); i++) {
			InfixPrinter impPrinter = new InfixPrinter();
			PrefixPrinter.methodImpMap.get(m.name).get(i).accept(impPrinter);
			impStr = impStr + impPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat("do\n" + impStr);
		
		// add the output to the map for printing method output
		imps.put(m.name, impStr);
		
		// print the postcondition
		// postcondition in methodMap starts at index 1
		InfixPrinter infixPostPrinter = new InfixPrinter();
		PrefixPrinter.methodContractMap.get(m.name).get(1).accept(infixPostPrinter);
		infixOutput = infixOutput.concat("ensure\n");
		infixOutput = infixOutput.concat(infixPostPrinter.infixOutput);
		
		infixOutput = infixOutput.concat("end\n");
		
		postconditions.put(m.name, infixPostPrinter.infixOutput);
		
		// check if there is any loop inside the method
		if (PrefixPrinter.methodLoopWpMap.containsKey(m.name)) {
			// wpoutput will output the five steps
			List<String> titleList = new ArrayList<String>();
			
			titleList.add("1. Given precondition Q, the initialization step Sinit establishes LI I : {Q} Sinit {I}\n");
			titleList.add("2. At the end of Sbody, if not yet to exit, LI I is maintained : {I and (not B)} Sbody {I}\n");
			titleList.add("3. If ready to exit and LI I maintained, postcondition R is established : I and B => R\n");
			titleList.add("4. Given LI I, and not yet to exit, Sbody maintains LV V as non-negative : {I and (not B)} Sbody {V >= 0}\n");
			titleList.add("5. Given LI I, and not yet to exit, Sbody decrements LV V : {I and (not B)} Sbody {V < V0}\n");
			
			String wpOutput = "";
			for (int i = 0; i < PrefixPrinter.methodLoopWpMap.get(m.name).size(); i++) {
				InfixPrinter loopinfixPrinter = new InfixPrinter();
				PrefixPrinter.methodLoopWpMap.get(m.name).get(i).accept(loopinfixPrinter);
				wpOutput = wpOutput + titleList.get(i) + "  " + loopinfixPrinter.infixOutput + "\n\n";
			}
			wps.put(m.name, wpOutput);
		}
		// if there is no loop inside the method
		else {
			InfixPrinter wpPrinter = new InfixPrinter();
			PrefixPrinter.methodWpMap.get(m.name).accept(wpPrinter);
			wps.put(m.name, "  " + wpPrinter.infixOutput + "\n");
		}
		
		
//		/* *****************************************************************************************
//		 * TODO do the wp calculation
//		 * *****************************************************************************************
//		 */
//		
//		// assign the initial value
//		Verifier precondition = null;
//		Verifier postcondition = null;
//		
//		// if there is only one contract in the precondition
//		if (((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.size() <= 1) {
//			precondition = ((ContractExpr)((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.get(0)).contract.b.copy();
//		}
//		else {
//			Verifier precondition1 = ((ContractExpr)((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.get(0)).contract.b.copy();
//			Verifier precondition2 = ((ContractExpr)((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.get(1)).contract.b.copy();
//			
//			precondition = new Conjunction(precondition1, precondition2);
//			
//			for (int i = 2; i < ((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.size(); i++) {
//				precondition = new Conjunction(precondition, ((ContractExpr)((Preconditions) PrefixPrinter.methodContractMap.get(m.name).get(0)).contracts.get(i)).contract.b.copy());
//			}
//		}
//		
//		// if there is only one contract in the postcondition
//		if (((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.size() <= 1) {
//			postcondition = ((ContractExpr)((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.get(0)).contract.b.copy();
//		}
//		// if there are more than one contracts in the postcondition
//		else {
//			Verifier postcondition1 = ((ContractExpr)((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.get(0)).contract.b.copy();
//			Verifier postcondition2 = ((ContractExpr)((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.get(1)).contract.b.copy();
//			
//			postcondition = new Conjunction(postcondition1, postcondition2);
//			
//			for (int i = 2; i < ((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.size(); i++) {
//				postcondition = new Conjunction(postcondition, ((ContractExpr)((Postconditions) PrefixPrinter.methodContractMap.get(m.name).get(1)).contracts.get(i)).contract.b.copy());
//			}
//		}
//		
//		// for each implementation, do the calculation in reverse order
//		for (int i = PrefixPrinter.methodImpMap.get(m.name).size() - 1; i >= 0; i--) {
//			WpCalculator calculator = new WpCalculator(precondition, postcondition);
//			PrefixPrinter.methodImpMap.get(m.name).get(i).accept(calculator);
//			
//			
//			
//			// if there is any array assignments in the middle, calculator.prefixWp will be blank
////			if (!calculator.prefixWp.isBlank()) {
////				prefixWp = calculator.prefixWp;
////				infixWp = calculator.infixWp;
////			}
//			postcondition = calculator.postcondition;
//		}
//		
//		// print wp after
//		InfixPrinter afterwpPrinter = new InfixPrinter();
//		postcondition.accept(afterwpPrinter);
//		//System.out.println("after: " + afterwpPrinter.infixOutput);
//		
//		// final infix version of wp
//		wps.put(m.name, afterwpPrinter.infixOutput + "\n");
	}
	
	
	// 
	@Override
	public void visitPreconditions(Preconditions p) {
		// public List<Verifier> contracts;
		
		for (int i = 0; i < p.contracts.size(); i++) {
			InfixPrinter prePrinter = new InfixPrinter();
			p.contracts.get(i).accept(prePrinter);
			
			infixOutput = infixOutput.concat("   " + prePrinter.infixOutput);
		}
		
		// generate the precondition without tag output
		// if there is only one contract
		if (p.contracts.size() <= 1) {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			preWithoutTag = preWithoutTag.concat(p1.contracStr);
		}
		// if there are more than one contract
		else {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			InfixPrinter p2 = new InfixPrinter();
			p.contracts.get(1).accept(p2);
			
			preWithoutTag = preWithoutTag.concat("(" + p1.contracStr + " and " + p2.contracStr + ")");
			
			for (int i = 2; i < p.contracts.size(); i++) {
				InfixPrinter printer = new InfixPrinter();
				p.contracts.get(i).accept(printer);
				
				preWithoutTag = "(" + preWithoutTag + " and " + printer.contracStr;
			}
		}
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// public List<Verifier> contracts;
		for (int i = 0; i < p.contracts.size(); i++) {
			InfixPrinter prePrinter = new InfixPrinter();
			p.contracts.get(i).accept(prePrinter);
			
			infixOutput = infixOutput.concat("   " + prePrinter.infixOutput);
		}
		
		// generate the postcondition without tag output
		// if there is only one contract
		if (p.contracts.size() <= 1) {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			postWithoutTag = postWithoutTag.concat(p1.contracStr);
		}
		// if there are more than one contract
		else {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			InfixPrinter p2 = new InfixPrinter();
			p.contracts.get(1).accept(p2);
			
			postWithoutTag = postWithoutTag.concat("(" + p1.contracStr + " and " + p2.contracStr + ")");
			
			for (int i = 2; i < p.contracts.size(); i++) {
				InfixPrinter printer = new InfixPrinter();
				p.contracts.get(i).accept(printer);
				
				postWithoutTag = "(" + postWithoutTag + " and " + printer.contracStr;
			}
		}
	}

	@Override
	public void visitContractExpr(ContractExpr c) {
		InfixPrinter contractPrinter = new InfixPrinter();
		c.contract.b.accept(contractPrinter);
		// check if tag is empty
		if (c.contract.a != null) {
			infixOutput = infixOutput.concat(c.contract.a + " : " + contractPrinter.infixOutput + "\n");
		}
		else {
			infixOutput = infixOutput.concat(contractPrinter.infixOutput + "\n");
		}
		
		// set up the output for wp
		contracStr = contractPrinter.infixOutput;
	}
	
	
	/* *****************************************************************************************
	 * TODO Implementations
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitAssignment(Assignments a) {
		if (a.index != null) {
			InfixPrinter assignedPrinter = new InfixPrinter();
			a.assignValue.accept(assignedPrinter);
			
			InfixPrinter indexPrinter = new InfixPrinter();
			a.index.accept(indexPrinter);
			
			infixOutput = infixOutput.concat("  " + a.name + "[" + indexPrinter.infixOutput
					+ "]" + " := " + assignedPrinter.infixOutput + ";");
		}
		else {
			InfixPrinter assignedPrinter = new InfixPrinter();
			a.assignValue.accept(assignedPrinter);
			infixOutput = infixOutput.concat("  " + a.name + " := " + assignedPrinter.infixOutput + ";");
		}
	}
	
	// if-else statement
	@Override
	public void visitAlternations(Alternations a) {
		// print the if statement
		InfixPrinter ifPrinter = new InfixPrinter();
		a.ifStat.accept(ifPrinter);
		infixOutput = infixOutput.concat(ifPrinter.infixOutput);
		
		// print the elseif statement
		String elseifImpStr = "";
		for (int i = 0; i < a.elseifStat.size(); i++) {
			InfixPrinter elseifPrinter = new InfixPrinter();
			a.elseifStat.get(i).accept(elseifPrinter);
			elseifImpStr = elseifImpStr + elseifPrinter.infixOutput;
		}
		infixOutput = infixOutput.concat(elseifImpStr);
		
		// print the else statement and its implementation
		if (a.elseStat != null) {
			InfixPrinter elsePrinter = new InfixPrinter();
			a.elseStat.accept(elsePrinter);
			
			infixOutput = infixOutput.concat(elsePrinter.infixOutput + "end");
		}
		else {
			infixOutput = infixOutput.concat("end");
		}
	}
	
	@Override
	public void visitIfStats(IfStats s) {
		// print the condition of if statement
		InfixPrinter conditionPrinter = new InfixPrinter();
		s.condition.accept(conditionPrinter);
		
		infixOutput = infixOutput.concat("if " + conditionPrinter.infixOutput + " then\n");
		
		// print the implementation in if statement
		String ifImpStr = "";
		for (int i = 0; i < s.ifImps.size(); i++) {
			InfixPrinter ifimpPrinter = new InfixPrinter();
			s.ifImps.get(i).accept(ifimpPrinter);
			ifImpStr = ifImpStr + ifimpPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat(ifImpStr);
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// print the condition of elseif statement
		InfixPrinter conditionPrinter = new InfixPrinter();
		s.condition.accept(conditionPrinter);
		
		infixOutput = infixOutput.concat("elseif " + conditionPrinter.infixOutput + " then\n");
		
		// print the implementation in elseif statement
		String elseifImpStr = "";
		for (int i = 0; i < s.elseifImps.size(); i++) {
			InfixPrinter elseifimpPrinter = new InfixPrinter();
			s.elseifImps.get(i).accept(elseifimpPrinter);
			elseifImpStr = elseifImpStr + elseifimpPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat(elseifImpStr);
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// add the keyword
		infixOutput = infixOutput.concat("else\n");
		
		// print the implementations
		String elseImpStr = "";
		for (int i = 0; i < s.elseImps.size(); i++) {
			InfixPrinter elseimpPrinter = new InfixPrinter();
			s.elseImps.get(i).accept(elseimpPrinter);
			elseImpStr = elseImpStr + elseimpPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat(elseImpStr);
	}
	
	@Override
	public void visitLoops(Loops l) {
		// print the if statement
		InfixPrinter initPrinter = new InfixPrinter();
		l.initImp.accept(initPrinter);
		infixOutput = infixOutput.concat(initPrinter.infixOutput);
		
		// print invariant
		InfixPrinter invariantPrinter = new InfixPrinter();
		l.invariant.accept(invariantPrinter);
		infixOutput = infixOutput.concat(invariantPrinter.infixOutput);
		
		// print exitcondition
		InfixPrinter exitPrinter = new InfixPrinter();
		l.exitCondition.accept(exitPrinter);
		infixOutput = infixOutput.concat(exitPrinter.infixOutput);
		
		//print loopbody
		InfixPrinter loopbodyPrinter = new InfixPrinter();
		l.loopBody.accept(loopbodyPrinter);
		infixOutput = infixOutput.concat(loopbodyPrinter.infixOutput);
		
		// print variant
		InfixPrinter variantPrinter = new InfixPrinter();
		l.variant.accept(variantPrinter);
		infixOutput = infixOutput.concat(variantPrinter.infixOutput + "end");
	}

	@Override
	public void visitInitImp(InitImp s) {
		// print the implementations
		String initImpStr = "";
		for (int i = 0; i < s.initImp.size(); i++) {
			InfixPrinter initimpPrinter = new InfixPrinter();
			s.initImp.get(i).accept(initimpPrinter);
			initImpStr = initImpStr + initimpPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat("from\n" + initImpStr);
	}

	@Override
	public void visitInvariantStat(InvariantStat s) {
		InfixPrinter invariantPrint = new InfixPrinter();
		s.invariant.b.accept(invariantPrint);
		// check if tag is empty
		if (s.invariant.a != null) {
			infixOutput = infixOutput.concat("invariant\n  " + s.invariant.a + " : " + invariantPrint.infixOutput + "\n");
		}
		else {
			infixOutput = infixOutput.concat("invariant\n  " + invariantPrint.infixOutput + "\n");
		}
	}

	@Override
	public void visitExitCondition(ExitCondition s) {
		InfixPrinter exitPrinter = new InfixPrinter();
		s.condition.accept(exitPrinter);
		infixOutput = infixOutput.concat("until\n  " + exitPrinter.infixOutput + "\n");
		
	}

	@Override
	public void visitLoopBody(LoopBody s) {
		// print the implementations
		String loopbodyStr = "";
		for (int i = 0; i < s.loopBodyImps.size(); i++) {
			InfixPrinter loopbodyPrinter = new InfixPrinter();
			s.loopBodyImps.get(i).accept(loopbodyPrinter);
			loopbodyStr = loopbodyStr + loopbodyPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat("loop\n" + loopbodyStr);
	}

	@Override
	public void visitVariantStat(VariantStat s) {
		InfixPrinter variantPrint = new InfixPrinter();
		s.variant.b.accept(variantPrint);
		// check if tag is empty
		if (s.variant.a != null) {
			infixOutput = infixOutput.concat("variant\n  " + s.variant.a + " : " + variantPrint.infixOutput + "\n");
		}
		else {
			infixOutput = infixOutput.concat("variant\n  " + variantPrint.infixOutput + "\n");
		}
	}
	
	/* *****************************************************************************************
	 * TODO Keywords
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitOlds(Olds o) {
		// if it's array 
		if (o.index != null) {
			InfixPrinter indexPrinter = new InfixPrinter();
			o.index.accept(indexPrinter);
			
			infixOutput = infixOutput.concat("old " + o.name + "[" + indexPrinter.infixOutput + "]");
		}
		// it it's normal variable
		else {
			infixOutput = infixOutput.concat("old " + o.name);
		}
		
	}

	@Override
	public void visitLocals(Locals l) {
		infixOutput = infixOutput.concat("local" + "\n");
		
		for (int i = 0; i < l.localVars.size(); i++) {
			InfixPrinter localPrinter = new InfixPrinter();
			l.localVars.get(i).accept(localPrinter);
			
			infixOutput = infixOutput.concat("   " + localPrinter.infixOutput + "\n");
		}
	}

	@Override
	public void visitResults(Results r) {
		infixOutput = infixOutput.concat("Result");
		
	}
	
	
	
	@Override
	public void visitUnknownVar(UnknownVar n) {
		infixOutput = infixOutput.concat(n.name);
	}

	
}
