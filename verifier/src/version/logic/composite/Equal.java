package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import version.logic.visitor.*;

public class Equal extends BinaryExpr {
	public Equal(Logic left, Logic right) {
		super(left, right);
	}
	
	public void accept(Visitor v) {
		v.visitEqual(this);
	}
}
