from antlr4 import *
from antlr4.tree.Tree import TerminalNodeImpl
import sys
from CRPPLLexer import CRPPLLexer
from CRPPLParser import CRPPLParser
from antlr4.error.ErrorListener import ErrorListener

class MyErrorListener( ErrorListener ):

    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise Exception("Oh no!!")

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        raise Exception("Oh no!!")

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        raise Exception("Oh no!!")

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        raise Exception("Oh no!!")

def main(argv):
	input = FileStream(argv[1])
	lexer = CRPPLLexer(input)
	stream = CommonTokenStream(lexer)
	parser = CRPPLParser(stream)
	tree = parser.multiexpr()
	traverse(tree, parser.ruleNames)
	parser.addErrorListener( MyErrorListener() )

def traverse(tree, rule_names, indent = 0):
    if tree.getText() == "<EOF>":
        return
    elif isinstance(tree, TerminalNodeImpl):
        print("{0}TOKEN='{1}'".format("  " * indent, tree.getText()))
    else:
        print("{0}{1}".format("  " * indent, rule_names[tree.getRuleIndex()]))
        for child in tree.children:
            traverse(child, rule_names, indent + 1)

if __name__ == "__main__":
	main(sys.argv)
    