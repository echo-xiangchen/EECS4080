package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import version.logic.visitor.*;

public class Negation extends UnaryExpr{
	public Negation(Logic e) {
		super(e);
	}

	public void accept(Visitor v) {
		v.visitNot(this);
	}
}
