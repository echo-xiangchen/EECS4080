// Generated from Verifier.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerifierLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, BOOL=13, INT=14, REAL=15, ARRAY=16, PAIR=17, 
		VERIFY=18, COUNT=19, LOCAL=20, REQUIRE=21, ENSURE=22, DO=23, END=24, OLD=25, 
		RESULT=26, FORALL=27, EXISTS=28, TRUE=29, FALSE=30, NOT=31, AND=32, OR=33, 
		IMPLIES=34, IFF=35, EQUAL=36, GREATERTHAN=37, LESSTHAN=38, GREATEROREQUAL=39, 
		LESSOREQUAL=40, MUL=41, DIV=42, ADD=43, SUB=44, COMMENT=45, WS=46, ID=47, 
		INTNUM=48, REALNUM=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "BOOL", "INT", "REAL", "ARRAY", "PAIR", "VERIFY", 
			"COUNT", "LOCAL", "REQUIRE", "ENSURE", "DO", "END", "OLD", "RESULT", 
			"FORALL", "EXISTS", "TRUE", "FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", 
			"EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", 
			"MUL", "DIV", "ADD", "SUB", "COMMENT", "WS", "ID", "INTNUM", "REALNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "':'", "':='", "'<<'", "','", "'>>'", "'['", 
			"']'", "'|'", "'.'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", 
			"'verify'", "'count'", "'local'", "'require'", "'ensure'", "'do'", "'end'", 
			"'old'", "'Result'", "'forall'", "'exists'", "'true'", "'false'", "'not'", 
			"'and'", "'or'", "'=>'", "'<=>'", "'='", "'>'", "'<'", "'>='", "'<='", 
			"'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOL", "INT", "REAL", "ARRAY", "PAIR", "VERIFY", "COUNT", "LOCAL", 
			"REQUIRE", "ENSURE", "DO", "END", "OLD", "RESULT", "FORALL", "EXISTS", 
			"TRUE", "FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", 
			"LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", 
			"COMMENT", "WS", "ID", "INTNUM", "REALNUM"
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


	public VerifierLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Verifier.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3."+
		"\3.\7.\u0118\n.\f.\16.\u011b\13.\3.\3.\3/\6/\u0120\n/\r/\16/\u0121\3/"+
		"\3/\3\60\3\60\7\60\u0128\n\60\f\60\16\60\u012b\13\60\3\61\3\61\5\61\u012f"+
		"\n\61\3\61\3\61\7\61\u0133\n\61\f\61\16\61\u0136\13\61\5\61\u0138\n\61"+
		"\3\62\5\62\u013b\n\62\3\62\7\62\u013e\n\62\f\62\16\62\u0141\13\62\3\62"+
		"\3\62\6\62\u0145\n\62\r\62\16\62\u0146\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63\3\2\b\4\2\f\f\17\17\4\2\13\f\"\"\3\2c|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\2\u0150\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2"+
		"\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\rp\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2"+
		"\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0088"+
		"\3\2\2\2\37\u0090\3\2\2\2!\u0095\3\2\2\2#\u009b\3\2\2\2%\u00a0\3\2\2\2"+
		"\'\u00a7\3\2\2\2)\u00ad\3\2\2\2+\u00b3\3\2\2\2-\u00bb\3\2\2\2/\u00c2\3"+
		"\2\2\2\61\u00c5\3\2\2\2\63\u00c9\3\2\2\2\65\u00cd\3\2\2\2\67\u00d4\3\2"+
		"\2\29\u00db\3\2\2\2;\u00e2\3\2\2\2=\u00e7\3\2\2\2?\u00ed\3\2\2\2A\u00f1"+
		"\3\2\2\2C\u00f5\3\2\2\2E\u00f8\3\2\2\2G\u00fb\3\2\2\2I\u00ff\3\2\2\2K"+
		"\u0101\3\2\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0108\3\2\2\2S\u010b\3\2"+
		"\2\2U\u010d\3\2\2\2W\u010f\3\2\2\2Y\u0111\3\2\2\2[\u0113\3\2\2\2]\u011f"+
		"\3\2\2\2_\u0125\3\2\2\2a\u0137\3\2\2\2c\u013a\3\2\2\2ef\7*\2\2f\4\3\2"+
		"\2\2gh\7=\2\2h\6\3\2\2\2ij\7+\2\2j\b\3\2\2\2kl\7<\2\2l\n\3\2\2\2mn\7<"+
		"\2\2no\7?\2\2o\f\3\2\2\2pq\7>\2\2qr\7>\2\2r\16\3\2\2\2st\7.\2\2t\20\3"+
		"\2\2\2uv\7@\2\2vw\7@\2\2w\22\3\2\2\2xy\7]\2\2y\24\3\2\2\2z{\7_\2\2{\26"+
		"\3\2\2\2|}\7~\2\2}\30\3\2\2\2~\177\7\60\2\2\177\32\3\2\2\2\u0080\u0081"+
		"\7D\2\2\u0081\u0082\7Q\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7N\2\2\u0084"+
		"\u0085\7G\2\2\u0085\u0086\7C\2\2\u0086\u0087\7P\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7K\2\2\u0089\u008a\7P\2\2\u008a\u008b\7V\2\2\u008b\u008c\7G\2\2"+
		"\u008c\u008d\7I\2\2\u008d\u008e\7G\2\2\u008e\u008f\7T\2\2\u008f\36\3\2"+
		"\2\2\u0090\u0091\7T\2\2\u0091\u0092\7G\2\2\u0092\u0093\7C\2\2\u0093\u0094"+
		"\7N\2\2\u0094 \3\2\2\2\u0095\u0096\7C\2\2\u0096\u0097\7T\2\2\u0097\u0098"+
		"\7T\2\2\u0098\u0099\7C\2\2\u0099\u009a\7[\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\7R\2\2\u009c\u009d\7C\2\2\u009d\u009e\7K\2\2\u009e\u009f\7T\2\2\u009f"+
		"$\3\2\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7{\2\2\u00a6&\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2"+
		"\u00ab\u00ac\7v\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q\2"+
		"\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2*\3\2"+
		"\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7s\2\2\u00b6\u00b7"+
		"\7w\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		",\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1.\3\2\2\2\u00c2"+
		"\u00c3\7f\2\2\u00c3\u00c4\7q\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7f\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7f\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7T\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7n\2\2"+
		"\u00d2\u00d3\7v\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7"+
		"q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da"+
		"\7n\2\2\u00da8\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7z\2\2\u00dd\u00de"+
		"\7k\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		":\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec>\3\2\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7v\2\2\u00f0@\3\2\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7f\2\2\u00f4B\3\2\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9"+
		"\u00fa\7@\2\2\u00faF\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7?\2\2\u00fd"+
		"\u00fe\7@\2\2\u00feH\3\2\2\2\u00ff\u0100\7?\2\2\u0100J\3\2\2\2\u0101\u0102"+
		"\7@\2\2\u0102L\3\2\2\2\u0103\u0104\7>\2\2\u0104N\3\2\2\2\u0105\u0106\7"+
		"@\2\2\u0106\u0107\7?\2\2\u0107P\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a"+
		"\7?\2\2\u010aR\3\2\2\2\u010b\u010c\7,\2\2\u010cT\3\2\2\2\u010d\u010e\7"+
		"\61\2\2\u010eV\3\2\2\2\u010f\u0110\7-\2\2\u0110X\3\2\2\2\u0111\u0112\7"+
		"/\2\2\u0112Z\3\2\2\2\u0113\u0114\7/\2\2\u0114\u0115\7/\2\2\u0115\u0119"+
		"\3\2\2\2\u0116\u0118\n\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\b.\2\2\u011d\\\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\b/\2\2\u0124^\3\2\2\2\u0125\u0129\t\4\2\2\u0126"+
		"\u0128\t\5\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a`\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0138"+
		"\7\62\2\2\u012d\u012f\7/\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0134\t\6\2\2\u0131\u0133\t\7\2\2\u0132\u0131\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u012e\3\2"+
		"\2\2\u0138b\3\2\2\2\u0139\u013b\7/\2\2\u013a\u0139\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013f\3\2\2\2\u013c\u013e\t\7\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7\60\2\2\u0143\u0145\t\7\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147d\3\2\2\2\f\2\u0119\u0121\u0129\u012e\u0134\u0137\u013a\u013f"+
		"\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}