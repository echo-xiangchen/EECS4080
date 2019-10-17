#!/bin/bash

if [ -n "$1" ]
then
	# if the first argument is "-h", print the help message
	if [ $1 == "-h" ]
	then
		echo "-p: For pretty printing, where you could achieve an output that could be 
    recognized by z3 online tool"
		echo "-v: For verification, where you could test if the formula is a tautology. 
    If it's not a tautology, you could also get a counter example."
		echo "-r: For regression testing, where you could perform the acceptance test 
    on a series of test cases."
    # if the first argument is "-p" - pretty printing
	elif [ $1 == "-p" ]
	then
		# prompt the user if they want to update the JAR file
		read -p "Do you want to pretty print on a fresh build of the tool? [Y|N]: " input
		# if user want to update the JAR file
    	if [ $input == "Y" ] || [ $input == "Yes" ] || [ $input == "yes" ] || [ $input == "y" ]
    	then
    		# create a new JAR file
    		jar cvfm testLogic.jar ./verifier/META-INF/MANIFEST.MF -C ./verifier/bin/ .
            cp testLogic.jar verifier/regression/Regression_Test_PrettyPrinter/
            cp testLogic.jar verifier/regression/Regression_Test_Verifier/
    		echo "==================================================================="
    		echo "You have successfully updated the JAR file to the latest version!"
    		echo "==================================================================="
    		
    		# if there is an input file
    		if [ -n "$2" ]
    		then
    			echo "Now start executing the JAR file............."
    			echo "==================================================================="
    			echo "Below is the output for pretty printing for file: $2"
    			echo "==================================================================="
    			java -jar testLogic.jar $1 $2
    		# if there is no input file
    		else
    			echo "Now start executing the JAR file............."
    			echo "==================================================================="
    			echo "You did not include an input file, please start typing your input below:"
    			echo "==================================================================="
    			java -jar testLogic.jar $1
    		fi
    	# if user don't want to update the JAR file
    	else
    		echo "==================================================================="
    		echo "You choose not to updated the JAR file to the latest version."
    		echo "==================================================================="
    		# if there is an input file
    		if [ -n "$2" ]
    		then
    			echo "Now start executing the JAR file............."
    			echo "==================================================================="
    			echo "Below is the output for pretty printing for file: $2"
    			echo "==================================================================="
    			java -jar testLogic.jar $1 $2
    		# if there is no input file
    		else
    			echo "Now start executing the JAR file............."
    			echo "==================================================================="
    			echo "You did not include an input file, please start typing your input below:"
    			echo "==================================================================="
    			java -jar testLogic.jar $1
    		fi
    	fi
    # if the first argument is "-v" - verification
    elif [ $1 == "-v" ]
    then
    	# prompt the user if they want to update the JAR file
        read -p "Do you want to verify on a fresh build of the tool? [Y|N]: " input
        # if user want to update the JAR file
        if [ $input == "Y" ] || [ $input == "Yes" ] || [ $input == "yes" ] || [ $input == "y" ]
        then
            # create a new JAR file
            jar cvfm testLogic.jar ./verifier/META-INF/MANIFEST.MF -C ./verifier/bin/ .
            cp testLogic.jar verifier/regression/Regression_Test_PrettyPrinter/
            cp testLogic.jar verifier/regression/Regression_Test_Verifier/
            echo "==================================================================="
            echo "You have successfully updated the JAR file to the latest version!"
            echo "==================================================================="
            
            # if there is an input file
            if [ -n "$2" ]
            then
                echo "Now start executing the JAR file............."
                echo "==================================================================="
                echo "Below is the output for verification for file: $2"
                echo "==================================================================="
                java -jar testLogic.jar $1 $2
            # if there is no input file
            else
                echo "Now start executing the JAR file............."
                echo "==================================================================="
                echo "You did not include an input file, please start typing your input below:"
                echo "==================================================================="
                java -jar testLogic.jar $1
            fi
        # if user don't want to update the JAR file
        else
            echo "==================================================================="
            echo "You choose not to updated the JAR file to the latest version."
            echo "==================================================================="
            # if there is an input file
            if [ -n "$2" ]
            then
                echo "Now start executing the JAR file............."
                echo "==================================================================="
                echo "Below is the output for verification for file: $2"
                echo "==================================================================="
                java -jar testLogic.jar $1 $2
            # if there is no input file
            else
                echo "Now start executing the JAR file............."
                echo "==================================================================="
                echo "You did not include an input file, please start typing your input below:"
                echo "==================================================================="
                java -jar testLogic.jar $1
            fi
        fi
    # if the first argument is "-r" - regression testing
    elif [ $1 == "-r" ]
    then
    	# prompt the user if they want to update the JAR file
        read -p "Do you want to perform regression test on a fresh build of the tool? [Y|N]: " input
        # if user want to update the JAR file
        if [ $input == "Y" ] || [ $input == "Yes" ] || [ $input == "yes" ] || [ $input == "y" ]
        then
            # create a new JAR file
            jar cvfm testLogic.jar ./verifier/META-INF/MANIFEST.MF -C ./verifier/bin/ .
            cp testLogic.jar verifier/regression/Regression_Test_PrettyPrinter/
            cp testLogic.jar verifier/regression/Regression_Test_Verifier/
            echo "==================================================================="
            echo "You have successfully updated the JAR file to the latest version!"
            echo "==================================================================="
            read -p "Do you want to perform regression test of pretty printing(p) or verification(v)? [p|v]: " test
            # if user want to perform pretty printing
            if [ $test == "p" ]
            then
                cd verifier/regression/Regression_Test_PrettyPrinter/
                python3 JAVA_Test_PrerryPrinter.py
                cd ../../../
            # if user want to perform verifier
            elif [ $test == "v" ]
            then
                cd verifier/regression/Regression_Test_Verifier/
                python3 JAVA_Test_z3Verifier.py
                cd ../../../
            else
                echo "Unrecognized argument. Please indicate if you want to perform regression test of pretty printing(p) or verification(v)"
            fi
            
        # if user don't want to update the JAR file
        else
            echo "==================================================================="
            echo "You choose not to updated the JAR file to the latest version."
            echo "==================================================================="
            read -p "Do you want to perform regression test of pretty printing(p) or verification(v)? [p|v]: " test
            # if user want to perform pretty printing
            if [ $test == "p" ]
            then
                cd verifier/regression/Regression_Test_PrettyPrinter/
                python3 JAVA_Test_PrerryPrinter.py
                cd ../../../
            # if user want to perform verifier
            elif [ $test == "v" ]
            then
                cd verifier/regression/Regression_Test_Verifier/
                python3 JAVA_Test_z3Verifier.py
                cd ../../../
            else
                echo "Unrecognized argument. Please indicate if you want to perform regression test of pretty printing(p) or verification(v)"
            fi
        fi
    else
    	echo "Warning: Unrecognized argument"
    	echo
    	echo "Usage message:"
		echo "  -p: Pretty Printing"
		echo "  -v: Verification"
		echo "  -r: Regression Testing"
		echo "  -h: help"
	fi
else
	echo "Warning: Unrecognized argument"
    echo
    echo "Usage message:"
	echo "  -p: Pretty Printing"
	echo "  -v: Verification"
	echo "  -r: Regression Testing"
	echo "  -h: help"
fi







