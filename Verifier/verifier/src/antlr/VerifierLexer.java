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
		FIRST=18, SECOND=19, VERIFY=20, COUNT=21, LOWER=22, UPPER=23, LOCAL=24, 
		REQUIRE=25, ENSURE=26, DO=27, END=28, OLD=29, RESULT=30, IF=31, ELSEIF=32, 
		THEN=33, ELSE=34, FROM=35, INVARIANT=36, UNTIL=37, LOOP=38, VARIANT=39, 
		FORALL=40, EXISTS=41, TRUE=42, FALSE=43, NOT=44, AND=45, OR=46, IMPLIES=47, 
		IFF=48, EQUAL=49, GREATERTHAN=50, LESSTHAN=51, GREATEROREQUAL=52, LESSOREQUAL=53, 
		MUL=54, DIV=55, ADD=56, SUB=57, COMMENT=58, WS=59, ID=60, INTNUM=61, REALNUM=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "BOOL", "INT", "REAL", "ARRAY", "PAIR", "FIRST", 
			"SECOND", "VERIFY", "COUNT", "LOWER", "UPPER", "LOCAL", "REQUIRE", "ENSURE", 
			"DO", "END", "OLD", "RESULT", "IF", "ELSEIF", "THEN", "ELSE", "FROM", 
			"INVARIANT", "UNTIL", "LOOP", "VARIANT", "FORALL", "EXISTS", "TRUE", 
			"FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", 
			"LESSTHAN", "GREATEROREQUAL", "LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", 
			"COMMENT", "WS", "ID", "INTNUM", "REALNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "':'", "':='", "'<<'", "','", "'>>'", "'['", 
			"']'", "'.'", "'|'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", 
			"'first'", "'second'", "'verify'", "'count'", "'lower'", "'upper'", "'local'", 
			"'require'", "'ensure'", "'do'", "'end'", "'old'", "'Result'", "'if'", 
			"'elseif'", "'then'", "'else'", "'from'", "'invariant'", "'until'", "'loop'", 
			"'variant'", "'forall'", "'exists'", "'true'", "'false'", "'not'", "'and'", 
			"'or'", "'=>'", "'<=>'", "'='", "'>'", "'<'", "'>='", "'<='", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOL", "INT", "REAL", "ARRAY", "PAIR", "FIRST", "SECOND", "VERIFY", 
			"COUNT", "LOWER", "UPPER", "LOCAL", "REQUIRE", "ENSURE", "DO", "END", 
			"OLD", "RESULT", "IF", "ELSEIF", "THEN", "ELSE", "FROM", "INVARIANT", 
			"UNTIL", "LOOP", "VARIANT", "FORALL", "EXISTS", "TRUE", "FALSE", "NOT", 
			"AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", 
			"LESSOREQUAL", "MUL", "DIV", "ADD", "SUB", "COMMENT", "WS", "ID", "INTNUM", 
			"REALNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\7;\u0181\n;\f;\16;\u0184\13;\3;\3"+
		";\3<\6<\u0189\n<\r<\16<\u018a\3<\3<\3=\3=\7=\u0191\n=\f=\16=\u0194\13"+
		"=\3>\3>\5>\u0198\n>\3>\3>\7>\u019c\n>\f>\16>\u019f\13>\5>\u01a1\n>\3?"+
		"\5?\u01a4\n?\3?\7?\u01a7\n?\f?\16?\u01aa\13?\3?\3?\6?\u01ae\n?\r?\16?"+
		"\u01af\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\3\2\b\4\2\f\f\17\17\4\2\13\f\"\"\3\2c|\6\2"+
		"\62;C\\aac|\3\2\63;\3\2\62;\2\u01b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2"+
		"\5\u0081\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u008a"+
		"\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3"+
		"\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u00a2\3\2"+
		"\2\2\37\u00aa\3\2\2\2!\u00af\3\2\2\2#\u00b5\3\2\2\2%\u00ba\3\2\2\2\'\u00c0"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00ce\3\2\2\2-\u00d4\3\2\2\2/\u00da\3\2\2\2\61"+
		"\u00e0\3\2\2\2\63\u00e6\3\2\2\2\65\u00ee\3\2\2\2\67\u00f5\3\2\2\29\u00f8"+
		"\3\2\2\2;\u00fc\3\2\2\2=\u0100\3\2\2\2?\u0107\3\2\2\2A\u010a\3\2\2\2C"+
		"\u0111\3\2\2\2E\u0116\3\2\2\2G\u011b\3\2\2\2I\u0120\3\2\2\2K\u012a\3\2"+
		"\2\2M\u0130\3\2\2\2O\u0135\3\2\2\2Q\u013d\3\2\2\2S\u0144\3\2\2\2U\u014b"+
		"\3\2\2\2W\u0150\3\2\2\2Y\u0156\3\2\2\2[\u015a\3\2\2\2]\u015e\3\2\2\2_"+
		"\u0161\3\2\2\2a\u0164\3\2\2\2c\u0168\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2"+
		"\2\2i\u016e\3\2\2\2k\u0171\3\2\2\2m\u0174\3\2\2\2o\u0176\3\2\2\2q\u0178"+
		"\3\2\2\2s\u017a\3\2\2\2u\u017c\3\2\2\2w\u0188\3\2\2\2y\u018e\3\2\2\2{"+
		"\u01a0\3\2\2\2}\u01a3\3\2\2\2\177\u0080\7*\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7=\2\2\u0082\6\3\2\2\2\u0083\u0084\7+\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7<\2\2\u0086\n\3\2\2\2\u0087\u0088\7<\2\2\u0088\u0089\7?\2\2\u0089\f"+
		"\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7>\2\2\u008c\16\3\2\2\2\u008d"+
		"\u008e\7.\2\2\u008e\20\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7@\2\2\u0091"+
		"\22\3\2\2\2\u0092\u0093\7]\2\2\u0093\24\3\2\2\2\u0094\u0095\7_\2\2\u0095"+
		"\26\3\2\2\2\u0096\u0097\7\60\2\2\u0097\30\3\2\2\2\u0098\u0099\7~\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\7D\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7Q\2\2\u009d"+
		"\u009e\7N\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7P\2\2"+
		"\u00a1\34\3\2\2\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5\7"+
		"V\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7I\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9"+
		"\7T\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad"+
		"\7C\2\2\u00ad\u00ae\7N\2\2\u00ae \3\2\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1"+
		"\7T\2\2\u00b1\u00b2\7T\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7[\2\2\u00b4"+
		"\"\3\2\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7K\2\2\u00b8"+
		"\u00b9\7T\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf&\3\2\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7q\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\u00c6\7f\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7x\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7h\2\2\u00cc\u00cd\7{\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		",\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9.\3\2\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2"+
		"\u00df\60\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7"+
		"e\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\62\3\2\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7s\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\64\3\2\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7w\2\2"+
		"\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7"+
		"f\2\2\u00f6\u00f7\7q\2\2\u00f78\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7f\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe"+
		"\7n\2\2\u00fe\u00ff\7f\2\2\u00ff<\3\2\2\2\u0100\u0101\7T\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7u\2\2\u0103\u0104\7w\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7v\2\2\u0106>\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109\7h\2\2\u0109"+
		"@\3\2\2\2\u010a\u010b\7g\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7k\2\2\u010f\u0110\7h\2\2\u0110B\3\2\2\2\u0111"+
		"\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2"+
		"\u0115D\3\2\2\2\u0116\u0117\7g\2\2\u0117\u0118\7n\2\2\u0118\u0119\7u\2"+
		"\2\u0119\u011a\7g\2\2\u011aF\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d\7"+
		"t\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011fH\3\2\2\2\u0120\u0121"+
		"\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7x\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7t\2\2\u0125\u0126\7k\2\2\u0126\u0127\7c\2\2\u0127\u0128\7p\2\2"+
		"\u0128\u0129\7v\2\2\u0129J\3\2\2\2\u012a\u012b\7w\2\2\u012b\u012c\7p\2"+
		"\2\u012c\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e\u012f\7n\2\2\u012fL\3\2"+
		"\2\2\u0130\u0131\7n\2\2\u0131\u0132\7q\2\2\u0132\u0133\7q\2\2\u0133\u0134"+
		"\7r\2\2\u0134N\3\2\2\2\u0135\u0136\7x\2\2\u0136\u0137\7c\2\2\u0137\u0138"+
		"\7t\2\2\u0138\u0139\7k\2\2\u0139\u013a\7c\2\2\u013a\u013b\7p\2\2\u013b"+
		"\u013c\7v\2\2\u013cP\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7q\2\2\u013f"+
		"\u0140\7t\2\2\u0140\u0141\7c\2\2\u0141\u0142\7n\2\2\u0142\u0143\7n\2\2"+
		"\u0143R\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7z\2\2\u0146\u0147\7k\2"+
		"\2\u0147\u0148\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7u\2\2\u014aT\3\2"+
		"\2\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7w\2\2\u014e\u014f"+
		"\7g\2\2\u014fV\3\2\2\2\u0150\u0151\7h\2\2\u0151\u0152\7c\2\2\u0152\u0153"+
		"\7n\2\2\u0153\u0154\7u\2\2\u0154\u0155\7g\2\2\u0155X\3\2\2\2\u0156\u0157"+
		"\7p\2\2\u0157\u0158\7q\2\2\u0158\u0159\7v\2\2\u0159Z\3\2\2\2\u015a\u015b"+
		"\7c\2\2\u015b\u015c\7p\2\2\u015c\u015d\7f\2\2\u015d\\\3\2\2\2\u015e\u015f"+
		"\7q\2\2\u015f\u0160\7t\2\2\u0160^\3\2\2\2\u0161\u0162\7?\2\2\u0162\u0163"+
		"\7@\2\2\u0163`\3\2\2\2\u0164\u0165\7>\2\2\u0165\u0166\7?\2\2\u0166\u0167"+
		"\7@\2\2\u0167b\3\2\2\2\u0168\u0169\7?\2\2\u0169d\3\2\2\2\u016a\u016b\7"+
		"@\2\2\u016bf\3\2\2\2\u016c\u016d\7>\2\2\u016dh\3\2\2\2\u016e\u016f\7@"+
		"\2\2\u016f\u0170\7?\2\2\u0170j\3\2\2\2\u0171\u0172\7>\2\2\u0172\u0173"+
		"\7?\2\2\u0173l\3\2\2\2\u0174\u0175\7,\2\2\u0175n\3\2\2\2\u0176\u0177\7"+
		"\61\2\2\u0177p\3\2\2\2\u0178\u0179\7-\2\2\u0179r\3\2\2\2\u017a\u017b\7"+
		"/\2\2\u017bt\3\2\2\2\u017c\u017d\7/\2\2\u017d\u017e\7/\2\2\u017e\u0182"+
		"\3\2\2\2\u017f\u0181\n\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\b;\2\2\u0186v\3\2\2\2\u0187\u0189\t\3\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\b<\2\2\u018dx\3\2\2\2\u018e\u0192\t\4\2\2\u018f"+
		"\u0191\t\5\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193z\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u01a1"+
		"\7\62\2\2\u0196\u0198\7/\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019d\t\6\2\2\u019a\u019c\t\7\2\2\u019b\u019a\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0\u0197\3\2"+
		"\2\2\u01a1|\3\2\2\2\u01a2\u01a4\7/\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\t\7\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01ae\t\7\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0~\3\2\2\2\f\2\u0182\u018a\u0192\u0197\u019d\u01a0\u01a3\u01a8"+
		"\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}