package verifier.visitor;

import java.util.*;

import verifier.composite.*;

public class WpCalculator implements Visitor{
	
	// prefix version substitution
	public  Map<String, String> prefixSubstituteMap = new LinkedHashMap<String, String>();

	// infix version substitution
	public  Map<String, String> infixSubstituteMap = new LinkedHashMap<String, String>();
	
	// prefix version of precondition
	public String prefixPrecondition;
	
	// infix version of precondition
	public String infixPrecondition;
	
	// prefix version of postcondition
	public String prefixPostcondition;
	
	// infix version of postcondition
	public String infixPostcondition;
	
	// prefix version of wp
	public String prefixWp;
	
	// infix version of wp
	public String infixWp;
	
	public WpCalculator(String prefixPrecondition, String infixPrecondition, 
				String prefixPostcondition, String infixPostcondition) {
		this.prefixPrecondition = prefixPrecondition;
		this.infixPrecondition = infixPrecondition;
		this.prefixPostcondition = prefixPostcondition;
		this.infixPostcondition = infixPostcondition;
		prefixWp = "";
		infixWp = "";
	}
	
	// assignments
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
			prefixSubstituteMap.put(arraystr, newArraystr);
			prefixSubstituteMap.put("\\(select " + a.name, "\\(select new_" + a.name);
			
			// store the value for counterexample output
			InfixPrinter infixAssignPrinter = new InfixPrinter();
			a.assignValue.accept(infixAssignPrinter);
			
			InfixPrinter infixIndexPrinter = new InfixPrinter();
			a.index.accept(infixIndexPrinter);
			
			// need to use escape symbol
			String infixArraystr = a.name + "\\[" + infixIndexPrinter.infixOutput + "\\]";
			
			infixSubstituteMap.put(" " + infixArraystr + " ", " " + infixAssignPrinter.infixOutput + " ");
			
			
			// calculate the prefixWp
			prefixWp = prefixPostcondition;
			
			ListIterator<Map.Entry<String,String>> i = new ArrayList<Map.Entry<String,String>>
			(prefixSubstituteMap.entrySet()).listIterator(prefixSubstituteMap.size());
		
			while(i.hasPrevious()) {
				Map.Entry<String, String> entry= i.previous();
				prefixWp = prefixWp.replaceAll(entry.getKey(), entry.getValue());
			}
			
			
			// calculate the infixWp
			infixWp = infixPostcondition;
			
			ListIterator<Map.Entry<String,String>> j = new ArrayList<Map.Entry<String,String>>
			(infixSubstituteMap.entrySet()).listIterator(infixSubstituteMap.size());
		
			while(j.hasPrevious()) {
				Map.Entry<String, String> entry= j.previous();
				infixWp = infixWp.replaceAll(entry.getKey(), entry.getValue());
			}
		}
		else {
			// store the substitution value for z3 encoding
			PrefixPrinter printer = new PrefixPrinter();
			a.assignValue.accept(printer);
			prefixSubstituteMap.put(" " + a.name + " ", " " + printer.prefixOutput + " ");
			
			// store the value for counterexample output
			InfixPrinter infixPrinter = new InfixPrinter();
			a.assignValue.accept(infixPrinter);
			infixSubstituteMap.put(" " + a.name + " "," " + infixPrinter.infixOutput + " ");
			
			// calculate the prefixWp
			prefixWp = prefixPostcondition;
			
			ListIterator<Map.Entry<String,String>> i = new ArrayList<Map.Entry<String,String>>
			(prefixSubstituteMap.entrySet()).listIterator(prefixSubstituteMap.size());
		
			while(i.hasPrevious()) {
				Map.Entry<String, String> entry= i.previous();
				prefixWp = prefixWp.replaceAll(entry.getKey(), entry.getValue());
			}
			
			
			// calculate the infixWp
			infixWp = infixPostcondition;
			
			ListIterator<Map.Entry<String,String>> j = new ArrayList<Map.Entry<String,String>>
			(infixSubstituteMap.entrySet()).listIterator(infixSubstituteMap.size());
		
			while(j.hasPrevious()) {
				Map.Entry<String, String> entry= j.previous();
				infixWp = infixWp.replaceAll(entry.getKey(), entry.getValue());
			}
		}
	}
	
	// if-else statement
	// to prove {Q} if B then S1 else S2 end {R}
	// need to prove ((Q and B) => wp(S1, R)) and ((Q and (not B) => wp(S2, R))
	@Override
	public void visitAlternations(Alternations a) {
		// print the prefix version of condition (B)
		PrefixPrinter prefixCondition = new PrefixPrinter();
		a.condition.accept(prefixCondition);
		// print the infix version of condition (B)
		InfixPrinter infixCondition = new InfixPrinter();
		a.condition.accept(infixCondition);
		
		String prefixIfWp = prefixPostcondition;
		String infixIfWp = infixPostcondition;
		
		String prefixElseWp = prefixPostcondition;
		String infixElseWp = infixPostcondition;
		
		// calculate the else statement wp: wp(S2, R)
		if (!a.elseImps.isEmpty()) {
			for (int i = a.elseImps.size() - 1; i >= 0 ; i--) {
				WpCalculator calculator = new WpCalculator(prefixPrecondition, 
						infixPrecondition, prefixElseWp, infixElseWp);
				a.elseImps.get(i).accept(calculator);
				
				if (!calculator.prefixWp.isBlank()) {
					prefixElseWp = calculator.prefixWp;
					infixElseWp = calculator.infixWp;
				}
			}
		}
		
		
		// calculate the if statement wp: wp(S1, R)
		for (int j = a.ifImps.size() - 1; j >= 0; j--) {
			WpCalculator calculator = new WpCalculator(prefixPrecondition, 
					infixPrecondition, prefixIfWp, infixIfWp);
			a.ifImps.get(j).accept(calculator);
			
			if (!calculator.prefixWp.isBlank()) {
				prefixIfWp = calculator.prefixWp;
				infixIfWp = calculator.infixWp;
			}
		}
		
		// prefix (Q and B)
		String prefixQAndB = " ( and " + prefixPrecondition + " " + prefixCondition.prefixOutput + " ) ";
		// prefix (Q and (not B))
		String prefixQAndNotB = " ( and " + prefixPrecondition + " " + " (not " + prefixCondition.prefixOutput + " )) ";
		
		// prefix (Q and B) => wp(S1, R)
		String prefixLeftImplies = " (=> " + prefixQAndB + " " + prefixIfWp + " ) ";
		// prefix (Q and (not B)) => wp(S2, R)
		String prefixRightImplies = " (=> " + prefixQAndNotB + " " + prefixElseWp + " ) ";
		
		// set up prefix version of wp
		prefixWp = "( and " + prefixLeftImplies + " " + prefixRightImplies + " ) ";
				
		// infix (Q and B)
		String infixQAndB = " ( " + infixPrecondition + " and " + infixCondition.infixOutput + " ) ";
		// infix (Q and (not B))
		String infixQAndNotB = " ( " + infixPrecondition + " and " + "(not " + infixCondition.infixOutput + " )) ";
		
		// infix (Q and B) => wp(S1, R)
		String infixLeftImplies = " ( " + infixQAndB + " => " + infixIfWp + " ) ";
		// infix (Q and (not B)) => wp(S2, R)
		String infixRightImplies = " ( " + infixQAndNotB + " => " + infixElseWp + " ) ";
		
		// set up infix version of wp
		infixWp = " ( " + infixLeftImplies + " and " + infixRightImplies + " ) ";
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
