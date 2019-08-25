grammar Logic;


stat : varDecl formula;

varDecl : VAR (',' VAR)* NEWLINE;

formula 
	  : NOT formula					# Not
	  | formula AND formula			# And
	  | formula OR formula			# Or
	  | formula IMPLIES formula		# Implies
	  | formula EQUALS formula		# Equals
	  | VAR 						# Var
	  | '(' formula ')'				# Paren
	  ;


NOT : 'not';
AND : 'and';
OR : 'or';
IMPLIES : '=>';
EQUALS : '=';

VAR : [a-z];
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;