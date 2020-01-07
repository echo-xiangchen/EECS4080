package logic.visitor;


import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import types.*;
import logic.composite.*;

public class TypeChecker implements Visitor{
	// hashmap for type checking
	public static Map<String, Pair<VarType, Logic>> varMap = new HashMap<String, Pair<VarType, Logic>>();
	
	
	// error message
	public List<String> errormsg;
	
	
	// constructor
	public TypeChecker() {
		errormsg = new ArrayList<String>();
	}
	
	// helper method for checking binary expression
	public void BinaryChecker(BinaryExpr b) {
		TypeChecker checker1 = new TypeChecker();
		TypeChecker checker2 = new TypeChecker();
		
		b.left().accept(checker1);
		b.right().accept(checker2);
		
		errormsg.addAll(checker1.errormsg);
		errormsg.addAll(checker2.errormsg);
	}
	
	// helper method for checking unary expression
	public void UnaryChecker(UnaryExpr u) {
		
		TypeChecker checker = new TypeChecker();
		
		u.child.accept(checker);
		
		errormsg.addAll(checker.errormsg);
	}
	
	public void QuantifyChecker (Quantification q) {
		// recursively accept all the variables in the list first
		for (int i = 0; i < q.quantifyList.size(); i++) {
			TypeChecker c1 = new TypeChecker();
			q.quantifyList.get(i).accept(c1);
			errormsg.addAll(c1.errormsg);
		}
		// then accept the boolexpr next
		TypeChecker c2 = new TypeChecker();
		q.expr.accept(c2);
		errormsg.addAll(c2.errormsg);
	}
	
	// for all
	@Override
	public void visitForall(Forall q) {
		QuantifyChecker(q);
	}

	// there exists
	@Override
	public void visitExists(Exists q) {
		QuantifyChecker(q);
	}	

	// not
	@Override
	public void visitNot(Negation e) {
		UnaryChecker(e);
	}

	// and
	@Override
	public void visitAnd(Conjunction e) {
		BinaryChecker(e);
	}
	
	// or
	@Override
	public void visitOr(Disjunction e) {
		BinaryChecker(e);
	}

	// impies
	@Override
	public void visitImplies(Implication e) {
		BinaryChecker(e);
	}
	
	// if and only if
	@Override
	public void visitIff(Iff e) {
		BinaryChecker(e);
	}
	
	// arithmetic equal (=)
	@Override
	public void visitEqual(Equal e) {
		BinaryChecker(e);
	}

	// arithmetic greater than (>)
	@Override
	public void visitGreaterThan(GreaterThan e) {
		BinaryChecker(e);
	}

	// arithmetic less than (<)
	@Override
	public void visitLessThan(LessThan e) {
		BinaryChecker(e);
	}

	// arithmetic greater than or equal (>=)
	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		BinaryChecker(e);
	}

	// arithmetic less or equal (<=)
	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		BinaryChecker(e);
	}

	// arithmetic add (+)
	@Override
	public void visitAddition(Addition e) {
		BinaryChecker(e);
	}

	// arithmetic subtract (-)
	@Override
	public void visitSubtraction(Subtraction e) {
		BinaryChecker(e);
	}

	// arithmetic multiply (*)
	@Override
	public void visitMultiplication(Multiplication e) {
		BinaryChecker(e);
	}

	// arithmetic divide (/)
	@Override
	public void visitDivision(Division e) {
		BinaryChecker(e);
	}

	// boolean variable
	@Override
	public void visitBoolVar(BoolVar v) {
		// mode 0: uninitialized declaration
		// e.g. boolean q
		
		// and mode 3: quantification declaration
		// e.g. forall boolean p; @ not p
		if ((v.mode instanceof modes.UninitializedDecl) || (v.mode instanceof modes.QuantifyBool)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Logic>(new BoolType(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(v.name, new Pair<VarType, Logic>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// mode 1: verification
		// e.g. p => q
		else if (v.mode instanceof modes.Verification) {
			if (!varMap.containsKey(v.name)) {
				errormsg.add("Error: variable " + v.name + " has not been declared.");
			}
			// if it has unknown type
			else if (varMap.containsKey(v.name) && (varMap.get(v.name).a instanceof types.UnknowType)) {
				errormsg.add("Error: Type of variable " + v.name + " in this expression is ambigous. " 
			+ "Please make sure each variable is declared exactly once.");
			}
			// if it's not boolean type
			else if (varMap.containsKey(v.name) && !(varMap.get(v.name).a instanceof types.BoolType)) {
				errormsg.add("Error: variable " + v.name + " is not declared as boolean type.");
			}
		}
		// mode 2: initialized declaration
		// e.g. boolean p = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this boolean mode's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			// if there is no error, add it to the map
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Logic>(new BoolType(), v.value));
				}
				else {
					varMap.replace(v.name, new Pair<VarType, Logic>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
	}
	
	// int variable
	@Override
	public void visitIntVar(IntVar v) {
		// mode 0: uninitialized declaration
		// e.g. int i
		
		// and mode 3: quantification declaration
		// e.g. forall int i; @ i > 0
		if ((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Logic>(new IntType(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(v.name, new Pair<VarType, Logic>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// mode 1: verification
		else if (v.mode instanceof modes.Verification) {
			if (!varMap.containsKey(v.name)) {
				errormsg.add("Error: variable " + v.name + " has not been declared.");
			}
			// if it has unknown type
			else if (varMap.containsKey(v.name) && (varMap.get(v.name).a instanceof types.UnknowType)) {
				errormsg.add("Error: Type of variable " + v.name + " in this expression is ambigous. " 
						+ "Please make sure each variable is declared exactly once.");
			}
			// if it's not declared as int type
			else if (varMap.containsKey(v.name) && !(varMap.get(v.name).a instanceof types.IntType)) {
				errormsg.add("Error: variable " + v.name + " is not declared as integer type.");
			}
		}
		// mode 2: initialized declaration
		// int j = 1 + 2
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			// if there is no error, check the map first
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Logic>(new IntType(), v.value));
				}
				else {
					varMap.replace(v.name, new Pair<VarType, Logic>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
	}
	
	// boolean true
	@Override
	public void visitBoolTrue(BoolTrue c) {
		// automatically type correct
	}

	// boolean false
	@Override
	public void visitBoolFalse(BoolFalse c) {
		// automatically type correct
	}

	// number constant
	@Override
	public void visitNumConst(NumConst l) {
		// automatically type correct
	}

}
