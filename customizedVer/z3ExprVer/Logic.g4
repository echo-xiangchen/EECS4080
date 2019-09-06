grammar Logic;


stat : line+ ;

line 
	: BOOL VAR NEWLINE				# SingleBool
	| INT VAR NEWLINE				# SingleInt
	| boolExpr NEWLINE				# EvalBoolExpr
	| NEWLINE						# Blank
	;


boolExpr 
	: NOT boolExpr					# Not
	| boolExpr AND boolExpr			# And
	| boolExpr OR boolExpr			# Or
	| boolExpr IMPLIES boolExpr		# Implies
	| boolExpr IFF boolExpr			# Iff
	| VAR 							# BoolVar
	| '(' boolExpr ')'				# Paren
	;



COMMENT : '--' ~[\r\n]* -> skip;
WS  :   [ \t]+ -> skip ;

BOOL : 'boolean';
INT : 'int';

TRUE : 'true' | 'True';
FALSE : 'false' | 'False';

NOT : 'not';
AND : 'and';
OR : 'or';
IMPLIES : '=>';
IFF : '<=>';

VAR : [a-z][a-zA-Z0-9]*;
NUM : [0-9]+;
NEWLINE : '\r'? '\n' ;