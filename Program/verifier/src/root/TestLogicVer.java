package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import com.microsoft.z3.*;
import antlr.*;
import verifier.*;
import verifier.composite.*;
import verifier.visitor.*;

public class TestLogicVer {
	public static void main(String[] args) {
		try {
			// set up strings for different mode
			String printerStr = "-p";
			String verifierStr = "-v";
			
			// if there is no argument
			if (args.length < 1) {
				System.out.println("Usage: \n"
						+ "\"-p\": For Pretty Printer.\n"
						+ "\"-v\": For Formula Verification.\n"
						+ "You could also include an input file followed by an argument.");
			}
			// if there is at least one argument
			else {
				
				/* *****************************************************************************************
				 * if the first argument is "-p"
				 * *****************************************************************************************
				 */
				
				if (args[0].equals(printerStr)) {
					// test to see if there is a input file
			        String inputFile = null;
			        if ( args.length>1 ) inputFile = args[1];
			        InputStream is = System.in;
			        if ( inputFile!=null ) {
			            is = new FileInputStream(inputFile);
			        }
			        
			        @SuppressWarnings("deprecation")
					ANTLRInputStream input = new ANTLRInputStream(is);
			        VerifierLexer lexer = new VerifierLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        VerifierParser parser = new VerifierParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			        
			        //System.out.println(tree.getText());
			        
			        AntlrToVerifier AntlrToVerifier = new AntlrToVerifier();
			        
			        // list that stores the subtree separately
			        List<Verifier> verifier = new ArrayList<Verifier>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	verifier.add(AntlrToVerifier.visit(tree.getChild(i)));
					}
			       
			        // create new TypeChecker
			        TypeChecker checker = new TypeChecker();
			        
			        // Recursively accept TypeChecker
			        for (int i = 0; i < verifier.size(); i++) {
			        	verifier.get(i).accept(checker);
					}
			        
			        
			        // check if error msg is empty
			        // only when it's empty, call the pretty printer
			        if (checker.errormsg.isEmpty()) {
			        	VarPrinter varPrinter = new VarPrinter();
 			        	PrettyPrinter printer = new PrettyPrinter();
 			        	
 			        	// check to see if there is any unused variable
 			        	for (int i = 0; i < verifier.size(); i++) {
 			        		verifier.get(i).accept(varPrinter);
						}
						
 			        	// call the pretty printer
						for (int i = 0; i < verifier.size(); i++) {
							verifier.get(i).accept(printer);
						}
						
						// split the output
						String[] splitedPrinterOutput = printer.z3output.split("split\n");
						
						
						// remove the first line
						for (int a = 1; a <= splitedPrinterOutput.length; a++) {
							String [] strArr = splitedPrinterOutput[a - 1].split("\\n");
							String updatedStr = "";
							for (int i = 1; i < strArr.length; i++) {
								updatedStr = updatedStr + strArr[i] + "\n";
							}
							splitedPrinterOutput[a - 1] = updatedStr;
						}
					
						// if there is an input file
						if (inputFile != null) {
							// split the input file path, only store the file name
							String[] splitedpath = args[1].split("/");
							
							// get the file name without the extension type
							// e.g. for test01.txt, only store test01
							String testNum = splitedpath[splitedpath.length - 1].split("\\.")[0];
							
							// write the output to the file
							for (int i = 1; i <= splitedPrinterOutput.length; i++) {
								String path1 = "./output/" + testNum + "-formula0" + i + ".txt";
								
								
								File file = new File(path1);
								
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								// write to file
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(splitedPrinterOutput[i - 1].getBytes());
								outStream.close();
								
								// print the result to the console
								System.out.println(PrettyPrinter.infixFormula.get(i - 1) 
										+ "\nOutput of this formula has been stored in " + path1 + "\n");
								
							}
							// iterate through differenceMap, and get the variable name, store it in warning message
							String varString = "";
							if (!VarPrinter.unusedVarMap.isEmpty()) {
								for (Entry<String, Pair<String, String>> entry : VarPrinter.unusedVarMap.entrySet()) {
									varString = varString.concat("<" + entry.getKey() + "> ");
								}
								
							System.out.println("Warning: The following variable(s) are declared but never used: \n  " + varString);
							}
							
						}
						// if there is no input file
						else {
							// write the output to the file
							for (int i = 1; i <= splitedPrinterOutput.length; i++) {
								String path2 = "./output/" + "formula0" + i + ".txt";
								
								File file = new File(path2);
								
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(splitedPrinterOutput[i - 1].getBytes());
								outStream.close();
								
								
								// print the result to the console
								System.out.println("Formula: " 
										+ PrettyPrinter.infixFormula.get(i - 1) 
										+ "\nOutput of this formula has been stored in " + path2 + "\n");
								
							}
							// iterate through differenceMap, and get the variable name, store it in warning message
							String varString = "";
							if (!VarPrinter.unusedVarMap.isEmpty()) {
								for (Entry<String, Pair<String, String>> entry : VarPrinter.unusedVarMap.entrySet()) {
									varString = varString.concat("<" + entry.getKey() + "> ");
								}
							System.out.println("Warning: The following variable(s) are declared but never used: \n  " + varString);
							}
							
						}
			        }
			        // if errormsg is not empty
			        else {
			        	// print the error message
						for (int i = 0; i < checker.errormsg.size(); i++) {
							System.out.println(checker.errormsg.get(i));
						}
					}
				}
				
				/* *****************************************************************************************
				 * if the first argument is "-v"
				 * *****************************************************************************************
				 */
				
				else if (args[0].equals(verifierStr)) {
					// test to see if there is a input file
			        String inputFile = null;
			        if ( args.length>1 ) inputFile = args[1];
			        InputStream is = System.in;
			        if ( inputFile!=null ) {
			            is = new FileInputStream(inputFile);
			        }
			        
			        @SuppressWarnings("deprecation")
					ANTLRInputStream input = new ANTLRInputStream(is);
			        VerifierLexer lexer = new VerifierLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        VerifierParser parser = new VerifierParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			       
			        
			        AntlrToVerifier AntlrToVerifier = new AntlrToVerifier(); 
			        
			        
			        // list that stores the subtree separately
			        List<Verifier> verifier = new ArrayList<Verifier>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	verifier.add(AntlrToVerifier.visit(tree.getChild(i)));
					}
			        
			        //System.out.println("AntlrToVerifier.varTypes: " + AntlrToVerifier.varTypes + "\n");
			       
			        
			        
			        
			        
			        
			        
			        
			        // create new TypeChecker
			        TypeChecker checker = new TypeChecker();
			        
			        // Recursively accept TypeChecker
			        for (int i = 0; i < verifier.size(); i++) {
			        	verifier.get(i).accept(checker);
					}
			        
			        
			        
			        
			        
			        
			        
			        
			        //System.out.println("TypeChecker.varMap: " + TypeChecker.varMap + "\n");
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        
			        // check if error msg is empty
			        // only when it's empty, call the pretty printer
			        if (checker.errormsg.isEmpty()) {
			        	VarPrinter varPrinter = new VarPrinter();
 			        	
 			        	// check to see if there is any unused variable
 			        	for (int i = 0; i < verifier.size(); i++) {
 			        		verifier.get(i).accept(varPrinter);
						}
 			        	
 			        	
 			        	
 			        	
 			       //System.out.println("varPrinter.allVarMap: " + varPrinter.allVarMap + "\n");
 			       //System.out.println("varPrinter.arrayCount: " + varPrinter.arrayCount + "\n");
 			       //System.out.println("varPrinter.unusedVarMap: " + varPrinter.unusedVarMap + "\n");
 			      
 			        	
 			        	
 			        	
 			        	
 			        	
 			        	
						
 			        	// call the pretty printer
 			        	PrettyPrinter printer = new PrettyPrinter();
 			        	
						for (int i = 0; i < verifier.size(); i++) {
							verifier.get(i).accept(printer);
						}
						
						
						
						
						//System.out.println("PrefixPrinter.completeVarMap: " + PrefixPrinter.completeVarMap + "\n");
						
						
						
						
						
						// split the output
						String[] splitedOutput = printer.z3output.split("split\n");
						//System.out.println(splitedOutput[1]);
						
						// indicates if it's method verification
						boolean isMethod = false;
						String methondName = "";
						
						// remove the first line
						for (int a = 1; a <= splitedOutput.length; a++) {
							String [] strArr = splitedOutput[a - 1].split("\\n");
							isMethod = !strArr[0].equals(";formula\n");
							if (isMethod) {
								methondName = strArr[0].replaceAll(";", "");
							}
							
							
							String updatedStr = "";
							for (int i = 1; i < strArr.length; i++) {
								updatedStr = updatedStr + strArr[i] + "\n";
							}
							splitedOutput[a - 1] = updatedStr;
						}
						
						
						
						
						// if there is an input file
						if (inputFile != null) {
							// split the input file path
							String[] splitedpath = args[1].split("/");
							
							// get the file name without the extension type
							// e.g. for test01.txt, only store test01
							String testNum = splitedpath[splitedpath.length - 1].split("\\.")[0];
							
							
							// create the string used to write to files
							String writeToFile = "";
			            	
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								// set up the path
								String path1 = "./output/" + testNum + "-verified0" + i + ".txt";
								
								File file = new File(path1);
								
								// if file not exist, create the file
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								// create z3 context
								@SuppressWarnings("resource")
								Context ctx = new Context();
								
								// convert the string and sent it to z3 context
								BoolExpr[] inputExpr = ctx.parseSMTLIB2String(splitedOutput[i - 1].replaceAll("\n", ""), 
										null, null, null, null);
								
								
								
								// create solver and add the input expression
								Solver s = ctx.mkSolver();
								s.add(inputExpr);
								
								// check if the formula is a tautology
								Status result = s.check();
								
								
								if (result == Status.SATISFIABLE){
									// if it's method verification
									if (isMethod) {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(P) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methondName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methondName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methondName));
										// print wp
										writeToFile = writeToFile.concat("wp(S, Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.wps.get(methondName));
										// add the rest output
										writeToFile = writeToFile.concat("Proof Obligation: P => wp(S, Q)\n\n");
										writeToFile = writeToFile.concat("Not discharged.\n");
										
										// get the model
						            	Model m = s.getModel();
						            	
						            	//System.out.println(m.toString());
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {
					
											String[] varValue = splitModel[j].split(" ");
											
//											for (int k = 0; k < varValue.length; k++) {
//												System.out.println(k + " " + varValue[k]);
//											}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
//						            	// also include the initialized variable value
//						            	for (int j = 0; j < PrettyPrinter.usedVarList.get(i - 1).size(); j++) {
//						            		
//											if (VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b == null) {
//												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
//														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a
//														+ "\n");     
//											}
//											else {
//												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
//														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a   
//														+ " = " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b   
//														+ "\n");
//											}
//										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.");
										}
						            	// if it does not contain all of them, then the counterexample is available
						            	else {
						            		writeToFile = writeToFile.concat("Counterexample: \n");
							            	for (int j = 0; j < varOutput.size(); j++) {
							            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
							            				+ " : " + varOutput.get(j)[2] + "\n");
											}
										}
									}
									// if it's normal formula verification
									else {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
						        		
						        		// get the model
						            	Model m = s.getModel();
						            	
						            	//System.out.println(m.toString());
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {
					
											String[] varValue = splitModel[j].split(" ");
											
//											for (int k = 0; k < varValue.length; k++) {
//												System.out.println(k + " " + varValue[k]);
//											}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						            	// also include the initialized variable value
						            	for (int j = 0; j < PrettyPrinter.usedVarList.get(i - 1).size(); j++) {
						            		
											if (VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b == null) {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a
														+ "\n");     
											}
											else {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a   
														+ " = " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b   
														+ "\n");
											}
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("\nIs not a tautology.\nCounterexample is not available.");
										}
						            	// if it does not contain all of them, then the counterexample is available
						            	else {
						            		writeToFile = writeToFile.concat("\nIs not a tautology. Here is a counter example: \n");
							            	for (int j = 0; j < varOutput.size(); j++) {
							            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
							            				+ " : " + varOutput.get(j)[2] + "\n");
											}
										}
									}
					            } 
					            else if(result == Status.UNSATISFIABLE) { 
					            	// if it's method verification
									if (isMethod) {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(P) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methondName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methondName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methondName));
										// print wp
										writeToFile = writeToFile.concat("wp(S, Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.wps.get(methondName));
										// add the rest output
										writeToFile = writeToFile.concat("Proof Obligation: P => wp(S, Q)\n\n");
										writeToFile = writeToFile.concat("Discharged.\n");
									}
									else {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nIs a tautology.\n";
									}
					            }
					            else  {
					            	writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
					            }
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(writeToFile.getBytes());
								outStream.close();
								
								System.out.println(writeToFile);
							}
						}
						// if there is no input file
						else {
							// create string
							String writeToFile = "";
							
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								String path2 = "./output/" + "verified0" + i + ".txt";
								
								File file = new File(path2);
								
								// if file not exist, create the file
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								// create z3 context
								@SuppressWarnings("resource")
								Context ctx = new Context();
								
								// convert the string and sent it to z3 context
								BoolExpr[] inputExpr = ctx.parseSMTLIB2String(splitedOutput[i - 1].replaceAll("\n", ""), 
										null, null, null, null);
								
								// create solver and add the input expression
								Solver s = ctx.mkSolver();
								s.add(inputExpr);
								
								// check if the formula is a tautology
								Status result = s.check();
								
								if (result == Status.SATISFIABLE){  
									// if it's method verification
									if (isMethod) {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(P) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methondName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methondName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methondName));
										// print wp
										writeToFile = writeToFile.concat("wp(S, Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.wps.get(methondName));
										// add the rest output
										writeToFile = writeToFile.concat("Proof Obligation: P => wp(S, Q)\n\n");
										writeToFile = writeToFile.concat("Not discharged.\n");
										
										// get the model
						            	Model m = s.getModel();
						            	
						            	//System.out.println(m.toString());
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {
					
											String[] varValue = splitModel[j].split(" ");
											
//											for (int k = 0; k < varValue.length; k++) {
//												System.out.println(k + " " + varValue[k]);
//											}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						            	// also include the initialized variable value
						            	for (int j = 0; j < PrettyPrinter.usedVarList.get(i - 1).size(); j++) {
						            		
											if (VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b == null) {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a
														+ "\n");     
											}
											else {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a   
														+ " = " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b   
														+ "\n");
											}
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.");
										}
						            	// if it does not contain all of them, then the counterexample is available
						            	else {
						            		writeToFile = writeToFile.concat("Counterexample: \n");
							            	for (int j = 0; j < varOutput.size(); j++) {
							            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
							            				+ " : " + varOutput.get(j)[2] + "\n");
											}
										}
									}
									// if it's normal formula verification
									else {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
						        		
						        		// get the model
						            	Model m = s.getModel();
						            	
						            	//System.out.println(m.toString());
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {
					
											String[] varValue = splitModel[j].split(" ");
											
//											for (int k = 0; k < varValue.length; k++) {
//												System.out.println(k + " " + varValue[k]);
//											}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						            	// also include the initialized variable value
						            	for (int j = 0; j < PrettyPrinter.usedVarList.get(i - 1).size(); j++) {
						            		
											if (VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b == null) {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a
														+ "\n");     
											}
											else {
												writeToFile = writeToFile.concat("    " + PrettyPrinter.usedVarList.get(i - 1).get(j)
														+ " : " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).a   
														+ " = " + VarPrinter.allVarMap.get(PrettyPrinter.usedVarList.get(i - 1).get(j)).b   
														+ "\n");
											}
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("\nIs not a tautology.\nCounterexample is not available.");
										}
						            	// if it does not contain all of them, then the counterexample is available
						            	else {
						            		writeToFile = writeToFile.concat("\nIs not a tautology. Here is a counter example: \n");
							            	for (int j = 0; j < varOutput.size(); j++) {
							            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
							            				+ " : " + varOutput.get(j)[2] + "\n");
											}
										}
									}
					        		
					            } 
					            else if(result == Status.UNSATISFIABLE) {
					            	// if it's method verification
									if (isMethod) {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(P) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methondName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methondName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methondName));
										// print wp
										writeToFile = writeToFile.concat("wp(S, Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.wps.get(methondName));
										// add the rest output
										writeToFile = writeToFile.concat("Proof Obligation: P => wp(S, Q)\n\n");
										writeToFile = writeToFile.concat("Discharged.\n");
									}
									else {
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nIs a tautology.\n";
									}
					            }
					            else { 
					            	writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
					            }
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(writeToFile.getBytes());
								outStream.close();
								
								System.out.println(writeToFile);
							}
						}
			        }
			        else {
			        	// print the error message
						for (int i = 0; i < checker.errormsg.size(); i++) {
							System.out.println(checker.errormsg.get(i));
						}
					}
				}
				// if the first argument is not "-p" or "-v"
				else {
					System.out.println("Usage: \n"
							+ "\"-p\": For Pretty Printer.\n"
							+ "\"-v\": For Formula Verification.\n"
							+ "You could also include an input file followed by an argument.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
