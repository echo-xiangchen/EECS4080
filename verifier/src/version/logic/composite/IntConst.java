package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.NonWritableChannelException;
import java.util.*;

import com.microsoft.z3.*;

import modes.Mode;
import types.*;
import values.*;
import version.logic.visitor.Visitor;

public class IntConst extends Const{
	
	//used for uninitialized declaration and verification
	public IntConst(String name) {
		super(name);
	}
}
