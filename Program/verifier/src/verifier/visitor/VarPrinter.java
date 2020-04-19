package verifier.visitor;

import org.antlr.v4.runtime.misc.Pair;

import modes.UninitializedDecl;
import verifier.composite.*;

import java.util.*;

public class VarPrinter implements Visitor {
	
	// Map<name, Pair<type, value>>

	// map that stores all the declared variables
	public static Map<String, Pair<String, String>> allVarMap = new LinkedHashMap<String, Pair<String,String>>();  
		
	// hashmap that only store the unused variables
	public static Map<String, Pair<String, String>> unusedVarMap = new LinkedHashMap<String, Pair<String,String>>();
	
	// hashmap that store the array count
	public static Map<String, String> arrayCount = new LinkedHashMap<String, String>();
	
	// hashmap that stores the name and the object
	public static Map<String, Verifier> objMap = new LinkedHashMap<String, Verifier>();
	
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
	
	
	/* *****************************************************************************************
	 * TODO normal Var
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitVarLists(VarLists v) {
		if (v.mode instanceof modes.QuantificationList) {
			for (int i = 0; i < v.varDeclList.size(); i++) {
				VarPrinter printer = new VarPrinter();
				v.varDeclList.get(i).accept(printer);
			}
		}
		
	}

	@Override
	public void visitBoolVar(BoolVar v) {
		// uninitialized declaration
		// e.g. p : BOOLEAN
		
		// and quantification declaration
		// e.g. forall p : BOOLEAN; | not p
		if((v.mode instanceof modes.UninitializedDecl) || (v.mode instanceof modes.QuantifyBool)) {
			// add the mode to both allVarMap and unusedVarMap
			allVarMap.put(v.name, new Pair<String, String>("BOOLEAN", null));
			unusedVarMap.put(v.name, new Pair<String, String>("BOOLEAN", null));
		}
		// verification
		// e.g. verify p => q
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
			
			// add the current object to the map
			objMap.put(v.name, v);
		}
		// initialized declaration
		// e.g. p : BOOLEAN = not q
		else if (v.mode instanceof modes.InitializedDecl) {
			VarPrinter printer = new VarPrinter();
			v.value.accept(printer);
			
			
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("BOOLEAN", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("BOOLEAN", h.infixOutput));
		}
		else if (v.mode instanceof modes.AnonymousDecl) {
			objMap.put(v.name, v);
		}
	}

	
	// int number
	@Override
	public void visitIntVar(IntVar v) {
		// uninitialized declaration
		// e.g. j : INTEGER
	
		// and quantification declaration
		// e.g. forall j: INTEGER; | i > 0
		if((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyInt)) {	
			allVarMap.put(v.name, new Pair<String, String>("INTEGER", null));
			unusedVarMap.put(v.name, new Pair<String, String>("INTEGER", null));
		}
		// verification
		// e.g. verify p > 0
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
			
			// add the current object to the map
			objMap.put(v.name, v);
		}
		// initialized declaration
		// e.g. i: INTEGER = 2
		else if (v.mode instanceof modes.InitializedDecl) {
			VarPrinter printer = new VarPrinter();
			v.value.accept(printer);
			
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
					
			allVarMap.put(v.name, new Pair<String, String>("INTEGER", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("INTEGER", h.infixOutput));
		}
		else if (v.mode instanceof modes.AnonymousDecl) {
			objMap.put(v.name, v);
		}
	}
	
	// Real number
	@Override
	public void visitRealVar(RealVar v) {
		// uninitialized declaration
		// e.g. i : REAL
				
		// and quantification declaration
		// e.g. forall i : REAL; @ i > 0
		if((v.mode instanceof modes.UninitializedDecl) ||  (v.mode instanceof modes.QuantifyReal)) {	
			allVarMap.put(v.name, new Pair<String, String>("REAL", null));
			unusedVarMap.put(v.name, new Pair<String, String>("REAL", null));
		}
		// verification
		// e.g. verify j >= 0
		else if (v.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(v.name)) {
				unusedVarMap.remove(v.name);
			}
			
			// add the current object to the map
			objMap.put(v.name, v);
		}
		// initialized declaration
		// e.g. i : REAL = 2.1
		else if (v.mode instanceof modes.InitializedDecl) {
			VarPrinter printer = new VarPrinter();
			v.value.accept(printer);
			
			InfixPrinter h = new InfixPrinter();
			v.value.accept(h);
							
			allVarMap.put(v.name, new Pair<String, String>("REAL", h.infixOutput));
			unusedVarMap.put(v.name, new Pair<String, String>("REAL", h.infixOutput));
		}
		else if (v.mode instanceof modes.AnonymousDecl) {
			objMap.put(v.name, v);
		}
	}
	
	/* *****************************************************************************************
	 * TODO Array Var
	 * *****************************************************************************************
	 */
	
