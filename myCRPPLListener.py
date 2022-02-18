import sys
from antlr4 import *
from CRPPLParser import CRPPLParser
from CRPPLListener import CRPPLListener
import re

class myCRPPLListener(CRPPLListener) :

    def __init__(self, output):

        self.output = output
        self.output.write('import numpy as np\n')

        self.tab_ctr=0
        self.elif_ctr={0:0,1:0}
        self.else_ctr={0:0,1:0}
        self.if_nest_ctr=0

        self.inside_if=False
        self.boolean_nest_ctr=0
        self.inside_parenthesis=[]

    # Enter a parse tree produced by CRPPLParser#validexpr.
    def enterValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        for i in range(0,self.if_nest_ctr):
            self.output.write("\t")
            
            

    # Exit a parse tree produced by CRPPLParser#validexpr.
    def exitValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        
        if ( (self.if_nest_ctr in self.else_ctr ) and self.elif_ctr[self.if_nest_ctr]==0):
            if(self.else_ctr[self.if_nest_ctr]>0):
                for i in range(0,self.if_nest_ctr-1):
                    self.output.write("\t")
                self.output.write("else:\n")
                self.else_ctr[self.if_nest_ctr]-=1

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

            # pointer for literal
            l = 0

            # list for columns
            cols = []

            # table name
            tbl = ''

            # declare tmp_cond for query
            tmp_cond1 = ''
            tmp_cond2 = ''

            # list for conditions
            cond = []

            # declare tmp_col for query
            tmp_col = ''

            # check if there OPERATING FUNCTIONS
            if len(ctx.OPERATING_FUNCTION()) == 0:
                #check if there is FOR
                if ctx.FOR() is None:
                    # put the columns into the list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < on_pos:
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        i += 1
                    # if there is group by on simple select statement, return error
                    if ctx.GROUPBY() is not None:
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
                elif ctx.FOR() is not None:
                    # get the position of FOR
                    for_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.FOR().getSymbol())).group(2))
                    # put the columns of the GET into list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < for_pos:
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        i += 1

                    # see how many conditions there are, if 1 then simple, if more than 1 then complicated
                    cond_count = len(ctx.OPERATOR())
                    if cond_count == 1:
                        # get OPERATOR position
                        cond_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.OPERATOR()[0].getSymbol())).group(2))
                        # get the left side of the operator
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < cond_pos:
                            tmp_cond1 = tmp_cond1 + ctx.IDENTIFIER()[i].getText()
                            i += 1
                            print(i)

                        # get the operator
                        o = ctx.OPERATOR()[0].getText().upper()

                        if o == 'EQUAL':
                            tmp_cond2 = tmp_cond2 + '=='
                        elif o == 'GT':
                            tmp_cond2 = tmp_cond2 + '>'
                        elif o == 'GTE':
                            tmp_cond2 = tmp_cond2 + '>='
                        elif o == 'LT':
                            tmp_cond2 = tmp_cond2 + '<'
                        elif o == 'LTE':
                            tmp_cond2 = tmp_cond2 + '<='
                        elif o == 'NOT_EQUAL':
                            tmp_cond2 = tmp_cond2 + '!='
                        else:
                            print('Error! Invalid operator for general query filter!' + o)

                        # get the right side of the operator
                        if on_pos > int(re.search('(\[@)(\d+)(,.*)',str(ctx.LITERAL()[l].getSymbol())).group(2)) > cond_pos:
                            tmp_cond2 = tmp_cond2 + ctx.LITERAL()[l].getText()[1:-1]

                        # if there is group by on simple select statement, return error
                        if ctx.GROUPBY() is not None:
                            print('Error! Invalid group_by statement!')
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos:
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1
                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        command = 'tmp_result = ' + tbl + '[' + tbl + '["' + tmp_cond1 + '"]' + tmp_cond2 + ']' + '\nprint(tmp_result' + '[[' + tmp_col[0:-1] + ']])'

                        self.output.write(command + '\n')

                else:
                    print('Coming soon!')


        else:
            print('Error!')
        #print('General query coming soon!')
        self.output.write('print(\'General query coming soon!\')\n')

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

            create_pos = self.findPosition(str(ctx.CREATEFUNCTION().getSymbol()))
            end_pos = self.findPosition(str(ctx.ENDFUNCTION().getSymbol()))
            
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

            #handles if function is empty.
            if((end_pos-create_pos) == 1):
                self.output.write('pass\n')

            if(len(ctx.generalquery()) != 0):
                self.output.write('\t')
        else:
            print('Error!')

    def exitCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        if ctx.RETURN() is not None:
            indentifier_count = len(ctx.IDENTIFIER())

            self.output.write('\t' + ctx.RETURN().getText() + ' ')

            ret_pos = self.findPosition(str(ctx.RETURN().getSymbol()))
            ret_id_pos = self.findPosition(str(ctx.IDENTIFIER()[indentifier_count-1].getSymbol()))
                
            #last identifier is after the return statement.
            if(ret_id_pos > ret_pos):
                self.output.write(ctx.IDENTIFIER()[indentifier_count-1].getText() + '\n')
        else:
            pass

        #end the function.
        if ctx.ENDFUNCTION() is not None:
            self.output.write('\n')
        else:
            pass

    def enterConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):

            if ctx.IF() is not None:
                self.output.write("if ")
                self.inside_if=True
                self.if_nest_ctr+=1
                if ctx.ELSE_IF is not None:
                    self.elif_ctr[self.if_nest_ctr]=len(ctx.ELSE_IF())
            if ctx.ELSE() is not None:
                self.else_ctr[self.if_nest_ctr]=1

    def exitConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):
        self.output.write('\n#end if\n')
        self.if_nest_ctr-=1


    # Enter a parse tree produced by CRPPLParser#booleanstatement.
    def enterBooleanstatement(self, ctx:CRPPLParser.BooleanstatementContext):

        if ctx.OPENPARENTHESIS() is not None:
            parenthesis_text=str(ctx.OPENPARENTHESIS().getText())
            parenthesis_pos = self.findPosition(str(ctx.OPENPARENTHESIS().getSymbol())) 
            self.inside_parenthesis.append([parenthesis_text,parenthesis_pos])
            if ctx.IDENTIFIER() is not None:
                for i in ctx.IDENTIFIER():
                    identifier_text=str(i.getText())
                    indentifier_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([identifier_text,indentifier_pos])
            if ctx.LITERAL() is not None:
                for i in ctx.LITERAL():
                    literal_text=str(i.getText())
                    literal_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([literal_text,literal_pos])     
            if ctx.NEGATOR() is not None:
                for i in ctx.NEGATOR():
                    operator_text="not"
                    operator_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([operator_text,operator_pos]) 
            if ctx.TRUE() is not None:
                  for i in ctx.TRUE():
                    operator_text="True"
                    operator_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([operator_text,operator_pos]) 
            if ctx.FALSE() is not None:
                  for i in ctx.FALSE():
                    operator_text="False"
                    operator_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([operator_text,operator_pos]) 
            if ctx.BOOLEAN_CONNECTOR() is not None:
                for i in ctx.BOOLEAN_CONNECTOR():
                    operator_text="and"
                    operator_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([operator_text,operator_pos]) 
            if ctx.OPERATOR() is not None:
                for i in ctx.OPERATOR():
                    operator_text=str(i.getText()).lower()
                    switcher = {
                        "equal": "==",
                        "gt": ">",
                        "lt": "<",
                        "gte": ">=",
                        "lte": ">=",
                        "not_equal":"!=",
                        "xor":"^"
                    }
                    if operator_text in switcher:
                        operator_text=switcher[operator_text]
                    operator_pos = self.findPosition(str(i.getSymbol()))
                    self.inside_parenthesis.append([operator_text,operator_pos])    
            
            if(self.elif_ctr[self.if_nest_ctr]>0 and self.inside_if==False):
                for i in range(0,self.if_nest_ctr-1):
                    self.output.write("\t")
                self.output.write("elif ")
                
                self.inside_if=True
                self.elif_ctr[self.if_nest_ctr]-=1
            self.boolean_nest_ctr+=1
            



    # Exit a parse tree produced by CRPPLParser#booleanstatement.
    def exitBooleanstatement(self, ctx:CRPPLParser.BooleanstatementContext):

        if ctx.CLOSEPARENTHESIS() is not None:

            parenthesis_text=str(ctx.CLOSEPARENTHESIS().getText())
            parenthesis_pos = self.findPosition(str(ctx.CLOSEPARENTHESIS().getSymbol()))
            self.inside_parenthesis.append([parenthesis_text,parenthesis_pos])
            
        #     self.output.write(')')
            self.boolean_nest_ctr-=1
            if self.boolean_nest_ctr==0:
                self.inside_parenthesis.sort(key=lambda x:x[1])
                for i in self.inside_parenthesis:
                    self.output.write(i[0]+" ")
                self.inside_parenthesis=[]
                self.output.write(":\n")
                self.inside_if=False

    def findPosition(self, pos_string):
        split_string = pos_string.split(",")
        ret_string = split_string[0]
        ret_string = ret_string[2:]
        ret_val = int(ret_string)
        return ret_val
