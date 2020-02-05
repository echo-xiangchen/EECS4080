grammar Logic;


stat : line+ ;

line 
	: ID ':' type=(BOOL|INT|REAL) 							# SingleVar
	| ID ':' BOOL '=' boolExpr 								# BoolValueDecl
	| ID ':' type=(INT|REAL) '=' arithmetic					# NumValueDecl
	| ID ':' ARRAY '[' type=(BOOL|INT|REAL) ']'				# ArrayDecl
	| VERIFY boolExpr										# EvalBoolExpr
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
	| ID '[' POSITIVENUM ']'						# FixIndexBoolArray
	| ID '[' arithmetic ']'							# ExprIndexBoolArray
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
	| ID '[' POSITIVENUM ']'							# FixIndexArithmeticArray
	| ID '[' arithmetic ']'								# ExprIndexArithmeticArray
	| POSITIVENUM										# PositiveNum
	| INTNUM											# IntNum
	| REALNUM											# RealNum
	| '(' arithmetic ')' 								# ArithParen
	;


BOOL : 'BOOLEAN';
INT : 'INTEGER';
REAL : 'REAL';
ARRAY : 'ARRAY';
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
POSITIVENUM : [1-9][0-9]*;
INTNUM : '0'|'-'?[1-9][0-9]*;
REALNUM : '-'?[0-9]* '.' [0-9]+;