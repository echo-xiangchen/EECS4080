package verifier;

import java.util.*;

import org.antlr.v4.runtime.misc.Pair;

import antlr.*;
import antlr.VerifierParser.*;
import modes.*;
import types.BoolType;
import types.IntArray;
import types.IntType;
import types.RealArray;
import types.RealType;
import verifier.composite.*;

public class AntlrToVerifier extends VerifierBaseVisitor<Verifier>{
	
	public static Map<String, String> varTypes = new HashMap<String, String>();
	
	public static boolean isPair = false;
	
	/* *****************************************************************************************
	 * Methods for line rule
	 * *****************************************************************************************
	 */
	
	
	// variable declaration
	// declaration
	@Override
	public Verifier visitVarDeclaration(VarDeclarationContext ctx) {
		return visit(ctx.declaration());
	}
	
	// assignment
	@Override
	public Verifier visitAssignDecl(AssignDeclContext ctx) {
		return visit(ctx.assignment());
	}
	
	// method declaration
	@Override
	public Verifier visitDefineMethod(DefineMethodContext ctx) {
		return visit(ctx.method());
	}
	
	
	// verify the formula
	// VERIFY boolExpr
	@Override
	public Verifier visitVerifyBoolExpr(VerifyBoolExprContext ctx) {
		if (!varTypes.containsKey(visit(ctx.boolExpr()).name)) {
			return visit(ctx.boolExpr());
		}
		else if (varTypes.get(visit(ctx.boolExpr()).name).equals("Bool")
				|| varTypes.get(visit(ctx.boolExpr()).name).equals("BoolArray")) {
			return visit(ctx.boolExpr());
		}
		else {
			return new Methods(visit(ctx.boolExpr()).name, new Verification());
		}
	}
	
	
	// verify the method
	// VERIFY ID
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
	
	
//	ID '(' ('(' uninitialDecl (';' uninitialDecl)* ')')? ')'
//		(precondition)?
//		(local)?
//		DO 
//			(implementation)+
//		(postcondition)? 
//		END
	@Override
	public Verifier visitMutators(MutatorsContext ctx) {
		// copy all the paremeters first
		List<Verifier> parameters = new ArrayList<Verifier>();;
		if (ctx.uninitialDecl().size() > 0) {
			for (int i = 0; i < ctx.uninitialDecl().size(); i++) {
				parameters.add(visit(ctx.uninitialDecl(i)));
			}
		}
		
		// store the preconditions
		Verifier preconditions;
		if (ctx.precondition() != null) {
			preconditions = visit(ctx.precondition());
		}
		else {
			preconditions = null;
		}
		
		// store the local variables
		Verifier locals;
		if (ctx.local() != null) {
			locals = visit(ctx.local());
		}
		else {
			locals = null;
		}
		
		// store the postconditions
		Verifier postconditions;
		if (ctx.postcondition() != null) {
			postconditions = visit(ctx.postcondition());
		}
		else {
			postconditions = null;
		}
		
		// copy all the implementations then
		List<Verifier> imp = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imp.add(visit(ctx.implementation(i)));
		}
		
		varTypes.put(ctx.ID().getText(), "Method");
		return new Methods(ctx.ID().getText(), parameters, null, 
				preconditions, locals, imp, postconditions, new Declaration());
	}
	
	
	/* *****************************************************************************************
	 * Methods for accessor rule
	 * *****************************************************************************************
	 */
	
	
