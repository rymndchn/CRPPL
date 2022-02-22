import sys
from antlr4 import *
from CRPPLParser import CRPPLParser
from CRPPLListener import CRPPLListener
import re
import shutil

class myCRPPLListener(CRPPLListener) :

    def __init__(self, output):

        self.output = output
        self.output.write('import numpy as np\n')
        self.output.write('import matplotlib.pyplot as plt\n')
        self.output.write('import shutil\n')
        self.output.write('import pandas as pd\n')
        
        self.tab_count = 0
        self.const_dict = dict()

        self.elif_ctr={0:0,1:0}
        self.else_ctr={0:0,1:0}
        self.if_nest_ctr=0

        self.inside_if=False
        self.boolean_nest_ctr=0
        self.inside_parenthesis=[]

        self.inside_assigning_query=False
        self.identifier_name=""
        self.inside_grouping=False
        self.has_single_operating_function = False

        self.output.write('\n')

    # Enter a parse tree produced by CRPPLParser#validexpr.
    def enterValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        pass
        #for i in range(0,self.if_nest_ctr):
        #    self.output.write("\t")
            
    # Exit a parse tree produced by CRPPLParser#validexpr.
    def exitValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        pass
        

    # Enter a parse tree produced by CRPPLParser#importfile.
    def enterImportfile(self, ctx:CRPPLParser.ImportfileContext):
        self.tabChecking()
        if len(ctx.IDENTIFIER()) > 1:
            sourceDir = self.const_dict.get(ctx.IDENTIFIER()[0].getText())[1:-1]

            if len(ctx.LITERAL()) < 1 and len(ctx.IDENTIFIER()[1].getText()) > 0:
                targetDir = self.const_dict.get(ctx.IDENTIFIER()[1].getText())[1:-1]
            else:
                targetDir = ctx.LITERAL()[0].getText()[1:-1] 

        elif len(ctx.LITERAL()) > 0:
            sourceDir = ctx.LITERAL()[0].getText()[1:-1]

            if len(ctx.IDENTIFIER()) > 1 and len(ctx.IDENTIFIER()[0].getText()) > 0:
                targetDir = self.const_dict.get(ctx.IDENTIFIER()[0].getText())[1:-1]
            else:
                targetDir = ctx.LITERAL()[1].getText()[1:-1]
            
        self.output.write('source = r\''+sourceDir+'\'\n')
        self.tabChecking()
        self.output.write('target = r\''+targetDir+'\'\n')
        self.tabChecking()
        self.output.write('shutil.copyfile(source,target)'+ '\n')

        #print (ctx.IDENTIFIER()[len(ctx.IDENTIFIER())-1].getText())
        #alias = ctx.IDENTIFIER()[len(ctx.IDENTIFIER())-1].getText()
        loadCsv = 'pd.read_csv(\''+targetDir+'\')\n'
        self.tabChecking()
        self.output.write(ctx.IDENTIFIER()[len(ctx.IDENTIFIER())-1].getText()+ ' = '+loadCsv)
        #print (ctx.IDENTIFIER()[len(ctx.IDENTIFIER())-1].getText()+ ' = '+loadCsv)
        #self.output.write(ctx.IDENTIFIER()[len(ctx.IDENTIFIER())-1].getText()+ ' = \''+targetDir+'\'\n')
        pass

    # Exit a parse tree produced by CRPPLParser#importfile.
    def exitImportfile(self, ctx:CRPPLParser.ImportfileContext):
        self.output.write('\n')
        self.endOfTheLineChecking()
        pass

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

            # pointer for operating_functions
            p = 0

            # list for columns
            cols = []

            # list for group by columns
            gb_cols = []

            # list for group by columns
            tmp_gb_cols = ''

            # list for agg
            tmp_agg_cols = ''

            # list for operating functions
            operfunc = []

            # table name
            tbl = ''

            # declare tmp_cond for query
            tmp_cond1 = ''
            tmp_cond2 = ''

            # declare tmp_cond list for query
            tmp_cond_list1 = []
            tmp_cond_list2 = []
            tmp_cond_list3 = []

            # declare filter_statement for queries with multiple conditions
            filter_statement = ''

            # list for conditions
            cond = []

            # declare tmp_col for query
            tmp_col = ''

            # check if there OPERATING FUNCTIONS
            if len(ctx.OPERATING_FUNCTION()) == 0: # no operators

                if(self.findPosition(str(ctx.IDENTIFIER()[0].getSymbol())) < self.findPosition(str(ctx.ON().getSymbol()))):
                    self.has_single_operating_function = True

                #check if there is FOR
                if ctx.FOR() is None: # no for conditions
                    # put the columns into the list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < on_pos: # if position of identifier is before the on
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        i += 1
                    # if there is group by on simple select statement, return error
                    if ctx.GROUPBY() is not None: # has group by
                        print('Error! Invalid group_by statement!')
                    if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # if position of identifier is after the on
                        tbl = ctx.IDENTIFIER()[i].getText()
                        i +=1

                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        # assemble the command to do simple query

                        self.tabChecking()
                        command = 'tmp_result =' + tbl + '[[' + tmp_col[0:-1] + ']]'
                        self.output.write(command + '\n')
                        self.tabChecking()
                        command = 'print(tmp_result)'
                        self.output.write(command + '\n')

                    else: 
                        print('Error!')
                elif ctx.FOR() is not None: #has for conditions
                    # get the position of FOR
                    for_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.FOR().getSymbol())).group(2))
                    # put the columns of the GET into list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < for_pos: # if position of identifier is before the for
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        i += 1

                    # see how many conditions there are, if 1 then simple, if more than 1 then complicated
                    cond_count = len(ctx.OPERATOR())
                    if cond_count == 1: #only 1 condition
                        # get OPERATOR position
                        cond_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.OPERATOR()[0].getSymbol())).group(2))
                        # get the left side of the operator
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < cond_pos: # get the left side of the conditional operator
                            tmp_cond1 = tmp_cond1 + ctx.IDENTIFIER()[i].getText()
                            i += 1

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
                        if on_pos > int(re.search('(\[@)(\d+)(,.*)',str(ctx.LITERAL()[l].getSymbol())).group(2)) > cond_pos: # get the literal on the right side of the conditional operator
                            if ctx.LITERAL()[l].getText()[1:-1].isdigit():
                                tmp_cond2 = tmp_cond2 + ctx.LITERAL()[l].getText()[1:-1]
                            else:
                                tmp_cond2 = tmp_cond2 + ctx.LITERAL()[l].getText()

                        # if there is group by on simple select statement, return error
                        if ctx.GROUPBY() is not None: # has group by
                            print('Error! Invalid group_by statement!')
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # the the identifiers after the position of the on
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1
                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        #command = 'tmp_result = ' + tbl + '[' + tbl + '["' + tmp_cond1 + '"]' + tmp_cond2 + ']' + '\nprint(tmp_result' + '[[' + tmp_col[0:-1] + ']])'
                        command = 'tmp_result = ' + tbl + '[' + tbl + '["' + tmp_cond1 + '"]' + tmp_cond2 + ']' 
                        command1 = 'tmp_result = tmp_result' + '[[' + tmp_col[0:-1] + ']]'
                        command2 ='print(tmp_result)'
                        self.tabChecking()
                        self.output.write(command + '\n')
                        self.tabChecking()
                        self.output.write(command1 + '\n')
                        self.tabChecking()
                        self.output.write(command2 + '\n')

                    if cond_count > 1: # more than 1 condition

                        cond_ctr = 0

                        while cond_ctr < cond_count:
                            tmp_cond_list1.append(ctx.IDENTIFIER()[i].getText())
                            i += 1

                            o = ctx.OPERATOR()[cond_ctr].getText().upper()

                            if o == 'EQUAL':
                                tmp_cond_list2.append('==')
                            elif o == 'GT':
                                tmp_cond_list2.append('>')
                            elif o == 'GTE':
                                tmp_cond_list2.append('>=')
                            elif o == 'LT':
                                tmp_cond_list2.append('<')
                            elif o == 'LTE':
                                tmp_cond_list2.append('<=')
                            elif o == 'NOT_EQUAL':
                                tmp_cond_list2.append('!=')
                            else:
                                print('Error! Invalid operator for general query filter!' + o)

                            if ctx.LITERAL()[l].getText()[1:-1].isdigit():
                                tmp_cond_list3.append(ctx.LITERAL()[l].getText()[1:-1])
                            else:
                                tmp_cond_list3.append(ctx.LITERAL()[l].getText()) 
                            l += 1

                            cond_ctr += 1

                        # if there is group by on simple select statement, return error
                        if ctx.GROUPBY() is not None: # has group by
                            print('Error! Invalid group_by statement!')
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # the the identifiers after the position of the on
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1

                        tmp_cond_ctr = 0

                        while tmp_cond_ctr < cond_ctr:
                            if tmp_cond_ctr == cond_ctr - 1:
                                filter_statement = filter_statement + '(' + tbl + '["' + tmp_cond_list1[tmp_cond_ctr] + '"]' + tmp_cond_list2[tmp_cond_ctr] + tmp_cond_list3[tmp_cond_ctr]  + ')'
                            else:
                                filter_statement = filter_statement + '(' + tbl + '["' + tmp_cond_list1[tmp_cond_ctr] + '"]' + tmp_cond_list2[tmp_cond_ctr] + tmp_cond_list3[tmp_cond_ctr]  + ')&'
                            tmp_cond_ctr += 1

                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        command = 'tmp_result = ' + tbl + '[' + filter_statement + ']' + '\n'
                        self.tabChecking()
                        self.output.write(command + '\n')
                        command1 = 'tmp_result = tmp_result[[' + tmp_col[0:-1] + ']]'
                        self.tabChecking()
                        self.output.write(command1+ '\n')
                        command2='print(tmp_result)'
                        self.tabChecking()
                        self.output.write(command2 + '\n')

                else:
                    print('Coming soon!')

                print('pasok',self.inside_assigning_query)
                #checking for scalar assignments
                if(self.inside_assigning_query):
                    self.tabChecking()
                    self.output.write(self.identifier_name+ ' = tmp_result.values.tolist()[0][0]\n')
                    self.inside_assigning_query = False

            elif len(ctx.OPERATING_FUNCTION()) > 0:

                if(len(ctx.OPERATING_FUNCTION()) == 1 and self.findPosition(str(ctx.OPERATING_FUNCTION()[0].getSymbol())) < self.findPosition(str(ctx.IDENTIFIER()[i].getSymbol()))):
                    self.has_single_operating_function = True

                if ctx.FOR() is None: # no for conditions
                    operfunc_count = len(ctx.OPERATING_FUNCTION())
                    sep_count = len(ctx.SEPARATOR())

                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < on_pos: # if position of identifier is before the for
                            cols.append(ctx.IDENTIFIER()[i].getText())
                            if p < operfunc_count:
                                if int(re.search('(\[@)(\d+)(,.*)',str(ctx.OPERATING_FUNCTION()[p].getSymbol())).group(2)) < int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)):
                                    operfunc.append(ctx.OPERATING_FUNCTION()[p].getText())
                                    p += 1
                                else:
                                    operfunc.append('')
                            i += 1

                    if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # the the identifiers after the position of the on
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1

                    if ctx.GROUPBY() is not None: # has group by
                        ident_count = len(ctx.IDENTIFIER())
                        gb_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.GROUPBY().getSymbol())).group(2))


                        
                        while i < ident_count and int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > gb_pos: # the the identifiers after the position of the on
                            gb_cols.append(ctx.IDENTIFIER()[i].getText())
                            i +=1

                    # assemble the column part of the simple query
                    for x in cols:
                        tmp_col = tmp_col + '"' + x + '",'

                    # assemtble the group by columns
                    for y in gb_cols:
                        tmp_gb_cols = tmp_gb_cols + '"' + y + '",'

                    # assemble the aggregation per column
                    ii = 0

                    while ii < len(cols):
                        if operfunc[ii] == '':
                            ii += 1
                        else:
                            tmp_agg_cols = tmp_agg_cols + '"' + cols[ii] + '":"' + operfunc[ii] + '",'
                            ii += 1


                    # select the columns to tmp_result
                    self.tabChecking()
                    command = 'tmp_result = ' + tbl + '[[' + tmp_col[0:-1] + ']]'
                    self.output.write(command + '\n')

                    # perform the group by
                    if ctx.GROUPBY() is not None: # has group by
                        self.inside_grouping=True
                        command = 'grouped = tmp_result.groupby([' + tmp_gb_cols[0:-1] + '])'
                        self.tabChecking()
                        self.output.write(command + '\n')
                    else:
                        self.inside_grouping=True
                        command = 'grouped = ' + tbl
                        self.tabChecking()
                        self.output.write(command + '\n')

                    #perform the aggregations
                    if (tmp_agg_cols[0:-1]) !="":
                        command = 'tmp_result = grouped.agg({' + tmp_agg_cols[0:-1] + '})'
                    else:
                        command = 'tmp_result = grouped'

                    self.tabChecking()
                    self.output.write(command + '\n')
                    command = 'print(tmp_result)'
                    self.tabChecking()
                    self.output.write(command+ '\n')
                    self.saveAggregation(tmp_agg_cols[0:-1])

                    # select the columns


                    # perform the aggregations
                elif ctx.FOR() is not None: # has for conditions
                    # get the position of FOR
                    for_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.FOR().getSymbol())).group(2))

                    # put the columns of the GET into list 'cols'
                    while int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < for_pos: # if position of identifier is before the for
                        cols.append(ctx.IDENTIFIER()[i].getText())
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.OPERATING_FUNCTION()[p].getSymbol())).group(2)) < int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)):
                            operfunc.append(ctx.OPERATING_FUNCTION()[p].getText())
                            p += 1
                        else:
                            operfunc.append('')
                        i += 1

                    # see how many conditions there are, if 1 then simple, if more than 1 then complicated
                    cond_count = len(ctx.OPERATOR())
                    if cond_count == 1: #only 1 condition
                        # get OPERATOR position
                        cond_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.OPERATOR()[0].getSymbol())).group(2))
                        # get the left side of the operator
                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) < cond_pos: # get the left side of the conditional operator
                            tmp_cond1 = tmp_cond1 + ctx.IDENTIFIER()[i].getText()
                            i += 1

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
                        if on_pos > int(re.search('(\[@)(\d+)(,.*)',str(ctx.LITERAL()[l].getSymbol())).group(2)) > cond_pos: # get the literal on the right side of the conditional operator
                            if ctx.LITERAL()[l].getText()[1:-1].isdigit():
                                tmp_cond2 = tmp_cond2 + ctx.LITERAL()[l].getText()[1:-1]
                            else:
                                tmp_cond2 = tmp_cond2 + ctx.LITERAL()[l].getText()


                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # the the identifiers after the position of the on
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1

                        if ctx.GROUPBY() is not None: # has group by
                            ident_count = len(ctx.IDENTIFIER())
                            gb_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.GROUPBY().getSymbol())).group(2))

                            while i < ident_count and int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > gb_pos: # the the identifiers after the position of the on
                                gb_cols.append(ctx.IDENTIFIER()[i].getText())
                                i +=1


                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        

                        # assemtble the group by columns
                        for y in gb_cols:
                            tmp_gb_cols = tmp_gb_cols + '"' + y + '",'

                        # assemble the aggregation per column
                        ii = 0

                        while ii < len(cols):
                            if operfunc[ii] == '':
                                ii += 1
                            else:
                                tmp_agg_cols = tmp_agg_cols + '"' + cols[ii] + '":"' + operfunc[ii] + '",'
                                ii += 1

                        # select the columns to tmp_result
                        command = 'tmp_result = ' + tbl + '[' + tbl + '["' + tmp_cond1 + '"]' + tmp_cond2 + ']' 
                        self.tabChecking()
                        self.output.write(command + '\n')

                        # perform the group by
                        if ctx.GROUPBY() is not None: # has group by
                            self.inside_grouping=True
                            command = 'grouped = tmp_result.groupby([' + tmp_gb_cols[0:-1] + '])'
                            self.tabChecking()
                            self.output.write(command + '\n')
                        else:
                            self.inside_grouping=True
                            command = 'grouped = ' + tbl
                            self.tabChecking()
                            self.output.write(command + '\n')

                        #perform the aggregations
                        if (tmp_agg_cols[0:-1]) !="":
                            command = 'tmp_result = grouped.agg({' + tmp_agg_cols[0:-1] + '})'
                        else:
                            command = 'tmp_result = grouped'
                        self.tabChecking()
                        self.output.write(command + '\n')
                        self.tabChecking()
                        command = 'print(tmp_result)'
                        self.output.write(command + '\n')
                        self.saveAggregation(tmp_agg_cols[0:-1])

                    elif cond_count > 1: # more than 1 condition

                        cond_ctr = 0

                        while cond_ctr < cond_count:
                            tmp_cond_list1.append(ctx.IDENTIFIER()[i].getText())
                            i += 1

                            o = ctx.OPERATOR()[cond_ctr].getText().upper()

                            if o == 'EQUAL':
                                tmp_cond_list2.append('==')
                            elif o == 'GT':
                                tmp_cond_list2.append('>')
                            elif o == 'GTE':
                                tmp_cond_list2.append('>=')
                            elif o == 'LT':
                                tmp_cond_list2.append('<')
                            elif o == 'LTE':
                                tmp_cond_list2.append('<=')
                            elif o == 'NOT_EQUAL':
                                tmp_cond_list2.append('!=')
                            else:
                                print('Error! Invalid operator for general query filter!' + o)

                            if ctx.LITERAL()[l].getText()[1:-1].isdigit():
                                tmp_cond_list3.append(ctx.LITERAL()[l].getText()[1:-1])
                            else:
                                tmp_cond_list3.append(ctx.LITERAL()[l].getText()) 
                            l += 1

                            cond_ctr += 1

                        if int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > on_pos: # the the identifiers after the position of the on
                            tbl = ctx.IDENTIFIER()[i].getText()
                            i +=1

                        if ctx.GROUPBY() is not None: # has group by
                            ident_count = len(ctx.IDENTIFIER())
                            gb_pos = int(re.search('(\[@)(\d+)(,.*)',str(ctx.GROUPBY().getSymbol())).group(2))

                            while i < ident_count and int(re.search('(\[@)(\d+)(,.*)',str(ctx.IDENTIFIER()[i].getSymbol())).group(2)) > gb_pos: # the the identifiers after the position of the on
                                gb_cols.append(ctx.IDENTIFIER()[i].getText())
                                i +=1

                        tmp_cond_ctr = 0

                        while tmp_cond_ctr < cond_ctr:
                            if tmp_cond_ctr == cond_ctr - 1:
                                filter_statement = filter_statement + '(' + tbl + '["' + tmp_cond_list1[tmp_cond_ctr] + '"]' + tmp_cond_list2[tmp_cond_ctr] + tmp_cond_list3[tmp_cond_ctr]  + ')'
                            else:
                                filter_statement = filter_statement + '(' + tbl + '["' + tmp_cond_list1[tmp_cond_ctr] + '"]' + tmp_cond_list2[tmp_cond_ctr] + tmp_cond_list3[tmp_cond_ctr]  + ')&'
                            tmp_cond_ctr += 1

                        # assemble the column part of the simple query
                        for x in cols:
                            tmp_col = tmp_col + '"' + x + '",'

                        # assemtble the group by columns
                        for y in gb_cols:
                            tmp_gb_cols = tmp_gb_cols + '"' + y + '",'

                        # assemble the aggregation per column
                        ii = 0

                        while ii < len(cols):
                            if operfunc[ii] == '':
                                ii += 1
                            else:
                                tmp_agg_cols = tmp_agg_cols + '"' + cols[ii] + '":"' + operfunc[ii] + '",'
                                ii += 1

                        command = 'tmp_result = ' + tbl + '[' + filter_statement + ']'
                        self.tabChecking()
                        self.output.write(command + '\n')

                        # perform the group by
                        if ctx.GROUPBY() is not None: # has group by
                            self.inside_grouping=True
                            command = 'grouped = tmp_result.groupby(' + tmp_gb_cols[0:-1] + ')'
                            self.tabChecking()
                            self.output.write(command + '\n')
                        else:
                            self.inside_grouping=True
                            command = 'grouped = ' + tbl
                            self.tabChecking()
                            self.output.write(command + '\n')

                        #perform the aggregations
                        if (tmp_agg_cols[0:-1]) !="":
                            command = 'tmp_result = grouped.agg({' + tmp_agg_cols[0:-1] + '})'
                        else:
                            command = 'tmp_result = grouped'
                        self.tabChecking()
                        self.output.write(command + '\n')
                        self.tabChecking()
                        command = 'print(tmp_result)'
                        self.output.write(command + '\n')
                        self.saveAggregation(tmp_agg_cols[0:-1])

        else:
            print('Error!')
        

    def exitGeneralquery(self, ctx:CRPPLParser.GraphqueryContext):
        
        self.endOfTheLineChecking()

    def enterGraphquery(self, ctx:CRPPLParser.GraphqueryContext):
        graph_type = ctx.TYPE().getText()
        dataframe = ctx.IDENTIFIER().getText()

        if graph_type == 'line':
            graph_command = 'print(' + dataframe + '.plot.line(x='+ ctx.LITERAL()[0].getText() + ', y=' + ctx.LITERAL()[1].getText() + '))'
            self.tabChecking()
            self.output.write(graph_command)
            self.output.write('\n')
            fig_command = "plt.savefig('Report/line.png')"
            self.tabChecking()
            self.output.write(fig_command)
        elif graph_type == 'bar':
            self.output.write('#inside grouping is'+str(self.inside_grouping)+'\n')
            self.output.write('#insissdfdfds'+str(self.inside_grouping)+'\n')
            #graph_command = 'print(' + dataframe + '.plot.bar(x='+ ctx.LITERAL()[0].getText() + ', y=' + ctx.LITERAL()[1].getText() + '))'
            graph_command = f"print({dataframe}.plot.bar())"
            ytick_command = f"plt.ticklabel_format(axis='y', style='plain')"
            xlabel_command=f"plt.xlabel({ctx.LITERAL()[0].getText()})"
            ylabel_command=f"plt.ylabel({ctx.LITERAL()[1].getText()})"
            self.tabChecking()
            self.output.write(graph_command)
            self.output.write('\n')
            self.tabChecking()
            self.output.write(ytick_command)
            self.output.write('\n')
            self.tabChecking()
            self.output.write(xlabel_command)
            self.output.write('\n')
            self.tabChecking()
            self.output.write(ylabel_command)
            self.output.write('\n')
            fig_command = "plt.savefig('Report/bar.pdf',bbox_inches='tight')"
            self.tabChecking()
            self.output.write(fig_command)
        if graph_type == 'pie':
            # graph_command = 'print(' + dataframe + '.plot.scatter(y=' + ctx.LITERAL()[1].getText() + '))'
            #graph_command = "print(" + dataframe + ".groupby([" + ctx.LITERAL()[0].getText() + "]).sum().plot(kind='pie'" + ', y=' + ctx.LITERAL()[1].getText() + ", autopct='%1.0f%%'))"

            self.tabChecking()
            self.output.write("if (__________GROUPED_IS == True):")
            self.output.write('\n')
            self.if_nest_ctr+=1

            percent_command=f"percents = {dataframe}[{ctx.LITERAL()[1].getText()}].to_numpy() * 100 / {dataframe}[{ctx.LITERAL()[1].getText()}].to_numpy().sum()"
            graph_command = f"print({dataframe}.plot.pie(y={ctx.LITERAL()[1].getText()}, labeldistance=None))"
            legend_command=f"plt.legend( bbox_to_anchor=(1.35,1.1), loc='upper right', labels=['%s, %1.1f %%' % (l, s) for l, s in zip({dataframe}.index,percents)])"

            self.tabChecking()
            self.output.write(percent_command)
            self.output.write('\n')

            self.tabChecking()
            self.output.write(graph_command)
            self.output.write('\n')

            self.tabChecking()
            self.output.write(legend_command)
            self.output.write('\n')

            fig_command = "plt.savefig('Report/pie.pdf',bbox_inches='tight')"
            self.tabChecking()
            self.output.write(fig_command)
            self.output.write('\n')

            self.if_nest_ctr-=1
            self.tabChecking()
            self.output.write("else:")
            self.output.write('\n')
            self.if_nest_ctr+=1

            percent_command=f"percents = {dataframe}.to_numpy() * 100 / {dataframe}.to_numpy().sum()"
            graph_command = f"print({dataframe}.plot.pie( labeldistance=None))"
            legend_command=f"plt.legend( bbox_to_anchor=(1.35,1.1), loc='upper right', labels=['%s, %1.1f %%' % (l, s) for l, s in zip({dataframe}.index,percents)])"
            y_label_command=f"plt.ylabel({ctx.LITERAL()[1].getText()})"

            self.tabChecking()
            self.output.write(percent_command)
            self.output.write('\n')

            self.tabChecking()
            self.output.write(graph_command)
            self.output.write('\n')

            self.tabChecking()
            self.output.write(legend_command)
            self.output.write('\n')

            self.tabChecking()
            self.output.write(y_label_command)
            self.output.write('\n')

            fig_command = "plt.savefig('Report/pie.pdf',bbox_inches='tight')"
            self.tabChecking()
            self.output.write(fig_command)
            self.output.write('\n')

            self.if_nest_ctr-=1
            self.tabChecking()
            self.output.write("#end of secret if")
            self.output.write('\n')
        pass

    def exitGraphquery(self, ctx:CRPPLParser.GraphqueryContext):
        self.output.write('\n')
        self.endOfTheLineChecking()

    # Enter a parse tree produced by CRPPLParser#defineconstant.
    def enterDefineconstant(self, ctx:CRPPLParser.DefineconstantContext):
        self.tabChecking()

        if ctx.RESERVEDWORD_CONSTANT() is not None:

            if(ctx.IDENTIFIER() != None):
                identifier_val = ctx.IDENTIFIER().getText()
                actual_val = ctx.LITERAL().getText()

                key_list = self.const_dict.keys()
                if(identifier_val not in key_list):
                    self.const_dict.update({identifier_val: actual_val})
                    self.output.write(identifier_val + ' = ' + actual_val)

                else:
                    print("Error! Constant variable already exist")
            else:
                print('Error!')
        else:
            print('Error!')

    # Exit a parse tree produced by CRPPLParser#defineconstant.
    def exitDefineconstant(self, ctx:CRPPLParser.DefineconstantContext):
        self.output.write('\n')
        self.endOfTheLineChecking()

    def enterAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):

        if ctx.NEWCOLUMN() is not None:
            colname = ctx.IDENTIFIER()[0].getText()
            tblname = ctx.IDENTIFIER()[1].getText()

            #declare command
            command = tblname + '["' + colname + '"] = "null"'
            self.tabChecking()
            self.output.write(command + '\n')

            #update CSV with new column
            staticDir = 'CRPPL/CSV Files/target/'
            command = tblname + '.to_csv(\''+ staticDir + tblname + '.csv\', index=False)'
            self.tabChecking()
            self.output.write(command + '\n')

            



        elif ctx.DELETECOLUMN() is not None:
            colname = ctx.IDENTIFIER()[0].getText()
            tblname = ctx.IDENTIFIER()[1].getText()

            #declare command
            command = 'del ' + tblname + '["' + colname + '"]'
            self.tabChecking()
            self.output.write(command + '\n')

            #update CSV with deleted column
            #command = tblname + '.drop(\''+ colname + '\',axis=1, inplace=True)'  #command = tblname + '.pop(\''+ colname + '\')'
            #self.tabChecking()
            #self.output.write(command + '\n')

            staticDir = 'CRPPL/CSV Files/target/'
            command = tblname + '.to_csv(\''+ staticDir + tblname + '.csv\', index=False)'
            self.tabChecking()
            self.output.write(command + '\n')

        else:
            print('Error!')

    def exitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        self.endOfTheLineChecking()

    def enterAssignment(self, ctx:CRPPLParser.AssignmentContext):
        self.output.write('#entering assignment\n')
        

        if ctx.ASSIGNEMT_OPERATOR() is not None:

            if(ctx.IDENTIFIER() != None):
                if(ctx.expr()!=None):
                    self.tabChecking()
                    self.output.write(ctx.IDENTIFIER().getText())
                    self.output.write(' = ')
                    self.output.write(ctx.expr().getText())
                elif (ctx.generalquery()!=None):
                    self.inside_assigning_query=True
                    self.identifier_name=ctx.IDENTIFIER().getText()
            else:
                print('Error!')
        else:
            print('Error!')

    def exitAssignment(self, ctx:CRPPLParser.AssignmentContext):
        self.output.write('\n')
        self.output.write('#exiting assignment\n')
        self.endOfTheLineChecking()

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
        if collective[1][1][1:-1].isdigit():
            command = collective[4][1] + '.loc[' + collective[4][1] + '.' + collective[2][1] + '==' + collective[3][1] + ',"' + collective[0][1] + '"]=' + collective[1][1][1:-1]
            self.tabChecking()
            self.output.write(command + '\n')
        else:
            command = collective[4][1] + '.loc[' + collective[4][1] + '.' + collective[2][1] + '==' + collective[3][1] + ',"' + collective[0][1] + '"]=' + collective[1][1]
            self.tabChecking()
            self.output.write(command + '\n')

        staticDir = 'CRPPL/CSV Files/target/'

        command = collective[4][1] + '.to_csv(\''+ staticDir + collective[4][1] + '.csv\', index=False)'
        self.tabChecking()
        self.output.write(command + '\n')

    def exitChangevalue(self, ctx:CRPPLParser.ChangevalueContext):
        self.endOfTheLineChecking()

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

            self.if_nest_ctr+=1
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
                self.output.write(ctx.IDENTIFIER()[indentifier_count-1].getText() + '\n\n')
        else:
            self.output.write('\n')

        #end the function.
        if ctx.ENDFUNCTION() is not None:
            self.if_nest_ctr-=1
        else:
            pass

    def enterConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):
            self.tabChecking()
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
        self.endOfTheLineChecking()


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

    def enterFunctioncall(self, ctx:CRPPLParser.FunctioncallContext):
        
        self.tabChecking()

        if(self.tab_count > 0):
            self.output.write('\t')
            self.tab_count -= 1

        if ctx.RESERVEDWORD_DO() is not None:
            pass
        else:
            print('Error!')

    def exitFunctioncall(self, ctx:CRPPLParser.FunctioncallContext):
        pass

    def enterFunctionprototype(self, ctx:CRPPLParser.FunctionprototypeContext):

        indentifier_count = len(ctx.IDENTIFIER())
        
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

        self.output.write(ctx.CLOSEPARENTHESIS().getText() + '\n')
        

    def exitFunctionprototype(self, ctx:CRPPLParser.FunctionprototypeContext):
        pass

    def endOfTheLineChecking(self):
        self.output.write("# i am checking line\n")
        if ( (self.if_nest_ctr in self.else_ctr ) and self.elif_ctr[self.if_nest_ctr]==0):
            if(self.else_ctr[self.if_nest_ctr]>0):
                for i in range(0,self.if_nest_ctr-1):
                    self.output.write("\t")
                self.output.write("else:\n")
                self.else_ctr[self.if_nest_ctr]-=1

    def tabChecking(self):
        for i in range(0,self.if_nest_ctr):
            self.output.write("\t")
    def saveAggregation(self,aggregationCode):
        if (self.inside_assigning_query==True):
            if(self.inside_grouping==True):
                self.tabChecking()
                self.output.write(self.identifier_name+'=grouped'+'.agg({' + aggregationCode + '})'+'\n')
                
                #checking for scalar assignments
                if(self.has_single_operating_function):
                    self.output.write(self.identifier_name+' = '+self.identifier_name+'.tolist()[0]\n')
                    self.has_single_operating_function = False
                self.inside_assigning_query=False
                self.inside_grouping=False
                self.identifier_name=""
            else:
                self.tabChecking()
                self.output.write(self.identifier_name+'=tmp_result\n')
                self.inside_assigning_query=False
                self.inside_grouping=False
                self.identifier_name=""


    def findPosition(self, pos_string):
        split_string = pos_string.split(",")
        ret_string = split_string[0]
        ret_string = ret_string[2:]
        ret_val = int(ret_string)
        return ret_val