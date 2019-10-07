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

public class HelperPrinter implements Visitor{
	
	public String output;
	
	// list storing variables and their types and values
	// only for printing
	public static List<String[]> varList = new ArrayList<String[]>();   
	
	public HelperPrinter() {
		output = "";
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		HelperPrinter leftPrinter = new HelperPrinter();
		HelperPrinter rightPrinter = new HelperPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
		output = output.concat("(" + op + " " + leftPrinter.output + " " + rightPrinter.output + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		HelperPrinter p = new HelperPrinter();
		
		u.child.accept(p);
		
		output = output.concat("(" + op + " " + p.output + ")");
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
			output = output.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode == 2) {
			HelperPrinter h = new HelperPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Bool", h.output};
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
			output = output.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. int i = 2
		else if (v.mode == 2) {
			HelperPrinter h = new HelperPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Int", h.output};
			varList.add(str);
		}
	}


	@Override
	public void visitBoolTrue(BoolTrue c) {
		output = output.concat(c.name);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		output = output.concat(c.name);
		
	}

	@Override
	public void visitNumConst(NumConst c) {
		output = output.concat(c.name);
		
	}
}
