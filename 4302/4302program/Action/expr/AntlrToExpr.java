package expr;

import antlr.*;
import antlr.ExprParser.*;
import expr.composite.*;

public class AntlrToExpr extends ExprBaseVisitor<Expr>{
	
	
	@Override
	public Expr visitAdd(AddContext ctx) {
		return new Addition(visit(ctx.expr(0)), visit(ctx.expr(1))); 
	}
	
	@Override
	public Expr visitMul(MulContext ctx) {
		return new Multiplication(visit(ctx.expr(0)), visit(ctx.expr(1))); 
	}
	
	
	@Override
	public Expr visitTerms(TermsContext ctx) {
		return visit(ctx.term());
	}
	
	
	@Override
	public Expr visitLessThan(LessThanContext ctx) {
		return new LessThan(visit(ctx.term(0)), visit(ctx.term(1))); 
	}
	
	
	@Override
	public Expr visitEquals(EqualsContext ctx) {
		return new Equal(visit(ctx.term(0)), visit(ctx.term(1))); 
	}
	
	@Override
	public Expr visitNumber(NumberContext ctx) {
		return new Num(ctx.NUM().getText());
	}
}