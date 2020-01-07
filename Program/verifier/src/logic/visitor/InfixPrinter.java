package logic.visitor;

import java.util.*;

import org.antlr.v4.runtime.misc.Pair;

import logic.composite.*;

public class InfixPrinter implements Visitor{
	
	public String infixOutput;
	public List<String> quantifyVar;
	
	public InfixPrinter() {
		infixOutput = "";
		quantifyVar = new ArrayList<String>();
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
		infixOutput = "Forall " + infixOutput;
	}

	@Override
	public void visitExists(Exists q) {
		visitQuantifier(q);
		infixOutput = "There exists " + infixOutput;
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

	// boolean mode declaration
	@Override
	public void visitBoolVar(BoolVar v) {
		// mode 0: uninitialized declaration
		// e.g. boolean p
		if(v.mode instanceof modes.UninitializedDecl) {
			
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			infixOutput = infixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
		}
		// mode 3: quantification declaration
		// e.g. forall boolean p; @ not p
		else if (v.mode instanceof modes.QuantifyBool) {
			quantifyVar.add(v.name);
		}
	}
	
	// int mode declaration
	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. int j
		if(v.mode instanceof modes.UninitializedDecl) {
			
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			infixOutput = infixOutput.concat(v.name);
		}
		// mode 2: initialized declaration
		// e.g. int i = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
		}
		// mode 3: quantification declaration
		// e.g. forall boolean p; @ not p
		else if (v.mode instanceof modes.QuantifyInt) {
			quantifyVar.add(v.name);
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
