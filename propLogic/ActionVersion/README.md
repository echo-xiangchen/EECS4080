# The embedded action vertion of my program

`ActionLogic.g4` Grammer with embedded actions


How to run the program:
  1. Add the Antlr and z3 library path to the environment variable CLASS_PATH as well as the java library path.
  
  2. Set up the alias:
    `alias antlr4='java -jar /your/Antlr/library/path'` and 
    `alias grun='java org.antlr.v4.gui.TestRig'`
    
       My antlr4 looks like this:
         `alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'`
    
  3. compile the grammar file:
    `antlr4 ActionLogic.g4`
    
  4. Compile the generated java files:
    `javac ActionLogic*.java`
  
  5. Use the sample file sample.txt to test the program:
    `grun ActionLogic stat sample.txt`
