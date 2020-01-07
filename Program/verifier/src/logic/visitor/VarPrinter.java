package logic.visitor;

import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import logic.composite.*;

public class VarPrinter implements Visitor {

	// map that stores all the declared variables
	public static Map<String, Pair<String, String>> allVarMap = new HashMap<String, Pair<String,String>>();  
		
	// hashmap that only store the unused variables
	public static Map<String, Pair<String, String>> unusedVarMap = new HashMap<String, Pair<String,String>>();
	
	public void visitBinaryExpr (BinaryExpr b) {
		VarPrinter leftPrinter = new VarPrinter();
		VarPrinter rightPrinter = new VarPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
	}
	
	public void visitUnaryExpr(UnaryExpr u) {
		
		VarPrinter p = new VarPrinter();
		
		u.child.accept(p);
	}
	
	public void visitQuantifier (Quantification q) {
		// accept the list of variables
		for (int i = 0; i < q.quantifyList.size(); i++) {
			VarPrinter c1 = new VarPrinter();
			q.quantifyList.get(i).accept(c1);
			
		}
		// accept the boolean expression
		VarPrinter c2 = new VarPrinter();
		q.expr.accept(c2);
		
	}
	
	
	@Override
	public void visitForall(Forall q) {
		visitQuantifier(q);
	}

	@Override
	public void visitExists(Exists q) {
		visitQuantifier(q);
	}
	
	
	
	
	@Override
	public void visitNot(Negation e) {
		visitUnaryExpr(e);
	}

	@Override
	public void visitAnd(Conjunction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitOr(Disjunction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitImplies(Implication e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitIff(Iff e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitEqual(Equal e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitLessThan(LessThan e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitAddition(Addition e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitDivision(Division e) {
		visitBinaryExpr(e);
	}

	@Override
	public void visitBoolVar(BoolVar v) {
		// mode 0: uninitialized declaration
		// e.g. boolean p
		
		// and mode 3: quantification declaration
		// e.g. forall boolean p; @ not p
		if((v.mode instanceof modes.UninitializedDecl) || (v.mode instanceof modes.QuantifyBool)) {
			// add the mode to both allVarMap and unusedVarMap
			allVarMap.put(v.name, new Pair<String, String>("Bool", null));
			unusedVarMap.put(v.name, new Pair<String, String>("Bool", null));
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("Bool", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("Bool", h.infixOutput));
		}
	}

	

	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. int j
		
		// and mode 3: quantification declaration
		// e.g. forall int i; @ i > 0
		if((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {	
			allVarMap.put(v.name, new Pair<String, String>("Int", null));
			unusedVarMap.put(v.name, new Pair<String, String>("Bool", null));
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
		}
		// mode 2: initialized declaration
		// e.g. int i = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("Int", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("Bool", h.infixOutput));
		}
	}
	@Override
	public void visitBoolTrue(BoolTrue c) {
		
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		
	}
	
	@Override
	public void visitNumConst(NumConst c) {

	}
}
