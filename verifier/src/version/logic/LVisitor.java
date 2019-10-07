package version.logic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

import com.microsoft.z3.*;

import antlr.*;
import antlr.LogicParser.*;
import types.*;
import values.*;
import version.logic.composite.*;

public class LVisitor extends LogicBaseVisitor<Logic>{
	
	// uninitialized boolean variable declaration
	@Override
	public Logic visitSingleBool(SingleBoolContext ctx) {
		return new BoolVar(ctx.ID().getText(), 0);
	}
	
	// uninitialized int variable declaration
	@Override
	public Logic visitSingleInt(SingleIntContext ctx) {
		return new IntVar(ctx.ID().getText(), 0);
	}

	
	
	// initialized boolean variable declaration
	@Override
	public Logic visitBoolValueDecl(BoolValueDeclContext ctx) {
		return new BoolVar(ctx.ID().getText(), visit(ctx.boolExpr()), 2);
	}
	
	// initialized int variable declaration
	@Override
	public Logic visitIntValueDecl(IntValueDeclContext ctx) {
		return new IntVar(ctx.ID().getText(), visit(ctx.arithmetic()), 2);
	}
	
	// verify the formula
	@Override
	public Logic visitEvalBoolExpr(EvalBoolExprContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	
	
	// boolean variable verification
	@Override
	public Logic visitBoolVar(BoolVarContext ctx) {
		return new BoolVar(ctx.ID().getText(), 1);
	}
	
	// int variable verification
	@Override
	public Logic visitIntVar(IntVarContext ctx) {
		return new IntVar(ctx.ID().getText(), 1);
	}
	
	// boolean true declaration
	@Override
	public Logic visitBoolTrue(BoolTrueContext ctx) {
		return new BoolTrue(ctx.TRUE().getText());
	}
	
	// boolean false declaration
	@Override
	public Logic visitBoolFalse(BoolFalseContext ctx) {
		return new BoolFalse(ctx.FALSE().getText());
	}
	
	// number declaration
	@Override
	public Logic visitNum(NumContext ctx) {
		return new NumConst(ctx.NUM().getText());
	}
	
	
	
	
	// Negation
	@Override
	public Logic visitNot(NotContext ctx) {
		return new Negation(visit(ctx.boolExpr()));
	}
	
	// Conjunction
	@Override
	public Logic visitAnd(AndContext ctx) {
		return new Conjunction(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Disjunction
	@Override
	public Logic visitOr(OrContext ctx) {
		return new Disjunction(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Implication
	@Override
	public Logic visitImplies(ImpliesContext ctx) {
		return new Implication(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Iff
	@Override
	public Logic visitIff(IffContext ctx) {
		return new Iff(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// parentheses
	@Override
	public Logic visitParen(ParenContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	@Override
	public Logic visitRelate(RelateContext ctx) {
		return visit(ctx.relation());
	}
	
	
	
	// arithmetic equal
	@Override
	public Logic visitEqual(EqualContext ctx) {
		return new Equal(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic greater than
	@Override
	public Logic visitGreaterThan(GreaterThanContext ctx) {
		return new GreaterThan(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic less than
	@Override
	public Logic visitLessThan(LessThanContext ctx) {
		return new LessThan(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic greater or equal
	@Override
	public Logic visitGreaterOrEqual(GreaterOrEqualContext ctx) {
		return new GreaterOrEqual(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic less or equal
	@Override
	public Logic visitLessOrEqual(LessOrEqualContext ctx) {
		return new LessOrEqual(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// multiply or division
	@Override
	public Logic visitMulDiv(MulDivContext ctx) {
		if (ctx.op.getType() == LogicParser.MUL) {
			return new Multiplication(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
		else {
			return new Division(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
	}
	
	// add or subtract
	@Override
	public Logic visitAddSub(AddSubContext ctx) {
		if (ctx.op.getType() == LogicParser.ADD) {
			return new Addition(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
		else {
			return new Subtraction(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
	}
	
	// arithmetic parentheses
	@Override
	public Logic visitArithParen(ArithParenContext ctx) {
		return visit(ctx.arithmetic());
	}
}
