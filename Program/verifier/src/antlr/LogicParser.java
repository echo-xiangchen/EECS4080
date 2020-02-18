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
		T__9=10, T__10=11, BOOL=12, INT=13, REAL=14, ARRAY=15, PAIR=16, VERIFY=17, 
		REQUIRE=18, ENSURE=19, DO=20, END=21, FORALL=22, EXISTS=23, TRUE=24, FALSE=25, 
		NOT=26, AND=27, OR=28, IMPLIES=29, IFF=30, EQUAL=31, GREATERTHAN=32, LESSTHAN=33, 
		GREATEROREQUAL=34, LESSOREQUAL=35, MUL=36, DIV=37, ADD=38, SUB=39, COMMENT=40, 
		WS=41, ID=42, INTNUM=43, REALNUM=44;
	public static final int
		RULE_stat = 0, RULE_line = 1, RULE_method = 2, RULE_mutator = 3, RULE_accessor = 4, 
		RULE_declaration = 5, RULE_body = 6, RULE_assignment = 7, RULE_boolExpr = 8, 
		RULE_varDecl = 9, RULE_relation = 10, RULE_arithmetic = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "declaration", "body", 
			"assignment", "boolExpr", "varDecl", "relation", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "':'", "')'", "'['", "']'", "'<<'", "','", "'>>'", "';'", 
			"':='", "'|'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", 
			"'verify'", "'require'", "'ensure'", "'do'", "'end'", "'forall'", "'exists'", 
			"'true'", "'false'", "'not'", "'and'", "'or'", "'=>'", "'<=>'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BOOL", "INT", "REAL", "ARRAY", "PAIR", "VERIFY", "REQUIRE", "ENSURE", 
			"DO", "END", "FORALL", "EXISTS", "TRUE", "FALSE", "NOT", "AND", "OR", 
			"IMPLIES", "IFF", "EQUAL", "GREATERTHAN", "LESSTHAN", "GREATEROREQUAL", 
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				line();
				}
				}
				setState(27); 
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
	public static class VerifyProgramContext extends LineContext {
		public TerminalNode VERIFY() { return getToken(LogicParser.VERIFY, 0); }
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public VerifyProgramContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterVerifyProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitVerifyProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitVerifyProgram(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineMethodContext extends LineContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public DefineMethodContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterDefineMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitDefineMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitDefineMethod(this);
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				declaration();
				}
				break;
			case 2:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				method();
				}
				break;
			case 3:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(VERIFY);
				setState(32);
				boolExpr(0);
				}
				break;
			case 4:
				_localctx = new VerifyProgramContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(VERIFY);
				setState(34);
				match(ID);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AccessorMethodContext extends MethodContext {
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public AccessorMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAccessorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAccessorMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAccessorMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MutatorMethodContext extends MethodContext {
		public MutatorContext mutator() {
			return getRuleContext(MutatorContext.class,0);
		}
		public MutatorMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterMutatorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitMutatorMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitMutatorMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				accessor();
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

	public static class MutatorContext extends ParserRuleContext {
		public Token type;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode REQUIRE() { return getToken(LogicParser.REQUIRE, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(LogicParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ENSURE() { return getToken(LogicParser.ENSURE, 0); }
		public TerminalNode END() { return getToken(LogicParser.END, 0); }
		public TerminalNode BOOL() { return getToken(LogicParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(LogicParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LogicParser.REAL, 0); }
		public MutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterMutator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitMutator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitMutator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutatorContext mutator() throws RecognitionException {
		MutatorContext _localctx = new MutatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mutator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
			setState(42);
			match(T__0);
			setState(43);
			match(ID);
			setState(44);
			match(T__1);
			setState(45);
			((MutatorContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
				((MutatorContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			match(T__2);
			setState(47);
			declaration();
			setState(48);
			match(REQUIRE);
			setState(49);
			boolExpr(0);
			setState(50);
			match(DO);
			setState(51);
			body();
			setState(52);
			match(ENSURE);
			setState(53);
			boolExpr(0);
			setState(54);
			match(END);
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

	public static class AccessorContext extends ParserRuleContext {
		public Token type1;
		public Token type2;
		public List<TerminalNode> ID() { return getTokens(LogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicParser.ID, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode REQUIRE() { return getToken(LogicParser.REQUIRE, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(LogicParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ENSURE() { return getToken(LogicParser.ENSURE, 0); }
		public TerminalNode END() { return getToken(LogicParser.END, 0); }
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
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(T__0);
			setState(58);
			match(ID);
			setState(59);
			match(T__1);
			setState(60);
			((AccessorContext)_localctx).type1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
				((AccessorContext)_localctx).type1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			match(T__2);
			setState(62);
			match(ID);
			setState(63);
			match(T__1);
			setState(64);
			((AccessorContext)_localctx).type2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
				((AccessorContext)_localctx).type2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			declaration();
			setState(66);
			match(REQUIRE);
			setState(67);
			boolExpr(0);
			setState(68);
			match(DO);
			setState(69);
			body();
			setState(70);
			match(ENSURE);
			setState(71);
			boolExpr(0);
			setState(72);
			match(END);
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
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
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
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
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
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__1);
				setState(76);
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
				setState(77);
				match(ID);
				setState(78);
				match(T__1);
				setState(79);
				match(BOOL);
				setState(80);
				match(EQUAL);
				setState(81);
				boolExpr(0);
				}
				break;
			case 3:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(ID);
				setState(83);
				match(T__1);
				setState(84);
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
				setState(85);
				match(EQUAL);
				setState(86);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(ID);
				setState(88);
				match(T__1);
				setState(89);
				match(ARRAY);
				setState(90);
				match(T__3);
				setState(91);
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
				setState(92);
				match(T__4);
				}
				break;
			case 5:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(ID);
				setState(94);
				match(T__1);
				setState(95);
				match(ARRAY);
				setState(96);
				match(T__3);
				setState(97);
				match(BOOL);
				setState(98);
				match(T__4);
				setState(99);
				match(EQUAL);
				setState(100);
				match(T__5);
				setState(101);
				boolExpr(0);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(102);
					match(T__6);
					setState(103);
					boolExpr(0);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__1);
				setState(113);
				match(ARRAY);
				setState(114);
				match(T__3);
				setState(115);
				match(INT);
				setState(116);
				match(T__4);
				setState(117);
				match(EQUAL);
				setState(118);
				match(T__5);
				setState(119);
				arithmetic(0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(120);
					match(T__6);
					setState(121);
					arithmetic(0);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__7);
				}
				break;
			case 7:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(ID);
				setState(130);
				match(T__1);
				setState(131);
				match(ARRAY);
				setState(132);
				match(T__3);
				setState(133);
				match(REAL);
				setState(134);
				match(T__4);
				setState(135);
				match(EQUAL);
				setState(136);
				match(T__5);
				setState(137);
				arithmetic(0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(138);
					match(T__6);
					setState(139);
					arithmetic(0);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__7);
				}
				break;
			case 8:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__1);
				setState(149);
				match(PAIR);
				setState(150);
				match(T__3);
				setState(151);
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
				setState(152);
				match(T__8);
				setState(153);
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
				setState(154);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__1);
				setState(157);
				match(PAIR);
				setState(158);
				match(T__3);
				setState(159);
				match(ID);
				setState(160);
				match(T__1);
				setState(161);
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
				setState(162);
				match(T__8);
				setState(163);
				match(ID);
				setState(164);
				match(T__1);
				setState(165);
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
				setState(166);
				match(T__4);
				}
				break;
			case 10:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				match(ID);
				setState(168);
				match(T__1);
				setState(169);
				match(PAIR);
				setState(170);
				match(T__3);
				setState(171);
				match(BOOL);
				setState(172);
				match(T__8);
				setState(173);
				match(BOOL);
				setState(174);
				match(T__4);
				setState(175);
				match(EQUAL);
				setState(176);
				match(T__3);
				setState(177);
				boolExpr(0);
				setState(178);
				match(T__8);
				setState(179);
				boolExpr(0);
				setState(180);
				match(T__4);
				}
				break;
			case 11:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(182);
				match(ID);
				setState(183);
				match(T__1);
				setState(184);
				match(PAIR);
				setState(185);
				match(T__3);
				setState(186);
				match(BOOL);
				setState(187);
				match(T__8);
				setState(188);
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
				setState(189);
				match(T__4);
				setState(190);
				match(EQUAL);
				setState(191);
				match(T__3);
				setState(192);
				boolExpr(0);
				setState(193);
				match(T__8);
				setState(194);
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
				setState(195);
				match(T__4);
				}
				break;
			case 12:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(197);
				match(ID);
				setState(198);
				match(T__1);
				setState(199);
				match(PAIR);
				setState(200);
				match(T__3);
				setState(201);
				match(INT);
				setState(202);
				match(T__8);
				setState(203);
				match(BOOL);
				setState(204);
				match(T__4);
				setState(205);
				match(EQUAL);
				setState(206);
				match(T__3);
				setState(207);
				match(INTNUM);
				setState(208);
				match(T__8);
				setState(209);
				boolExpr(0);
				setState(210);
				match(T__4);
				}
				break;
			case 13:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__1);
				setState(214);
				match(PAIR);
				setState(215);
				match(T__3);
				setState(216);
				match(INT);
				setState(217);
				match(T__8);
				setState(218);
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
				setState(219);
				match(T__4);
				setState(220);
				match(EQUAL);
				setState(221);
				match(T__3);
				setState(222);
				match(INTNUM);
				setState(223);
				match(T__8);
				setState(224);
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
				setState(225);
				match(T__4);
				}
				break;
			case 14:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(226);
				match(ID);
				setState(227);
				match(T__1);
				setState(228);
				match(PAIR);
				setState(229);
				match(T__3);
				setState(230);
				match(REAL);
				setState(231);
				match(T__8);
				setState(232);
				match(BOOL);
				setState(233);
				match(T__4);
				setState(234);
				match(EQUAL);
				setState(235);
				match(T__3);
				setState(236);
				match(REALNUM);
				setState(237);
				match(T__8);
				setState(238);
				boolExpr(0);
				setState(239);
				match(T__4);
				}
				break;
			case 15:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__1);
				setState(243);
				match(PAIR);
				setState(244);
				match(T__3);
				setState(245);
				match(REAL);
				setState(246);
				match(T__8);
				setState(247);
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
				setState(248);
				match(T__4);
				setState(249);
				match(EQUAL);
				setState(250);
				match(T__3);
				setState(251);
				match(REALNUM);
				setState(252);
				match(T__8);
				setState(253);
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
				setState(254);
				match(T__4);
				}
				break;
			case 16:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(255);
				match(ID);
				setState(256);
				match(T__1);
				setState(257);
				match(PAIR);
				setState(258);
				match(T__3);
				setState(259);
				match(ID);
				setState(260);
				match(T__1);
				setState(261);
				match(BOOL);
				setState(262);
				match(T__8);
				setState(263);
				match(ID);
				setState(264);
				match(T__1);
				setState(265);
				match(BOOL);
				setState(266);
				match(T__4);
				setState(267);
				match(EQUAL);
				setState(268);
				match(T__3);
				setState(269);
				boolExpr(0);
				setState(270);
				match(T__8);
				setState(271);
				boolExpr(0);
				setState(272);
				match(T__4);
				}
				break;
			case 17:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__1);
				setState(276);
				match(PAIR);
				setState(277);
				match(T__3);
				setState(278);
				match(ID);
				setState(279);
				match(T__1);
				setState(280);
				match(BOOL);
				setState(281);
				match(T__8);
				setState(282);
				match(ID);
				setState(283);
				match(T__1);
				setState(284);
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
				setState(285);
				match(T__4);
				setState(286);
				match(EQUAL);
				setState(287);
				match(T__3);
				setState(288);
				boolExpr(0);
				setState(289);
				match(T__8);
				setState(290);
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
				setState(291);
				match(T__4);
				}
				break;
			case 18:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__1);
				setState(295);
				match(PAIR);
				setState(296);
				match(T__3);
				setState(297);
				match(ID);
				setState(298);
				match(T__1);
				setState(299);
				match(INT);
				setState(300);
				match(T__8);
				setState(301);
				match(ID);
				setState(302);
				match(T__1);
				setState(303);
				match(BOOL);
				setState(304);
				match(T__4);
				setState(305);
				match(EQUAL);
				setState(306);
				match(T__3);
				setState(307);
				match(INTNUM);
				setState(308);
				match(T__8);
				setState(309);
				boolExpr(0);
				setState(310);
				match(T__4);
				}
				break;
			case 19:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(312);
				match(ID);
				setState(313);
				match(T__1);
				setState(314);
				match(PAIR);
				setState(315);
				match(T__3);
				setState(316);
				match(ID);
				setState(317);
				match(T__1);
				setState(318);
				match(INT);
				setState(319);
				match(T__8);
				setState(320);
				match(ID);
				setState(321);
				match(T__1);
				setState(322);
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
				setState(323);
				match(T__4);
				setState(324);
				match(EQUAL);
				setState(325);
				match(T__3);
				setState(326);
				match(INTNUM);
				setState(327);
				match(T__8);
				setState(328);
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
				setState(329);
				match(T__4);
				}
				break;
			case 20:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(330);
				match(ID);
				setState(331);
				match(T__1);
				setState(332);
				match(PAIR);
				setState(333);
				match(T__3);
				setState(334);
				match(ID);
				setState(335);
				match(T__1);
				setState(336);
				match(REAL);
				setState(337);
				match(T__8);
				setState(338);
				match(ID);
				setState(339);
				match(T__1);
				setState(340);
				match(BOOL);
				setState(341);
				match(T__4);
				setState(342);
				match(EQUAL);
				setState(343);
				match(T__3);
				setState(344);
				match(REALNUM);
				setState(345);
				match(T__8);
				setState(346);
				boolExpr(0);
				setState(347);
				match(T__4);
				}
				break;
			case 21:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(349);
				match(ID);
				setState(350);
				match(T__1);
				setState(351);
				match(PAIR);
				setState(352);
				match(T__3);
				setState(353);
				match(ID);
				setState(354);
				match(T__1);
				setState(355);
				match(REAL);
				setState(356);
				match(T__8);
				setState(357);
				match(ID);
				setState(358);
				match(T__1);
				setState(359);
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
				setState(360);
				match(T__4);
				setState(361);
				match(EQUAL);
				setState(362);
				match(T__3);
				setState(363);
				match(REALNUM);
				setState(364);
				match(T__8);
				setState(365);
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
				setState(366);
				match(T__4);
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

	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends BodyContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarAssignmentContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterArithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitArithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitArithAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(LogicParser.ID, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterBoolAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitBoolAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitBoolAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(ID);
				setState(372);
				match(T__9);
				setState(373);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new ArithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ID);
				setState(375);
				match(T__9);
				setState(376);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(380);
				match(NOT);
				setState(381);
				boolExpr(13);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(FORALL);
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(383);
					varDecl();
					}
					}
					setState(386); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(388);
				match(T__10);
				setState(389);
				boolExpr(8);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(391);
				match(EXISTS);
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392);
					varDecl();
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(397);
				match(T__10);
				setState(398);
				boolExpr(7);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				match(ID);
				setState(402);
				match(T__3);
				setState(403);
				arithmetic(0);
				setState(404);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(T__0);
				setState(409);
				boolExpr(0);
				setState(410);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				relation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(415);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(416);
						match(AND);
						setState(417);
						boolExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(418);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(419);
						match(OR);
						setState(420);
						boolExpr(12);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(421);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(422);
						match(IMPLIES);
						setState(423);
						boolExpr(11);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(424);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(425);
						match(IFF);
						setState(426);
						boolExpr(10);
						}
						break;
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 18, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ID);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(433);
				match(T__6);
				setState(434);
				match(ID);
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(T__1);
			setState(441);
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
			setState(442);
			match(T__8);
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
		enterRule(_localctx, 20, RULE_relation);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				arithmetic(0);
				setState(445);
				match(EQUAL);
				setState(446);
				arithmetic(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				arithmetic(0);
				setState(449);
				match(GREATERTHAN);
				setState(450);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				arithmetic(0);
				setState(453);
				match(LESSTHAN);
				setState(454);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				arithmetic(0);
				setState(457);
				match(GREATEROREQUAL);
				setState(458);
				arithmetic(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				arithmetic(0);
				setState(461);
				match(LESSOREQUAL);
				setState(462);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(467);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				match(ID);
				setState(469);
				match(T__3);
				setState(470);
				arithmetic(0);
				setState(471);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473);
				match(INTNUM);
				}
				break;
			case 4:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474);
				match(REALNUM);
				}
				break;
			case 5:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				match(T__0);
				setState(476);
				arithmetic(0);
				setState(477);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(481);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(482);
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
						setState(483);
						arithmetic(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(484);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(485);
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
						setState(486);
						arithmetic(7);
						}
						break;
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 8:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0172\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u017c\n\t\3\n\3\n\3\n\3\n\3\n\6\n\u0183\n\n\r\n\16\n\u0184\3"+
		"\n\3\n\3\n\3\n\3\n\6\n\u018c\n\n\r\n\16\n\u018d\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01a0\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01ae\n\n\f\n\16\n\u01b1\13\n\3"+
		"\13\3\13\3\13\7\13\u01b6\n\13\f\13\16\13\u01b9\13\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u01d3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u01e2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01ea\n\r\f\r\16"+
		"\r\u01ed\13\r\3\r\2\4\22\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\16"+
		"\20\3\2\17\20\3\2-.\3\2&\'\3\2()\2\u0218\2\33\3\2\2\2\4%\3\2\2\2\6)\3"+
		"\2\2\2\b+\3\2\2\2\n:\3\2\2\2\f\u0171\3\2\2\2\16\u0173\3\2\2\2\20\u017b"+
		"\3\2\2\2\22\u019f\3\2\2\2\24\u01b2\3\2\2\2\26\u01d2\3\2\2\2\30\u01e1\3"+
		"\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\3\3\2\2\2\37&\5\f\7\2 &\5\6\4\2!\"\7\23\2\2\"&\5\22\n\2#$\7"+
		"\23\2\2$&\7,\2\2%\37\3\2\2\2% \3\2\2\2%!\3\2\2\2%#\3\2\2\2&\5\3\2\2\2"+
		"\'*\5\b\5\2(*\5\n\6\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\7,\2\2,-\7\3\2"+
		"\2-.\7,\2\2./\7\4\2\2/\60\t\2\2\2\60\61\7\5\2\2\61\62\5\f\7\2\62\63\7"+
		"\24\2\2\63\64\5\22\n\2\64\65\7\26\2\2\65\66\5\16\b\2\66\67\7\25\2\2\67"+
		"8\5\22\n\289\7\27\2\29\t\3\2\2\2:;\7,\2\2;<\7\3\2\2<=\7,\2\2=>\7\4\2\2"+
		">?\t\2\2\2?@\7\5\2\2@A\7,\2\2AB\7\4\2\2BC\t\2\2\2CD\5\f\7\2DE\7\24\2\2"+
		"EF\5\22\n\2FG\7\26\2\2GH\5\16\b\2HI\7\25\2\2IJ\5\22\n\2JK\7\27\2\2K\13"+
		"\3\2\2\2LM\7,\2\2MN\7\4\2\2N\u0172\t\2\2\2OP\7,\2\2PQ\7\4\2\2QR\7\16\2"+
		"\2RS\7!\2\2S\u0172\5\22\n\2TU\7,\2\2UV\7\4\2\2VW\t\3\2\2WX\7!\2\2X\u0172"+
		"\5\30\r\2YZ\7,\2\2Z[\7\4\2\2[\\\7\21\2\2\\]\7\6\2\2]^\t\2\2\2^\u0172\7"+
		"\7\2\2_`\7,\2\2`a\7\4\2\2ab\7\21\2\2bc\7\6\2\2cd\7\16\2\2de\7\7\2\2ef"+
		"\7!\2\2fg\7\b\2\2gl\5\22\n\2hi\7\t\2\2ik\5\22\n\2jh\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\n\2\2p\u0172\3\2\2\2qr\7"+
		",\2\2rs\7\4\2\2st\7\21\2\2tu\7\6\2\2uv\7\17\2\2vw\7\7\2\2wx\7!\2\2xy\7"+
		"\b\2\2y~\5\30\r\2z{\7\t\2\2{}\5\30\r\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\n\2\2"+
		"\u0082\u0172\3\2\2\2\u0083\u0084\7,\2\2\u0084\u0085\7\4\2\2\u0085\u0086"+
		"\7\21\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\7\2\2"+
		"\u0089\u008a\7!\2\2\u008a\u008b\7\b\2\2\u008b\u0090\5\30\r\2\u008c\u008d"+
		"\7\t\2\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7\n\2\2\u0094\u0172\3\2\2\2\u0095\u0096\7,\2\2\u0096"+
		"\u0097\7\4\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\6\2\2\u0099\u009a\t"+
		"\2\2\2\u009a\u009b\7\13\2\2\u009b\u009c\t\2\2\2\u009c\u0172\7\7\2\2\u009d"+
		"\u009e\7,\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\7\6"+
		"\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\t\2\2\2\u00a4"+
		"\u00a5\7\13\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\t\2"+
		"\2\2\u00a8\u0172\7\7\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7\4\2\2\u00ab"+
		"\u00ac\7\22\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\7"+
		"\13\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\7!\2\2\u00b2"+
		"\u00b3\7\6\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\5"+
		"\22\n\2\u00b6\u00b7\7\7\2\2\u00b7\u0172\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00ba\7\4\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\7"+
		"\16\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\t\3\2\2\u00bf\u00c0\7\7\2\2\u00c0"+
		"\u00c1\7!\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\5\22\n\2\u00c3\u00c4\7\13"+
		"\2\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6\7\7\2\2\u00c6\u0172\3\2\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\7\6"+
		"\2\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\7\13\2\2\u00cd\u00ce\7\16\2\2\u00ce"+
		"\u00cf\7\7\2\2\u00cf\u00d0\7!\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7-\2"+
		"\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7\7\2\2\u00d5"+
		"\u0172\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\7\22"+
		"\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\7\17\2\2\u00db\u00dc\7\13\2\2\u00dc"+
		"\u00dd\t\3\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\7!\2\2\u00df\u00e0\7\6"+
		"\2\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\t\4\2\2\u00e3"+
		"\u0172\7\7\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\7\4\2\2\u00e6\u00e7\7\22"+
		"\2\2\u00e7\u00e8\7\6\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea\7\13\2\2\u00ea"+
		"\u00eb\7\16\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\7!\2\2\u00ed\u00ee\7\6"+
		"\2\2\u00ee\u00ef\7.\2\2\u00ef\u00f0\7\13\2\2\u00f0\u00f1\5\22\n\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u0172\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\7\4"+
		"\2\2\u00f5\u00f6\7\22\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\7\20\2\2\u00f8"+
		"\u00f9\7\13\2\2\u00f9\u00fa\t\3\2\2\u00fa\u00fb\7\7\2\2\u00fb\u00fc\7"+
		"!\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7.\2\2\u00fe\u00ff\7\13\2\2\u00ff"+
		"\u0100\t\4\2\2\u0100\u0172\7\7\2\2\u0101\u0102\7,\2\2\u0102\u0103\7\4"+
		"\2\2\u0103\u0104\7\22\2\2\u0104\u0105\7\6\2\2\u0105\u0106\7,\2\2\u0106"+
		"\u0107\7\4\2\2\u0107\u0108\7\16\2\2\u0108\u0109\7\13\2\2\u0109\u010a\7"+
		",\2\2\u010a\u010b\7\4\2\2\u010b\u010c\7\16\2\2\u010c\u010d\7\7\2\2\u010d"+
		"\u010e\7!\2\2\u010e\u010f\7\6\2\2\u010f\u0110\5\22\n\2\u0110\u0111\7\13"+
		"\2\2\u0111\u0112\5\22\n\2\u0112\u0113\7\7\2\2\u0113\u0172\3\2\2\2\u0114"+
		"\u0115\7,\2\2\u0115\u0116\7\4\2\2\u0116\u0117\7\22\2\2\u0117\u0118\7\6"+
		"\2\2\u0118\u0119\7,\2\2\u0119\u011a\7\4\2\2\u011a\u011b\7\16\2\2\u011b"+
		"\u011c\7\13\2\2\u011c\u011d\7,\2\2\u011d\u011e\7\4\2\2\u011e\u011f\t\3"+
		"\2\2\u011f\u0120\7\7\2\2\u0120\u0121\7!\2\2\u0121\u0122\7\6\2\2\u0122"+
		"\u0123\5\22\n\2\u0123\u0124\7\13\2\2\u0124\u0125\t\4\2\2\u0125\u0126\7"+
		"\7\2\2\u0126\u0172\3\2\2\2\u0127\u0128\7,\2\2\u0128\u0129\7\4\2\2\u0129"+
		"\u012a\7\22\2\2\u012a\u012b\7\6\2\2\u012b\u012c\7,\2\2\u012c\u012d\7\4"+
		"\2\2\u012d\u012e\7\17\2\2\u012e\u012f\7\13\2\2\u012f\u0130\7,\2\2\u0130"+
		"\u0131\7\4\2\2\u0131\u0132\7\16\2\2\u0132\u0133\7\7\2\2\u0133\u0134\7"+
		"!\2\2\u0134\u0135\7\6\2\2\u0135\u0136\7-\2\2\u0136\u0137\7\13\2\2\u0137"+
		"\u0138\5\22\n\2\u0138\u0139\7\7\2\2\u0139\u0172\3\2\2\2\u013a\u013b\7"+
		",\2\2\u013b\u013c\7\4\2\2\u013c\u013d\7\22\2\2\u013d\u013e\7\6\2\2\u013e"+
		"\u013f\7,\2\2\u013f\u0140\7\4\2\2\u0140\u0141\7\17\2\2\u0141\u0142\7\13"+
		"\2\2\u0142\u0143\7,\2\2\u0143\u0144\7\4\2\2\u0144\u0145\t\3\2\2\u0145"+
		"\u0146\7\7\2\2\u0146\u0147\7!\2\2\u0147\u0148\7\6\2\2\u0148\u0149\7-\2"+
		"\2\u0149\u014a\7\13\2\2\u014a\u014b\t\4\2\2\u014b\u0172\7\7\2\2\u014c"+
		"\u014d\7,\2\2\u014d\u014e\7\4\2\2\u014e\u014f\7\22\2\2\u014f\u0150\7\6"+
		"\2\2\u0150\u0151\7,\2\2\u0151\u0152\7\4\2\2\u0152\u0153\7\20\2\2\u0153"+
		"\u0154\7\13\2\2\u0154\u0155\7,\2\2\u0155\u0156\7\4\2\2\u0156\u0157\7\16"+
		"\2\2\u0157\u0158\7\7\2\2\u0158\u0159\7!\2\2\u0159\u015a\7\6\2\2\u015a"+
		"\u015b\7.\2\2\u015b\u015c\7\13\2\2\u015c\u015d\5\22\n\2\u015d\u015e\7"+
		"\7\2\2\u015e\u0172\3\2\2\2\u015f\u0160\7,\2\2\u0160\u0161\7\4\2\2\u0161"+
		"\u0162\7\22\2\2\u0162\u0163\7\6\2\2\u0163\u0164\7,\2\2\u0164\u0165\7\4"+
		"\2\2\u0165\u0166\7\20\2\2\u0166\u0167\7\13\2\2\u0167\u0168\7,\2\2\u0168"+
		"\u0169\7\4\2\2\u0169\u016a\t\3\2\2\u016a\u016b\7\7\2\2\u016b\u016c\7!"+
		"\2\2\u016c\u016d\7\6\2\2\u016d\u016e\7.\2\2\u016e\u016f\7\13\2\2\u016f"+
		"\u0170\t\4\2\2\u0170\u0172\7\7\2\2\u0171L\3\2\2\2\u0171O\3\2\2\2\u0171"+
		"T\3\2\2\2\u0171Y\3\2\2\2\u0171_\3\2\2\2\u0171q\3\2\2\2\u0171\u0083\3\2"+
		"\2\2\u0171\u0095\3\2\2\2\u0171\u009d\3\2\2\2\u0171\u00a9\3\2\2\2\u0171"+
		"\u00b8\3\2\2\2\u0171\u00c7\3\2\2\2\u0171\u00d6\3\2\2\2\u0171\u00e4\3\2"+
		"\2\2\u0171\u00f3\3\2\2\2\u0171\u0101\3\2\2\2\u0171\u0114\3\2\2\2\u0171"+
		"\u0127\3\2\2\2\u0171\u013a\3\2\2\2\u0171\u014c\3\2\2\2\u0171\u015f\3\2"+
		"\2\2\u0172\r\3\2\2\2\u0173\u0174\5\20\t\2\u0174\17\3\2\2\2\u0175\u0176"+
		"\7,\2\2\u0176\u0177\7\f\2\2\u0177\u017c\5\22\n\2\u0178\u0179\7,\2\2\u0179"+
		"\u017a\7\f\2\2\u017a\u017c\5\30\r\2\u017b\u0175\3\2\2\2\u017b\u0178\3"+
		"\2\2\2\u017c\21\3\2\2\2\u017d\u017e\b\n\1\2\u017e\u017f\7\34\2\2\u017f"+
		"\u01a0\5\22\n\17\u0180\u0182\7\30\2\2\u0181\u0183\5\24\13\2\u0182\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\7\r\2\2\u0187\u0188\5\22\n\n\u0188\u01a0\3"+
		"\2\2\2\u0189\u018b\7\31\2\2\u018a\u018c\5\24\13\2\u018b\u018a\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\7\r\2\2\u0190\u0191\5\22\n\t\u0191\u01a0\3\2\2\2"+
		"\u0192\u01a0\7,\2\2\u0193\u0194\7,\2\2\u0194\u0195\7\6\2\2\u0195\u0196"+
		"\5\30\r\2\u0196\u0197\7\7\2\2\u0197\u01a0\3\2\2\2\u0198\u01a0\7\32\2\2"+
		"\u0199\u01a0\7\33\2\2\u019a\u019b\7\3\2\2\u019b\u019c\5\22\n\2\u019c\u019d"+
		"\7\5\2\2\u019d\u01a0\3\2\2\2\u019e\u01a0\5\26\f\2\u019f\u017d\3\2\2\2"+
		"\u019f\u0180\3\2\2\2\u019f\u0189\3\2\2\2\u019f\u0192\3\2\2\2\u019f\u0193"+
		"\3\2\2\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019a\3\2\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01af\3\2\2\2\u01a1\u01a2\f\16\2\2\u01a2\u01a3\7"+
		"\35\2\2\u01a3\u01ae\5\22\n\17\u01a4\u01a5\f\r\2\2\u01a5\u01a6\7\36\2\2"+
		"\u01a6\u01ae\5\22\n\16\u01a7\u01a8\f\f\2\2\u01a8\u01a9\7\37\2\2\u01a9"+
		"\u01ae\5\22\n\r\u01aa\u01ab\f\13\2\2\u01ab\u01ac\7 \2\2\u01ac\u01ae\5"+
		"\22\n\f\u01ad\u01a1\3\2\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad"+
		"\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\23\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b7\7,\2\2\u01b3\u01b4"+
		"\7\t\2\2\u01b4\u01b6\7,\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01bc\t\2\2\2\u01bc\u01bd\7\13\2\2\u01bd"+
		"\25\3\2\2\2\u01be\u01bf\5\30\r\2\u01bf\u01c0\7!\2\2\u01c0\u01c1\5\30\r"+
		"\2\u01c1\u01d3\3\2\2\2\u01c2\u01c3\5\30\r\2\u01c3\u01c4\7\"\2\2\u01c4"+
		"\u01c5\5\30\r\2\u01c5\u01d3\3\2\2\2\u01c6\u01c7\5\30\r\2\u01c7\u01c8\7"+
		"#\2\2\u01c8\u01c9\5\30\r\2\u01c9\u01d3\3\2\2\2\u01ca\u01cb\5\30\r\2\u01cb"+
		"\u01cc\7$\2\2\u01cc\u01cd\5\30\r\2\u01cd\u01d3\3\2\2\2\u01ce\u01cf\5\30"+
		"\r\2\u01cf\u01d0\7%\2\2\u01d0\u01d1\5\30\r\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01be\3\2\2\2\u01d2\u01c2\3\2\2\2\u01d2\u01c6\3\2\2\2\u01d2\u01ca\3\2"+
		"\2\2\u01d2\u01ce\3\2\2\2\u01d3\27\3\2\2\2\u01d4\u01d5\b\r\1\2\u01d5\u01e2"+
		"\7,\2\2\u01d6\u01d7\7,\2\2\u01d7\u01d8\7\6\2\2\u01d8\u01d9\5\30\r\2\u01d9"+
		"\u01da\7\7\2\2\u01da\u01e2\3\2\2\2\u01db\u01e2\7-\2\2\u01dc\u01e2\7.\2"+
		"\2\u01dd\u01de\7\3\2\2\u01de\u01df\5\30\r\2\u01df\u01e0\7\5\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01d4\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1\u01db\3\2"+
		"\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e2\u01eb\3\2\2\2\u01e3"+
		"\u01e4\f\t\2\2\u01e4\u01e5\t\5\2\2\u01e5\u01ea\5\30\r\n\u01e6\u01e7\f"+
		"\b\2\2\u01e7\u01e8\t\6\2\2\u01e8\u01ea\5\30\r\t\u01e9\u01e3\3\2\2\2\u01e9"+
		"\u01e6\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\31\3\2\2\2\u01ed\u01eb\3\2\2\2\24\35%)l~\u0090\u0171\u017b"+
		"\u0184\u018d\u019f\u01ad\u01af\u01b7\u01d2\u01e1\u01e9\u01eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}