package verifier.visitor;

import java.util.*;
import org.antlr.v4.runtime.misc.Pair;

import modes.Verification;
import types.*;
import verifier.composite.*;

public class WpCalculator implements Visitor{
	
	

	// substitution map
	public Pair<Verifier, Verifier> substitutePair; 
	
	// precondition
	public Verifier precondition;
	
	// postcondition
	public Verifier postcondition;
	
	// wp list for loops
	public List<Verifier> loopWpList;
	
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
//		if ((v1.name != null) && v1.name.equals("Result")) {
//			return true;
//		}
		
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
			else if (v1 instanceof Results) {
				return v1.name.equals(v2.name);
			}
		}
		return false;
	}
	
	
	// substitution for binary expr
	public void BinaryExprSubstitute(BinaryExpr b, Pair<Verifier, Verifier> p) {
		// substitute left child
		if (isEqual(b.left(), p.a) || isEqual(b.right(), p.a)) {
			// for normal variable
			if (isEqual(b.left(), p.a)) {
				b.children.set(0, p.b);
			}
			
			// substitute right child
			if (isEqual(b.right(), p.a)) {
				b.children.set(1, p.b);
			}
		}
		// do the substitution for array index as well
		else if (b.left() instanceof ArrayVar || b.right() instanceof ArrayVar) {
			if (b.left().index != null) {
				if (isEqual(b.left().index, p.a)) {
					b.left().index = p.b.copy();
				}
			}
			
			if (b.right().index != null) {
				if (isEqual(b.right().index, p.a)) {
					b.right().index = p.b.copy();
				}
			}
		}
		// then recuisively call this method
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
		// do the substitution for array index as well
		else if (u.child instanceof ArrayVar) {
			if (u.child.index != null) {
				if (isEqual(u.child.index, p.a)) {
					u.child.index = p.b.copy();
				}
			}
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
		
		if (a.elseStat != null) {
			postconditionList.add(postcondition.copy());
		}
		
		
		
		// condition list that stores all the conditions for if statement and elseif statement
		List<Verifier> conditionList = new ArrayList<Verifier>();
		
		// add if statement condition
		conditionList.add(((IfStats) a.ifStat).condition.copy());
		
		// add elseif statement condition
		for (int i = 0; i < a.elseifStat.size(); i++) {
			conditionList.add(((ElseifStats) a.elseifStat.get(i)).condition.copy());
		}
		
		
		/* this list will store the preconditions
		 * index 0: if statement precondition
		 * index 1 to size()-2: elseif statement precondition
		 * index size()-1: else statement precondition
		 */ 
		List<Verifier> preconditionList = new ArrayList<Verifier>();
		
		// add the if statement precondition
		preconditionList.add(((IfStats) a.ifStat).condition.copy());
		
		
		/* smallPres will be the small preconditions for each elseif statement
		 * e.g. for the first elseif statement, the precondition will be (Q and not B1 and B2)
		 * then smallPres will be (Q and not B1)
		 */
		Verifier smallPres = new Negation(conditionList.get(0).copy());
		
		for (int i = 0; i < a.elseifStat.size(); i++) {
			preconditionList.add(new Conjunction(smallPres.copy(), conditionList.get(i + 1).copy()));
			smallPres = new Conjunction(smallPres.copy(), new Negation(conditionList.get(i + 1).copy()));
		}
		
		preconditionList.add(smallPres.copy());
		
		/*
		 * create a list to store the wp for each small part
		 * index 0: wp for if statement
		 * index 1 to size-2: wp for elseif statement
		 * index size-1: wp for else statement
		 */
		List<Verifier> wpList = new ArrayList<Verifier>();
		
		// calculate the wp for if statement
		WpCalculator ifCalculator = new WpCalculator(preconditionList.get(0).copy(), 
				postconditionList.get(0).copy());
		a.ifStat.accept(ifCalculator);
		
		// the ifCalculator will return wp(S1, R)
		// create (B => wp(S1, R) and add it to wpList
		wpList.add(new Implication(preconditionList.get(0), ifCalculator.postcondition.copy()));
		
		
		// calculate the elseif statement wp and store it to the list
		for (int i = 0; i < a.elseifStat.size(); i++) {
			
			// elseifcalculator will return wp(S2, R), wp(S3, R), ... based on the number of elseif statement
			WpCalculator elseifCalculator = new WpCalculator(preconditionList.get(i + 1), 
					postconditionList.get(i + 1));
			a.elseifStat.get(i).accept(elseifCalculator);
			
			// create (not B1 and B2) => wp(S2, R)
			wpList.add(new Implication(preconditionList.get(i + 1), elseifCalculator.postcondition.copy()));
		}
		
		
		// the elsecalculator will return wp(S3, R) - the last part of the alternation
		// calculate the else statement wp and store it to the list
		if (a.elseStat != null) {
			WpCalculator elseCalculator = new WpCalculator(preconditionList.get(preconditionList.size() - 1), 
					postconditionList.get(postconditionList.size() - 1));
			a.elseStat.accept(elseCalculator);
			
			wpList.add(new Implication(preconditionList.get(preconditionList.size() - 1), elseCalculator.postcondition.copy()));
		}
		// if there is no else statement, still need to add the wp
		else {
			wpList.add(new Implication(preconditionList.get(preconditionList.size() - 1), 
					postconditionList.get(postconditionList.size()-1)));
		}
	
		// calculate the final wp
		postcondition = wpList.get(0).copy();
		
		for (int i = 1; i < wpList.size(); i++) {
			postcondition = new Conjunction(postcondition.copy(), wpList.get(i));
		}
	}
	
	
	@Override
	public void visitIfStats(IfStats s) {
		// for if statement the small wp should be B => wp(S1, R)
		Verifier wp = postcondition.copy();
		
		// calculate wp(S1, R)
		for (int i = s.ifImps.size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(precondition, wp);
			s.ifImps.get(i).accept(calculator);
			
			wp = calculator.postcondition.copy();
		}
		
		// return the wp(S1, R)
		postcondition = wp.copy();
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// for elseif statement the small wp should be wp(S2, R)
		Verifier wp = postcondition.copy();
		
		// calculate wp(S2, R)
		for (int i = s.elseifImps.size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(precondition, wp);
			s.elseifImps.get(i).accept(calculator);
			
			wp = calculator.postcondition.copy();
		}
		
		// return wp(S2, R)
		postcondition = wp.copy();
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// for else statement, the small wp should be wp(S3, R)
		Verifier wp = postcondition.copy();
		
		// calculate wp(S3, R)
		for (int i = s.elseImps.size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(precondition, wp);
			s.elseImps.get(i).accept(calculator);
			
			wp = calculator.postcondition.copy();
		}
		
		// return wp(S3, R)
		postcondition = wp.copy();
	}
	
	@Override
	public void visitLoops(Loops l) {
		// create the list to store the wp for each step
		List<Verifier> wpList = new ArrayList<Verifier>();
		
		// calculate the five steps seperately
		
		/*
		 * first step: Given precondition Q, the initialization step Sinit establishes LI
		 * {Q} Sinit {I}
		 */
		
		Verifier step1pre = precondition.copy();
		List<Verifier> step1imps = ((InitImp) l.initImp).initImp;		
		
		Verifier step1post = ((InvariantStat) l.invariant).invariant.b.copy();
		
		
		// create the small method
		Methods step1 = new Methods("step1", null, null, step1pre, null, step1imps, step1post, null);
		
		//do the calculation
		WpCalculator first = new WpCalculator(step1pre, step1post);
		step1.accept(first);
		
		wpList.add(first.postcondition.copy());
		
//		// print first step
//		InfixPrinter step1prePrinter = new InfixPrinter();
//		step1pre.accept(step1prePrinter);
//		
//		String step1impsStr = "";
//		for (int i = 0; i < step1imps.size(); i++) {
//			InfixPrinter step1impsPrinter = new InfixPrinter();
//			step1imps.get(i).accept(step1impsPrinter);
//			step1impsStr = step1impsStr + step1impsPrinter.infixOutput;
//		}
//		
//		InfixPrinter step1postPrinter = new InfixPrinter();
//		step1post.accept(step1postPrinter);
//		
//		InfixPrinter wpPrinter1 = new InfixPrinter();
//		wpList.get(0).accept(wpPrinter1);
//		
//		System.out.println("Step 1: \n");
//		System.out.println("{" + step1prePrinter.infixOutput + "}");
//		System.out.println(step1impsStr);
//		System.out.println("{" + step1postPrinter.infixOutput + "}");
//		System.out.println("wp: " + wpPrinter1.infixOutput);
//		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * second step: at the end of Sbody, if not yet to exit, LI is maintained
		 * {I and (not B)} Sbody {I}
		 */
		Verifier step2pre = new Conjunction(((InvariantStat) l.invariant).invariant.b.copy(), new Negation(((ExitCondition) l.exitCondition).condition.copy()));
		List<Verifier> step2imps = ((LoopBody) l.loopBody).loopBodyImps;
		
		
//		List<Verifier> step2imps = new ArrayList<Verifier>();
//		for (int i = 0; i < ((LoopBody) l.loopBody).loopBodyImps.size(); i++) {
//			step2imps.add(((LoopBody) l.loopBody).loopBodyImps.get(i).copy());
//		}
		
		
		
		Verifier step2post = ((InvariantStat) l.invariant).invariant.b.copy();
	
		// create the small method
		Methods step2 = new Methods("step2", null, null, step2pre, null, step2imps, step2post, null);
		
		// do the calculation
		WpCalculator second = new WpCalculator(step2pre, step2post);
		step2.accept(second);
		
		wpList.add(second.postcondition.copy());
		
//		// print second step
//		InfixPrinter step2prePrinter = new InfixPrinter();
//		step2pre.accept(step2prePrinter);
//		
//		String step2impsStr = "";
//		for (int i = 0; i < step2imps.size(); i++) {
//			InfixPrinter step2impsPrinter = new InfixPrinter();
//			step2imps.get(i).accept(step2impsPrinter);
//			step2impsStr = step2impsStr + step2impsPrinter.infixOutput;
//		}
//		
//		InfixPrinter step2postPrinter = new InfixPrinter();
//		step2post.accept(step2postPrinter);
//		
//		InfixPrinter wpPrinter2 = new InfixPrinter();
//		wpList.get(1).accept(wpPrinter2);
//		
//		System.out.println("Step 2: \n");
//		System.out.println("{" + step2prePrinter.infixOutput + "}");
//		System.out.println(step2impsStr);
//		System.out.println("{" + step2postPrinter.infixOutput + "}");
//		System.out.println("wp: " + wpPrinter2.infixOutput);
//		System.out.println();
		
		
		
		
		
		
		
		
		
		
//		/*
//		 * third step: if ready to exit and LI maintained, postcondition R is established
//		 * (I and B) => R
//		 */
		Verifier step3formula = new Implication(new Conjunction(((InvariantStat) l.invariant).invariant.b.copy(), 
				((ExitCondition) l.exitCondition).condition.copy()), postcondition.copy());
		
		wpList.add(step3formula);
		
		
//		InfixPrinter wpPrinter3 = new InfixPrinter();
//		wpList.get(2).accept(wpPrinter3);	
//		
//		System.out.println("Step 3: \n");
//		System.out.println("wp: " + wpPrinter3.infixOutput);
//		System.out.println();
		
		
		
		
		
		
//		/*
//		 * fourth step: given LI, and not yet to exit, Sbody maintains LV as non-negative
//		 * (I and (not B)) Sbody {V >= 0}
//		 */
//		
		Verifier step4pre = new Conjunction(((InvariantStat) l.invariant).invariant.b.copy(), new Negation(((ExitCondition) l.exitCondition).condition.copy()));
		List<Verifier> step4imps = ((LoopBody) l.loopBody).loopBodyImps;
		
//		List<Verifier> step4imps = new ArrayList<Verifier>();
//		for (int i = 0; i < ((LoopBody) l.loopBody).loopBodyImps.size(); i++) {
//			step4imps.add(((LoopBody) l.loopBody).loopBodyImps.get(i).copy());
//		}
		
		
		Verifier step4post = new GreaterOrEqual(((VariantStat) l.variant).variant.b.copy(), new IntConst("0"));
		
		// create the small method
		Methods step4 = new Methods("step4", null, null, step4pre, null, step4imps, step4post, null);
		
		// do the calculation
		WpCalculator fourth = new WpCalculator(step4pre, step4post);
		step4.accept(fourth);
		
		wpList.add(fourth.postcondition.copy());
		
//		// print fourth step
//		InfixPrinter step4prePrinter = new InfixPrinter();
//		step4pre.accept(step4prePrinter);
//		
//		String step4impsStr = "";
//		for (int i = 0; i < step4imps.size(); i++) {
//			InfixPrinter step4impsPrinter = new InfixPrinter();
//			step4imps.get(i).accept(step4impsPrinter);
//			step4impsStr = step4impsStr + step4impsPrinter.infixOutput;
//		}
//		
//		InfixPrinter step4postPrinter = new InfixPrinter();
//		step4post.accept(step4postPrinter);
//		
//		InfixPrinter wpPrinter4 = new InfixPrinter();
//		wpList.get(3).accept(wpPrinter4);
//		
//		System.out.println("Step 4: \n");
//		System.out.println("{" + step4prePrinter.infixOutput + "}");
//		System.out.println(step4impsStr);
//		System.out.println("{" + step4postPrinter.infixOutput + "}");
//		System.out.println("wp: " + wpPrinter4.infixOutput);
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * fifth step: given LI, and not yet to exit, Sbody decrements LV
		 * (I and (not B)) Sbody {V <= V0}
		 */
		
		Verifier step5pre = new Conjunction(((InvariantStat) l.invariant).invariant.b.copy(), new Negation(((ExitCondition) l.exitCondition).condition.copy()));
		// to calculate V0, need to modify Sbody
		List<Verifier> step5imps = new ArrayList<Verifier>();
		step5imps.add(new Assignments("variant", ((VariantStat) l.variant).variant.b.copy()));
		
		for (int i = 0; i < ((LoopBody) l.loopBody).loopBodyImps.size(); i++) {
			step5imps.add(((LoopBody) l.loopBody).loopBodyImps.get(i).copy());
		}
		
		Verifier step5post = new LessThan(((VariantStat) l.variant).variant.b.copy(), new IntVar("variant", new Verification()));
		
		// create the small method
		Methods step5 = new Methods("step5", null, null, step5pre, null, step5imps, step5post, null);
		
		// do the calculation
		WpCalculator fifth = new WpCalculator(step5pre, step5post);
		step5.accept(fifth);
		
		wpList.add(fifth.postcondition.copy());
	

		
		
		loopWpList = new ArrayList<Verifier>(wpList);
		
		
//		// print fifth step
//		InfixPrinter step5prePrinter = new InfixPrinter();
//		step5pre.accept(step5prePrinter);
//		
//		String step5impsStr = "";
//		for (int i = 0; i < step5imps.size(); i++) {
//			InfixPrinter step5impsPrinter = new InfixPrinter();
//			step5imps.get(i).accept(step5impsPrinter);
//			step5impsStr = step5impsStr + step5impsPrinter.infixOutput + "\n";
//		}
//		
//		InfixPrinter step5postPrinter = new InfixPrinter();
//		step5post.accept(step5postPrinter);
//		
//		InfixPrinter wpPrinter5 = new InfixPrinter();
//		wpList.get(4).accept(wpPrinter5);
//		
//		System.out.println("Step 5: \n");
//		System.out.println("{" + step5prePrinter.infixOutput + "}");
//		System.out.println(step5impsStr);
//		System.out.println("{" + step5postPrinter.infixOutput + "}");
//		System.out.println("wp: " + wpPrinter5.infixOutput);
		
//		// calculate the final wp
//		postcondition = wpList.get(0).copy();
//		
//		for (int i = 1; i < wpList.size(); i++) {
//			postcondition = new Conjunction(postcondition, wpList.get(i));
//		}
	}

	@Override
	public void visitInitImp(InitImp s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitInvariantStat(InvariantStat s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitExitCondition(ExitCondition s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLoopBody(LoopBody s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitVariantStat(VariantStat s) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void visitMethods(Methods m) {
		Verifier wp = postcondition.copy();
		
		// do the calculation
		for (int i = m.implementations.size() - 1; i >= 0; i--) {
			WpCalculator calculator = new WpCalculator(precondition.copy(), wp);
			m.implementations.get(i).accept(calculator);
			
			wp = calculator.postcondition.copy();
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
