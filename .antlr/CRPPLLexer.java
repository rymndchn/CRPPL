// Generated from c:\Users\james\Documents\MSADPRG\CRPPL\CRPPL\CRPPL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CRPPLLexer extends Lexer {
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
		TAB=43, CARRIAGERETURN=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
			"W", "X", "Y", "Z", "LOWERCASE", "UPPERCASE", "NUMBERS", "UNDERSCORE", 
			"ALPHANUMERIC", "NUM_EXPR", "GET", "OF", "FOR", "ON", "GROUPBY", "CREATEFUNCTION", 
			"ENDFUNCTION", "RETURN", "IF", "THEN", "ELSE_IF", "ELSE", "TRUE", "FALSE", 
			"END_IF", "NEWCOLUMN", "DELETECOLUMN", "CHANGEVALUE", "TO", "IMPORTFILE", 
			"ASSIGNEMT_OPERATOR", "RESERVEDWORD_DO", "RESERVEDWORD_CONSTANT", "GRAPH", 
			"TYPE", "LABELONE", "LABELTWO", "PIE", "BAR", "LINE", "X_AXIS", "LABEL", 
			"Y_AXIS", "VALUE", "SUM", "MIN", "MEAN", "MAX", "EQUALS", "GREATERTHAN", 
			"GREATERTHANEQUAL", "LESSTHAN", "LESSTHANEQUAL", "NOTEQUAL", "AND", "OR", 
			"XOR", "NOT", "COMMA", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "RESERVEDWORD", 
			"OPERATING_FUNCTION", "OPERATOR", "SEPARATOR", "LITERAL", "IDENTIFIER", 
			"WHITESPACE", "NEXTLINE", "TAB", "CARRIAGERETURN"
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
			"IDENTIFIER", "WHITESPACE", "NEXTLINE", "TAB", "CARRIAGERETURN"
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


	public CRPPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CRPPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u027a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\7$\u010b\n$\f$\16$\u010e"+
		"\13$\3%\6%\u0111\n%\r%\16%\u0112\3%\3%\6%\u0117\n%\r%\16%\u0118\5%\u011b"+
		"\n%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\5>\u01cc\n>\3?\3?\5?\u01d0"+
		"\n?\3@\3@\5@\u01d4\n@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\3L\5L\u0215\nL\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\3Y\3Y\5Y\u0246\nY\3Z\3Z\3Z\3Z\5Z\u024c\nZ\3[\3[\3[\3[\3["+
		"\3[\3[\3[\5[\u0256\n[\3\\\3\\\3]\3]\7]\u025c\n]\f]\16]\u025f\13]\3]\3"+
		"]\3^\3^\3^\3^\6^\u0267\n^\r^\16^\u0268\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3"+
		"a\3a\3b\3b\3b\3b\3\u025d\2c\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\7K\bM\tO\nQ\13S\fU\rW\16Y\17[\20]\21_\22a"+
		"\23c\24e\25g\26i\27k\30m\31o\32q\33s\34u\35w\36y\37{ }!\177\"\u0081\2"+
		"\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5"+
		"\2\u00a7\2\u00a9\2\u00ab\2\u00ad#\u00af$\u00b1%\u00b3&\u00b5\'\u00b7("+
		"\u00b9)\u00bb*\u00bd+\u00bf,\u00c1-\u00c3.\3\2 \4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2c|\3\2C\\\3\2\62;"+
		"\5\2\62;C\\c|\2\u025d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\3\u00c5\3\2\2\2\5\u00c7\3\2\2\2\7\u00c9\3\2\2\2\t\u00cb\3\2\2"+
		"\2\13\u00cd\3\2\2\2\r\u00cf\3\2\2\2\17\u00d1\3\2\2\2\21\u00d3\3\2\2\2"+
		"\23\u00d5\3\2\2\2\25\u00d7\3\2\2\2\27\u00d9\3\2\2\2\31\u00db\3\2\2\2\33"+
		"\u00dd\3\2\2\2\35\u00df\3\2\2\2\37\u00e1\3\2\2\2!\u00e3\3\2\2\2#\u00e5"+
		"\3\2\2\2%\u00e7\3\2\2\2\'\u00e9\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2"+
		"-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7"+
		"\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2"+
		"?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G\u010c\3"+
		"\2\2\2I\u0110\3\2\2\2K\u011c\3\2\2\2M\u0120\3\2\2\2O\u0123\3\2\2\2Q\u0127"+
		"\3\2\2\2S\u012a\3\2\2\2U\u0133\3\2\2\2W\u0143\3\2\2\2Y\u0150\3\2\2\2["+
		"\u0157\3\2\2\2]\u015a\3\2\2\2_\u015f\3\2\2\2a\u0167\3\2\2\2c\u016c\3\2"+
		"\2\2e\u0171\3\2\2\2g\u0177\3\2\2\2i\u017e\3\2\2\2k\u0189\3\2\2\2m\u0197"+
		"\3\2\2\2o\u01a4\3\2\2\2q\u01a7\3\2\2\2s\u01b3\3\2\2\2u\u01b6\3\2\2\2w"+
		"\u01b9\3\2\2\2y\u01c2\3\2\2\2{\u01cb\3\2\2\2}\u01cf\3\2\2\2\177\u01d3"+
		"\3\2\2\2\u0081\u01d5\3\2\2\2\u0083\u01d9\3\2\2\2\u0085\u01dd\3\2\2\2\u0087"+
		"\u01e2\3\2\2\2\u0089\u01e9\3\2\2\2\u008b\u01ef\3\2\2\2\u008d\u01f6\3\2"+
		"\2\2\u008f\u01fc\3\2\2\2\u0091\u0200\3\2\2\2\u0093\u0204\3\2\2\2\u0095"+
		"\u0209\3\2\2\2\u0097\u0214\3\2\2\2\u0099\u0216\3\2\2\2\u009b\u0219\3\2"+
		"\2\2\u009d\u021d\3\2\2\2\u009f\u0220\3\2\2\2\u00a1\u0224\3\2\2\2\u00a3"+
		"\u022e\3\2\2\2\u00a5\u0232\3\2\2\2\u00a7\u0235\3\2\2\2\u00a9\u0239\3\2"+
		"\2\2\u00ab\u023d\3\2\2\2\u00ad\u023f\3\2\2\2\u00af\u0241\3\2\2\2\u00b1"+
		"\u0245\3\2\2\2\u00b3\u024b\3\2\2\2\u00b5\u0255\3\2\2\2\u00b7\u0257\3\2"+
		"\2\2\u00b9\u0259\3\2\2\2\u00bb\u0266\3\2\2\2\u00bd\u026a\3\2\2\2\u00bf"+
		"\u026e\3\2\2\2\u00c1\u0272\3\2\2\2\u00c3\u0276\3\2\2\2\u00c5\u00c6\7,"+
		"\2\2\u00c6\4\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\6\3\2\2\2\u00c9\u00ca"+
		"\7-\2\2\u00ca\b\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\n\3\2\2\2\u00cd\u00ce"+
		"\t\2\2\2\u00ce\f\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\16\3\2\2\2\u00d1\u00d2"+
		"\t\4\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4\22\3\2\2\2\u00d5\u00d6"+
		"\t\6\2\2\u00d6\24\3\2\2\2\u00d7\u00d8\t\7\2\2\u00d8\26\3\2\2\2\u00d9\u00da"+
		"\t\b\2\2\u00da\30\3\2\2\2\u00db\u00dc\t\t\2\2\u00dc\32\3\2\2\2\u00dd\u00de"+
		"\t\n\2\2\u00de\34\3\2\2\2\u00df\u00e0\t\13\2\2\u00e0\36\3\2\2\2\u00e1"+
		"\u00e2\t\f\2\2\u00e2 \3\2\2\2\u00e3\u00e4\t\r\2\2\u00e4\"\3\2\2\2\u00e5"+
		"\u00e6\t\16\2\2\u00e6$\3\2\2\2\u00e7\u00e8\t\17\2\2\u00e8&\3\2\2\2\u00e9"+
		"\u00ea\t\20\2\2\u00ea(\3\2\2\2\u00eb\u00ec\t\21\2\2\u00ec*\3\2\2\2\u00ed"+
		"\u00ee\t\22\2\2\u00ee,\3\2\2\2\u00ef\u00f0\t\23\2\2\u00f0.\3\2\2\2\u00f1"+
		"\u00f2\t\24\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\t\25\2\2\u00f4\62\3\2\2\2"+
		"\u00f5\u00f6\t\26\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\t\27\2\2\u00f8\66\3"+
		"\2\2\2\u00f9\u00fa\t\30\2\2\u00fa8\3\2\2\2\u00fb\u00fc\t\31\2\2\u00fc"+
		":\3\2\2\2\u00fd\u00fe\t\32\2\2\u00fe<\3\2\2\2\u00ff\u0100\t\33\2\2\u0100"+
		">\3\2\2\2\u0101\u0102\t\34\2\2\u0102@\3\2\2\2\u0103\u0104\t\35\2\2\u0104"+
		"B\3\2\2\2\u0105\u0106\t\36\2\2\u0106D\3\2\2\2\u0107\u0108\7a\2\2\u0108"+
		"F\3\2\2\2\u0109\u010b\t\37\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dH\3\2\2\2\u010e\u010c\3"+
		"\2\2\2\u010f\u0111\t\36\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114\u0116\7\60"+
		"\2\2\u0115\u0117\t\36\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0114\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011bJ\3\2\2\2\u011c\u011d\5\27\f\2\u011d\u011e"+
		"\5\23\n\2\u011e\u011f\5\61\31\2\u011fL\3\2\2\2\u0120\u0121\5\'\24\2\u0121"+
		"\u0122\5\25\13\2\u0122N\3\2\2\2\u0123\u0124\5\25\13\2\u0124\u0125\5\'"+
		"\24\2\u0125\u0126\5-\27\2\u0126P\3\2\2\2\u0127\u0128\5\'\24\2\u0128\u0129"+
		"\5%\23\2\u0129R\3\2\2\2\u012a\u012b\5\27\f\2\u012b\u012c\5-\27\2\u012c"+
		"\u012d\5\'\24\2\u012d\u012e\5\63\32\2\u012e\u012f\5)\25\2\u012f\u0130"+
		"\5E#\2\u0130\u0131\5\r\7\2\u0131\u0132\5;\36\2\u0132T\3\2\2\2\u0133\u0134"+
		"\5\17\b\2\u0134\u0135\5-\27\2\u0135\u0136\5\23\n\2\u0136\u0137\5\13\6"+
		"\2\u0137\u0138\5\61\31\2\u0138\u0139\5\23\n\2\u0139\u013a\5E#\2\u013a"+
		"\u013b\5\25\13\2\u013b\u013c\5\63\32\2\u013c\u013d\5%\23\2\u013d\u013e"+
		"\5\17\b\2\u013e\u013f\5\61\31\2\u013f\u0140\5\33\16\2\u0140\u0141\5\'"+
		"\24\2\u0141\u0142\5%\23\2\u0142V\3\2\2\2\u0143\u0144\5\23\n\2\u0144\u0145"+
		"\5%\23\2\u0145\u0146\5\21\t\2\u0146\u0147\5E#\2\u0147\u0148\5\25\13\2"+
		"\u0148\u0149\5\63\32\2\u0149\u014a\5%\23\2\u014a\u014b\5\17\b\2\u014b"+
		"\u014c\5\61\31\2\u014c\u014d\5\33\16\2\u014d\u014e\5\'\24\2\u014e\u014f"+
		"\5%\23\2\u014fX\3\2\2\2\u0150\u0151\5-\27\2\u0151\u0152\5\23\n\2\u0152"+
		"\u0153\5\61\31\2\u0153\u0154\5\63\32\2\u0154\u0155\5-\27\2\u0155\u0156"+
		"\5%\23\2\u0156Z\3\2\2\2\u0157\u0158\5\33\16\2\u0158\u0159\5\25\13\2\u0159"+
		"\\\3\2\2\2\u015a\u015b\5\61\31\2\u015b\u015c\5\31\r\2\u015c\u015d\5\23"+
		"\n\2\u015d\u015e\5%\23\2\u015e^\3\2\2\2\u015f\u0160\5\23\n\2\u0160\u0161"+
		"\5!\21\2\u0161\u0162\5/\30\2\u0162\u0163\5\23\n\2\u0163\u0164\5E#\2\u0164"+
		"\u0165\5\33\16\2\u0165\u0166\5\25\13\2\u0166`\3\2\2\2\u0167\u0168\5\23"+
		"\n\2\u0168\u0169\5!\21\2\u0169\u016a\5/\30\2\u016a\u016b\5\23\n\2\u016b"+
		"b\3\2\2\2\u016c\u016d\5\61\31\2\u016d\u016e\5-\27\2\u016e\u016f\5\63\32"+
		"\2\u016f\u0170\5\23\n\2\u0170d\3\2\2\2\u0171\u0172\5\25\13\2\u0172\u0173"+
		"\5\13\6\2\u0173\u0174\5!\21\2\u0174\u0175\5/\30\2\u0175\u0176\5\23\n\2"+
		"\u0176f\3\2\2\2\u0177\u0178\5\23\n\2\u0178\u0179\5%\23\2\u0179\u017a\5"+
		"\21\t\2\u017a\u017b\5E#\2\u017b\u017c\5\33\16\2\u017c\u017d\5\25\13\2"+
		"\u017dh\3\2\2\2\u017e\u017f\5%\23\2\u017f\u0180\5\23\n\2\u0180\u0181\5"+
		"\67\34\2\u0181\u0182\5E#\2\u0182\u0183\5\17\b\2\u0183\u0184\5\'\24\2\u0184"+
		"\u0185\5!\21\2\u0185\u0186\5\63\32\2\u0186\u0187\5#\22\2\u0187\u0188\5"+
		"%\23\2\u0188j\3\2\2\2\u0189\u018a\5\21\t\2\u018a\u018b\5\23\n\2\u018b"+
		"\u018c\5!\21\2\u018c\u018d\5\23\n\2\u018d\u018e\5\61\31\2\u018e\u018f"+
		"\5\23\n\2\u018f\u0190\5E#\2\u0190\u0191\5\17\b\2\u0191\u0192\5\'\24\2"+
		"\u0192\u0193\5!\21\2\u0193\u0194\5\63\32\2\u0194\u0195\5#\22\2\u0195\u0196"+
		"\5%\23\2\u0196l\3\2\2\2\u0197\u0198\5\17\b\2\u0198\u0199\5\31\r\2\u0199"+
		"\u019a\5\13\6\2\u019a\u019b\5%\23\2\u019b\u019c\5\27\f\2\u019c\u019d\5"+
		"\23\n\2\u019d\u019e\5E#\2\u019e\u019f\5\65\33\2\u019f\u01a0\5\13\6\2\u01a0"+
		"\u01a1\5!\21\2\u01a1\u01a2\5\63\32\2\u01a2\u01a3\5\23\n\2\u01a3n\3\2\2"+
		"\2\u01a4\u01a5\5\61\31\2\u01a5\u01a6\5\'\24\2\u01a6p\3\2\2\2\u01a7\u01a8"+
		"\5\33\16\2\u01a8\u01a9\5#\22\2\u01a9\u01aa\5)\25\2\u01aa\u01ab\5\'\24"+
		"\2\u01ab\u01ac\5-\27\2\u01ac\u01ad\5\61\31\2\u01ad\u01ae\5E#\2\u01ae\u01af"+
		"\5\25\13\2\u01af\u01b0\5\33\16\2\u01b0\u01b1\5!\21\2\u01b1\u01b2\5\23"+
		"\n\2\u01b2r\3\2\2\2\u01b3\u01b4\5\33\16\2\u01b4\u01b5\5/\30\2\u01b5t\3"+
		"\2\2\2\u01b6\u01b7\5\21\t\2\u01b7\u01b8\5\'\24\2\u01b8v\3\2\2\2\u01b9"+
		"\u01ba\5\17\b\2\u01ba\u01bb\5\'\24\2\u01bb\u01bc\5%\23\2\u01bc\u01bd\5"+
		"/\30\2\u01bd\u01be\5\61\31\2\u01be\u01bf\5\13\6\2\u01bf\u01c0\5%\23\2"+
		"\u01c0\u01c1\5\61\31\2\u01c1x\3\2\2\2\u01c2\u01c3\5\27\f\2\u01c3\u01c4"+
		"\5-\27\2\u01c4\u01c5\5\13\6\2\u01c5\u01c6\5)\25\2\u01c6\u01c7\5\31\r\2"+
		"\u01c7z\3\2\2\2\u01c8\u01cc\5\u0081A\2\u01c9\u01cc\5\u0083B\2\u01ca\u01cc"+
		"\5\u0085C\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2"+
		"\2\u01cc|\3\2\2\2\u01cd\u01d0\5\u0087D\2\u01ce\u01d0\5\u0089E\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0~\3\2\2\2\u01d1\u01d4\5\u008b"+
		"F\2\u01d2\u01d4\5\u008dG\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u0080\3\2\2\2\u01d5\u01d6\5)\25\2\u01d6\u01d7\5\33\16\2\u01d7\u01d8\5"+
		"\23\n\2\u01d8\u0082\3\2\2\2\u01d9\u01da\5\r\7\2\u01da\u01db\5\13\6\2\u01db"+
		"\u01dc\5-\27\2\u01dc\u0084\3\2\2\2\u01dd\u01de\5!\21\2\u01de\u01df\5\33"+
		"\16\2\u01df\u01e0\5%\23\2\u01e0\u01e1\5\23\n\2\u01e1\u0086\3\2\2\2\u01e2"+
		"\u01e3\59\35\2\u01e3\u01e4\5E#\2\u01e4\u01e5\5\13\6\2\u01e5\u01e6\59\35"+
		"\2\u01e6\u01e7\5\33\16\2\u01e7\u01e8\5/\30\2\u01e8\u0088\3\2\2\2\u01e9"+
		"\u01ea\5!\21\2\u01ea\u01eb\5\13\6\2\u01eb\u01ec\5\r\7\2\u01ec\u01ed\5"+
		"\23\n\2\u01ed\u01ee\5!\21\2\u01ee\u008a\3\2\2\2\u01ef\u01f0\5;\36\2\u01f0"+
		"\u01f1\5E#\2\u01f1\u01f2\5\13\6\2\u01f2\u01f3\59\35\2\u01f3\u01f4\5\33"+
		"\16\2\u01f4\u01f5\5/\30\2\u01f5\u008c\3\2\2\2\u01f6\u01f7\5\65\33\2\u01f7"+
		"\u01f8\5\13\6\2\u01f8\u01f9\5!\21\2\u01f9\u01fa\5\63\32\2\u01fa\u01fb"+
		"\5\23\n\2\u01fb\u008e\3\2\2\2\u01fc\u01fd\5/\30\2\u01fd\u01fe\5\63\32"+
		"\2\u01fe\u01ff\5#\22\2\u01ff\u0090\3\2\2\2\u0200\u0201\5#\22\2\u0201\u0202"+
		"\5\33\16\2\u0202\u0203\5%\23\2\u0203\u0092\3\2\2\2\u0204\u0205\5#\22\2"+
		"\u0205\u0206\5\23\n\2\u0206\u0207\5\13\6\2\u0207\u0208\5%\23\2\u0208\u0094"+
		"\3\2\2\2\u0209\u020a\5#\22\2\u020a\u020b\5\13\6\2\u020b\u020c\59\35\2"+
		"\u020c\u0096\3\2\2\2\u020d\u0215\7?\2\2\u020e\u020f\5\23\n\2\u020f\u0210"+
		"\5+\26\2\u0210\u0211\5\63\32\2\u0211\u0212\5\13\6\2\u0212\u0213\5!\21"+
		"\2\u0213\u0215\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u020e\3\2\2\2\u0215\u0098"+
		"\3\2\2\2\u0216\u0217\5\27\f\2\u0217\u0218\5\61\31\2\u0218\u009a\3\2\2"+
		"\2\u0219\u021a\5\27\f\2\u021a\u021b\5\61\31\2\u021b\u021c\5\23\n\2\u021c"+
		"\u009c\3\2\2\2\u021d\u021e\5!\21\2\u021e\u021f\5\61\31\2\u021f\u009e\3"+
		"\2\2\2\u0220\u0221\5!\21\2\u0221\u0222\5\61\31\2\u0222\u0223\5\23\n\2"+
		"\u0223\u00a0\3\2\2\2\u0224\u0225\5%\23\2\u0225\u0226\5\'\24\2\u0226\u0227"+
		"\5\61\31\2\u0227\u0228\5E#\2\u0228\u0229\5\23\n\2\u0229\u022a\5+\26\2"+
		"\u022a\u022b\5\63\32\2\u022b\u022c\5\13\6\2\u022c\u022d\5!\21\2\u022d"+
		"\u00a2\3\2\2\2\u022e\u022f\5\13\6\2\u022f\u0230\5%\23\2\u0230\u0231\5"+
		"\21\t\2\u0231\u00a4\3\2\2\2\u0232\u0233\5\'\24\2\u0233\u0234\5-\27\2\u0234"+
		"\u00a6\3\2\2\2\u0235\u0236\59\35\2\u0236\u0237\5\'\24\2\u0237\u0238\5"+
		"-\27\2\u0238\u00a8\3\2\2\2\u0239\u023a\5%\23\2\u023a\u023b\5\'\24\2\u023b"+
		"\u023c\5\61\31\2\u023c\u00aa\3\2\2\2\u023d\u023e\7.\2\2\u023e\u00ac\3"+
		"\2\2\2\u023f\u0240\7*\2\2\u0240\u00ae\3\2\2\2\u0241\u0242\7+\2\2\u0242"+
		"\u00b0\3\2\2\2\u0243\u0246\5c\62\2\u0244\u0246\5e\63\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0244\3\2\2\2\u0246\u00b2\3\2\2\2\u0247\u024c\5\u008fH\2\u0248"+
		"\u024c\5\u0093J\2\u0249\u024c\5\u0091I\2\u024a\u024c\5\u0095K\2\u024b"+
		"\u0247\3\2\2\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2"+
		"\2\2\u024c\u00b4\3\2\2\2\u024d\u0256\5\u0097L\2\u024e\u0256\5\u0099M\2"+
		"\u024f\u0256\5\u009bN\2\u0250\u0256\5\u009dO\2\u0251\u0256\5\u009fP\2"+
		"\u0252\u0256\5\u00a1Q\2\u0253\u0256\5\u00a3R\2\u0254\u0256\5\u00a5S\2"+
		"\u0255\u024d\3\2\2\2\u0255\u024e\3\2\2\2\u0255\u024f\3\2\2\2\u0255\u0250"+
		"\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0256\u00b6\3\2\2\2\u0257\u0258\5\u00abV\2\u0258\u00b8"+
		"\3\2\2\2\u0259\u025d\7)\2\2\u025a\u025c\13\2\2\2\u025b\u025a\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0260\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7)\2\2\u0261\u00ba\3\2\2\2\u0262"+
		"\u0267\5? \2\u0263\u0267\5A!\2\u0264\u0267\5C\"\2\u0265\u0267\5E#\2\u0266"+
		"\u0262\3\2\2\2\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u00bc\3\2\2\2\u026a\u026b\7\"\2\2\u026b\u026c\3\2\2\2\u026c\u026d\b_"+
		"\2\2\u026d\u00be\3\2\2\2\u026e\u026f\7\f\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\b`\2\2\u0271\u00c0\3\2\2\2\u0272\u0273\7\13\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\ba\2\2\u0275\u00c2\3\2\2\2\u0276\u0277\7\17\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\bb\2\2\u0279\u00c4\3\2\2\2\21\2\u010c\u0112"+
		"\u0118\u011a\u01cb\u01cf\u01d3\u0214\u0245\u024b\u0255\u025d\u0266\u0268"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}