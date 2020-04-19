grammar Verifier;

@header {
	package antlr;
}

stat : line+ ;

line 
	: declaration				# VarDeclaration
	| assignment 				# AssignDecl
	| method 					# DefineMethod		
	| VERIFY boolExpr			# VerifyBoolExpr
	| VERIFY ID 				# VerifyMethod
	;


method
	: mutator 			# MutatorMethod
	| accessor 			# AccessorMethod
	;

mutator 
	: ID ('(' ( uninitialDecl (';' uninitialDecl)* )? ')')?
		(precondition)?
		(local)?
		DO 
			(implementation)+
		(postcondition)? 
		END 										# Mutators
	;

accessor
	: ID ('(' ( uninitialDecl (';' uninitialDecl)* )? ')')? ':' unnamedDecl
		(precondition)?
		(local)?
		DO 
			(implementation)+
		(postcondition)? 
		END 										# Accessors
	;


precondition
	: REQUIRE (contract)+ 		# preContract
	;


postcondition
	: ENSURE (contract)+  		# postContract
	;


contract 
	: (ID ':')? boolExpr 		# Contracts
	;


local
	: LOCAL declaration+ 	#LocalDecl
	;


implementation
	: assignment		# ImpAssignment
	| alternation 		# ImpAlternation
	| loop 				# ImpLoop
	;


assignment
	: ID ':=' ID ';'												# SingleVarAssign
	| ID ':=' boolExpr ';'											# BoolAssign
	| ID ':=' arithmeticExpr ';'									# ArithAssign
	| ID ':=' '<<' (boolExpr (',' boolExpr)*)? '>>' ';' 			# BoolArrayInitialize
	| ID ':=' '<<' (arithmeticExpr (',' arithmeticExpr)*)? '>>' ';'	# ArithArrayInitialize
	| ID '[' arithmeticExpr ']' ':=' ID ';'							# ArraySingleVarAssign 
	| ID '[' arithmeticExpr ']' ':=' boolExpr ';'					# BoolArrayAssign
	| ID '[' arithmeticExpr ']' ':=' arithmeticExpr ';'				# ArithArrayAssign
	| RESULT ':=' ID ';' 											# SingleVarResultAssign
	| RESULT ':=' ID '[' arithmeticExpr ']' ';'						# ArrayValueResultAssign
	;

alternation
	: ifstat
	  // zero or more elseif statement
	  (elseifstat)*
	  // zero or one else statement
	  (elsestat)?
	  END 				# AlternationBody
	;


ifstat
	: IF boolExpr THEN 
		(implementation)+  		# IfStatement
	;


elseifstat
	: ELSEIF boolExpr THEN
		(implementation)+ 		# ElseIfStatement
	;


elsestat
	: ELSE
	  	(implementation)+ 		# ElseStatement												
	;

/* from
	 Sinit
   invariant
   	 invariant_tag: I -- Boolean expression for partial correctness
   until
   	 B
   loop
   	 Sbody
   variant
   	 variant_tag: V  -- Integer expression for termination
   end
*/
loop
	: initImp
	  invariantStat
	  exitCondition
	  loopBody
	  variantStat
	  END 				# Loops
	;

initImp
	: FROM
		(implementation)+ 	# LoopInitialImps
	;

invariantStat
	: INVARIANT
		(ID ':')? boolExpr 			# LoopInvariant
	;

exitCondition
	: UNTIL
		boolExpr 			# LoopExitCondition
	;

loopBody
	: LOOP
		(implementation)+ 	# LoopBodyImps
	;

variantStat
	: VARIANT
		(ID ':')? arithmeticExpr 		# LoopVariant
	;


declaration
	: uninitialDecl  			# UninitialVarDecl
	| initialDecl 				# InitialVarDecl
	;
	

uninitialDecl
	// normal variable
	: ID ':' type=(BOOL|INT|REAL)  														# SingleVar
	// array variable
	| ID ':' ARRAY '[' type=(BOOL|INT|REAL) ']'											# ArrayDecl
	// pair variable
	| ID ':' PAIR '[' ID ':' left=(BOOL|INT|REAL) ';' ID ':' right=(BOOL|INT|REAL) ']'	# NamedPairDecl
	;


