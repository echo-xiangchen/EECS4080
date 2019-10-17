package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import com.microsoft.z3.*;
import antlr.*;
import logic.*;
import logic.composite.*;
import logic.visitor.*;

public class TestLogicVer {
	public static void main(String[] args) {
		try {
			// set up strings for different variable
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
				// if the first argument is "-p"
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
			        LogicLexer lexer = new LogicLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        LogicParser parser = new LogicParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			        
			        //System.out.println(tree.getText());
			        
			        AntlrToLogic AntlrToLogic = new AntlrToLogic();
			        
			        // list that stores the subtree separately
			        List<Logic> logic = new ArrayList<Logic>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	logic.add(AntlrToLogic.visit(tree.getChild(i)));
					}
			       
			        // create new TypeChecker
			        TypeChecker checker = new TypeChecker();
			        
			        // Recursively accept TypeChecker
			        for (int i = 0; i < logic.size(); i++) {
			        	logic.get(i).accept(checker);
					}
			        
			        // check if error msg is empty
			        // only when it's empty, call the pretty printer
			        if (checker.errormsg.isEmpty()) {
			        	PrettyPrinter printer = new PrettyPrinter();
						
						for (int i = 0; i < logic.size(); i++) {
							logic.get(i).accept(printer);
						}
						//System.out.println(printer.z3output);
						
						
						// split the output
						String[] splitedPrinterOutput = printer.z3output.split("split\n");
					
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
								
								
								// print the warning message
								if (PrettyPrinter.warningMsg.get(i - 1) != "") {
									System.out.println("Formula: " 
											+ PrettyPrinter.infixFormula.get(i - 1)
											+ "\nWarning:" + "\n  Unused variable: " 
											+ PrettyPrinter.warningMsg.get(i - 1)
											+ "\nOutput of this formula has been stored in " + path1 + "\n");
								}
								else {
									// print the result to the console
									System.out.println("Formula: " 
											+ PrettyPrinter.infixFormula.get(i - 1) 
											+ "\nOutput of this formula has been stored in " + path1 + "\n");
								}
								
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
								
								// print the warning message
								if (PrettyPrinter.warningMsg.get(i - 1) != "") {
									System.out.println("Formula: " 
											+ PrettyPrinter.infixFormula.get(i - 1)
											+ "\nWarning:" + "\n  Unused variable: " 
											+ PrettyPrinter.warningMsg.get(i - 1)
											+ "\nOutput of this formula has been stored in " + path2 + "\n");
								}
								else {
									// print the result to the console
									System.out.println("Formula: " 
											+ PrettyPrinter.infixFormula.get(i - 1) 
											+ "\nOutput of this formula has been stored in " + path2 + "\n");
								}
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
				
				
				// if the first argument is "-v"
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
			        LogicLexer lexer = new LogicLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        LogicParser parser = new LogicParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			        
			        //System.out.println(tree.getText());
			        
			        AntlrToLogic AntlrToLogic = new AntlrToLogic(); 
			        
			        
			        // list that stores the subtree separately
			        List<Logic> logic = new ArrayList<Logic>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	logic.add(AntlrToLogic.visit(tree.getChild(i)));
					}
			       
			        // create new TypeChecker
			        TypeChecker checker = new TypeChecker();
			        
			        // Recursively accept TypeChecker
			        for (int i = 0; i < logic.size(); i++) {
			        	logic.get(i).accept(checker);
					}
			        
			        // check if error msg is empty
			        // only when it's empty, call the pretty printer
			        if (checker.errormsg.isEmpty()) {
			        	PrettyPrinter printer = new PrettyPrinter();
						
						for (int i = 0; i < logic.size(); i++) {
							logic.get(i).accept(printer);
						}
						//System.out.println(printer.z3output);
						
						
						// split the output
						String[] splitedOutput = printer.z3output.split("split\n");
						
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
					        		writeToFile = "Formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
					        		
					        		// get the model
					            	Model m = s.getModel();
					            	
					            	// create the list to store only the necessary output string
					            	List<String[]> varOutput = new ArrayList<String[]>();
					            	
					            	// split the z3 outputed model string
					            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
					            	 
					            	for (int j = 1; j < splitModel.length; j++) {
				
										String[] varValue = splitModel[j].split(" ");
										// grab the necessary output
										String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
										varOutput.add(str);
									}
					            	
					            	for (int j = 0; j < varOutput.size(); j++) {
					            		// also include the initialized variable value
					            		if (PrefixPrinter.completeVarMap.get(varOutput.get(j)[0]).b == null) {
					            			writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
						            				+ ": " + varOutput.get(j)[1] + "\n");
										}
					            		else {
					            			writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
						            				+ ": " + varOutput.get(j)[1] 
						            				+ " = " + PrefixPrinter.completeVarMap.get(varOutput.get(j)[0]).b 
						            				+ "\n");
										}
									}
					            	writeToFile = writeToFile.concat("Is not a tautology. Here is a counter example: \n");
					            	for (int j = 0; j < varOutput.size(); j++) {
					            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
					            				+ ": " + varOutput.get(j)[2] + "\n");
									}
					            } 
					            else if(result == Status.UNSATISFIABLE) { 
					            	writeToFile = "Formula: " + PrettyPrinter.infixFormula.get(i - 1)
					            				+ " is a tautology.\n";
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
									writeToFile = "Formula: " + PrettyPrinter.infixFormula.get(i - 1) + "\nWhere: \n";
					        		
					        		// get the model
					            	Model m = s.getModel();
					            	
					            	// create the list to store only the necessary output string
					            	List<String[]> varOutput = new ArrayList<String[]>();
					            	
					            	// split the z3 outputed model string
					            	String[] splitModel = m.toString().replaceAll("\n", "").split("\\(define-fun ");
					            	 
					            	for (int j = 1; j < splitModel.length; j++) {
				
										String[] varValue = splitModel[j].split(" ");
										// grab the necessary output
										String[] str = {varValue[0], varValue[2], varValue[4].replaceAll("\\)", "")};
										varOutput.add(str);
									}
					            	
					            	for (int j = 0; j < varOutput.size(); j++) {
					            		// also include the initialized variable value
					            		if (PrefixPrinter.completeVarMap.get(varOutput.get(j)[0]).b == null) {
					            			writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
						            				+ ": " + varOutput.get(j)[1] + "\n");
										}
					            		else {
					            			writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
						            				+ ": " + varOutput.get(j)[1] 
						            				+ " = " + PrefixPrinter.completeVarMap.get(varOutput.get(j)[0]).b 
						            				+ "\n");
										}
					            		
									}
					            	writeToFile = writeToFile.concat("Is not a tautology. Here is a counter example: \n");
					            	for (int j = 0; j < varOutput.size(); j++) {
					            		writeToFile = writeToFile.concat("    " + varOutput.get(j)[0] 
					            				+ ": " + varOutput.get(j)[2] + "\n");
									}
					            }  
					            else if(result == Status.UNSATISFIABLE) {
					            	writeToFile = "Formula: " + PrettyPrinter.infixFormula.get(i - 1)
		            				+ " is a tautology.\n";
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
