import org.antlr.v4.runtime.*;
import java.io.*;

public class TypeChecker {
    public static void main(String[] args) throws Exception {
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

        // share single parser instance
		ExprParser parser = new ExprParser(null);
        // don't need trees 
  		parser.setBuildParseTree(false);          

        // while we have more expressions
        while ( expr!=null ) {             
            // create new lexer and token stream for each line (expression)
            ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
            ExprLexer lexer = new ExprLexer(input);
            // notify lexer of input position
            lexer.setLine(line);           
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // notify parser of new token stream
            parser.setInputStream(tokens);
            // start the parser 
            parser.stat();                 
            expr = br.readLine();
            // see if there's another line          
            line++;
        }
    }
}
