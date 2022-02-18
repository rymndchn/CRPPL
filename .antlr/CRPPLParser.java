// Generated from c:\Users\james\Documents\MSADPRG\CRPPL\CRPPL\CRPPL.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUM_EXPR=5, GET=6, OF=7, FOR=8, ON=9, 
		GROUPBY=10, CREATEFUNCTION=11, ENDFUNCTION=12, RETURN=13, IF=14, THEN=15, 
		ELSE_IF=16, ELSE=17, TRUE=18, FALSE=19, END_IF=20, NEWCOLUMN=21, DELETECOLUMN=22, 
		CHANGEVALUE=23, TO=24, IMPORTFILE=25, ASSIGNEMT_OPERATOR=26, RESERVEDWORD_DO=27, 
		RESERVEDWORD_CONSTANT=28, GRAPH=29, TYPE=30, LABELONE=31, LABELTWO=32, 
		OPENPARENTHESIS=33, CLOSEPARENTHESIS=34, RESERVEDWORD=35, OPERATING_FUNCTION=36, 
		OPERATOR=37, SEPARATOR=38, LITERAL=39, IDENTIFIER=40, WHITESPACE=41, NEXTLINE=42, 
		TAB=43, CARRIAGERETURN=44, NEGATOR=45;
	public static final int
		RULE_multiexpr = 0, RULE_validexpr = 1, RULE_expr = 2, RULE_generalquery = 3, 
		RULE_importfile = 4, RULE_defineconstant = 5, RULE_altercolumn = 6, RULE_changevalue = 7, 
		RULE_graphquery = 8, RULE_createfunction = 9, RULE_functioncall = 10, 
		RULE_functionprototype = 11, RULE_conditionalstatement = 12, RULE_booleanstatement = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiexpr", "validexpr", "expr", "generalquery", "importfile", "defineconstant", 
			"altercolumn", "changevalue", "graphquery", "createfunction", "functioncall", 
			"functionprototype", "conditionalstatement", "booleanstatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
			null, null, null, null, null, null, "' '", "'\n'", "'\t'", "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUM_EXPR", "GET", "OF", "FOR", "ON", "GROUPBY", 
			"CREATEFUNCTION", "ENDFUNCTION", "RETURN", "IF", "THEN", "ELSE_IF", "ELSE", 
			"TRUE", "FALSE", "END_IF", "NEWCOLUMN", "DELETECOLUMN", "CHANGEVALUE", 
			"TO", "IMPORTFILE", "ASSIGNEMT_OPERATOR", "RESERVEDWORD_DO", "RESERVEDWORD_CONSTANT", 
			"GRAPH", "TYPE", "LABELONE", "LABELTWO", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"RESERVEDWORD", "OPERATING_FUNCTION", "OPERATOR", "SEPARATOR", "LITERAL", 
			"IDENTIFIER", "WHITESPACE", "NEXTLINE", "TAB", "CARRIAGERETURN", "NEGATOR"
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
	}

	public final MultiexprContext multiexpr() throws RecognitionException {
		MultiexprContext _localctx = new MultiexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28);
					validexpr();
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35);
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
	}

	public final ValidexprContext validexpr() throws RecognitionException {
		ValidexprContext _localctx = new ValidexprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_validexpr);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				generalquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				importfile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				defineconstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				altercolumn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				changevalue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				graphquery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				createfunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				functioncall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPARENTHESIS:
				{
				setState(50);
				match(OPENPARENTHESIS);
				setState(51);
				expr(0);
				setState(52);
				match(CLOSEPARENTHESIS);
				}
				break;
			case NUM_EXPR:
				{
				setState(54);
				((ExprContext)_localctx).value = match(NUM_EXPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
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
						setState(59);
						((ExprContext)_localctx).right = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(61);
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
						setState(62);
						((ExprContext)_localctx).right = expr(3);
						}
						break;
					}
					} 
				}
				setState(67);
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
	}

	public final GeneralqueryContext generalquery() throws RecognitionException {
		GeneralqueryContext _localctx = new GeneralqueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_generalquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(GET);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATING_FUNCTION) {
				{
				setState(69);
				match(OPERATING_FUNCTION);
				setState(70);
				match(OF);
				}
			}

			setState(73);
			match(IDENTIFIER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(74);
				match(SEPARATOR);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATING_FUNCTION) {
					{
					setState(75);
					match(OPERATING_FUNCTION);
					setState(76);
					match(OF);
					}
				}

				setState(79);
				match(IDENTIFIER);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(85);
				match(FOR);
				setState(86);
				match(IDENTIFIER);
				setState(87);
				match(OPERATOR);
				setState(88);
				match(LITERAL);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(89);
					match(SEPARATOR);
					setState(90);
					match(IDENTIFIER);
					setState(91);
					match(OPERATOR);
					setState(92);
					match(LITERAL);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(ON);
			setState(101);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPBY) {
				{
				setState(102);
				match(GROUPBY);
				setState(103);
				match(IDENTIFIER);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(104);
					match(SEPARATOR);
					setState(105);
					match(IDENTIFIER);
					}
					}
					setState(110);
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
	}

	public final ImportfileContext importfile() throws RecognitionException {
		ImportfileContext _localctx = new ImportfileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(RESERVEDWORD_DO);
			setState(114);
			match(IMPORTFILE);
			setState(115);
			match(OPENPARENTHESIS);
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(SEPARATOR);
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
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
	}

	public final DefineconstantContext defineconstant() throws RecognitionException {
		DefineconstantContext _localctx = new DefineconstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IDENTIFIER);
			setState(122);
			match(RESERVEDWORD_CONSTANT);
			setState(123);
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
	}

	public final AltercolumnContext altercolumn() throws RecognitionException {
		AltercolumnContext _localctx = new AltercolumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_altercolumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==NEWCOLUMN || _la==DELETECOLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(FOR);
			setState(128);
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
	}

	public final ChangevalueContext changevalue() throws RecognitionException {
		ChangevalueContext _localctx = new ChangevalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_changevalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CHANGEVALUE);
			setState(131);
			match(OF);
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(TO);
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(FOR);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(OPERATOR);
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			match(ON);
			setState(140);
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
		public TerminalNode TYPE() { return getToken(CRPPLParser.TYPE, 0); }
		public GraphqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphquery; }
	}

	public final GraphqueryContext graphquery() throws RecognitionException {
		GraphqueryContext _localctx = new GraphqueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_graphquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RESERVEDWORD_DO);
			setState(143);
			match(GRAPH);
			setState(144);
			match(OPENPARENTHESIS);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(145);
				match(TYPE);
				}
			}

			setState(148);
			match(SEPARATOR);
			setState(149);
			match(LITERAL);
			setState(150);
			match(ASSIGNEMT_OPERATOR);
			setState(151);
			match(LABELONE);
			setState(152);
			match(SEPARATOR);
			setState(153);
			match(LITERAL);
			setState(154);
			match(ASSIGNEMT_OPERATOR);
			setState(155);
			match(LABELTWO);
			setState(156);
			match(SEPARATOR);
			setState(157);
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
		public List<ChangevalueContext> changevalue() {
			return getRuleContexts(ChangevalueContext.class);
		}
		public ChangevalueContext changevalue(int i) {
			return getRuleContext(ChangevalueContext.class,i);
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
	}

	public final CreatefunctionContext createfunction() throws RecognitionException {
		CreatefunctionContext _localctx = new CreatefunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(CREATEFUNCTION);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(OPENPARENTHESIS);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(162);
				match(IDENTIFIER);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(163);
					match(SEPARATOR);
					setState(164);
					match(IDENTIFIER);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
			match(CLOSEPARENTHESIS);
			{
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(173);
						generalquery();
						}
						break;
					case 2:
						{
						setState(174);
						importfile();
						}
						break;
					case 3:
						{
						setState(175);
						altercolumn();
						}
						break;
					case 4:
						{
						setState(176);
						changevalue();
						}
						break;
					case 5:
						{
						setState(177);
						defineconstant();
						}
						break;
					case 6:
						{
						setState(178);
						functioncall();
						}
						break;
					case 7:
						{
						setState(179);
						graphquery();
						}
						break;
					case 8:
						{
						setState(180);
						conditionalstatement();
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(186);
				match(RETURN);
				}
				break;
			case 2:
				{
				{
				setState(187);
				match(RETURN);
				setState(188);
				match(IDENTIFIER);
				}
				}
				break;
			}
			setState(191);
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
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(RESERVEDWORD_DO);
			setState(194);
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
	}

	public final FunctionprototypeContext functionprototype() throws RecognitionException {
		FunctionprototypeContext _localctx = new FunctionprototypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionprototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IDENTIFIER);
			setState(197);
			match(OPENPARENTHESIS);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(198);
				match(IDENTIFIER);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(199);
					match(SEPARATOR);
					setState(200);
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
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(208);
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
	}

	public final ConditionalstatementContext conditionalstatement() throws RecognitionException {
		ConditionalstatementContext _localctx = new ConditionalstatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IF);
			{
			setState(211);
			booleanstatement();
			}
			setState(212);
			match(THEN);
			{
			setState(213);
			validexpr();
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(214);
				validexpr();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(220);
				match(ELSE_IF);
				{
				setState(221);
				booleanstatement();
				}
				setState(222);
				match(THEN);
				{
				setState(223);
				validexpr();
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(224);
					validexpr();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(235);
				match(ELSE);
				{
				setState(236);
				validexpr();
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << CREATEFUNCTION) | (1L << IF) | (1L << NEWCOLUMN) | (1L << DELETECOLUMN) | (1L << CHANGEVALUE) | (1L << RESERVEDWORD_DO) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(237);
					validexpr();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(245);
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
		public BooleanstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanstatement; }
	}

	public final BooleanstatementContext booleanstatement() throws RecognitionException {
		BooleanstatementContext _localctx = new BooleanstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(247);
				match(OPENPARENTHESIS);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATOR) {
					{
					setState(248);
					match(NEGATOR);
					}
				}

				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				match(CLOSEPARENTHESIS);
				}
				break;
			case 2:
				{
				setState(253);
				match(OPENPARENTHESIS);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATOR) {
					{
					setState(254);
					match(NEGATOR);
					}
				}

				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL:
					{
					setState(257);
					match(LITERAL);
					}
					break;
				case IDENTIFIER:
					{
					setState(258);
					match(IDENTIFIER);
					}
					break;
				case TRUE:
					{
					setState(259);
					match(TRUE);
					}
					break;
				case FALSE:
					{
					setState(260);
					match(FALSE);
					}
					break;
				case OPENPARENTHESIS:
					{
					setState(261);
					booleanstatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(264);
					match(OPERATOR);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEGATOR) {
						{
						setState(265);
						match(NEGATOR);
						}
					}

					setState(273);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LITERAL:
						{
						setState(268);
						match(LITERAL);
						}
						break;
					case IDENTIFIER:
						{
						setState(269);
						match(IDENTIFIER);
						}
						break;
					case TRUE:
						{
						setState(270);
						match(TRUE);
						}
						break;
					case FALSE:
						{
						setState(271);
						match(FALSE);
						}
						break;
					case OPENPARENTHESIS:
						{
						setState(272);
						booleanstatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\5\2$\n"+
		"\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4"+
		"E\13\4\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\7\5S\n\5\f\5"+
		"\16\5V\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5\5"+
		"\5e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\5\5r\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0095\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\5\13\u00ad\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b8\n\13\f\13\16\13\u00bb\13"+
		"\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00cc\n\r\f\r\16\r\u00cf\13\r\5\r\u00d1\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00da\n\16\f\16\16\16\u00dd\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\7\16\u00e9\n\16\f"+
		"\16\16\16\u00ec\13\16\3\16\3\16\3\16\7\16\u00f1\n\16\f\16\16\16\u00f4"+
		"\13\16\5\16\u00f6\n\16\3\16\3\16\3\17\3\17\5\17\u00fc\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0102\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0109\n\17\3\17"+
		"\3\17\5\17\u010d\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0114\n\17\7\17\u0116"+
		"\n\17\f\17\16\17\u0119\13\17\3\17\5\17\u011c\n\17\3\17\3\u00b9\3\6\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\3\4\3\2\5\6\3\2)*\3\2\27"+
		"\30\4\2\24\25**\2\u0145\2#\3\2\2\2\4\61\3\2\2\2\69\3\2\2\2\bF\3\2\2\2"+
		"\ns\3\2\2\2\f{\3\2\2\2\16\177\3\2\2\2\20\u0084\3\2\2\2\22\u0090\3\2\2"+
		"\2\24\u00a1\3\2\2\2\26\u00c3\3\2\2\2\30\u00c6\3\2\2\2\32\u00d4\3\2\2\2"+
		"\34\u011b\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"$\3\2\2\2#\37\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\7\2\2\3&%\3\2\2\2"+
		"&\'\3\2\2\2\'\3\3\2\2\2(\62\5\b\5\2)\62\5\n\6\2*\62\5\f\7\2+\62\5\16\b"+
		"\2,\62\5\20\t\2-\62\5\22\n\2.\62\5\24\13\2/\62\5\26\f\2\60\62\5\32\16"+
		"\2\61(\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2"+
		"\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\b\4\1\2"+
		"\64\65\7#\2\2\65\66\5\6\4\2\66\67\7$\2\2\67:\3\2\2\28:\7\7\2\29\63\3\2"+
		"\2\298\3\2\2\2:C\3\2\2\2;<\f\5\2\2<=\t\2\2\2=B\5\6\4\6>?\f\4\2\2?@\t\3"+
		"\2\2@B\5\6\4\5A;\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\7\3"+
		"\2\2\2EC\3\2\2\2FI\7\b\2\2GH\7&\2\2HJ\7\t\2\2IG\3\2\2\2IJ\3\2\2\2JK\3"+
		"\2\2\2KT\7*\2\2LO\7(\2\2MN\7&\2\2NP\7\t\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2QS\7*\2\2RL\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2Ud\3\2\2\2VT\3\2"+
		"\2\2WX\7\n\2\2XY\7*\2\2YZ\7\'\2\2Za\7)\2\2[\\\7(\2\2\\]\7*\2\2]^\7\'\2"+
		"\2^`\7)\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2dW\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\13\2\2gq\7*\2\2hi\7\f\2\2in\7*\2"+
		"\2jk\7(\2\2km\7*\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2qh\3\2\2\2qr\3\2\2\2r\t\3\2\2\2st\7\35\2\2tu\7\33\2\2uv\7#\2"+
		"\2vw\t\4\2\2wx\7(\2\2xy\t\4\2\2yz\7$\2\2z\13\3\2\2\2{|\7*\2\2|}\7\36\2"+
		"\2}~\7)\2\2~\r\3\2\2\2\177\u0080\t\5\2\2\u0080\u0081\7*\2\2\u0081\u0082"+
		"\7\n\2\2\u0082\u0083\7*\2\2\u0083\17\3\2\2\2\u0084\u0085\7\31\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\7*\2\2\u0087\u0088\7\32\2\2\u0088\u0089\t\4"+
		"\2\2\u0089\u008a\7\n\2\2\u008a\u008b\t\4\2\2\u008b\u008c\7\'\2\2\u008c"+
		"\u008d\t\4\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7*\2\2\u008f\21\3\2\2"+
		"\2\u0090\u0091\7\35\2\2\u0091\u0092\7\37\2\2\u0092\u0094\7#\2\2\u0093"+
		"\u0095\7 \2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7(\2\2\u0097\u0098\7)\2\2\u0098\u0099\7\34\2\2\u0099"+
		"\u009a\7!\2\2\u009a\u009b\7(\2\2\u009b\u009c\7)\2\2\u009c\u009d\7\34\2"+
		"\2\u009d\u009e\7\"\2\2\u009e\u009f\7(\2\2\u009f\u00a0\t\4\2\2\u00a0\23"+
		"\3\2\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\7*\2\2\u00a3\u00ac\7#\2\2\u00a4"+
		"\u00a9\7*\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a8\7*\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b9\7$\2\2\u00af\u00b8\5\b\5\2\u00b0\u00b8\5\n"+
		"\6\2\u00b1\u00b8\5\16\b\2\u00b2\u00b8\5\20\t\2\u00b3\u00b8\5\f\7\2\u00b4"+
		"\u00b8\5\26\f\2\u00b5\u00b8\5\22\n\2\u00b6\u00b8\5\32\16\2\u00b7\u00af"+
		"\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\7\17\2\2\u00bd\u00be\7"+
		"\17\2\2\u00be\u00c0\7*\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\25\3\2\2"+
		"\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\5\30\r\2\u00c5\27\3\2\2\2\u00c6\u00c7"+
		"\7*\2\2\u00c7\u00d0\7#\2\2\u00c8\u00cd\7*\2\2\u00c9\u00ca\7(\2\2\u00ca"+
		"\u00cc\t\4\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7$"+
		"\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\5\34\17\2\u00d6"+
		"\u00d7\7\21\2\2\u00d7\u00db\5\4\3\2\u00d8\u00da\5\4\3\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00ea\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\22\2\2\u00df\u00e0\5"+
		"\34\17\2\u00e0\u00e1\7\21\2\2\u00e1\u00e5\5\4\3\2\u00e2\u00e4\5\4\3\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00de\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f5\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00f2\5\4\3\2\u00ef"+
		"\u00f1\5\4\3\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00ed\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\26"+
		"\2\2\u00f8\33\3\2\2\2\u00f9\u00fb\7#\2\2\u00fa\u00fc\7/\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\t\6\2\2\u00fe"+
		"\u011c\7$\2\2\u00ff\u0101\7#\2\2\u0100\u0102\7/\2\2\u0101\u0100\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0108\3\2\2\2\u0103\u0109\7)\2\2\u0104\u0109"+
		"\7*\2\2\u0105\u0109\7\24\2\2\u0106\u0109\7\25\2\2\u0107\u0109\5\34\17"+
		"\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u0117\3\2\2\2\u010a\u010c\7\'\2\2\u010b"+
		"\u010d\7/\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0113\3\2"+
		"\2\2\u010e\u0114\7)\2\2\u010f\u0114\7*\2\2\u0110\u0114\7\24\2\2\u0111"+
		"\u0114\7\25\2\2\u0112\u0114\5\34\17\2\u0113\u010e\3\2\2\2\u0113\u010f"+
		"\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u010a\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011c\7$\2\2\u011b\u00f9\3\2\2\2\u011b\u00ff\3\2\2\2\u011c\35\3\2\2\2"+
		"$!#&\619ACIOTadnq\u0094\u00a9\u00ac\u00b7\u00b9\u00bf\u00cd\u00d0\u00db"+
		"\u00e5\u00ea\u00f2\u00f5\u00fb\u0101\u0108\u010c\u0113\u0117\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}