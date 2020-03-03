package verifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import antlr.*;
import antlr.VerifierParser.*;
import modes.*;
import verifier.composite.*;

public class AntlrToVerifier extends VerifierBaseVisitor<Verifier>{
	
	public static Map<String, String> varTypes = new HashMap<String, String>();
	
	/* *****************************************************************************************
	 * Methods for line rule
	 * *****************************************************************************************
	 */
	
	
	// variable declaration
	@Override
	public Verifier visitVarDeclaration(VarDeclarationContext ctx) {
		return visit(ctx.declaration());
	}
	
	// method declaration
	@Override
	public Verifier visitDefineMethod(DefineMethodContext ctx) {
		return visit(ctx.method());
	}
	
	
	// verify the formula
	@Override
	public Verifier visitVerifyBoolExpr(VerifyBoolExprContext ctx) {
		if (!varTypes.containsKey(visit(ctx.boolExpr()).name)) {
			return visit(ctx.boolExpr());
		}
		else if (varTypes.get(visit(ctx.boolExpr()).name).equals("Bool")) {
			return visit(ctx.boolExpr());
		}
		else {
			return new Methods(visit(ctx.boolExpr()).name, new Verification());
		}
	}
	
	
	// verify the method
	@Override
	public Verifier visitVerifyMethod(VerifyMethodContext ctx) {
		if (!varTypes.containsKey(ctx.ID().getText())) {
			return new Methods(ctx.ID().getText(), new Verification());
		}
		else if (varTypes.get(ctx.ID().getText()).equals("Method")) {
		return new Methods(ctx.ID().getText(), new Verification());
		}
		else {
			return new BoolVar(ctx.ID().getText(), new Verification());
		}
	}
	
	
	
	/* *****************************************************************************************
	 * Methods for method rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitMutatorMethod(MutatorMethodContext ctx) {
		return visit(ctx.mutator());
	}
	
	@Override
	public Verifier visitAccessorMethod(AccessorMethodContext ctx) {
		return visit(ctx.accessor());
	}
	
	
	
	/* *****************************************************************************************
	 * Methods for mutator rule
	 * *****************************************************************************************
	 */
	
	
	@Override
	public Verifier visitMutators(MutatorsContext ctx) {
		// copy all the paremeters first
		List<Verifier> parameters = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.uninitialDecl().size(); i++) {
			parameters.add(visit(ctx.uninitialDecl(i)));
		}
		
