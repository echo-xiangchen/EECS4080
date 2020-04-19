package verifier.visitor;

import verifier.composite.*;

public class WpPrinter implements Visitor{
	
	// two versions of output
	public String infixOutput;
	public String prefixOutput;
	
	public static int indentCount;

	// method that calculate the indentation
	public String indentStr(int indentCount) {
		String indentStr = "";
		
		for (int i = 0; i < indentCount; i++) {
			indentStr = indentStr + "  ";
		}
		return indentStr;
	}
	
	
	public void UnaryPrinter(UnaryExpr u, String op) {
		String indent = indentStr(indentCount);
		
		prefixOutput = prefixOutput.concat(indent + "(" + op + " \n");
		
		// increment indentation
		indentCount++;
		
		WpPrinter printer = new WpPrinter();
		u.child.accept(printer);
		
		String indentChild = indentStr(indentCount);
		
		prefixOutput = prefixOutput.concat(indentChild + printer.prefixOutput + ")\n");
		
		// decrement indentation
		indentCount--;
	}
	
	
	@Override
	public void visitNot(Negation e) {
		UnaryPrinter(e, "not");
	}

	@Override
	public void visitAnd(Conjunction e) {
		
		
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
	public void visitVarLists(VarLists v) {
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
	public void visitUnknownVar(UnknownVar n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitMethods(Methods m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitAssignment(Assignments a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitAlternations(Alternations a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitIfStats(IfStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitElseifStats(ElseifStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitElseStats(ElseStats s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLoops(Loops l) {
		// TODO Auto-generated method stub
		
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
	public void visitPreconditions(Preconditions p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitPostconditions(Postconditions p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitContractExpr(ContractExpr c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLocals(Locals l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitOlds(Olds o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitResults(Results r) {
		// TODO Auto-generated method stub
		
	}

}
