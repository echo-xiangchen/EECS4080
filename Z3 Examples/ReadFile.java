package demo;

import java.util.*;  
import java.io.*;

import com.microsoft.z3.*;  



public class ReadFile {

	public static void main(String[] args) {
		try{ 
        	HashMap<String, String> cfg = new HashMap<String, String>();
        	cfg.put("model", "true");
        	Context ctx = new Context(cfg);
        	
        	// . refers to the project folder (Examples)
        	// /Users/Siang/Documents/Eclipse/Examples/src/demo
        	BoolExpr[] a = ctx.parseSMTLIB2File("./src/demo/sample.smt2", null, null, null, null);
        	
        	
        	
        	
        	
        	
        	
        	
        	Solver s = ctx.mkSolver();
        	
        	s.add(a);
        	
        	Status result = s.check();
        	
        	if (result == Status.SATISFIABLE){  
        		System.out.println("sat");
            }  
            else if(result == Status.UNSATISFIABLE)  
                System.out.println("unsat");  
            else   
                System.out.println("unknow"); 

              
        }catch(Exception e){  
            System.out.println("z3 exception");  
            e.printStackTrace();  
        }     
    }  

}
