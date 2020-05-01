package verifier.visitor;

import org.antlr.v4.runtime.misc.Pair;

import verifier.composite.*;

public class WpPrinter implements Visitor{
	
	// two versions of output
	public String infixOutput;
	public String prefixOutput;
	
	public static int indentCount;
	
	// prints the variable for quantification declaration
	public String quantifyVar;
	
	// indicates "forall" or "exists"
	public String quantifyIndicator;
	
	// indicates if contains nested quantification
	public static boolean isNestedQuantifier;

	// method that calculate the indentation
	public String indentStr(int indentCount) {
		String indentStr = "";
		
		for (int i = 0; i < indentCount; i++) {
			indentStr = indentStr + "  ";
		}
		return indentStr;
	}
	
	public WpPrinter() {
		infixOutput = "";
		prefixOutput = "";
		quantifyVar = "";
		quantifyIndicator = "";
	}
	
	public void UnaryPrinter(UnaryExpr u, String op) {
		String indent = indentStr(indentCount);
		
		prefixOutput = prefixOutput.concat(indent + "(" + op + " \n");
		
		// increment indentation
		indentCount++;
		
		WpPrinter printer = new WpPrinter();
		u.child.accept(printer);
		// decrement indentation
		indentCount--;
		
		
		prefixOutput = prefixOutput.concat(printer.prefixOutput + ")");
	}
	
	public void BinaryPrinter(BinaryExpr b, String op) {
		String indent = indentStr(indentCount);
		
		prefixOutput = prefixOutput.concat(indent + "(" + op + " \n");
		
		// increment indentation
		indentCount++;
		WpPrinter leftPrinter = new WpPrinter();
		b.left().accept(leftPrinter);
		// decrement indentation
		indentCount--;
		
		// increment indentation
		indentCount++;
		WpPrinter rightPrinter = new WpPrinter();
		b.right().accept(rightPrinter);
		// decrement indentation
		indentCount--;
		
		prefixOutput = prefixOutput.concat(leftPrinter.prefixOutput + " \n" + rightPrinter.prefixOutput + ")");
		
		
	}
	
	public void QuantifyPrinter (Quantification q) {
		String indent = indentStr(indentCount);
		// recursively accept all the variables in the list first
		for (int i = 0; i < q.quantifyList.size(); i++) {
			PrefixPrinter p1 = new PrefixPrinter();
			q.quantifyList.get(i).accept(p1);
			quantifyVar = quantifyVar.concat(p1.quantifyVar);
		}
		//quantifyVar = p1.quantifyVar;
		// then accept the boolexpr next
		indentCount++;
		WpPrinter p2 = new WpPrinter();
		q.expr.accept(p2);
		indentCount--;
		
		prefixOutput = indent + "(" + quantifyIndicator + "(" + quantifyVar + ")" + "\n" + p2.prefixOutput + ")";
		
	}
	
	
	@Override
	public void visitNot(Negation e) {
		UnaryPrinter(e, "not");
	}

	@Override
	public void visitAnd(Conjunction e) {
		BinaryPrinter(e, "and");
	}

	@Override
	public void visitOr(Disjunction e) {
		BinaryPrinter(e, "or");
	}

	@Override
	public void visitImplies(Implication e) {
		BinaryPrinter(e, "=>");
	}

	@Override
	public void visitIff(Iff e) {
		BinaryPrinter(e, "=");
	}

	@Override
	public void visitEqual(Equal e) {
		BinaryPrinter(e, "=");
	}

	@Override
	public void visitGreaterThan(GreaterThan e) {
		BinaryPrinter(e, ">");
	}

	@Override
	public void visitLessThan(LessThan e) {
		BinaryPrinter(e, "<");
	}

	@Override
	public void visitGreaterOrEqual(GreaterOrEqual e) {
		BinaryPrinter(e, ">=");
	}

	@Override
	public void visitLessOrEqual(LessOrEqual e) {
		BinaryPrinter(e, "<=");
	}

	@Override
	public void visitAddition(Addition e) {
		BinaryPrinter(e, "+");
	}

	@Override
	public void visitSubtraction(Subtraction e) {
		BinaryPrinter(e, "-");
	}

	@Override
	public void visitMultiplication(Multiplication e) {
		BinaryPrinter(e, "*");
	}

	@Override
	public void visitDivision(Division e) {
		BinaryPrinter(e, "/");
	}

	@Override
	public void visitVarLists(VarLists v) {
		if (v.mode instanceof modes.QuantificationList) {
			for (int i = 0; i < v.varDeclList.size(); i++) {
				PrefixPrinter printer = new PrefixPrinter();
				v.varDeclList.get(i).accept(printer);
				quantifyVar = quantifyVar.concat(printer.quantifyVar);
				prefixOutput = prefixOutput.concat(printer.prefixOutput);
			}
		}
	}

