package expr.visitor;

import expr.composite.*;

public class PrettyPrinter implements Visitor{
	
	public String output;
	
	
	public PrettyPrinter() {
		output = "";
	}
	
	public void visitBinaryExpr (Expr b, String op) {
		PrettyPrinter leftPrinter = new PrettyPrinter();
		PrettyPrinter rightPrinter = new PrettyPrinter();
		
		b.left().accept(leftPrinter);
		b.right().accept(rightPrinter);
		output = output.concat("(" + leftPrinter.output + " " + op + " " + rightPrinter.output + ")");
	}
	
	
	
	@Override
	public void visitEqual(Equal e) {
		visitBinaryExpr(e, "=");
	}

	@Override
	public void visitLessThan(LessThan e) {
		visitBinaryExpr(e, "<");
	}

	
	

	@Override
	public void visitAddition(Addition e) {
		visitBinaryExpr(e, "+");
	}

	

	@Override
	public void visitMultiplication(Multiplication e) {
		visitBinaryExpr(e, "*");
	}
	
	
	

	@Override
	public void visitNum(Num c) {
		output = output.concat(c.name);	
	}
}
