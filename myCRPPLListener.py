import sys
from antlr4 import *
from CRPPLParser import CRPPLParser
from CRPPLListener import CRPPLListener
import re

class myCRPPLListener(CRPPLListener) :

    def __init__(self, output):

        self.output = output
        self.output.write('import numpy as np\n')

    def enterGeneralquery(self, ctx:CRPPLParser.GraphqueryContext):
        print('General query coming soon!')

    def exitGeneralquery(self, ctx:CRPPLParser.GraphqueryContext):
        pass

    def enterAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):

        if ctx.NEWCOLUMN() is not None:

            if (type(ctx.LITERAL())) == list and len(ctx.LITERAL()) == 2: #literal + literal
                colname = ctx.LITERAL()[0].getText()
                tblname = ctx.LITERAL()[1].getText()

                #clean up col & tbl name
                colname = colname[1:-1]
                tblname = tblname[1:-1]

                #declare command
                command = tblname + '["' + colname + '"] = np.nan'
                self.output.write(command + '\n')

            elif(type(ctx.IDENTIFIER())) == list and len(ctx.IDENTIFIER()) == 2: #identifier + identifier
                colname = ctx.IDENTIFIER()[0].getText()
                tblname = ctx.IDENTIFIER()[1].getText()

                #declare command
                command = 'exec(' + tblname + '+' + '\'["\'' + '+' + colname + '+' + '\'"] = np.nan\'' + ')'
                self.output.write(command + '\n')

            else:
            #    print(len(ctx.LITERAL()))
                tmp_var1 = str(ctx.LITERAL()[0].getSymbol())
                tmp_var2 = str(ctx.IDENTIFIER()[0].getSymbol())

                #get the position of literal and identifier
                literal_pos = int(re.search('(\[@)(\d+)(,.*)', tmp_var1).group(2))
                identifier_pos = int(re.search('(\[@)(\d+)(,.*)', tmp_var2).group(2))

                #check if literal comes first or identifier
                if literal_pos > identifier_pos: #identifier + literal
                    colname = ctx.IDENTIFIER()[0].getText()
                    tblname = ctx.LITERAL()[0].getText()

                    #clean up col & tbl name
                    tblname = tblname[1:-1]

                    #declare command
                    command = tblname + '[' + colname + '] = np.nan'
                    self.output.write(command + '\n')
                elif literal_pos < identifier_pos: #literal + identifier
                    colname = ctx.LITERAL()[0].getText()
                    tblname = ctx.IDENTIFIER()[0].getText()

                    #clean up col & tbl name
                    colname = colname[1:-1]

                    #declare command
                    command = 'exec(' + tblname + '+' + '\'["'+ colname + '"] = np.nan\'' + ')'
                    self.output.write(command + '\n')


        elif ctx.DELETECOLUMN() is not None:
            #do something
            print('Delete column coming soon!')
        else:
            print('Error!')

    def exitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass