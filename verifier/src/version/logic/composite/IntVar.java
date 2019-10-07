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

public class IntVar extends Var {

	// mode 0: uninitialized declaration
	// mode 1: verification
	// mode 2: initialized declaration
	
	// mode 0 and 1
	public IntVar(String name, int mode) {
		super(name, mode);
		// TODO Auto-generated constructor stub
	}
	
	// mode 2
	public IntVar(String name, Logic value, int mode) {
		super(name, value, mode);
			
	}
	
	public void accept(Visitor v) {
		v.visitIntVar(this);
	}

}
