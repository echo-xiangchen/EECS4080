package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import java.util.*;

import com.microsoft.z3.*;

import antlr.*;
import version.z3.*;

public class TestVersionZ3 {

	public static void main(String[] args) {
		try {
			// test to see if there is a input file
	        String inputFile = null;
	        if ( args.length>0 ) inputFile = args[0];
	        InputStream is = System.in;
	        if ( inputFile!=null ) {
	            is = new FileInputStream(inputFile);
	        }
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        
	        // get first expression
	        String expr = br.readLine();
	        // track input expr line numbers
	        int line = 1;                             
	        
	        Z3generator z3 = new Z3generator();
	        
	        while ( expr!=null ) {             // while we have more expressions
	            // create new lexer and token stream for each line (expression)
	            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
	            LogicLexer lexer = new LogicLexer(input);
	            
	            // notify lexer of input position
	            lexer.setLine(line);           
	            lexer.setCharPositionInLine(0);
	            CommonTokenStream tokens = new CommonTokenStream(lexer);
	            LogicParser parser = new LogicParser(tokens);
	            
	            // tell ANTLR to build a parse tree
	            parser.setBuildParseTree(true);      
	            ParseTree tree = parser.stat(); // parse
	            
		        z3.visit(tree);
		        // see if there's another line
	            expr = br.readLine();          
	            line++;
	        	}
	        }
	        catch(Exception e){  
	            System.out.println("z3 exception");  
	            e.printStackTrace();  
	 		} 
		}
	}