//	ID '(' ('(' uninitialDecl (';' uninitialDecl)* ')')? ')' ':' unnamedDecl
//		(precondition)?
//		(local)?
//		DO 
//			(implementation)+
//		(postcondition)? 
//		END
	
	@Override
	public Verifier visitAccessors(AccessorsContext ctx) {
		// copy all the paremeters first
		List<Verifier> parameters = new ArrayList<Verifier>();
		if (ctx.uninitialDecl().size() > 0) {
			for (int i = 0; i < ctx.uninitialDecl().size(); i++) {
				parameters.add(visit(ctx.uninitialDecl(i)));
			}
		}
		
		// store the preconditions
		Verifier preconditions;
		if (ctx.precondition() != null) {
			preconditions = visit(ctx.precondition());
		}
		else {
			preconditions = null;
		}
		
		// store the local variables
		Verifier locals;
		if (ctx.local() != null) {
			locals = visit(ctx.local());
		}
		else {
			locals = null;
		}
		
		// store the postconditions
		Verifier postconditions;
		if (ctx.postcondition() != null) {
			postconditions = visit(ctx.postcondition());
		}
		else {
			postconditions = null;
		}
		
		// copy all the implementations then
		List<Verifier> imp = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imp.add(visit(ctx.implementation(i)));
		}
		
		varTypes.put(ctx.ID().getText(), "Method");
		return new Methods(ctx.ID().getText(), parameters, 
				visit(ctx.unnamedDecl()), preconditions, locals,
				imp, postconditions, new Declaration());
	}
	
	/* *****************************************************************************************
	 * Methods for precondition rule
	 * *****************************************************************************************
	 */
	
	// REQUIRE (contract)+
	
	@Override
	public Verifier visitPreContract(PreContractContext ctx) {
		// copy all the contracts
		List<Verifier> contracts = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.contract().size(); i++) {
			contracts.add(visit(ctx.contract(i)));
		}
		
		return new Preconditions(contracts);
	}
	
	/* *****************************************************************************************
	 * Methods for postcondition rule
	 * *****************************************************************************************
	 */
	
	// ENSURE (contract)+
	@Override
	public Verifier visitPostContract(PostContractContext ctx) {
		// copy all the contracts
		List<Verifier> contracts = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.contract().size(); i++) {
			contracts.add(visit(ctx.contract(i)));
		}
		
		return new Postconditions(contracts);
	}
	
	/* *****************************************************************************************
	 * Methods for contract rule
	 * *****************************************************************************************
	 */
	
	// (ID ':')? boolExpr
	
	@Override
	public Verifier visitContracts(ContractsContext ctx) {
		if (ctx.ID() != null) {
			return new ContractExpr(new Pair<String, Verifier>
				(ctx.ID().getText(), visit(ctx.boolExpr())));
		}
		else {
			return new ContractExpr(new Pair<String, Verifier>
				(null, visit(ctx.boolExpr())));
		}
	}
	
	/* *****************************************************************************************
	 * Methods for local rule
	 * *****************************************************************************************
	 */
	
	// LOCAL declaration+
	
	@Override
	public Verifier visitLocalDecl(LocalDeclContext ctx) {
		List<Verifier> vars = new ArrayList<Verifier>();
		
		for (int i = 0; i < ctx.declaration().size(); i++) {
			vars.add(visit(ctx.declaration(i)));
		}
		
		return new Locals(vars);
	}
	
	/* *****************************************************************************************
	 * Methods for implementation rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitImpAssignment(ImpAssignmentContext ctx) {
		return visit(ctx.assignment());
	}
	
	
	@Override
	public Verifier visitImpAlternation(ImpAlternationContext ctx) {
		return visit(ctx.alternations());
	}
	
	/* *****************************************************************************************
	 * Methods for assignment rule
	 * *****************************************************************************************
	 */
	
	// ID ':=' ID ';'
	@Override
	public Verifier visitSingleVarAssign(SingleVarAssignContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
				return new Assignments(ctx.ID(0).getText(), 
						new BoolVar(ctx.ID(1).getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
				return new Assignments(ctx.ID(0).getText(), 
						new IntVar(ctx.ID(1).getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
				return new Assignments(ctx.ID(0).getText(), 
						new RealVar(ctx.ID(1).getText(), new Verification()));
			}
			else {
				// if it is array assignment, it's not allowed
				return new NIL(ctx.ID(0).getText(), new ArrayAssign());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new NIL(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID ':=' boolExpr ';'
	@Override
	public Verifier visitBoolAssign(BoolAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.boolExpr()));
	}
	
	
	// ID ':=' arithmetic ';'
	@Override
	public Verifier visitArithAssign(ArithAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.arithmetic()));
	}
	
	// ID ':=' '<<' (boolExpr (',' boolExpr)*)? '>>' ';'
	@Override
	public Verifier visitBoolArrayInitialize(BoolArrayInitializeContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			// create a list of Logic, and store all the elements
			List<Verifier> value = new ArrayList<Verifier>();
			for (int i = 0; i < ctx.boolExpr().size(); i++) {
				value.add(visit(ctx.boolExpr(i)));
			}
			
			return new BoolArrayVar(ctx.ID().getText(), value, new Assignment());
		}
		else {
			return new NIL(ctx.ID().getText(), new Undeclared());
		}
		
	}
	
	// ID ':=' '<<' (arithmetic (',' arithmetic)*)? '>>' ';'
	@Override
	public Verifier visitArithArrayInitialize(ArithArrayInitializeContext ctx) {
		// if the map contains the variable, check its type
		if (varTypes.containsKey(ctx.ID().getText())) {
			List<Verifier> value = new ArrayList<Verifier>();
			for (int i = 0; i < ctx.arithmetic().size(); i++) {
				value.add(visit(ctx.arithmetic(i)));
			}
			if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new IntArrayVar(ctx.ID().getText(), value, new Assignment());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new RealArrayVar(ctx.ID().getText(), value, new Assignment());
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
	
	// ID '[' arithmetic ']' ':=' ID ';'
	@Override
	public Verifier visitArraySingleVarAssign(ArraySingleVarAssignContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmetic()), 
						new BoolVar(ctx.ID(1).getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmetic()), 
						new IntVar(ctx.ID(1).getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmetic()), 
						new RealVar(ctx.ID(1).getText(), new Verification()));
			}
			else {
				// if it is array assignment, it's not allowed
				return new NIL(ctx.ID(0).getText(), new ArrayAssign());
			}
		}
		
		return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmetic()),
				new BoolVar(ctx.ID(1).getText(), new Verification()));
	}
	
	// ID '[' arithmetic ']' ':=' boolExpr
	@Override
	public Verifier visitBoolArrayAssign(BoolArrayAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), 
				visit(ctx.arithmetic()), visit(ctx.boolExpr()));
	}
	
	// ID '[' arithmetic ']' ':=' arithmetic
	@Override
	public Verifier visitArithArrayAssign(ArithArrayAssignContext ctx) {
		return new Assignments(ctx.ID().getText(), 
				visit(ctx.arithmetic(0)), visit(ctx.arithmetic(1)));
	}
	
	// RESULT ':=' ID ';'
	@Override
	public Verifier visitSingleVarResultAssign(SingleVarResultAssignContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Bool")) {
				return new Assignments(ctx.RESULT().getText(), 
						new BoolVar(ctx.ID().getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Int")) {
				return new Assignments(ctx.RESULT().getText(), 
						new IntVar(ctx.ID().getText(), new Verification()));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Real")) {
				return new Assignments(ctx.RESULT().getText(), 
						new RealVar(ctx.ID().getText(), new Verification()));
			}
			else {
				// if it is array assignment, it's not allowed
				return new NIL(ctx.ID().getText(), new ArrayAssign());
			}
		}
		else {
			return new NIL(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT ':=' ID '[' arithmetic ']'
	@Override
	public Verifier visitArrayValueResultAssign(ArrayValueResultAssignContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("BoolArray")) {
				return new Assignments(ctx.RESULT().getText(), 
						new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic())));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new Assignments(ctx.RESULT().getText(), 
						new IntArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic())));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new Assignments(ctx.RESULT().getText(), 
						new RealArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic())));
			}
			return new Assignments(ctx.RESULT().getText(), 
					new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmetic())));
		}
		else {
			return new NIL(ctx.ID().getText(), new Undeclared());
		}
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
	 * Methods for unnamedDecl rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitUnnamedSingleVarDecl(UnnamedSingleVarDeclContext ctx) {
		// check if it's pair value
		if (isPair) {
			// add the variable and their types to the map
			if (ctx.type.getType() == VerifierParser.BOOL) {
				return new BoolVar(new AnonymousDecl());
			}
			else if (ctx.type.getType() == VerifierParser.INT) {
				return new IntVar(new AnonymousDecl());
			} 
			else {
				return new RealVar(new AnonymousDecl());
			}
		}
		else {
			// add the variable and their types to the map
			if (ctx.type.getType() == VerifierParser.BOOL) {
				return new BoolVar("Result", new AnonymousDecl());
			}
			else if (ctx.type.getType() == VerifierParser.INT) {
				return new IntVar("Result", new AnonymousDecl());
			} 
			else {
				return new RealVar("Result", new AnonymousDecl());
			}
		}
	}
	
	@Override
	public Verifier visitUnnamedArrayDecl(UnnamedArrayDeclContext ctx) {
		// check if it's pair value
		if (isPair) {
			if (ctx.type.getType() == VerifierParser.BOOL) {
				return new BoolArrayVar(new AnonymousDecl());
			}
			else if (ctx.type.getType() == VerifierParser.INT) {
				return new IntArrayVar(new AnonymousDecl());
			}
			else {
				return new RealArrayVar(new AnonymousDecl());
			}
		}
		else {
			if (ctx.type.getType() == VerifierParser.BOOL) {
				return new BoolArrayVar("Result", new AnonymousDecl());
			}
			else if (ctx.type.getType() == VerifierParser.INT) {
				return new IntArrayVar("Result", new AnonymousDecl());
			}
			else {
				return new RealArrayVar("Result", new AnonymousDecl());
			}
		}
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
	
	// old boolean variable
	@Override
	public Verifier visitOldBoolVar(OldBoolVarContext ctx) {
		return new Olds(ctx.ID().getText(), new BoolType());
	}
	
	// old boolean array
	@Override
	public Verifier visitOldBoolArray(OldBoolArrayContext ctx) {
		return new Olds(ctx.ID().getText(), visit(ctx.arithmetic()), new BoolType());
	}
	
	// result variable
	@Override
	public Verifier visitBoolResult(BoolResultContext ctx) {
		return new Results();
	}
	
	// result array
	@Override
	public Verifier visitBoolArrayResult(BoolArrayResultContext ctx) {
		return new Results(visit(ctx.arithmetic()));
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
	
	// old arithmetic variable
	@Override
	public Verifier visitOldArithVar(OldArithVarContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Int")) {
				return new Olds(ctx.ID().getText(), new IntType());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Real")) {
				return new Olds(ctx.ID().getText(), new RealType());
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
	
	// old array variable
	@Override
	public Verifier visitOldArithArray(OldArithArrayContext ctx) {
		// if the map contains the variable, check its type
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new Olds(ctx.ID().getText(), visit(ctx.arithmetic()), new IntArray());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new Olds(ctx.ID().getText(), visit(ctx.arithmetic()), new RealArray());
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
	
	// result variable
	@Override
	public Verifier visitArithResult(ArithResultContext ctx) {
		return new Results();
	}
	
	// result array variable
	@Override
	public Verifier visitArithArrayResult(ArithArrayResultContext ctx) {
		return new Results(visit(ctx.arithmetic()));
	}
	
	// int number
	@Override
	public Verifier visitIntNum(IntNumContext ctx) {
		return new IntConst(ctx.INTNUM().getText());
	}
	
	// a.count
	@Override
	public Verifier visitCountArray(CountArrayContext ctx) {
		return new IntConst(ctx.ID().getText(), "count", true);
	}
	
	// a.lower
	@Override
	public Verifier visitLowerArray(LowerArrayContext ctx) {
		return new IntConst(ctx.ID().getText(), "lower", true);
	}
	
	// a.upper
	@Override
	public Verifier visitUpperArray(UpperArrayContext ctx) {
		return new IntConst(ctx.ID().getText(), "upper", true);
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
