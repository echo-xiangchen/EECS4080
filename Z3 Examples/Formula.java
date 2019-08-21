package demo;

import java.util.*;  

import com.microsoft.z3.*;  
  

public class Formula {  
      
    public static void main(String[] args){  
        try{ 
        	HashMap<String, String> cfg = new HashMap<String, String>();
        	cfg.put("model", "true");
        	Context ctx = new Context(cfg);
        
        	
        	BoolExpr a = ctx.mkBoolConst("a");
        	BoolExpr b = ctx.mkBoolConst("b");
        	BoolExpr c = ctx.mkBoolConst("c");
        	
        	// (a | b) & c
        	BoolExpr formula = ctx.mkAnd(ctx.mkOr(a, b), c);
        	
        	Solver s = ctx.mkSolver();
        	s.add(formula);
        	
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