initialDecl
	// normal variable
	: ID ':' BOOL '=' boolExpr 															# BoolValueDecl
	| ID ':' type=(INT|REAL) '=' arithmeticExpr											# NumValueDecl
	// array variable
	| ID ':' ARRAY '[' BOOL ']' '=' '<<' boolExpr (',' boolExpr)* '>>'					# BoolArrayValueDecl
	| ID ':' ARRAY '[' INT ']' '=' '<<' arithmeticExpr (',' arithmeticExpr)* '>>'		# IntArrayValueDecl
	| ID ':' ARRAY '[' REAL ']' '=' '<<' arithmeticExpr (',' arithmeticExpr)* '>>'		# RealArrayValueDecl
	// unnamed pair with value
	// Bool
	| ID ':' PAIR '[' BOOL ';' BOOL ']' 
			'=' '[' boolExpr ';' boolExpr ']'											# UnnamedBoolBoolPairValueDecl
	| ID ':' PAIR '[' BOOL ';' type=(INT|REAL) ']' 
			'=' '[' boolExpr ';' arithmeticExpr ']'								# UnnamedBoolArithPairValueDecl
	// Int
	| ID ':' PAIR '[' INT ';' BOOL ']' 
			'=' '[' arithmeticExpr ';' boolExpr ']'												# UnnamedIntBoolPairValueDecl
	| ID ':' PAIR '[' INT ';' type=(INT|REAL) ']' 
			'=' '[' arithmeticExpr ';' arithmeticExpr ']'								# UnnamedIntArithPairValueDecl
	// Real
	| ID ':' PAIR '[' REAL ';' BOOL ']' 
			'=' '[' arithmeticExpr ';' boolExpr ']'											# UnnamedRealBoolPairValueDecl
	| ID ':' PAIR '[' REAL ';' type=(INT|REAL) ']' 
			'=' '[' arithmeticExpr ';' arithmeticExpr ']'								# UnnamedRealArithPairValueDecl
	// named pair with value
	// Bool
	| ID ':' PAIR '[' ID ':' BOOL ';' ID ':' BOOL ']' 
			'=' '[' boolExpr ';' boolExpr ']'											# NamedBoolBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' BOOL ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' boolExpr ';' arithmeticExpr ']'								# NamedBoolArithPairValueDecl
	// Int
	| ID ':' PAIR '[' ID ':' INT ';' ID ':' BOOL ']' 
			'=' '[' arithmeticExpr ';' boolExpr ']'												# NamedIntBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' INT ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' arithmeticExpr ';' arithmeticExpr ']'								# NamedIntArithPairValueDecl
	// Real
	| ID ':' PAIR '[' ID ':' REAL ';' ID ':' BOOL ']' 
			'=' '[' arithmeticExpr ';' boolExpr ']'											# NamedRealBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' REAL ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' arithmeticExpr ';' arithmeticExpr ']'								# NamedRealArithPairValueDecl
	;


unnamedDecl
	: type=(BOOL|INT|REAL) 								# UnnamedSingleVarDecl
	| ARRAY '[' type=(BOOL|INT|REAL) ']' 				# UnnamedArrayDecl
	| PAIR '[' unnamedDecl ';' unnamedDecl ']'			# UnnamedPairDecl
	| PAIR '[' uninitialDecl ';' uninitialDecl ']' 		# UnnamedPairValueDecl
	;



