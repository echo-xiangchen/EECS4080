package expr.visitor;


import expr.composite.*;

import java.util.*;
import types.*;

public class TypeChecker implements Visitor{
	// hashmap for type checking
	public static Map<String, VarType> varMap =  new HashMap<String, VarType>();
	
	
	// error message
	public List<String> errormsg;
	
	
	// constructor
	public TypeChecker() {
		errormsg = new ArrayList<String>();
	}
	
	
	
	
	// type checker for binary relational expr
	// e.g. =, >, <, >=, <=
	public void relationalBinaryChecker(Expr e) {
		TypeChecker leftChecker = new TypeChecker();
		TypeChecker rightChecker = new TypeChecker();
		
		e.left().accept(leftChecker);
		e.right().accept(rightChecker);
		
		PrettyPrinter leftPrinter = new PrettyPrinter();
		PrettyPrinter rightPrinter = new PrettyPrinter();
		
		e.left().accept(leftPrinter);
		e.right().accept(rightPrinter);
		
		PrettyPrinter printer = new PrettyPrinter();
		e.accept(printer);
		
		
		errormsg.addAll(leftChecker.errormsg);
		errormsg.addAll(rightChecker.errormsg);
		
		// if left child is not int type of real type
		if (!(varMap.get(leftPrinter.output) instanceof types.IntType)) {
			
			
			varMap.put(leftPrinter.output, new UnknowType());
			errormsg.add(leftPrinter.output + " is not integer type. " 
					+ printer.output + " is not type correct.");
			
		}
		
		// if right child is not int type of real type
		if (!(varMap.get(rightPrinter.output) instanceof types.IntType)) {
			varMap.put(rightPrinter.output, new UnknowType());
			errormsg.add(rightPrinter.output + " is not integer type. "
					+ printer.output + " is not type correct.");
		}
		
		// if left and right child are both arithmetic type (no type error)
		// add this expr to the varmap
		else {
			varMap.put(printer.output, new BoolType());
		}
	}
	
	// type checker for binary arithmetic expr
	// e.g. +, -, *, /
	public void arithmeticBinaryChecker(Expr e) {
		TypeChecker leftChecker = new TypeChecker();
		TypeChecker rightChecker = new TypeChecker();
		
		e.left().accept(leftChecker);
		e.right().accept(rightChecker);
		
		PrettyPrinter leftPrinter = new PrettyPrinter();
		PrettyPrinter rightPrinter = new PrettyPrinter();
		
		e.left().accept(leftPrinter);
		e.right().accept(rightPrinter);
		
		PrettyPrinter printer = new PrettyPrinter();
		e.accept(printer);
		
		
		errormsg.addAll(leftChecker.errormsg);
		errormsg.addAll(rightChecker.errormsg);
		
		// if left child is not int type 
		if (!(varMap.get(leftPrinter.output) instanceof types.IntType)) {
			
			varMap.put(leftPrinter.output, new UnknowType());
			errormsg.add(leftPrinter.output + " is not integer type. " 
					+ printer.output + " is not type correct.");
		}
		
				
		// if right child is not int type or real type
		if (!(varMap.get(rightPrinter.output) instanceof types.IntType)) {
			
			varMap.put(rightPrinter.output, new UnknowType());
			errormsg.add(rightPrinter.output + " is not integer type. "
					+ printer.output + " is not type correct.");
		}
		
		
		// if both left and right child are int type, the whole expr will be int type
		else {
			varMap.put(printer.output, new IntType());
		}
	}
	

	
	
	// arithmetic equal (==)
	@Override
	public void visitEqual(Equal e) {
		relationalBinaryChecker(e);
	}

	// arithmetic greater than (>)
	@Override
	public void visitLessThan(LessThan e) {
		relationalBinaryChecker(e);
	}

	

	

	// arithmetic add (+)
	@Override
	public void visitAddition(Addition e) {
		arithmeticBinaryChecker(e);
	}


	// arithmetic multiply (*)
	@Override
	public void visitMultiplication(Multiplication e) {
		arithmeticBinaryChecker(e);
	}
	

	// int number constant
	@Override
	public void visitNum(Num c) {
		if (!varMap.containsKey(c.name)) {
			varMap.put(c.name, new IntType());
		}
	}
}
