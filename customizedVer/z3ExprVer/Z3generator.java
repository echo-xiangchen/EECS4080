
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

import com.microsoft.z3.*;

public class Z3generator extends LogicBaseVisitor<Expr>{
	
	public Context context = new Context();
	
	// map that stores variable-type pair
	Map<String, String> varType = new HashMap<String, String>();
	
	// map that stores variable-value pair
	Map<String, String> varValue = new HashMap<String, String>();
	
	// single boolean declaration
	public Expr visitSingleBool(LogicParser.SingleBoolContext ctx) {
		// if the variable has not been declared before, add it to the map
		if (!varType.containsKey(ctx.VAR().getText())) {
			varType.put(ctx.VAR().getText(), "boolean");
		// else return the error msg
		}else {
			System.out.println("Variable " +ctx.VAR().getText() + " is already declared as " 
					+ varType.get(ctx.VAR().getText())
					+ ", you cannot declare it twice.");
		}
		return null;
	}
	
	// single int declaration
	public Expr visitSingleInt(LogicParser.SingleIntContext ctx) {
		// if the variable has not been declared before, add it to the map
		if (!varType.containsKey(ctx.VAR().getText())) {
			varType.put(ctx.VAR().getText(), "int");
		// else return the error msg
		}else {
			System.out.println("Variable " +ctx.VAR().getText() + " is already declared as " 
					+ varType.get(ctx.VAR().getText())
					+ ", you cannot declare it twice.");
		}
		return null;
	}
	
	// evaluate the boolean expression
	public Expr visitEvalBoolExpr(LogicParser.EvalBoolExprContext ctx) {
		// create a new solver for the formula each time
		Solver solver = context.mkSolver();
		
		
		if (visit(ctx.boolExpr()) != null) {
			BoolExpr expr = (BoolExpr) visit(ctx.boolExpr());
			// negate the output expr
			BoolExpr formula = context.mkNot(expr);
			
			// add the formula
			solver.add(formula);
			
			// check to see of the formula is tautology
			Status result = solver.check();
			
			// show the checked result:
	        if (result == Status.SATISFIABLE){  
	        	System.out.println("The formula is not tautology.");
	        	
	        	
	        	// get the model
	        	Model m = solver.getModel();
	        	
	        	System.out.println(m.toString());
	           }  
	        else if(result == Status.UNSATISFIABLE)  
	            System.out.println("The formula is tautology.");  
	        else   
	            System.out.println("Unknow formula"); 
			}
			//System.out.println(expr.toString());
			return null;
		}
	
	
	// define the atom 
	public Expr visitBoolVar(LogicParser.BoolVarContext ctx) {
		// check is the variable has been declared
		if (varType.containsKey(ctx.getText())) {
			// check if the variable is the right type
			if (varType.get(ctx.getText()) == "boolean") {
				return context.mkBoolConst(ctx.getText());
			// if the variable is not the right type, set up the error msg
			}else {
				System.out.println("Variable " + ctx.getText() + " is declared as " + varType.get(ctx.getText()) + ".");
				return null;
			}
		// if the variable is not declared, set up the error msg
		}else {
			System.out.println("Variable " + ctx.getText() + " is not declared.");
			return null;
		}
	}
		
	
	// set up the sub-formula of NOT
	public Expr visitNot(LogicParser.NotContext ctx) {
		if (visit(ctx.boolExpr()) != null) {
			return context.mkNot((BoolExpr) visit(ctx.boolExpr()));
		}
		return null;
	}
	
	// set up the sub-formula for OR
	public Expr visitOr(LogicParser.OrContext ctx) {
		if ((visit(ctx.boolExpr(0)) != null) && (visit(ctx.boolExpr(1))) != null) {
			return context.mkOr((BoolExpr) visit(ctx.boolExpr(0)), (BoolExpr)visit(ctx.boolExpr(1)));
		}
		return null;
	}
	
	
	// set up the sub-formula for IMPLIES
	public Expr visitImplies(LogicParser.ImpliesContext ctx) {
		if ((visit(ctx.boolExpr(0)) != null) && (visit(ctx.boolExpr(1))) != null) {
			return context.mkImplies((BoolExpr) visit(ctx.boolExpr(0)), (BoolExpr)visit(ctx.boolExpr(1)));
		}
		return null;
	}
	
	
	// set up the sub-formula for IFF
	public Expr visitIff(LogicParser.IffContext ctx) {
		if ((visit(ctx.boolExpr(0)) != null) && (visit(ctx.boolExpr(1))) != null) {
			return context.mkIff((BoolExpr) visit(ctx.boolExpr(0)), (BoolExpr)visit(ctx.boolExpr(1)));
		}
		return null;
	}
	
	// set up the sub-formula for AND
	public Expr visitAnd(LogicParser.AndContext ctx) {
		if ((visit(ctx.boolExpr(0)) != null) && (visit(ctx.boolExpr(1))) != null) {
			return context.mkAnd((BoolExpr) visit(ctx.boolExpr(0)), (BoolExpr)visit(ctx.boolExpr(1)));
		}
		return null;
	}
	
	// Set up the formula with parentheses
	public Expr visitParen(LogicParser.ParenContext ctx) {
		return visit(ctx.boolExpr());
	}
}
