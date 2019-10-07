grammar Logic;


stat : line+ ;

line 
	: BOOL ID 						# SingleBool
	| INT ID 						# SingleInt
	| BOOL ID '=' boolExpr 			# BoolValueDecl
	| INT ID '=' arithmetic 		# IntValueDecl
	| VERIFY boolExpr				# EvalBoolExpr
	;


boolExpr 
	: NOT boolExpr					# Not
	| boolExpr AND boolExpr			# And
	| boolExpr OR boolExpr			# Or
	| boolExpr IMPLIES boolExpr		# Implies
	| boolExpr IFF boolExpr			# Iff
	| ID 							# BoolVar
	| TRUE 							# BoolTrue
	| FALSE 						# BoolFalse
	| '(' boolExpr ')'				# Paren
	| relation						# Relate 
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
NUM : '0' | [1-9][0-9]*;
