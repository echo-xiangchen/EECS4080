grammar Verifier;

@header {
	package antlr;
}

stat : line+ ;

line 
	: declaration				# VarDeclaration
	| method 					# DefineMethod		
	| VERIFY boolExpr			# VerifyBoolExpr
	| VERIFY ID 				# VerifyMethod
	;


method
	: mutator 			# MutatorMethod
	| accessor 			# AccessorMethod
	;

mutator 
	: ID ('(' uninitialDecl (';' uninitialDecl)* ')')?
		(precondition)?
		(local)?
		DO 
			(implementation)+
		(postcondition)? 
		END 										# Mutators
	;

accessor
	: ID ('(' uninitialDecl (';' uninitialDecl)* ')')? unnamedDecl
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
	: assignment		# VarAssignment
	;


assignment
	: ID ':=' ID ';'							# SingleVarAssign
	| ID ':=' boolExpr ';'						# BoolAssign
	| ID ':=' arithmetic ';'					# ArithAssign
	| ID '[' arithmetic ']' ':=' ID ';'			# ArraySingleVarAssign 
	| ID '[' arithmetic ']' ':=' boolExpr 		# BoolArrayAssign
	| ID '[' arithmetic ']' ':=' arithmetic 	# ArithArrayAssign
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
	| ID ':' type=(INT|REAL) '=' arithmetic												# NumValueDecl
	// array variable
	| ID ':' ARRAY '[' BOOL ']' '=' '<<' boolExpr (',' boolExpr)* '>>'					# BoolArrayValueDecl
	| ID ':' ARRAY '[' INT ']' '=' '<<' arithmetic (',' arithmetic)* '>>'				# IntArrayValueDecl
	| ID ':' ARRAY '[' REAL ']' '=' '<<' arithmetic (',' arithmetic)* '>>'				# RealArrayValueDecl
	// unnamed pair with value
	// Bool
	| ID ':' PAIR '[' BOOL ';' BOOL ']' 
			'=' '[' boolExpr ';' boolExpr ']'											# UnnamedBoolBoolPairValueDecl
	| ID ':' PAIR '[' BOOL ';' type=(INT|REAL) ']' 
			'=' '[' boolExpr ';' right=(INTNUM|REALNUM) ']'								# UnnamedBoolArithPairValueDecl
	// Int
	| ID ':' PAIR '[' INT ';' BOOL ']' 
			'=' '[' INTNUM ';' boolExpr ']'												# UnnamedIntBoolPairValueDecl
	| ID ':' PAIR '[' INT ';' type=(INT|REAL) ']' 
			'=' '[' INTNUM ';' right=(INTNUM|REALNUM) ']'								# UnnamedIntArithPairValueDecl
	// Real
	| ID ':' PAIR '[' REAL ';' BOOL ']' 
			'=' '[' REALNUM ';' boolExpr ']'											# UnnamedRealBoolPairValueDecl
	| ID ':' PAIR '[' REAL ';' type=(INT|REAL) ']' 
			'=' '[' REALNUM ';' right=(INTNUM|REALNUM) ']'								# UnnamedRealArithPairValueDecl
	// named pair with value
	// Bool
	| ID ':' PAIR '[' ID ':' BOOL ';' ID ':' BOOL ']' 
			'=' '[' boolExpr ';' boolExpr ']'											# NamedBoolBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' BOOL ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' boolExpr ';' right=(INTNUM|REALNUM) ']'								# NamedBoolArithPairValueDecl
	// Int
	| ID ':' PAIR '[' ID ':' INT ';' ID ':' BOOL ']' 
			'=' '[' INTNUM ';' boolExpr ']'												# NamedIntBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' INT ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' INTNUM ';' right=(INTNUM|REALNUM) ']'								# NamedIntArithPairValueDecl
	// Real
	| ID ':' PAIR '[' ID ':' REAL ';' ID ':' BOOL ']' 
			'=' '[' REALNUM ';' boolExpr ']'											# NamedRealBoolPairValueDecl
	| ID ':' PAIR '[' ID ':' REAL ';' ID ':' type=(INT|REAL) ']' 
			'=' '[' REALNUM ';' right=(INTNUM|REALNUM) ']'								# NamedRealArithPairValueDecl
	;


unnamedDecl
	: type=(BOOL|INT|REAL) 								# UnnamedSingleVarDecl
	| ARRAY '[' type=(BOOL|INT|REAL) ']' 				# UnnamedArrayDecl
	| PAIR '[' unnamedDecl ';' unnamedDecl ']'			# UnnamedPairValueDecl
	| PAIR '[' uninitialDecl ';' uninitialDecl ']' 		# UnnamedPairDecl
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
	| ID '[' arithmetic ']'							# IndexBoolArray
	| OLD ID 										# OldBoolVar
	| OLD ID '[' arithmetic ']'						# OldBoolArray
	| RESULT 										# BoolResult
	| RESULT '[' arithmetic ']'						# BoolArrayResult
	| TRUE 											# BoolTrue
	| FALSE 										# BoolFalse
	| '(' boolExpr ')'								# Paren
	| relation										# Relate 
	;


varDecl
	: ID (',' ID)* ':' type=(BOOL|INT|REAL) ';'		# QuantifyVar
	;


relation
	: arithmetic EQUAL arithmetic			# Equal
	| arithmetic GREATERTHAN arithmetic		# GreaterThan
	| arithmetic LESSTHAN arithmetic		# LessThan
	| arithmetic GREATEROREQUAL arithmetic	# GreaterOrEqual
	| arithmetic LESSOREQUAL arithmetic		# LessOrEqual
	;


arithmetic
	: arithmetic op=(MUL|DIV) arithmetic				# MulDiv
	| arithmetic op=(ADD|SUB) arithmetic				# AddSub
	| ID 												# ArithmeticVar
	| ID '[' arithmetic ']'								# IndexArithmeticArray
	| OLD ID 											# OldArithVar
	| OLD ID '[' arithmetic ']' 						# OldArithArray
	| RESULT 											# ArithResult
	| RESULT '[' arithmetic ']' 						# ArithArrayResult
	| INTNUM											# IntNum
	| REALNUM											# RealNum
	| '(' arithmetic ')' 								# ArithParen
	;

// type keywords
BOOL : 'BOOLEAN';
INT : 'INTEGER';
REAL : 'REAL';
ARRAY : 'ARRAY';
PAIR : 'PAIR';


VERIFY : 'verify';

// method keywords
LOCAL : 'local';
REQUIRE : 'require';
ENSURE : 'ensure';
DO : 'do';
END : 'end';
OLD : 'old';
RESULT : 'Result';

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
