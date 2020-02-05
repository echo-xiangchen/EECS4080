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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOL=9, 
		INT=10, REAL=11, ARRAY=12, VERIFY=13, FORALL=14, EXISTS=15, TRUE=16, FALSE=17, 
		NOT=18, AND=19, OR=20, IMPLIES=21, IFF=22, EQUAL=23, GREATERTHAN=24, LESSTHAN=25, 
		GREATEROREQUAL=26, LESSOREQUAL=27, MUL=28, DIV=29, ADD=30, SUB=31, COMMENT=32, 
		WS=33, ID=34, POSITIVENUM=35, INTNUM=36, REALNUM=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BOOL", 
			"INT", "REAL", "ARRAY", "VERIFY", "FORALL", "EXISTS", "TRUE", "FALSE", 
			"NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", 
			"GREATEROREQUAL", "LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", "COMMENT", 
			"WS", "ID", "POSITIVENUM", "INTNUM", "REALNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'|'", "'('", "')'", "','", "';'", "'BOOLEAN'", 
			"'INTEGER'", "'REAL'", "'ARRAY'", "'verify'", "'forall'", "'exists'", 
			"'true'", "'false'", "'not'", "'and'", "'or'", "'=>'", "'<=>'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "BOOL", "INT", 
			"REAL", "ARRAY", "VERIFY", "FORALL", "EXISTS", "TRUE", "FALSE", "NOT", 
			"AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", 
			"LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", "COMMENT", "WS", "ID", "POSITIVENUM", 
			"INTNUM", "REALNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\7!\u00c3\n!\f!\16!\u00c6\13!\3!\3!\3\"\6\"\u00cb\n\""+
		"\r\"\16\"\u00cc\3\"\3\"\3#\3#\7#\u00d3\n#\f#\16#\u00d6\13#\3$\3$\7$\u00da"+
		"\n$\f$\16$\u00dd\13$\3%\3%\5%\u00e1\n%\3%\3%\7%\u00e5\n%\f%\16%\u00e8"+
		"\13%\5%\u00ea\n%\3&\5&\u00ed\n&\3&\7&\u00f0\n&\f&\16&\u00f3\13&\3&\3&"+
		"\6&\u00f7\n&\r&\16&\u00f8\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\4\2\f\f\17\17"+
		"\4\2\13\f\"\"\3\2c|\5\2\62;C\\c|\3\2\63;\3\2\62;\2\u0103\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3"+
		"\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25e\3\2\2\2\27m\3\2\2\2\31"+
		"r\3\2\2\2\33x\3\2\2\2\35\177\3\2\2\2\37\u0086\3\2\2\2!\u008d\3\2\2\2#"+
		"\u0092\3\2\2\2%\u0098\3\2\2\2\'\u009c\3\2\2\2)\u00a0\3\2\2\2+\u00a3\3"+
		"\2\2\2-\u00a6\3\2\2\2/\u00aa\3\2\2\2\61\u00ac\3\2\2\2\63\u00ae\3\2\2\2"+
		"\65\u00b0\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00ba"+
		"\3\2\2\2?\u00bc\3\2\2\2A\u00be\3\2\2\2C\u00ca\3\2\2\2E\u00d0\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2\2\2MN\7<\2\2N\4\3\2\2\2OP\7]"+
		"\2\2P\6\3\2\2\2QR\7_\2\2R\b\3\2\2\2ST\7~\2\2T\n\3\2\2\2UV\7*\2\2V\f\3"+
		"\2\2\2WX\7+\2\2X\16\3\2\2\2YZ\7.\2\2Z\20\3\2\2\2[\\\7=\2\2\\\22\3\2\2"+
		"\2]^\7D\2\2^_\7Q\2\2_`\7Q\2\2`a\7N\2\2ab\7G\2\2bc\7C\2\2cd\7P\2\2d\24"+
		"\3\2\2\2ef\7K\2\2fg\7P\2\2gh\7V\2\2hi\7G\2\2ij\7I\2\2jk\7G\2\2kl\7T\2"+
		"\2l\26\3\2\2\2mn\7T\2\2no\7G\2\2op\7C\2\2pq\7N\2\2q\30\3\2\2\2rs\7C\2"+
		"\2st\7T\2\2tu\7T\2\2uv\7C\2\2vw\7[\2\2w\32\3\2\2\2xy\7x\2\2yz\7g\2\2z"+
		"{\7t\2\2{|\7k\2\2|}\7h\2\2}~\7{\2\2~\34\3\2\2\2\177\u0080\7h\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2"+
		"\u0084\u0085\7n\2\2\u0085\36\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7"+
		"z\2\2\u0088\u0089\7k\2\2\u0089\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7u\2\2\u008c \3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7w\2\2\u0090\u0091\7g\2\2\u0091\"\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097"+
		"$\3\2\2\2\u0098\u0099\7p\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b"+
		"&\3\2\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e\u009f\7f\2\2\u009f"+
		"(\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\u00a5\7@\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\u00a9\7@\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\60"+
		"\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7>\2\2\u00af"+
		"\64\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\66\3\2\2\2\u00b3"+
		"\u00b4\7>\2\2\u00b4\u00b5\7?\2\2\u00b58\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7"+
		":\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb"+
		">\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd@\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\n\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b!\2\2\u00c8B\3\2\2\2\u00c9\u00cb"+
		"\t\3\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\"\2\2\u00cfD\3\2\2\2"+
		"\u00d0\u00d4\t\4\2\2\u00d1\u00d3\t\5\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5F\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00db\t\6\2\2\u00d8\u00da\t\7\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"H\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00ea\7\62\2\2\u00df\u00e1\7/\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6"+
		"\t\6\2\2\u00e3\u00e5\t\7\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00de\3\2\2\2\u00e9\u00e0\3\2\2\2\u00eaJ\3\2\2\2\u00eb\u00ed"+
		"\7/\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee"+
		"\u00f0\t\7\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\7\60\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9L\3\2\2\2\r\2\u00c4"+
		"\u00cc\u00d4\u00db\u00e0\u00e6\u00e9\u00ec\u00f1\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}