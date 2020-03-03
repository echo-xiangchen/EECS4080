package verifier.visitor;

import java.util.*;

import verifier.composite.*;

public class WpCalculator implements Visitor{
	
	public static Map<String, String> substituteMap = new LinkedHashMap<String, String>();

	@Override
	public void visitAssignment(Assignments a) {
		PrefixPrinter printer = new PrefixPrinter();
		a.assignValue.accept(printer);
		substituteMap.put(a.name, printer.prefixOutput);
	}
	
	
	@Override
	public void visitMethods(Methods m) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void visitNot(Negation e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitAnd(Conjunction e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitOr(Disjunction e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitImplies(Implication e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitIff(Iff e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitEqual(Equal e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitLessThan(LessThan e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitAddition(Addition e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitDivision(Division e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitBoolVar(BoolVar v) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitIntVar(IntVar v) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitRealVar(RealVar realVar) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitBoolTrue(BoolTrue c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitIntConst(IntConst c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitRealConst(RealConst c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitForall(Forall q) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitExists(Exists q) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
	}

















	

}
