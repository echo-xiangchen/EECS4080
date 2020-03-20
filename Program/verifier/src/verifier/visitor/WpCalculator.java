package verifier.visitor;

import java.util.*;

import verifier.composite.*;

public class WpCalculator implements Visitor{
	
	public  Map<String, String> z3SubstituteMap = new LinkedHashMap<String, String>();

	public  Map<String, String> counteregSubstituteMap = new LinkedHashMap<String, String>();
	
	// prefix version of postcondition
	public String prefixPostcondition;
	
	// infix version of postcondition
	public String infixPostcondition;
	
	// prefix version of wp
	public String prefixWp;
	
	// infix version of wp
	public String infixWp;
	
	public WpCalculator(String prefixPostcondition, String infixPostcondition) {
		this.prefixPostcondition = prefixPostcondition;
		this.infixPostcondition = infixPostcondition;
		prefixWp = "";
		infixWp = "";
	}
	
	
	@Override
	public void visitAssignment(Assignments a) {
		
		if (a.index != null) {
			// store the substitution value for z3 encoding
			PrefixPrinter assignValueprinter = new PrefixPrinter();
			a.assignValue.accept(assignValueprinter);
			
			PrefixPrinter indexPrinter = new PrefixPrinter();
			a.index.accept(indexPrinter);
			
			// need to use escape symbol
			String arraystr = "\\(select " + a.name + " " + indexPrinter.prefixOutput + "\\)";
			
			String newArraystr = "\\(select new_" + a.name + " " + indexPrinter.prefixOutput + "\\)";
			z3SubstituteMap.put(arraystr, newArraystr);
			z3SubstituteMap.put("\\(select " + a.name, "\\(select new_" + a.name);
			
			// store the value for counterexample output
			InfixPrinter infixAssignPrinter = new InfixPrinter();
			a.assignValue.accept(infixAssignPrinter);
			
			InfixPrinter infixIndexPrinter = new InfixPrinter();
			a.index.accept(infixIndexPrinter);
			
			// need to use escape symbol
			String infixArraystr = a.name + "\\[" + infixIndexPrinter.infixOutput + "\\]";
			
			counteregSubstituteMap.put(" " + infixArraystr + " ", " " + infixAssignPrinter.infixOutput + " ");
			
			
			// calculate the prefixWp
			prefixWp = prefixPostcondition;
			
			ListIterator<Map.Entry<String,String>> i = new ArrayList<Map.Entry<String,String>>
			(z3SubstituteMap.entrySet()).listIterator(z3SubstituteMap.size());
		
			while(i.hasPrevious()) {
				Map.Entry<String, String> entry= i.previous();
				prefixWp = prefixWp.replaceAll(entry.getKey(), entry.getValue());
			}
			
			
			// calculate the infixWp
			infixWp = infixPostcondition;
			
			ListIterator<Map.Entry<String,String>> j = new ArrayList<Map.Entry<String,String>>
			(counteregSubstituteMap.entrySet()).listIterator(counteregSubstituteMap.size());
		
			while(j.hasPrevious()) {
				Map.Entry<String, String> entry= j.previous();
				infixWp = infixWp.replaceAll(entry.getKey(), entry.getValue());
			}
		}
		else {
			// store the substitution value for z3 encoding
			PrefixPrinter printer = new PrefixPrinter();
			a.assignValue.accept(printer);
			z3SubstituteMap.put(" " + a.name + " ", " " + printer.prefixOutput + " ");
			
			// store the value for counterexample output
			InfixPrinter infixPrinter = new InfixPrinter();
			a.assignValue.accept(infixPrinter);
			counteregSubstituteMap.put(" " + a.name + " "," " + infixPrinter.infixOutput + " ");
			
			// calculate the prefixWp
			prefixWp = prefixPostcondition;
			
			ListIterator<Map.Entry<String,String>> i = new ArrayList<Map.Entry<String,String>>
			(z3SubstituteMap.entrySet()).listIterator(z3SubstituteMap.size());
		
			while(i.hasPrevious()) {
				Map.Entry<String, String> entry= i.previous();
				prefixWp = prefixWp.replaceAll(entry.getKey(), entry.getValue());
			}
			
			
			// calculate the infixWp
			infixWp = infixPostcondition;
			
			ListIterator<Map.Entry<String,String>> j = new ArrayList<Map.Entry<String,String>>
			(counteregSubstituteMap.entrySet()).listIterator(counteregSubstituteMap.size());
		
			while(j.hasPrevious()) {
				Map.Entry<String, String> entry= j.previous();
				infixWp = infixWp.replaceAll(entry.getKey(), entry.getValue());
			}
		}
	}
	
	@Override
	public void visitOlds(Olds o) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void visitResults(Results r) {
		// TODO Auto-generated method stub
		
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
