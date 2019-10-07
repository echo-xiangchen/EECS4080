package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

public class BinaryExpr extends Expr{
	public List<Logic> children;
	
	public Logic left() {
		return children.get(0);
	};
	public Logic right() {
		return children.get(1);
	};
	
	public BinaryExpr(Logic left, Logic right) {
		children = new ArrayList<Logic>();
		children.add(left);
		children.add(right);
	}
}

