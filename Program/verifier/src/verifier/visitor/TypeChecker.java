package verifier.visitor;

import org.antlr.v4.runtime.misc.Pair;
import java.util.*;
import types.*;
import verifier.composite.*;

public class TypeChecker implements Visitor{
	// hashmap for type checking
	public static Map<String, Pair<VarType, Verifier>> varMap = new LinkedHashMap<String, Pair<VarType, Verifier>>();
	
	// indicate whether is inside a method
	public static boolean isMethod;
	
	// indicate whether is inside postcondition
	public static boolean isPostcondition;
	
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
		
		// only when there is no error on both left and right child checker
		// then continue to check their type
		if (errormsg.isEmpty()) {
			// if left child is not boolean type
			if (!(varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType)
					&& !(varMap.get(leftPrinter.infixOutput).a instanceof types.BoolArray)) {
				errormsg.add(leftPrinter.infixOutput + " is not boolean type.");
			}
			
			// if right child is not boolean type
			else if (!(varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType)
					&& !(varMap.get(rightPrinter.infixOutput).a instanceof types.BoolArray)) {
				
				errormsg.add(rightPrinter.infixOutput + " is not boolean type.");
			}
			
			// if left and right child are both boolean type (no type error)
			// add this expr to the varmap
			else {
				InfixPrinter infixPrinter = new InfixPrinter();
				e.accept(infixPrinter);
				varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new BoolType(), null));
			}
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
		
		if (errormsg.isEmpty()) {
			// if left child is not int type of real type
			if (varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType
					|| varMap.get(leftPrinter.infixOutput).a instanceof types.BoolArray) {
				errormsg.add(leftPrinter.infixOutput + " is boolean type.");
			}
			
			// if right child is not int type of real type
			else if (varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType
					|| varMap.get(rightPrinter.infixOutput).a instanceof types.BoolArray) {
				errormsg.add(rightPrinter.infixOutput + " is boolean type.");
			}
			
			// if left and right child are both arithmetic type (no type error)
			// add this expr to the varmap
			else {
				InfixPrinter infixPrinter = new InfixPrinter();
				e.accept(infixPrinter);
				varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new BoolType(), null));
			}
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
		
		if (errormsg.isEmpty()) {
			// if left child is not int type or real type
			if (varMap.get(leftPrinter.infixOutput).a instanceof types.BoolType
					|| varMap.get(leftPrinter.infixOutput).a instanceof types.BoolArray) {
						
				InfixPrinter infixPrinter = new InfixPrinter();
				e.left().accept(infixPrinter);
				errormsg.add(infixPrinter.infixOutput + " is boolean type.");
			}
					
			// if right child is not int type or real type
			else if (varMap.get(rightPrinter.infixOutput).a instanceof types.BoolType
					|| varMap.get(rightPrinter.infixOutput).a instanceof types.BoolArray) {
						
				InfixPrinter infixPrinter = new InfixPrinter();
				e.right().accept(infixPrinter);
				errormsg.add(infixPrinter.infixOutput + " is boolean type.");
			}
			
			// if any one of left or right child is real type
			// the whole expr will be real type
			else if (varMap.get(leftPrinter.infixOutput).a instanceof types.RealType
						||
						varMap.get(rightPrinter.infixOutput).a instanceof types.RealType) {
				
				InfixPrinter infixPrinter = new InfixPrinter();
				e.accept(infixPrinter);
				varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new RealType(), null));
			}
			
			// if both left and right child are int type, the whole expr will be int type
			else {
				InfixPrinter infixPrinter = new InfixPrinter();
				e.accept(infixPrinter);
				varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new IntType(), null));
			}
		}
	}
	
	
	
	// helper method for checking unary expression
	public void UnaryChecker(UnaryExpr u) {
		
		TypeChecker checker = new TypeChecker();
		u.child.accept(checker);
		
		InfixPrinter printer = new InfixPrinter();
		u.child.accept(printer);
		
		errormsg.addAll(checker.errormsg);
		
		if (errormsg.isEmpty()) {
			// if its child is not boolean type
			if (!(varMap.get(printer.infixOutput).a instanceof types.BoolType) 
					&& !(varMap.get(printer.infixOutput).a instanceof types.BoolArray)) {
				InfixPrinter infixPrinter = new InfixPrinter();
				u.accept(infixPrinter);
				errormsg.add(infixPrinter.infixOutput + " is not boolean type.");
			}
			
			// if its child is boolean type (no type error)
			else {
				InfixPrinter infixPrinter = new InfixPrinter();
				u.accept(infixPrinter);
				varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new BoolType(), null));
			}
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
		// if errormsg is empty, add the formula to the map
		if (errormsg.isEmpty()) {
			InfixPrinter infixPrinter = new InfixPrinter();
			q.accept(infixPrinter);
			varMap.put(infixPrinter.infixOutput, new Pair<VarType, Verifier>(new BoolType(), null));
		}
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

	/* *****************************************************************************************
	 * normal variable
	 * *****************************************************************************************
	 */
	
	// boolean variable
	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. q : BOOL
		
		// and quantification declaration
		// e.g. forall p : BOOL; | not p
		if ((v.mode instanceof modes.UninitializedDecl) || (v.mode instanceof modes.QuantifyBool)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Verifier>(new BoolType(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// verification
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
		// initialized declaration
		// e.g. p : BOOL = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this boolean mode's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			v.value.accept(infixPrinter);
			
			// check if the type of assigned value is type correct
			// e.g. error: p : BOOL = 2 * 3
			if (!(varMap.containsKey(infixPrinter.infixOutput))) {
				errormsg.add("Error: Cannot recognize " + infixPrinter.infixOutput + ".");
			}
			else if (!(varMap.get(infixPrinter.infixOutput).a instanceof types.BoolType)) {
				errormsg.add("Error: " + infixPrinter.infixOutput + " is not boolean type, cannot perform this assignment.");
			}
			
			// if there is no error, add it to the map
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Verifier>(new BoolType(), v.value));
				}
				else {
					varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
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
		// uninitialized declaration
		// e.g. i : INTEGER
		
		// and quantification declaration
		// e.g. forall i : INTEGER; | i > 0
		if ((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Verifier>(new IntType(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// verification
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
		// initialized declaration
		// j : INTEGER = i + 2
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			v.value.accept(infixPrinter);
			
			// check if the type of assigned value is type correct
			// e.g. error: p : INTEGER = 2.1
			if (!(varMap.containsKey(infixPrinter.infixOutput))) {
				errormsg.add("Error: Cannot recognize " + infixPrinter.infixOutput + ".");
			}
			else if (varMap.get(infixPrinter.infixOutput).a instanceof types.RealType) {
				errormsg.add(infixPrinter.infixOutput + " is not integer type, cannot perform this assignment.");
			}
			
			// if there is no error, check the map first
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Verifier>(new IntType(), v.value));
				}
				else {
					varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
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
		// uninitialized declaration
		// e.g. i : REAL
				
		// and quantification declaration
		// e.g. forall i : REAL; | i > 0
		if ((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyReal)) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(v.name)) {
				varMap.put(v.name, new Pair<VarType, Verifier>(new RealType(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// verification
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
		// initialized declaration
		// j : REAL = i * 4
		else if (v.mode instanceof modes.InitializedDecl) {
			// type check this arithmetic variable's value first
			TypeChecker checker = new TypeChecker();
			v.value.accept(checker);
					
			// if there is no error, check the map first
			if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(v.name)) {
					varMap.put(v.name, new Pair<VarType, Verifier>(new RealType(), v.value));
				}
				else {
					varMap.replace(v.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + v.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
	}
	
	
	
	
	
	/* *****************************************************************************************
	 * array variable
	 * *****************************************************************************************
	 */
	
	
	
	// boolean array
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]
	
		if (a.mode instanceof modes.UninitializedDecl) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(a.name)) {
				varMap.put(a.name, new Pair<VarType, Verifier>(new BoolArray(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		
		// verification
		// verify a[1]
		else if (a.mode instanceof modes.Verification) {
			
			// type check this arithmetic variable's index first
			TypeChecker checker = new TypeChecker();
			a.index.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			a.index.accept(infixPrinter);
			
			// e.g. a[1], also need to store its name and type to the varMap
			String arrayElement = a.name + "[" + infixPrinter.infixOutput + "]";
			
			// check if the type of the index is integer type
			// e.g. error: verify a[2.1 * 2]
			if (!(varMap.containsKey(infixPrinter.infixOutput))) {
				errormsg.add("Error: Cannot recognize " + infixPrinter.infixOutput + ".");
			}
			else if (!(varMap.get(infixPrinter.infixOutput).a instanceof types.IntType)) {
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
				if (!varMap.containsKey(arrayElement)) {
					varMap.put(arrayElement, new Pair<VarType, Verifier>(new BoolType(), null));
				}
				else if (varMap.containsKey(a.name) && (varMap.get(a.name).a instanceof types.UnknowType)) {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[BOOLEAN] = << p, q, p and q >>
		else if (a.mode instanceof modes.InitializedDecl) {
			// type check its elements first
			for (int i = 0; i < a.arrayValue.size(); i++) {
				TypeChecker checker = new TypeChecker();
				a.arrayValue.get(i).accept(checker);
				errormsg.addAll(checker.errormsg);
			}
			if (errormsg.isEmpty()) {
				// if this variable is declared for the first time, simply add it to the map
				if (!varMap.containsKey(a.name)) {
					varMap.put(a.name, new Pair<VarType, Verifier>(new BoolArray(), null));
				}
				// if this variable is not declared for the first time, change its type to unknown type
				// and add the error message
				else {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}
		}
	}
	
	// integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
	
		if (a.mode instanceof modes.UninitializedDecl) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(a.name)) {
				varMap.put(a.name, new Pair<VarType, Verifier>(new IntArray(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// verification
		// verify a[1]
		else if (a.mode instanceof modes.Verification) {
			
			// type check this arithmetic variable's index first
			TypeChecker checker = new TypeChecker();
			a.index.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			a.index.accept(infixPrinter);
			
			// e.g. a[1], also need to store its name and type to the varMap
			String arrayElement = a.name + "[" + infixPrinter.infixOutput + "]";
			
			// check if the type of the index is integer type
			// e.g. error: verify a[2.1 * 2]
			if (!(varMap.containsKey(infixPrinter.infixOutput))) {
				errormsg.add("Error: Cannot recognize " + infixPrinter.infixOutput + ".");
			}
			else if (!(varMap.get(infixPrinter.infixOutput).a instanceof types.IntType)) {
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
			// if it's not declared as integer array type
			else if (varMap.containsKey(a.name) && !(varMap.get(a.name).a instanceof types.IntArray)) {
				errormsg.add("Error: variable " + a.name + " is not declared as a integer array.");
			}
			
			
			// if there is no error, check the map first
			else if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(arrayElement)) {
					varMap.put(arrayElement, new Pair<VarType, Verifier>(new IntType(), null));
				}
				else if (varMap.containsKey(a.name) && (varMap.get(a.name).a instanceof types.UnknowType)) {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = << 1, 2, 6, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			// type check its elements first
			for (int i = 0; i < a.arrayValue.size(); i++) {
				TypeChecker checker = new TypeChecker();
				a.arrayValue.get(i).accept(checker);
				errormsg.addAll(checker.errormsg);
				
				InfixPrinter printer = new InfixPrinter();
				a.arrayValue.get(i).accept(printer);
				
				if (!(varMap.containsKey(printer.infixOutput))) {
					errormsg.add("Error: Cannot recognize " + printer.infixOutput + ".");
				}
				else if (varMap.get(printer.infixOutput).a instanceof types.RealType) {
					errormsg.add(printer.infixOutput + " is not integer type, cannot perform this assignment.");
				}
			}
			if (errormsg.isEmpty()) {
				// if this variable is declared for the first time, simply add it to the map
				if (!varMap.containsKey(a.name)) {
					varMap.put(a.name, new Pair<VarType, Verifier>(new IntArray(), null));
				}
				// if this variable is not declared for the first time, change its type to unknown type
				// and add the error message
				else {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}
		}
	}
	
	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
	
		if (a.mode instanceof modes.UninitializedDecl) {
			// if this variable is declared for the first time, simply add it to the map
			if (!varMap.containsKey(a.name)) {
				varMap.put(a.name, new Pair<VarType, Verifier>(new RealArray(), null));
			}
			// if this variable is not declared for the first time, change its type to unknown type
			// and add the error message
			else {
				varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
				errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
						+ "Please make sure each variable is declared exactly once.");
			}
		}
		// verification
		// verify a[1] > 0
		else if (a.mode instanceof modes.Verification) {
			
			// type check this arithmetic variable's index first
			TypeChecker checker = new TypeChecker();
			a.index.accept(checker);
			
			InfixPrinter infixPrinter = new InfixPrinter();
			a.index.accept(infixPrinter);
			
			// e.g. a[1], also need to store its name and type to the varMap
			String arrayElement = a.name + "[" + infixPrinter.infixOutput + "]";
			
			// check if the type of the index is integer type
			// e.g. error: verify a[2.1 * 2]
			if (!(varMap.containsKey(infixPrinter.infixOutput))) {
				errormsg.add("Error: Cannot recognize " + infixPrinter.infixOutput + ".");
			}
			else if (!(varMap.get(infixPrinter.infixOutput).a instanceof types.IntType)) {
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
			// if it's not declared as integer array type
			else if (varMap.containsKey(a.name) && !(varMap.get(a.name).a instanceof types.RealArray)) {
				errormsg.add("Error: variable " + a.name + " is not declared as a real array.");
			}
			
			
			// if there is no error, check the map first
			else if (checker.errormsg.isEmpty()) {
				if (!varMap.containsKey(arrayElement)) {
					varMap.put(arrayElement, new Pair<VarType, Verifier>(new RealType(), null));
				}
				else if (varMap.containsKey(a.name) && (varMap.get(a.name).a instanceof types.UnknowType)) {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}else {
				errormsg.addAll(checker.errormsg);
			}
		}
		// initialized declaration
		// e.g. a : ARRAY[REAL] = << 1, 2, 6, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			// type check its elements first
			for (int i = 0; i < a.arrayValue.size(); i++) {
				TypeChecker checker = new TypeChecker();
				a.arrayValue.get(i).accept(checker);
				errormsg.addAll(checker.errormsg);
			}
			if (errormsg.isEmpty()) {
				// if this variable is declared for the first time, simply add it to the map
				if (!varMap.containsKey(a.name)) {
					varMap.put(a.name, new Pair<VarType, Verifier>(new RealArray(), null));
				}
				// if this variable is not declared for the first time, change its type to unknown type
				// and add the error message
				else {
					varMap.replace(a.name, new Pair<VarType, Verifier>(new UnknowType(), null));
					errormsg.add("Error: Type declaration of variable " + a.name + " is ambigous. "
							+ "Please make sure each variable is declared exactly once.");
				}
			}
		}
	}
	
	// boolean true
	@Override
	public void visitBoolTrue(BoolTrue c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Verifier>(new BoolType(), null));
		}
	}

	// boolean false
	@Override
	public void visitBoolFalse(BoolFalse c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Verifier>(new BoolType(), null));
		}
	}

	// int number constant
	@Override
	public void visitIntConst(IntConst c) {
		if (c.isArrayCount) {
			if (!varMap.containsKey(c.name)) {
				errormsg.add("Error: Array " + c.name + " has not been declared.");
			}
			else {
				InfixPrinter arrayCountPrinter = new InfixPrinter();
				c.accept(arrayCountPrinter);
				
				varMap.put(arrayCountPrinter.infixOutput, new Pair<VarType, Verifier>(new IntType(), null));
			}
		}
		else {
			if (!varMap.containsKey(c.name)) {
				varMap.put(c.name, new Pair<VarType, Verifier>(new IntType(), null));
			}
		}
		
	}

	// real number constant
	@Override
	public void visitRealConst(RealConst c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new Pair<VarType, Verifier>(new RealType(), null));
		}
	}

	
	
	
	/* *****************************************************************************************
	 * Methods
	 * *****************************************************************************************
	 */


	@Override
	public void visitMethods(Methods m) {
		// set isMethod to true for old keyword type check
		isMethod = true;
		
		// for declaration mode
		if (m.mode instanceof modes.Declaration) {
			// type check the parameters first
			if (m.parameters != null) {
				for (int i = 0; i < m.parameters.size(); i++) {
					TypeChecker paraChecker = new TypeChecker();
					m.parameters.get(i).accept(paraChecker);
					errormsg.addAll(paraChecker.errormsg);
				}
			}
			
			// if the return value is not null
			if (m.returnValue != null) {
				TypeChecker returnChecker = new TypeChecker();
				m.returnValue.accept(returnChecker);
				errormsg.addAll(returnChecker.errormsg);
			}
			
			
			// type check the precondition
			if (m.precondition != null) {
				TypeChecker preChecker = new TypeChecker();
				m.precondition.accept(preChecker);
				errormsg.addAll(preChecker.errormsg);
			}
			// if precondition is empty
			else {
				errormsg.add("Error: To verify any program, you need to specify the preconditions.");
			}
			
			
			//type check the local variables
			if (m.locals != null) {
				TypeChecker localChecker = new TypeChecker();
				m.locals.accept(localChecker);
				errormsg.addAll(localChecker.errormsg);
			}
			
			// type check the implementations
			for (int i = 0; i < m.implementations.size(); i++) {
				TypeChecker impChecker = new TypeChecker();
				m.implementations.get(i).accept(impChecker);
				errormsg.addAll(impChecker.errormsg);
			}
			
			// type check the postcondition
			if (m.postcondition != null) {
				TypeChecker postChecker = new TypeChecker();
				m.postcondition.accept(postChecker);
				errormsg.addAll(postChecker.errormsg);
			}
			// if postcondition is empty
			else {
				errormsg.add("Error: To verify any program, you need to specify the postconditions.\"");
			}
			
			
			if (errormsg.isEmpty()) {
				// check if the method is mutator or accesstor
				// return value is not null means this method is accessor
				// otherwise this method is mutator
				if (m.returnValue != null) {
					varMap.put(m.name, new Pair<VarType, Verifier>(new AccessorType(), null));
				}
				else {
					varMap.put(m.name, new Pair<VarType, Verifier>(new MutatorType(), null));
				}
				
			}
			
			// reset isMethod
			isMethod = false;
		}
		else if (m.mode instanceof modes.Verification) {
			if (!varMap.containsKey(m.name)) {
				errormsg.add("Error: Method " + m.name + " has not been declared.");
			}
			// if it has unknown type
			else if (varMap.containsKey(m.name) && (varMap.get(m.name).a instanceof types.UnknowType)) {
				errormsg.add("Error: Type of method " + m.name + " in this expression is ambigous. " 
			+ "Please make sure each method is declared exactly once.");
			}
			// if it's not boolean type
			else if (varMap.containsKey(m.name) && !(varMap.get(m.name).a instanceof types.MethodType)) {
				errormsg.add("Error: " + m.name + " is not declared as a method.");
			}
		}
	}
	
	// assignment
	@Override
	public void visitAssignment(Assignments a) {
		// typecheck its assigned value first
		TypeChecker assignValuechecker = new TypeChecker();
		a.assignValue.accept(assignValuechecker);
		errormsg.addAll(assignValuechecker.errormsg);
		
		// call infixprinter to check assigned value's type
		InfixPrinter assignValueprinter = new InfixPrinter();
		a.assignValue.accept(assignValueprinter);
		
		// typecheck the index if it's array assignment
		if (a.index != null) {
			TypeChecker indexChecker = new TypeChecker();
			a.index.accept(indexChecker);
			errormsg.addAll(indexChecker.errormsg);
			
			// check to see if the index is integer type
			InfixPrinter indexPrinter = new InfixPrinter();
			a.index.accept(indexPrinter);
			if (!(varMap.get(indexPrinter.infixOutput).a instanceof IntType)) {
				errormsg.add("Error: " + indexPrinter.infixOutput 
						+ " is not integer type, cannot use it as array index value.");
			}
		}
		
		// only when there are no errors on both hand side
		if (errormsg.isEmpty()) {
			// check to see if it's normal variable assignment
			if (a.index == null) {
				if (!varMap.containsKey(a.name)) {
					errormsg.add("Error: variable " + a.name + " has not been declared.");
				}
				else if (varMap.get(a.name).a instanceof RealType && varMap.get(assignValueprinter.infixOutput).a instanceof IntType) {
					
				}
				else if (!(varMap.get(a.name).a.getClass().equals(varMap.get(assignValueprinter.infixOutput).a.getClass()))) {
					errormsg.add("Error: variable " + a.name + " does not have the same type as " 
							+ assignValueprinter.infixOutput + ". Cannot perform this assignment.");
				}
			}
			// if it's array element assignment
			else {
				InfixPrinter indexPrinter = new InfixPrinter();
				a.index.accept(indexPrinter);
				
				if (!varMap.containsKey(a.name)) {
					errormsg.add("Error: variable " + a.name + " has not been declared.");
				}
				// no error if assign integer to real
				else if (varMap.get(a.name).a instanceof RealArray && varMap.get(assignValueprinter.infixOutput).a instanceof IntType) {
					
				}
				else if ((varMap.get(a.name).a instanceof BoolArray && !(varMap.get(assignValueprinter.infixOutput).a instanceof BoolType))
						|| (varMap.get(a.name).a instanceof IntArray && !(varMap.get(assignValueprinter.infixOutput).a instanceof IntType))
						|| (varMap.get(a.name).a instanceof RealArray && !(varMap.get(assignValueprinter.infixOutput).a instanceof RealType))) {
					errormsg.add("Error: variable " + a.name + "[" + indexPrinter.infixOutput + "]" 
							+ " does not have the same type as " 
							+ assignValueprinter.infixOutput + ". Cannot perform this assignment.");		
				}
			}
		}
	}


	// preconditions
	@Override
	public void visitPreconditions(Preconditions p) {
		// loop the list to type check each contract
		for (int i = 0; i < p.contracts.size(); i++) {
			TypeChecker checker = new TypeChecker();
			p.contracts.get(i).accept(checker);
			errormsg.addAll(checker.errormsg);
		}
	}

	// postconditions
	@Override
	public void visitPostconditions(Postconditions p) {
		// set isPostcondition to true for old keyword type check
		isPostcondition = true;
		// loop the list to type check each contract
		for (int i = 0; i < p.contracts.size(); i++) {
			TypeChecker checker = new TypeChecker();
			p.contracts.get(i).accept(checker);
			errormsg.addAll(checker.errormsg);
		}
		// reset isPostcondition
		isPostcondition = false;
	}

	
	// each contract
	@Override
	public void visitContractExpr(ContractExpr c) {
		// type check the expr
		// Pair<String, Verifier> contract
		TypeChecker checker = new TypeChecker();
		c.contract.b.accept(checker);
		errormsg.addAll(checker.errormsg);
		
		// add the expr to the map if there is no error
		if (errormsg.isEmpty()) {
			if (c.contract.a != null) {
				if (varMap.containsKey(c.contract.a)) {
					errormsg.add("Error: The tag name " + c.contract.a + " has already been used."
							+ " Please change another name.");
				}
				else {
					varMap.put(c.contract.a, new Pair<VarType, Verifier>
						(new TagType(), c.contract.b));
				}
			}
		}
	}

	// local variables
	@Override
	public void visitLocals(Locals l) {
		// List<Verifier> localVars;
		for (int i = 0; i < l.localVars.size(); i++) {
			TypeChecker checker = new TypeChecker();
			l.localVars.get(i).accept(checker);
			errormsg.addAll(checker.errormsg);
		}
	}
	
	
	@Override
	public void visitOlds(Olds o) {
		// if use old keyword outside a method
		if (!isMethod) {
			errormsg.add("Error: You can only use the old keyword inside a method.");
		}
		// if use old keyword outside the postcondition
		else if (!isPostcondition) {
			errormsg.add("Error: You can only use the old keyword in the postcondition.");
		}
		// if the map does not contain the variable
		else if (!varMap.containsKey(o.name)) {
			varMap.put(o.name, new Pair<VarType, Verifier>(new UnknowType(), null));
			errormsg.add("Error: variable " + o.name + " has not been declared.");
		}
		else {
			if (o.type instanceof BoolType) {
				if (!(varMap.get(o.name).a instanceof BoolType)) {
					errormsg.add("Error: variable " + o.name + " is not boolean type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new BoolType(), null));
				}
			}
			else if (o.type instanceof IntType) {
				if (!(varMap.get(o.name).a instanceof IntType)) {
					errormsg.add("Error: variable " + o.name + " is not integer type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new IntType(), null));
				}
			}
			else if (o.type instanceof RealType) {
				if (!(varMap.get(o.name).a instanceof RealType)) {
					errormsg.add("Error: variable " + o.name + " is not real type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new RealType(), null));
				}
			}
			else if (o.type instanceof BoolArray) {
				if (!(varMap.get(o.name).a instanceof BoolArray)) {
					errormsg.add("Error: variable " + o.name + " is not boolean array type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new BoolArray(), null));
				}
			}
			else if (o.type instanceof IntArray) {
				if (!(varMap.get(o.name).a instanceof IntArray)) {
					errormsg.add("Error: variable " + o.name + " is not integer array type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new IntArray(), null));
				}
			}
			else if (o.type instanceof RealArray) {
				if (!(varMap.get(o.name).a instanceof RealArray)) {
					errormsg.add("Error: variable " + o.name + " is not real array type.");
				}
				else {
					InfixPrinter printer = new InfixPrinter();
					o.accept(printer);
					varMap.put(printer.infixOutput, new Pair<VarType, Verifier>(new RealArray(), null));
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void visitNIL(NIL n) {
		if (n.mode instanceof modes.Undeclared) {
			varMap.put(n.name, new Pair<VarType, Verifier>(new UnknowType(), null));
			errormsg.add("Error: variable " + n.name + " has not been declared.");
		}
		else if (n.mode instanceof modes.Declared) {
			varMap.put(n.name, new Pair<VarType, Verifier>(new UnknowType(), null));
			errormsg.add("Error: variable " + n.name + " has boolean type.");
		}
		
	}
}