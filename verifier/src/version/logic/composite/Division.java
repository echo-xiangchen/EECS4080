package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import version.logic.visitor.*;

public class Division extends BinaryExpr {
	public Division(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitDivision(this);
	}
}
