# Generated from CRPPL.g4 by ANTLR 4.9
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26")
        buf.write("D\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n")
        buf.write("\2\r\2\16\2\17\5\2\22\n\2\3\2\3\2\3\3\3\3\3\3\5\3\31\n")
        buf.write("\3\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\7\4#\n\4\f\4\16")
        buf.write("\4&\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f")
        buf.write("\4\16\4\63\13\4\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\t")
        buf.write("\n\2F\2\21\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\66\3\2")
        buf.write("\2\2\n>\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2")
        buf.write("\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\r\3\2\2\2")
        buf.write("\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2")
        buf.write("\2\25\31\5\6\4\2\26\31\5\b\5\2\27\31\5\n\6\2\30\25\3\2")
        buf.write("\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\35\7")
        buf.write("\5\2\2\33\34\7\6\2\2\34\36\7\7\2\2\35\33\3\2\2\2\35\36")
        buf.write("\3\2\2\2\36\37\3\2\2\2\37$\7\23\2\2 !\7\21\2\2!#\7\23")
        buf.write("\2\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\64\3\2")
        buf.write("\2\2&$\3\2\2\2\'(\7\b\2\2()\7\23\2\2)*\7\22\2\2*\61\7")
        buf.write("\23\2\2+,\7\21\2\2,-\7\23\2\2-.\7\22\2\2.\60\7\23\2\2")
        buf.write("/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62")
        buf.write("\65\3\2\2\2\63\61\3\2\2\2\64\'\3\2\2\2\64\65\3\2\2\2\65")
        buf.write("\7\3\2\2\2\66\67\7\f\2\2\678\7\r\2\289\7\3\2\29:\7\23")
        buf.write("\2\2:;\7\21\2\2;<\7\23\2\2<=\7\4\2\2=\t\3\2\2\2>?\t\2")
        buf.write("\2\2?@\7\13\2\2@A\7\b\2\2AB\7\23\2\2B\13\3\2\2\2\t\17")
        buf.write("\21\30\35$\61\64")
        return buf.getvalue()


