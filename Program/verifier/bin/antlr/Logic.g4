grammar Logic;


stat : line+ ;

line 
	: type=(BOOL|INT) ID 									# SingleVar
	| INT ID '[' PNUM ']'									# Arrays
	| BOOL ID '=' boolExpr 									# BoolValueDecl
	| INT ID '=' arithmetic 								# IntValueDecl
	| VERIFY boolExpr										# EvalBoolExpr
	| VERIFY '{' boolExpr '}' boolExpr '{' boolExpr '}'		# HoareLogic
	;

boolExpr 
	: NOT boolExpr						# Not
	| boolExpr AND boolExpr				# And
	| boolExpr OR boolExpr				# Or
	| boolExpr IMPLIES boolExpr			# Implies
	| boolExpr IFF boolExpr				# Iff
	| FORALL (varDecl)+ '@' boolExpr 	# Forall
	| EXISTS (varDecl)+ '@' boolExpr 	# Exists
	| ID 								# BoolVar
	| TRUE 								# BoolTrue
	| FALSE 							# BoolFalse
	| '(' boolExpr ')'					# Paren
	| relation							# Relate 
	;

varDecl
	: BOOL ID (',' ID)* ';'		# QuantifyBool
	| INT ID (',' ID)* ';'		# QuantifyInt			
	;

relation
	: arithmetic EQUAL arithmetic			# Equal
	| arithmetic GREATERTHAN arithmetic		# GreaterThan
	| arithmetic LESSTHAN arithmetic		# LessThan
	| arithmetic GREATEROREQUAL arithmetic	# GreaterOrEqual
	| arithmetic LESSOREQUAL arithmetic		# LessOrEqual
	;

arithmetic
	: arithmetic op=(MUL|DIV) arithmetic	# MulDiv
	| arithmetic op=(ADD|SUB) arithmetic	# AddSub
	| ID 									# IntVar
	| NUM									# Num
	| '(' arithmetic ')' 					# ArithParen
	;


BOOL : 'boolean';
INT : 'int';
VERIFY : 'verify';

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

ID : [a-z][a-zA-Z0-9]*;
NUM : '0'|'-'?[1-9][0-9]*;
PNUM : [1-9][0-9]*;
