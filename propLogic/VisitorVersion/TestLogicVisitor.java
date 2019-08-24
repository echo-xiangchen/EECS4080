import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;  

public class TestLogicVisitor {
	public static class LVisitor extends LogicBaseVisitor<String> {

		// change the order of AND: e.g. "p and q" will be "and p q"
		public String visitAnd(LogicParser.AndContext ctx) {
			return "and " + visit(ctx.formula(0)) + " " + visit(ctx.formula(1));
		}

		// change the order of OR: e.g. "p or q" will be "or p q"
		public String visitOr(LogicParser.OrContext ctx) {
			return "or " + visit(ctx.formula(0)) + " " + visit(ctx.formula(1));
		}

		// change the order of IMPLIES: e.g. "p => q" will be "=> p q"
		public String visitImplies(LogicParser.ImpliesContext ctx) {
			return "=> " + visit(ctx.formula(0)) + " " + visit(ctx.formula(1));
		}

		// change the order of EQUALS: e.g. "p = q" will be "= p q"
		public String visitEquals(LogicParser.EqualsContext ctx) {
			return "= " + visit(ctx.formula(0)) + " " + visit(ctx.formula(1));
		}

		// define the atom 
		public String visitVar(LogicParser.VarContext ctx) {
			return ctx.getText();
		}

		// change the order of the formula with parentheses
		public String visitParen(LogicParser.ParenContext ctx) {
			return " ( " + visit(ctx.formula()) + " ) ";
		}




		// set up the return string for varDecl
		public String visitVarDecl(LogicParser.VarDeclContext ctx) {
			return ctx.getText();
		}

		// set up the return string for stat
		// it will be a long string that declare the variable and assert the formula
		public String visitStat(LogicParser.StatContext ctx) {


			String[] varSplit = (visit(ctx.varDecl())).replaceAll("\n", "").split(",");

			String varDecl = "";
			int i = 0;
			while(i < varSplit.length) {
				varDecl = varDecl + "(declare-const " + varSplit[i] + " Bool)";
				i++;
			}

			String funDecl = "(define-fun conjecture () Bool (" + visit(ctx.formula()) + " ))" + "(assert (not conjecture))";

			return varDecl + funDecl;
			//return visit(ctx.varDecl()) + visit(ctx.formula());
		}
	}

	// test the result
	public static void main (String[] args) {
		try {
		// test to see if there is a input file
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        
        // read the input and parse it
        ANTLRInputStream input = new ANTLRInputStream(is);
        LogicLexer lexer = new LogicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogicParser parser = new LogicParser(tokens);
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.stat(); // parse
        // show tree in text form
        // System.out.println(tree.toStringTree(parser));

        LVisitor logicVisitor = new LVisitor();
        String output = logicVisitor.visit(tree);
        // show the output string
        //System.out.println(output);

        
        // create the z3 context object
        HashMap<String, String> cfg = new HashMap<String, String>();
        cfg.put("model", "true");
        Context ctx = new Context(cfg);

        // add the output to z3
        BoolExpr formula = ctx.parseSMTLIB2String(output, null, null, null, null)[0];

        // create the solver
        Solver s = ctx.mkSolver();
        s.add(formula);
        	
        Status result = s.check();
        
        // show the result: sat, unsat, unknow
        if (result == Status.SATISFIABLE){  
        	System.out.println("The formula is satisfiable");
           }  
        else if(result == Status.UNSATISFIABLE)  
            System.out.println("The formula is unsatisfiable");  
        else   
            System.out.println("Unknow formula"); 
	}catch(Exception e){  
            System.out.println("z3 exception");  
            e.printStackTrace();  
 		}  
	}
}