boolExpr 
	: NOT boolExpr									# Not
	| boolExpr AND boolExpr							# And
	| boolExpr OR boolExpr							# Or
	| boolExpr IMPLIES boolExpr						# Implies
	| boolExpr IFF boolExpr							# Iff
	| FORALL (varDecl)+ '|' boolExpr 				# Forall
	| EXISTS (varDecl)+ '|' boolExpr 				# Exists
	| ID 											# BoolVar
	| ID '[' arithmeticExpr ']'						# IndexBoolArray
	| OLD ID 										# OldBoolVar
	| OLD ID '[' arithmeticExpr ']'					# OldBoolArray
	| RESULT 										# BoolResult
	| RESULT '[' arithmeticExpr ']'					# BoolArrayResult
	| ID '.' FIRST 									# BoolPairFirst
	| ID '.' SECOND 								# BoolPairSecond
	| ID '.' ID 									# BoolPairElement
	| TRUE 											# BoolTrue
	| FALSE 										# BoolFalse
	| '(' boolExpr ')'								# Paren
	| relationalExpr								# Relate 
	;


varDecl
	: ID (',' ID)* ':' type=(BOOL|INT|REAL) ';'		# QuantifyVar
	;


relationalExpr
	: arithmeticExpr EQUAL arithmeticExpr			# Equal
	| arithmeticExpr GREATERTHAN arithmeticExpr		# GreaterThan
	| arithmeticExpr LESSTHAN arithmeticExpr		# LessThan
	| arithmeticExpr GREATEROREQUAL arithmeticExpr	# GreaterOrEqual
	| arithmeticExpr LESSOREQUAL arithmeticExpr		# LessOrEqual
	;


arithmeticExpr
	: arithmeticExpr op=(MUL|DIV) arithmeticExpr		# MulDiv
	| arithmeticExpr op=(ADD|SUB) arithmeticExpr		# AddSub
	| ID 												# ArithmeticVar
	| ID '[' arithmeticExpr ']'							# IndexArithmeticArray
	| OLD ID 											# OldArithVar
	| OLD ID '[' arithmeticExpr ']' 					# OldArithArray
	| RESULT 											# ArithResult
	| RESULT '[' arithmeticExpr ']' 					# ArithArrayResult
	| ID '.' FIRST 										# ArithPairFirst
	| ID '.' SECOND 									# ArithPairSecond
	| ID '.' ID 										# ArithPairElement
	| INTNUM											# IntNum
	| ID '.' COUNT 										# CountArray
	| ID '.' LOWER 										# LowerArray
	| ID '.' UPPER 										# UpperArray
	| REALNUM											# RealNum
	| '(' arithmeticExpr ')' 							# ArithParen
	;

// type keywords
BOOL : 'BOOLEAN';
INT : 'INTEGER';
REAL : 'REAL';
ARRAY : 'ARRAY';
PAIR : 'PAIR';
FIRST: 'first';
SECOND: 'second';


VERIFY : 'verify';

COUNT : 'count';
LOWER : 'lower';
UPPER : 'upper';

// method keywords
LOCAL : 'local';
REQUIRE : 'require';
ENSURE : 'ensure';
DO : 'do';
END : 'end';
OLD : 'old';
RESULT : 'Result';

// alternation keywords
IF : 'if';
ELSEIF : 'elseif';
THEN : 'then';
ELSE : 'else';

// loop keywords
FROM : 'from';
INVARIANT : 'invariant';
UNTIL : 'until';
LOOP : 'loop';
VARIANT : 'variant';

// quantification keywords
FORALL : 'forall';
EXISTS : 'exists';

// boolean constant keywords
TRUE : 'true';
FALSE : 'false';

// logical expr keywords
NOT : 'not';
AND : 'and';
OR : 'or';
IMPLIES : '=>';
IFF : '<=>';

// relational expr keywords
EQUAL : '=';
GREATERTHAN : '>';
LESSTHAN : '<';
GREATEROREQUAL : '>=';
LESSOREQUAL : '<=';

// arithmetic expr keyworkds
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

// ignore the comments and whitespace
COMMENT : '--' ~[\r\n]* -> skip;
WS  :   [ \t\n]+ -> skip ;

ID : [a-z][a-zA-Z0-9_]*;

// number lexer rules
INTNUM : '0'|'-'?[1-9][0-9]*;
REALNUM : '-'?[0-9]* '.' [0-9]+;
