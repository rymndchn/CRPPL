# Generated from CRPPL.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CRPPLParser import CRPPLParser
else:
    from CRPPLParser import CRPPLParser

# This class defines a complete generic visitor for a parse tree produced by CRPPLParser.

class CRPPLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CRPPLParser#multiexpr.
    def visitMultiexpr(self, ctx:CRPPLParser.MultiexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#validexpr.
    def visitValidexpr(self, ctx:CRPPLParser.ValidexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#generalquery.
    def visitGeneralquery(self, ctx:CRPPLParser.GeneralqueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#importfile.
    def visitImportfile(self, ctx:CRPPLParser.ImportfileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#defineconstant.
    def visitDefineconstant(self, ctx:CRPPLParser.DefineconstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#altercolumn.
    def visitAltercolumn(self, ctx:CRPPLParser.AltercolumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#graphquery.
    def visitGraphquery(self, ctx:CRPPLParser.GraphqueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#createfunction.
    def visitCreatefunction(self, ctx:CRPPLParser.CreatefunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#functioncall.
    def visitFunctioncall(self, ctx:CRPPLParser.FunctioncallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#functionprototype.
    def visitFunctionprototype(self, ctx:CRPPLParser.FunctionprototypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#conditionalstatement.
    def visitConditionalstatement(self, ctx:CRPPLParser.ConditionalstatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CRPPLParser#booleanstatement.
    def visitBooleanstatement(self, ctx:CRPPLParser.BooleanstatementContext):
        return self.visitChildren(ctx)



del CRPPLParser