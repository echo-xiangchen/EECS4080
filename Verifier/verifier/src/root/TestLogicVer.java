package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.util.Map.*;

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
						+ "\"-p\": For Pretty Printing.\n"
						+ "\"-v\": For Formula or Program Verification.\n"
						+ "You could also include an input file followed by an argument.");
			}
			// if there is at least one argument
			else {
				
				/* *****************************************************************************************
				 * TODO if the first argument is "-p"
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
						
						// indicates if it's method verification
						boolean isMethod = false;
						String methodName = "";
						
						
						// remove the first line
						for (int a = 1; a <= splitedPrinterOutput.length; a++) {
							String [] strArr = splitedPrinterOutput[a - 1].split("\\n");
							
							isMethod = !strArr[0].equals(";formula");
							
							if (isMethod) {
								methodName = strArr[0].replaceAll(";", "");
							}
							
							String updatedStr = "";
							for (int i = 1; i < strArr.length; i++) {
								updatedStr = updatedStr + strArr[i] + "\n";
							}
							splitedPrinterOutput[a - 1] = updatedStr;
						}
						/* *****************************************************************************************
						 * TODO if there is an input file
						 * *****************************************************************************************
						 */
					
						if (inputFile != null) {
						
							// split the input file path, only store the file name
							String[] splitedpath = args[1].split("/");
							
							// get the file name without the extension type
							// e.g. for test01.txt, only store test01
							String testNum = splitedpath[splitedpath.length - 1].split("\\.")[0];
							
							// write the output to the file
							for (int i = 1; i <= splitedPrinterOutput.length; i++) {
								// test to see if it's the method that contains the loop
								if (splitedPrinterOutput[i - 1].contains("splitLoopStep")) {
									// split the five steps of the loop
									String[] splitLoop = splitedPrinterOutput[i - 1].split("splitLoopStep\\n");
									
									
									// save these five steps into seperate files
									// for the 1st file
									String path1 = "./output/" + testNum + "-method0" + i + "-condition01.txt";
									
									File file1 = new File(path1);
									
									if (!file1.exists()) {
										File dir = new File(file1.getParent());
										dir.mkdirs();
										file1.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream1 = new FileOutputStream(file1);
									outStream1.write(splitLoop[0].getBytes());
									outStream1.close();
									
									// print the result to the console
									System.out.println(PrettyPrinter.infixFormula.get(i - 1) + "\nThis program contains loop.\n");
									System.out.println("Output of condition 1 of this program has been stored in " + path1 + "\n");
									
									// for the 2nd file
									String path2 = "./output/" + testNum + "-method0" + i + "-condition02.txt";
									
									File file2 = new File(path2);
									
									if (!file2.exists()) {
										File dir = new File(file2.getParent());
										dir.mkdirs();
										file2.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream2 = new FileOutputStream(file2);
									outStream2.write(splitLoop[1].getBytes());
									outStream2.close();
									
									// print the result to the console
									System.out.println("Output of condition 2 of this program has been stored in " + path2 + "\n");
									
									// for the 3rd file
									// first check if there is only one post condition
									if (PrefixPrinter.methodLoopCondition3WpMap.get(methodName).size() <= 1) {
										String path3 = "./output/" + testNum + "-method0" + i + "-condition03.txt";
										
										File file3 = new File(path3);
										
										if (!file3.exists()) {
											File dir = new File(file3.getParent());
											dir.mkdirs();
											file3.createNewFile();
										}
										
										// write to file
										FileOutputStream outStream3 = new FileOutputStream(file3);
										outStream3.write(splitLoop[2].getBytes());
										outStream3.close();
										
										// print the result to the console
										System.out.println("Output of condition 3 of this program has been stored in " + path3 + "\n");
									}
									else {
										String[] splitCondition3 = splitLoop[2].split("splitCondition3Step");
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										for (int j = 0; j < splitCondition3.length - 1; j++) {
											// set up the tag name
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(j)).contract.a;
											
											String path3 = "./output/" + testNum + "-method0" + i + "-condition03-" + tagName +".txt";
											
											File file3 = new File(path3);
											
											if (!file3.exists()) {
												File dir = new File(file3.getParent());
												dir.mkdirs();
												file3.createNewFile();
											}
											
											// write to file
											FileOutputStream outStream3 = new FileOutputStream(file3);
											outStream3.write(splitCondition3[j].getBytes());
											outStream3.close();
											
											// print the result to the console
											System.out.println("Output of condition 3 postcondition " + tagName + " of this program has been stored in " + path3 + "\n");
										}
									}
									
									
									// for the 4th file
									String path4 = "./output/" + testNum + "-method0" + i + "-condition04.txt";
									
									File file4 = new File(path4);
									
									if (!file4.exists()) {
										File dir = new File(file4.getParent());
										dir.mkdirs();
										file4.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream4 = new FileOutputStream(file4);
									outStream4.write(splitLoop[3].getBytes());
									outStream4.close();
									
									// print the result to the console
									System.out.println("Output of condition 4 of this program has been stored in " + path4 + "\n");
									
									// for the 5th file
									String path5 = "./output/" + testNum + "-method0" + i + "-condition05.txt";
									
									File file5 = new File(path5);
									
									if (!file5.exists()) {
										File dir = new File(file5.getParent());
										dir.mkdirs();
										file5.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream5 = new FileOutputStream(file5);
									outStream5.write(splitLoop[4].getBytes());
									outStream5.close();
									
									// print the result to the console
									System.out.println("Output of condition 5 of this program has been stored in " + path5 + "\n");
									
								}
								// if it's not, then use the normal procedual
								else {
									if (isMethod) {
										// print the method content
										System.out.println(PrettyPrinter.infixFormula.get(i - 1));
										
										
										// splitWpStr contains the seperated z3 output for each postcondition
										String[] splitWpStr = null;
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										if (splitedPrinterOutput[i - 1].contains("splitWp")) {
											splitWpStr = splitedPrinterOutput[i - 1].split("splitWp");
										}
										
										for (int j = 0; j < splitWpStr.length - 1; j++) {
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(j)).contract.a;
											String path = "./output/" + testNum + "-method0" + i + "-" + tagName + ".txt";
											
											File file = new File(path);
											
											if (!file.exists()) {
												File dir = new File(file.getParent());
												dir.mkdirs();
												file.createNewFile();
											}
											
											// write to file
											FileOutputStream outStream = new FileOutputStream(file);
											outStream.write(splitWpStr[j].getBytes());
											outStream.close();
											
											// print the rest result to the console
											System.out.println("Output of postcondition " + tagName + " has been stored in " + path + "\n");
										}
									}
									else {
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
								}
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
						/* *****************************************************************************************
						 * TODO if there is no input file
						 * *****************************************************************************************
						 */
						else {
							// write the output to the file
							for (int i = 1; i <= splitedPrinterOutput.length; i++) {
								// test to see if it's the method that contains the loop
								if (splitedPrinterOutput[i - 1].contains("splitLoopStep")) {
									// split the five steps of the loop
									String[] splitLoop = splitedPrinterOutput[i - 1].split("splitLoopStep\\n");
									
									// save these five steps into seperate files
									// for the 1st file
									String path1 = "./output/"  + "method0" + i + "-condition01.txt";
									
									File file1 = new File(path1);
									
									if (!file1.exists()) {
										File dir = new File(file1.getParent());
										dir.mkdirs();
										file1.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream1 = new FileOutputStream(file1);
									outStream1.write(splitLoop[0].getBytes());
									outStream1.close();
									
									// print the result to the console
									System.out.println(PrettyPrinter.infixFormula.get(i - 1) + "\nThis program contains loop.\n");
									System.out.println("Output of condition 1 of this program has been stored in " + path1 + "\n");
									
									// for the 2nd file
									String path2 = "./output/"  + "method0" + i + "-condition02.txt";
									
									File file2 = new File(path2);
									
									if (!file2.exists()) {
										File dir = new File(file2.getParent());
										dir.mkdirs();
										file2.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream2 = new FileOutputStream(file2);
									outStream2.write(splitLoop[1].getBytes());
									outStream2.close();
									
									// print the result to the console
									System.out.println("Output of condition 2 of this program has been stored in " + path2 + "\n");
									
									// for the 3rd file
									// first check if there is only one post condition
									if (PrefixPrinter.methodLoopCondition3WpMap.get(methodName).size() <= 1) {
										String path3 = "./output/" + "-method0" + i + "-condition03.txt";
										
										File file3 = new File(path3);
										
										if (!file3.exists()) {
											File dir = new File(file3.getParent());
											dir.mkdirs();
											file3.createNewFile();
										}
										
										// write to file
										FileOutputStream outStream3 = new FileOutputStream(file3);
										outStream3.write(splitLoop[2].getBytes());
										outStream3.close();
										
										// print the result to the console
										System.out.println("Output of condition 3 of this program has been stored in " + path3 + "\n");
									}
									else {
										String[] splitCondition3 = splitLoop[2].split("splitCondition3Step");
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										for (int j = 0; j < splitCondition3.length - 1; j++) {
											// set up the tag name
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(j)).contract.a;
											
											String path3 = "./output/" + "-method0" + i + "-condition03-" + tagName +".txt";
											
											File file3 = new File(path3);
											
											if (!file3.exists()) {
												File dir = new File(file3.getParent());
												dir.mkdirs();
												file3.createNewFile();
											}
											
											// write to file
											FileOutputStream outStream3 = new FileOutputStream(file3);
											outStream3.write(splitCondition3[j].getBytes());
											outStream3.close();
											
											// print the result to the console
											System.out.println("Output of condition 3 postcondition " + tagName + " of this program has been stored in " + path3 + "\n");
										}
									}
									
									// for the 4th file
									String path4 = "./output/"  + "method0" + i + "-condition04.txt";
									
									File file4 = new File(path4);
									
									if (!file4.exists()) {
										File dir = new File(file4.getParent());
										dir.mkdirs();
										file4.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream4 = new FileOutputStream(file4);
									outStream4.write(splitLoop[3].getBytes());
									outStream4.close();
									
									// print the result to the console
									System.out.println("Output of condition 4 of this program has been stored in " + path4 + "\n");
									
									// for the 5th file
									String path5 = "./output/"  + "method0" + i + "-condition05.txt";
									
									File file5 = new File(path5);
									
									if (!file5.exists()) {
										File dir = new File(file5.getParent());
										dir.mkdirs();
										file5.createNewFile();
									}
									
									// write to file
									FileOutputStream outStream5 = new FileOutputStream(file5);
									outStream5.write(splitLoop[4].getBytes());
									outStream5.close();
									
									// print the result to the console
									System.out.println("Output of condition 5 of this program has been stored in " + path5 + "\n");
									
								}
								// if it's not, then use the normal procedual
								else {
									if (isMethod) {
										// print the method content
										System.out.println(PrettyPrinter.infixFormula.get(i - 1));
										
										
										// splitWpStr contains the seperated z3 output for each postcondition
										String[] splitWpStr = null;
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										if (splitedPrinterOutput[i - 1].contains("splitWp")) {
											splitWpStr = splitedPrinterOutput[i - 1].split("splitWp");
										}
										
										for (int j = 0; j < splitWpStr.length - 1; j++) {
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(j)).contract.a;
											String path = "./output/" + "-method0" + i + "-" + tagName + ".txt";
											
											File file = new File(path);
											
											if (!file.exists()) {
												File dir = new File(file.getParent());
												dir.mkdirs();
												file.createNewFile();
											}
											
											// write to file
											FileOutputStream outStream = new FileOutputStream(file);
											outStream.write(splitWpStr[j].getBytes());
											outStream.close();
											
											// print the rest result to the console
											System.out.println("Output of postcondition " + tagName + " has been stored in " + path + "\n");
										}
									}
									else {
										String path1 = "./output/" + "-formula0" + i + ".txt";
										
										
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
								}
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
				 * TODO if the first argument is "-v"
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
			        //System.out.println("TypeChecker.arrayMap: " + TypeChecker.arrayMap + "\n");
			        //System.out.println("TypeChecker.pairMap: " + TypeChecker.pairMap + "\n");
			        
			        
			        
			        
			        
			        
			        
			        
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
 			       //System.out.println("varPrinter.objMap: " + varPrinter.objMap + "\n");
 			      
 			        	
 			        	
 			        	
 			        	
 			        	
 			        	
						
 			        	// call the pretty printer
 			        	PrettyPrinter printer = new PrettyPrinter();
 			        	
						for (int i = 0; i < verifier.size(); i++) {
							verifier.get(i).accept(printer);
							
							//System.out.println("PrefixPrinter.completeVarMap: " + PrefixPrinter.completeVarMap);
							//System.out.println("PrefixPrinter.inclusiveVarMap: " + PrefixPrinter.inclusiveVarMap);
							//System.out.println("PrefixPrinter.arrayMap: " + PrefixPrinter.arrayMap);
							//System.out.println("PrefixPrinter.oldVarMap: " + PrefixPrinter.oldVarMap);
							//System.out.println("PrefixPrinter.pairTypeMap: " + PrefixPrinter.pairTypeMap);
							//System.out.println("PrefixPrinter.pairValueMap: " + PrefixPrinter.pairValueMap);
							
						}
						
						
						
						
						//System.out.println("PrefixPrinter.completeVarMap: " + PrefixPrinter.completeVarMap + "\n");
						
						
						
						
						
						// split the output
						String[] splitedOutput = printer.z3output.split("split\n");
						
						// indicates if it's method verification
						boolean isMethod = false;
						String methodName = "";
						
						// remove the first line
						for (int a = 1; a <= splitedOutput.length; a++) {
							String [] strArr = splitedOutput[a - 1].split("\\n");
							isMethod = !strArr[0].equals(";formula");
							if (isMethod) {
								methodName = strArr[0].replaceAll(";", "");
							}
							
							
							String updatedStr = "";
							for (int i = 1; i < strArr.length; i++) {
								updatedStr = updatedStr + strArr[i] + "\n";
							}
							splitedOutput[a - 1] = updatedStr;
						}
						
						
						/* *****************************************************************************************
						 * TODO if there is an input file
						 * *****************************************************************************************
						 */
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
								// test to see if it's the method that contains the loop
								if (splitedOutput[i - 1].contains("splitLoopStep")) {
									
									// split the five steps of the loop
									String[] splitLoop = splitedOutput[i - 1].split("splitLoopStep\\n");
									
									// set up the path
									String path1 = "./output/" + testNum + "-verified0" + i + ".txt";
									
									File file = new File(path1);
									
									// if file not exist, create the file
									if (!file.exists()) {
										File dir = new File(file.getParent());
										dir.mkdirs();
										file.createNewFile();
									}
									
									// print the program first
									writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
									
									// print the precondition
									writeToFile = writeToFile.concat("Precondition(Q) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methodName));
									// print postcondition
									writeToFile = writeToFile.concat("Postcondition(R) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methodName));
									//print the implementations
									writeToFile = writeToFile.concat("Implementation(S) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.imps.get(methodName));
									// print wp
									writeToFile = writeToFile.concat("Correctness conditions : \n");
									writeToFile = writeToFile.concat(InfixPrinter.wps.get(methodName));
									
									
									// then test the five steps separately
								
									// test the first step
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx1 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input1 = ctx1.parseSMTLIB2String(splitLoop[0].replaceAll("\n", ""), 
											null, null, null, null);
									
									
									// create solver and add the input expression
									Solver s1 = ctx1.mkSolver();
									s1.add(input1);
									
									// check if the formula is a tautology
									Status result1 = s1.check();
									
									// if step 1 is not correct
									if (result1 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 1 is not discharged.\n");
										
										// get the model
						            	Model m = s1.getModel();
						            	
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
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 1 is correct
									else if (result1 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 1 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									
									// then test step 2
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx2 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input2 = ctx2.parseSMTLIB2String(splitLoop[1].replaceAll("\n", ""), 
											null, null, null, null);
									
									
									
									// create solver and add the input expression
									Solver s2 = ctx2.mkSolver();
									s2.add(input2);
									
									// check if the formula is a tautology
									Status result2 = s2.check();
									
									// if step 2 is not correct
									if (result2 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 2 is not discharged.\n");
										
										// get the model
						            	Model m = s2.getModel();
						            	
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
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 2 is correct
									else if (result2 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 2 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									// test the third step
									// first check if there is only one postcondition
									if (PrefixPrinter.methodLoopCondition3WpMap.get(methodName).size() <= 1) {
										// create z3 context
										@SuppressWarnings("resource")
										Context ctx3 = new Context();
										
										// convert the string and sent it to z3 context
										BoolExpr[] input3 = ctx3.parseSMTLIB2String(splitLoop[2].replaceAll("\n", ""), 
												null, null, null, null);
										
										
										// create solver and add the input expression
										Solver s3 = ctx3.mkSolver();
										s3.add(input3);
										
										// check if the formula is a tautology
										Status result3 = s3.check();
										
										// if step 3 is not correct
										if (result3 == Status.SATISFIABLE) {
											writeToFile = writeToFile.concat("Condition 3 is not discharged.\n");
											
											// get the model
							            	Model m = s3.getModel();
							            	
							            	//System.out.println(m.toString());
							            	
							            	// create the list to store only the necessary output string
							            	List<String[]> varOutput = new ArrayList<String[]>();
							            	
							            	// split the z3 outputed model string
							            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
							            	 
							            	
							            	
							            	for (int j = 1; j < splitModel.length; j++) {
						
												String[] varValue = splitModel[j].split(" ");
												
//												for (int k = 0; k < varValue.length; k++) {
//													System.out.println(k + " " + varValue[k]);
//												}
												
												// grab the necessary output
												if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
													varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
															+ varValue[6].replaceAll("\\)", "");
												}
												else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
													if (varValue.length <= 6) {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													else {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
													}
												}
												else if (varValue[4].charAt(0) == '(') {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												
												
												
												String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
												varOutput.add(str);
											}
							            	
						            	
							            	// test to see if the counterexample is available
							            	// if it contains "forall" or "exists" or "Array"
							            	// then counterexample is not available
							            	if (splitedOutput[i - 1].contains("forall") 
							            			|| splitedOutput[i - 1].contains("exists")
							            			|| splitedOutput[i - 1].contains("Array")) {
							            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
										// if step 3 is correct
										else if (result3 == Status.UNSATISFIABLE) {
											writeToFile = writeToFile.concat("Condition 3 is discharged.\n");
										}
										else {
											writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
										}
									}
									// if there is more than one postconditions
									else {
										String[] splitCondition3 = splitLoop[2].split("splitCondition3Step");
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										for (int k = 0; k < splitCondition3.length - 1; k++) {
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(k)).contract.a;
											
											@SuppressWarnings("resource")
											Context ctx3 = new Context();

											// convert the string and sent it to z3 context
											BoolExpr[] input3 = ctx3.parseSMTLIB2String(splitCondition3[k].replaceAll("\n", ""), 
													null, null, null, null);


											// create solver and add the input expression
											Solver s3 = ctx3.mkSolver();
											s3.add(input3);

											// check if the formula is a tautology
											Status result3 = s3.check();
											
											// if step 3 is not correct
											if (result3 == Status.SATISFIABLE) {
												writeToFile = writeToFile.concat("Condition 3 postcondition " + tagName + " is not discharged.\n");
												
												// get the model
												Model m = s3.getModel();
												
												//System.out.println(m.toString());
												
												// create the list to store only the necessary output string
												List<String[]> varOutput = new ArrayList<String[]>();
												
												// split the z3 outputed model string
												String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
												 
												for (int j = 1; j < splitModel.length; j++) {

													String[] varValue = splitModel[j].split(" ");
													
//													for (int k = 0; k < varValue.length; k++) {
//														System.out.println(k + " " + varValue[k]);
//													}
													
													// grab the necessary output
													if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
														varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
																+ varValue[6].replaceAll("\\)", "");
													}
													else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
														if (varValue.length <= 6) {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
														}
														else {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																	+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
														}
													}
													else if (varValue[4].charAt(0) == '(') {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													
													
													
													String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
													varOutput.add(str);
												}
												

												// test to see if the counterexample is available
												// if it contains "forall" or "exists" or "Array"
												// then counterexample is not available
												if (splitedOutput[i - 1].contains("forall") 
														|| splitedOutput[i - 1].contains("exists")
														|| splitedOutput[i - 1].contains("Array")) {
													writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
											else if (result3 == Status.UNSATISFIABLE) {
												writeToFile = writeToFile.concat("Condition 3 postcondition " + tagName + " is discharged.\n");
											}
											else {
												writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
											}
										}
									}
									
									// test step 4
									@SuppressWarnings("resource")
									Context ctx4 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input4 = ctx4.parseSMTLIB2String(splitLoop[3].replaceAll("\n", ""), 
											null, null, null, null);
									
									// create solver and add the input expression
									Solver s4 = ctx4.mkSolver();
									s4.add(input4);
									
									// check if the formula is a tautology
									Status result4 = s4.check();
									
									// if step 4 is not correct
									if (result4 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 4 is not discharged.\n");
										
										// get the model
						            	Model m = s4.getModel();
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {

											String[] varValue = splitModel[j].split(" ");
											
//																	for (int k = 0; k < varValue.length; k++) {
//																		System.out.println(k + " " + varValue[k]);
//																	}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						        	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 4 is correct
									else if (result4 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 4 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									// test the 5th step
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx5 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input5 = ctx5.parseSMTLIB2String(splitLoop[4].replaceAll("\n", ""), 
											null, null, null, null);
									
									// create solver and add the input expression
									Solver s5 = ctx5.mkSolver();
									s5.add(input5);
									
									// check if the formula is a tautology
									Status result5 = s5.check();
									
									// if step 5 is not correct
									if (result5 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 5 is not discharged.\n");
										
										// get the model
						            	Model m = s5.getModel();
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {

											String[] varValue = splitModel[j].split(" ");
											
//																	for (int k = 0; k < varValue.length; k++) {
//																		System.out.println(k + " " + varValue[k]);
//																	}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						        	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 5 is correct
									else if (result5 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 5 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									FileOutputStream outStream = new FileOutputStream(file);
									outStream.write(writeToFile.getBytes());
									outStream.close();
									
									System.out.println(writeToFile);
									
								}
								// if it's not the method that contains the loop
								else {
									// set up the path
									String path = "./output/" + testNum + "-verified0" + i + ".txt";
									
									File file = new File(path);
									
									// if file not exist, create the file
									if (!file.exists()) {
										File dir = new File(file.getParent());
										dir.mkdirs();
										file.createNewFile();
									}
									
									// check if it's method verification
									if (isMethod) {
										// print the program first
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methodName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(R) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methodName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methodName));
										// print the wp for each postcondition
										writeToFile = writeToFile.concat("\n" + InfixPrinter.wps.get(methodName));
										writeToFile = writeToFile.concat("\nProof Obligation: \n");
									
										// splitWpStr contains the seperated z3 output for each postcondition
										String[] splitWpStr = null;
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										if (splitedOutput[i - 1].contains("splitWp")) {
											splitWpStr = splitedOutput[i - 1].split("splitWp");
										}
										
										// preConjunction: Q1 AND Q2 AND Q3 AND ...
										// let the initial string be the first precondition tag
										String preConjunction = "(" + ((ContractExpr) ((Preconditions) PrefixPrinter.
												methodPreconditionMap.get(methodName)).contracts.get(0)).contract.a;
										// add the conjunction string for rest of the precondition tag
										for (int k = 1; k < ((Preconditions) PrefixPrinter.methodPreconditionMap.get(methodName)).contracts.size(); k++) {
											preConjunction = preConjunction + " AND " + ((ContractExpr) ((Preconditions) PrefixPrinter.
													methodPreconditionMap.get(methodName)).contracts.get(k)).contract.a;
										}
										preConjunction = preConjunction + ")";
										
										
										// send the hoare triple for each postcondition to Z3 for verification 
										for (int j = 0; j < splitWpStr.length - 1; j++) {
											
											// store the tag name first
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.
													get(methodName)).contracts.get(j)).contract.a;
											
											// add the first line for each postcondition
											writeToFile = writeToFile.concat(preConjunction + " => wp(S, " + tagName + ")\n");
											
											
											// send output to Z3 for verification
											
											// create z3 context
											@SuppressWarnings("resource")
											Context ctx = new Context();
											
											// convert the string and sent it to z3 context
											BoolExpr[] inputExpr = ctx.parseSMTLIB2String(splitWpStr[j].replaceAll("\n", ""), 
													null, null, null, null);
											
											
											// create solver and add the input expression
											Solver s = ctx.mkSolver();
											s.add(inputExpr);
											
											// check if the formula is a tautology
											Status result = s.check();
											
											if (result == Status.SATISFIABLE) {
												
												writeToFile = writeToFile.concat("Not discharged.\n");
												
												// get the model
								            	Model m = s.getModel();
								            	
								            	//System.out.println(m.toString());
								            	
								            	// create the list to store only the necessary output string
								            	List<String[]> varOutput = new ArrayList<String[]>();
								            	
								            	// split the z3 outputed model string
								            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
								            	 
								            	
								            	
								            	for (int a = 1; a < splitModel.length; a++) {
							
													String[] varValue = splitModel[a].split(" ");
													
//													for (int k = 0; k < varValue.length; k++) {
//														System.out.println(k + " " + varValue[k]);
//													}
													
													// grab the necessary output
													if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
														varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
																+ varValue[6].replaceAll("\\)", "");
													}
													else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
														if (varValue.length <= 6) {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
														}
														else {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																	+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
														}
													}
													else if (varValue[4].charAt(0) == '(') {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													
													
													
													String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
													varOutput.add(str);
												}
								            	
							            	
								            	// test to see if the counterexample is available
								            	// if it contains "forall" or "exists" or "Array"
								            	// then counterexample is not available
								            	if (splitedOutput[i - 1].contains("forall") 
								            			|| splitedOutput[i - 1].contains("exists")
								            			|| splitedOutput[i - 1].contains("Array")) {
								            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
												}
								            	// if it does not contain all of them, then the counterexample is available
								            	else {
								            		writeToFile = writeToFile.concat("Counterexample: \n");
									            	for (int r = 0; r < varOutput.size(); r++) {
									            		writeToFile = writeToFile.concat("    " + varOutput.get(r)[0] 
									            				+ " : " + varOutput.get(r)[2] + "\n");
													}
												}
											}
											
											else if(result == Status.UNSATISFIABLE) {
												writeToFile = writeToFile.concat("Discharged.\n");
											}
											else {
												writeToFile = writeToFile.concat("Unknow input.\n");
											}
										}
									}
						
									// if it's normal formula verification
									else {
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
										
										
										if (result == Status.SATISFIABLE) {
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
												
//												for (int k = 0; k < varValue.length; k++) {
//													System.out.println(k + " " + varValue[k]);
//												}
												
												// grab the necessary output
												if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
													varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
															+ varValue[6].replaceAll("\\)", "");
												}
												else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
													if (varValue.length <= 6) {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													else {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
													}
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
										
										else if(result == Status.UNSATISFIABLE) {
											writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nIs a tautology.\n";
										}
										
										else  {
							            	writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
							            }
									}
									
									FileOutputStream outStream = new FileOutputStream(file);
									outStream.write(writeToFile.getBytes());
									outStream.close();
									
									System.out.println(writeToFile);
								}
							}
						}
						/* *****************************************************************************************
						 * TODO if there is no input file
						 * *****************************************************************************************
						 */
						else {
							// create string
							String writeToFile = "";
							
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								// test to see if it's the method that contains the loop
								if (splitedOutput[i - 1].contains("splitLoopStep")) {
									
									// split the five steps of the loop
									String[] splitLoop = splitedOutput[i - 1].split("splitLoopStep\\n");
									
									// set up the path
									String path1 = "./output/" + "-verified0" + i + ".txt";
									
									File file = new File(path1);
									
									// if file not exist, create the file
									if (!file.exists()) {
										File dir = new File(file.getParent());
										dir.mkdirs();
										file.createNewFile();
									}
									
									// print the program first
									writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
									
									// print the precondition
									writeToFile = writeToFile.concat("Precondition(Q) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methodName));
									// print postcondition
									writeToFile = writeToFile.concat("Postcondition(R) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methodName));
									//print the implementations
									writeToFile = writeToFile.concat("Implementation(S) : \n");
									writeToFile = writeToFile.concat(InfixPrinter.imps.get(methodName));
									// print wp
									writeToFile = writeToFile.concat("Correctness conditions : \n");
									writeToFile = writeToFile.concat(InfixPrinter.wps.get(methodName));
									
									
									// then test the five steps separately
								
									// test the first step
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx1 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input1 = ctx1.parseSMTLIB2String(splitLoop[0].replaceAll("\n", ""), 
											null, null, null, null);
									
									
									// create solver and add the input expression
									Solver s1 = ctx1.mkSolver();
									s1.add(input1);
									
									// check if the formula is a tautology
									Status result1 = s1.check();
									
									// if step 1 is not correct
									if (result1 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 1 is not discharged.\n");
										
										// get the model
						            	Model m = s1.getModel();
						            	
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
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 1 is correct
									else if (result1 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 1 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									
									// then test step 2
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx2 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input2 = ctx2.parseSMTLIB2String(splitLoop[1].replaceAll("\n", ""), 
											null, null, null, null);
									
									
									
									// create solver and add the input expression
									Solver s2 = ctx2.mkSolver();
									s2.add(input2);
									
									// check if the formula is a tautology
									Status result2 = s2.check();
									
									// if step 2 is not correct
									if (result2 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 2 is not discharged.\n");
										
										// get the model
						            	Model m = s2.getModel();
						            	
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
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
					            	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 2 is correct
									else if (result2 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 2 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									// test the third step
									// first check if there is only one postcondition
									if (PrefixPrinter.methodLoopCondition3WpMap.get(methodName).size() <= 1) {
										// create z3 context
										@SuppressWarnings("resource")
										Context ctx3 = new Context();
										
										// convert the string and sent it to z3 context
										BoolExpr[] input3 = ctx3.parseSMTLIB2String(splitLoop[2].replaceAll("\n", ""), 
												null, null, null, null);
										
										
										// create solver and add the input expression
										Solver s3 = ctx3.mkSolver();
										s3.add(input3);
										
										// check if the formula is a tautology
										Status result3 = s3.check();
										
										// if step 3 is not correct
										if (result3 == Status.SATISFIABLE) {
											writeToFile = writeToFile.concat("Condition 3 is not discharged.\n");
											
											// get the model
							            	Model m = s3.getModel();
							            	
							            	//System.out.println(m.toString());
							            	
							            	// create the list to store only the necessary output string
							            	List<String[]> varOutput = new ArrayList<String[]>();
							            	
							            	// split the z3 outputed model string
							            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
							            	 
							            	
							            	
							            	for (int j = 1; j < splitModel.length; j++) {
						
												String[] varValue = splitModel[j].split(" ");
												
//												for (int k = 0; k < varValue.length; k++) {
//													System.out.println(k + " " + varValue[k]);
//												}
												
												// grab the necessary output
												if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
													varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
															+ varValue[6].replaceAll("\\)", "");
												}
												else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
													if (varValue.length <= 6) {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													else {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
													}
												}
												else if (varValue[4].charAt(0) == '(') {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												
												
												
												String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
												varOutput.add(str);
											}
							            	
						            	
							            	// test to see if the counterexample is available
							            	// if it contains "forall" or "exists" or "Array"
							            	// then counterexample is not available
							            	if (splitedOutput[i - 1].contains("forall") 
							            			|| splitedOutput[i - 1].contains("exists")
							            			|| splitedOutput[i - 1].contains("Array")) {
							            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
										// if step 3 is correct
										else if (result3 == Status.UNSATISFIABLE) {
											writeToFile = writeToFile.concat("Condition 3 is discharged.\n");
										}
										else {
											writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
										}
									}
									// if there is more than one postconditions
									else {
										String[] splitCondition3 = splitLoop[2].split("splitCondition3Step");
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										for (int k = 0; k < splitCondition3.length - 1; k++) {
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.get(methodName)).contracts.get(k)).contract.a;
											
											@SuppressWarnings("resource")
											Context ctx3 = new Context();

											// convert the string and sent it to z3 context
											BoolExpr[] input3 = ctx3.parseSMTLIB2String(splitCondition3[k].replaceAll("\n", ""), 
													null, null, null, null);


											// create solver and add the input expression
											Solver s3 = ctx3.mkSolver();
											s3.add(input3);

											// check if the formula is a tautology
											Status result3 = s3.check();
											
											// if step 3 is not correct
											if (result3 == Status.SATISFIABLE) {
												writeToFile = writeToFile.concat("Condition 3 postcondition " + tagName + " is not discharged.\n");
												
												// get the model
												Model m = s3.getModel();
												
												//System.out.println(m.toString());
												
												// create the list to store only the necessary output string
												List<String[]> varOutput = new ArrayList<String[]>();
												
												// split the z3 outputed model string
												String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
												 
												for (int j = 1; j < splitModel.length; j++) {

													String[] varValue = splitModel[j].split(" ");
													
//													for (int k = 0; k < varValue.length; k++) {
//														System.out.println(k + " " + varValue[k]);
//													}
													
													// grab the necessary output
													if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
														varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
																+ varValue[6].replaceAll("\\)", "");
													}
													else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
														if (varValue.length <= 6) {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
														}
														else {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																	+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
														}
													}
													else if (varValue[4].charAt(0) == '(') {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													
													
													
													String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
													varOutput.add(str);
												}
												

												// test to see if the counterexample is available
												// if it contains "forall" or "exists" or "Array"
												// then counterexample is not available
												if (splitedOutput[i - 1].contains("forall") 
														|| splitedOutput[i - 1].contains("exists")
														|| splitedOutput[i - 1].contains("Array")) {
													writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
											else if (result3 == Status.UNSATISFIABLE) {
												writeToFile = writeToFile.concat("Condition 3 postcondition " + tagName + " is discharged.\n");
											}
											else {
												writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
											}
										}
									}
									
									
									// test step 4
									@SuppressWarnings("resource")
									Context ctx4 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input4 = ctx4.parseSMTLIB2String(splitLoop[3].replaceAll("\n", ""), 
											null, null, null, null);
									
									// create solver and add the input expression
									Solver s4 = ctx4.mkSolver();
									s4.add(input4);
									
									// check if the formula is a tautology
									Status result4 = s4.check();
									
									// if step 4 is not correct
									if (result4 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 4 is not discharged.\n");
										
										// get the model
						            	Model m = s4.getModel();
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {

											String[] varValue = splitModel[j].split(" ");
											
//																	for (int k = 0; k < varValue.length; k++) {
//																		System.out.println(k + " " + varValue[k]);
//																	}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						        	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 4 is correct
									else if (result4 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 4 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									// test the 5th step
									// create z3 context
									@SuppressWarnings("resource")
									Context ctx5 = new Context();
									
									// convert the string and sent it to z3 context
									BoolExpr[] input5 = ctx5.parseSMTLIB2String(splitLoop[4].replaceAll("\n", ""), 
											null, null, null, null);
									
									// create solver and add the input expression
									Solver s5 = ctx5.mkSolver();
									s5.add(input5);
									
									// check if the formula is a tautology
									Status result5 = s5.check();
									
									// if step 5 is not correct
									if (result5 == Status.SATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 5 is not discharged.\n");
										
										// get the model
						            	Model m = s5.getModel();
						            	
						            	// create the list to store only the necessary output string
						            	List<String[]> varOutput = new ArrayList<String[]>();
						            	
						            	// split the z3 outputed model string
						            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
						            	 
						            	
						            	
						            	for (int j = 1; j < splitModel.length; j++) {

											String[] varValue = splitModel[j].split(" ");
											
//																	for (int k = 0; k < varValue.length; k++) {
//																		System.out.println(k + " " + varValue[k]);
//																	}
											
											// grab the necessary output
											if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
												varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
														+ varValue[6].replaceAll("\\)", "");
											}
											else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
												if (varValue.length <= 6) {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
												}
												else {
													varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
															+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
												}
											}
											else if (varValue[4].charAt(0) == '(') {
												varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
											}
											
											
											
											String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
											varOutput.add(str);
										}
						            	
						        	
						            	// test to see if the counterexample is available
						            	// if it contains "forall" or "exists" or "Array"
						            	// then counterexample is not available
						            	if (splitedOutput[i - 1].contains("forall") 
						            			|| splitedOutput[i - 1].contains("exists")
						            			|| splitedOutput[i - 1].contains("Array")) {
						            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
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
									// if step 5 is correct
									else if (result5 == Status.UNSATISFIABLE) {
										writeToFile = writeToFile.concat("Condition 5 is discharged.\n");
									}
									else {
										writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
									}
									
									FileOutputStream outStream = new FileOutputStream(file);
									outStream.write(writeToFile.getBytes());
									outStream.close();
									
									System.out.println(writeToFile);
									
								}
								// if it's not the method that contains the loop
								else {
									// set up the path
									String path = "./output/" + "-verified0" + i + ".txt";
									
									File file = new File(path);
									
									// if file not exist, create the file
									if (!file.exists()) {
										File dir = new File(file.getParent());
										dir.mkdirs();
										file.createNewFile();
									}
									
									// check if it's method verification
									if (isMethod) {
										// print the program first
										writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
										
										// print the precondition
										writeToFile = writeToFile.concat("Precondition(Q) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.preconditions.get(methodName));
										// print postcondition
										writeToFile = writeToFile.concat("Postcondition(R) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.postconditions.get(methodName));
										//print the implementations
										writeToFile = writeToFile.concat("Implementation(S) : \n");
										writeToFile = writeToFile.concat(InfixPrinter.imps.get(methodName));
										// print the wp for each postcondition
										writeToFile = writeToFile.concat("\n" + InfixPrinter.wps.get(methodName));
										writeToFile = writeToFile.concat("\nProof Obligation: \n");
									
										// splitWpStr contains the seperated z3 output for each postcondition
										String[] splitWpStr = null;
										
										// tagName contains the tag of each postcondition
										String tagName = "";
										
										if (splitedOutput[i - 1].contains("splitWp")) {
											splitWpStr = splitedOutput[i - 1].split("splitWp");
										}
										
										// preConjunction: Q1 AND Q2 AND Q3 AND ...
										// let the initial string be the first precondition tag
										String preConjunction = "(" + ((ContractExpr) ((Preconditions) PrefixPrinter.
												methodPreconditionMap.get(methodName)).contracts.get(0)).contract.a;
										// add the conjunction string for rest of the precondition tag
										for (int k = 1; k < ((Preconditions) PrefixPrinter.methodPreconditionMap.get(methodName)).contracts.size(); k++) {
											preConjunction = preConjunction + " AND " + ((ContractExpr) ((Preconditions) PrefixPrinter.
													methodPreconditionMap.get(methodName)).contracts.get(k)).contract.a;
										}
										preConjunction = preConjunction + ")";
										
										
										// send the hoare triple for each postcondition to Z3 for verification 
										for (int j = 0; j < splitWpStr.length - 1; j++) {
											
											// store the tag name first
											tagName = ((ContractExpr)((Postconditions) PrefixPrinter.methodPostconditionMap.
													get(methodName)).contracts.get(j)).contract.a;
											
											// add the first line for each postcondition
											writeToFile = writeToFile.concat(preConjunction + " => wp(S, " + tagName + ")\n");
											
											
											// send output to Z3 for verification
											
											// create z3 context
											@SuppressWarnings("resource")
											Context ctx = new Context();
											
											// convert the string and sent it to z3 context
											BoolExpr[] inputExpr = ctx.parseSMTLIB2String(splitWpStr[j].replaceAll("\n", ""), 
													null, null, null, null);
											
											
											// create solver and add the input expression
											Solver s = ctx.mkSolver();
											s.add(inputExpr);
											
											// check if the formula is a tautology
											Status result = s.check();
											
											if (result == Status.SATISFIABLE) {
												
												writeToFile = writeToFile.concat("Not discharged.\n");
												
												// get the model
								            	Model m = s.getModel();
								            	
								            	//System.out.println(m.toString());
								            	
								            	// create the list to store only the necessary output string
								            	List<String[]> varOutput = new ArrayList<String[]>();
								            	
								            	// split the z3 outputed model string
								            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
								            	 
								            	
								            	
								            	for (int a = 1; a < splitModel.length; a++) {
							
													String[] varValue = splitModel[a].split(" ");
													
//													for (int k = 0; k < varValue.length; k++) {
//														System.out.println(k + " " + varValue[k]);
//													}
													
													// grab the necessary output
													if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
														varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
																+ varValue[6].replaceAll("\\)", "");
													}
													else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
														if (varValue.length <= 6) {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
														}
														else {
															varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																	+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
														}
													}
													else if (varValue[4].charAt(0) == '(') {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													
													
													
													String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
													varOutput.add(str);
												}
								            	
							            	
								            	// test to see if the counterexample is available
								            	// if it contains "forall" or "exists" or "Array"
								            	// then counterexample is not available
								            	if (splitedOutput[i - 1].contains("forall") 
								            			|| splitedOutput[i - 1].contains("exists")
								            			|| splitedOutput[i - 1].contains("Array")) {
								            		writeToFile = writeToFile.concat("Counterexample is not available.\n");
												}
								            	// if it does not contain all of them, then the counterexample is available
								            	else {
								            		writeToFile = writeToFile.concat("Counterexample: \n");
									            	for (int r = 0; r < varOutput.size(); r++) {
									            		writeToFile = writeToFile.concat("    " + varOutput.get(r)[0] 
									            				+ " : " + varOutput.get(r)[2] + "\n");
													}
												}
											}
											
											else if(result == Status.UNSATISFIABLE) {
												writeToFile = writeToFile.concat("Discharged.\n");
											}
											else {
												writeToFile = writeToFile.concat("Unknow input.\n");
											}
										}
									}
						
									// if it's normal formula verification
									else {
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
										
										
										if (result == Status.SATISFIABLE) {
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
												
//												for (int k = 0; k < varValue.length; k++) {
//													System.out.println(k + " " + varValue[k]);
//												}
												
												// grab the necessary output
												if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '/') {
													varValue[4] = varValue[5] + varValue[4].replaceAll("\\(", "") 
															+ varValue[6].replaceAll("\\)", "");
												}
												else if (varValue[4].charAt(0) == '(' && varValue[4].charAt(1) == '-') {
													if (varValue.length <= 6) {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[5].replaceAll("\\)", "");
													}
													else {
														varValue[4] = varValue[4].replaceAll("\\(", "") + varValue[6]
																+ varValue[5].replaceAll("\\(", "") + varValue[7].replaceAll("\\)", "");
													}
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
										
										else if(result == Status.UNSATISFIABLE) {
											writeToFile = PrettyPrinter.infixFormula.get(i - 1) + "\nIs a tautology.\n";
										}
										
										else  {
							            	writeToFile = "Unknow formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\n";
							            }
									}
									
									FileOutputStream outStream = new FileOutputStream(file);
									outStream.write(writeToFile.getBytes());
									outStream.close();
									
									System.out.println(writeToFile);
								}
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
							+ "\"-p\": For Pretty Printing.\n"
							+ "\"-v\": For Formula or Program Verification.\n"
							+ "You could also include an input file followed by an argument.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
