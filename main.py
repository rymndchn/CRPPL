import sys
from antlr4 import *
from CRPPLLexer import CRPPLLexer
from CRPPLParser import CRPPLParser
from myCRPPLListener import myCRPPLListener
from antlr4.tree.Tree import TerminalNodeImpl

import pandas as pd

token = CRPPLParser.symbolicNames

def main (argv):
    input = FileStream(argv[1])
    lexer = CRPPLLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CRPPLParser(stream)
    tree = parser.multiexpr()
    output = open("output.py","w")

    data = {'Name': ['Tom', 'Joseph', 'Krish', 'John'], 'Age': [20, 21, 19, 18]}
    df = pd.DataFrame(data)

    col = 'additionalcol1'
    col1 = 'additionalcol2'
    
    myCRPPL = myCRPPLListener(output)
    walker = ParseTreeWalker()
    walker.walk(myCRPPL, tree)
    #traverse(tree, parser.ruleNames)
        
    output.close()      

    program = open("output.py","r")

    program_store = program.read()

    output.close()

    exec(program_store)

    print(df)

def traverse(tree, rule_names, indent = 0):
    if tree.getText() == "<EOF>":
        return
    elif isinstance(tree, TerminalNodeImpl):
        #print("{0}TOKEN='{1}'".format("  " * indent, token[tree.getSymbol().type]))
        #print("{0}LEXEME='{1}'".format("  " * indent, tree.getText()))
        #print("{",token[tree.getSymbol().type],", \"",tree.getText(),"\"}")
        print("   " * indent, "+--", token[tree.getSymbol().type], "-", tree.getText())
    else:
        #print("{0}{1}".format("  " * indent, rule_names[tree.getRuleIndex()]))
        print("   " * indent, "+--", "RULE NAME: ", rule_names[tree.getRuleIndex()])
        for child in tree.children:
            traverse(child, rule_names, indent + 1)

if __name__ == '__main__':
    main(sys.argv)