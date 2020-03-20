// class to print the formula as infix version

package verifier.visitor;

import java.util.*;
import verifier.composite.*;

public class InfixPrinter implements Visitor{
	
	public String infixOutput;
	public List<String> quantifyVar;
	public String wpStr;
	
	// map that stores the method preconditions
	public static Map<String, String> preconditions = new LinkedHashMap<String, String>();
	
	// map that stores the method implementations
	public static Map<String, String> imps = new LinkedHashMap<String, String>();
	
	// map that stores the method postconditions
	public static Map<String, String> postconditions = new LinkedHashMap<String, String>();
	
	// map that stores the wps
	public static Map<String, String> wps = new LinkedHashMap<String, String>();
	
	public InfixPrinter() {
		wpStr = "";
		infixOutput = "";
		quantifyVar = new ArrayList<String>();
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		InfixPrinter leftPrinter = new InfixPrinter();
		InfixPrinter rightPrinter = new InfixPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
		infixOutput = infixOutput.concat(" ( " + leftPrinter.infixOutput + " " + op + " " + rightPrinter.infixOutput + " ) ");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		InfixPrinter p = new InfixPrinter();
		
		u.child.accept(p);
		
		infixOutput = infixOutput.concat(" ( " + op + " " + p.infixOutput + " ) ");
	}
	
	
	public void visitQuantifier (Quantification q) {
		InfixPrinter p1 = new InfixPrinter();
		for (int i = 0; i < q.quantifyList.size(); i++) {
			q.quantifyList.get(i).accept(p1);
		}
		quantifyVar.addAll(p1.quantifyVar);
		
		InfixPrinter p2 = new InfixPrinter();
		q.expr.accept(p2);
		
		for (int i = 0; i < quantifyVar.size(); i++) {
			infixOutput = infixOutput.concat(quantifyVar.get(i) + ",");
		}
		infixOutput = infixOutput.substring(0, infixOutput.length() - 1);
		infixOutput = infixOutput.concat(";" + p2.infixOutput);
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
	
	
	
	
	
	

	@Override
	public void visitNIL(NIL n) {
		infixOutput = infixOutput.concat(n.name);
	}

	
	
	
	
	

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
				
				infixOutput = infixOutput.concat(m.name + "()" +  " : " 
						+ returnPrinter.infixOutput + "\n");
			}
			else {
				infixOutput = infixOutput.concat(m.name + "()"+ "\n");
			}
		}
		
		
		// print the precondition
		// precondition in methodMap starts at index 0
		InfixPrinter prePrinter = new InfixPrinter();
		// use the methodMap in prefixprinter to print the precondition
		PrefixPrinter.methodContractMap.get(m.name).get(0).accept(prePrinter);
		infixOutput = infixOutput.concat("require\n");
		infixOutput = infixOutput.concat(prePrinter.infixOutput);
		
		// add the output to the map for printing method output
		preconditions.put(m.name, prePrinter.infixOutput);
		
		
		// print the local variables
		if (PrefixPrinter.methodLocalMap.containsKey(m.name)) {
			InfixPrinter localPrinter = new InfixPrinter();
			PrefixPrinter.methodLocalMap.get(m.name).accept(localPrinter);
			infixOutput = infixOutput.concat(localPrinter.infixOutput);
		}
		
		
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
		PrefixPrinter postPrinter = new PrefixPrinter();
		PrefixPrinter.methodContractMap.get(m.name).get(1).accept(postPrinter);
		
		InfixPrinter infixPostPrinter = new InfixPrinter();
		PrefixPrinter.methodContractMap.get(m.name).get(1).accept(infixPostPrinter);
		infixOutput = infixOutput.concat("ensure\n");
		infixOutput = infixOutput.concat(infixPostPrinter.infixOutput);
		
		infixOutput = infixOutput.concat("end\n");
		
		postconditions.put(m.name, infixPostPrinter.infixOutput);
		
		
		// do the wp calculation
		
		// assign the initial value
		String prefixWp = postPrinter.prefixOutput;
		String infixWp = infixPostPrinter.wpStr;
		
		// for each implementation, do the calculation in reverse order
		for (int i = PrefixPrinter.methodImpMap.get(m.name).size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(prefixWp, infixWp);
			PrefixPrinter.methodImpMap.get(m.name).get(i).accept(calculator);
			
			System.out.println(i + ": " + infixWp);
			System.out.println(i + ": " + calculator.counteregSubstituteMap);
			
			prefixWp = calculator.prefixWp;
			infixWp = calculator.infixWp;
		}
		
		// print the wps
		// do the substitution for postcondition
		// for assignments, tranverse the substitution map in reverse order
//		ListIterator<Map.Entry<String,String>> j = new ArrayList<Map.Entry<String,String>>
//			(WpCalculator.counteregSubstituteMap.entrySet()).listIterator(WpCalculator.counteregSubstituteMap.size());
//		
//		while(j.hasPrevious()) {
//			Map.Entry<String, String> entry= j.previous();
//			postPrinter.wpStr = postPrinter.wpStr.replaceAll(entry.getKey(), entry.getValue());
//		}
		wps.put(m.name, "   " + infixWp + "\n");
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
		
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// public List<Verifier> contracts;
		for (int i = 0; i < p.contracts.size(); i++) {
			InfixPrinter prePrinter = new InfixPrinter();
			p.contracts.get(i).accept(prePrinter);
			
			infixOutput = infixOutput.concat("   " + prePrinter.infixOutput);
		}
		
		// generate the wp output
		// if there is only one contract
		if (p.contracts.size() <= 1) {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			wpStr = wpStr.concat(p1.wpStr);
		}
		// if there are more than one contract
		else {
			InfixPrinter p1 = new InfixPrinter();
			p.contracts.get(0).accept(p1);
			
			InfixPrinter p2 = new InfixPrinter();
			p.contracts.get(1).accept(p2);
			
			wpStr = wpStr.concat("(" + p1.wpStr + " and " + p2.wpStr + ")");
			
			for (int i = 2; i < p.contracts.size(); i++) {
				InfixPrinter printer = new InfixPrinter();
				p.contracts.get(i).accept(printer);
				
				wpStr = "(" + wpStr + " and " + printer.wpStr;
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
		wpStr = contractPrinter.infixOutput;
	}
	
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
		// TODO Auto-generated method stub
		infixOutput = infixOutput.concat("Result");
		
	}

}
