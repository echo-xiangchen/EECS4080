package logic.visitor;

import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import java.util.Map.*;
import logic.composite.*;


public class PrettyPrinter implements Visitor {
	
	public String z3output;
	// indicates "forall" or "exists"
	public String quantifyIndicator;
	// infix version of the formula
	public static List<String> infixFormula = new ArrayList<String>();
	// msg for unused variables
	public static List<String> warningMsg = new ArrayList<String>();
	
	public static List<ArrayList<String>> usedVarList = new ArrayList<ArrayList<String>>();
	
	public PrettyPrinter() {
		z3output = "";
		quantifyIndicator = "";
	}
	
	// version that include all the variable declared
	public void printExpr (Logic e) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		e.accept(p);
		
		// use the InfixPrinter to return the output
		InfixPrinter p2 = new InfixPrinter();
		e.accept(p2);
		
		// clone the inclusiveVarMap to usedVarList
		// for "-v" version, printing the used variable for each formula
		ArrayList<String> varNames = new ArrayList<String>();
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
			varNames.add(entry.getKey());
			
		}
		usedVarList.add(varNames);
		
		
		// check if any variable has been added to the list
		if (PrefixPrinter.inclusiveVarMap != null) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
					
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		// add the remaining string
		z3output = z3output.concat("(assert (not " + p.prefixOutput + "))\n"
				+ "(check-sat)\n"
				+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
				+ ";(get-model)\n"
				+ "split\n");
		
		// add the infix version to formulaList
		infixFormula.add(p2.infixOutput);
		
		// iterate through differenceMap, and get the mode name, store it in warning message
		String varString = "";
		if (!VarPrinter.unusedVarMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : VarPrinter.unusedVarMap.entrySet()) {
				varString = varString.concat("<" + entry.getKey() + "> ");
			}
		}
		// add to warning message
		warningMsg.add(varString);
		
		
		// clear the map
		PrefixPrinter.inclusiveVarMap.clear();
	}
	
	
	// version for quantification
	public void printQuantification (Quantification q) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		q.accept(p);
				
		// use the InfixPrinter to return the output
		InfixPrinter p2 = new InfixPrinter();
		q.accept(p2);
		
		// clone the inclusiveVarMap to usedVarList
		// for "-v" version, printing the used variable for each formula
		ArrayList<String> varNames = new ArrayList<String>();
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
			varNames.add(entry.getKey());
			
		}
		usedVarList.add(varNames);
		
		// check if any variable has been added to the list
		if (PrefixPrinter.inclusiveVarMap != null) {
					
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
							
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// add the remaining string
		z3output = z3output.concat("(assert (" + " " + quantifyIndicator + p.prefixOutput + "))\n"
				+ "(check-sat)\n"
				+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
				+ ";(get-model)\n"
				+ "split\n");
		
		// add the infix version to formulaList
		infixFormula.add(p2.infixOutput);
				
		// iterate through differenceMap, and get the mode name, store it in warning message
		String varString = "";
		if (!VarPrinter.unusedVarMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : VarPrinter.unusedVarMap.entrySet()) {
				varString = varString.concat("<" + entry.getKey() + "> ");
			}
		}
		// add to warning message
		warningMsg.add(varString);
		
		// clear the map
		PrefixPrinter.inclusiveVarMap.clear();
	}
	
	
	
	@Override
	public void visitForall(Forall q) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		q.accept(p);
		
		// use the InfixPrinter to return the output
		InfixPrinter p2 = new InfixPrinter();
		q.accept(p2);
		
		// clone the inclusiveVarMap to usedVarList
		// for "-v" version, printing the used variable for each formula
		ArrayList<String> varNames = new ArrayList<String>();
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
			varNames.add(entry.getKey());
			
		}
		usedVarList.add(varNames);
		
		
		// check if any variable has been added to the list
		if (PrefixPrinter.inclusiveVarMap != null) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null || entry.getValue().b.equals("Quantification")) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		// add the remaining string
		z3output = z3output.concat("(assert (not " + p.prefixOutput + "))\n"
				+ "(check-sat)\n"
				+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
				+ ";(get-model)\n"
				+ "split\n");
		
		// add the infix version to formulaList
		infixFormula.add(p2.infixOutput);
		
		// iterate through differenceMap, and get the mode name, store it in warning message
		String varString = "";
		if (!VarPrinter.unusedVarMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : VarPrinter.unusedVarMap.entrySet()) {
				varString = varString.concat("<" + entry.getKey() + "> ");
			}
		}
		// add to warning message
		warningMsg.add(varString);
		
		
		// clear the map
		PrefixPrinter.inclusiveVarMap.clear();
	}

	@Override
	public void visitExists(Exists q) {
		quantifyIndicator = "forall";
		printQuantification(q);
	}
	
	
	@Override
	public void visitNot(Negation e) {
		printExpr(e);
	}

	@Override
	public void visitAnd(Conjunction e) {
		printExpr(e);
	}

	@Override
	public void visitOr(Disjunction e) {
		printExpr(e);
	}

	@Override
	public void visitImplies(Implication e) {
		printExpr(e);
	}

	@Override
	public void visitIff(Iff e) {
		printExpr(e);
	}
	
	@Override
	public void visitEqual(Equal e) {
		printExpr(e);
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		printExpr(e);
	}

	@Override
	public void visitLessThan(LessThan e) {
		printExpr(e);
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		printExpr(e);
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		printExpr(e);
	}

	@Override
	public void visitAddition(Addition e) {
		printExpr(e);
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		printExpr(e);
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		printExpr(e);
	}

	@Override
	public void visitDivision(Division e) {
		printExpr(e);
	}

	// boolean variable
	@Override
	public void visitBoolVar(BoolVar v) {
		// mode 0: uninitialized declaration
		// e.g. boolean p
		if(v.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			printExpr(v);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
	}
	
	// int variable
	@Override
	public void visitIntVar(IntVar v) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		v.accept(p);
	}
	
	// real variable
	@Override
	public void visitRealVar(RealVar v) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		v.accept(p);
	}

	@Override
	public void visitBoolTrue(BoolTrue c) {
		printExpr(c);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		printExpr(c);
	}

	@Override
	public void visitIntConst(IntConst c) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		c.accept(p);
	}

	@Override
	public void visitRealConst(RealConst c) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		c.accept(p);
	}

	
	
	
	
	
	
	
	
	
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitNIL(NIL n) {
		// TODO Auto-generated method stub
		
	}
}
