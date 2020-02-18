package antlr;
// Generated from Logic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOL=11, INT=12, REAL=13, ARRAY=14, PAIR=15, VERIFY=16, FORALL=17, 
		EXISTS=18, TRUE=19, FALSE=20, NOT=21, AND=22, OR=23, IMPLIES=24, IFF=25, 
		EQUAL=26, GREATERTHAN=27, LESSTHAN=28, GREATEROREQUAL=29, LESSOREQUAL=30, 
		MUL=31, DIV=32, ADD=33, SUB=34, COMMENT=35, WS=36, ID=37, INTNUM=38, REALNUM=39;
	public static final int
		RULE_stat = 0, RULE_line = 1, RULE_declaration = 2, RULE_boolExpr = 3, 
		RULE_varDecl = 4, RULE_relation = 5, RULE_arithmetic = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "declaration", "boolExpr", "varDecl", "relation", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'<<'", "','", "'>>'", "';'", "'|'", "'('", 
			"')'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", "'verify'", 
			"'forall'", "'exists'", "'true'", "'false'", "'not'", "'and'", "'or'", 
			"'=>'", "'<=>'", "'='", "'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
			"INT", "REAL", "ARRAY", "PAIR", "VERIFY", "FORALL", "EXISTS", "TRUE", 
			"FALSE", "NOT", "AND", "OR", "IMPLIES", "IFF", "EQUAL", "GREATERTHAN", 
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

	@Override
	public String getGrammarFileName() { return "Logic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				line();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VERIFY || _la==ID );
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends LineContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VarDeclarationContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyBoolExprContext extends LineContext {
		public TerminalNode VERIFY() { return getToken(LogicParser.VERIFY, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VerifyBoolExprContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterVerifyBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitVerifyBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitVerifyBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				declaration();
				}
				break;
			case VERIFY:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(VERIFY);
				setState(21);
				boolExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleVarContext extends DeclarationContext {
		public Token type;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public SingleVarContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterSingleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitSingleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArrayValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(LogicParser.ARRAY, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> INTNUM() { return getTokens(LogicParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(LogicParser.INTNUM, i);
		}
		public IntArrayValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterIntArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitIntArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitIntArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedPairDeclContext extends DeclarationContext {
		public Token left;
		public Token right;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(LogicParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(LogicParser.BOOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(LogicParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogicParser.INT, i);
		}
		public List<TerminalNode> REAL() { return getTokens(LogicParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(LogicParser.REAL, i);
		}
		public UnnamedPairDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedPairDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedPairDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedPairDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedPairDeclContext extends DeclarationContext {
		public Token left;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(LogicParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(LogicParser.BOOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(LogicParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogicParser.INT, i);
		}
		public List<TerminalNode> REAL() { return getTokens(LogicParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(LogicParser.REAL, i);
		}
		public NamedPairDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedPairDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedPairDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedPairDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedRealArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> REAL() { return getTokens(LogicParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(LogicParser.REAL, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> REALNUM() { return getTokens(LogicParser.REALNUM); }
		public TerminalNode REALNUM(int i) {
			return getToken(LogicParser.REALNUM, i);
		}
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public NamedRealArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedRealArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedRealArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedRealArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedRealBoolPairValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public UnnamedRealBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedRealBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedRealBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedRealBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumValueDeclContext extends DeclarationContext {
		public Token type;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public NumValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNumValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNumValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNumValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedIntArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> INT() { return getTokens(LogicParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogicParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> INTNUM() { return getTokens(LogicParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(LogicParser.INTNUM, i);
		}
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public NamedIntArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedIntArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedIntArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedIntArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedIntBoolPairValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public UnnamedIntBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedIntBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedIntBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedIntBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedIntBoolPairValueDeclContext extends DeclarationContext {
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NamedIntBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedIntBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedIntBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedIntBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(LogicParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolArrayValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedIntArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> INT() { return getTokens(LogicParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogicParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> INTNUM() { return getTokens(LogicParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(LogicParser.INTNUM, i);
		}
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public UnnamedIntArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedIntArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedIntArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedIntArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedBoolBoolPairValueDeclContext extends DeclarationContext {
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(LogicParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(LogicParser.BOOL, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public NamedBoolBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedBoolBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedBoolBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedBoolBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedRealBoolPairValueDeclContext extends DeclarationContext {
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NamedRealBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedRealBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedRealBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedRealBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedRealArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> REAL() { return getTokens(LogicParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(LogicParser.REAL, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> REALNUM() { return getTokens(LogicParser.REALNUM); }
		public TerminalNode REALNUM(int i) {
			return getToken(LogicParser.REALNUM, i);
		}
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public UnnamedRealArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedRealArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedRealArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedRealArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealArrayValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(LogicParser.ARRAY, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<TerminalNode> REALNUM() { return getTokens(LogicParser.REALNUM); }
		public TerminalNode REALNUM(int i) {
			return getToken(LogicParser.REALNUM, i);
		}
		public RealArrayValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterRealArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitRealArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitRealArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedBoolBoolPairValueDeclContext extends DeclarationContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(LogicParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(LogicParser.BOOL, i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public UnnamedBoolBoolPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedBoolBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedBoolBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedBoolBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedBoolArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public UnnamedBoolArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterUnnamedBoolArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitUnnamedBoolArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitUnnamedBoolArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclContext extends DeclarationContext {
		public Token type;
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(LogicParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public ArrayDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedBoolArithPairValueDeclContext extends DeclarationContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(LogicParser.PAIR, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public NamedBoolArithPairValueDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNamedBoolArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNamedBoolArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNamedBoolArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(ID);
				setState(25);
				match(T__0);
				setState(26);
				((SingleVarContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((SingleVarContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__0);
				setState(29);
				match(BOOL);
				setState(30);
				match(EQUAL);
				setState(31);
				boolExpr(0);
				}
				break;
			case 3:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(ID);
				setState(33);
				match(T__0);
				setState(34);
				((NumValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((NumValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(35);
				match(EQUAL);
				setState(36);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(ID);
				setState(38);
				match(T__0);
				setState(39);
				match(ARRAY);
				setState(40);
				match(T__1);
				setState(41);
				((ArrayDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((ArrayDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(ID);
				setState(44);
				match(T__0);
				setState(45);
				match(ARRAY);
				setState(46);
				match(T__1);
				setState(47);
				match(BOOL);
				setState(48);
				match(T__2);
				setState(49);
				match(EQUAL);
				setState(50);
				match(T__3);
				setState(51);
				boolExpr(0);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(52);
					match(T__4);
					setState(53);
					boolExpr(0);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__0);
				setState(63);
				match(ARRAY);
				setState(64);
				match(T__1);
				setState(65);
				match(INT);
				setState(66);
				match(T__2);
				setState(67);
				match(EQUAL);
				setState(68);
				match(T__3);
				setState(69);
				match(INTNUM);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(70);
					match(T__4);
					setState(71);
					match(INTNUM);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				match(ID);
				setState(79);
				match(T__0);
				setState(80);
				match(ARRAY);
				setState(81);
				match(T__1);
				setState(82);
				match(REAL);
				setState(83);
				match(T__2);
				setState(84);
				match(EQUAL);
				setState(85);
				match(T__3);
				setState(86);
				match(REALNUM);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(87);
					match(T__4);
					setState(88);
					match(REALNUM);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(ID);
				setState(96);
				match(T__0);
				setState(97);
				match(PAIR);
				setState(98);
				match(T__1);
				setState(99);
				((UnnamedPairDeclContext)_localctx).left = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedPairDeclContext)_localctx).left = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				match(T__6);
				setState(101);
				((UnnamedPairDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedPairDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__0);
				setState(105);
				match(PAIR);
				setState(106);
				match(T__1);
				setState(107);
				match(ID);
				setState(108);
				match(T__0);
				setState(109);
				((NamedPairDeclContext)_localctx).left = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((NamedPairDeclContext)_localctx).left = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				match(T__6);
				setState(111);
				match(ID);
				setState(112);
				match(T__0);
				setState(113);
				((NamedPairDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((NamedPairDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(115);
				match(ID);
				setState(116);
				match(T__0);
				setState(117);
				match(PAIR);
				setState(118);
				match(T__1);
				setState(119);
				match(BOOL);
				setState(120);
				match(T__6);
				setState(121);
				match(BOOL);
				setState(122);
				match(T__2);
				setState(123);
				match(EQUAL);
				setState(124);
				match(T__1);
				setState(125);
				boolExpr(0);
				setState(126);
				match(T__6);
				setState(127);
				boolExpr(0);
				setState(128);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				match(ID);
				setState(131);
				match(T__0);
				setState(132);
				match(PAIR);
				setState(133);
				match(T__1);
				setState(134);
				match(BOOL);
				setState(135);
				match(T__6);
				setState(136);
				((UnnamedBoolArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((UnnamedBoolArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				match(T__2);
				setState(138);
				match(EQUAL);
				setState(139);
				match(T__1);
				setState(140);
				boolExpr(0);
				setState(141);
				match(T__6);
				setState(142);
				((UnnamedBoolArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((UnnamedBoolArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(T__2);
				}
				break;
			case 12:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__0);
				setState(147);
				match(PAIR);
				setState(148);
				match(T__1);
				setState(149);
				match(INT);
				setState(150);
				match(T__6);
				setState(151);
				match(BOOL);
				setState(152);
				match(T__2);
				setState(153);
				match(EQUAL);
				setState(154);
				match(T__1);
				setState(155);
				match(INTNUM);
				setState(156);
				match(T__6);
				setState(157);
				boolExpr(0);
				setState(158);
				match(T__2);
				}
				break;
			case 13:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				match(ID);
				setState(161);
				match(T__0);
				setState(162);
				match(PAIR);
				setState(163);
				match(T__1);
				setState(164);
				match(INT);
				setState(165);
				match(T__6);
				setState(166);
				((UnnamedIntArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((UnnamedIntArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				match(T__2);
				setState(168);
				match(EQUAL);
				setState(169);
				match(T__1);
				setState(170);
				match(INTNUM);
				setState(171);
				match(T__6);
				setState(172);
				((UnnamedIntArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((UnnamedIntArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				match(T__2);
				}
				break;
			case 14:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__0);
				setState(176);
				match(PAIR);
				setState(177);
				match(T__1);
				setState(178);
				match(REAL);
				setState(179);
				match(T__6);
				setState(180);
				match(BOOL);
				setState(181);
				match(T__2);
				setState(182);
				match(EQUAL);
				setState(183);
				match(T__1);
				setState(184);
				match(REALNUM);
				setState(185);
				match(T__6);
				setState(186);
				boolExpr(0);
				setState(187);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__0);
				setState(191);
				match(PAIR);
				setState(192);
				match(T__1);
				setState(193);
				match(REAL);
				setState(194);
				match(T__6);
				setState(195);
				((UnnamedRealArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((UnnamedRealArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				match(T__2);
				setState(197);
				match(EQUAL);
				setState(198);
				match(T__1);
				setState(199);
				match(REALNUM);
				setState(200);
				match(T__6);
				setState(201);
				((UnnamedRealArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((UnnamedRealArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				match(T__2);
				}
				break;
			case 16:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(203);
				match(ID);
				setState(204);
				match(T__0);
				setState(205);
				match(PAIR);
				setState(206);
				match(T__1);
				setState(207);
				match(ID);
				setState(208);
				match(T__0);
				setState(209);
				match(BOOL);
				setState(210);
				match(T__6);
				setState(211);
				match(ID);
				setState(212);
				match(T__0);
				setState(213);
				match(BOOL);
				setState(214);
				match(T__2);
				setState(215);
				match(EQUAL);
				setState(216);
				match(T__1);
				setState(217);
				boolExpr(0);
				setState(218);
				match(T__6);
				setState(219);
				boolExpr(0);
				setState(220);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(222);
				match(ID);
				setState(223);
				match(T__0);
				setState(224);
				match(PAIR);
				setState(225);
				match(T__1);
				setState(226);
				match(ID);
				setState(227);
				match(T__0);
				setState(228);
				match(BOOL);
				setState(229);
				match(T__6);
				setState(230);
				match(ID);
				setState(231);
				match(T__0);
				setState(232);
				((NamedBoolArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((NamedBoolArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(T__2);
				setState(234);
				match(EQUAL);
				setState(235);
				match(T__1);
				setState(236);
				boolExpr(0);
				setState(237);
				match(T__6);
				setState(238);
				((NamedBoolArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((NamedBoolArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__0);
				setState(243);
				match(PAIR);
				setState(244);
				match(T__1);
				setState(245);
				match(ID);
				setState(246);
				match(T__0);
				setState(247);
				match(INT);
				setState(248);
				match(T__6);
				setState(249);
				match(ID);
				setState(250);
				match(T__0);
				setState(251);
				match(BOOL);
				setState(252);
				match(T__2);
				setState(253);
				match(EQUAL);
				setState(254);
				match(T__1);
				setState(255);
				match(INTNUM);
				setState(256);
				match(T__6);
				setState(257);
				boolExpr(0);
				setState(258);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(260);
				match(ID);
				setState(261);
				match(T__0);
				setState(262);
				match(PAIR);
				setState(263);
				match(T__1);
				setState(264);
				match(ID);
				setState(265);
				match(T__0);
				setState(266);
				match(INT);
				setState(267);
				match(T__6);
				setState(268);
				match(ID);
				setState(269);
				match(T__0);
				setState(270);
				((NamedIntArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((NamedIntArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(T__2);
				setState(272);
				match(EQUAL);
				setState(273);
				match(T__1);
				setState(274);
				match(INTNUM);
				setState(275);
				match(T__6);
				setState(276);
				((NamedIntArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((NamedIntArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				match(T__2);
				}
				break;
			case 20:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(278);
				match(ID);
				setState(279);
				match(T__0);
				setState(280);
				match(PAIR);
				setState(281);
				match(T__1);
				setState(282);
				match(ID);
				setState(283);
				match(T__0);
				setState(284);
				match(REAL);
				setState(285);
				match(T__6);
				setState(286);
				match(ID);
				setState(287);
				match(T__0);
				setState(288);
				match(BOOL);
				setState(289);
				match(T__2);
				setState(290);
				match(EQUAL);
				setState(291);
				match(T__1);
				setState(292);
				match(REALNUM);
				setState(293);
				match(T__6);
				setState(294);
				boolExpr(0);
				setState(295);
				match(T__2);
				}
				break;
			case 21:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(297);
				match(ID);
				setState(298);
				match(T__0);
				setState(299);
				match(PAIR);
				setState(300);
				match(T__1);
				setState(301);
				match(ID);
				setState(302);
				match(T__0);
				setState(303);
				match(REAL);
				setState(304);
				match(T__6);
				setState(305);
				match(ID);
				setState(306);
				match(T__0);
				setState(307);
				((NamedRealArithPairValueDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==REAL) ) {
					((NamedRealArithPairValueDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
				match(T__2);
				setState(309);
				match(EQUAL);
				setState(310);
				match(T__1);
				setState(311);
				match(REALNUM);
				setState(312);
				match(T__6);
				setState(313);
				((NamedRealArithPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==REALNUM) ) {
					((NamedRealArithPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				match(T__2);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LogicParser.OR, 0); }
		public OrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IffContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode IFF() { return getToken(LogicParser.IFF, 0); }
		public IffContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVarContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public BoolVarContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(LogicParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpliesContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(LogicParser.IMPLIES, 0); }
		public ImpliesContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitImplies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitImplies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BoolExprContext {
		public TerminalNode EXISTS() { return getToken(LogicParser.EXISTS, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ExistsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelateContext extends BoolExprContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public RelateContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterRelate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitRelate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitRelate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LogicParser.AND, 0); }
		public AndContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends BoolExprContext {
		public TerminalNode FALSE() { return getToken(LogicParser.FALSE, 0); }
		public BoolFalseContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexBoolArrayContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public IndexBoolArrayContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterIndexBoolArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitIndexBoolArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitIndexBoolArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallContext extends BoolExprContext {
		public TerminalNode FORALL() { return getToken(LogicParser.FORALL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ForallContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterForall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitForall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitForall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTrueContext extends BoolExprContext {
		public TerminalNode TRUE() { return getToken(LogicParser.TRUE, 0); }
		public BoolTrueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ParenContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(318);
				match(NOT);
				setState(319);
				boolExpr(13);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(FORALL);
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					varDecl();
					}
					}
					setState(324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(326);
				match(T__7);
				setState(327);
				boolExpr(8);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(EXISTS);
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330);
					varDecl();
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(335);
				match(T__7);
				setState(336);
				boolExpr(7);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(ID);
				setState(340);
				match(T__1);
				setState(341);
				arithmetic(0);
				setState(342);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(T__8);
				setState(347);
				boolExpr(0);
				setState(348);
				match(T__9);
				}
				break;
			case 9:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				relation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(353);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(354);
						match(AND);
						setState(355);
						boolExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(356);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(357);
						match(OR);
						setState(358);
						boolExpr(12);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						match(IMPLIES);
						setState(361);
						boolExpr(11);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(362);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(363);
						match(IFF);
						setState(364);
						boolExpr(10);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuantifyVarContext extends VarDeclContext {
		public Token type;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public QuantifyVarContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterQuantifyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitQuantifyVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitQuantifyVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(371);
				match(T__4);
				setState(372);
				match(ID);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(T__0);
			setState(379);
			((QuantifyVarContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
				((QuantifyVarContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			match(T__6);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessOrEqualContext extends RelationContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LESSOREQUAL() { return getToken(LogicParser.LESSOREQUAL, 0); }
		public LessOrEqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitLessOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitLessOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends RelationContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(LogicParser.LESSTHAN, 0); }
		public LessThanContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends RelationContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(LogicParser.EQUAL, 0); }
		public EqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends RelationContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(LogicParser.GREATERTHAN, 0); }
		public GreaterThanContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterOrEqualContext extends RelationContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode GREATEROREQUAL() { return getToken(LogicParser.GREATEROREQUAL, 0); }
		public GreaterOrEqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitGreaterOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitGreaterOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relation);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				arithmetic(0);
				setState(383);
				match(EQUAL);
				setState(384);
				arithmetic(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				arithmetic(0);
				setState(387);
				match(GREATERTHAN);
				setState(388);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				arithmetic(0);
				setState(391);
				match(LESSTHAN);
				setState(392);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				arithmetic(0);
				setState(395);
				match(GREATEROREQUAL);
				setState(396);
				arithmetic(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				arithmetic(0);
				setState(399);
				match(LESSOREQUAL);
				setState(400);
				arithmetic(0);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticVarContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public ArithmeticVarContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterArithmeticVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitArithmeticVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitArithmeticVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntNumContext extends ArithmeticContext {
		public TerminalNode INTNUM() { return getToken(LogicParser.INTNUM, 0); }
		public IntNumContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterIntNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitIntNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitIntNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithParenContext extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithParenContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterArithParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitArithParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitArithParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LogicParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LogicParser.DIV, 0); }
		public MulDivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ArithmeticContext {
		public Token op;
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LogicParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LogicParser.SUB, 0); }
		public AddSubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealNumContext extends ArithmeticContext {
		public TerminalNode REALNUM() { return getToken(LogicParser.REALNUM, 0); }
		public RealNumContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterRealNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitRealNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitRealNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexArithmeticArrayContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public IndexArithmeticArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterIndexArithmeticArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitIndexArithmeticArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitIndexArithmeticArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(405);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(ID);
				setState(407);
				match(T__1);
				setState(408);
				arithmetic(0);
				setState(409);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				match(INTNUM);
				}
				break;
			case 4:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(REALNUM);
				}
				break;
			case 5:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				match(T__8);
				setState(414);
				arithmetic(0);
				setState(415);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(419);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(420);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(421);
						arithmetic(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(422);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(423);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(424);
						arithmetic(7);
						}
						break;
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 6:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2"+
		"\23\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u013e\n\4\3\5\3\5\3\5\3\5\3\5\6\5\u0145\n\5\r\5\16"+
		"\5\u0146\3\5\3\5\3\5\3\5\3\5\6\5\u014e\n\5\r\5\16\5\u014f\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0162\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0170\n\5\f\5\16\5\u0173"+
		"\13\5\3\6\3\6\3\6\7\6\u0178\n\6\f\6\16\6\u017b\13\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0195\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01a4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u01ac\n\b\f\b\16\b\u01af"+
		"\13\b\3\b\2\4\b\16\t\2\4\6\b\n\f\16\2\7\3\2\r\17\3\2\16\17\3\2()\3\2!"+
		"\"\3\2#$\2\u01db\2\21\3\2\2\2\4\30\3\2\2\2\6\u013d\3\2\2\2\b\u0161\3\2"+
		"\2\2\n\u0174\3\2\2\2\f\u0194\3\2\2\2\16\u01a3\3\2\2\2\20\22\5\4\3\2\21"+
		"\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25"+
		"\31\5\6\4\2\26\27\7\22\2\2\27\31\5\b\5\2\30\25\3\2\2\2\30\26\3\2\2\2\31"+
		"\5\3\2\2\2\32\33\7\'\2\2\33\34\7\3\2\2\34\u013e\t\2\2\2\35\36\7\'\2\2"+
		"\36\37\7\3\2\2\37 \7\r\2\2 !\7\34\2\2!\u013e\5\b\5\2\"#\7\'\2\2#$\7\3"+
		"\2\2$%\t\3\2\2%&\7\34\2\2&\u013e\5\16\b\2\'(\7\'\2\2()\7\3\2\2)*\7\20"+
		"\2\2*+\7\4\2\2+,\t\2\2\2,\u013e\7\5\2\2-.\7\'\2\2./\7\3\2\2/\60\7\20\2"+
		"\2\60\61\7\4\2\2\61\62\7\r\2\2\62\63\7\5\2\2\63\64\7\34\2\2\64\65\7\6"+
		"\2\2\65:\5\b\5\2\66\67\7\7\2\2\679\5\b\5\28\66\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\b\2\2>\u013e\3\2\2\2?@\7\'\2\2"+
		"@A\7\3\2\2AB\7\20\2\2BC\7\4\2\2CD\7\16\2\2DE\7\5\2\2EF\7\34\2\2FG\7\6"+
		"\2\2GL\7(\2\2HI\7\7\2\2IK\7(\2\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NL\3\2\2\2O\u013e\7\b\2\2PQ\7\'\2\2QR\7\3\2\2RS\7\20\2\2S"+
		"T\7\4\2\2TU\7\17\2\2UV\7\5\2\2VW\7\34\2\2WX\7\6\2\2X]\7)\2\2YZ\7\7\2\2"+
		"Z\\\7)\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2"+
		"\2`\u013e\7\b\2\2ab\7\'\2\2bc\7\3\2\2cd\7\21\2\2de\7\4\2\2ef\t\2\2\2f"+
		"g\7\t\2\2gh\t\2\2\2h\u013e\7\5\2\2ij\7\'\2\2jk\7\3\2\2kl\7\21\2\2lm\7"+
		"\4\2\2mn\7\'\2\2no\7\3\2\2op\t\2\2\2pq\7\t\2\2qr\7\'\2\2rs\7\3\2\2st\t"+
		"\2\2\2t\u013e\7\5\2\2uv\7\'\2\2vw\7\3\2\2wx\7\21\2\2xy\7\4\2\2yz\7\r\2"+
		"\2z{\7\t\2\2{|\7\r\2\2|}\7\5\2\2}~\7\34\2\2~\177\7\4\2\2\177\u0080\5\b"+
		"\5\2\u0080\u0081\7\t\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7\5\2\2\u0083"+
		"\u013e\3\2\2\2\u0084\u0085\7\'\2\2\u0085\u0086\7\3\2\2\u0086\u0087\7\21"+
		"\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7\r\2\2\u0089\u008a\7\t\2\2\u008a"+
		"\u008b\t\3\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7\34\2\2\u008d\u008e\7"+
		"\4\2\2\u008e\u008f\5\b\5\2\u008f\u0090\7\t\2\2\u0090\u0091\t\4\2\2\u0091"+
		"\u0092\7\5\2\2\u0092\u013e\3\2\2\2\u0093\u0094\7\'\2\2\u0094\u0095\7\3"+
		"\2\2\u0095\u0096\7\21\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\16\2\2\u0098"+
		"\u0099\7\t\2\2\u0099\u009a\7\r\2\2\u009a\u009b\7\5\2\2\u009b\u009c\7\34"+
		"\2\2\u009c\u009d\7\4\2\2\u009d\u009e\7(\2\2\u009e\u009f\7\t\2\2\u009f"+
		"\u00a0\5\b\5\2\u00a0\u00a1\7\5\2\2\u00a1\u013e\3\2\2\2\u00a2\u00a3\7\'"+
		"\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7\4\2\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00aa\7"+
		"\5\2\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\7(\2\2\u00ad"+
		"\u00ae\7\t\2\2\u00ae\u00af\t\4\2\2\u00af\u013e\7\5\2\2\u00b0\u00b1\7\'"+
		"\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7\4\2\2\u00b4"+
		"\u00b5\7\17\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7"+
		"\5\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7)\2\2\u00bb"+
		"\u00bc\7\t\2\2\u00bc\u00bd\5\b\5\2\u00bd\u00be\7\5\2\2\u00be\u013e\3\2"+
		"\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\7\21\2\2\u00c2"+
		"\u00c3\7\4\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\t"+
		"\3\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9\7\4\2\2\u00c9"+
		"\u00ca\7)\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\t\4\2\2\u00cc\u013e\7\5"+
		"\2\2\u00cd\u00ce\7\'\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0\7\21\2\2\u00d0"+
		"\u00d1\7\4\2\2\u00d1\u00d2\7\'\2\2\u00d2\u00d3\7\3\2\2\u00d3\u00d4\7\r"+
		"\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6\7\'\2\2\u00d6\u00d7\7\3\2\2\u00d7"+
		"\u00d8\7\r\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\7\34\2\2\u00da\u00db\7"+
		"\4\2\2\u00db\u00dc\5\b\5\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\5\b\5\2\u00de"+
		"\u00df\7\5\2\2\u00df\u013e\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7\3"+
		"\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\7\'\2\2\u00e5"+
		"\u00e6\7\3\2\2\u00e6\u00e7\7\r\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\7\'"+
		"\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00ec\7\5\2\2\u00ec"+
		"\u00ed\7\34\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\7"+
		"\t\2\2\u00f0\u00f1\t\4\2\2\u00f1\u00f2\7\5\2\2\u00f2\u013e\3\2\2\2\u00f3"+
		"\u00f4\7\'\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\7\21\2\2\u00f6\u00f7\7"+
		"\4\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\7\16\2\2\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u00fc\7\'\2\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\7\r"+
		"\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0100\7\34\2\2\u0100\u0101\7\4\2\2\u0101"+
		"\u0102\7(\2\2\u0102\u0103\7\t\2\2\u0103\u0104\5\b\5\2\u0104\u0105\7\5"+
		"\2\2\u0105\u013e\3\2\2\2\u0106\u0107\7\'\2\2\u0107\u0108\7\3\2\2\u0108"+
		"\u0109\7\21\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7\'\2\2\u010b\u010c\7"+
		"\3\2\2\u010c\u010d\7\16\2\2\u010d\u010e\7\t\2\2\u010e\u010f\7\'\2\2\u010f"+
		"\u0110\7\3\2\2\u0110\u0111\t\3\2\2\u0111\u0112\7\5\2\2\u0112\u0113\7\34"+
		"\2\2\u0113\u0114\7\4\2\2\u0114\u0115\7(\2\2\u0115\u0116\7\t\2\2\u0116"+
		"\u0117\t\4\2\2\u0117\u013e\7\5\2\2\u0118\u0119\7\'\2\2\u0119\u011a\7\3"+
		"\2\2\u011a\u011b\7\21\2\2\u011b\u011c\7\4\2\2\u011c\u011d\7\'\2\2\u011d"+
		"\u011e\7\3\2\2\u011e\u011f\7\17\2\2\u011f\u0120\7\t\2\2\u0120\u0121\7"+
		"\'\2\2\u0121\u0122\7\3\2\2\u0122\u0123\7\r\2\2\u0123\u0124\7\5\2\2\u0124"+
		"\u0125\7\34\2\2\u0125\u0126\7\4\2\2\u0126\u0127\7)\2\2\u0127\u0128\7\t"+
		"\2\2\u0128\u0129\5\b\5\2\u0129\u012a\7\5\2\2\u012a\u013e\3\2\2\2\u012b"+
		"\u012c\7\'\2\2\u012c\u012d\7\3\2\2\u012d\u012e\7\21\2\2\u012e\u012f\7"+
		"\4\2\2\u012f\u0130\7\'\2\2\u0130\u0131\7\3\2\2\u0131\u0132\7\17\2\2\u0132"+
		"\u0133\7\t\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7\3\2\2\u0135\u0136\t\3"+
		"\2\2\u0136\u0137\7\5\2\2\u0137\u0138\7\34\2\2\u0138\u0139\7\4\2\2\u0139"+
		"\u013a\7)\2\2\u013a\u013b\7\t\2\2\u013b\u013c\t\4\2\2\u013c\u013e\7\5"+
		"\2\2\u013d\32\3\2\2\2\u013d\35\3\2\2\2\u013d\"\3\2\2\2\u013d\'\3\2\2\2"+
		"\u013d-\3\2\2\2\u013d?\3\2\2\2\u013dP\3\2\2\2\u013da\3\2\2\2\u013di\3"+
		"\2\2\2\u013du\3\2\2\2\u013d\u0084\3\2\2\2\u013d\u0093\3\2\2\2\u013d\u00a2"+
		"\3\2\2\2\u013d\u00b0\3\2\2\2\u013d\u00bf\3\2\2\2\u013d\u00cd\3\2\2\2\u013d"+
		"\u00e0\3\2\2\2\u013d\u00f3\3\2\2\2\u013d\u0106\3\2\2\2\u013d\u0118\3\2"+
		"\2\2\u013d\u012b\3\2\2\2\u013e\7\3\2\2\2\u013f\u0140\b\5\1\2\u0140\u0141"+
		"\7\27\2\2\u0141\u0162\5\b\5\17\u0142\u0144\7\23\2\2\u0143\u0145\5\n\6"+
		"\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\n\2\2\u0149\u014a\5\b\5\n\u014a"+
		"\u0162\3\2\2\2\u014b\u014d\7\24\2\2\u014c\u014e\5\n\6\2\u014d\u014c\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7\n\2\2\u0152\u0153\5\b\5\t\u0153\u0162\3\2"+
		"\2\2\u0154\u0162\7\'\2\2\u0155\u0156\7\'\2\2\u0156\u0157\7\4\2\2\u0157"+
		"\u0158\5\16\b\2\u0158\u0159\7\5\2\2\u0159\u0162\3\2\2\2\u015a\u0162\7"+
		"\25\2\2\u015b\u0162\7\26\2\2\u015c\u015d\7\13\2\2\u015d\u015e\5\b\5\2"+
		"\u015e\u015f\7\f\2\2\u015f\u0162\3\2\2\2\u0160\u0162\5\f\7\2\u0161\u013f"+
		"\3\2\2\2\u0161\u0142\3\2\2\2\u0161\u014b\3\2\2\2\u0161\u0154\3\2\2\2\u0161"+
		"\u0155\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162\u0171\3\2\2\2\u0163\u0164\f\16\2\2\u0164"+
		"\u0165\7\30\2\2\u0165\u0170\5\b\5\17\u0166\u0167\f\r\2\2\u0167\u0168\7"+
		"\31\2\2\u0168\u0170\5\b\5\16\u0169\u016a\f\f\2\2\u016a\u016b\7\32\2\2"+
		"\u016b\u0170\5\b\5\r\u016c\u016d\f\13\2\2\u016d\u016e\7\33\2\2\u016e\u0170"+
		"\5\b\5\f\u016f\u0163\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u0169\3\2\2\2\u016f"+
		"\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\t\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0179\7\'\2\2\u0175\u0176"+
		"\7\7\2\2\u0176\u0178\7\'\2\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017c\u017d\7\3\2\2\u017d\u017e\t\2\2\2\u017e\u017f\7\t\2\2\u017f"+
		"\13\3\2\2\2\u0180\u0181\5\16\b\2\u0181\u0182\7\34\2\2\u0182\u0183\5\16"+
		"\b\2\u0183\u0195\3\2\2\2\u0184\u0185\5\16\b\2\u0185\u0186\7\35\2\2\u0186"+
		"\u0187\5\16\b\2\u0187\u0195\3\2\2\2\u0188\u0189\5\16\b\2\u0189\u018a\7"+
		"\36\2\2\u018a\u018b\5\16\b\2\u018b\u0195\3\2\2\2\u018c\u018d\5\16\b\2"+
		"\u018d\u018e\7\37\2\2\u018e\u018f\5\16\b\2\u018f\u0195\3\2\2\2\u0190\u0191"+
		"\5\16\b\2\u0191\u0192\7 \2\2\u0192\u0193\5\16\b\2\u0193\u0195\3\2\2\2"+
		"\u0194\u0180\3\2\2\2\u0194\u0184\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018c"+
		"\3\2\2\2\u0194\u0190\3\2\2\2\u0195\r\3\2\2\2\u0196\u0197\b\b\1\2\u0197"+
		"\u01a4\7\'\2\2\u0198\u0199\7\'\2\2\u0199\u019a\7\4\2\2\u019a\u019b\5\16"+
		"\b\2\u019b\u019c\7\5\2\2\u019c\u01a4\3\2\2\2\u019d\u01a4\7(\2\2\u019e"+
		"\u01a4\7)\2\2\u019f\u01a0\7\13\2\2\u01a0\u01a1\5\16\b\2\u01a1\u01a2\7"+
		"\f\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3"+
		"\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4\u01ad\3\2"+
		"\2\2\u01a5\u01a6\f\t\2\2\u01a6\u01a7\t\5\2\2\u01a7\u01ac\5\16\b\n\u01a8"+
		"\u01a9\f\b\2\2\u01a9\u01aa\t\6\2\2\u01aa\u01ac\5\16\b\t\u01ab\u01a5\3"+
		"\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\17\3\2\2\2\u01af\u01ad\3\2\2\2\22\23\30:L]\u013d"+
		"\u0146\u014f\u0161\u016f\u0171\u0179\u0194\u01a3\u01ab\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}