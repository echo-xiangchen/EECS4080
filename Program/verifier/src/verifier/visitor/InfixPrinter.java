// class to print the formula as infix version

package verifier.visitor;

import java.util.*;
import verifier.composite.*;

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
	}
	
	// int variable declaration
	@Override
	public void visitIntVar(IntVar v) {
		// uninitialized declaration
		// e.g. j : INTEGER
		if(v.mode instanceof modes.UninitializedDecl) {
			
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
	}
	
	
	// real variable declaration
	@Override
	public void visitRealVar(RealVar v) {
		// uninitialized declaration
		// e.g. j : REAL
		if(v.mode instanceof modes.UninitializedDecl) {
					
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
	}
	
	
	// boolean array variable
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
		if(a.mode instanceof modes.UninitializedDecl) {
			
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
	}
	
	// integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
		if(a.mode instanceof modes.UninitializedDecl) {
			
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
	}
	
	// real array
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
		if(a.mode instanceof modes.UninitializedDecl) {
			
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
		infixOutput = infixOutput.concat(c.name);
		
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
	public void visitAssignment(Assignments a) {
		InfixPrinter assignedPrinter = new InfixPrinter();
		a.assignValue.accept(assignedPrinter);
		infixOutput = infixOutput.concat(a.name + " := " + assignedPrinter.infixOutput);
	}

	@Override
	public void visitMethods(Methods m) {
		String parameterStr = "";
		// if the parameters are not empty
		
		// the parameter value start from index 3
		if (PrefixPrinter.methodMap.get(m.name).size() < 4) {
			for (int i = 3; i < PrefixPrinter.methodMap.get(m.name).size(); i++) {
				InfixPrinter paraPrinter = new InfixPrinter();
				PrefixPrinter.methodMap.get(m.name).get(i).accept(paraPrinter);
				parameterStr = parameterStr + paraPrinter.infixOutput + ",";
			}
			infixOutput = infixOutput.concat(m.name + "( " + parameterStr + " )\n");
		}
		// if parameters are empty, simply add the method name
		else {
			infixOutput = infixOutput.concat(m.name + "\n");
		}
		
		// if the return value is not null
		// the return value in methodMap is at index 2
		if (PrefixPrinter.methodMap.get(m.name).get(2) != null) {
			InfixPrinter returnPrinter = new InfixPrinter();
			PrefixPrinter.methodMap.get(m.name).get(2).accept(returnPrinter);
			infixOutput = infixOutput.concat(returnPrinter.infixOutput + "\n");
			
		}
		// print the precondition
		// precondition in methodMap starts at index 0
		InfixPrinter prePrinter = new InfixPrinter();
		// use the methodMap in prefixprinter to print the precondition
		PrefixPrinter.methodMap.get(m.name).get(0).accept(prePrinter);
		infixOutput = infixOutput.concat("require: " + prePrinter.infixOutput + "\n");
		
		// print the implementations
		String impStr = "";
		for (int i = 0; i < PrefixPrinter.methodImpMap.get(m.name).size(); i++) {
			InfixPrinter impPrinter = new InfixPrinter();
			PrefixPrinter.methodImpMap.get(m.name).get(i).accept(impPrinter);
			impStr = impStr + impPrinter.infixOutput + "\n";
		}
		infixOutput = infixOutput.concat("do\n" + impStr + "\nend\n");
		
		// print the postcondition
		// postcondition in methodMap starts at index 1
		InfixPrinter postPrinter = new InfixPrinter();
		PrefixPrinter.methodMap.get(m.name).get(1).accept(postPrinter);
		infixOutput = infixOutput.concat("ensure " + postPrinter.infixOutput+ "\n");
	}
}
