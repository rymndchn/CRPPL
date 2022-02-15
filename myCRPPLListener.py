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
        if ctx.GET() is not None:
            # get position of GET
            get_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.GET().getSymbol())).group(2))

            # get position of ON
            on_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.ON().getSymbol())).group(2))

            # get length of SEPARATOR
            sep_count = len(ctx.SEPARATOR())

            # get length of IDENTIFIER
            ident_count = len(ctx.IDENTIFIER())

            # pointer for identifier
            i = 0

            # list for columns
            cols = []

            # table name
            tbl = ''

            # declare tmp_col for query
            tmp_col = ''

            # check if there OPERATING FUNCTIONS
            if ctx.OPERATING_FUNCTION() is None:
                #check if there is FOR
                if ctx.FOR() is None:
                    # put the columns into the list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < on_pos:
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        i += 1
                    # if there is group by on simple select statement, return error
                    if len(ctx.GROUPBY()) != 0:
                        print('Error! Invalid group_by statement!')
                    if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos:
                        tbl = ctx.IDENTIFIER()[i].getText()
                        i +=1

                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        # assemble the command to do simple query
                        command = 'print(' + tbl + '[[' + tmp_col[0:-1] + ']])'
                        self.output.write(command + '\n')
                    else: 
                        print('Error!')
        else:
            print('Error!')

    def exitGeneralquery(self, ctx:CRPPLParser.GraphqueryContext):
        pass

    def enterAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):

        if ctx.NEWCOLUMN() is not None:
            colname = ctx.IDENTIFIER()[0].getText()
            tblname = ctx.IDENTIFIER()[1].getText()

            #declare command
            command = tblname + '["' + colname + '"] = np.nan'
            self.output.write(command + '\n')

        elif ctx.DELETECOLUMN() is not None:
            colname = ctx.IDENTIFIER()[0].getText()
            tblname = ctx.IDENTIFIER()[1].getText()

            #declare command
            command = 'del ' + tblname + '["' + colname + '"]'
            self.output.write(command + '\n')
        else:
            print('Error!')

    def exitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass

    def enterChangevalue(self, ctx:CRPPLParser.ChangevalueContext):
        #get how many identifiers and literals there are
        ctr_literal = len(ctx.LITERAL())
        ctr_identifier = len(ctx.IDENTIFIER())

        #get the literal values and their positions
        literal_collection  = []

        i = 0

        while i < ctr_literal:
            individual_literal = []
            individual_literal.append(int(re.search('(\[@)(\d+)(,.*)',str(ctx.LITERAL()[i].getSymbol())).group(2)))
            individual_literal.append(ctx.LITERAL()[i].getText())
            individual_literal.append('literal')
            literal_collection.append(individual_literal)
            i += 1

        #get the identifier values and their positions
        identifier_collection = []

        i = 0

        while i < ctr_identifier:
            individual_identifier = []
            individual_identifier.append(int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)))
            individual_identifier.append(ctx.IDENTIFIER()[i].getText())
            identifier_collection.append(individual_identifier)
            i += 1

        #combine the literals and identifiers into one collection
        collective = []
        collective = literal_collection + identifier_collection

        #sort the values in collective
        collective.sort()

        #generate command
        command = collective[4][1] + '.loc[' + collective[4][1] + '.' + collective[2][1] + '==' + collective[3][1] + ',"' + collective[0][1] + '"]=' + collective[1][1]
        self.output.write(command + '\n')

    def exitChangevalue(self, ctx:CRPPLParser.ChangevalueContext):
        pass

    def enterCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        
        indentifier_count = len(ctx.IDENTIFIER())
        return_val = None

        if ctx.CREATEFUNCTION() is not None:
            self.output.write('def ')
            
            #constructing function header.
            if(ctx.IDENTIFIER()[0] != None):
                self.output.write(ctx.IDENTIFIER()[0].getText())
                self.output.write(ctx.OPENPARENTHESIS().getText())
            else:
                pass

            #handling parameters.
            for i in range(1,indentifier_count):
                self.output.write(ctx.IDENTIFIER()[i].getText())

                if(len(ctx.SEPARATOR()) < i):
                    break

                #multiple parameters.
                if(ctx.SEPARATOR() != None and i <= len(ctx.SEPARATOR())):
                    self.output.write(ctx.SEPARATOR()[i-1].getText() + ' ')

            self.output.write(ctx.CLOSEPARENTHESIS().getText() + ':\n')

            if ctx.RETURN() is not None:
                self.output.write('\t' + ctx.RETURN().getText() + ' ')

                self.output.write(ctx.IDENTIFIER()[indentifier_count-1].getText())
                
                #self.output.write(ctx.functioncall().getText())

            else:
                self.output.write('\tpass')

            self.output.write('\n')

            #end the function.
            if ctx.ENDFUNCTION() is not None:
                self.output.write('\n')


        else:
            print('Error!')

    def exitCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        pass