	@Override
	public void visitBoolVar(BoolVar v) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + v.name);
	}

	@Override
	public void visitIntVar(IntVar v) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + v.name);
	}

	@Override
	public void visitRealVar(RealVar v) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + v.name);
	}

	@Override
	public void visitBoolTrue(BoolTrue c) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + c.name);
	}

	@Override
	public void visitBoolFalse(BoolFalse c) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + c.name);
	}

	@Override
	public void visitIntConst(IntConst c) {
		if (c.isArray) {
			if (c.indicator.equals("count") || c.indicator.equals("upper")) {
				if (VarPrinter.arrayCount.containsKey(c.name)) {
					String indent = indentStr(indentCount);
					prefixOutput = prefixOutput.concat(indent + VarPrinter.arrayCount.get(c.name));
				}
				else {
					String indent = indentStr(indentCount);
					prefixOutput = prefixOutput.concat(indent + Integer.toString(Integer.MAX_VALUE));
				}
				
			}
			else if (c.indicator.equals("lower")) {
				String indent = indentStr(indentCount);
				prefixOutput = prefixOutput.concat(indent + "1");
			}
		}
		else {
			String indent = indentStr(indentCount);
			prefixOutput = prefixOutput.concat(indent + c.name);
		}
	}

	@Override
	public void visitRealConst(RealConst c) {
		String indent = indentStr(indentCount);
		prefixOutput = prefixOutput.concat(indent + c.name);
	}

	@Override
	public void visitForall(Forall q) {
		// if the boolean expr is another exists quantifier
		// set "isNestedQuantifier" to be true
		if (q.expr instanceof verifier.composite.Exists) {
			isNestedQuantifier = true;
		}
		
		
		// check if "isNestedQuantifier" is true
		// check to see if "isNestedQuantifier" in PrettyPrinter is true as well
		if (isNestedQuantifier || PrettyPrinter.isNestedQuantifier) {
			quantifyIndicator = "forall";
			QuantifyPrinter(q);
			// after calling the method, set "isNestedQuantifier" to false again
			isNestedQuantifier = false;
		}
		// if it is stand alone quantifier
		else {
			// recursively accept all the variables in the list first
			WpPrinter p1 = new WpPrinter();
			for (int i = 0; i < q.quantifyList.size(); i++) {
				q.quantifyList.get(i).accept(p1);
				quantifyVar = quantifyVar.concat(p1.quantifyVar);
			}
			// then accept the boolexpr next
			WpPrinter p2 = new WpPrinter();
			q.expr.accept(p2);
					
			prefixOutput = p2.prefixOutput;
		}
	}

	@Override
	public void visitExists(Exists q) {
		if (q.expr instanceof verifier.composite.Quantification) {
			isNestedQuantifier = true;
		}
		
		quantifyIndicator = "exists";
		QuantifyPrinter(q);
		isNestedQuantifier = false;
		//System.out.println(prefixOutput);
	}

	@Override
	public void visitBoolArrayVar(BoolArrayVar a) {
		PrefixPrinter p = new PrefixPrinter();
		a.index.accept(p);
		
		String indent = indentStr(indentCount);
		// (select a 1)
		prefixOutput = prefixOutput.concat(indent + "(select " + a.name + " " + p.prefixOutput + ")");
	}

	@Override
	public void visitIntArrayVar(IntArrayVar a) {
		PrefixPrinter p = new PrefixPrinter();
		a.index.accept(p);
		
		String indent = indentStr(indentCount);
		// (select a 1)
		prefixOutput = prefixOutput.concat(indent + "(select " + a.name + " " + p.prefixOutput + ")");
	}

	@Override
	public void visitRealArrayVar(RealArrayVar a) {
		PrefixPrinter p = new PrefixPrinter();
		a.index.accept(p);
		
		String indent = indentStr(indentCount);
		// (select a 1)
		prefixOutput = prefixOutput.concat(indent + "(select " + a.name + " " + p.prefixOutput + ")");
	}
	
	@Override
	public void visitPair(PairVar p) {
		if (p.element.equals("first") || p.element.equals(TypeChecker.pairVarMap.get(p.name).a.name)) {
			String indent = indentStr(indentCount);
			prefixOutput = prefixOutput.concat(indent + "(first " + p.name + ")");
		}
		else if (p.element.equals("second") || p.element.equals(TypeChecker.pairVarMap.get(p.name).b.name)) {
			String indent = indentStr(indentCount);
			prefixOutput = prefixOutput.concat(indent + "(second " + p.name + ")");
		}
	}
	
	@Override
	public void visitOlds(Olds o) {
		// store the variable cache
		PrefixPrinter.completeVarMap.put("old_" + o.name, new Pair<String, String>
			(PrefixPrinter.completeVarMap.get(o.name).a, PrefixPrinter.completeVarMap.get(o.name).b));
		
		// if it's array using the old keyword
		// if use "ValuedArray", then there will be error in PrettyPrinter because
		// cannot find the old_a in arrayMap
		if (!(PrefixPrinter.completeVarMap.get(o.name).b == null) && PrefixPrinter.completeVarMap.get(o.name).b.equals("ValuedArray")) {
			PrefixPrinter.inclusiveVarMap.put("old_" + o.name, new Pair<String, String>
			(PrefixPrinter.completeVarMap.get(o.name).a, "Array"));
		}
		else {
			PrefixPrinter.inclusiveVarMap.put("old_" + o.name, new Pair<String, String>
			(PrefixPrinter.completeVarMap.get(o.name).a, PrefixPrinter.completeVarMap.get(o.name).b));
		}
		
		
		PrefixPrinter.oldVarMap.put("old_" + o.name, o.name);
		
		String indent = indentStr(indentCount);
		
		if (o.index != null) {
			WpPrinter indexPrinter = new WpPrinter();
			o.index.accept(indexPrinter);
			
			
			prefixOutput = prefixOutput.concat(indent + "(select " + "old_" 
					+ o.name + " " + indexPrinter.prefixOutput + ")");
		}
		else {
			prefixOutput = prefixOutput.concat(indent + "old_" + o.name);
		}
	}

	@Override
	public void visitResults(Results r) {
		String indent = indentStr(indentCount);
		
		if (r.index != null) {
			PrefixPrinter indexPrinter = new PrefixPrinter();
			r.index.accept(indexPrinter);
			
			prefixOutput = prefixOutput.concat(indent + "(select " + " Result " + indexPrinter.prefixOutput + ")");
		}
		else {
			prefixOutput = prefixOutput.concat(indent + "Result");
		}
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
}
