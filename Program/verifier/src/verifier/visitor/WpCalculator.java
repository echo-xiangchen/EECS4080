package verifier.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.parse.ANTLRParser.finallyClause_return;
import org.antlr.v4.runtime.misc.Pair;

import modes.Verification;
import types.BoolArray;
import types.IntArray;
import types.RealArray;
import verifier.composite.*;

public class WpCalculator implements Visitor{
	
	

	// substitution map
	public Pair<Verifier, Verifier> substitutePair; 
	
	// precondition
	public Verifier precondition;
	
	// postcondition
	public Verifier postcondition;
	
	// TODO Constructors
	// the wpcalculator constructor
	public WpCalculator(Verifier precondition, Verifier postcondition) {
		this.precondition = precondition;
		this.postcondition = postcondition;
		this.substitutePair = null;
	}
		
		// the object substitution
	public WpCalculator(Verifier precondition, Verifier postcondition, Pair<Verifier, Verifier> substitutePair) {
		this.precondition = precondition;
		this.postcondition = postcondition;
		this.substitutePair = substitutePair;
	}
	
	
	/* *****************************************************************************************
	 * TODO helper methods
	 * *****************************************************************************************
	 */
	
	// compare to see if two Verifier obj is equal
	public boolean isEqual(Verifier v1,Verifier v2) {
		// if one of them are null, return false
		if (v1 == null || v2 == null) {
			return false;
		}
		
		// if they are same obj, return true
		if (v1 == v2) {
			return true;
		}
		
		// if it's result assignment
		if ((v1.name != null) && v1.name.equals("Result")) {
			return true;
		}
		
		// if they have the same class
		if (v1.getClass().equals(v2.getClass())) {
			// check if they are expressions
			if (v1 instanceof Expr) {
				if (v1 instanceof BinaryExpr) {
					return isEqual(v1.left(), v2.left()) && isEqual(v1.right(), v2.right());
				}
				else {
					return isEqual(v1.child, v2.child);
				}
			}
			// check if they are normal variable
			else if (v1 instanceof Var) {
				if (v1 instanceof ArrayVar) {
					return v1.name.equals(v2.name) && isEqual(v1.index, v2.index);
				}
				else {
					return v1.name.equals(v2.name);
				}
			}
		}
		return false;
	}
	
	
	// substitution for binary expr
	public void BinaryExprSubstitute(BinaryExpr b, Pair<Verifier, Verifier> p) {
		// substitute left child
		if (isEqual(b.left(), p.a) || isEqual(b.right(), p.a)) {
			if (isEqual(b.left(), p.a)) {
				b.children.set(0, p.b);
			}
			
			// substitute right child
			if (isEqual(b.right(), p.a)) {
				b.children.set(1, p.b);
			}
		}
		else {
			WpCalculator leftCalculator = new WpCalculator(precondition, postcondition, substitutePair);
			b.left().accept(leftCalculator);
			
			WpCalculator rightCalculator = new WpCalculator(precondition, postcondition, substitutePair);
			b.right().accept(rightCalculator);
		}
	}
	
	// substitution for unary expr
	public void UnaryExprSubstitute(UnaryExpr u, Pair<Verifier, Verifier> p) {
		// substitute child
		if (isEqual(u.child, p.a)) {
			u.child = p.b;
		}
		else {
			WpCalculator calculator = new WpCalculator(precondition, postcondition, substitutePair);
			u.child.accept(calculator);
		}
	}
	
	// substitution for quantifications
	public void QuantificationSubstitute(Quantification q, Pair<Verifier, Verifier> p) {
		WpCalculator calculator = new WpCalculator(precondition, postcondition, substitutePair);
		q.expr.accept(calculator);
	}
	
