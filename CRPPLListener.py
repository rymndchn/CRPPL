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


    # Enter a parse tree produced by CRPPLParser#importfile.
    def enterImportfile(self, ctx:CRPPLParser.ImportfileContext):
        pass

    # Exit a parse tree produced by CRPPLParser#importfile.
    def exitImportfile(self, ctx:CRPPLParser.ImportfileContext):
        pass


    # Enter a parse tree produced by CRPPLParser#altercolumn.
    def enterAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass

    # Exit a parse tree produced by CRPPLParser#altercolumn.
    def exitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        pass


    # Enter a parse tree produced by CRPPLParser#reportvisualization.
    def enterReportvisualization(self, ctx:CRPPLParser.ReportvisualizationContext):
        pass

    # Exit a parse tree produced by CRPPLParser#reportvisualization.
    def exitReportvisualization(self, ctx:CRPPLParser.ReportvisualizationContext):
        pass


    # Enter a parse tree produced by CRPPLParser#createfunction.
    def enterCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        pass

    # Exit a parse tree produced by CRPPLParser#createfunction.
    def exitCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        pass


    # Enter a parse tree produced by CRPPLParser#conditionalstatement.
    def enterConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):
        pass

    # Exit a parse tree produced by CRPPLParser#conditionalstatement.
    def exitConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):
        pass



del CRPPLParser