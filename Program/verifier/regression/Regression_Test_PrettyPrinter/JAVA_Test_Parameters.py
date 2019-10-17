#!/usr/bin/env python3

# Specify the directory (relative or absolute) where the acceptance test 
# files are. If nothing is added, current directory is used.
# WARNING: While absolute paths are suported, the oracle may not play nicely
# with them.
root = "./"

# Specify files or directories (relative to root) of the acceptance tests. 
# NOTE: Tests can not be named test.expected.txt 
# NOTE: To run all tests in root directory, uses [""] as the test.
# WARNING: Does not support partial file names with wildcards ie at*.txt
acceptance_tests = ["acceptance"]

# acceptance_tests = ["acceptance-tests/at00.txt"
#                     ,"acceptance-tests/at01.txt"]

# Should regression testing continue on warnings? If this is set to False,
# regression testing will exit.
ignore_warnings = True

# Should the regression testing proceed with a list of expected files, or the 
# oracle?	
# When this flag is set True, the the value of 'oracle' is ignored. 
is_expected = False

# Specify where you put the oracle.
oracle = "./TestLogicVer.jar"

# Specify the path of the executable built from your project.
executable = "./TestLogicVer.jar"
# The above is an OSX executable
# Linux executable for students shaler be called: oracle.exe

# Should the program only print tests that do not pass
print_only_errors = True

# Should the program format the output so it could easily be diffed:
# examples include "meld", "diff -y", etc.
# If left blank will format output in a generic way
format_for_diff = "meld"

# Set true if you want the comparison to be tolerant on white spaces and empty 
# lines.
# WARNING: While every attempt has been made to make the output return the same
# result as the grading script, there are no guarantees. It is strongly advised
# that you submit a program that passes with the flag set to False.
is_tolerant_on_white_spaces = False
