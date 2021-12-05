Preconditions:
1. Make sure antlr is successfully and properly installed.
2. Python is installed.
3. Python runtime is installed.

To generate Parser and Lexer files:
1. make sure the g4 file is peroperly defined.
2. go to the directory of the g4 file and execute the following commands:
	antlr4 -Dlanguage=<python version> <g4 file>
	antlr4 -Dlanguage=Python3 CRPPL.g4
3. Parser, Lexer and Listener files are generated

To run the main tokenizer:
1. run the main python file (main.py) with the crppl program (test.crppl)
	python main.py test.crppl