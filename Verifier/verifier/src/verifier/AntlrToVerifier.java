package verifier;

import java.util.*;

import org.antlr.v4.runtime.misc.Pair;
import antlr.*;
import antlr.VerifierParser.*;
import modes.*;
import types.*;
import verifier.composite.*;

public class AntlrToVerifier extends VerifierBaseVisitor<Verifier>{
	
	public static Map<String, String> varTypes = new HashMap<String, String>();
	
	public static boolean isPair;
	
	/* *****************************************************************************************
	 * TODO Methods for line rule
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
	 * TODO Methods for method rule
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
	 * TODO Methods for mutator rule
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
		
		// store the local variables
		Verifier locals;
		if (ctx.local() != null) {
			locals = visit(ctx.local());
		}
		else {
			locals = null;
		}
		
		// store the preconditions
		Verifier preconditions;
		if (ctx.precondition() != null) {
			preconditions = visit(ctx.precondition());
		}
		else {
			preconditions = null;
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
	 * TODO Methods for accessor rule
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
		
		// store the local variables
		Verifier locals;
		if (ctx.local() != null) {
			locals = visit(ctx.local());
		}
		else {
			locals = null;
		}
		
		// store the preconditions
		Verifier preconditions;
		if (ctx.precondition() != null) {
			preconditions = visit(ctx.precondition());
		}
		else {
			preconditions = null;
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
	 * TODO Methods for precondition rule
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
	 * TODO Methods for postcondition rule
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
	 * TODO Methods for contract rule
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
	 * TODO Methods for local rule
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
	 * TODO Methods for implementation rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitImpAssignment(ImpAssignmentContext ctx) {
		return visit(ctx.assignment());
	}
	
	
	@Override
	public Verifier visitImpAlternation(ImpAlternationContext ctx) {
		return visit(ctx.alternation());
	}
	
	/* *****************************************************************************************
	 * TODO Methods for assignment rule
	 * *****************************************************************************************
	 */
	
	/* *****************************************************************************************
	 * TODO Methods for re-assignment rule
	 * *****************************************************************************************
	 */
	// ID ':=' '<<' (boolExpr (',' boolExpr)*)? '>>' ';'
		@Override
		public Verifier visitBoolArrayInitialize(BoolArrayInitializeContext ctx) {
			if (varTypes.containsKey(ctx.ID().getText())) {
				// create a list of Logic, and store all the elements
				List<Verifier> value = new ArrayList<Verifier>();
				for (int i = 0; i < ctx.boolExpr().size(); i++) {
					value.add(visit(ctx.boolExpr(i)));
				}
				
				if (varTypes.get(ctx.ID().getText()).equals("BoolArray")) {
					return new BoolArrayVar(ctx.ID().getText(), value, new Assignment());
				}
				else if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
					return new IntArrayVar(ctx.ID().getText(), value, new Assignment());
				}
				else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
					return new RealArrayVar(ctx.ID().getText(), value, new Assignment());
				}
				
