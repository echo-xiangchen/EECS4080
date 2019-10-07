package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

public class UnaryExpr extends Expr{
	public Logic child;
	
	public UnaryExpr(Logic u) {
		this.child = u;
	}
}
