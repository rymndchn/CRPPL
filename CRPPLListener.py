# Generated from CRPPL.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CRPPLParser import CRPPLParser
else:
    from CRPPLParser import CRPPLParser

# This class defines a complete listener for a parse tree produced by CRPPLParser.
class CRPPLListener(ParseTreeListener):

    # Enter a parse tree produced by CRPPLParser#multiexpr.
    def enterMultiexpr(self, ctx:CRPPLParser.MultiexprContext):
        pass

    # Exit a parse tree produced by CRPPLParser#multiexpr.
    def exitMultiexpr(self, ctx:CRPPLParser.MultiexprContext):
        pass


    # Enter a parse tree produced by CRPPLParser#validexpr.
    def enterValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        pass

    # Exit a parse tree produced by CRPPLParser#validexpr.
    def exitValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        pass


    # Enter a parse tree produced by CRPPLParser#generalquery.
    def enterGeneralquery(self, ctx:CRPPLParser.GeneralqueryContext):
        pass

    # Exit a parse tree produced by CRPPLParser#generalquery.
    def exitGeneralquery(self, ctx:CRPPLParser.GeneralqueryContext):
        pass


    # Enter a parse tree produced by CRPPLParser#importdata.
    def enterImportdata(self, ctx:CRPPLParser.ImportdataContext):
        pass

    # Exit a parse tree produced by CRPPLParser#importdata.
    def exitImportdata(self, ctx:CRPPLParser.ImportdataContext):
        pass


    # Enter a parse tree produced by CRPPLParser#altercolumn.
    def enterAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass

    # Exit a parse tree produced by CRPPLParser#altercolumn.
    def exitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass



del CRPPLParser