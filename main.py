import sys
import os
from antlr4 import *
from CRPPLLexer import CRPPLLexer
from CRPPLParser import CRPPLParser
from myCRPPLListener import myCRPPLListener

import pandas as pd

pd.set_option('display.float_format', lambda x: '%.3f' % x)

def main (argv):

    report_folder_path = os.getcwd() + "\\Report"

    if not os.path.exists(report_folder_path):
        os.makedirs(report_folder_path)  # Create Report folder at current directory

    file_input = FileStream(argv[1])
    lexer = CRPPLLexer(file_input)
    stream = CommonTokenStream(lexer)
    parser = CRPPLParser(stream)
    tree = parser.multiexpr()
    output = open("output.py","w")

    data = {'Name': ['Tom', 'Joseph', 'Krish', 'John', 'Tom'], 'Age': [20, 21, 19, 18, 13]}
    df = pd.DataFrame(data)

    col = 'additionalcol1'
    col1 = 'additionalcol2'
    
    myCRPPL = myCRPPLListener(output)
    walker = ParseTreeWalker()
    walker.walk(myCRPPL, tree)
        
    output.close()      

    program = open("output.py","r")

    program_store = program.read()

    output.close()

    exec(program_store)
    
if __name__ == '__main__':
    main(sys.argv)