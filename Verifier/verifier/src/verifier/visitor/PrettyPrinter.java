package verifier.visitor;

import org.antlr.v4.runtime.misc.Pair;

import types.BoolType;
import verifier.composite.*;

import java.util.*;
import java.util.Map.*;


public class PrettyPrinter implements Visitor {
	
	public String z3output;
	
	// indicates if contains nested quantification
	public static boolean isNestedQuantifier;
	
	// infix version of the formula
	public static List<String> infixFormula = new ArrayList<String>();
	// msg for unused variables
	public static List<String> warningMsg = new ArrayList<String>();
	// used variable list
	public static List<ArrayList<String>> usedVarList = new ArrayList<ArrayList<String>>();
	
	// map that stores the output splited string if the method contains loop
	public static Map<String, List<String>> methodLoopSeperateStr = new LinkedHashMap<String, List<String>>();
	
	
	public PrettyPrinter() {
		z3output = "";
	}
	
	/* *****************************************************************************************
	 * TODO printer for binary expr
	 * *****************************************************************************************
	 */
	
	public void binaryPrinter(BinaryExpr e, String op) {
		PrefixPrinter left = new PrefixPrinter();
		PrefixPrinter right = new PrefixPrinter();
		
		// test to see if left child is quantifier
		if (e.left() instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		
		e.left().accept(left);
		// reset "isNestedQuantifier"
		isNestedQuantifier = false;
		
		// test to see if right child is quantifier
		if (e.right() instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		
		e.right().accept(right);
		// reset "isNestedQuantifier"
		isNestedQuantifier = false;
		
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
		
		// used to indicate if it's formula or method
		z3output = z3output.concat(";formula\n");
		
		// check if any variable has been added to the list
		if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
					
				}
				else if (entry.getValue().b.equals("Pair")) {
					
				}
				// uninitialized array declaration
				// (declare-const a (Array Int Int))
				else if (entry.getValue().b.equals("Array")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
							+ " (Array Int " + entry.getValue().a + "))\n");
				}
				// initialized array declaration
				// (declare-const a (Array Int Int))
				// (assert (= (select a 1) 10))
				else if (entry.getValue().b.equals("ValuedArray")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
					+ " (Array Int " + entry.getValue().a + "))\n");
					for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
						z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
								+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
					}
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// check is there is any pair variable that has been used
		boolean pairIsUsed = false;
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
			if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
				pairIsUsed = true;
			}
		}
		
		if (pairIsUsed) {
			z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
		}
		
		// print the pair declaration
		if (!PrefixPrinter.pairTypeMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
				}
				
			}
		}
		
		// also check if there is any initialized pair variable has been used
		if (!PrefixPrinter.pairValueMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
					z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// add the remaining string
		z3output = z3output.concat("(assert (not \n(" + op + " " + left.prefixOutput 
				+ " " + right.prefixOutput + ")))\n"
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
	
	/* *****************************************************************************************
	 * TODO printer for unary expr
	 * *****************************************************************************************
	 */
	
	public void unaryPrinter(UnaryExpr e, String op) {
		PrefixPrinter printer = new PrefixPrinter();
		
		// test to see if right child is quantifier
		if (e.child instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		
		e.child.accept(printer);
		// reset "isNestedQuantifier"
		isNestedQuantifier = false;
		
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
		
		// used to indicate if it's formula or method
		z3output = z3output.concat(";formula\n");
				
		// check if any variable has been added to the list
		if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
					
				}
				else if (entry.getValue().b.equals("Pair")) {
		
				}
				// uninitialized array declaration
				// (declare-const a (Array Int Int))
				else if (entry.getValue().b.equals("Array")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
							+ " (Array Int " + entry.getValue().a + "))\n");
				}
				// initialized array declaration
				// (declare-const a (Array Int Int))
				// (assert (= (select a 1) 10))
				else if (entry.getValue().b.equals("ValuedArray")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
					+ " (Array Int " + entry.getValue().a + "))\n");
					for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
						z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
								+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
					}
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// check is there is any pair variable that has been used
		boolean pairIsUsed = false;
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
			if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
				pairIsUsed = true;
			}
		}
		
		if (pairIsUsed) {
			z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
		}
		
		// print the pair declaration
		if (!PrefixPrinter.pairTypeMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
				}
				
			}
		}
		
		// also check if there is any initialized pair variable has been used
		if (!PrefixPrinter.pairValueMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
					z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
				}
			}
		}
				
				
		// add the remaining string
		z3output = z3output.concat("(assert (not \n(" + op + " " + printer.prefixOutput + ")))\n"
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
	
	/* *****************************************************************************************
	 * TODO printer for other expressions (e.g., true, false, and other arithmetic expr)
	 * *****************************************************************************************
	 */
	
	public void printOtherExpr (Logic e) {
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
		
		// used to indicate if it's formula or method
		z3output = z3output.concat(";formula\n");
				
		// check if any variable has been added to the list
		if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
					
				}
				else if (entry.getValue().b.equals("Pair")) {
			
				}
				// uninitialized array declaration
				// (declare-const a (Array Int Int))
				else if (entry.getValue().b.equals("Array")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
							+ " (Array Int " + entry.getValue().a + "))\n");
				}
				// initialized array declaration
				// (declare-const a (Array Int Int))
				// (assert (= (select a 1) 10))
				else if (entry.getValue().b.equals("ValuedArray")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
					+ " (Array Int " + entry.getValue().a + "))\n");
					for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
						z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
								+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
					}
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// check is there is any pair variable that has been used
		boolean pairIsUsed = false;
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
			if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
				pairIsUsed = true;
			}
		}
		
		if (pairIsUsed) {
			z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
		}
		
		// print the pair declaration
		if (!PrefixPrinter.pairTypeMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
				}
				
			}
		}
		
		// also check if there is any initialized pair variable has been used
		if (!PrefixPrinter.pairValueMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
					z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
				}
			}
		}
		
		
		// add the remaining string
		z3output = z3output.concat("(assert (not \n" + p.prefixOutput + "))\n"
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
	
	/* *****************************************************************************************
	 * TODO printer for quantification
	 * *****************************************************************************************
	 */
	
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
		
		// used to indicate if it's formula or method
		z3output = z3output.concat(";formula\n");
		
		// check if any variable has been added to the list
		if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
					
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else if (entry.getValue().b.equals("Quantification")) {
							
				}
				else if (entry.getValue().b.equals("Pair")) {
					
				}
				// uninitialized array declaration
				// (declare-const a (Array Int Int))
				else if (entry.getValue().b.equals("Array")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
							+ " (Array Int " + entry.getValue().a + "))\n");
				}
				// initialized array declaration
				// (declare-const a (Array Int Int))
				// (assert (= (select a 1) 10))
				else if (entry.getValue().b.equals("ValuedArray")) {
					z3output = z3output.concat("(declare-const " + entry.getKey()
					+ " (Array Int " + entry.getValue().a + "))\n");
					for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
						z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
								+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
					}
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
			}
		}
		
		// check is there is any pair variable that has been used
		boolean pairIsUsed = false;
		
		for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
			if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
				pairIsUsed = true;
			}
		}
		
		if (pairIsUsed) {
			z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
		}
		
		// print the pair declaration
		if (!PrefixPrinter.pairTypeMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
				}
				
			}
		}
		
		// also check if there is any initialized pair variable has been used
		if (!PrefixPrinter.pairValueMap.isEmpty()) {
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
				// only when the pair is used, print the pair
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
					z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
				}
			}
		}
				
				
		// add the remaining string
		z3output = z3output.concat("(assert (not \n" + p.prefixOutput + "))\n"
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
		// if the boolean expr is another exists quantifier
		// set "isNestedQuantifier" to be true
		if (q.expr instanceof verifier.composite.Exists) {
			isNestedQuantifier = true;
		}
		
		// check if "isNestedQuantifier" is true
		if (isNestedQuantifier) {
			printQuantification(q);
			// after calling the method, set "isNestedQuantifier" to false again
			isNestedQuantifier = false;
		}
		
		// if it is stand alone quantifier
		else {
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
			
			// used to indicate if it's formula or method
			z3output = z3output.concat(";formula\n");
			
			// check if any variable has been added to the list
			if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
				
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
					if (entry.getValue().b == null || entry.getValue().b.equals("Quantification")) {
						z3output = z3output.concat("(declare-const " + entry.getKey() 
								+  " " + entry.getValue().a +")\n");
					}
					else if (entry.getValue().b.equals("Pair")) {
						
					}
					// uninitialized array declaration
					// (declare-const a (Array Int Int))
					else if (entry.getValue().b.equals("Array")) {
						z3output = z3output.concat("(declare-const " + entry.getKey()
								+ " (Array Int " + entry.getValue().a + "))\n");
					}
					// initialized array declaration
					// (declare-const a (Array Int Int))
					// (assert (= (select a 1) 10))
					else if (entry.getValue().b.equals("ValuedArray")) {
						z3output = z3output.concat("(declare-const " + entry.getKey()
						+ " (Array Int " + entry.getValue().a + "))\n");
						for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
							z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
									+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
						}
					}
					else {
						z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
								+ entry.getValue().a + ")\n"
								+ "(assert (= " + entry.getKey() 
								+ " " + entry.getValue().b + "))\n");
					}
				}
			}
			
			// check is there is any pair variable that has been used
			boolean pairIsUsed = false;
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					pairIsUsed = true;
				}
			}
			
			if (pairIsUsed) {
				z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
			}
			
			// print the pair declaration
			if (!PrefixPrinter.pairTypeMap.isEmpty()) {
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
					// only when the pair is used, print the pair
					if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
						z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
					}
					
				}
			}
			
			// also check if there is any initialized pair variable has been used
			if (!PrefixPrinter.pairValueMap.isEmpty()) {
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
					// only when the pair is used, print the pair
					if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
						z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
						z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
					}
				}
			}
			
			// add the remaining string
			z3output = z3output.concat("(assert (not \n" + p.prefixOutput + "))\n"
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
	}

	@Override
	public void visitExists(Exists q) {
		if (q.expr instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		printQuantification(q);
		isNestedQuantifier = false;
	}
	
	
	@Override
	public void visitNot(Negation e) {
		unaryPrinter(e, "not");
	}

	@Override
	public void visitAnd(Conjunction e) {
		binaryPrinter(e, "and");
	}

	@Override
	public void visitOr(Disjunction e) {
		binaryPrinter(e, "or");
	}

	@Override
	public void visitImplies(Implication e) {
		binaryPrinter(e, "=>");
	}

	@Override
	public void visitIff(Iff e) {
		binaryPrinter(e, "=");
	}
	
	@Override
	public void visitEqual(Equal e) {
		printOtherExpr(e);
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		printOtherExpr(e);
	}

	@Override
	public void visitLessThan(LessThan e) {
		printOtherExpr(e);
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		printOtherExpr(e);
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		printOtherExpr(e);
	}

	@Override
	public void visitAddition(Addition e) {
		printOtherExpr(e);
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		printOtherExpr(e);
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		printOtherExpr(e);
	}

	@Override
	public void visitDivision(Division e) {
		printOtherExpr(e);
	}

	/* *****************************************************************************************
	 * TODO normal variable
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitVarLists(VarLists v) {
		
	}
	
	// boolean variable
	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. p : BOOLEAN
		if(v.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
		// verification
		else if (v.mode instanceof modes.Verification) {
			printOtherExpr(v);
		}
		// initialized declaration
		// e.g. p : BOOLEAN = not q
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
	
	
	
	/* *****************************************************************************************
	 * TODO array variable
	 * *****************************************************************************************
	 */
	
	// boolean array
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
		if(a.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// verification
		else if (a.mode instanceof modes.Verification) {
			printOtherExpr(a);
		}
		// initialized declaration
		// e.g. a : ARRAY[BOOLEAN] = <<true, false, p and q>>
		else if (a.mode instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
	}
	
	// integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
		if(a.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// verification
		else if (a.mode instanceof modes.Verification) {
			printOtherExpr(a);
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = <<1, 2, 6, 9>>
		else if (a.mode instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
	}
	
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
		if(a.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// verification
		else if (a.mode instanceof modes.Verification) {
			printOtherExpr(a);
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = <<1.2, 2.1, 6.0, 9.6>>
		else if (a.mode instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
		// array assignment
		else if (a.mode instanceof modes.Assignment) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			a.accept(p);
		}
	}
	
	/* *****************************************************************************************
	 * TODO Pair 
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitPair(PairVar p) {
		if (p.mode instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter printer = new PrefixPrinter();
			p.accept(printer);
		}
		else if (p.mode instanceof modes.BoolVerification) {
			printOtherExpr(p);
		}
		else if (p.mode instanceof modes.ArithVerification) {
			// use the PrefixPrinter to return the output
			PrefixPrinter printer = new PrefixPrinter();
			p.accept(printer);
		}
		else if (p.mode instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter printer = new PrefixPrinter();
			p.accept(printer);
		}
		else if (p.mode instanceof modes.Assignment) {
			// use the PrefixPrinter to return the output
			PrefixPrinter printer = new PrefixPrinter();
			p.accept(printer);
		}
	}
	
	/* *****************************************************************************************
	 * TODO Constants
	 * *****************************************************************************************
	 */

	@Override
	public void visitBoolTrue(BoolTrue c) {
		printOtherExpr(c);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		printOtherExpr(c);
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
	
	
	/* *****************************************************************************************
	 * TODO Methods
	 * *****************************************************************************************
	 */
	


	@Override
	public void visitMethods(Methods m) {
		if (m.mode instanceof modes.Declaration) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			m.accept(p);
		}
		else if (m.mode instanceof modes.Verification) {
			//z3output = z3output.concat(";" + m.name + "\n");
			
			
			// set isNestedQuantifier to be true
			isNestedQuantifier = true;
			
			PrefixPrinter p = new PrefixPrinter();
			m.accept(p);
			
			// clone the inclusiveVarMap to usedVarList
			// for "-v" version, printing the used variable for each formula
			ArrayList<String> varNames = new ArrayList<String>();
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				varNames.add(entry.getKey());
				
			}
			usedVarList.add(varNames);
			
			// check if any variable has been added to the list
			if (!PrefixPrinter.inclusiveVarMap.isEmpty()) {
				
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
					if (entry.getValue().b == null) {
						z3output = z3output.concat("(declare-const " + entry.getKey() 
								+  " " + entry.getValue().a +")\n");
					}
					else if (entry.getValue().b.equals("Quantification")) {
						
					}
					else if (entry.getValue().b.equals("Pair")) {
						
					}
					// uninitialized array declaration
					// (declare-const a (Array Int Int))
					else if (entry.getValue().b.equals("Array")) {
						z3output = z3output.concat("(declare-const " + entry.getKey()
								+ " (Array Int " + entry.getValue().a + "))\n");
					}
					// initialized array declaration
					// (declare-const a (Array Int Int))
					// (assert (= (select a 1) 10))
					else if (entry.getValue().b.equals("ValuedArray")) {
						z3output = z3output.concat("(declare-const " + entry.getKey()
						+ " (Array Int " + entry.getValue().a + "))\n");
						for (int i = 0; i < PrefixPrinter.arrayMap.get(entry.getKey()).size(); i++) {
							z3output = z3output.concat("(assert (= (select " + entry.getKey() + " " + (i+1) 
									+ ") " + PrefixPrinter.arrayMap.get(entry.getKey()).get(i) + "))\n");
						}
					}
					else {
						z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
								+ entry.getValue().a + ")\n"
								+ "(assert (= " + entry.getKey() 
								+ " " + entry.getValue().b + "))\n");
					}
				}
			}
			
			// check is there is any pair variable that has been used
			boolean pairIsUsed = false;
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
				if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
					pairIsUsed = true;
				}
			}
			
			if (pairIsUsed) {
				z3output = z3output.concat("(declare-datatypes (T1 T2) ((Pair (mk-pair (first T1) (second T2)))))\n");
			}
			
			// print the pair declaration
			if (!PrefixPrinter.pairTypeMap.isEmpty()) {
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairTypeMap.entrySet()) {
					// only when the pair is used, print the pair
					if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
						z3output = z3output.concat("(declare-const " + entry.getKey() + " (Pair " + entry.getValue().a + " " + entry.getValue().b + "))\n");
					}
					
				}
			}
			
			// also check if there is any initialized pair variable has been used
			if (!PrefixPrinter.pairValueMap.isEmpty()) {
				for (Entry<String, Pair<String, String>> entry : PrefixPrinter.pairValueMap.entrySet()) {
					// only when the pair is used, print the pair
					if (PrefixPrinter.inclusiveVarMap.containsKey(entry.getKey())) {
						z3output = z3output.concat("(assert (= (first " + entry.getKey() + ") " + entry.getValue().a + "))\n");
						z3output = z3output.concat("(assert (= (second " + entry.getKey() + ") " + entry.getValue().b + "))\n");
					}
				}
			}
			
			// check if there is any old variable caches
			if (!PrefixPrinter.oldVarMap.isEmpty()) {
				for (Entry<String, String> entry : PrefixPrinter.oldVarMap.entrySet()) {
					z3output = z3output.concat("(assert (= " + entry.getKey() + " " + entry.getValue() + "))\n");
					
				}
			}
			
			// check if there is any assignments
			if (!PrefixPrinter.assignMap.isEmpty()) {
				for (Entry<String, String> entry : PrefixPrinter.assignMap.entrySet()) {
					z3output = z3output.concat("(assert (= " + entry.getKey() + " " + entry.getValue() + "))\n");
				}
			}
			
			
			// if there is no loop
			if (!PrefixPrinter.containsLoop) {
				
				// generate the output for each wp: precondition => wp
				String normalHoareTripleStr = "";
				
				for (int i = 0; i < PrefixPrinter.methodHoareTripleMap.get(m.name).size(); i++) {
					WpPrinter hoarePrinter = new WpPrinter();
					PrefixPrinter.methodHoareTripleMap.get(m.name).get(i).accept(hoarePrinter);
					
					// add the output to the normalHoareTripleStr
					normalHoareTripleStr = normalHoareTripleStr + z3output + "(assert (not \n" + hoarePrinter.prefixOutput + "))\n"
							+ "(check-sat)\n"
							+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
							+ ";(get-model)\n"
							+ "splitWp\n";
				}
				
				// add the remaining string
				z3output = ";" + m.name + "\n" + normalHoareTripleStr + "split\n" ;
				
			}
			// if there is any loop inside the implementations
			else {
				
//				// remove the first line of z3output and store it
//				String noFirstLine = "";
//				
//				String[] splitZ3output = z3output.split("\\n");
//				
//				for (int i = 1; i < splitZ3output.length; i++) {
//					noFirstLine = noFirstLine + splitZ3output[i] + "\n";
//				}
//				
//				z3output = noFirstLine;
				
				
				String loopStr = "";
				
				// first check if there is only one postcondition
				if (PrefixPrinter.methodLoopCondition3WpMap.get(m.name).size() <= 1) {
					for (int i = 0; i < PrefixPrinter.methodLoopWpMap.get(m.name).size(); i++) {
						WpPrinter loopPrinter = new WpPrinter();
						PrefixPrinter.methodLoopWpMap.get(m.name).get(i).accept(loopPrinter);
						
						// add the output to the loopstr
						loopStr = loopStr + z3output + "(assert (not \n" + loopPrinter.prefixOutput + "))\n"
								+ "(check-sat)\n"
								+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
								+ ";(get-model)\n"
								+ "splitLoopStep\n";
					}
					z3output = ";" + m.name + "\n" + loopStr + "split\n" ;
				}
				// if there is more than one postconditions
				else {
					// print first two conditions first
					for (int i = 0; i < 2; i++) {
						WpPrinter loopPrinter = new WpPrinter();
						PrefixPrinter.methodLoopWpMap.get(m.name).get(i).accept(loopPrinter);
						
						// add the output to the loopstr
						loopStr = loopStr + z3output + "(assert (not \n" + loopPrinter.prefixOutput + "))\n"
								+ "(check-sat)\n"
								+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
								+ ";(get-model)\n"
								+ "splitLoopStep\n";
					}
					
					// then print the condition 3, based on the number of postconditions
					String condition3Output = "";
					
					for (int i = 0; i < PrefixPrinter.methodLoopCondition3WpMap.get(m.name).size(); i++) {
						WpPrinter condition3printer = new WpPrinter();
						PrefixPrinter.methodLoopCondition3WpMap.get(m.name).get(i).accept(condition3printer);
						
						// add the output to condition3Output
						condition3Output = condition3Output + z3output + "(assert (not \n" + condition3printer.prefixOutput + "))\n"
								+ "(check-sat)\n"
								+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
								+ ";(get-model)\n"
								+ "splitCondition3Step\n";
					}
					
					// add the output of condition 3 to loopStr
					loopStr = loopStr + condition3Output + "splitLoopStep\n";
					
					// then print the rest of the conditions: condition 4 and 5
					for (int i = 3; i < PrefixPrinter.methodLoopWpMap.get(m.name).size(); i++) {
						WpPrinter loopPrinter = new WpPrinter();
						PrefixPrinter.methodLoopWpMap.get(m.name).get(i).accept(loopPrinter);
						
						// add the output to the loopstr
						loopStr = loopStr + z3output + "(assert (not \n" + loopPrinter.prefixOutput + "))\n"
								+ "(check-sat)\n"
								+ ";Uncomment the following line if the result of z3 online tool returns \"sat\"\n"
								+ ";(get-model)\n"
								+ "splitLoopStep\n";
					}
					z3output = ";" + m.name + "\n" + loopStr + "split\n" ;
				}
				
				
				
				
				
				
			}
			
			// add the infix version to formulaList
			InfixPrinter methodPrinter = new InfixPrinter();
			m.accept(methodPrinter);
			infixFormula.add(methodPrinter.infixOutput);
			
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
			
			isNestedQuantifier = false;
		}
	}
	
	@Override
	public void visitAssignment(Assignments a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void visitAlternations(Alternations a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitPreconditions(Preconditions p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void visitContractExpr(ContractExpr c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLocals(Locals l) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void visitOlds(Olds o) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void visitResults(Results r) {
		// TODO Auto-generated method stub
	}
	
	
	
	@Override
	public void visitUnknownVar(UnknownVar n) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitIfStats(IfStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLoops(Loops loops) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitInitImp(InitImp s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitInvariantStat(InvariantStat s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitExitCondition(ExitCondition s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLoopBody(LoopBody s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitVariantStat(VariantStat s) {
		// TODO Auto-generated method stub
		
	}

	
}