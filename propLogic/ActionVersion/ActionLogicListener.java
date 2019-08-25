// Generated from ActionLogic.g4 by ANTLR 4.7.2

	import java.util.*;
	import java.io.FileInputStream;
	import java.io.InputStream;
	import com.microsoft.z3.*; 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActionLogicParser}.
 */
public interface ActionLogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActionLogicParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ActionLogicParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionLogicParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ActionLogicParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActionLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ActionLogicParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ActionLogicParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActionLogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(ActionLogicParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActionLogicParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(ActionLogicParser.FormulaContext ctx);
}