class CRPPLParser ( Parser ):

    grammarFileName = "CRPPL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "','", "'='", "<INVALID>", 
                     "' '", "'\n'", "'\r'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "GET", "OPERAND", 
                      "OF", "FOR", "NEWCOLUMN", "DELETECOLUMN", "NAMEDCOLUMN", 
                      "DO", "IMPORTFILE", "CREATEFUNCTION", "RETURN", "ENDFUNCTION", 
                      "COMMA", "EQUALS", "LITERAL", "WHITESPACE", "NEXTLINE", 
                      "CARRIAGERETURN" ]

    RULE_multiexpr = 0
    RULE_validexpr = 1
    RULE_generalquery = 2
    RULE_importdata = 3
    RULE_altercolumn = 4

    ruleNames =  [ "multiexpr", "validexpr", "generalquery", "importdata", 
                   "altercolumn" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    GET=3
    OPERAND=4
    OF=5
    FOR=6
    NEWCOLUMN=7
    DELETECOLUMN=8
    NAMEDCOLUMN=9
    DO=10
    IMPORTFILE=11
    CREATEFUNCTION=12
    RETURN=13
    ENDFUNCTION=14
    COMMA=15
    EQUALS=16
    LITERAL=17
    WHITESPACE=18
    NEXTLINE=19
    CARRIAGERETURN=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class MultiexprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(CRPPLParser.EOF, 0)

        def validexpr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CRPPLParser.ValidexprContext)
            else:
                return self.getTypedRuleContext(CRPPLParser.ValidexprContext,i)


        def getRuleIndex(self):
            return CRPPLParser.RULE_multiexpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiexpr" ):
                listener.enterMultiexpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiexpr" ):
                listener.exitMultiexpr(self)




    def multiexpr(self):

        localctx = CRPPLParser.MultiexprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_multiexpr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << CRPPLParser.GET) | (1 << CRPPLParser.NEWCOLUMN) | (1 << CRPPLParser.DELETECOLUMN) | (1 << CRPPLParser.DO))) != 0):
                self.state = 11 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 10
                    self.validexpr()
                    self.state = 13 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << CRPPLParser.GET) | (1 << CRPPLParser.NEWCOLUMN) | (1 << CRPPLParser.DELETECOLUMN) | (1 << CRPPLParser.DO))) != 0)):
                        break



            self.state = 17
            self.match(CRPPLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValidexprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def generalquery(self):
            return self.getTypedRuleContext(CRPPLParser.GeneralqueryContext,0)


        def importdata(self):
            return self.getTypedRuleContext(CRPPLParser.ImportdataContext,0)


        def altercolumn(self):
            return self.getTypedRuleContext(CRPPLParser.AltercolumnContext,0)


        def getRuleIndex(self):
            return CRPPLParser.RULE_validexpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValidexpr" ):
                listener.enterValidexpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValidexpr" ):
                listener.exitValidexpr(self)




    def validexpr(self):

        localctx = CRPPLParser.ValidexprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_validexpr)
        try:
            self.state = 22
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [CRPPLParser.GET]:
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.generalquery()
                pass
            elif token in [CRPPLParser.DO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.importdata()
                pass
            elif token in [CRPPLParser.NEWCOLUMN, CRPPLParser.DELETECOLUMN]:
                self.enterOuterAlt(localctx, 3)
                self.state = 21
                self.altercolumn()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GeneralqueryContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GET(self):
            return self.getToken(CRPPLParser.GET, 0)

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CRPPLParser.LITERAL)
            else:
                return self.getToken(CRPPLParser.LITERAL, i)

        def OPERAND(self):
            return self.getToken(CRPPLParser.OPERAND, 0)

        def OF(self):
            return self.getToken(CRPPLParser.OF, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CRPPLParser.COMMA)
            else:
                return self.getToken(CRPPLParser.COMMA, i)

        def FOR(self):
            return self.getToken(CRPPLParser.FOR, 0)

        def EQUALS(self, i:int=None):
            if i is None:
                return self.getTokens(CRPPLParser.EQUALS)
            else:
                return self.getToken(CRPPLParser.EQUALS, i)

        def getRuleIndex(self):
            return CRPPLParser.RULE_generalquery

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGeneralquery" ):
                listener.enterGeneralquery(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGeneralquery" ):
                listener.exitGeneralquery(self)




    def generalquery(self):

        localctx = CRPPLParser.GeneralqueryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_generalquery)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(CRPPLParser.GET)
            self.state = 27
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==CRPPLParser.OPERAND:
                self.state = 25
                self.match(CRPPLParser.OPERAND)
                self.state = 26
                self.match(CRPPLParser.OF)


            self.state = 29
            self.match(CRPPLParser.LITERAL)
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==CRPPLParser.COMMA:
                self.state = 30
                self.match(CRPPLParser.COMMA)
                self.state = 31
                self.match(CRPPLParser.LITERAL)
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 50
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==CRPPLParser.FOR:
                self.state = 37
                self.match(CRPPLParser.FOR)
                self.state = 38
                self.match(CRPPLParser.LITERAL)
                self.state = 39
                self.match(CRPPLParser.EQUALS)
                self.state = 40
                self.match(CRPPLParser.LITERAL)
                self.state = 47
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==CRPPLParser.COMMA:
                    self.state = 41
                    self.match(CRPPLParser.COMMA)
                    self.state = 42
                    self.match(CRPPLParser.LITERAL)
                    self.state = 43
                    self.match(CRPPLParser.EQUALS)
                    self.state = 44
                    self.match(CRPPLParser.LITERAL)
                    self.state = 49
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImportdataContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DO(self):
            return self.getToken(CRPPLParser.DO, 0)

        def IMPORTFILE(self):
            return self.getToken(CRPPLParser.IMPORTFILE, 0)

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CRPPLParser.LITERAL)
            else:
                return self.getToken(CRPPLParser.LITERAL, i)

        def COMMA(self):
            return self.getToken(CRPPLParser.COMMA, 0)

        def getRuleIndex(self):
            return CRPPLParser.RULE_importdata

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImportdata" ):
                listener.enterImportdata(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImportdata" ):
                listener.exitImportdata(self)




    def importdata(self):

        localctx = CRPPLParser.ImportdataContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_importdata)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.match(CRPPLParser.DO)
            self.state = 53
            self.match(CRPPLParser.IMPORTFILE)
            self.state = 54
            self.match(CRPPLParser.T__0)
            self.state = 55
            self.match(CRPPLParser.LITERAL)
            self.state = 56
            self.match(CRPPLParser.COMMA)
            self.state = 57
            self.match(CRPPLParser.LITERAL)
            self.state = 58
            self.match(CRPPLParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AltercolumnContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAMEDCOLUMN(self):
            return self.getToken(CRPPLParser.NAMEDCOLUMN, 0)

        def FOR(self):
            return self.getToken(CRPPLParser.FOR, 0)

        def LITERAL(self):
            return self.getToken(CRPPLParser.LITERAL, 0)

        def NEWCOLUMN(self):
            return self.getToken(CRPPLParser.NEWCOLUMN, 0)

        def DELETECOLUMN(self):
            return self.getToken(CRPPLParser.DELETECOLUMN, 0)

        def getRuleIndex(self):
            return CRPPLParser.RULE_altercolumn

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAltercolumn" ):
                listener.enterAltercolumn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAltercolumn" ):
                listener.exitAltercolumn(self)




    def altercolumn(self):

        localctx = CRPPLParser.AltercolumnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_altercolumn)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            _la = self._input.LA(1)
            if not(_la==CRPPLParser.NEWCOLUMN or _la==CRPPLParser.DELETECOLUMN):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 61
            self.match(CRPPLParser.NAMEDCOLUMN)
            self.state = 62
            self.match(CRPPLParser.FOR)
            self.state = 63
            self.match(CRPPLParser.LITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