	// substitution for normal variables
	public void VarSubstitute(Var v, Pair<Verifier, Verifier> p) {
		if (isEqual(v, p.a)) {
			v = (Var) p.b;
		}
	}
	
//	/*
//	 * helper method for copying the verifier obj (from v1 to v2)
//	 */
//	public Verifier copy(Verifier v1) {
//		if (v1 instanceof Negation) {
//			return new Negation(copy(v1.child));
//		}
//		else if (v1 instanceof Conjunction) {
//			return new Conjunction(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Disjunction) {
//			return new Disjunction(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Implication) {
//			return new Implication(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Iff) {
//			return new Iff(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Equal) {
//			return new Equal(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof GreaterThan) {
//			return new GreaterThan(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof LessThan) {
//			return new LessThan(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof GreaterOrEqual) {
//			return new GreaterOrEqual(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof LessOrEqual) {
//			return new LessOrEqual(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Addition) {
//			return new Addition(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Subtraction) {
//			return new Subtraction(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Multiplication) {
//			return new Multiplication(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Division) {
//			return new Division(copy(v1.left()), copy(v1.right()));
//		}
//		else if (v1 instanceof Forall) {
//			Forall v = (Forall) v1;
//			List<Verifier> list = new ArrayList<Verifier>();
//			for (int i = 0; i < v.quantifyList.size(); i++) {
//				list.add(copy(v.quantifyList.get(i)));
//			}
//			return new Forall(list, copy(((Forall) v1).expr));
//		}
//		else if (v1 instanceof Exists) {
//			Exists v = (Exists) v1;
//			List<Verifier> list = new ArrayList<Verifier>();
//			for (int i = 0; i < v.quantifyList.size(); i++) {
//				list.add(copy(v.quantifyList.get(i)));
//			}
//			return new Exists(list, copy(((Forall) v1).expr));
//		}
//		else if (v1 instanceof BoolVar) {
//			return new BoolVar(((BoolVar) v1).name, new Verification());
//		}
//		else if (v1 instanceof IntVar) {
//			return new IntVar(((IntVar) v1).name, new Verification());
//		}
//		else if (v1 instanceof RealVar) {
//			return new RealVar(((RealVar) v1).name, new Verification());
//		}
//		else if (v1 instanceof BoolArrayVar) {
//			return new BoolArrayVar(v1.name, new Verification(), copy(v1.index));
//		}
//		else if (v1 instanceof IntArrayVar) {
//			return new IntArrayVar(((IntArrayVar) v1).name, new Verification(), copy(v1.index));
//		}
//		else if (v1 instanceof RealArrayVar) {
//			return new RealArrayVar(((RealArrayVar) v1).name, new Verification(), copy(v1.index));
//		}
//		else if (v1 instanceof BoolTrue) {
//			return new BoolTrue(v1.name);
//		}
//		else if (v1 instanceof BoolFalse) {
//			return new BoolFalse(v1.name);
//		}
//		else if (v1 instanceof Olds) {
//			if (v1.index != null) {
//				return new Olds(v1.name, copy(v1.index), ((Olds) v1).type);
//			}
//			else {
//				return new Olds(v1.name, ((Olds) v1).type);
//			}
//		}
//		else if (v1 instanceof Results) {
//			if (v1.index != null) {
//				return new Results(copy(v1.index));
//			}
//			else {
//				return new Results();
//			}
//		}
//		return null;
//	}
	
	// assignments
	@Override
	public void visitAssignment(Assignments a) {
		Verifier var = null;
		
		// it's array element assignment
		if (a.index != null) {
			if (TypeChecker.varMap.get(a.name).a instanceof BoolArray) {
				var = new BoolArrayVar(a.name, new Verification(), a.index);
			}
			else if (TypeChecker.varMap.get(a.name).a instanceof IntArray) {
				var = new IntArrayVar(a.name, new Verification(), a.index);
			}
			else if (TypeChecker.varMap.get(a.name).a instanceof RealArray) {
				var = new RealArrayVar(a.name, new Verification(), a.index);
			}
			// set up the substitutePair
			substitutePair = new Pair<Verifier, Verifier>(var, a.assignValue);
			
			// do the substitution
			WpCalculator calculator = new WpCalculator(precondition, postcondition, substitutePair);
			postcondition.accept(calculator);
		}
		
		// if it's normal variable assignment
		else {
			var = VarPrinter.objMap.get(a.name);
			
			// set up the substitutePair
			substitutePair = new Pair<Verifier, Verifier>(var, a.assignValue);
			
			// do the substitution
			WpCalculator calculator = new WpCalculator(precondition, postcondition, substitutePair);
			postcondition.accept(calculator);
		}
	}
	
