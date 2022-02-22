// Generated from CRPPL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CRPPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MULT=3, DIV=4, NUM_EXPR=5, NUM=6, GET=7, OF=8, FOR=9, ON=10, 
		GROUPBY=11, CREATEFUNCTION=12, ENDFUNCTION=13, RETURN=14, IF=15, THEN=16, 
		ELSE_IF=17, ELSE=18, TRUE=19, FALSE=20, END_IF=21, NEWCOLUMN=22, DELETECOLUMN=23, 
		CHANGEVALUE=24, TO=25, IMPORTFILE=26, ASSIGNEMT_OPERATOR=27, RESERVEDWORD_DO=28, 
		AS=29, RESERVEDWORD_CONSTANT=30, GRAPH=31, TYPE=32, LABELONE=33, LABELTWO=34, 
		OPENPARENTHESIS=35, CLOSEPARENTHESIS=36, RESERVEDWORD=37, OPERATOR=38, 
		BOOLEAN_CONNECTOR=39, NEGATOR=40, OPERATING_FUNCTION=41, SEPARATOR=42, 
		LITERAL=43, IDENTIFIER=44, WHITESPACE=45, NEXTLINE=46, TAB=47, CARRIAGERETURN=48;
	public static final int
		RULE_multiexpr = 0, RULE_validexpr = 1, RULE_expr = 2, RULE_generalquery = 3, 
		RULE_importfile = 4, RULE_defineconstant = 5, RULE_altercolumn = 6, RULE_assignment = 7, 
		RULE_changevalue = 8, RULE_graphquery = 9, RULE_createfunction = 10, RULE_functioncall = 11, 
		RULE_functionprototype = 12, RULE_conditionalstatement = 13, RULE_booleanstatement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiexpr", "validexpr", "expr", "generalquery", "importfile", "defineconstant", 
			"altercolumn", "assignment", "changevalue", "graphquery", "createfunction", 
			"functioncall", "functionprototype", "conditionalstatement", "booleanstatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'('", "')'", null, null, null, null, null, null, null, null, "' '", 
			"'\n'", "'\t'", "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUB", "MULT", "DIV", "NUM_EXPR", "NUM", "GET", "OF", "FOR", 
			"ON", "GROUPBY", "CREATEFUNCTION", "ENDFUNCTION", "RETURN", "IF", "THEN", 
			"ELSE_IF", "ELSE", "TRUE", "FALSE", "END_IF", "NEWCOLUMN", "DELETECOLUMN", 
			"CHANGEVALUE", "TO", "IMPORTFILE", "ASSIGNEMT_OPERATOR", "RESERVEDWORD_DO", 
			"AS", "RESERVEDWORD_CONSTANT", "GRAPH", "TYPE", "LABELONE", "LABELTWO", 
			"OPENPARENTHESIS", "CLOSEPARENTHESIS", "RESERVEDWORD", "OPERATOR", "BOOLEAN_CONNECTOR", 
			"NEGATOR", "OPERATING_FUNCTION", "SEPARATOR", "LITERAL", "IDENTIFIER", 
			"WHITESPACE", "NEXTLINE", "TAB", "CARRIAGERETURN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CRPPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CRPPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultiexprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CRPPLParser.EOF, 0); }
		public List<ValidexprContext> validexpr() {
			return getRuleContexts(ValidexprContext.class);
		}
		public ValidexprContext validexpr(int i) {
			return getRuleContext(ValidexprContext.class,i);
		}
		public MultiexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterMultiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitMultiexpr(this);
		}
	}

	public final MultiexprContext multiexpr() throws RecognitionException {
		MultiexprContext _localctx = new MultiexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_EXPR) | (1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << OPENPARENTHESIS) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(30);
					validexpr();
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_EXPR) | (1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << OPENPARENTHESIS) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(37);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidexprContext extends ParserRuleContext {
		public GeneralqueryContext generalquery() {
			return getRuleContext(GeneralqueryContext.class,0);
		}
		public ImportfileContext importfile() {
			return getRuleContext(ImportfileContext.class,0);
		}
		public DefineconstantContext defineconstant() {
			return getRuleContext(DefineconstantContext.class,0);
		}
		public AltercolumnContext altercolumn() {
			return getRuleContext(AltercolumnContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ChangevalueContext changevalue() {
			return getRuleContext(ChangevalueContext.class,0);
		}
		public GraphqueryContext graphquery() {
			return getRuleContext(GraphqueryContext.class,0);
		}
		public CreatefunctionContext createfunction() {
			return getRuleContext(CreatefunctionContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ConditionalstatementContext conditionalstatement() {
			return getRuleContext(ConditionalstatementContext.class,0);
		}
		public ValidexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterValidexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitValidexpr(this);
		}
	}

	public final ValidexprContext validexpr() throws RecognitionException {
		ValidexprContext _localctx = new ValidexprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_validexpr);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				generalquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				importfile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				defineconstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				altercolumn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				changevalue();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				graphquery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				createfunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				functioncall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(50);
				conditionalstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token value;
		public Token op;
		public ExprContext right;
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode NUM_EXPR() { return getToken(CRPPLParser.NUM_EXPR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CRPPLParser.IDENTIFIER, 0); }
		public TerminalNode MULT() { return getToken(CRPPLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CRPPLParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(CRPPLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CRPPLParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPARENTHESIS:
				{
				setState(54);
				match(OPENPARENTHESIS);
				setState(55);
				expr(0);
				setState(56);
				match(CLOSEPARENTHESIS);
				}
				break;
			case NUM_EXPR:
				{
				setState(58);
				((ExprContext)_localctx).value = match(NUM_EXPR);
				}
				break;
			case IDENTIFIER:
				{
				setState(59);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						((ExprContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						((ExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GeneralqueryContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CRPPLParser.GET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode ON() { return getToken(CRPPLParser.ON, 0); }
		public List<TerminalNode> OPERATING_FUNCTION() { return getTokens(CRPPLParser.OPERATING_FUNCTION); }
		public TerminalNode OPERATING_FUNCTION(int i) {
			return getToken(CRPPLParser.OPERATING_FUNCTION, i);
		}
		public List<TerminalNode> OF() { return getTokens(CRPPLParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(CRPPLParser.OF, i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(CRPPLParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CRPPLParser.SEPARATOR, i);
		}
		public TerminalNode FOR() { return getToken(CRPPLParser.FOR, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(CRPPLParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(CRPPLParser.OPERATOR, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public TerminalNode GROUPBY() { return getToken(CRPPLParser.GROUPBY, 0); }
		public GeneralqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterGeneralquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitGeneralquery(this);
		}
	}

	public final GeneralqueryContext generalquery() throws RecognitionException {
		GeneralqueryContext _localctx = new GeneralqueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_generalquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(GET);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATING_FUNCTION) {
				{
				setState(74);
				match(OPERATING_FUNCTION);
				setState(75);
				match(OF);
				}
			}

			setState(78);
			match(IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(79);
				match(SEPARATOR);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATING_FUNCTION) {
					{
					setState(80);
					match(OPERATING_FUNCTION);
					setState(81);
					match(OF);
					}
				}

				setState(84);
				match(IDENTIFIER);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(90);
				match(FOR);
				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(OPERATOR);
				setState(93);
				match(LITERAL);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(94);
					match(SEPARATOR);
					setState(95);
					match(IDENTIFIER);
					setState(96);
					match(OPERATOR);
					setState(97);
					match(LITERAL);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
			match(ON);
			setState(106);
			match(IDENTIFIER);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(107);
				match(GROUPBY);
				setState(108);
				match(IDENTIFIER);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(109);
					match(SEPARATOR);
					setState(110);
					match(IDENTIFIER);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportfileContext extends ParserRuleContext {
		public TerminalNode RESERVEDWORD_DO() { return getToken(CRPPLParser.RESERVEDWORD_DO, 0); }
		public TerminalNode IMPORTFILE() { return getToken(CRPPLParser.IMPORTFILE, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public TerminalNode SEPARATOR() { return getToken(CRPPLParser.SEPARATOR, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode AS() { return getToken(CRPPLParser.AS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public ImportfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterImportfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitImportfile(this);
		}
	}

	public final ImportfileContext importfile() throws RecognitionException {
		ImportfileContext _localctx = new ImportfileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(RESERVEDWORD_DO);
			setState(119);
			match(IMPORTFILE);
			setState(120);
			match(OPENPARENTHESIS);
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			match(SEPARATOR);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			match(CLOSEPARENTHESIS);
			setState(125);
			match(AS);
			setState(126);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineconstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CRPPLParser.IDENTIFIER, 0); }
		public TerminalNode RESERVEDWORD_CONSTANT() { return getToken(CRPPLParser.RESERVEDWORD_CONSTANT, 0); }
		public TerminalNode LITERAL() { return getToken(CRPPLParser.LITERAL, 0); }
		public DefineconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterDefineconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitDefineconstant(this);
		}
	}

	public final DefineconstantContext defineconstant() throws RecognitionException {
		DefineconstantContext _localctx = new DefineconstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(RESERVEDWORD_CONSTANT);
			setState(130);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltercolumnContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode FOR() { return getToken(CRPPLParser.FOR, 0); }
		public TerminalNode NEWCOLUMN() { return getToken(CRPPLParser.NEWCOLUMN, 0); }
		public TerminalNode DELETECOLUMN() { return getToken(CRPPLParser.DELETECOLUMN, 0); }
		public AltercolumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altercolumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterAltercolumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitAltercolumn(this);
		}
	}

	public final AltercolumnContext altercolumn() throws RecognitionException {
		AltercolumnContext _localctx = new AltercolumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_altercolumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==NEWCOLUMN || _la==DELETECOLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(FOR);
			setState(135);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CRPPLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNEMT_OPERATOR() { return getToken(CRPPLParser.ASSIGNEMT_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GeneralqueryContext generalquery() {
			return getRuleContext(GeneralqueryContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(ASSIGNEMT_OPERATOR);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case OPENPARENTHESIS:
			case IDENTIFIER:
				{
				setState(139);
				expr(0);
				}
				break;
			case GET:
				{
				setState(140);
				generalquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangevalueContext extends ParserRuleContext {
		public TerminalNode CHANGEVALUE() { return getToken(CRPPLParser.CHANGEVALUE, 0); }
		public TerminalNode OF() { return getToken(CRPPLParser.OF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode TO() { return getToken(CRPPLParser.TO, 0); }
		public TerminalNode FOR() { return getToken(CRPPLParser.FOR, 0); }
		public TerminalNode OPERATOR() { return getToken(CRPPLParser.OPERATOR, 0); }
		public TerminalNode ON() { return getToken(CRPPLParser.ON, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public ChangevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterChangevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitChangevalue(this);
		}
	}

	public final ChangevalueContext changevalue() throws RecognitionException {
		ChangevalueContext _localctx = new ChangevalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_changevalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CHANGEVALUE);
			setState(144);
			match(OF);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(TO);
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			match(FOR);
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(OPERATOR);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
			match(ON);
			setState(153);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphqueryContext extends ParserRuleContext {
		public TerminalNode RESERVEDWORD_DO() { return getToken(CRPPLParser.RESERVEDWORD_DO, 0); }
		public TerminalNode GRAPH() { return getToken(CRPPLParser.GRAPH, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(CRPPLParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CRPPLParser.SEPARATOR, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<TerminalNode> ASSIGNEMT_OPERATOR() { return getTokens(CRPPLParser.ASSIGNEMT_OPERATOR); }
		public TerminalNode ASSIGNEMT_OPERATOR(int i) {
			return getToken(CRPPLParser.ASSIGNEMT_OPERATOR, i);
		}
		public TerminalNode LABELONE() { return getToken(CRPPLParser.LABELONE, 0); }
		public TerminalNode LABELTWO() { return getToken(CRPPLParser.LABELTWO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CRPPLParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode TYPE() { return getToken(CRPPLParser.TYPE, 0); }
		public GraphqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterGraphquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitGraphquery(this);
		}
	}

	public final GraphqueryContext graphquery() throws RecognitionException {
		GraphqueryContext _localctx = new GraphqueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_graphquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(RESERVEDWORD_DO);
			setState(156);
			match(GRAPH);
			setState(157);
			match(OPENPARENTHESIS);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(158);
				match(TYPE);
				}
			}

			setState(161);
			match(SEPARATOR);
			setState(162);
			match(LITERAL);
			setState(163);
			match(ASSIGNEMT_OPERATOR);
			setState(164);
			match(LABELONE);
			setState(165);
			match(SEPARATOR);
			setState(166);
			match(LITERAL);
			setState(167);
			match(ASSIGNEMT_OPERATOR);
			setState(168);
			match(LABELTWO);
			setState(169);
			match(SEPARATOR);
			setState(170);
			match(IDENTIFIER);
			setState(171);
			match(CLOSEPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatefunctionContext extends ParserRuleContext {
		public TerminalNode CREATEFUNCTION() { return getToken(CRPPLParser.CREATEFUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(CRPPLParser.ENDFUNCTION, 0); }
		public TerminalNode RETURN() { return getToken(CRPPLParser.RETURN, 0); }
		public List<GeneralqueryContext> generalquery() {
			return getRuleContexts(GeneralqueryContext.class);
		}
		public GeneralqueryContext generalquery(int i) {
			return getRuleContext(GeneralqueryContext.class,i);
		}
		public List<ImportfileContext> importfile() {
			return getRuleContexts(ImportfileContext.class);
		}
		public ImportfileContext importfile(int i) {
			return getRuleContext(ImportfileContext.class,i);
		}
		public List<AltercolumnContext> altercolumn() {
			return getRuleContexts(AltercolumnContext.class);
		}
		public AltercolumnContext altercolumn(int i) {
			return getRuleContext(AltercolumnContext.class,i);
		}
		public List<ChangevalueContext> changevalue() {
			return getRuleContexts(ChangevalueContext.class);
		}
		public ChangevalueContext changevalue(int i) {
			return getRuleContext(ChangevalueContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<DefineconstantContext> defineconstant() {
			return getRuleContexts(DefineconstantContext.class);
		}
		public DefineconstantContext defineconstant(int i) {
			return getRuleContext(DefineconstantContext.class,i);
		}
		public List<FunctioncallContext> functioncall() {
			return getRuleContexts(FunctioncallContext.class);
		}
		public FunctioncallContext functioncall(int i) {
			return getRuleContext(FunctioncallContext.class,i);
		}
		public List<GraphqueryContext> graphquery() {
			return getRuleContexts(GraphqueryContext.class);
		}
		public GraphqueryContext graphquery(int i) {
			return getRuleContext(GraphqueryContext.class,i);
		}
		public List<ConditionalstatementContext> conditionalstatement() {
			return getRuleContexts(ConditionalstatementContext.class);
		}
		public ConditionalstatementContext conditionalstatement(int i) {
			return getRuleContext(ConditionalstatementContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(CRPPLParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CRPPLParser.SEPARATOR, i);
		}
		public CreatefunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterCreatefunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitCreatefunction(this);
		}
	}

	public final CreatefunctionContext createfunction() throws RecognitionException {
		CreatefunctionContext _localctx = new CreatefunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CREATEFUNCTION);
			setState(174);
			match(IDENTIFIER);
			setState(175);
			match(OPENPARENTHESIS);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(176);
				match(IDENTIFIER);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(177);
					match(SEPARATOR);
					setState(178);
					match(IDENTIFIER);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(186);
			match(CLOSEPARENTHESIS);
			{
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(187);
						generalquery();
						}
						break;
					case 2:
						{
						setState(188);
						importfile();
						}
						break;
					case 3:
						{
						setState(189);
						altercolumn();
						}
						break;
					case 4:
						{
						setState(190);
						changevalue();
						}
						break;
					case 5:
						{
						setState(191);
						expr(0);
						}
						break;
					case 6:
						{
						setState(192);
						assignment();
						}
						break;
					case 7:
						{
						setState(193);
						defineconstant();
						}
						break;
					case 8:
						{
						setState(194);
						functioncall();
						}
						break;
					case 9:
						{
						setState(195);
						graphquery();
						}
						break;
					case 10:
						{
						setState(196);
						conditionalstatement();
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(202);
				match(RETURN);
				}
				break;
			case 2:
				{
				{
				setState(203);
				match(RETURN);
				setState(204);
				match(IDENTIFIER);
				}
				}
				break;
			}
			setState(207);
			match(ENDFUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode RESERVEDWORD_DO() { return getToken(CRPPLParser.RESERVEDWORD_DO, 0); }
		public FunctionprototypeContext functionprototype() {
			return getRuleContext(FunctionprototypeContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RESERVEDWORD_DO);
			setState(210);
			functionprototype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionprototypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(CRPPLParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CRPPLParser.SEPARATOR, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public FunctionprototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionprototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterFunctionprototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitFunctionprototype(this);
		}
	}

	public final FunctionprototypeContext functionprototype() throws RecognitionException {
		FunctionprototypeContext _localctx = new FunctionprototypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionprototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(OPENPARENTHESIS);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(214);
				match(IDENTIFIER);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(215);
					match(SEPARATOR);
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(224);
			match(CLOSEPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CRPPLParser.IF, 0); }
		public List<TerminalNode> THEN() { return getTokens(CRPPLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(CRPPLParser.THEN, i);
		}
		public TerminalNode END_IF() { return getToken(CRPPLParser.END_IF, 0); }
		public List<BooleanstatementContext> booleanstatement() {
			return getRuleContexts(BooleanstatementContext.class);
		}
		public BooleanstatementContext booleanstatement(int i) {
			return getRuleContext(BooleanstatementContext.class,i);
		}
		public List<GeneralqueryContext> generalquery() {
			return getRuleContexts(GeneralqueryContext.class);
		}
		public GeneralqueryContext generalquery(int i) {
			return getRuleContext(GeneralqueryContext.class,i);
		}
		public List<ImportfileContext> importfile() {
			return getRuleContexts(ImportfileContext.class);
		}
		public ImportfileContext importfile(int i) {
			return getRuleContext(ImportfileContext.class,i);
		}
		public List<AltercolumnContext> altercolumn() {
			return getRuleContexts(AltercolumnContext.class);
		}
		public AltercolumnContext altercolumn(int i) {
			return getRuleContext(AltercolumnContext.class,i);
		}
		public List<ChangevalueContext> changevalue() {
			return getRuleContexts(ChangevalueContext.class);
		}
		public ChangevalueContext changevalue(int i) {
			return getRuleContext(ChangevalueContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<DefineconstantContext> defineconstant() {
			return getRuleContexts(DefineconstantContext.class);
		}
		public DefineconstantContext defineconstant(int i) {
			return getRuleContext(DefineconstantContext.class,i);
		}
		public List<FunctioncallContext> functioncall() {
			return getRuleContexts(FunctioncallContext.class);
		}
		public FunctioncallContext functioncall(int i) {
			return getRuleContext(FunctioncallContext.class,i);
		}
		public List<GraphqueryContext> graphquery() {
			return getRuleContexts(GraphqueryContext.class);
		}
		public GraphqueryContext graphquery(int i) {
			return getRuleContext(GraphqueryContext.class,i);
		}
		public List<ConditionalstatementContext> conditionalstatement() {
			return getRuleContexts(ConditionalstatementContext.class);
		}
		public ConditionalstatementContext conditionalstatement(int i) {
			return getRuleContext(ConditionalstatementContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(CRPPLParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(CRPPLParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(CRPPLParser.ELSE, 0); }
		public ConditionalstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterConditionalstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitConditionalstatement(this);
		}
	}

	public final ConditionalstatementContext conditionalstatement() throws RecognitionException {
		ConditionalstatementContext _localctx = new ConditionalstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IF);
			{
			setState(227);
			booleanstatement();
			}
			setState(228);
			match(THEN);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(229);
				generalquery();
				}
				break;
			case 2:
				{
				setState(230);
				importfile();
				}
				break;
			case 3:
				{
				setState(231);
				altercolumn();
				}
				break;
			case 4:
				{
				setState(232);
				changevalue();
				}
				break;
			case 5:
				{
				setState(233);
				expr(0);
				}
				break;
			case 6:
				{
				setState(234);
				assignment();
				}
				break;
			case 7:
				{
				setState(235);
				defineconstant();
				}
				break;
			case 8:
				{
				setState(236);
				functioncall();
				}
				break;
			case 9:
				{
				setState(237);
				graphquery();
				}
				break;
			case 10:
				{
				setState(238);
				conditionalstatement();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_EXPR) | (1L << GET) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << OPENPARENTHESIS) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(241);
					generalquery();
					}
					break;
				case 2:
					{
					setState(242);
					importfile();
					}
					break;
				case 3:
					{
					setState(243);
					altercolumn();
					}
					break;
				case 4:
					{
					setState(244);
					changevalue();
					}
					break;
				case 5:
					{
					setState(245);
					expr(0);
					}
					break;
				case 6:
					{
					setState(246);
					assignment();
					}
					break;
				case 7:
					{
					setState(247);
					defineconstant();
					}
					break;
				case 8:
					{
					setState(248);
					functioncall();
					}
					break;
				case 9:
					{
					setState(249);
					graphquery();
					}
					break;
				case 10:
					{
					setState(250);
					conditionalstatement();
					}
					break;
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(256);
				match(ELSE_IF);
				{
				setState(257);
				booleanstatement();
				}
				setState(258);
				match(THEN);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(259);
					generalquery();
					}
					break;
				case 2:
					{
					setState(260);
					importfile();
					}
					break;
				case 3:
					{
					setState(261);
					altercolumn();
					}
					break;
				case 4:
					{
					setState(262);
					changevalue();
					}
					break;
				case 5:
					{
					setState(263);
					expr(0);
					}
					break;
				case 6:
					{
					setState(264);
					assignment();
					}
					break;
				case 7:
					{
					setState(265);
					defineconstant();
					}
					break;
				case 8:
					{
					setState(266);
					functioncall();
					}
					break;
				case 9:
					{
					setState(267);
					graphquery();
					}
					break;
				case 10:
					{
					setState(268);
					conditionalstatement();
					}
					break;
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_EXPR) | (1L << GET) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << OPENPARENTHESIS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(271);
						generalquery();
						}
						break;
					case 2:
						{
						setState(272);
						importfile();
						}
						break;
					case 3:
						{
						setState(273);
						altercolumn();
						}
						break;
					case 4:
						{
						setState(274);
						changevalue();
						}
						break;
					case 5:
						{
						setState(275);
						expr(0);
						}
						break;
					case 6:
						{
						setState(276);
						assignment();
						}
						break;
					case 7:
						{
						setState(277);
						defineconstant();
						}
						break;
					case 8:
						{
						setState(278);
						functioncall();
						}
						break;
					case 9:
						{
						setState(279);
						graphquery();
						}
						break;
					case 10:
						{
						setState(280);
						conditionalstatement();
						}
						break;
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(291);
				match(ELSE);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(292);
					generalquery();
					}
					break;
				case 2:
					{
					setState(293);
					importfile();
					}
					break;
				case 3:
					{
					setState(294);
					altercolumn();
					}
					break;
				case 4:
					{
					setState(295);
					changevalue();
					}
					break;
				case 5:
					{
					setState(296);
					expr(0);
					}
					break;
				case 6:
					{
					setState(297);
					assignment();
					}
					break;
				case 7:
					{
					setState(298);
					defineconstant();
					}
					break;
				case 8:
					{
					setState(299);
					functioncall();
					}
					break;
				case 9:
					{
					setState(300);
					graphquery();
					}
					break;
				case 10:
					{
					setState(301);
					conditionalstatement();
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_EXPR) | (1L << GET) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << OPENPARENTHESIS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(304);
						generalquery();
						}
						break;
					case 2:
						{
						setState(305);
						importfile();
						}
						break;
					case 3:
						{
						setState(306);
						altercolumn();
						}
						break;
					case 4:
						{
						setState(307);
						changevalue();
						}
						break;
					case 5:
						{
						setState(308);
						expr(0);
						}
						break;
					case 6:
						{
						setState(309);
						assignment();
						}
						break;
					case 7:
						{
						setState(310);
						defineconstant();
						}
						break;
					case 8:
						{
						setState(311);
						functioncall();
						}
						break;
					case 9:
						{
						setState(312);
						graphquery();
						}
						break;
					case 10:
						{
						setState(313);
						conditionalstatement();
						}
						break;
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(321);
			match(END_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanstatementContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(CRPPLParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(CRPPLParser.CLOSEPARENTHESIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(CRPPLParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(CRPPLParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(CRPPLParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(CRPPLParser.FALSE, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<BooleanstatementContext> booleanstatement() {
			return getRuleContexts(BooleanstatementContext.class);
		}
		public BooleanstatementContext booleanstatement(int i) {
			return getRuleContext(BooleanstatementContext.class,i);
		}
		public List<TerminalNode> NEGATOR() { return getTokens(CRPPLParser.NEGATOR); }
		public TerminalNode NEGATOR(int i) {
			return getToken(CRPPLParser.NEGATOR, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(CRPPLParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(CRPPLParser.OPERATOR, i);
		}
		public List<TerminalNode> BOOLEAN_CONNECTOR() { return getTokens(CRPPLParser.BOOLEAN_CONNECTOR); }
		public TerminalNode BOOLEAN_CONNECTOR(int i) {
			return getToken(CRPPLParser.BOOLEAN_CONNECTOR, i);
		}
		public BooleanstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).enterBooleanstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CRPPLListener ) ((CRPPLListener)listener).exitBooleanstatement(this);
		}
	}

	public final BooleanstatementContext booleanstatement() throws RecognitionException {
		BooleanstatementContext _localctx = new BooleanstatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(323);
				match(OPENPARENTHESIS);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEGATOR) {
					{
					{
					setState(324);
					match(NEGATOR);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 2:
				{
				setState(332);
				match(OPENPARENTHESIS);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEGATOR) {
					{
					{
					setState(333);
					match(NEGATOR);
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL:
					{
					setState(339);
					match(LITERAL);
					}
					break;
				case IDENTIFIER:
					{
					setState(340);
					match(IDENTIFIER);
					}
					break;
				case TRUE:
					{
					setState(341);
					match(TRUE);
					}
					break;
				case FALSE:
					{
					setState(342);
					match(FALSE);
					}
					break;
				case OPENPARENTHESIS:
					{
					setState(343);
					booleanstatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR || _la==BOOLEAN_CONNECTOR) {
					{
					{
					setState(354);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPERATOR:
						{
						setState(346);
						match(OPERATOR);
						}
						break;
					case BOOLEAN_CONNECTOR:
						{
						setState(347);
						match(BOOLEAN_CONNECTOR);
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEGATOR) {
							{
							{
							setState(348);
							match(NEGATOR);
							}
							}
							setState(353);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(361);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LITERAL:
						{
						setState(356);
						match(LITERAL);
						}
						break;
					case IDENTIFIER:
						{
						setState(357);
						match(IDENTIFIER);
						}
						break;
					case TRUE:
						{
						setState(358);
						match(TRUE);
						}
						break;
					case FALSE:
						{
						setState(359);
						match(FALSE);
						}
						break;
					case OPENPARENTHESIS:
						{
						setState(360);
						booleanstatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				match(CLOSEPARENTHESIS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0176\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\5\2&\n\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"e\n\5\f\5\16\5h\13\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16"+
		"\5u\13\5\5\5w\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a2\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\5\f\u00bb\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3"+
		"\f\3\f\3\f\5\f\u00d0\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00dc\n\16\f\16\16\16\u00df\13\16\5\16\u00e1\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fe\n\17"+
		"\f\17\16\17\u0101\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0110\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u011c\n\17\f\17\16\17\u011f\13\17\7\17\u0121\n\17"+
		"\f\17\16\17\u0124\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0131\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u013d\n\17\f\17\16\17\u0140\13\17\5\17\u0142\n\17\3\17\3\17"+
		"\3\20\3\20\7\20\u0148\n\20\f\20\16\20\u014b\13\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0151\n\20\f\20\16\20\u0154\13\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u015b\n\20\3\20\3\20\3\20\7\20\u0160\n\20\f\20\16\20\u0163\13\20\5\20"+
		"\u0165\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u016c\n\20\7\20\u016e\n\20\f"+
		"\20\16\20\u0171\13\20\3\20\5\20\u0174\n\20\3\20\3\u00c9\3\6\21\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\5\6\3\2\3\4\3\2-.\3\2\30\31\4"+
		"\2\25\26..\2\u01d9\2%\3\2\2\2\4\65\3\2\2\2\6>\3\2\2\2\bK\3\2\2\2\nx\3"+
		"\2\2\2\f\u0082\3\2\2\2\16\u0086\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2"+
		"\2\2\24\u009d\3\2\2\2\26\u00af\3\2\2\2\30\u00d3\3\2\2\2\32\u00d6\3\2\2"+
		"\2\34\u00e4\3\2\2\2\36\u0173\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#"+
		"!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%!\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\7\2\2\3"+
		"(\'\3\2\2\2()\3\2\2\2)\3\3\2\2\2*\66\5\b\5\2+\66\5\n\6\2,\66\5\f\7\2-"+
		"\66\5\16\b\2.\66\5\20\t\2/\66\5\6\4\2\60\66\5\22\n\2\61\66\5\24\13\2\62"+
		"\66\5\26\f\2\63\66\5\30\r\2\64\66\5\34\17\2\65*\3\2\2\2\65+\3\2\2\2\65"+
		",\3\2\2\2\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2"+
		"\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\b\4\1"+
		"\289\7%\2\29:\5\6\4\2:;\7&\2\2;?\3\2\2\2<?\7\7\2\2=?\7.\2\2>\67\3\2\2"+
		"\2><\3\2\2\2>=\3\2\2\2?H\3\2\2\2@A\f\6\2\2AB\t\2\2\2BG\5\6\4\7CD\f\5\2"+
		"\2DE\t\3\2\2EG\5\6\4\6F@\3\2\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2I\7\3\2\2\2JH\3\2\2\2KN\7\t\2\2LM\7+\2\2MO\7\n\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OP\3\2\2\2PY\7.\2\2QT\7,\2\2RS\7+\2\2SU\7\n\2\2TR\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VX\7.\2\2WQ\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zi\3\2\2\2"+
		"[Y\3\2\2\2\\]\7\13\2\2]^\7.\2\2^_\7(\2\2_f\7-\2\2`a\7,\2\2ab\7.\2\2bc"+
		"\7(\2\2ce\7-\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2i\\\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2lv\7.\2\2mn\7\r\2\2ns\7"+
		".\2\2op\7,\2\2pr\7.\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2vm\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xy\7\36\2\2yz\7\34\2\2z{"+
		"\7%\2\2{|\t\4\2\2|}\7,\2\2}~\t\4\2\2~\177\7&\2\2\177\u0080\7\37\2\2\u0080"+
		"\u0081\7.\2\2\u0081\13\3\2\2\2\u0082\u0083\7.\2\2\u0083\u0084\7 \2\2\u0084"+
		"\u0085\7-\2\2\u0085\r\3\2\2\2\u0086\u0087\t\5\2\2\u0087\u0088\7.\2\2\u0088"+
		"\u0089\7\13\2\2\u0089\u008a\7.\2\2\u008a\17\3\2\2\2\u008b\u008c\7.\2\2"+
		"\u008c\u008f\7\35\2\2\u008d\u0090\5\6\4\2\u008e\u0090\5\b\5\2\u008f\u008d"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\7\32\2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u0094\7.\2\2\u0094\u0095\7\33\2\2\u0095\u0096\t\4"+
		"\2\2\u0096\u0097\7\13\2\2\u0097\u0098\t\4\2\2\u0098\u0099\7(\2\2\u0099"+
		"\u009a\t\4\2\2\u009a\u009b\7\f\2\2\u009b\u009c\7.\2\2\u009c\23\3\2\2\2"+
		"\u009d\u009e\7\36\2\2\u009e\u009f\7!\2\2\u009f\u00a1\7%\2\2\u00a0\u00a2"+
		"\7\"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\7,\2\2\u00a4\u00a5\7-\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\7#\2"+
		"\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab"+
		"\7$\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7.\2\2\u00ad\u00ae\7&\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7.\2\2\u00b1\u00ba\7%\2\2"+
		"\u00b2\u00b7\7.\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b6\7.\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c9\7&\2\2\u00bd\u00c8\5\b\5\2\u00be"+
		"\u00c8\5\n\6\2\u00bf\u00c8\5\16\b\2\u00c0\u00c8\5\22\n\2\u00c1\u00c8\5"+
		"\6\4\2\u00c2\u00c8\5\20\t\2\u00c3\u00c8\5\f\7\2\u00c4\u00c8\5\30\r\2\u00c5"+
		"\u00c8\5\24\13\2\u00c6\u00c8\5\34\17\2\u00c7\u00bd\3\2\2\2\u00c7\u00be"+
		"\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cf\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7\20"+
		"\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00d0\7.\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\17"+
		"\2\2\u00d2\27\3\2\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\5\32\16\2\u00d5"+
		"\31\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7\u00e0\7%\2\2\u00d8\u00dd\7.\2\2\u00d9"+
		"\u00da\7,\2\2\u00da\u00dc\t\4\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\7&\2\2\u00e3\33\3\2\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6"+
		"\5\36\20\2\u00e6\u00f1\7\22\2\2\u00e7\u00f2\5\b\5\2\u00e8\u00f2\5\n\6"+
		"\2\u00e9\u00f2\5\16\b\2\u00ea\u00f2\5\22\n\2\u00eb\u00f2\5\6\4\2\u00ec"+
		"\u00f2\5\20\t\2\u00ed\u00f2\5\f\7\2\u00ee\u00f2\5\30\r\2\u00ef\u00f2\5"+
		"\24\13\2\u00f0\u00f2\5\34\17\2\u00f1\u00e7\3\2\2\2\u00f1\u00e8\3\2\2\2"+
		"\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec"+
		"\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00ff\3\2\2\2\u00f3\u00fe\5\b\5\2\u00f4\u00fe\5\n"+
		"\6\2\u00f5\u00fe\5\16\b\2\u00f6\u00fe\5\22\n\2\u00f7\u00fe\5\6\4\2\u00f8"+
		"\u00fe\5\20\t\2\u00f9\u00fe\5\f\7\2\u00fa\u00fe\5\30\r\2\u00fb\u00fe\5"+
		"\24\13\2\u00fc\u00fe\5\34\17\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2"+
		"\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8"+
		"\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0122\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\23\2\2\u0103"+
		"\u0104\5\36\20\2\u0104\u010f\7\22\2\2\u0105\u0110\5\b\5\2\u0106\u0110"+
		"\5\n\6\2\u0107\u0110\5\16\b\2\u0108\u0110\5\22\n\2\u0109\u0110\5\6\4\2"+
		"\u010a\u0110\5\20\t\2\u010b\u0110\5\f\7\2\u010c\u0110\5\30\r\2\u010d\u0110"+
		"\5\24\13\2\u010e\u0110\5\34\17\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2\2"+
		"\2\u010f\u0107\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010a"+
		"\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u011d\3\2\2\2\u0111\u011c\5\b\5\2\u0112\u011c\5\n"+
		"\6\2\u0113\u011c\5\16\b\2\u0114\u011c\5\22\n\2\u0115\u011c\5\6\4\2\u0116"+
		"\u011c\5\20\t\2\u0117\u011c\5\f\7\2\u0118\u011c\5\30\r\2\u0119\u011c\5"+
		"\24\13\2\u011a\u011c\5\34\17\2\u011b\u0111\3\2\2\2\u011b\u0112\3\2\2\2"+
		"\u011b\u0113\3\2\2\2\u011b\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116"+
		"\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0102\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0141\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0130\7\24\2\2\u0126\u0131\5\b\5\2\u0127"+
		"\u0131\5\n\6\2\u0128\u0131\5\16\b\2\u0129\u0131\5\22\n\2\u012a\u0131\5"+
		"\6\4\2\u012b\u0131\5\20\t\2\u012c\u0131\5\f\7\2\u012d\u0131\5\30\r\2\u012e"+
		"\u0131\5\24\13\2\u012f\u0131\5\34\17\2\u0130\u0126\3\2\2\2\u0130\u0127"+
		"\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u012f\3\2\2\2\u0131\u013e\3\2\2\2\u0132\u013d\5\b\5\2\u0133"+
		"\u013d\5\n\6\2\u0134\u013d\5\16\b\2\u0135\u013d\5\22\n\2\u0136\u013d\5"+
		"\6\4\2\u0137\u013d\5\20\t\2\u0138\u013d\5\f\7\2\u0139\u013d\5\30\r\2\u013a"+
		"\u013d\5\24\13\2\u013b\u013d\5\34\17\2\u013c\u0132\3\2\2\2\u013c\u0133"+
		"\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0136\3\2\2\2\u013c"+
		"\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0125\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\27\2\2\u0144"+
		"\35\3\2\2\2\u0145\u0149\7%\2\2\u0146\u0148\7*\2\2\u0147\u0146\3\2\2\2"+
		"\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\t\6\2\2\u014d\u0174\7&\2\2\u014e"+
		"\u0152\7%\2\2\u014f\u0151\7*\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015a\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u015b\7-\2\2\u0156\u015b\7.\2\2\u0157\u015b\7\25\2\2\u0158"+
		"\u015b\7\26\2\2\u0159\u015b\5\36\20\2\u015a\u0155\3\2\2\2\u015a\u0156"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u016f\3\2\2\2\u015c\u0165\7(\2\2\u015d\u0161\7)\2\2\u015e\u0160\7*\2"+
		"\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u015c\3\2\2\2\u0164"+
		"\u015d\3\2\2\2\u0165\u016b\3\2\2\2\u0166\u016c\7-\2\2\u0167\u016c\7.\2"+
		"\2\u0168\u016c\7\25\2\2\u0169\u016c\7\26\2\2\u016a\u016c\5\36\20\2\u016b"+
		"\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016a\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0164\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7&\2\2\u0173\u0145\3\2\2\2\u0173"+
		"\u014e\3\2\2\2\u0174\37\3\2\2\2,#%(\65>FHNTYfisv\u008f\u00a1\u00b7\u00ba"+
		"\u00c7\u00c9\u00cf\u00dd\u00e0\u00f1\u00fd\u00ff\u010f\u011b\u011d\u0122"+
		"\u0130\u013c\u013e\u0141\u0149\u0152\u015a\u0161\u0164\u016b\u016f\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}