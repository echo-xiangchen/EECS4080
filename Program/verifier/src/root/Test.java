package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.util.Map.*;

import com.microsoft.z3.*;
import antlr.*;
import modes.Verification;
import verifier.*;
import verifier.composite.*;
import verifier.composite.Expr;
import verifier.visitor.*;

public class Test {
	
	public static void main(String[] args) {
		
		BoolVar x1 = new BoolVar("x", new Verification());
		
		BoolVar x2 = new BoolVar("x", new Verification());
		
		BoolVar y = new BoolVar("y", new Verification());
		
		IntVar i1 = new IntVar("i", new Verification());
		
		IntVar i2 = new IntVar("i", new Verification());
		
		IntVar j = new IntVar("j", new Verification());
		
		Addition add = new Addition(i1, j);
		
//		IntConst const1 = new IntConst("1");
//		
		GreaterOrEqual g = new GreaterOrEqual(i1, add);
		
		Verifier test = g.copy();
		
		((Addition)g.right()).children.set(0, j);
		
		InfixPrinter p1 = new InfixPrinter();
		test.accept(p1);
		
		InfixPrinter p2 = new InfixPrinter();
		g.accept(p2);
		
		System.out.println(p1.infixOutput);
		
		System.out.println(p2.infixOutput);
		
//		Addition add2 = new Addition(i2, j);
//		
//		
//		System.out.println(isEqual(x1,i1));
//		
//		
//		
//		Conjunction c1 = new Conjunction(x1, y);
//		
//		Conjunction c2 = new Conjunction(x2, y);
//		
//		System.out.println(isEqual(c1, c2));
//		
//		
//		
//		
//		BoolArrayVar a1 = new BoolArrayVar("a1", new Verification(), add1);
//		
//		BoolArrayVar a2= new BoolArrayVar("a1", new Verification(), add2);
//		
//		System.out.println(isEqual(a1, a2));
		
		
		
	}
}
