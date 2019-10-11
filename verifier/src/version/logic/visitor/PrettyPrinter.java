package version.logic.visitor;

import org.antlr.v4.parse.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.*;
import java.util.*;

import com.microsoft.z3.*;
import com.microsoft.z3.Expr;

import antlr.*;
import types.*;
import values.*;
import version.logic.composite.*;


public class PrettyPrinter implements Visitor {
	
	public String z3output;
	public static List<String> formulaList = new ArrayList<String>();
	
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
				
		// check if any variable has been added to the list
		if (p.varList != null) {
			for (int i = 0; i < p.varList.size(); i++) {
				// iterate each element in the list
				// check if it's uninitialized declaration
				// e.g. boolean p
				if (p.varList.get(i)[2] == null) {
					z3output = z3output.concat("(declare-const " + p.varList.get(i)[0] +  " " + p.varList.get(i)[1] +")\n");
				}
				// if it's initialized declaration
				// e.g. boolean p = not q
				else {
									
					z3output = z3output.concat("(declare-const " + p.varList.get(i)[0] +  " " + p.varList.get(i)[1] + ")\n"
							+ "(assert (= " + p.varList.get(i)[0] + " " + p.varList.get(i)[2] + "))\n");
				}
			}
		}
		// add the remaining string
		z3output = z3output.concat("(assert (not " + p.prefixOutput + "))\n"
				+ "(check-sat)\n"
				+ ";Remove the comment if the result of z3 online tool returns \"sat\"\n"
				+ ";(get-model)\n"
				+ "split\n");
		
		// add the infix version to formulaList
		formulaList.add(p2.infixOutput);

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
		// mode 0: uninitialized declaration
		// e.g. boolean p
		if(v.mode == 0) {
			// use the PrefixPrinter to return the output
			PrefixPrinter p = new PrefixPrinter();
			v.accept(p);
		}
		// mode 1: verification
		else if (v.mode == 1) {
			printExpr(v);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode == 2) {
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
