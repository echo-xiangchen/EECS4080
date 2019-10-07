package root;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

import java.util.*;

import com.microsoft.z3.*;

import antlr.*;
import version.logic.*;
import version.logic.composite.*;
import version.logic.visitor.*;
import version.z3.Z3generator;

public class TestLogicVer {
	public static void main(String[] args) {
		try {
			// set up strings for different mode
			String printerStr = "-p";
			String verifierStr = "-v";
			
			// create file writer
			FileWriter writer;
			
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
			        
			        ANTLRInputStream input = new ANTLRInputStream(is);
			        LogicLexer lexer = new LogicLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        LogicParser parser = new LogicParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			        
			        //System.out.println(tree.getText());
			        
			        LVisitor LVisitor = new LVisitor();
			        
			        // list that stores the subtree separately
			        List<Logic> logic = new ArrayList<Logic>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	logic.add(LVisitor.visit(tree.getChild(i)));
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
							// split the input file path, only store the file name
							String[] splitedpath = args[1].split("/");
							
							// get the file name without the extension type
							// e.g. for test01.txt, only store test01
							String testNum = splitedpath[splitedpath.length - 1].split("\\.")[0];
							
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								String path1 = "./output/" + testNum + "-formula" + i + ".txt";
								
								
								File file = new File(path1);
								
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(splitedOutput[i - 1].getBytes());
								outStream.close();
							}
							System.out.println("There's no error. "
									+ "Generated files based on your input has been stored in the \"output\" directory.");
						}
						// if there is no input file
						else {
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								String path2 = "./output/" + "formula" + i + ".txt";
								
								File file = new File(path2);
								
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(splitedOutput[i - 1].getBytes());
								outStream.close();
							}
							System.out.println("There's no error. "
									+ "Generated files based on your input has been stored in the \"output\" directory.");
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
			        
			        ANTLRInputStream input = new ANTLRInputStream(is);
			        LogicLexer lexer = new LogicLexer(input);
			        CommonTokenStream tokens = new CommonTokenStream(lexer);
			        LogicParser parser = new LogicParser(tokens);
			        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			        ParseTree tree = parser.stat(); // parse
			        
			        //System.out.println(tree.getText());
			        
			        LVisitor LVisitor = new LVisitor(); 
			        
			        
			        // list that stores the subtree separately
			        List<Logic> logic = new ArrayList<Logic>();
			        
			        for (int i = 0; i < tree.getChildCount(); i++) {
			        	logic.add(LVisitor.visit(tree.getChild(i)));
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
								String path1 = "./output/" + testNum + "-verified" + i + ".txt";
								
								File file = new File(path1);
								
								// if file not exist, create the file
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								// create z3 context
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
					        		writeToFile = "This formula is not tautology.\n";
					        		
					        		// get the model
					            	Model m = s.getModel();
					            	
					            	writeToFile = writeToFile.concat(m.toString());
					            	
					            }  
					            else if(result == Status.UNSATISFIABLE) { 
					            	writeToFile = "This formula is tautology.\n";
					            }
					            else  {
					            	writeToFile = "Unknow formula.\n";
					            }
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(writeToFile.getBytes());
								outStream.close();
							}
							System.out.println("There's no error. "
									+ "Generated files based on your input has been stored in the \"output\" directory.");
						}
						// if there is no input file
						else {
							// create string
							String writeToFile = "";
							
							// write the output to the file
							for (int i = 1; i <= splitedOutput.length; i++) {
								String path2 = "./output/" + "verified" + i + ".txt";
								
								File file = new File(path2);
								
								// if file not exist, create the file
								if (!file.exists()) {
									File dir = new File(file.getParent());
									dir.mkdirs();
									file.createNewFile();
								}
								
								// create z3 context
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
					        		writeToFile = "This formula is not tautology.\n";
					        		
					        		// get the model
					            	Model m = s.getModel();
					            	
					            	writeToFile = writeToFile.concat(m.toString());
					            }  
					            else if(result == Status.UNSATISFIABLE) {
					            	writeToFile = "This formula is tautology.\n";
					            }
					            else { 
					            	writeToFile = "Unknow formula.\n";
					            }
								
								FileOutputStream outStream = new FileOutputStream(file);
								outStream.write(writeToFile.getBytes());
								outStream.close();
							}
							System.out.println("There's no error. "
									+ "Generated files based on your input has been stored in the \"output\" directory.");
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
