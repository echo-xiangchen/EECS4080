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
		DIV=31, ADD=32, SUB=33, COMMENT=34, WS=35, ID=36, INTNUM=37, REALNUM=38;
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
			"COMMENT", "WS", "ID", "INTNUM", "REALNUM"
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
			"WS", "ID", "INTNUM", "REALNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u00cb\n#\f#\16#\u00ce"+
		"\13#\3#\3#\3$\6$\u00d3\n$\r$\16$\u00d4\3$\3$\3%\3%\7%\u00db\n%\f%\16%"+
		"\u00de\13%\3&\3&\5&\u00e2\n&\3&\3&\7&\u00e6\n&\f&\16&\u00e9\13&\5&\u00eb"+
		"\n&\3\'\5\'\u00ee\n\'\3\'\7\'\u00f1\n\'\f\'\16\'\u00f4\13\'\3\'\3\'\6"+
		"\'\u00f8\n\'\r\'\16\'\u00f9\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\b\4\2\f\f\17"+
		"\17\4\2\13\f\"\"\3\2c|\5\2\62;C\\c|\3\2\63;\3\2\62;\2\u0103\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13"+
		"X\3\2\2\2\rZ\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27"+
		"e\3\2\2\2\31m\3\2\2\2\33u\3\2\2\2\35z\3\2\2\2\37\u0080\3\2\2\2!\u0087"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0095\3\2\2\2\'\u009a\3\2\2\2)\u00a0\3\2\2\2"+
		"+\u00a4\3\2\2\2-\u00a8\3\2\2\2/\u00ab\3\2\2\2\61\u00ae\3\2\2\2\63\u00b2"+
		"\3\2\2\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00bb\3\2\2"+
		"\2=\u00be\3\2\2\2?\u00c0\3\2\2\2A\u00c2\3\2\2\2C\u00c4\3\2\2\2E\u00c6"+
		"\3\2\2\2G\u00d2\3\2\2\2I\u00d8\3\2\2\2K\u00ea\3\2\2\2M\u00ed\3\2\2\2O"+
		"P\7<\2\2P\4\3\2\2\2QR\7]\2\2R\6\3\2\2\2ST\7_\2\2T\b\3\2\2\2UV\7>\2\2V"+
		"W\7>\2\2W\n\3\2\2\2XY\7.\2\2Y\f\3\2\2\2Z[\7@\2\2[\\\7@\2\2\\\16\3\2\2"+
		"\2]^\7~\2\2^\20\3\2\2\2_`\7*\2\2`\22\3\2\2\2ab\7+\2\2b\24\3\2\2\2cd\7"+
		"=\2\2d\26\3\2\2\2ef\7D\2\2fg\7Q\2\2gh\7Q\2\2hi\7N\2\2ij\7G\2\2jk\7C\2"+
		"\2kl\7P\2\2l\30\3\2\2\2mn\7K\2\2no\7P\2\2op\7V\2\2pq\7G\2\2qr\7I\2\2r"+
		"s\7G\2\2st\7T\2\2t\32\3\2\2\2uv\7T\2\2vw\7G\2\2wx\7C\2\2xy\7N\2\2y\34"+
		"\3\2\2\2z{\7C\2\2{|\7T\2\2|}\7T\2\2}~\7C\2\2~\177\7[\2\2\177\36\3\2\2"+
		"\2\u0080\u0081\7x\2\2\u0081\u0082\7g\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7h\2\2\u0085\u0086\7{\2\2\u0086 \3\2\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7n\2\2\u008d\"\3\2\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7z\2\2\u0090\u0091\7k\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2"+
		"\u0093\u0094\7u\2\2\u0094$\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2"+
		"\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099&\3\2\2\2\u009a\u009b\7"+
		"h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f"+
		"\7g\2\2\u009f(\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7f\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa.\3"+
		"\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7@\2\2\u00ad\60\3\2\2\2\u00ae\u00af"+
		"\7>\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7@\2\2\u00b1\62\3\2\2\2\u00b2\u00b3"+
		"\7?\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\66\3\2\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b78\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba\7?\2\2\u00ba:\3"+
		"\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7?\2\2\u00bd<\3\2\2\2\u00be\u00bf"+
		"\7,\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1@\3\2\2\2\u00c2\u00c3"+
		"\7-\2\2\u00c3B\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7"+
		"/\2\2\u00c7\u00c8\7/\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\n\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b#\2\2\u00d0"+
		"F\3\2\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\b$\2\2\u00d7H\3\2\2\2\u00d8\u00dc\t\4\2\2\u00d9\u00db\t\5\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"J\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00eb\7\62\2\2\u00e0\u00e2\7/\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7"+
		"\t\6\2\2\u00e4\u00e6\t\7\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00df\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ebL\3\2\2\2\u00ec\u00ee"+
		"\7/\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef"+
		"\u00f1\t\7\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f7\7\60\2\2\u00f6\u00f8\t\7\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faN\3\2\2\2\f\2\u00cc"+
		"\u00d4\u00dc\u00e1\u00e7\u00ea\u00ed\u00f2\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}