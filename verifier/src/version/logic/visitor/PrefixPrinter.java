package version.logic.visitor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

import com.microsoft.z3.*;

import antlr.*;
import types.*;
import values.*;
import version.logic.composite.*;

public class PrefixPrinter implements Visitor{
	
	public String prefixOutput;
	
	// list storing variables and their types and values
	// only for printing
	public static List<String[]> varList = new ArrayList<String[]>();   
	
	public PrefixPrinter() {
		prefixOutput = "";
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
		// e.g. boolean p
		if(v.mode == 0) {
			String[] str = {v.name, "Bool", null};
			varList.add(str);
		}
		// mode 1: verification
		else if (v.mode == 1) {
			prefixOutput = prefixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode == 2) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Bool", h.prefixOutput};
			varList.add(str);
		}
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. int j
		if(v.mode == 0) {
			
			String[] str = {v.name, "Int", null};
			varList.add(str);
		}
		// mode 1: verification
		else if (v.mode == 1) {
			prefixOutput = prefixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. int i = 2
		else if (v.mode == 2) {
			PrefixPrinter h = new PrefixPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Int", h.prefixOutput};
			varList.add(str);
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
	public void visitNumConst(NumConst c) {
		prefixOutput = prefixOutput.concat(c.name);
	}
}
