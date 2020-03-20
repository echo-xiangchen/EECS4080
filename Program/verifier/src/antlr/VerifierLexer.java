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
		VERIFY=18, COUNT=19, LOWER=20, UPPER=21, LOCAL=22, REQUIRE=23, ENSURE=24, 
		DO=25, END=26, OLD=27, RESULT=28, IF=29, THEN=30, ELSE=31, FROM=32, UNTIL=33, 
		LOOP=34, INVARIANT=35, VARIANT=36, FORALL=37, EXISTS=38, TRUE=39, FALSE=40, 
		NOT=41, AND=42, OR=43, IMPLIES=44, IFF=45, EQUAL=46, GREATERTHAN=47, LESSTHAN=48, 
		GREATEROREQUAL=49, LESSOREQUAL=50, MUL=51, DIV=52, ADD=53, SUB=54, COMMENT=55, 
		WS=56, ID=57, INTNUM=58, REALNUM=59;
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
			"COUNT", "LOWER", "UPPER", "LOCAL", "REQUIRE", "ENSURE", "DO", "END", 
			"OLD", "RESULT", "IF", "THEN", "ELSE", "FROM", "UNTIL", "LOOP", "INVARIANT", 
			"VARIANT", "FORALL", "EXISTS", "TRUE", "FALSE", "NOT", "AND", "OR", "IMPLIES", 
			"IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", 
			"MUL", "DIV", "ADD", "SUB", "COMMENT", "WS", "ID", "INTNUM", "REALNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "':'", "':='", "'<<'", "','", "'>>'", "'['", 
			"']'", "'|'", "'.'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", 
			"'verify'", "'count'", "'lower'", "'upper'", "'local'", "'require'", 
			"'ensure'", "'do'", "'end'", "'old'", "'Result'", "'if'", "'then'", "'else'", 
			"'from'", "'until'", "'loop'", "'invariant'", "'variant'", "'forall'", 
			"'exists'", "'true'", "'false'", "'not'", "'and'", "'or'", "'=>'", "'<=>'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOL", "INT", "REAL", "ARRAY", "PAIR", "VERIFY", "COUNT", "LOWER", 
			"UPPER", "LOCAL", "REQUIRE", "ENSURE", "DO", "END", "OLD", "RESULT", 
			"IF", "THEN", "ELSE", "FROM", "UNTIL", "LOOP", "INVARIANT", "VARIANT", 
			"FORALL", "EXISTS", "TRUE", "FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", 
			"EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", 
			"MUL", "DIV", "ADD", "SUB", "COMMENT", "WS", "ID", "INTNUM", "REALNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\38\38\78\u0167\n8\f8\168\u016a\138\38\38\39\69\u016f\n9\r9\16"+
		"9\u0170\39\39\3:\3:\7:\u0177\n:\f:\16:\u017a\13:\3;\3;\5;\u017e\n;\3;"+
		"\3;\7;\u0182\n;\f;\16;\u0185\13;\5;\u0187\n;\3<\5<\u018a\n<\3<\7<\u018d"+
		"\n<\f<\16<\u0190\13<\3<\3<\6<\u0194\n<\r<\16<\u0195\2\2=\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2"+
		"\b\4\2\f\f\17\17\4\2\13\f\"\"\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\2\u019f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5"+
		"{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0084\3\2\2\2\17"+
		"\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0090"+
		"\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u00a4\3"+
		"\2\2\2!\u00a9\3\2\2\2#\u00af\3\2\2\2%\u00b4\3\2\2\2\'\u00bb\3\2\2\2)\u00c1"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00cd\3\2\2\2/\u00d3\3\2\2\2\61\u00db\3\2\2\2"+
		"\63\u00e2\3\2\2\2\65\u00e5\3\2\2\2\67\u00e9\3\2\2\29\u00ed\3\2\2\2;\u00f4"+
		"\3\2\2\2=\u00f7\3\2\2\2?\u00fc\3\2\2\2A\u0101\3\2\2\2C\u0106\3\2\2\2E"+
		"\u010c\3\2\2\2G\u0111\3\2\2\2I\u011b\3\2\2\2K\u0123\3\2\2\2M\u012a\3\2"+
		"\2\2O\u0131\3\2\2\2Q\u0136\3\2\2\2S\u013c\3\2\2\2U\u0140\3\2\2\2W\u0144"+
		"\3\2\2\2Y\u0147\3\2\2\2[\u014a\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a"+
		"\u0152\3\2\2\2c\u0154\3\2\2\2e\u0157\3\2\2\2g\u015a\3\2\2\2i\u015c\3\2"+
		"\2\2k\u015e\3\2\2\2m\u0160\3\2\2\2o\u0162\3\2\2\2q\u016e\3\2\2\2s\u0174"+
		"\3\2\2\2u\u0186\3\2\2\2w\u0189\3\2\2\2yz\7*\2\2z\4\3\2\2\2{|\7=\2\2|\6"+
		"\3\2\2\2}~\7+\2\2~\b\3\2\2\2\177\u0080\7<\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7<\2\2\u0082\u0083\7?\2\2\u0083\f\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086"+
		"\7>\2\2\u0086\16\3\2\2\2\u0087\u0088\7.\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a\u008b\7@\2\2\u008b\22\3\2\2\2\u008c\u008d\7]\2\2\u008d\24"+
		"\3\2\2\2\u008e\u008f\7_\2\2\u008f\26\3\2\2\2\u0090\u0091\7~\2\2\u0091"+
		"\30\3\2\2\2\u0092\u0093\7\60\2\2\u0093\32\3\2\2\2\u0094\u0095\7D\2\2\u0095"+
		"\u0096\7Q\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7N\2\2\u0098\u0099\7G\2\2"+
		"\u0099\u009a\7C\2\2\u009a\u009b\7P\2\2\u009b\34\3\2\2\2\u009c\u009d\7"+
		"K\2\2\u009d\u009e\7P\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1"+
		"\7I\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7T\2\2\u00a3\36\3\2\2\2\u00a4\u00a5"+
		"\7T\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7N\2\2\u00a8"+
		" \3\2\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7T\2\2\u00ac"+
		"\u00ad\7C\2\2\u00ad\u00ae\7[\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7R\2\2\u00b0"+
		"\u00b1\7C\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7T\2\2\u00b3$\3\2\2\2\u00b4"+
		"\u00b5\7x\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00b9\7h\2\2\u00b9\u00ba\7{\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7e\2"+
		"\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7y\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6*\3\2\2\2\u00c7\u00c8"+
		"\7w\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7e\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2.\3\2\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7s\2\2\u00d6\u00d7\7w\2\2"+
		"\u00d7\u00d8\7k\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da\60\3\2"+
		"\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7u\2\2\u00de\u00df"+
		"\7w\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\62\3\2\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7q\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7f\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7f\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7T\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7h\2\2\u00f6"+
		"<\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7j\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7n\2\2\u00fe"+
		"\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100@\3\2\2\2\u0101\u0102\7h\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7o\2\2\u0105B\3\2\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7n\2\2\u010bD\3\2\2\2\u010c\u010d\7n\2\2\u010d\u010e\7q\2"+
		"\2\u010e\u010f\7q\2\2\u010f\u0110\7r\2\2\u0110F\3\2\2\2\u0111\u0112\7"+
		"k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7x\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7k\2\2\u0117\u0118\7c\2\2\u0118\u0119\7p\2\2\u0119"+
		"\u011a\7v\2\2\u011aH\3\2\2\2\u011b\u011c\7x\2\2\u011c\u011d\7c\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f\u0120\7c\2\2\u0120\u0121\7p\2\2"+
		"\u0121\u0122\7v\2\2\u0122J\3\2\2\2\u0123\u0124\7h\2\2\u0124\u0125\7q\2"+
		"\2\u0125\u0126\7t\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128\u0129"+
		"\7n\2\2\u0129L\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c\7z\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7u\2\2\u012e\u012f\7v\2\2\u012f\u0130\7u\2\2\u0130"+
		"N\3\2\2\2\u0131\u0132\7v\2\2\u0132\u0133\7t\2\2\u0133\u0134\7w\2\2\u0134"+
		"\u0135\7g\2\2\u0135P\3\2\2\2\u0136\u0137\7h\2\2\u0137\u0138\7c\2\2\u0138"+
		"\u0139\7n\2\2\u0139\u013a\7u\2\2\u013a\u013b\7g\2\2\u013bR\3\2\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7q\2\2\u013e\u013f\7v\2\2\u013fT\3\2\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7p\2\2\u0142\u0143\7f\2\2\u0143V\3\2\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7t\2\2\u0146X\3\2\2\2\u0147\u0148\7?\2\2\u0148"+
		"\u0149\7@\2\2\u0149Z\3\2\2\2\u014a\u014b\7>\2\2\u014b\u014c\7?\2\2\u014c"+
		"\u014d\7@\2\2\u014d\\\3\2\2\2\u014e\u014f\7?\2\2\u014f^\3\2\2\2\u0150"+
		"\u0151\7@\2\2\u0151`\3\2\2\2\u0152\u0153\7>\2\2\u0153b\3\2\2\2\u0154\u0155"+
		"\7@\2\2\u0155\u0156\7?\2\2\u0156d\3\2\2\2\u0157\u0158\7>\2\2\u0158\u0159"+
		"\7?\2\2\u0159f\3\2\2\2\u015a\u015b\7,\2\2\u015bh\3\2\2\2\u015c\u015d\7"+
		"\61\2\2\u015dj\3\2\2\2\u015e\u015f\7-\2\2\u015fl\3\2\2\2\u0160\u0161\7"+
		"/\2\2\u0161n\3\2\2\2\u0162\u0163\7/\2\2\u0163\u0164\7/\2\2\u0164\u0168"+
		"\3\2\2\2\u0165\u0167\n\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u016c\b8\2\2\u016cp\3\2\2\2\u016d\u016f\t\3\2\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\b9\2\2\u0173r\3\2\2\2\u0174\u0178\t\4\2\2\u0175"+
		"\u0177\t\5\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179t\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0187"+
		"\7\62\2\2\u017c\u017e\7/\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0183\t\6\2\2\u0180\u0182\t\7\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u017b\3\2\2\2\u0186\u017d\3\2"+
		"\2\2\u0187v\3\2\2\2\u0188\u018a\7/\2\2\u0189\u0188\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018d\t\7\2\2\u018c\u018b\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0193\7\60\2\2\u0192\u0194\t\7\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196x\3\2\2\2\f\2\u0168\u0170\u0178\u017d\u0183\u0186\u0189\u018e"+
		"\u0195\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}