	// if-else statement
	// to prove {Q} if B then S1 else S2 end {R}
	// need to prove ({Q and B} S1 {R}) and ({Q and not B} s2 {R})
	@Override
	public void visitAlternations(Alternations a) {
		// TODO store the postcondition first for future usage
		List<Verifier> postconditionList = new ArrayList<Verifier>();
		
		postconditionList.add(postcondition.copy());
		
		for (int i = 0; i < a.elseifStat.size(); i++) {
			postconditionList.add(postcondition.copy());
		}
		
		postconditionList.add(postcondition.copy());
		
		
		//Verifier R = copy(postcondition);
		
		
		// condition list that stores all the conditions for if statement and elseif statement
		List<Verifier> conditionList = new ArrayList<Verifier>();
		
		// add if statement condition
		conditionList.add(((IfStats) a.ifStat).condition);
		
		// add elseif statement condition
		for (int i = 0; i < a.elseifStat.size(); i++) {
			conditionList.add(((ElseifStats) a.elseifStat.get(i)).condition);
		}
		
		
		/* this list will store the preconditions
		 * index 0: if statement precondition
		 * index 1 to size()-2: elseif statement precondition
		 * index size()-1: else statement precondition
		 */ 
		List<Verifier> preconditionList = new ArrayList<Verifier>();
		
		// add the if statement precondition
		preconditionList.add(new Conjunction(precondition, ((IfStats) a.ifStat).condition));
		
		/* smallPres will be the small preconditions for each elseif statement
		 * e.g. for the first elseif statement, the precondition will be (Q and not B1 and B2)
		 * then smallPres will be (Q and not B1)
		 */
		Verifier smallPres = new Conjunction(precondition, new Negation(conditionList.get(0)));
		
		for (int i = 0; i < a.elseifStat.size(); i++) {
			preconditionList.add(new Conjunction(smallPres, conditionList.get(i + 1)));
			smallPres = new Conjunction(smallPres, new Negation(conditionList.get(i + 1)));
		}
		
		preconditionList.add(smallPres);
		
		
		/*
		 * create a list to store the wp for each small part
		 * index 0: wp for if statement
		 * index 1 to size-2: wp for elseif statement
		 * index size-1: wp for else statement
		 */
		List<Verifier> wpList = new ArrayList<Verifier>();
		
		// calculate the wp for if statement
		WpCalculator ifCalculator = new WpCalculator(preconditionList.get(0), postconditionList.get(0));
		a.ifStat.accept(ifCalculator);
		
		// add the wp of if statement to the list
		wpList.add(ifCalculator.postcondition);
		
		// calculate the elseif statement wp and store it to the list
		for (int i = 0; i < a.elseifStat.size(); i++) {
			WpCalculator elseifCalculator = new WpCalculator(preconditionList.get(i + 1), postconditionList.get(i + 1));
			a.elseifStat.get(i).accept(elseifCalculator);
			
			wpList.add(elseifCalculator.postcondition);
		}
		
		// calculate the else statement wp and store it to the list
		if (a.elseStat != null) {
			WpCalculator elseCalculator = new WpCalculator(preconditionList.get(preconditionList.size() - 1), postconditionList.get(postconditionList.size() - 1));
			a.elseStat.accept(elseCalculator);
			
			wpList.add(elseCalculator.postcondition);
		}
		
	
		// calculate the final wp
		postcondition = wpList.get(0);
		
		for (int i = 1; i < wpList.size(); i++) {
			postcondition = new Conjunction(postcondition, wpList.get(i));
		}
	}
	
	
	@Override
	public void visitIfStats(IfStats s) {
		// create the small method
		Methods ifMethod = new Methods("ifMethod", null, null, precondition, null, s.ifImps, postcondition, null);
		
		// do the calculation
		WpCalculator ifCalculator = new WpCalculator(precondition, postcondition);
		ifMethod.accept(ifCalculator);
		
		// store the value
		postcondition = ifCalculator.postcondition;
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// create the small method
		Methods elseifMethod = new Methods("elseifMethod", null, null, precondition, null, s.elseifImps, postcondition, null);
		
		// do the calculation
		WpCalculator elseifCalculator = new WpCalculator(precondition, postcondition);
		elseifMethod.accept(elseifCalculator);
		
		// store the value
		postcondition = elseifCalculator.postcondition;
		
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// create the small method
		Methods elseMethod = new Methods("elseMethod", null, null, precondition, null, s.elseImps, postcondition, null);
		
		// do the calculation
		WpCalculator elseCalculator = new WpCalculator(precondition, postcondition);
		elseMethod.accept(elseCalculator);
		
		postcondition = elseCalculator.postcondition;
	}
	
	
	@Override
	public void visitMethods(Methods m) {
		Verifier wp = postcondition;
		
		// do the calculation
		for (int i = m.implementations.size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(precondition, wp);
			m.implementations.get(i).accept(calculator);
			
			wp = calculator.postcondition;
		}
		
		// generate the final wp
		postcondition = new Implication(precondition, wp);
	}
	
	
	
	
	
	
	
	
	@Override
	public void visitForall(Forall q) {
		QuantificationSubstitute(q, substitutePair);
	}

	@Override
	public void visitExists(Exists q) {
		QuantificationSubstitute(q, substitutePair);
	}
	
	@Override
	public void visitNot(Negation e) {
		UnaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitAnd(Conjunction e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitOr(Disjunction e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitImplies(Implication e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitIff(Iff e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitEqual(Equal e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitLessThan(LessThan e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitAddition(Addition e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitDivision(Division e) {
		BinaryExprSubstitute(e, substitutePair);
	}

	@Override
	public void visitBoolVar(BoolVar v) {
		VarSubstitute(v, substitutePair);
	}

	@Override
	public void visitIntVar(IntVar v) {
		VarSubstitute(v, substitutePair);
	}

	@Override
	public void visitRealVar(RealVar v) {
		VarSubstitute(v, substitutePair);
	}
	
	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		
	}

	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		
	}

	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		
	}

	@Override
	public void visitBoolTrue(BoolTrue c) {
		
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		
	}

	@Override
	public void visitIntConst(IntConst c) {
		
	}

	@Override
	public void visitRealConst(RealConst c) {
		
	}

	

	@Override
	public void visitNIL(NIL n) {
		
	}


	@Override
	public void visitPreconditions(Preconditions p) {
		
	}


	@Override
	public void visitPostconditions(Postconditions p) {
		
	}


	@Override
	public void visitContractExpr(ContractExpr c) {
		
	}


	@Override
	public void visitLocals(Locals l) {
	
	}
	
	@Override
	public void visitOlds(Olds o) {
		
	}
	
	@Override
	public void visitResults(Results r) {
		
	}

	@Override
	public void visitVarLists(VarLists v) {
		
	}
}