		// copy all the implementations then
		List<Implementations> imp = new ArrayList<Implementations>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imp.add((Implementations) visit(ctx.implementation(i)));
		}
		
		varTypes.put(ctx.ID().getText(), "Method");
		return new Methods(ctx.ID().getText(), parameters, null, 
				visit(ctx.boolExpr(0)), imp, visit(ctx.boolExpr(1)), 
				new Declaration() {
				});
	}
	
	
	/* *****************************************************************************************
	 * Methods for accessor rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitAccessors(AccessorsContext ctx) {
		// copy all the paremeters first
		List<Verifier> parameters = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.uninitialDecl().size() - 1; i++) {
			parameters.add(visit(ctx.uninitialDecl(i)));
		}
		
		// copy all the implementations then
		List<Implementations> imp = new ArrayList<Implementations>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imp.add((Implementations) visit(ctx.implementation(i)));
		}
		varTypes.put(ctx.ID().getText(), "Method");
		return new Methods(ctx.ID().getText(), parameters, 
				visit(ctx.uninitialDecl(ctx.uninitialDecl().size() - 1)), 
				visit(ctx.boolExpr(0)), imp, visit(ctx.boolExpr(1)), 
				new Declaration() {
				});
	}
	
	
	
	
	
	
	
	/* *****************************************************************************************
	 * Methods for declaration rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitUninitialVarDecl(UninitialVarDeclContext ctx) {
		return visit(ctx.uninitialDecl());
	}
	
	
	@Override
	public Verifier visitInitialVarDecl(InitialVarDeclContext ctx) {
		return visit(ctx.initialDecl());
	}
	
	
	/* *****************************************************************************************
	 * Methods for uninitialDecl rule
	 * *****************************************************************************************
	 */
	
	// uninitialized boolean or int variable declaration
	@Override
	public Verifier visitSingleVar(SingleVarContext ctx) {
		// add the variable and their types to the map
		if (ctx.type.getType() == VerifierParser.BOOL) {
			varTypes.put(ctx.ID().getText(), "Bool");
			return new BoolVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID().getText(), "Int");
			return new IntVar(ctx.ID().getText(), new UninitializedDecl());
		} 
		else {
			varTypes.put(ctx.ID().getText(), "Real");
			return new RealVar(ctx.ID().getText(), new UninitializedDecl());
		}
	}
	
	
	// uninitialized array variable declaration
	@Override
	public Verifier visitArrayDecl(ArrayDeclContext ctx) {
		if (ctx.type.getType() == VerifierParser.BOOL) {
			varTypes.put(ctx.ID().getText(), "BoolArray");
			return new BoolArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID().getText(), "IntArray");
			return new IntArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
		else {
			varTypes.put(ctx.ID().getText(), "RealArray");
			return new RealArrayVar(ctx.ID().getText(), new UninitializedDecl());
		}
	}
	
	
	/* *****************************************************************************************
	 * Methods for initialDecl rule
	 * *****************************************************************************************
	 */
	
	
	// initialized boolean variable declaration
	@Override
	public Verifier visitBoolValueDecl(BoolValueDeclContext ctx) {
		varTypes.put(ctx.ID().getText(), "Bool");
		return new BoolVar(ctx.ID().getText(), visit(ctx.boolExpr()), new InitializedDecl());
	}
	
	
	// initialized arithmetic variable declaration
	@Override
	public Verifier visitNumValueDecl(NumValueDeclContext ctx) {
		if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID().getText(), "Int");
			return new IntVar(ctx.ID().getText(), visit(ctx.arithmetic()), new InitializedDecl());
		}
		else {
			varTypes.put(ctx.ID().getText(), "Real");
			return new RealVar(ctx.ID().getText(), visit(ctx.arithmetic()), new InitializedDecl());
		}
	}
	
	
	
	
	// boolean array declaration with initial value
	@Override
	public Verifier visitBoolArrayValueDecl(BoolArrayValueDeclContext ctx) {
		// create a list of Logic, and store all the elements
		List<Verifier> value = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.boolExpr().size(); i++) {
			value.add(visit(ctx.boolExpr(i)));
		}
		varTypes.put(ctx.ID().getText(), "BoolArray");
		return new BoolArrayVar(ctx.ID().getText(), value, new InitializedDecl());
	}
	
	// integer array declaration with initial value
	@Override
	public Verifier visitIntArrayValueDecl(IntArrayValueDeclContext ctx) {
		// create a list of Logic, and store all the elements
		List<Verifier> value = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.arithmetic().size(); i++) {
			value.add(visit(ctx.arithmetic(i)));
		}
		varTypes.put(ctx.ID().getText(), "IntArray");
		return new IntArrayVar(ctx.ID().getText(), value, new InitializedDecl());
	}
	
	// real array declaration with initial value
	@Override
	public Verifier visitRealArrayValueDecl(RealArrayValueDeclContext ctx) {
		// create a list of Logic, and store all the elements
		List<Verifier> value = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.arithmetic().size(); i++) {
			value.add(visit(ctx.arithmetic(i)));
		}
		varTypes.put(ctx.ID().getText(), "RealArray");
		
		return new RealArrayVar(ctx.ID().getText(), value, new InitializedDecl());
	}
	
	
	/* *****************************************************************************************
	 * Methods for implementation rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitVarAssignment(VarAssignmentContext ctx) {
		return visit(ctx.assignment());
	}
	
	
	/* *****************************************************************************************
	 * Methods for assignment rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitBoolAssign(BoolAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.boolExpr()));
	}
	
	
	@Override
	public Verifier visitArithAssign(ArithAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.arithmetic()));
	}
	
	
	
	/* *****************************************************************************************
	 * Methods for boolExpr rule
	 * *****************************************************************************************
	 */
	
	// Negation
	@Override
	public Verifier visitNot(NotContext ctx) {
		return new Negation(visit(ctx.boolExpr()));
	}
	
	// Conjunction
	@Override
	public Verifier visitAnd(AndContext ctx) {
		return new Conjunction(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Disjunction
	@Override
	public Verifier visitOr(OrContext ctx) {
		return new Disjunction(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Implication
	@Override
	public Verifier visitImplies(ImpliesContext ctx) {
		return new Implication(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	// Iff
	@Override
	public Verifier visitIff(IffContext ctx) {
		return new Iff(visit(ctx.boolExpr(0)), visit(ctx.boolExpr(1)));
	}
	
	
	
	// forall
	@Override
	public Verifier visitForall(ForallContext ctx) {
		// create a list of Var
		// recursively call visit(ctx.varDecl()) 
		// which will return a Logic object (it's guaranteed to be BoolVar or IntVar or RealVar)
		List<Verifier> list = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.varDecl().size(); i++) {
			list.add(visit(ctx.varDecl(i)));
		}
		// create a new Forall object, and copy all the declared variables into quantifyList
		return new Forall(list, visit(ctx.boolExpr()));
		
	}
	
	// there exists
	@Override
	public Verifier visitExists(ExistsContext ctx) {
		// create a list of Var
		// recursively call visit(ctx.varDecl()) 
		// which will return a Logic object (it's guaranteed to be BoolVar or IntVar or RealVar)
		List<Verifier> list = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.varDecl().size(); i++) {
			list.add(visit(ctx.varDecl(i)));
		}
		// create a new exists object, and copy all the declared variables into quantifyList
		return new Exists(list, visit(ctx.boolExpr()));
	}
		
	
	// boolean variable verification
	@Override
	public Verifier visitBoolVar(BoolVarContext ctx) {
		return new BoolVar(ctx.ID().getText(), new Verification());
	}
	
	
	// expression index value boolean array verification
	@Override
	public Verifier visitIndexBoolArray(IndexBoolArrayContext ctx) {
		return new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic()));
	}
	
	
	// boolean true declaration
	@Override
	public Verifier visitBoolTrue(BoolTrueContext ctx) {
		return new BoolTrue(ctx.TRUE().getText());
	}
	
	// boolean false declaration
	@Override
	public Verifier visitBoolFalse(BoolFalseContext ctx) {
		return new BoolFalse(ctx.FALSE().getText());
	}
	
	
	// parentheses
	@Override
	public Verifier visitParen(ParenContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	// Relate
	@Override
	public Verifier visitRelate(RelateContext ctx) {
		return visit(ctx.relation());
	}
	
	
	/* *****************************************************************************************
	 * Methods for varDecl rule
	 * *****************************************************************************************
	 */
	
	// quantification variable declaration
	@Override
	public Verifier visitQuantifyVar(QuantifyVarContext ctx) {
		
		if (ctx.type.getType() == VerifierParser.BOOL) {
			// store each ID's string into list
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(ctx.ID(i).getText());
				varTypes.put(ctx.ID(i).getText(), "Bool");
			}
			// create a new BoolVar object, accepting the list
			// and transform the list of String into a list of BoolVar
			return new BoolVar(list, new QuantifyBool());
		}
		else if (ctx.type.getType() == VerifierParser.INT) {
			// store each ID's string into list
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(ctx.ID(i).getText());
				varTypes.put(ctx.ID(i).getText(), "Int");
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
				varTypes.put(ctx.ID(i).getText(), "Real");
			}
			// create a new RealVar object, accepting the list
			// and transform the list of String into a list of RealVar
			return new RealVar(list, new QuantifyReal());
		}
	}
	
	
	/* *****************************************************************************************
	 * Methods for relation rule
	 * *****************************************************************************************
	 */
	
	// arithmetic equal
	@Override
	public Verifier visitEqual(EqualContext ctx) {
		return new Equal(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic greater than
	@Override
	public Verifier visitGreaterThan(GreaterThanContext ctx) {
		return new GreaterThan(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic less than
	@Override
	public Verifier visitLessThan(LessThanContext ctx) {
		return new LessThan(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic greater or equal
	@Override
	public Verifier visitGreaterOrEqual(GreaterOrEqualContext ctx) {
		return new GreaterOrEqual(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// arithmetic less or equal
	@Override
	public Verifier visitLessOrEqual(LessOrEqualContext ctx) {
		return new LessOrEqual(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	
	/* *****************************************************************************************
	 * Methods for arithmetic rule
	 * *****************************************************************************************
	 */
	
	// multiply or division
	@Override
	public Verifier visitMulDiv(MulDivContext ctx) {
		if (ctx.op.getType() == VerifierParser.MUL) {
			return new Multiplication(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
		else {
			return new Division(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
	}
	
	// add or subtract
	@Override
	public Verifier visitAddSub(AddSubContext ctx) {
		if (ctx.op.getType() == VerifierParser.ADD) {
			return new Addition(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
		else {
			return new Subtraction(visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1))); 
		}
	}
	
	// arithmetic variable verification
	@Override
	public Verifier visitArithmeticVar(ArithmeticVarContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Int")) {
				return new IntVar(ctx.ID().getText(), new Verification());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Real")) {
				return new RealVar(ctx.ID().getText(), new Verification());
			}
			// Declared for NIL means the variable has been declared but with the wrong type
			else {
				return new NIL(ctx.ID().getText(), new Declared());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new NIL(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// arithmetic array variable verification
	@Override
	public Verifier visitIndexArithmeticArray(IndexArithmeticArrayContext ctx) {
		// if the map contains the variable, check its type
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new IntArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic()));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new RealArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic()));
			}
			// Declared for NIL means the variable has been declared but with the wrong type
			else {
				return new NIL(ctx.ID().getText(), new Declared());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new NIL(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// int number
	@Override
	public Verifier visitIntNum(IntNumContext ctx) {
		return new IntConst(ctx.INTNUM().getText());
	}
	
	
	// real number
	@Override
	public Verifier visitRealNum(RealNumContext ctx) {
		return new RealConst(ctx.REALNUM().getText());
	}
	
	
	// arithmetic parentheses
	@Override
	public Verifier visitArithParen(ArithParenContext ctx) {
		return visit(ctx.arithmetic());
	}
}
