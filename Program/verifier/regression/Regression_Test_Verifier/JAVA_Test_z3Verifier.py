#!/usr/bin/env python3

import JAVA_Test_Parameters as par
import os
import sys
from filecmp import cmp
from shutil import copyfile, rmtree
from itertools import zip_longest
from fnmatch import fnmatch

def expected(file, from_path, to_path):
	""" 
	Produces expected.txt for use in compare. 
	
	file -- if is_expected is False, used to generate expected.txt
	from_path -- if is_expected is True, expected.txt is copied from_path
	to_path -- expected.txt is always copied to_path
		
	""" 
	if par.is_expected:
		copyfile(from_path, to_path )
		print ("File " + from_path + " is copied to " + to_path + ".")
	else:
		oracle = os.path.normpath(par.oracle)
		os.system("java -jar " + oracle + " -v " + file + " > "+ to_path)
		print ("Output produced by " + oracle + " wrote to "+ to_path + ".")
		
def actual(file, to_path):
	""" 
	Produces actual.txt for use in compare. 
	
	file -- used to generate actual.txt
	to_path -- actual.txt is always copied to_path
		
	""" 
	output = "Running acceptance test from file " + file + "."
	print(('=' * len(output)))
	print(output)
	print(os.path.abspath(file))
	exec = os.path.normpath(par.executable)
	os.system("java -jar " + exec + " -v " + file + " >" + to_path)
	print("Output produced by " + exec + " wrote to "+ to_path + ".")
	
def compare(act, exp):
	"""
	Compares act and exp and checks for differences.
	If is_tolerant_on_white_spaces is enabled, program will ignore extra
	spaces and lines. Otherwise it will compare char for char.
	
	act -- output from user program
	exp -- file used in comparison
	"""
	if par.is_tolerant_on_white_spaces:
		a = filter(lambda x: x.strip(), open(act))
		e = filter(lambda x: x.strip(), open(exp))
		return all(line[0].split() == line[1].split() for line in zip_longest(a, e, fillvalue=""))
	else:
		return cmp(act, exp)	
	
def build_list(acceptance_tests, warnings):
	"""
	Builds a list of all tests to be used in regression testing.
	If expand_directories is enabled, will recursively expand all folders.
	
	acceptance_tests -- a list of all tests and directories
	warnings -- any warnings produced during testing
	
	return -- a list of all tests to be run by regression testing.
	"""
	list = []
	for fd in acceptance_tests:
		if os.path.isdir(fd):
			list.extend(build_list(sorted([x.path for x in os.scandir(fd)]), warnings))
		else:
			file = os.path.basename(fd)
			if not fnmatch(file, "*.expected.txt") and fnmatch(file, "*.txt"):
				if not os.path.isfile(fd):
					warnings.append("Warning: File " + fd + " is listed but can not be found")
				else:
					list.append(fd)
	return list
	
def remove_duplicates(old, warnings):
	"""
	Removes all duplicate tests from the list
	
	old -- the list of tests
	warnings -- any warnings produced during testing
	
	return -- a list without duplicates
	"""
	new = []
	for file in old:
		if file in new:
			warnings.append("Warning: File " + file + " already in list")
		else:
			new.append(file)
	return new
				
def find_tests(list, warnings):
	"""
	Parses the information passed from list to be tested
	
	list -- the list that needs to be parsed
	warnings -- any warnings produced during testing
	
	return -- for each test, the file and paths needed to build test files 
	"""
	tests = []
	for file in list:
		file = os.path.normpath(file)
		dir = os.path.dirname(file)
		fn = os.path.basename(file).split('.')[0]
		exp = fn + ".expected.txt"
		act = fn + ".actual.txt"
		path = os.path.relpath(dir, start=par.root)
		path = path.replace("../","").replace("~/","").replace("./","")
		path = os.path.join(os.path.normpath("log"), path)
		if os.path.exists(path):
			rmtree(path)
		os.makedirs(path)
		to_exp = os.path.join(path, exp)
		to_act = os.path.join(path, act)
		from_exp = os.path.join(dir, exp)
		if par.is_expected and not os.path.isfile(from_exp):
			warnings.append("Warning: File " + file + " is listed but "+ from_exp + " can not be found")
		else:
			tests.append({"file": os.path.relpath(file), "from": from_exp, "exp": to_exp, "act": to_act})
	return tests
		
def run_tests(tests):
	"""
	Runs the regression tests.
	
	tests -- a list of all tests to be run and the necessary paths
	
	returns -- results of the tests
	"""
	results = []
	for test in tests: 
		expected(test["file"], test["from"], test["exp"])
	for test in tests: 
		actual(test["file"], test["act"])
	for test in tests:
		if compare(test["act"], test["exp"]):
			if not par.print_only_errors:
				results.append("Success: " + test["act"] + " and " + test["exp"] + " are identical.")
		else:
			if par.format_for_diff:
				results.append(" ".join([par.format_for_diff.strip(), test["act"], test["exp"], "&"]))
			else:
				results.append("Error: " + test["act"] + " and " + test["exp"] + " do not match.")
	return results

def print_results(results, num_tests):
	"""
	Prints the results of regression tests.
	
	results -- a list of all testing results
	"""
	if par.format_for_diff:
		failed = sum([item.split(" ")[0] == par.format_for_diff.split(" ")[0] for item in results])
	else:
		failed = sum([item.split(":")[0] == "Error" for item in results])
	output = "Test Results: " + str(num_tests - failed) + "/" + str(num_tests) + " passed."
	line = ('=' * len(output))
	print(line)
	print(output)
	print(line)
	print(*results, sep = '\n') if results else print("All tests pass!!!")
	print(line)
	print(output)
	print(line)
	
def print_warnings(warnings):
	"""
	Prints any warnings generated by prior tests.
	
	warnings - a list of warnings to print
	"""
	if warnings:
		print(*warnings, sep = '\n')
		if not par.ignore_warnings:
			print("System exit: to proceed fix warnings or enabled ignore_warnings in ETF_Test_Parameters.py")
			sys.exit(1)
	
def main():

	warnings = []
	list = build_list([os.path.join(par.root, fd) for fd in par.acceptance_tests], warnings)
	list = remove_duplicates(list, warnings)
	tests = find_tests(list, warnings)
	print_warnings(warnings)
	results = run_tests(tests)
	print_results(results, len(tests))
	
if __name__ == "__main__" : 
	main()