	// boolean array
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[BOOLEAN]		
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
			
			// add the current object to the map
			objMap.put(a.name, a);
		}
		// initialized declaration
		// e.g. a : ARRAY[BOOLEAN] = << p, q, p and q >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
		}
		else if (a.mode instanceof modes.Assignment) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.replace(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
			unusedVarMap.replace(a.name, new Pair<String, String>("ARRAY[BOOLEAN]", value));
		}
		else if (a.mode instanceof modes.AnonymousDecl) {
			objMap.put(a.name, a);
		}
	}
	
	// Integer array
	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[INTEGER]
				
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
			
			// add the current object to the map
			objMap.put(a.name, a);
		}
		// initialized declaration
		// e.g. a : ARRAY[INTEGER] = << 1, 2, 6, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
				
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
		}
		else if (a.mode instanceof modes.Assignment) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.replace(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
			unusedVarMap.replace(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
		}
		else if (a.mode instanceof modes.AnonymousDecl) {
			objMap.put(a.name, a);
		}
	}

	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		// uninitialized declaration
		// e.g. a : ARRAY[REAL]
				
		if(a.mode instanceof modes.UninitializedDecl) {	
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", null));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", null));
		}
		// verification
		// e.g. verify a[1]
		else if (a.mode instanceof modes.Verification) {
			// delete the variable if it has been used
			if (unusedVarMap.containsKey(a.name)) {
				unusedVarMap.remove(a.name);
			}
			
			// add the current object to the map
			objMap.put(a.name, a);
		}
		// initialized declaration
		// e.g. a : ARRAY[REAL] = << 1.5, 2, 6.0, 0 >>
		else if (a.mode instanceof modes.InitializedDecl) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
				
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", value));
			unusedVarMap.put(a.name, new Pair<String, String>("ARRAY[REAL]", value));
		}
		else if (a.mode instanceof modes.Assignment) {
			String value = "<< ";
			arrayCount.put(a.name, String.valueOf(a.arrayValue.size()));
			
			for (int i = 0; i < a.arrayValue.size(); i++) {
				// use infixprinter to output the element value
				InfixPrinter p = new InfixPrinter();
				a.arrayValue.get(i).accept(p);
				value = value + p.infixOutput + ", ";
				
				// for every element in the list, call varPrinter to removed used variable
				VarPrinter p2 = new VarPrinter();
				a.arrayValue.get(i).accept(p2);
			}
			value = value.substring(0, value.length() - 2) + " >>";
			allVarMap.replace(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
			unusedVarMap.replace(a.name, new Pair<String, String>("ARRAY[INTEGER]", value));
		}
		else if (a.mode instanceof modes.AnonymousDecl) {
			objMap.put(a.name, a);
		}
	}
	
	
	/* *****************************************************************************************
	 * TODO Pair Var
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitPair(PairVar p) {
		if (p.mode instanceof modes.UninitializedDecl) {
			VarPrinter leftPrinter = new VarPrinter();
			VarPrinter rightPrinter = new VarPrinter();
			
			p.left().accept(leftPrinter);
			p.right().accept(rightPrinter);
			allVarMap.put(p.name, new Pair<String, String>("PAIR[" + p.left().name + " : " + allVarMap.get(p.left().name).a
					+ " ; " + p.right().name + " : " + allVarMap.get(p.right().name).a + "]", null)); 
			unusedVarMap.put(p.name, new Pair<String, String>("PAIR[" + p.left().name + " : " + allVarMap.get(p.left().name).a
					+ " ; " + p.right().name + " : " + allVarMap.get(p.right().name).a + "]", null));
		}
		else if (p.mode instanceof modes.Verification) {
			// delete the variable if it has been used
			if (unusedVarMap.containsKey(p.name)) {
				unusedVarMap.remove(p.name);
			}
			// remove the pair element as well
			if (p.element.equals("first")) {
				if (unusedVarMap.containsKey(TypeChecker.pairMap.get(p.name).a.name)) {
					unusedVarMap.remove(TypeChecker.pairMap.get(p.name).a.name);
				}
			}
			else if (p.element.equals("second")) {
				if (unusedVarMap.containsKey(TypeChecker.pairMap.get(p.name).b.name)) {
					unusedVarMap.remove(TypeChecker.pairMap.get(p.name).b.name);
				}
			}
			else {
				if (unusedVarMap.containsKey(p.element)) {
					unusedVarMap.remove(p.element);
				}
			}
		}
	}
	
	@Override
	public void visitBoolTrue(BoolTrue c) {
		
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		
	}
	
	@Override
	public void visitIntConst(IntConst c) {
		if (c.isArray) {
			// delete the mode if it has been used
			if (unusedVarMap.containsKey(c.name)) {
				unusedVarMap.remove(c.name);
			}
		}
	}

	@Override
	public void visitRealConst(RealConst c) {
		
	}

	
	
	
	/* *****************************************************************************************
	 * TODO Methods
	 * *****************************************************************************************
	 */
	

	@Override
	public void visitMethods(Methods m) {
		if (m.mode instanceof modes.Declaration) {
			// call the varprinter to print the parameters
			if (m.parameters != null) {
				for (int i = 0; i < m.parameters.size(); i++) {
					VarPrinter p = new VarPrinter();
					m.parameters.get(i).accept(p);
				}
			}
			
			// call the varprinter to print the return value
			if (m.returnValue != null) {
				VarPrinter p = new VarPrinter();
				m.returnValue.accept(p);
			}
			
			// call the varprinter to print the preconditions
			VarPrinter preChecker = new VarPrinter();
			m.precondition.accept(preChecker);
			
			// call the varprinter to print the local variables
			if (m.locals != null) {
				VarPrinter localPrinter = new VarPrinter();
				m.locals.accept(localPrinter);
			}
		
			// call the varprinter to print the implementations
			for (int i = 0; i < m.implementations.size(); i++) {
				VarPrinter p = new VarPrinter();
				m.implementations.get(i).accept(p);
			}
			
			// call the varprinter to print the postconditions
			VarPrinter postChecker = new VarPrinter();
			m.postcondition.accept(postChecker);
		}
	}

	@Override
	public void visitPreconditions(Preconditions p) {
		// loop the list to print each contract
		for (int i = 0; i < p.contracts.size(); i++) {
			VarPrinter printer = new VarPrinter();
			p.contracts.get(i).accept(printer);
		}
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// loop the list to print each contract
		for (int i = 0; i < p.contracts.size(); i++) {
			VarPrinter printer = new VarPrinter();
			p.contracts.get(i).accept(printer);
		}
	}

	@Override
	public void visitContractExpr(ContractExpr c) {
		// print the expr
		// Pair<String, Verifier> contract
		VarPrinter checker = new VarPrinter();
		c.contract.b.accept(checker);
	}
	
	/* *****************************************************************************************
	 * TODO Implementations
	 * *****************************************************************************************
	 */
	
	@Override
	public void visitAssignment(Assignments a) {
		// delete the variable if it has been used
		if (unusedVarMap.containsKey(a.name)) {
			unusedVarMap.remove(a.name);
		}
		
		// set the variables in the assigned value "used"
		VarPrinter assignValuePrinter = new VarPrinter();
		a.assignValue.accept(assignValuePrinter);
		
	}
	
	@Override
	public void visitAlternations(Alternations a) {
		// print the if statement
		VarPrinter ifPrinter = new VarPrinter();
		a.ifStat.accept(ifPrinter);
		
		// print the elseif statement
		for (int i = 0; i < a.elseifStat.size(); i++) {
			VarPrinter elseifPrinter = new VarPrinter();
			a.elseifStat.get(i).accept(elseifPrinter);
		}
		
		// print the else statement if it's not null
		if (a.elseStat != null) {
			VarPrinter elsePrinter = new VarPrinter();
			a.elseStat.accept(elsePrinter);
		}
		
	}
	
	@Override
	public void visitIfStats(IfStats s) {
		// print the condition first
		VarPrinter exprPrinter = new VarPrinter();
		s.condition.accept(exprPrinter);
		
		// print the implementations
		for (int i = 0; i < s.ifImps.size(); i++) {
			VarPrinter ifimpPrinter = new VarPrinter();
			s.ifImps.get(i).accept(ifimpPrinter);
		}
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// print the condition first
		VarPrinter exprPrinter = new VarPrinter();
		s.condition.accept(exprPrinter);
		
		// print the implementations
		for (int i = 0; i < s.elseifImps.size(); i++) {
			VarPrinter elseifimpPrinter = new VarPrinter();
			s.elseifImps.get(i).accept(elseifimpPrinter);
		}
		
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// print the implementations
		for (int i = 0; i < s.elseImps.size(); i++) {
			VarPrinter elsePrinter = new VarPrinter();
			s.elseImps.get(i).accept(elsePrinter);
		}
	}
	
	@Override
	public void visitLoops(Loops l) {
		// print initial implementation
		VarPrinter initPrinter = new VarPrinter();
		l.initImp.accept(initPrinter);
		
		
		// print invariant
		VarPrinter invariantPrinter = new VarPrinter();
		l.invariant.accept(invariantPrinter);
		
		
		// print exitcondition
		VarPrinter exitPrinter = new VarPrinter();
		l.exitCondition.accept(exitPrinter);
		
		
		//print loopbody
		VarPrinter loopbodyPrinter = new VarPrinter();
		l.loopBody.accept(loopbodyPrinter);
		
		
		// print variant
		VarPrinter variantPrinter = new VarPrinter();
		l.variant.accept(variantPrinter);
	}

	@Override
	public void visitInitImp(InitImp s) {
		// print the implementations
		for (int i = 0; i < s.initImp.size(); i++) {
			VarPrinter initImpPrinter = new VarPrinter();
			s.initImp.get(i).accept(initImpPrinter);
		}
	}

	@Override
	public void visitInvariantStat(InvariantStat s) {
		// print the expr first
		// Pair<String, Verifier> invariant
		VarPrinter invariantPrinter = new VarPrinter();
		s.invariant.b.accept(invariantPrinter);
	}

	@Override
	public void visitExitCondition(ExitCondition s) {
		// print the expr
		VarPrinter exitPrinter = new VarPrinter();
		s.condition.accept(exitPrinter);
	}

	@Override
	public void visitLoopBody(LoopBody s) {
		// print the implementations
		for (int i = 0; i < s.loopBodyImps.size(); i++) {
			VarPrinter initImpPrinter = new VarPrinter();
			s.loopBodyImps.get(i).accept(initImpPrinter);
		}
	}

	@Override
	public void visitVariantStat(VariantStat s) {
		// typecheck the expr first
		// Pair<String, Verifier> variant;
		VarPrinter variantPrinter = new VarPrinter();
		s.variant.b.accept(variantPrinter);
		
		// create the obj to the map
		objMap.put("variant", new IntVar("variant", new UninitializedDecl()));
	}
	
	/* *****************************************************************************************
	 * TODO Keywords
	 * *****************************************************************************************
	 */

	@Override
	public void visitLocals(Locals l) {
		// List<Verifier> localVars;
		for (int i = 0; i < l.localVars.size(); i++) {
			VarPrinter checker = new VarPrinter();
			l.localVars.get(i).accept(checker);
		}
	}
	
	
	@Override
	public void visitOlds(Olds o) {
		allVarMap.put("old_" + o.name, allVarMap.get(o.name));
	}
	
	@Override
	public void visitResults(Results r) {
		objMap.put("Result", new Results());
	}
	
	
	
	
	
	@Override
	public void visitUnknownVar(UnknownVar n) {
		// TODO Auto-generated method stub
	}
	
}
