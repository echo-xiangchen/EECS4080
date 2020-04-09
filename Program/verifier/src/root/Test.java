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
	
	public static boolean isEqual(Verifier v1,Verifier v2) {
		if (v1 == null || v2 == null) {
			return false;
		}
		
		if (v1 == v2) {
			return true;
		}
		
		if (v1.getClass().equals(v2.getClass())) {
			// check if they are expressions
			if (v1 instanceof Expr) {
				if (v1 instanceof BinaryExpr) {
					return isEqual(v1.left(), v2.left()) && isEqual(v1.right(), v2.right());
				}
				else {
					return isEqual(v1.child, v2.child);
				}
			}
			// check if they are normal variable
			else if (v1 instanceof Var) {
				if (v1 instanceof ArrayVar) {
					return v1.name.equals(v2.name) && isEqual(v1.index, v2.index);
				}
				else {
					return v1.name.equals(v2.name);
				}
			}
		}
		return false;
	}
	
	public static Verifier copy(Verifier v1) {
		if (v1 instanceof Negation) {
			return new Negation(copy(v1.child));
		}
		else if (v1 instanceof Conjunction) {
			return new Conjunction(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof Disjunction) {
			return new Disjunction(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof Implication) {
			return new Implication(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof Iff) {
			return new Iff(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof Equal) {
			return new Equal(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof GreaterThan) {
			return new GreaterThan(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof LessThan) {
			return new LessThan(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof GreaterOrEqual) {
			return new GreaterOrEqual(v1.left(), v1.right());
		}
		else if (v1 instanceof LessOrEqual) {
			return new LessOrEqual(copy(v1.left()), copy(v1.right()));
		}
		else if (v1 instanceof Forall) {
			Forall v = (Forall) v1;
			List<Verifier> list = new ArrayList<Verifier>();
			for (int i = 0; i < v.quantifyList.size(); i++) {
				list.add(copy(v.quantifyList.get(i)));
			}
			return new Forall(list, copy(((Forall) v1).expr));
		}
		else if (v1 instanceof Exists) {
			Exists v = (Exists) v1;
			List<Verifier> list = new ArrayList<Verifier>();
			for (int i = 0; i < v.quantifyList.size(); i++) {
				list.add(copy(v.quantifyList.get(i)));
			}
			return new Exists(list, copy(((Forall) v1).expr));
		}
		else if (v1 instanceof BoolVar) {
			return new BoolVar(((BoolVar) v1).name, new Verification());
		}
		else if (v1 instanceof IntVar) {
			return new IntVar(((IntVar) v1).name, new Verification());
		}
		else if (v1 instanceof RealVar) {
			return new RealVar(((RealVar) v1).name, new Verification());
		}
		else if (v1 instanceof BoolArrayVar) {
			return new BoolArrayVar(((BoolArrayVar) v1).name, new Verification(), copy(v1.index));
		}
		
		return null;
	}
	
	
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
		
		Verifier test = copy(g);
		
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
