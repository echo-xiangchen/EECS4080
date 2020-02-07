grammar Expr;
// this is the start symbol
stat : expr+;


expr
	: expr MUL expr 			# Mul
	| expr ADD expr 			# Add
	| term 						# Terms
	;


term
	: term LESSTHAN term 		# LessThan
	| term EQUAL term 			# Equals
	| NUM 						# Number
	;


ADD : '+';
MUL : '*';
EQUAL : '=';
LESSTHAN : '<';


NUM : '0'|'-'?[1-9][0-9]*;


COMMENT : '--' ~[\r\n]* -> skip;
WS  :   [ \t\n]+ -> skip ;