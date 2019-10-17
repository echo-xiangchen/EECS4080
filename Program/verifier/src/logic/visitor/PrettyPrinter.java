package logic.visitor;

import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import java.util.Map.*;
import logic.composite.*;


public class PrettyPrinter implements Visitor {
	
	public String z3output;
	public static List<String> infixFormula = new ArrayList<String>();
	public static List<String> warningMsg = new ArrayList<String>();
	
	public PrettyPrinter() {
		z3output = "";
	}
	
	// version that include all the variable declared
	public void printExpr (Logic e) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		e.accept(p);
		
		// use the InfixPrinter to return the output
		InfixPrinter p2 = new InfixPrinter();
		e.accept(p2);
				
		// compare two variable hashmaps, and output the unused variable(s)
		Map<String, Pair<String, String>> differenceMap = new HashMap<String, Pair<String,String>>();
		// add all the elements of completeVarList to differenceMap
		differenceMap.putAll(PrefixPrinter.completeVarMap);
		
		
		// check if any variable has been added to the list
		if (PrefixPrinter.inclusiveVarMap != null) {
			
			for (Entry<String, Pair<String, String>> entry : PrefixPrinter.inclusiveVarMap.entrySet()) {
				if (entry.getValue().b == null) {
					z3output = z3output.concat("(declare-const " + entry.getKey() 
							+  " " + entry.getValue().a +")\n");
				}
				else {
					z3output = z3output.concat("(declare-const " + entry.getKey() +  " " 
							+ entry.getValue().a + ")\n"
							+ "(assert (= " + entry.getKey() 
							+ " " + entry.getValue().b + "))\n");
				}
				// delete the same element of completeVarList and inclusiveVarList
				differenceMap.remove(entry.getKey());
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
		
		// iterate through differenceMap, and get the variable name, store it in warning message
		String varString = "";
		for (Entry<String, Pair<String, String>> entry : differenceMap.entrySet()) {
			varString = varString.concat("<" + entry.getKey() + "> ");
		}
		// add to warning message
		warningMsg.add(varString);
		
//		System.out.println("varlist: " + PrefixPrinter.completeVarList);
//		System.out.println("varlist2 before: " +PrefixPrinter.inclusiveVarList);
		PrefixPrinter.inclusiveVarMap.clear();
//		System.out.println("varlist2 after: " +PrefixPrinter.inclusiveVarList);

		// try to print the list
//		for (String[] strArr : p.varList) {
//			System.out.println(Arrays.toString(strArr));
//		}	
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


	@Override
	public void visitBoolVar(BoolVar v) {
		// variable 0: uninitialized declaration
		// e.g. boolean p
		if(v.variable instanceof modes.UninitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
		// variable 1: verification
		else if (v.variable instanceof modes.Verification) {
			printExpr(v);
		}
		// variable 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.variable instanceof modes.InitializedDecl) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
	}
	
	@Override
	public void visitIntVar(IntVar v) {
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
	public void visitNumConst(NumConst c) {
		// use the PrefixPrinter to return the output
		PrefixPrinter p = new PrefixPrinter();
		c.accept(p);
	}
}
