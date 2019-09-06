
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import java.util.*;

import com.microsoft.z3.*;

public class TestExpr {

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
	        String expr = br.readLine();              // get first expression
	        int line = 1;                             // track input expr line numbers
	        
	        Z3generator z3 = new Z3generator();
	        
	        while ( expr!=null ) {             // while we have more expressions
	            // create new lexer and token stream for each line (expression)
	            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
	            LogicLexer lexer = new LogicLexer(input);
	            lexer.setLine(line);           // notify lexer of input position
	            lexer.setCharPositionInLine(0);
	            CommonTokenStream tokens = new CommonTokenStream(lexer);
	            LogicParser parser = new LogicParser(tokens);
	            parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
	            ParseTree tree = parser.stat(); // parse
	            
		        z3.visit(tree);
	            expr = br.readLine();          // see if there's another line
	            line++;
	        	}
	        }
	        catch(Exception e){  
	            System.out.println("z3 exception");  
	            e.printStackTrace();  
	 		} 
		}
	}

