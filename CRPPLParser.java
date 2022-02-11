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
		T__0=1, T__1=2, T__2=3, T__3=4, NUM_EXPR=5, GET=6, OF=7, FOR=8, CREATEFUNCTION=9, 
		ENDFUNCTION=10, RETURN=11, IF=12, THEN=13, ELSE_IF=14, ELSE=15, TRUE=16, 
		FALSE=17, END_IF=18, NEWCOLUMN=19, ALTERCOLUMN=20, DELETECOLUMN=21, IMPORTFILE=22, 
		ASSIGNEMT_OPERATOR=23, RESERVEDWORD_DO=24, RESERVEDWORD_CONSTANT=25, GRAPH=26, 
		TYPE=27, LABELONE=28, LABELTWO=29, OPENPARENTHESIS=30, CLOSEPARENTHESIS=31, 
		RESERVEDWORD=32, OPERATING_FUNCTION=33, OPERATOR=34, SEPARATOR=35, LITERAL=36, 
		IDENTIFIER=37, WHITESPACE=38, NEXTLINE=39, TAB=40, CARRIAGERETURN=41;
	public static final int
		RULE_multiexpr = 0, RULE_validexpr = 1, RULE_expr = 2, RULE_generalquery = 3, 
		RULE_importfile = 4, RULE_defineconstant = 5, RULE_altercolumn = 6, RULE_graphquery = 7, 
		RULE_createfunction = 8, RULE_functioncall = 9, RULE_functionprototype = 10, 
		RULE_conditionalstatement = 11, RULE_booleanstatement = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiexpr", "validexpr", "expr", "generalquery", "importfile", "defineconstant", 
			"altercolumn", "graphquery", "createfunction", "functioncall", "functionprototype", 
			"conditionalstatement", "booleanstatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'('", "')'", null, null, null, 
			null, null, null, "' '", "'\n'", "'\t'", "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUM_EXPR", "GET", "OF", "FOR", "CREATEFUNCTION", 
			"ENDFUNCTION", "RETURN", "IF", "THEN", "ELSE_IF", "ELSE", "TRUE", "FALSE", 
			"END_IF", "NEWCOLUMN", "ALTERCOLUMN", "DELETECOLUMN", "IMPORTFILE", "ASSIGNEMT_OPERATOR", 
			"RESERVEDWORD_DO", "RESERVEDWORD_CONSTANT", "GRAPH", "TYPE", "LABELONE", 
			"LABELTWO", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "RESERVEDWORD", "OPERATING_FUNCTION", 
			"OPERATOR", "SEPARATOR", "LITERAL", "IDENTIFIER", "WHITESPACE", "NEXTLINE", 
			"TAB", "CARRIAGERETURN"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					validexpr();
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				generalquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				importfile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				defineconstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				altercolumn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				graphquery();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				createfunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				functioncall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPARENTHESIS:
				{
				setState(47);
				match(OPENPARENTHESIS);
				setState(48);
				expr(0);
				setState(49);
				match(CLOSEPARENTHESIS);
				}
				break;
			case NUM_EXPR:
				{
				setState(51);
				((ExprContext)_localctx).value = match(NUM_EXPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(55);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						((ExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(58);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						((ExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(64);
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
		public List<TerminalNode> GET() { return getTokens(CRPPLParser.GET); }
		public TerminalNode GET(int i) {
			return getToken(CRPPLParser.GET, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
		public TerminalNode OPERATING_FUNCTION() { return getToken(CRPPLParser.OPERATING_FUNCTION, 0); }
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
			setState(65);
			match(GET);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATING_FUNCTION) {
				{
				setState(66);
				match(OPERATING_FUNCTION);
				setState(67);
				match(OF);
				}
			}

			setState(70);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(71);
				match(SEPARATOR);
				setState(72);
				match(GET);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(73);
					match(OPERATOR);
					setState(74);
					match(OF);
					}
				}

				setState(77);
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
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(83);
				match(FOR);
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				match(OPERATOR);
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(87);
					match(SEPARATOR);
					setState(88);
					_la = _input.LA(1);
					if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(89);
					match(OPERATOR);
					setState(90);
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
					setState(95);
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
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
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
			setState(98);
			match(RESERVEDWORD_DO);
			setState(99);
			match(IMPORTFILE);
			setState(100);
			match(OPENPARENTHESIS);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(SEPARATOR);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
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
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(RESERVEDWORD_CONSTANT);
			setState(108);
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
		public TerminalNode FOR() { return getToken(CRPPLParser.FOR, 0); }
		public TerminalNode NEWCOLUMN() { return getToken(CRPPLParser.NEWCOLUMN, 0); }
		public TerminalNode DELETECOLUMN() { return getToken(CRPPLParser.DELETECOLUMN, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CRPPLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CRPPLParser.IDENTIFIER, i);
		}
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
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==NEWCOLUMN || _la==DELETECOLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			match(FOR);
			setState(113);
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
		enterRule(_localctx, 14, RULE_graphquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(RESERVEDWORD_DO);
			setState(116);
			match(GRAPH);
			setState(117);
			match(OPENPARENTHESIS);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(118);
				match(TYPE);
				}
			}

			setState(121);
			match(SEPARATOR);
			setState(122);
			match(LITERAL);
			setState(123);
			match(ASSIGNEMT_OPERATOR);
			setState(124);
			match(LABELONE);
			setState(125);
			match(SEPARATOR);
			setState(126);
			match(LITERAL);
			setState(127);
			match(ASSIGNEMT_OPERATOR);
			setState(128);
			match(LABELTWO);
			setState(129);
			match(SEPARATOR);
			setState(130);
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
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
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
		enterRule(_localctx, 16, RULE_createfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CREATEFUNCTION);
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(OPENPARENTHESIS);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(135);
				match(IDENTIFIER);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(136);
					match(SEPARATOR);
					setState(137);
					match(IDENTIFIER);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
			match(CLOSEPARENTHESIS);
			{
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(146);
						generalquery();
						}
						break;
					case 2:
						{
						setState(147);
						importfile();
						}
						break;
					case 3:
						{
						setState(148);
						altercolumn();
						}
						break;
					case 4:
						{
						setState(149);
						graphquery();
						}
						break;
					case 5:
						{
						setState(150);
						conditionalstatement();
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(156);
				match(RETURN);
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(157);
					match(IDENTIFIER);
					}
					break;
				case RESERVEDWORD_DO:
					{
					setState(158);
					functioncall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(163);
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
		enterRule(_localctx, 18, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(RESERVEDWORD_DO);
			setState(166);
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
		public List<TerminalNode> LITERAL() { return getTokens(CRPPLParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(CRPPLParser.LITERAL, i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(CRPPLParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CRPPLParser.SEPARATOR, i);
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
		enterRule(_localctx, 20, RULE_functionprototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(OPENPARENTHESIS);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL || _la==IDENTIFIER) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(171);
					match(SEPARATOR);
					setState(172);
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
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
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
		public List<ValidexprContext> validexpr() {
			return getRuleContexts(ValidexprContext.class);
		}
		public ValidexprContext validexpr(int i) {
			return getRuleContext(ValidexprContext.class,i);
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
		enterRule(_localctx, 22, RULE_conditionalstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(IF);
			{
			setState(183);
			booleanstatement();
			}
			setState(184);
			match(THEN);
			{
			setState(185);
			validexpr();
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(186);
				validexpr();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(192);
				match(ELSE_IF);
				{
				setState(193);
				booleanstatement();
				}
				setState(194);
				match(THEN);
				{
				setState(195);
				validexpr();
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(196);
					validexpr();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(207);
				match(ELSE);
				{
				setState(208);
				validexpr();
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(209);
					validexpr();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(217);
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
		public List<TerminalNode> OPERATOR() { return getTokens(CRPPLParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(CRPPLParser.OPERATOR, i);
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
		enterRule(_localctx, 24, RULE_booleanstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(219);
				match(OPENPARENTHESIS);
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 2:
				{
				setState(222);
				match(OPENPARENTHESIS);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL:
					{
					setState(223);
					match(LITERAL);
					}
					break;
				case IDENTIFIER:
					{
					setState(224);
					match(IDENTIFIER);
					}
					break;
				case TRUE:
					{
					setState(225);
					match(TRUE);
					}
					break;
				case FALSE:
					{
					setState(226);
					match(FALSE);
					}
					break;
				case OPENPARENTHESIS:
					{
					setState(227);
					booleanstatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(230);
					match(OPERATOR);
					setState(236);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LITERAL:
						{
						setState(231);
						match(LITERAL);
						}
						break;
					case IDENTIFIER:
						{
						setState(232);
						match(IDENTIFIER);
						}
						break;
					case TRUE:
						{
						setState(233);
						match(TRUE);
						}
						break;
					case FALSE:
						{
						setState(234);
						match(FALSE);
						}
						break;
					case OPENPARENTHESIS:
						{
						setState(235);
						booleanstatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\5\2\"\n\2\3\2"+
		"\5\2%\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3"+
		"\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\7\5Q\n\5\f\5\16\5T\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\5\5c\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\5\n\u0092\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\n\3\n\3\n\5"+
		"\n\u00a2\n\n\5\n\u00a4\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00b0\n\f\f\f\16\f\u00b3\13\f\5\f\u00b5\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c8"+
		"\n\r\f\r\16\r\u00cb\13\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\3\r"+
		"\7\r\u00d5\n\r\f\r\16\r\u00d8\13\r\5\r\u00da\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00ef\n\16\7\16\u00f1\n\16\f\16\16\16\u00f4\13\16\3\16\5\16"+
		"\u00f7\n\16\3\16\3\u009b\3\6\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3"+
		"\2\3\4\3\2\5\6\3\2&\'\4\2\25\25\27\27\4\2\22\23\'\'\2\u0118\2!\3\2\2\2"+
		"\4.\3\2\2\2\6\66\3\2\2\2\bC\3\2\2\2\nd\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2"+
		"\20u\3\2\2\2\22\u0086\3\2\2\2\24\u00a7\3\2\2\2\26\u00aa\3\2\2\2\30\u00b8"+
		"\3\2\2\2\32\u00f6\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\35\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#"+
		"%\7\2\2\3$#\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&/\5\b\5\2\'/\5\n\6\2(/\5\f\7"+
		"\2)/\5\16\b\2*/\5\20\t\2+/\5\22\n\2,/\5\24\13\2-/\5\30\r\2.&\3\2\2\2."+
		"\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2"+
		"/\5\3\2\2\2\60\61\b\4\1\2\61\62\7 \2\2\62\63\5\6\4\2\63\64\7!\2\2\64\67"+
		"\3\2\2\2\65\67\7\7\2\2\66\60\3\2\2\2\66\65\3\2\2\2\67@\3\2\2\289\f\5\2"+
		"\29:\t\2\2\2:?\5\6\4\6;<\f\4\2\2<=\t\3\2\2=?\5\6\4\5>8\3\2\2\2>;\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CF\7\b\2\2DE\7#\2"+
		"\2EG\7\t\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HR\t\4\2\2IJ\7%\2\2JM\7\b\2"+
		"\2KL\7$\2\2LN\7\t\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\t\4\2\2PI\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2Sb\3\2\2\2TR\3\2\2\2UV\7\n\2\2VW\t\4\2"+
		"\2WX\7$\2\2X_\t\4\2\2YZ\7%\2\2Z[\t\4\2\2[\\\7$\2\2\\^\t\4\2\2]Y\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bU\3\2\2\2bc\3\2\2"+
		"\2c\t\3\2\2\2de\7\32\2\2ef\7\30\2\2fg\7 \2\2gh\t\4\2\2hi\7%\2\2ij\t\4"+
		"\2\2jk\7!\2\2k\13\3\2\2\2lm\7\'\2\2mn\7\33\2\2no\7&\2\2o\r\3\2\2\2pq\t"+
		"\5\2\2qr\t\4\2\2rs\7\n\2\2st\t\4\2\2t\17\3\2\2\2uv\7\32\2\2vw\7\34\2\2"+
		"wy\7 \2\2xz\7\35\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7%\2\2|}\7&\2\2}"+
		"~\7\31\2\2~\177\7\36\2\2\177\u0080\7%\2\2\u0080\u0081\7&\2\2\u0081\u0082"+
		"\7\31\2\2\u0082\u0083\7\37\2\2\u0083\u0084\7%\2\2\u0084\u0085\t\4\2\2"+
		"\u0085\21\3\2\2\2\u0086\u0087\7\13\2\2\u0087\u0088\7\'\2\2\u0088\u0091"+
		"\7 \2\2\u0089\u008e\7\'\2\2\u008a\u008b\7%\2\2\u008b\u008d\7\'\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009b\7!\2\2\u0094\u009a\5\b"+
		"\5\2\u0095\u009a\5\n\6\2\u0096\u009a\5\16\b\2\u0097\u009a\5\20\t\2\u0098"+
		"\u009a\5\30\r\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a1\7\r\2\2\u009f\u00a2\7\'\2\2\u00a0\u00a2\5\24\13\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\23\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\5\26\f\2\u00a9\25\3\2\2\2"+
		"\u00aa\u00ab\7\'\2\2\u00ab\u00b4\7 \2\2\u00ac\u00b1\t\4\2\2\u00ad\u00ae"+
		"\7%\2\2\u00ae\u00b0\t\4\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7!\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5\32\16"+
		"\2\u00ba\u00bb\7\17\2\2\u00bb\u00bf\5\4\3\2\u00bc\u00be\5\4\3\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00ce\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\20\2\2\u00c3"+
		"\u00c4\5\32\16\2\u00c4\u00c5\7\17\2\2\u00c5\u00c9\5\4\3\2\u00c6\u00c8"+
		"\5\4\3\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c2\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d9\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d6\5"+
		"\4\3\2\u00d3\u00d5\5\4\3\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\7\24\2\2\u00dc\31\3\2\2\2\u00dd\u00de\7 \2\2\u00de\u00df\t\6\2"+
		"\2\u00df\u00f7\7!\2\2\u00e0\u00e6\7 \2\2\u00e1\u00e7\7&\2\2\u00e2\u00e7"+
		"\7\'\2\2\u00e3\u00e7\7\22\2\2\u00e4\u00e7\7\23\2\2\u00e5\u00e7\5\32\16"+
		"\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f2\3\2\2\2\u00e8\u00ee\7$\2\2\u00e9"+
		"\u00ef\7&\2\2\u00ea\u00ef\7\'\2\2\u00eb\u00ef\7\22\2\2\u00ec\u00ef\7\23"+
		"\2\2\u00ed\u00ef\5\32\16\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00e8\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7!"+
		"\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e0\3\2\2\2\u00f7\33\3\2\2\2 \37!$.\66"+
		">@FMR_by\u008e\u0091\u0099\u009b\u00a1\u00a3\u00b1\u00b4\u00bf\u00c9\u00ce"+
		"\u00d6\u00d9\u00e6\u00ee\u00f2\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}