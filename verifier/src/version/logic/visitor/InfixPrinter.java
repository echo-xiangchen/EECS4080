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

public class InfixPrinter implements Visitor{
	
	public String infixOutput;
	
	public InfixPrinter() {
		infixOutput = "";
	}
	
	public void visitBinaryExpr (BinaryExpr b, String op) {
		InfixPrinter leftPrinter = new InfixPrinter();
		InfixPrinter rightPrinter = new InfixPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
		infixOutput = infixOutput.concat("(" + leftPrinter.infixOutput + " " + op + " " + rightPrinter.infixOutput + ")");
	}
	
	public void visitUnaryExpr(UnaryExpr u, String op) {
		
		InfixPrinter p = new InfixPrinter();
		
		u.child.accept(p);
		
		infixOutput = infixOutput.concat("(" + op + " " + p.infixOutput + ")");
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
		}
		// mode 1: verification
		else if (v.mode == 1) {
			infixOutput = infixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode == 2) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Bool", h.infixOutput};
		}
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. int j
		if(v.mode == 0) {
			
			String[] str = {v.name, "Int", null};
		}
		// mode 1: verification
		else if (v.mode == 1) {
			infixOutput = infixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. int i = 2
		else if (v.mode == 2) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
			
			String[] str = {v.name, "Int", h.infixOutput};
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
	public void visitNumConst(NumConst c) {
		infixOutput = infixOutput.concat(c.name);
		
	}
}
