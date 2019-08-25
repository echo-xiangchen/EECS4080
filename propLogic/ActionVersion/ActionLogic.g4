grammar ActionLogic;

@header {
	import java.util.*;
	import java.io.FileInputStream;
	import java.io.InputStream;
	import com.microsoft.z3.*; 
}


@members {
	String eval2 (int op, String formula) {
		if (op == NOT) {
			return "not " + formula;
		}
		return "";
	}

	String eval3 (String left, int op, String right) {
		switch (op) {
			case AND : return "and " + left + " " + right;
			case OR : return "or " + left + " " +right;
			case IMPLIES : return "=> " + left + " " +right;
			case EQUALS : return "= " + left + " " +right;
		}
		return "";
	}
}


stat : varDecl formula 
	{
		String[] varSplit = ($varDecl.v).replaceAll("\n", "").split(",");

		String varDecl = "";
			int i = 0;
			while(i < varSplit.length) {
				varDecl = varDecl + "(declare-const " + varSplit[i] + " Bool)";
				i++;
			}

		String funDecl = "(define-fun conjecture () Bool (" + $formula.v + " ))" + "(assert (not conjecture))";

		String value = "";
			int j = 0;
			while(j < varSplit.length) {
				value = value + "(assert (or (= " + varSplit[j] + " true) (= " + varSplit[j] + " false)))";
				j++;
			}


		String output = varDecl + funDecl + value;

		// create z3 contex object
		HashMap<String, String> cfg = new HashMap<String, String>();
        cfg.put("model", "true");
        Context ctx = new Context(cfg);

        // create the formula
        BoolExpr formula = ctx.parseSMTLIB2String(output, null, null, null, null)[0];

        // create the solver
        Solver s = ctx.mkSolver();
        s.add(formula);
        	
        Status result = s.check();

        // show the result: sat, unsat, unknow
        if (result == Status.SATISFIABLE){  
        	System.out.println("The formula is not tautology.");
        	
        	// get the model
        	Model m = s.getModel();
        	
        	// split the output model string
        	String[] splited = m.toString().replaceAll("\n", "").split("\\(define-fun ");
        	
        	// print the witness
        	System.out.println("\nWitness:");
        	for(int k = 1; k < splited.length; k++) {
        	System.out.println(splited[k].charAt(0) + " = " + splited[k].substring(11, 16).replaceAll("\\)", ""));
        		}
        	
           }  
        else if(result == Status.UNSATISFIABLE)  
            System.out.println("The formula is tautology.");  
        else   
            System.out.println("Unknow formula."); 
		//System.out.println(output);
	}
	;

varDecl returns [String v]
	: VAR (',' VAR)* NEWLINE {$v = $text;}
	;

formula returns [String v]
	  : op=NOT f=formula				{$v = eval2($op.type, $f.v);}			
	  | l=formula op=AND r=formula		{$v = eval3($l.v, $op.type, $r.v);}
	  | l=formula op=OR r=formula		{$v = eval3($l.v, $op.type, $r.v);}
	  | l=formula op=IMPLIES r=formula	{$v = eval3($l.v, $op.type, $r.v);}
	  | l=formula op=EQUALS r=formula	{$v = eval3($l.v, $op.type, $r.v);}
	  | VAR 							{$v = $VAR.text;}
	  | '(' f=formula ')'				{$v = " ( " + $f.v + " ) ";}
	  ;


NOT : 'not';
AND : 'and';
OR : 'or';
IMPLIES : '=>';
EQUALS : '=';

VAR : [a-z];
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;