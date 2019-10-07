package version.logic.composite;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import com.microsoft.z3.*;

import modes.*;

public class Var extends Logic {
	
public String name;
	
	public Logic value;
	
	public int mode;
	
	//used for uninitialized declaration and verification
	public Var(String name, int mode) {
		this.name = name;
		this.mode = mode;
	}
	
	// used for initialized declaration
	public Var(String name, Logic value, int mode) {
		this.name = name;
		this.value = value;
		this.mode = mode;
	}
}
