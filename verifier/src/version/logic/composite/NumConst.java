package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import types.*;
import values.*;
import version.logic.visitor.*;

public class NumConst extends IntConst {

	// mode 0: declaration
	// mode 1: verification
	public NumConst(String name) {
		super(name);
	}
	
	public void accept(Visitor v) {
		v.visitNumConst(this);
	}

}
