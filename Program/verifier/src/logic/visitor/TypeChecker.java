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
	
	
	// type checker for binary logical expr
	// e.g. and, or, =>, <=>
	public void logicalBinaryChecker(BinaryExpr e) {
		TypeChecker leftChecker = new TypeChecker();
		TypeChecker rightChecker = new TypeChecker();
		
		e.left().accept(leftChecker);
		e.right().accept(rightChecker);
		
		InfixPrinter leftPrinter = new InfixPrinter();
		InfixPrinter rightPrinter = new InfixPrinter();
		
		e.left().accept(leftPrinter);
		e.right().accept(rightPrinter);
		
		
		errormsg.addAll(leftChecker.errormsg);
		errormsg.addAll(rightChecker.errormsg);
		
		// if left child is not boolean type
		if (!(varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType)) {
			errormsg.add(leftPrinter.infixOutput + " is not boolean type.");
		}
		
		// if right child is not boolean type
		else if (!(varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType)) {
			
			errormsg.add(rightPrinter.infixOutput + " is not boolean type.");
		}
		
		// if left and right child are both boolean type (no type error)
		// add this expr to the varmap
		else {
			InfixPrinter infixPrinter = new InfixPrinter();
			e.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Logic>(new BoolType(), null));
		}
	}
	
	// type checker for binary relational expr
	// e.g. =, >, <, >=, <=
	public void relationalBinaryChecker(BinaryExpr e) {
		TypeChecker leftChecker = new TypeChecker();
		TypeChecker rightChecker = new TypeChecker();
		
		e.left().accept(leftChecker);
		e.right().accept(rightChecker);
		
		InfixPrinter leftPrinter = new InfixPrinter();
		InfixPrinter rightPrinter = new InfixPrinter();
		
		e.left().accept(leftPrinter);
		e.right().accept(rightPrinter);
		
		
		errormsg.addAll(leftChecker.errormsg);
		errormsg.addAll(rightChecker.errormsg);
		
		// if left child is not int type of real type
		if (varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType) {
			errormsg.add(leftPrinter.infixOutput + " is boolean type.");
		}
		
		// if right child is not int type of real type
		else if (varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType) {
			errormsg.add(rightPrinter.infixOutput + " is boolean type.");
		}
		
		// if left and right child are both arithmetic type (no type error)
		// add this expr to the varmap
		else {
			InfixPrinter infixPrinter = new InfixPrinter();
			e.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Logic>(new BoolType(), null));
		}
	}
	
	// type checker for binary arithmetic expr
	// e.g. +, -, *, /
	public void arithmeticBinaryChecker(BinaryExpr e) {
		TypeChecker leftChecker = new TypeChecker();
		TypeChecker rightChecker = new TypeChecker();
		
		e.left().accept(leftChecker);
		e.right().accept(rightChecker);
		
		InfixPrinter leftPrinter = new InfixPrinter();
		InfixPrinter rightPrinter = new InfixPrinter();
		
		e.left().accept(leftPrinter);
		e.right().accept(rightPrinter);
		
		
		errormsg.addAll(leftChecker.errormsg);
		errormsg.addAll(rightChecker.errormsg);
		
		// if left child is not int type or real type
		if (varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType) {
					
			InfixPrinter infixPrinter = new InfixPrinter();
			e.left().accept(infixPrinter);
			errormsg.add(infixPrinter.infixOutput + " is boolean type.");
		}
				
		// if right child is not int type or real type
		else if (varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType) {
					
			InfixPrinter infixPrinter = new InfixPrinter();
			e.right().accept(infixPrinter);
			errormsg.add(infixPrinter.infixOutput + " is not of any arithmetic type.");
		}
		
		// if any one of left or right child is real type
		// the whole expr will be real type
		else if (varMap.get(leftPrinter.infixOutput).a instanceof types.RealType
					||
					varMap.get(rightPrinter.infixOutput).a instanceof types.RealType) {
			
			InfixPrinter infixPrinter = new InfixPrinter();
			e.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Logic>(new RealType(), null));
		}
		
		// if both left and right child are int type, the whole expr will be int type
		else {
			InfixPrinter infixPrinter = new InfixPrinter();
			e.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Logic>(new IntType(), null));
		}
	}
	
	
	
	// helper method for checking unary expression
	public void UnaryChecker(UnaryExpr u) {
		
		TypeChecker checker = new TypeChecker();
		u.child.accept(checker);
		
		errormsg.addAll(checker.errormsg);
		
		// if its child is not boolean type
		if (!(varMap.get(u.child.name).a instanceof types.BoolType)) {
			InfixPrinter infixPrinter = new InfixPrinter();
			u.accept(infixPrinter);
			errormsg.add(infixPrinter.infixOutput + " is not boolean type.");
		}
		
		// if its child is boolean type (no type error)
		else {
			InfixPrinter infixPrinter = new InfixPrinter();
			u.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Logic>(new BoolType(), null));
		}
		
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
		logicalBinaryChecker(e);
	}
	
	// or
	@Override
	public void visitOr(Disjunction e) {
		logicalBinaryChecker(e);
	}

	// impies
	@Override
	public void visitImplies(Implication e) {
		logicalBinaryChecker(e);
	}
	
	// if and only if
	@Override
	public void visitIff(Iff e) {
		logicalBinaryChecker(e);
	}
	
	// arithmetic equal (=)
	@Override
	public void visitEqual(Equal e) {
		relationalBinaryChecker(e);
	}

	// arithmetic greater than (>)
	@Override
	public void visitGreaterThan(GreaterThan e) {
		relationalBinaryChecker(e);
	}

	// arithmetic less than (<)
	@Override
	public void visitLessThan(LessThan e) {
		relationalBinaryChecker(e);
	}

	// arithmetic greater than or equal (>=)
	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		relationalBinaryChecker(e);
	}

	// arithmetic less or equal (<=)
	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		relationalBinaryChecker(e);
	}

	// arithmetic add (+)
	@Override
	public void visitAddition(Addition e) {
		arithmeticBinaryChecker(e);
	}

	// arithmetic subtract (-)
	@Override
	public void visitSubtraction(Subtraction e) {
		arithmeticBinaryChecker(e);
	}

	// arithmetic multiply (*)
	@Override
	public void visitMultiplication(Multiplication e) {
		arithmeticBinaryChecker(e);
	}

	// arithmetic divide (/)
	@Override
	public void visitDivision(Division e) {
		arithmeticBinaryChecker(e);
	}

	// boolean variable
	@Override
	public void visitBoolVar(BoolVar v) {
		// mode 0: uninitialized declaration
		// e.g. q : BOOL
		
		// and mode 3: quantification declaration
		// e.g. forall p : BOOL; | not p
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
		// e.g. verify p => q
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
		// e.g. p : BOOL = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this boolean mode's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			v.value.accept(infixPrinter);
			
			// check if the type of assigned value is type correct
			// e.g. error: p : BOOL = 2 * 3
			if (!(varMap.containsKey(infixPrinter.infixOutput)) || !(varMap.get(infixPrinter.infixOutput).a instanceof types.BoolType)) {
				errormsg.add(infixPrinter.infixOutput + "is not boolean type, cannot perform this assignment.");
			}
			
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
		// e.g. i : INTEGER
		
		// and mode 3: quantification declaration
		// e.g. forall i : INTEGER; | i > 0
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
		// verify i > 0
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
		// j : INTEGER = i + 2
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			v.value.accept(infixPrinter);
			
			// check if the type of assigned value is type correct
			// e.g. error: p : INTEGER = 2.1
			if (!(varMap.containsKey(infixPrinter.infixOutput)) 
					|| varMap.get(infixPrinter.infixOutput).a instanceof types.RealType) {
				errormsg.add(infixPrinter.infixOutput + " is not integer type, cannot perform this assignment.");
			}
			
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
	
	// real number variable
	@Override
	public void visitRealVar(RealVar v) {
		// mode 0: uninitialized declaration
		// e.g. i : REAL
				
		// and mode 3: quantification declaration
		// e.g. forall i : REAL; | i > 0
		if ((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Logic>(new RealType(), null));
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
		// verify j >= 2.2
		else if (v.mode instanceof modes.Verification) {
			if (!varMap.containsKey(v.name)) {
				errormsg.add("Error: variable " + v.name + " has not been declared.");
			}
			// if it has unknown type
			else if (varMap.containsKey(v.name) && (varMap.get(v.name).a instanceof types.UnknowType)) {
				errormsg.add("Error: Type of variable " + v.name + " in this expression is ambigous. " 
						+ "Please make sure each variable is declared exactly once.");
			}
			// if it's not declared as real type
			else if (varMap.containsKey(v.name) && !(varMap.get(v.name).a instanceof types.RealType)) {
				errormsg.add("Error: variable " + v.name + " is not declared as real type.");
			}
		}
		// mode 2: initialized declaration
		// j : REAL = i * 4
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
					
			// if there is no error, check the map first
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Logic>(new RealType(), v.value));
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
	
	// boolean array
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// mode 0: uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
	
		if (a.mode instanceof modes.UninitializedDecl) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(a.name)) {
				varMap.put(a.name, new Pair<VarType, Logic>(new BoolArray(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(a.name, new Pair<VarType, Logic>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// mode 1: verification
		// verify a[1]
		else if (a.mode instanceof modes.Verification) {
			
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			a.value.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			a.value.accept(infixPrinter);
			
			// check if the type of the index is integer type
			// e.g. error: verify a[2.1 * 2]
			if (!(varMap.containsKey(infixPrinter.infixOutput)) 
					|| !(varMap.get(infixPrinter.infixOutput).a instanceof types.IntType)) {
				errormsg.add(infixPrinter.infixOutput + " is not integer type, cannot use it as array index value.");
			}
			
			if (!varMap.containsKey(a.name)) {
				errormsg.add("Error: variable " + a.name + " has not been declared.");
			}
			// if it has unknown type
			else if (varMap.containsKey(a.name) && (varMap.get(a.name).a instanceof types.UnknowType)) {
				errormsg.add("Error: Type of variable " + a.name + " in this expression is ambigous. " 
						+ "Please make sure each variable is declared exactly once.");
			}
			// if it's not declared as boolean array type
			else if (varMap.containsKey(a.name) && !(varMap.get(a.name).a instanceof types.BoolArray)) {
				errormsg.add("Error: variable " + a.name + " is not declared as a boolean array.");
			}
			
			
			// if there is no error, check the map first
			else if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(a.name)) {
					varMap.put(a.name, new Pair<VarType, Logic>(new BoolArray(), a.value));
				}
				else {
					varMap.replace(a.name, new Pair<VarType, Logic>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
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
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Logic>(new BoolType(), null));
		}
	}

	// boolean false
	@Override
	public void visitBoolFalse(BoolFalse c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Logic>(new BoolType(), null));
		}
	}

	// int number constant
	@Override
	public void visitIntConst(IntConst c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Logic>(new IntType(), null));
		}
	}

	// real number constant
	@Override
	public void visitRealConst(RealConst c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Logic>(new RealType(), null));
		}
	}


	


	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitNIL(NIL n) {
		varMap.put(n.name, new Pair<VarType, Logic>(new UnknowType(), null));
		errormsg.add("Error: variable " + n.name + " has not been declared.");
	}
}
