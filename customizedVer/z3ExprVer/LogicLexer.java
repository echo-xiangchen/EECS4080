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
		T__0=1, T__1=2, COMMENT=3, WS=4, BOOL=5, INT=6, TRUE=7, FALSE=8, NOT=9, 
		AND=10, OR=11, IMPLIES=12, IFF=13, VAR=14, NUM=15, NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMENT", "WS", "BOOL", "INT", "TRUE", "FALSE", "NOT", 
			"AND", "OR", "IMPLIES", "IFF", "VAR", "NUM", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, "'boolean'", "'int'", null, null, "'not'", 
			"'and'", "'or'", "'=>'", "'<=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "WS", "BOOL", "INT", "TRUE", "FALSE", "NOT", 
			"AND", "OR", "IMPLIES", "IFF", "VAR", "NUM", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\5\6\5\64\n\5"+
		"\r\5\16\5\65\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\7\17p\n\17\f\17\16\17s\13\17"+
		"\3\20\6\20v\n\20\r\20\16\20w\3\21\5\21{\n\21\3\21\3\21\2\2\22\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\3\2c|\5\2\62;C\\c|\3\2\62;\2\u0084"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2"+
		"\2\2\5%\3\2\2\2\7\'\3\2\2\2\t\63\3\2\2\2\139\3\2\2\2\rA\3\2\2\2\17M\3"+
		"\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25_\3\2\2\2\27c\3\2\2\2\31f\3\2\2\2\33"+
		"i\3\2\2\2\35m\3\2\2\2\37u\3\2\2\2!z\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7+\2"+
		"\2&\6\3\2\2\2\'(\7/\2\2()\7/\2\2)-\3\2\2\2*,\n\2\2\2+*\3\2\2\2,/\3\2\2"+
		"\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\b\4\2\2\61\b\3\2\2"+
		"\2\62\64\t\3\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\b\5\2\28\n\3\2\2\29:\7d\2\2:;\7q\2\2;<\7q\2\2<=\7"+
		"n\2\2=>\7g\2\2>?\7c\2\2?@\7p\2\2@\f\3\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2"+
		"D\16\3\2\2\2EF\7v\2\2FG\7t\2\2GH\7w\2\2HN\7g\2\2IJ\7V\2\2JK\7t\2\2KL\7"+
		"w\2\2LN\7g\2\2ME\3\2\2\2MI\3\2\2\2N\20\3\2\2\2OP\7h\2\2PQ\7c\2\2QR\7n"+
		"\2\2RS\7u\2\2SZ\7g\2\2TU\7H\2\2UV\7c\2\2VW\7n\2\2WX\7u\2\2XZ\7g\2\2YO"+
		"\3\2\2\2YT\3\2\2\2Z\22\3\2\2\2[\\\7p\2\2\\]\7q\2\2]^\7v\2\2^\24\3\2\2"+
		"\2_`\7c\2\2`a\7p\2\2ab\7f\2\2b\26\3\2\2\2cd\7q\2\2de\7t\2\2e\30\3\2\2"+
		"\2fg\7?\2\2gh\7@\2\2h\32\3\2\2\2ij\7>\2\2jk\7?\2\2kl\7@\2\2l\34\3\2\2"+
		"\2mq\t\4\2\2np\t\5\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\36\3\2"+
		"\2\2sq\3\2\2\2tv\t\6\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x \3\2"+
		"\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}\"\3\2\2\2\n\2"+
		"-\65MYqwz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}