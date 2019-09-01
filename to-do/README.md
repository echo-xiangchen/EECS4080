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
0. In the README file of propLogic, write down how your program can be used.    
1. multiple var declarations, interleaved with multiple formulas    
    When there are type errors, list them all at once. Rather than stopping at the first encountered error.
