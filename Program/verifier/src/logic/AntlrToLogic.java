package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import antlr.*;
import antlr.LogicParser.*;
import logic.composite.*;
import modes.*;

public class AntlrToLogic extends LogicBaseVisitor<Logic>{
	
	public static Map<String, String> IntOrReal = new HashMap<String, String>();
	
	/* *****************************************************************************************
	 * Methods for line rule
	 * *****************************************************************************************
	 */
	
	// uninitialized boolean or int variable declaration
	@Override
	public Logic visitSingleVar(SingleVarContext ctx) {
		if (ctx.type.getType() == LogicParser.BOOL) {
			return new BoolVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else if (ctx.type.getType() == LogicParser.INT) {
			IntOrReal.put(ctx.ID().getText(), "Int");
			return new IntVar(ctx.ID().getText(), new UninitializedDecl());
		} 
		else {
			IntOrReal.put(ctx.ID().getText(), "Real");
			return new RealVar(ctx.ID().getText(), new UninitializedDecl());
		}
	}
	
	
	// initialized boolean variable declaration
	@Override
	public Logic visitBoolValueDecl(BoolValueDeclContext ctx) {
		return new BoolVar(ctx.ID().getText(), visit(ctx.boolExpr()), new InitializedDecl());
	}
	
	
	// initialized arithmetic variable declaration
	@Override
	public Logic visitNumValueDecl(NumValueDeclContext ctx) {
		if (ctx.type.getType() == LogicParser.INT) {
			IntOrReal.put(ctx.ID().getText(), "Int");
			return new IntVar(ctx.ID().getText(), visit(ctx.arithmetic()), new InitializedDecl());
		}
		else {
			IntOrReal.put(ctx.ID().getText(), "Real");
			return new RealVar(ctx.ID().getText(), visit(ctx.arithmetic()), new InitializedDecl());
		}
	}
	
	
	// uninitialized array variable declaration
	@Override
	public Logic visitArrayDecl(ArrayDeclContext ctx) {
		if (ctx.type.getType() == LogicParser.BOOL) {
			return new BoolArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else if (ctx.type.getType() == LogicParser.INT) {
			return new IntArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else {
			return new RealArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
	}
	
	
	
	
	// verify the formula
	@Override
	public Logic visitVerifyBoolExpr(VerifyBoolExprContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	
	
	/* *****************************************************************************************
	 * Methods for boolExpr rule
	 * *****************************************************************************************
	 */
	
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
	
	
	
	// forall
	@Override
	public Logic visitForall(ForallContext ctx) {
		// create a list of Var
		// recursively call visit(ctx.varDecl()) 
		// which will return a Logic object (it's guaranteed to be BoolVar or IntVar or RealVar)
		List<Logic> list = new ArrayList<Logic>();
		for (int i = 0; i < ctx.varDecl().size(); i++) {
			list.add(visit(ctx.varDecl(i)));
		}
		// create a new Forall object, and copy all the declared variables into quantifyList
		return new Forall(list, visit(ctx.boolExpr()));
		
	}
	
	// there exists
	@Override
	public Logic visitExists(ExistsContext ctx) {
		// create a list of Var
		// recursively call visit(ctx.varDecl()) 
		// which will return a Logic object (it's guaranteed to be BoolVar or IntVar or RealVar)
		List<Logic> list = new ArrayList<Logic>();
		for (int i = 0; i < ctx.varDecl().size(); i++) {
			list.add(visit(ctx.varDecl(i)));
		}
		// create a new exists object, and copy all the declared variables into quantifyList
		return new Exists(list, visit(ctx.boolExpr()));
	}
		
	
	// boolean variable verification
	@Override
	public Logic visitBoolVar(BoolVarContext ctx) {
		return new BoolVar(ctx.ID().getText(), new Verification());
	}
	
	
	
	
	// expression index value boolean array verification
	@Override
	public Logic visitExprIndexBoolArray(ExprIndexBoolArrayContext ctx) {
		return new BoolArrayVar(ctx.ID().getText(), visit(ctx.arithmetic()), new Verification());
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
	
	
	// parentheses
	@Override
	public Logic visitParen(ParenContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	// Relate
	@Override
	public Logic visitRelate(RelateContext ctx) {
		return visit(ctx.relation());
	}
	
	
	/* *****************************************************************************************
	 * Methods for varDecl rule
	 * *****************************************************************************************
	 */
	
	// quantification variable declaration
	@Override
	public Logic visitQuantifyVar(QuantifyVarContext ctx) {
		
		if (ctx.type.getType() == LogicParser.BOOL) {
			// store each ID's string into list
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(ctx.ID(i).getText());
			}
			// create a new BoolVar object, accepting the list
			// and transform the list of String into a list of BoolVar
			return new BoolVar(list, new QuantifyBool());
		}
		else if (ctx.type.getType() == LogicParser.INT) {
			// store each ID's string into list
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(ctx.ID(i).getText());
				IntOrReal.put(ctx.ID(i).getText(), "Int");
			}
			// create a new IntVar object, accepting the list
			// and transform the list of String into a list of IntVar
			return new IntVar(list, new QuantifyInt());
		}
		else {
			// store each ID's string into list
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(ctx.ID(i).getText());
				IntOrReal.put(ctx.ID(i).getText(), "Real");
			}
			// create a new RealVar object, accepting the list
			// and transform the list of String into a list of IntVar
			return new RealVar(list, new QuantifyInt());
		}
	}
	
	
	/* *****************************************************************************************
	 * Methods for relation rule
	 * *****************************************************************************************
	 */
	
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
	
	
	/* *****************************************************************************************
	 * Methods for arithmetic rule
	 * *****************************************************************************************
	 */
	
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
	
	// arithmetic variable verification
	@Override
	public Logic visitArithmeticVar(ArithmeticVarContext ctx) {
		if (IntOrReal.containsKey(ctx.ID().getText())) {
			if (IntOrReal.get(ctx.ID().getText()).equals("Int")) {
				return new IntVar(ctx.ID().getText(), new Verification());
			}
			else {
				return new RealVar(ctx.ID().getText(), new Verification());
			}
		}
		else {
			return new NIL(ctx.ID().getText(), new UninitializedDecl());
		}
	}
	
	
	// int number
	@Override
	public Logic visitIntNum(IntNumContext ctx) {
		return new IntConst(ctx.INTNUM().getText());
	}
	
	
	// real number
	@Override
	public Logic visitRealNum(RealNumContext ctx) {
		return new RealConst(ctx.REALNUM().getText());
	}
	
	
	// arithmetic parentheses
	@Override
	public Logic visitArithParen(ArithParenContext ctx) {
		return visit(ctx.arithmetic());
	}
}