				return new BoolArrayVar(ctx.ID().getText(), value, new Assignment());
				
			}
			else {
				return new UnknownVar(ctx.ID().getText(), new Undeclared());
			}
			
		}
		
		// ID ':=' '<<' (arithmetic (',' arithmetic)*)? '>>' ';'
		@Override
		public Verifier visitArithArrayInitialize(ArithArrayInitializeContext ctx) {
			// if the map contains the variable, check its type
			if (varTypes.containsKey(ctx.ID().getText())) {
				List<Verifier> value = new ArrayList<Verifier>();
				for (int i = 0; i < ctx.arithmeticExpr().size(); i++) {
					value.add(visit(ctx.arithmeticExpr(i)));
				}
				if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
					return new IntArrayVar(ctx.ID().getText(), value, new Assignment());
				}
				else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
					return new RealArrayVar(ctx.ID().getText(), value, new Assignment());
				}
				// WrongBoolDecl for UnknownVar means the variable has been declared but with the wrong type
				else {
					return new UnknownVar(ctx.ID().getText(), new WrongBoolDecl());
				}
			}
			// Undeclared means the variable has not been declared
			else {
				return new UnknownVar(ctx.ID().getText(), new Undeclared());
			}
		}
		
	// ID ':=' '[' expr ';' expr ']' ';'
		@Override
		public Verifier visitPairReinitialize(PairReinitializeContext ctx) {
			List<Verifier> value = new ArrayList<Verifier>();
			Verifier leftelement = visit(ctx.expr(0));
			Verifier rightelement = visit(ctx.expr(1));
			
			value.add(leftelement);
			value.add(rightelement);
			return new PairVar(ctx.ID().getText(), value, new Assignment());
		}
	
		
	/* *****************************************************************************************
	 * TODO Methods for normal variable assignment
	 * *****************************************************************************************
	 */
	// ID ':=' ID ';'
	@Override
	public Verifier visitNormalVarAssignToNormalVar(NormalVarAssignToNormalVarContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
				Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
				Verifier value = new IntVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
				Verifier value = new RealVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Pair")){
				// if it is pair assignment, it's not allowed
				return new UnknownVar(ctx.ID(0).getText(), new IsPairAssign());
			}
			else {
				// if it is pair assignment, it's not allowed
				return new UnknownVar(ctx.ID(0).getText(), new IsArrayAssign());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitNormalVarAssignToArrayE(NormalVarAssignToArrayEContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("BoolArray")) {
				Verifier array = new BoolArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments(ctx.ID(0).getText(), array, new NormalVarAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("IntArray")) {
				Verifier array = new IntArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments(ctx.ID(0).getText(), array, new NormalVarAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("RealArray")) {
				Verifier array = new RealArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments(ctx.ID(0).getText(), array, new NormalVarAssign());
			}
			else {
				// if ctx.ID(1).getText()) is not array type
				return new UnknownVar(ctx.ID(1).getText(), new WrongArrayDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID ':=' ID '.' e=(FIRST|SECOND) ';'
	@Override
	public Verifier visitNormalVarAssignToPairFS(NormalVarAssignToPairFSContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
				if (ctx.e.getType() == VerifierParser.FIRST) {
					if (varTypes.get(ctx.ID(1).getText() + ".first").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), "first", new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID(1).getText(), "first", new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
					}
				}
				else {
					if (varTypes.get(ctx.ID(1).getText() + ".second").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), "second", new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID(1).getText(), "second", new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
					}
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID ':=' ID '.' ID ';'
	@Override
	public Verifier visitNormalVarAssignToPairE(NormalVarAssignToPairEContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
				if (varTypes.get(ctx.ID(1).getText() + "." + ctx.ID(2).getText()).equals("Bool")) {
					Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new BoolVerification());
					return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
				}
				else {
					Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new ArithVerification());
					return new Assignments(ctx.ID(0).getText(), value, new NormalVarAssign());
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID ':=' boolExpr ';'
	@Override
	public Verifier visitNormalVarAssignToBoolE(NormalVarAssignToBoolEContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.boolExpr()),new NormalVarAssign());
	}
	
	// ID ':=' arithmetic ';'
	@Override
	public Verifier visitNormalVarAssignToArithE(NormalVarAssignToArithEContext ctx) {
		return new Assignments(ctx.ID().getText(), visit(ctx.arithmeticExpr()),new NormalVarAssign());
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for array variable assignment
	 * *****************************************************************************************
	 */
	
	// ID '[' arithmetic ']' ':=' ID ';'
	@Override
	public Verifier visitArrayEAssignToNormalVar(ArrayEAssignToNormalVarContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
				Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
				Verifier value = new IntVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
				Verifier value = new RealVar(ctx.ID(1).getText(), new Verification());
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("Pair")){
				// if it is pair assignment, it's not allowed
				return new UnknownVar(ctx.ID(0).getText(), new IsPairAssign());
			}
			else {
				// if it is array assignment, it's not allowed
				return new UnknownVar(ctx.ID(0).getText(), new IsArrayAssign());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID '[' arithmeticExpr ']' ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitArrayEAssignToArrayE(ArrayEAssignToArrayEContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("BoolArray")) {
				Verifier array = new BoolArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr(0)), array, new ArrayEAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("IntArray")) {
				Verifier array = new IntArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr(0)), array, new ArrayEAssign());
			}
			else if (varTypes.get(ctx.ID(1).getText()).equals("RealArray")) {
				Verifier array = new RealArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr(0)), array, new ArrayEAssign());
			}
			else {
				// if ctx.ID(1).getText()) is not array type
				return new UnknownVar(ctx.ID(1).getText(), new WrongArrayDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID '[' arithmeticExpr ']' ':=' ID '.' e=(FIRST|SECOND) ';'
	@Override
	public Verifier visitArrayEAssignToPairFS(ArrayEAssignToPairFSContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
				if (ctx.e.getType() == VerifierParser.FIRST) {
					if (varTypes.get(ctx.ID(1).getText() + ".first").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), "first", new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID(1).getText(), "first", new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
					}
				}
				else {
					if (varTypes.get(ctx.ID(1).getText() + ".second").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), "second", new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID(1).getText(), "second", new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
					}
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	// ID '[' arithmeticExpr ']' ':=' ID '.' ID ';'
	@Override
	public Verifier visitArrayEAssignToPairE(ArrayEAssignToPairEContext ctx) {
		if (varTypes.containsKey(ctx.ID(1).getText())) {
			if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
				if (varTypes.get(ctx.ID(1).getText() + "." + ctx.ID(2).getText()).equals("Bool")) {
					Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new BoolVerification());
					return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
				}
				else {
					Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new ArithVerification());
					return new Assignments(ctx.ID(0).getText(), visit(ctx.arithmeticExpr()), value, new ArrayEAssign());
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
		}
	}
	
	
	// ID '[' arithmetic ']' ':=' boolExpr
	@Override
	public Verifier visitArrayEAssignToBoolE(ArrayEAssignToBoolEContext ctx) {
		return new Assignments(ctx.ID().getText(), 
				visit(ctx.arithmeticExpr()), visit(ctx.boolExpr()),new ArrayEAssign());
	}
	
	// ID '[' arithmetic ']' ':=' arithmeticExpr
	@Override
	public Verifier visitArrayEAssignToArithE(ArrayEAssignToArithEContext ctx) {
		return new Assignments(ctx.ID().getText(), 
				visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)),new ArrayEAssign());
	}
	
	
	
	/* *****************************************************************************************
	 * TODO Methods for pair variable assignment
	 * *****************************************************************************************
	 */
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' ID ';'
	@Override
	public Verifier visitPairEAssignToNormalVar(PairEAssignToNormalVarContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(1).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else {
			if (varTypes.containsKey(ctx.ID(2).getText())) {
				if (varTypes.get(ctx.ID(2).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(2).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(2).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(2).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(2).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(2).getText(), new Verification());
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(2).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar(ctx.ID(0).getText(), new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(2).getText(), new Undeclared());
			}
		}
	}
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitPairEAssignToArrayE(PairEAssignToArrayEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "first", array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "first", array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "first", array, new PairEAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(1).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "second", array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "second", array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), "second", array, new PairEAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(1).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else {
			if (varTypes.containsKey(ctx.ID(2).getText())) {
				if (varTypes.get(ctx.ID(2).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(2).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(2).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(2).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), array, new PairEAssign());
				}
				else if (varTypes.get(ctx.ID(2).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(2).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), array, new PairEAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(2).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(2).getText(), new Undeclared());
			}
		}
	}
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' ID '.' a=(FIRST|SECOND) ';'
	@Override
	public Verifier visitPairEAssignToPairFS(PairEAssignToPairFSContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(1).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(1).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
			
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(1).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(1).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
			
		}
		else {
			if (varTypes.containsKey(ctx.ID(2).getText())) {
				if (varTypes.get(ctx.ID(2).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(2).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(2).getText(), "first", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(2).getText(), "first", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(2).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(2).getText(), "second", new BoolVerification());
							return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(2).getText(), "second", new ArithVerification());
							return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(2).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(2).getText(), new Undeclared());
			}
		}
	}
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' ID '.' ID ';'
	@Override
	public Verifier visitPairEAssignToPairE(PairEAssignToPairEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (varTypes.get(ctx.ID(1).getText() + "." + ctx.ID(2).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), "first", value, new PairEAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (varTypes.get(ctx.ID(1).getText() + "." + ctx.ID(2).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), "second", value, new PairEAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
		else {
			if (varTypes.containsKey(ctx.ID(2).getText())) {
				if (varTypes.get(ctx.ID(2).getText()).equals("Pair")) {
					
					if (varTypes.get(ctx.ID(2).getText() + "." + ctx.ID(3).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(2).getText(), ctx.ID(3).getText(), new BoolVerification());
						return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(2).getText(), ctx.ID(3).getText(), new ArithVerification());
						return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), value, new PairEAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(2).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(2).getText(), new Undeclared());
			}
		}
	}
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' boolExpr ';'
	@Override
	public Verifier visitPairEAssignToBoolE(PairEAssignToBoolEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Assignments(ctx.ID(0).getText(), "first", visit(ctx.boolExpr()),new PairEAssign());
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Assignments(ctx.ID(0).getText(), "second", visit(ctx.boolExpr()),new PairEAssign());
		}
		else {
			return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), visit(ctx.boolExpr()),new PairEAssign());
		}
	}
	
	// ID '.' e=(FIRST|SECOND|ID) ':=' arithmeticExpr ';'
	@Override
	public Verifier visitPairEAssignToArithE(PairEAssignToArithEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Assignments(ctx.ID(0).getText(), "first", visit(ctx.arithmeticExpr()),new PairEAssign());
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Assignments(ctx.ID(0).getText(), "second", visit(ctx.arithmeticExpr()),new PairEAssign());
		}
		else {
			return new Assignments(ctx.ID(0).getText(), ctx.ID(1).getText(), visit(ctx.arithmeticExpr()),new PairEAssign());
		}
	}
	
	
	
	/* *****************************************************************************************
	 * TODO Methods for normal result assignment
	 * *****************************************************************************************
	 */
	
	// RESULT ':=' ID ';'
	@Override
	public Verifier visitNormalResultAssignToNormalVar(NormalResultAssignToNormalVarContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Bool")) {
				Verifier value = new BoolVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", value, new ResultNormalAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Int")) {
				Verifier value = new IntVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", value, new ResultNormalAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Real")) {
				Verifier value = new RealVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", value, new ResultNormalAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Pair")){
				// if it is pair assignment, it's not allowed
				return new UnknownVar("Result", new IsPairAssign());
			}
			else {
				// if it is pair assignment, it's not allowed
				return new UnknownVar("Result", new IsArrayAssign());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitNormalResultAssignToArrayE(NormalResultAssignToArrayEContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("BoolArray")) {
				Verifier array = new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments("Result", array, new ResultNormalAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				Verifier array = new IntArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments("Result", array, new ResultNormalAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				Verifier array = new RealArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
				return new Assignments("Result", array, new ResultNormalAssign());
			}
			else {
				// if ctx.ID(1).getText()) is not array type
				return new UnknownVar(ctx.ID().getText(), new WrongArrayDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT ':=' ID '.' e=(FIRST|SECOND) ';'
	@Override
	public Verifier visitNormalResultAssignToPairFS(NormalResultAssignToPairFSContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Pair")) {
				if (ctx.e.getType() == VerifierParser.FIRST) {
					if (varTypes.get(ctx.ID().getText() + ".first").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID().getText(), "first", new BoolVerification());
						return new Assignments("Result", value, new ResultNormalAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID().getText(), "first", new ArithVerification());
						return new Assignments("Result", value, new ResultNormalAssign());
					}
				}
				else {
					if (varTypes.get(ctx.ID().getText() + ".second").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID().getText(), "second", new BoolVerification());
						return new Assignments("Result", value, new ResultNormalAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID().getText(), "second", new ArithVerification());
						return new Assignments("Result", value, new ResultNormalAssign());
					}
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT ':=' ID '.' ID ';'
	@Override
	public Verifier visitNormalResultAssignToPairE(NormalResultAssignToPairEContext ctx) {
		if (varTypes.containsKey(ctx.ID(0).getText())) {
			if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
				if (varTypes.get(ctx.ID(0).getText() + ctx.ID(1).getText()).equals("Bool")) {
					Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new BoolVerification());
					return new Assignments("Result", value, new ResultNormalAssign());
				}
				else {
					Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new ArithVerification());
					return new Assignments("Result", value, new ResultNormalAssign());
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
		}
	}
	
	// RESULT ':=' boolExpr ';'
	@Override
	public Verifier visitNormalResultAssignToBoolE(NormalResultAssignToBoolEContext ctx) {
		return new Assignments("Result", visit(ctx.boolExpr()),new ResultNormalAssign());
	}
	
	// RESULT ':=' arithmeticExpr
	@Override
	public Verifier visitNormalResultAssignToArithE(NormalResultAssignToArithEContext ctx) {
		return new Assignments("Result", visit(ctx.arithmeticExpr()),new ResultNormalAssign());
	}
	
	/* *****************************************************************************************
	 * TODO Methods for array result assignment
	 * *****************************************************************************************
	 */
	
	// RESULT '[' arithmeticExpr ']' ':=' ID ';'
	@Override
	public Verifier visitArrayResultAssignToNormalVar(ArrayResultAssignToNormalVarContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Bool")) {
				Verifier value = new BoolVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Int")) {
				Verifier value = new IntVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Real")) {
				Verifier value = new RealVar(ctx.ID().getText(), new Verification());
				return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("Pair")){
				// if it is pair assignment, it's not allowed
				return new UnknownVar("Result", new IsPairAssign());
			}
			else {
				// if it is array assignment, it's not allowed
				return new UnknownVar("Result", new IsArrayAssign());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT '[' arithmeticExpr ']' ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitArrayResultAssignToArrayE(ArrayResultAssignToArrayEContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("BoolArray")) {
				Verifier array = new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments("Result", visit(ctx.arithmeticExpr(0)), array, new ResultArrayAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				Verifier array = new IntArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments("Result", visit(ctx.arithmeticExpr(0)), array, new ResultArrayAssign());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				Verifier array = new RealArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr(1)));
				return new Assignments("Result", visit(ctx.arithmeticExpr(0)), array, new ResultArrayAssign());
			}
			else {
				// if ctx.ID(1).getText()) is not array type
				return new UnknownVar(ctx.ID().getText(), new WrongArrayDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT '[' arithmeticExpr ']' ':=' ID '.' e=(FIRST|SECOND) ';'
	@Override
	public Verifier visitArrayResultAssignToPairFS(ArrayResultAssignToPairFSContext ctx) {
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("Pair")) {
				if (ctx.e.getType() == VerifierParser.FIRST) {
					if (varTypes.get(ctx.ID().getText() + ".first").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID().getText(), "first", new BoolVerification());
						return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID().getText(), "first", new ArithVerification());
						return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
					}
				}
				else {
					if (varTypes.get(ctx.ID().getText() + ".second").equals("Bool")) {
						Verifier value = new PairVar(ctx.ID().getText(), "second", new BoolVerification());
						return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
					}
					else  {
						Verifier value = new PairVar(ctx.ID().getText(), "second", new ArithVerification());
						return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
					}
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// RESULT '[' arithmeticExpr ']' ':=' ID '.' ID ';'
	@Override
	public Verifier visitArrayResultAssignToPairE(ArrayResultAssignToPairEContext ctx) {
		if (varTypes.containsKey(ctx.ID(0).getText())) {
			if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
				if (varTypes.get(ctx.ID(0).getText() + ctx.ID(1).getText()).equals("Bool")) {
					Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new BoolVerification());
					return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
				}
				else {
					Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new ArithVerification());
					return new Assignments("Result", visit(ctx.arithmeticExpr()), value, new ResultArrayAssign());
				}
			}
			// if it's not declared as pair
			else {
				return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
			}
		}
		// if the variable is not declared, cannot do the assignment
		else {
			return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
		}
	}
	
	// RESULT '[' arithmeticExpr ']' ':=' boolExpr ';'
	@Override
	public Verifier visitArrayResultAssignToBoolE(ArrayResultAssignToBoolEContext ctx) {
		return new Assignments("Result", visit(ctx.arithmeticExpr()), 
				visit(ctx.boolExpr()),new ResultArrayAssign());
	}
	
	// RESULT '[' arithmeticExpr ']' ':=' arithmeticExpr ';'
	@Override
	public Verifier visitArrayResultAssignToArithE(ArrayResultAssignToArithEContext ctx) {
		return new Assignments("Result", visit(ctx.arithmeticExpr(0)), 
				visit(ctx.arithmeticExpr(1)),new ResultArrayAssign());
	}
	
	/* *****************************************************************************************
	 * TODO Methods for pair result assignment
	 * *****************************************************************************************
	 */
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' ID ';'
	@Override
	public Verifier visitPairResultAssignToNormalVar(PairResultAssignToNormalVarContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
					return new Assignments("Result", "first", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(0).getText(), new Verification());
					return new Assignments("Result", "first", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(0).getText(), new Verification());
					return new Assignments("Result", "first", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
					return new Assignments("Result", "second", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(0).getText(), new Verification());
					return new Assignments("Result", "second", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(0).getText(), new Verification());
					return new Assignments("Result", "second", value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		else {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Bool")) {
					Verifier value = new BoolVar(ctx.ID(1).getText(), new Verification());
					return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Int")) {
					Verifier value = new IntVar(ctx.ID(1).getText(), new Verification());
					return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Real")) {
					Verifier value = new RealVar(ctx.ID(1).getText(), new Verification());
					return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("Pair")){
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsPairAssign());
				}
				else {
					// if it is pair assignment, it's not allowed
					return new UnknownVar("Result", new IsArrayAssign());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
	}
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' ID '[' arithmeticExpr ']' ';'
	@Override
	public Verifier visitPairResultAssignToArrayE(PairResultAssignToArrayEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "first", array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "first", array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "first", array, new ResultPairAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(0).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "second", array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "second", array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(0).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(0).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", "second", array, new ResultPairAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(0).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		else {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("BoolArray")) {
					Verifier array = new BoolArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", ctx.ID(0).getText(), array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("IntArray")) {
					Verifier array = new IntArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", ctx.ID(0).getText(), array, new ResultPairAssign());
				}
				else if (varTypes.get(ctx.ID(1).getText()).equals("RealArray")) {
					Verifier array = new RealArrayVar(ctx.ID(1).getText(), new Verification(), visit(ctx.arithmeticExpr()));
					return new Assignments("Result", ctx.ID(0).getText(), array, new ResultPairAssign());
				}
				else {
					// if ctx.ID(1).getText()) is not array type
					return new UnknownVar(ctx.ID(1).getText(), new WrongArrayDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
	}
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' ID '.' a=(FIRST|SECOND) ';'
	@Override
	public Verifier visitPairResultAssignToPairFS(PairResultAssignToPairFSContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(0).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(0).getText(), "first", new BoolVerification());
							return new Assignments("Result", "first", value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(0).getText(), "first", new ArithVerification());
							return new Assignments("Result", "first", value, new ResultPairAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(0).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(0).getText(), "second", new BoolVerification());
							return new Assignments("Result", "first", value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(0).getText(), "second", new ArithVerification());
							return new Assignments("Result", "first", value, new ResultPairAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
			
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(0).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(0).getText(), "first", new BoolVerification());
							return new Assignments("Result", "second", value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(0).getText(), "first", new ArithVerification());
							return new Assignments("Result", "second", value, new ResultPairAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(0).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(0).getText(), "second", new BoolVerification());
							return new Assignments("Result", "second", value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(0).getText(), "second", new ArithVerification());
							return new Assignments("Result", "second", value, new ResultPairAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
			
		}
		// if e=ID
		else {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (ctx.a.getType() == VerifierParser.FIRST) {
						if (varTypes.get(ctx.ID(1).getText() + ".first").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new BoolVerification());
							return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "first", new ArithVerification());
							return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
						}
					}
					else {
						if (varTypes.get(ctx.ID(1).getText() + ".second").equals("Bool")) {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new BoolVerification());
							return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
						}
						else  {
							Verifier value = new PairVar(ctx.ID(1).getText(), "second", new ArithVerification());
							return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
						}
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
	}
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' ID '.' ID ';'
	@Override
	public Verifier visitPairResultAssignToPairE(PairResultAssignToPairEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
					if (varTypes.get(ctx.ID(0).getText() + ctx.ID(1).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(1).getText(), new BoolVerification());
						return new Assignments("Result", "first", value, new ResultPairAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new ArithVerification());
						return new Assignments("Result", "first", value, new ResultPairAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			if (varTypes.containsKey(ctx.ID(0).getText())) {
				if (varTypes.get(ctx.ID(0).getText()).equals("Pair")) {
					if (varTypes.get(ctx.ID(0).getText() + ctx.ID(1).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new BoolVerification());
						return new Assignments("Result", "second", value, new ResultPairAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new ArithVerification());
						return new Assignments("Result", "second", value, new ResultPairAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(0).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(0).getText(), new Undeclared());
			}
		}
		// if e=ID
		else {
			if (varTypes.containsKey(ctx.ID(1).getText())) {
				if (varTypes.get(ctx.ID(1).getText()).equals("Pair")) {
					if (varTypes.get(ctx.ID(1).getText() + "." + ctx.ID(2).getText()).equals("Bool")) {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new BoolVerification());
						return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
					}
					else {
						Verifier value = new PairVar(ctx.ID(1).getText(), ctx.ID(2).getText(), new ArithVerification());
						return new Assignments("Result", ctx.ID(0).getText(), value, new ResultPairAssign());
					}
				}
				// if it's not declared as pair
				else {
					return new UnknownVar(ctx.ID(1).getText(), new WrongPairDecl());
				}
			}
			// if the variable is not declared, cannot do the assignment
			else {
				return new UnknownVar(ctx.ID(1).getText(), new Undeclared());
			}
		}
	}
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' boolExpr ';'
	@Override
	public Verifier visitPairResultAssignToBoolE(PairResultAssignToBoolEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Assignments("Result", "first", visit(ctx.boolExpr()),new ResultPairAssign());
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Assignments("Result", "second", visit(ctx.boolExpr()),new ResultPairAssign());
		}
		else {
			return new Assignments("Result", ctx.ID().getText(), visit(ctx.boolExpr()),new ResultPairAssign());
		}
	}
	
	// RESULT '.' e=(FIRST|SECOND|ID) ':=' arithmeticExpr ';'
	@Override
	public Verifier visitPairResultAssignToArithE(PairResultAssignToArithEContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Assignments("Result", "first", visit(ctx.arithmeticExpr()),new ResultPairAssign());
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Assignments("Result", "second", visit(ctx.arithmeticExpr()),new ResultPairAssign());
		}
		else {
			return new Assignments("Result", ctx.ID().getText(), visit(ctx.arithmeticExpr()),new ResultPairAssign());
		}
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for alternation rule
	 * *****************************************************************************************
	 */
	
//	ifstat
	  // zero or more elseif statement
//	  (elseifstat)*
	  // zero or one else statement
//	  (elsestat)?
//	  END
	
	@Override
	public Verifier visitAlternationBody(AlternationBodyContext ctx) {
		// store the if statement
		Verifier ifstat = visit(ctx.ifstat());
		
		// store the elseif statement(might be more than one statement)
		List<Verifier> elseifstats = new ArrayList<Verifier>();
		if (ctx.elseifstat().size() > 0) {
			for (int i = 0; i < ctx.elseifstat().size(); i++) {
			elseifstats.add(visit(ctx.elseifstat(i)));
			}
		}
		
		// store the else statement
		Verifier elsestat;
		if (ctx.elsestat() != null) {
			elsestat = visit(ctx.elsestat());
		}
		else {
			elsestat = null;
		}
		
		return new Alternations(ifstat, elseifstats, elsestat);
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for ifstat rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitIfStatement(IfStatementContext ctx) {
		List<Verifier> imps = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imps.add(visit(ctx.implementation(i)));
		}
		
		return new IfStats(visit(ctx.boolExpr()), imps);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for elseifstat rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitElseIfStatement(ElseIfStatementContext ctx) {
		List<Verifier> imps = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imps.add(visit(ctx.implementation(i)));
		}
		
		return new ElseifStats(visit(ctx.boolExpr()), imps);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for elsestat rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitElseStatement(ElseStatementContext ctx) {
		List<Verifier> imps = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.implementation().size(); i++) {
			imps.add(visit(ctx.implementation(i)));
		}
		
		return new ElseStats(imps);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for loop rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitLoops(LoopsContext ctx) {
		Verifier initImp = visit(ctx.initImp());
		
		Verifier invariant = visit(ctx.invariantStat());
		
		Verifier exitCondition = visit(ctx.exitCondition());
		
		Verifier loopBody = visit(ctx.loopBody());
		
		Verifier variant = visit(ctx.variantStat());
		
		return new Loops(initImp, invariant, exitCondition, loopBody, variant);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for initImp rule
	 * *****************************************************************************************
	 */
	@Override
	public Verifier visitLoopInitialImps(LoopInitialImpsContext ctx) {
		List<Verifier> initImps = new ArrayList<Verifier>();
		
		for (int i = 0; i < ctx.implementation().size(); i++) {
			initImps.add(visit(ctx.implementation(i)));
		}
		
		return new InitImp(initImps);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for invariantStat rule
	 * *****************************************************************************************
	 */
	@Override
	public Verifier visitLoopInvariant(LoopInvariantContext ctx) {
		
		Pair<String, Verifier> invariant;
		
		if (ctx.ID() != null) {
			invariant = new Pair<String, Verifier>(ctx.ID().getText(), visit(ctx.boolExpr()));
		}
		else {
			invariant = new Pair<String, Verifier>(null, visit(ctx.boolExpr()));
		}
		
		return new InvariantStat(invariant);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for exitCondition rule
	 * *****************************************************************************************
	 */
	@Override
	public Verifier visitLoopExitCondition(LoopExitConditionContext ctx) {
		return new ExitCondition(visit(ctx.boolExpr()));
	}
	
	/* *****************************************************************************************
	 * TODO Methods for loopBody rule
	 * *****************************************************************************************
	 */
	@Override
	public Verifier visitLoopBodyImps(LoopBodyImpsContext ctx) {
		List<Verifier> loopBodyImps = new ArrayList<Verifier>();
		
		for (int i = 0; i < ctx.implementation().size(); i++) {
			loopBodyImps.add(visit(ctx.implementation(i)));
		}
		
		return new LoopBody(loopBodyImps);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for loopBody rule
	 * *****************************************************************************************
	 */
	@Override
	public Verifier visitLoopVariant(LoopVariantContext ctx) {
		Pair<String, Verifier> variant;
		
		if (ctx.ID() != null) {
			variant = new Pair<String, Verifier>(ctx.ID().getText(), visit(ctx.arithmeticExpr()));
		}
		else {
			variant = new Pair<String, Verifier>(null, visit(ctx.arithmeticExpr()));
		}
		
		return new VariantStat(variant);
	}
	
	/* *****************************************************************************************
	 * TODO Methods for declaration rule
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
	 * TODO Methods for uninitialDecl rule
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
	
	// uninitialzed pair variable with named element declaration
	@Override
	public Verifier visitNamedPairDecl(NamedPairDeclContext ctx) {
		isPair = true;
		
		Verifier left = null;
		Verifier right = null;
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		// if left element is boolean type
		if (ctx.left.getType() == VerifierParser.BOOL) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(1).getText(), "Bool");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Bool");
			varTypes.put(ctx.ID(0).getText() + ".first", "Bool");
			
			// create left element object
			left = new BoolVar(ctx.ID(1).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
				
				right = new BoolVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + ".second", "Int");
				
				right = new IntVar(ctx.ID(2).getText(), new UninitializedDecl());
				
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + ".second", "Real");
				
				right = new RealVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
		}
		// if left element is integer type
		else if (ctx.left.getType() == VerifierParser.INT) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(1).getText(), "Int");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Int");
			varTypes.put(ctx.ID(0).getText() + ".first", "Int");
			// create left element object
			left = new IntVar(ctx.ID(1).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
				
				right = new BoolVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + ".second", "Int");
				
				right = new IntVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + ".second", "Real");
				
				right = new RealVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
		}
		// if left element is real type
		else if (ctx.left.getType() == VerifierParser.REAL) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(1).getText(), "Real");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Real");
			varTypes.put(ctx.ID(0).getText() + ".first", "Real");
			
			// create left element object
			left = new RealVar(ctx.ID(1).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
				varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
				
				right = new BoolVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
				varTypes.put(ctx.ID(0).getText() + ".second", "Int");
				
				right = new IntVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Real");
				varTypes.put(ctx.ID(0).getText() + ".second", "Real");
				
				right = new RealVar(ctx.ID(2).getText(), new UninitializedDecl());
			}
		}
		isPair = false;
		return new PairVar(ctx.ID(0).getText(), left, right, new UninitializedDecl());
	}
	
	// uninitialzed pair variable with unnamed element declaration
	@Override
	public Verifier visitNamedPairUnnamedEleDecl(NamedPairUnnamedEleDeclContext ctx) {
		varTypes.put(ctx.ID().getText(), "Pair");
		if (ctx.left.getType() == VerifierParser.BOOL) {
			varTypes.put(ctx.ID().getText() + ".first", "Bool");
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				varTypes.put(ctx.ID().getText() + ".second", "Bool");
				return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), 
						new BoolVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				varTypes.put(ctx.ID().getText() + ".second", "Int");
				return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), 
						new IntVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else {
				varTypes.put(ctx.ID().getText() + ".second", "Real");
				return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), 
						new RealVar(new AnonymousDecl()), new UninitializedDecl());
			}
		}
		else if (ctx.left.getType() == VerifierParser.INT) {
			
			varTypes.put(ctx.ID().getText() + ".first", "Int");
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				varTypes.put(ctx.ID().getText() + ".second", "Bool");
				return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), 
						new BoolVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				varTypes.put(ctx.ID().getText() + ".second", "Int");
				return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), 
						new IntVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else {
				varTypes.put(ctx.ID().getText() + ".second", "Real");
				return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), 
						new RealVar(new AnonymousDecl()), new UninitializedDecl());
			}
		}
		else {
			varTypes.put(ctx.ID().getText() + ".first", "Real");
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				varTypes.put(ctx.ID().getText() + ".second", "Bool");
				return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), 
						new BoolVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				varTypes.put(ctx.ID().getText() + ".second", "Int");
				return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), 
						new IntVar(new AnonymousDecl()), new UninitializedDecl());
			}
			else {
				varTypes.put(ctx.ID().getText() + ".second", "Real");
				return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), 
						new RealVar(new AnonymousDecl()), new UninitializedDecl());
			}
		}
	}
	
	/* *****************************************************************************************
	 * TODO Methods for initialDecl rule
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
			return new IntVar(ctx.ID().getText(), visit(ctx.arithmeticExpr()), new InitializedDecl());
		}
		else {
			varTypes.put(ctx.ID().getText(), "Real");
			return new RealVar(ctx.ID().getText(), visit(ctx.arithmeticExpr()), new InitializedDecl());
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
		for (int i = 0; i < ctx.arithmeticExpr().size(); i++) {
			value.add(visit(ctx.arithmeticExpr(i)));
		}
		varTypes.put(ctx.ID().getText(), "IntArray");
		return new IntArrayVar(ctx.ID().getText(), value, new InitializedDecl());
	}
	
	// real array declaration with initial value
	@Override
	public Verifier visitRealArrayValueDecl(RealArrayValueDeclContext ctx) {
		// create a list of Logic, and store all the elements
		List<Verifier> value = new ArrayList<Verifier>();
		for (int i = 0; i < ctx.arithmeticExpr().size(); i++) {
			value.add(visit(ctx.arithmeticExpr(i)));
		}
		varTypes.put(ctx.ID().getText(), "RealArray");
		
		return new RealArrayVar(ctx.ID().getText(), value, new InitializedDecl());
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[BOOL; BOOL] = [true, x]
	@Override
	public Verifier visitUnnamedBoolBoolPairValueDecl(UnnamedBoolBoolPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.boolExpr(0));
		Verifier value2 = visit(ctx.boolExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Bool");
		varTypes.put(ctx.ID().getText() + ".second", "Bool");
		
		isPair = false;
		return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), new BoolVar(new AnonymousDecl()), 
				value, new InitializedDecl());
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[BOOL; (INT|REAL)] = [true, x]
	@Override
	public Verifier visitUnnamedBoolArithPairValueDecl(UnnamedBoolArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.boolExpr());
		Verifier value2 = visit(ctx.arithmeticExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Bool");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			isPair = false;
			varTypes.put(ctx.ID().getText() + ".second", "Int");
			return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), new IntVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
		else {
			isPair = false;
			varTypes.put(ctx.ID().getText() + ".second", "Real");
			return new PairVar(ctx.ID().getText(), new BoolVar(new AnonymousDecl()), new RealVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[INT; BOOL] = [1; true]
	@Override
	public Verifier visitUnnamedIntBoolPairValueDecl(UnnamedIntBoolPairValueDeclContext ctx) {
		isPair = true;
		Verifier value1 = visit(ctx.arithmeticExpr());
		Verifier value2 = visit(ctx.boolExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Int");
		varTypes.put(ctx.ID().getText() + ".second", "Bool");
		
		isPair = false;
		return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), new BoolVar(new AnonymousDecl()), 
				value, new InitializedDecl());
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[INT; (INT|REAL)] = [1; 2]
	@Override
	public Verifier visitUnnamedIntArithPairValueDecl(UnnamedIntArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.arithmeticExpr(0));
		Verifier value2 = visit(ctx.arithmeticExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Int");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			isPair = false;
			
			varTypes.put(ctx.ID().getText() + ".second", "Int");
			
			return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), new IntVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
		else {
			isPair = false;
			
			varTypes.put(ctx.ID().getText() + ".second", "Real");
			
			return new PairVar(ctx.ID().getText(), new IntVar(new AnonymousDecl()), new RealVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[REAL; BOOL] = [1; false]
	@Override
	public Verifier visitUnnamedRealBoolPairValueDecl(UnnamedRealBoolPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.arithmeticExpr());
		Verifier value2 = visit(ctx.boolExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Real");
		varTypes.put(ctx.ID().getText() + ".second", "Bool");
		
		
		isPair = false;
		return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), new BoolVar(new AnonymousDecl()), 
				value, new InitializedDecl());
	}
	
	// pair initialized decl with unnamed element
	// p : PAIR[REAL; (INT|REAL)] = [1; false]
	@Override
	public Verifier visitUnnamedRealArithPairValueDecl(UnnamedRealArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.arithmeticExpr(0));
		Verifier value2 = visit(ctx.arithmeticExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID().getText(), "Pair");
		varTypes.put(ctx.ID().getText() + ".first", "Real");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID().getText() + ".second", "Int");
			isPair = false;
			return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), new IntVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
		else {
			varTypes.put(ctx.ID().getText() + ".second", "Real");
			isPair = false;
			return new PairVar(ctx.ID().getText(), new RealVar(new AnonymousDecl()), new RealVar(new AnonymousDecl()), 
					value, new InitializedDecl());
		}
	}
	
	
	// pair initialized decl with named element
	// p: PAIR[x: BOOL; y:BOOL] = [true, false]
	@Override
	public Verifier visitNamedBoolBoolPairValueDecl(NamedBoolBoolPairValueDeclContext ctx) {
		isPair = true;
		Verifier value1 = visit(ctx.boolExpr(0));
		Verifier value2 = visit(ctx.boolExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Bool");
		varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
		
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Bool");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
		
		
		isPair = false;
		return new PairVar(ctx.ID(0).getText(), new BoolVar(ctx.ID(1).getText(), new UninitializedDecl()), 
				new BoolVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
	}
	
	// pair initialized decl with named element
	// p: PAIR[x: BOOL; y : (INT|REAL)] = [true, 1]
	@Override
	public Verifier visitNamedBoolArithPairValueDecl(NamedBoolArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.boolExpr());
		Verifier value2 = visit(ctx.arithmeticExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Bool");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Bool");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID(0).getText() + ".second", "Int");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new BoolVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new IntVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
		else {
			varTypes.put(ctx.ID(0).getText() + ".second", "Real");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Real");
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new BoolVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new RealVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
	}
	
	// pair initialized decl with named element
	// p: PAIR[x: INT; y : BOOL] = [1, false]
	@Override
	public Verifier visitNamedIntBoolPairValueDecl(NamedIntBoolPairValueDeclContext ctx) {
		isPair = true;
		Verifier value1 = visit(ctx.arithmeticExpr());
		Verifier value2 = visit(ctx.boolExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Int");
		varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
		
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Int");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
		
		isPair = false;
		return new PairVar(ctx.ID(0).getText(), new IntVar(ctx.ID(1).getText(), new UninitializedDecl()), 
				new BoolVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
	}
	
	// pair initialized decl with named element
	// p: PAIR[x: INT; y : (INT|REAL)] = [1, 2.1]
	@Override
	public Verifier visitNamedIntArithPairValueDecl(NamedIntArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.arithmeticExpr(0));
		Verifier value2 = visit(ctx.arithmeticExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Int");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Int");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			varTypes.put(ctx.ID(0).getText() + ".second", "Int");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new IntVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new IntVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
		else {
			varTypes.put(ctx.ID(0).getText() + ".second", "Real");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Real");
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new IntVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new RealVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
	}
	
	// pair initialized decl with named element
	// p: PAIR[x: REAL; y : BOOL] = [1, 2.1]
	@Override
	public Verifier visitNamedRealBoolPairValueDecl(NamedRealBoolPairValueDeclContext ctx) {
		isPair = true;
		Verifier value1 = visit(ctx.arithmeticExpr());
		Verifier value2 = visit(ctx.boolExpr());
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Real");
		varTypes.put(ctx.ID(0).getText() + ".second", "Bool");
		
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Real");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Bool");
		
		isPair = false;
		return new PairVar(ctx.ID(0).getText(), new RealVar(ctx.ID(1).getText(), new UninitializedDecl()), 
				new BoolVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
	}
	
	// pair initialized decl with named element
	// p: PAIR[x: REAL; y : (INT|REAL)] = [1, 2.1]
	@Override
	public Verifier visitNamedRealArithPairValueDecl(NamedRealArithPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier value1 = visit(ctx.arithmeticExpr(0));
		Verifier value2 = visit(ctx.arithmeticExpr(1));
		
		List<Verifier> value = new ArrayList<Verifier>();
		value.add(value1);
		value.add(value2);
		
		varTypes.put(ctx.ID(0).getText(), "Pair");
		
		varTypes.put(ctx.ID(0).getText() + ".first", "Real");
		varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(1).getText(), "Real");
		
		if (ctx.type.getType() == VerifierParser.INT) {
			
			varTypes.put(ctx.ID(0).getText() + ".second", "Int");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
			
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new RealVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new IntVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
		else {
			
			varTypes.put(ctx.ID(0).getText() + ".second", "Int");
			varTypes.put(ctx.ID(0).getText() + "." + ctx.ID(2).getText(), "Int");
			
			isPair = false;
			return new PairVar(ctx.ID(0).getText(), new RealVar(ctx.ID(1).getText(), new UninitializedDecl()), 
					new RealVar(ctx.ID(2).getText(), new UninitializedDecl()), value, new InitializedDecl());
		}
	}
	
	
	
	
	/* *****************************************************************************************
	 * TODO Methods for unnamedDecl rule
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
	
	
	@Override
	public Verifier visitUnnamedPairDecl(UnnamedPairDeclContext ctx) {
		isPair = true;
		
		Verifier left = visit(ctx.unnamedDecl(0));
		Verifier right = visit(ctx.unnamedDecl(1));
		
		isPair = false;
		return new PairVar("Result", left, right, new AnonymousDecl());
	}
	
	@Override
	public Verifier visitUnnamedPairValueDecl(UnnamedPairValueDeclContext ctx) {
		isPair = true;
		
		Verifier left = null;
		Verifier right = null;
		
		// if left element is boolean type
		if (ctx.left.getType() == VerifierParser.BOOL) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(0).getText(), "Bool");
			
			// create left element object
			left = new BoolVar(ctx.ID(0).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(1).getText(), "Bool");
				
				right = new BoolVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(1).getText(), "Int");
				
				right = new IntVar(ctx.ID(1).getText(), new UninitializedDecl());
				
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(1).getText(), "Real");
				
				right = new RealVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
		}
		// if left element is integer type
		else if (ctx.left.getType() == VerifierParser.INT) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(0).getText(), "Int");
			
			// create left element object
			left = new IntVar(ctx.ID(0).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(1).getText(), "Bool");
				
				
				right = new BoolVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(1).getText(), "Int");
				
				right = new IntVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(1).getText(), "Real");
				
				right = new RealVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
		}
		// if left element is real type
		else if (ctx.left.getType() == VerifierParser.REAL) {
			// add left element to the varTypes
			varTypes.put(ctx.ID(0).getText(), "Real");
			
			// create left element object
			left = new RealVar(ctx.ID(0).getText(), new UninitializedDecl());
			
			if (ctx.right.getType() == VerifierParser.BOOL) {
				
				varTypes.put(ctx.ID(1).getText(), "Bool");
				
				
				right = new BoolVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.INT) {
				
				varTypes.put(ctx.ID(1).getText(), "Int");
				
				right = new IntVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
			else if (ctx.right.getType() == VerifierParser.REAL) {
				
				varTypes.put(ctx.ID(1).getText(), "Real");
				
				right = new RealVar(ctx.ID(1).getText(), new UninitializedDecl());
			}
		}
		isPair = false;
		return new PairVar("Result", left, right, new AnonymousDecl());
	}
	
	/* *****************************************************************************************
	 * TODO Methods for expr rule
	 * *****************************************************************************************
	 */
	
	@Override
	public Verifier visitBoolE(BoolEContext ctx) {
		return visit(ctx.boolExpr());
	}
	
	@Override
	public Verifier visitArithE(ArithEContext ctx) {
		return visit(ctx.arithmeticExpr());
	}
	
	/* *****************************************************************************************
	 * TODO Methods for boolExpr rule
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
		return new BoolArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
	}
	
	// old boolean variable
	@Override
	public Verifier visitOldBoolVar(OldBoolVarContext ctx) {
		return new Olds(ctx.ID().getText(), new BoolType());
	}
	
	// old boolean array
	@Override
	
	
	public Verifier visitOldBoolArrayE(OldBoolArrayEContext ctx) {
		return new Olds(ctx.ID().getText(), visit(ctx.arithmeticExpr()), new BoolType());
	}
	
	// result variable
	@Override
	public Verifier visitBoolResult(BoolResultContext ctx) {
		return new Results();
	}
	
	// result array
	@Override
	public Verifier visitBoolArrayResult(BoolArrayResultContext ctx) {
		return new Results(visit(ctx.arithmeticExpr()));
	}
	
	// result pair
	@Override
	public Verifier visitBoolPairResult(BoolPairResultContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Results("first");
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Results("second");
		}
		else {
			return new Results(ctx.ID().getText());
		}
	}
	
	// boolean pair first element
	@Override
	public Verifier visitBoolPairFirst(BoolPairFirstContext ctx) {
		return new PairVar(ctx.ID().getText(), "first", new BoolVerification());
	}
	
	// boolean pair second element
	@Override
	public Verifier visitBoolPairSecond(BoolPairSecondContext ctx) {
		return new PairVar(ctx.ID().getText(), "second", new BoolVerification());
	}
	
	// boolean pair element
	@Override
	public Verifier visitBoolPairElement(BoolPairElementContext ctx) {
		return new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new BoolVerification());
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
		return visit(ctx.relationalExpr());
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for varDecl rule
	 * *****************************************************************************************
	 */
	
	// quantification variable declaration
	@Override
	public Verifier visitQuantifyVar(QuantifyVarContext ctx) {
		List<Verifier> list = new ArrayList<Verifier>();
		
		if (ctx.type.getType() == VerifierParser.BOOL) {
			// store each ID's string into list
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(new BoolVar(ctx.ID(i).getText(), new QuantifyBool()));
				varTypes.put(ctx.ID(i).getText(), "Bool");
			}
		}
		else if (ctx.type.getType() == VerifierParser.INT) {
			// store each ID's string into list
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(new IntVar(ctx.ID(i).getText(), new QuantifyInt()));
				varTypes.put(ctx.ID(i).getText(), "Int");
			}
		}
		else {
			// store each ID's string into list
			for (int i = 0; i < ctx.ID().size(); i++) {
				list.add(new RealVar(ctx.ID(i).getText(), new QuantifyReal()));
				varTypes.put(ctx.ID(i).getText(), "Real");
			}
		}
		
		// transform the list of String into a list of IntVar
		return new VarLists(list, new QuantificationList());
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for relation rule
	 * *****************************************************************************************
	 */
	
	// arithmetic equal
	@Override
	public Verifier visitEqual(EqualContext ctx) {
		return new Equal(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)));
	}
	
	// arithmetic greater than
	@Override
	public Verifier visitGreaterThan(GreaterThanContext ctx) {
		return new GreaterThan(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)));
	}
	
	// arithmetic less than
	@Override
	public Verifier visitLessThan(LessThanContext ctx) {
		return new LessThan(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)));
	}
	
	// arithmetic greater or equal
	@Override
	public Verifier visitGreaterOrEqual(GreaterOrEqualContext ctx) {
		return new GreaterOrEqual(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)));
	}
	
	// arithmetic less or equal
	@Override
	public Verifier visitLessOrEqual(LessOrEqualContext ctx) {
		return new LessOrEqual(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1)));
	}
	
	
	/* *****************************************************************************************
	 * TODO Methods for arithmetic rule
	 * *****************************************************************************************
	 */
	
	// multiply or division
	@Override
	public Verifier visitMulDiv(MulDivContext ctx) {
		if (ctx.op.getType() == VerifierParser.MUL) {
			return new Multiplication(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1))); 
		}
		else {
			return new Division(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1))); 
		}
	}
	
	// add or subtract
	@Override
	public Verifier visitAddSub(AddSubContext ctx) {
		if (ctx.op.getType() == VerifierParser.ADD) {
			return new Addition(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1))); 
		}
		else {
			return new Subtraction(visit(ctx.arithmeticExpr(0)), visit(ctx.arithmeticExpr(1))); 
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
			// WrongBoolDecl for UnknownVar means the variable has been declared but with the wrong type
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongBoolDecl());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// arithmetic array variable verification
	@Override
	public Verifier visitIndexArithmeticArray(IndexArithmeticArrayContext ctx) {
		// if the map contains the variable, check its type
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new IntArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new RealArrayVar(ctx.ID().getText(), new Verification(), visit(ctx.arithmeticExpr()));
			}
			// WrongBoolDecl for UnknownVar means the variable has been declared but with the wrong type
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongBoolDecl());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
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
			// WrongBoolDecl for UnknownVar means the variable has been declared but with the wrong type
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongBoolDecl());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
		}
	}
	
	// old array variable
	@Override
	public Verifier visitOldArithArrayE(OldArithArrayEContext ctx) {
		// if the map contains the variable, check its type
		if (varTypes.containsKey(ctx.ID().getText())) {
			if (varTypes.get(ctx.ID().getText()).equals("IntArray")) {
				return new Olds(ctx.ID().getText(), visit(ctx.arithmeticExpr()), new IntArray());
			}
			else if (varTypes.get(ctx.ID().getText()).equals("RealArray")) {
				return new Olds(ctx.ID().getText(), visit(ctx.arithmeticExpr()), new RealArray());
			}
			// WrongBoolDecl for UnknownVar means the variable has been declared but with the wrong type
			else {
				return new UnknownVar(ctx.ID().getText(), new WrongBoolDecl());
			}
		}
		// Undeclared means the variable has not been declared
		else {
			return new UnknownVar(ctx.ID().getText(), new Undeclared());
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
		return new Results(visit(ctx.arithmeticExpr()));
	}
	
	// result pair
	@Override
	public Verifier visitArithPairResult(ArithPairResultContext ctx) {
		if (ctx.e.getType() == VerifierParser.FIRST) {
			return new Results("first");
		}
		else if (ctx.e.getType() == VerifierParser.SECOND) {
			return new Results("second");
		}
		else {
			return new Results(ctx.ID().getText());
		}
	}
	
	// arithmetic pair first element
	@Override
	public Verifier visitArithPairFirst(ArithPairFirstContext ctx) {
		return new PairVar(ctx.ID().getText(), "first", new ArithVerification());
	}
	
	// arithmetic pair second element
	@Override
	public Verifier visitArithPairSecond(ArithPairSecondContext ctx) {
		return new PairVar(ctx.ID().getText(), "second", new ArithVerification());
	}
	
	@Override
	public Verifier visitArithPairElement(ArithPairElementContext ctx) {
		return new PairVar(ctx.ID(0).getText(), ctx.ID(1).getText(), new ArithVerification());
	}
	
	// int number
	@Override
	public Verifier visitIntNum(IntNumContext ctx) {
		return new IntConst(ctx.INTNUM().getText(), "", false);
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
		return visit(ctx.arithmeticExpr());
	}
}
