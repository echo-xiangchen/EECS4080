package antlr;
// Generated from Logic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOL=11, INT=12, REAL=13, ARRAY=14, VERIFY=15, FORALL=16, EXISTS=17, 
		TRUE=18, FALSE=19, NOT=20, AND=21, OR=22, IMPLIES=23, IFF=24, EQUAL=25, 
		GREATERTHAN=26, LESSTHAN=27, GREATEROREQUAL=28, LESSOREQUAL=29, MUL=30, 
		DIV=31, ADD=32, SUB=33, COMMENT=34, WS=35, ID=36, NUM=37, INTNUM=38, REALNUM=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "BOOL", "INT", "REAL", "ARRAY", "VERIFY", "FORALL", "EXISTS", 
			"TRUE", "FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", 
			"LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", 
			"COMMENT", "WS", "ID", "NUM", "INTNUM", "REALNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'<<'", "','", "'>>'", "'|'", "'('", "')'", 
			"';'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'verify'", "'forall'", 
			"'exists'", "'true'", "'false'", "'not'", "'and'", "'or'", "'=>'", "'<=>'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
			"INT", "REAL", "ARRAY", "VERIFY", "FORALL", "EXISTS", "TRUE", "FALSE", 
			"NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", 
			"GREATEROREQUAL", "LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", "COMMENT", 
			"WS", "ID", "NUM", "INTNUM", "REALNUM"
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


	public LogicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logic.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u00cd\n#\f#\16"+
		"#\u00d0\13#\3#\3#\3$\6$\u00d5\n$\r$\16$\u00d6\3$\3$\3%\3%\7%\u00dd\n%"+
		"\f%\16%\u00e0\13%\3&\3&\5&\u00e4\n&\3\'\3\'\5\'\u00e8\n\'\3\'\3\'\7\'"+
		"\u00ec\n\'\f\'\16\'\u00ef\13\'\5\'\u00f1\n\'\3(\5(\u00f4\n(\3(\7(\u00f7"+
		"\n(\f(\16(\u00fa\13(\3(\3(\6(\u00fe\n(\r(\16(\u00ff\2\2)\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)\3\2\b\4\2\f\f\17\17\4\2\13\f\"\"\3\2c|\5\2\62;C\\c|\3\2\63"+
		";\3\2\62;\2\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2"+
		"\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17_\3\2"+
		"\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31o\3\2\2\2\33w\3"+
		"\2\2\2\35|\3\2\2\2\37\u0082\3\2\2\2!\u0089\3\2\2\2#\u0090\3\2\2\2%\u0097"+
		"\3\2\2\2\'\u009c\3\2\2\2)\u00a2\3\2\2\2+\u00a6\3\2\2\2-\u00aa\3\2\2\2"+
		"/\u00ad\3\2\2\2\61\u00b0\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2\2\2\67"+
		"\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bd\3\2\2\2=\u00c0\3\2\2\2?\u00c2\3\2"+
		"\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00c8\3\2\2\2G\u00d4\3\2\2\2I\u00da"+
		"\3\2\2\2K\u00e3\3\2\2\2M\u00f0\3\2\2\2O\u00f3\3\2\2\2QR\7<\2\2R\4\3\2"+
		"\2\2ST\7]\2\2T\6\3\2\2\2UV\7_\2\2V\b\3\2\2\2WX\7>\2\2XY\7>\2\2Y\n\3\2"+
		"\2\2Z[\7.\2\2[\f\3\2\2\2\\]\7@\2\2]^\7@\2\2^\16\3\2\2\2_`\7~\2\2`\20\3"+
		"\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7+\2\2d\24\3\2\2\2ef\7=\2\2f\26\3\2\2\2"+
		"gh\7D\2\2hi\7Q\2\2ij\7Q\2\2jk\7N\2\2kl\7G\2\2lm\7C\2\2mn\7P\2\2n\30\3"+
		"\2\2\2op\7K\2\2pq\7P\2\2qr\7V\2\2rs\7G\2\2st\7I\2\2tu\7G\2\2uv\7T\2\2"+
		"v\32\3\2\2\2wx\7T\2\2xy\7G\2\2yz\7C\2\2z{\7N\2\2{\34\3\2\2\2|}\7C\2\2"+
		"}~\7T\2\2~\177\7T\2\2\177\u0080\7C\2\2\u0080\u0081\7[\2\2\u0081\36\3\2"+
		"\2\2\u0082\u0083\7x\2\2\u0083\u0084\7g\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7h\2\2\u0087\u0088\7{\2\2\u0088 \3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7n\2\2\u008f\"\3\2\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7z\2\2\u0092\u0093\7k\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7u\2\2\u0096$\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2"+
		"\2\u0099\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b&\3\2\2\2\u009c\u009d\7"+
		"h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7f\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac.\3"+
		"\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7@\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\7@\2\2\u00b3\62\3\2\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\66\3\2\2\2\u00b8\u00b9"+
		"\7>\2\2\u00b98\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bc:\3"+
		"\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bf<\3\2\2\2\u00c0\u00c1"+
		"\7,\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7-\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7"+
		"/\2\2\u00c9\u00ca\7/\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\n\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b#\2\2\u00d2"+
		"F\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\b$\2\2\u00d9H\3\2\2\2\u00da\u00de\t\4\2\2\u00db\u00dd\t\5\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"J\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\5M\'\2\u00e2\u00e4\5O(\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4L\3\2\2\2\u00e5\u00f1\7\62\2\2"+
		"\u00e6\u00e8\7/\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ed\t\6\2\2\u00ea\u00ec\t\7\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f1"+
		"N\3\2\2\2\u00f2\u00f4\7/\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fd\7\60\2\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"P\3\2\2\2\r\2\u00ce\u00d6\u00de\u00e3\u00e7\u00ed\u00f0\u00f3\u00f8\u00ff"+
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