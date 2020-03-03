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
		REQUIRE boolExpr
		DO 
			(implementation)+
		ENSURE boolExpr 
		END 										# Mutators
	;

accessor
	: ID ('(' uninitialDecl (';' uninitialDecl)* ')')? uninitialDecl
		REQUIRE boolExpr
		DO 
			(implementation)+
		ENSURE boolExpr 
		END 										# Accessors
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
	| ID ':' PAIR '[' left=(BOOL|INT|REAL) ';' right=(BOOL|INT|REAL) ']'				# UnnamedPairDecl
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

implementation
	: assignment		# VarAssignment
	;


assignment
	: ID ':=' ID ';'			# SingleVarAssign
	| ID ':=' boolExpr ';'		# BoolAssign
	| ID ':=' arithmetic ';'	# ArithAssign
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
	| INTNUM											# IntNum
	| REALNUM											# RealNum
	| '(' arithmetic ')' 								# ArithParen
	;


BOOL : 'BOOLEAN';
INT : 'INTEGER';
REAL : 'REAL';
ARRAY : 'ARRAY';
PAIR : 'PAIR';
VERIFY : 'verify';


REQUIRE : 'require';
ENSURE : 'ensure';
DO : 'do';
END : 'end';


FORALL : 'forall';
EXISTS : 'exists';

TRUE : 'true';
FALSE : 'false';


NOT : 'not';
AND : 'and';
OR : 'or';
IMPLIES : '=>';
IFF : '<=>';

EQUAL : '=';
GREATERTHAN : '>';
LESSTHAN : '<';
GREATEROREQUAL : '>=';
LESSOREQUAL : '<=';

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

COMMENT : '--' ~[\r\n]* -> skip;
WS  :   [ \t\n]+ -> skip ;

ID : [a-z][a-zA-Z0-9_]*;

INTNUM : '0'|'-'?[1-9][0-9]*;
REALNUM : '-'?[0-9]* '.' [0-9]+;
