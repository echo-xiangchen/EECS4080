package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

import com.microsoft.z3.*;

import antlr.*;
import modes.*;
import types.*;
import values.*;
import version.logic.composite.*;
import version.logic.visitor.*;

public abstract class Logic {
	
	public void accept(Visitor v){};
}
