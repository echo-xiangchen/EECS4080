package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import antlr.*;
import expr.*;
import expr.composite.*;
import expr.visitor.*;

public class TestExpr {
	
	public static void main(String[] args) {
		
		try {
			String inputFile = null;
	        if ( args.length>0 ) 
	        	inputFile = args[0];
	        
	        InputStream is = System.in;
	        
	        if ( inputFile!=null ) {
	            is = new FileInputStream(inputFile);
	        }
	        
	        // parse the input
			@SuppressWarnings("deprecation")
			ANTLRInputStream input = new ANTLRInputStream(is);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);			
			ExprParser parser = new ExprParser(tokens);
	       
			// tell ANTLR to build a parse tree
			parser.setBuildParseTree(true);
	        // parse
			ParseTree tree = parser.stat();
	        
	        
	        // Call the intermediate class AntlrToExpr
	        AntlrToExpr antlrToExpr = new AntlrToExpr();
	        
	        // list that stores the subtree separately
	        List<Expr> expr = new ArrayList<Expr>();
	        // add user input to the list line by line
	        for (int i = 0; i < tree.getChildCount(); i++) {
	        	expr.add(antlrToExpr.visit(tree.getChild(i)));
			}
	        
	        
	        // create new TypeChecker
	        TypeChecker checker = new TypeChecker();
	        
	        // Recursively accept TypeChecker
	        for (int i = 0; i < expr.size(); i++) {
	        	expr.get(i).accept(checker);
			}
	        
	        //System.out.println(TypeChecker.varMap);
	        
	        
	        // check if error msg is empty
	        // only when it's empty, call the pretty printer
	        if (checker.errormsg.isEmpty()) {
	        	// Recursively accept TypeChecker
		        for (int i = 0; i < expr.size(); i++) {
		        	PrettyPrinter printer = new PrettyPrinter();
		        	expr.get(i).accept(printer);
		        	System.out.println(printer.output + " is type correct.");
				}
			}
	        else {
	        	// print the error message
				for (int i = 0; i < checker.errormsg.size(); i++) {
					System.out.println(checker.errormsg.get(i));
				}
			}
	        
		} catch (Exception e) {
			System.out.println("Exception");  
            e.printStackTrace(); 
		}
		
	}
}
