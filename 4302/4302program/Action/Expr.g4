grammar Expr;
// this is the start symbol

@header {
	//package Action;
	import org.antlr.v4.runtime.*;
	import org.antlr.v4.runtime.tree.*;
	import java.io.*;
	import java.util.*;
	import types.*;
}

stat 
	: expr+
		{
			if ($expr.t instanceof types.UnknowType) {
				System.out.println($expr.text + " is not type correct.");
			}
			else {
				System.out.println($expr.text + " is type correct.");
			}
		}
	;


expr returns [types.VarType t]
	: a=expr MUL b=expr
		{
			if (!($a.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			if (!($b.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			else {
				$t = new IntType();
			}
		} 		
	| a=expr ADD b=expr
		{
			if (!($a.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			if (!($b.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			else {
				$t = new IntType();
			}
		} 			
	| term 
		{
			$t = $term.t;
		} 							
	;


term returns [types.VarType t]
	: a=term LESSTHAN b=term
		{
			if (!($a.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			if (!($b.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			else {
				$t = new BoolType();
			}
		} 		
	| a=term EQUAL b=term 
		{
			if (!($a.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			if (!($b.t instanceof types.IntType)) {
				$t = new UnknowType();
			}

			else {
				$t = new BoolType();
			}
		}			
	| NUM 
		{
			$t = new IntType();
		}							
	;


ADD : '+';
MUL : '*';
EQUAL : '=';
LESSTHAN : '<';


NUM : '0'|'-'?[1-9][0-9]*;


COMMENT : '--' ~[\r\n]* -> skip;
WS  :   [ \t\n]+ -> skip ;