## Due: August 12
---
1. Read more on Antlr book    
    Exercises:     
        a. Implement operations on the small expression language    
            - Pretty Print (infix and postfix    
            - Type Check     

2. Try Proposition theorems in Z3    
    - See the Gries-Theorems.pdf under resources    
    - If time permitted, also see how you can encode the predicate theorems in Z3.    
    - Resource: https://rise4fun.com/z3/tutorial

3. Develop a simple Java program which:    
    - Takes as input a text file in SMT-Lib format (functional style)    
    - Output to the console: Outputs from Z3 verbatim (e.g., unsat vs. sat with witnesses)    
    - Explore if there are different output options of Z3 (e.g., format, witnesses)    
        note. Your compiler later will transform these outputs to more user-friendly format      

4. Find papers on "automated predicate solver" in the context of "computing education"    
    - Research Question: How can the automated logic verifier you build facilitate the learning of students (e.g., 1090, 3311)?    
    - Potential keywords:    
        - Computing/Engineering Education    
        - Teaching of formal/proposition/predicate/set-theoretic Logic    
        - Tool support for teaching of logic    
        - Challenges of teaching formal logic    
    - Look specifically in: ACM, IEEE, and Springer. e.g., ACM SIGCSE    
    - Put papers under 'papers'    

5. Write up (in bullet points, and possibly a diagram) about why p is negated in order to use the SMT solver 
to prove that p is a tautology.    


## Due: August 26
---
1. Continue to find the papers on "automated predicate solver" in the context of "computing education"    
2. Finish different version of propositional logic program:    
    - Visitor version    
    - Embedded action version    
3. Check to see the result of "get-model" method of Z3.    
    - e.g. if it will only work on functions but not boolean formulas
4. Check to see of there is another way to define the precedence in Antlr.    


## Due: September 6
---

1. [DONE] multiple var declarations, interleaved with multiple formulas
2. [DONE] When there are type errors, list them all at once. Rather than stopping at the first encountered error.
3. [DONE] support comments (using --)    
4. [DONE] Start drawing the diagram showing all the Java classes involved (Antlr + your own).       
5. [DONE] Start a new tex document describing the new design. 
6. [DONE] Convert this to-do.txt to README.md

## Due: September 13

0. Find some papers!

1. Support two options for verifier: -p outFile for pretty printing and -v for verification. Pretty printing should happen for both -p and -v (i.e., even in the case of -v, you can simply pass the pretty-printed string to Z3). 
2. Set up regression tests for both versions the pretty printer of verifier: sample.txt specifis the predicates/propositions, sample.actual.txt specifies the pretty printing output, sample.expected.txt specifies the expected output. In case there's no error, both actual and expected resutls should be loadable to: https://rise4fun.com/z3/tutorial

For Jackie to test: When you turn the AST to Z3 encoding, the user should not have to add parentheses if they don't change the meaning of the formula. E.g., user may write p or q => r = p => (q => r)   

For each sample.txt write a header comment summarizing what the test is supposed to do.

3. In the README file of propLogic, write down how your program can be used.    

4. support also integer variables (integer literal tokens), and also arithmetic operations (+, -, *, /) 

5. for integer or boolean variable, you can either leave it unspecified, or bound to a constant or expression.        


6. Document the resolution: Keep the visitor<BoolExpr> example in 'struggle' (also include the Z3 classes hierarchy diagram you drew). Try to writeup a small paragraph explaining where exactly this fails to work (show a screenshot of the debugger emphasizing how difficult it is to debug). We will use this later to justify why need to go for our own hierarchy of Z3 type classes.