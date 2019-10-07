package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import modes.*;

public abstract class Const extends Logic{
	public String name;
	
	//used for uninitialized declaration and verification
	public Const(String name) {
		this.name = name;
	}
	
}

