// Generated from Verifier.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerifierParser extends Parser {
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
		RULE_declaration = 5, RULE_uninitialDecl = 6, RULE_initialDecl = 7, RULE_implementation = 8, 
		RULE_assignment = 9, RULE_boolExpr = 10, RULE_varDecl = 11, RULE_relation = 12, 
		RULE_arithmetic = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "declaration", "uninitialDecl", 
			"initialDecl", "implementation", "assignment", "boolExpr", "varDecl", 
			"relation", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "';'", "'<<'", "','", "'>>'", 
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
	public String getGrammarFileName() { return "Verifier.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerifierParser(TokenStream input) {
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitStat(this);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				line();
				}
				}
				setState(31); 
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyMethodContext extends LineContext {
		public TerminalNode VERIFY() { return getToken(VerifierParser.VERIFY, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public VerifyMethodContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterVerifyMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitVerifyMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitVerifyMethod(this);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterDefineMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitDefineMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitDefineMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerifyBoolExprContext extends LineContext {
		public TerminalNode VERIFY() { return getToken(VerifierParser.VERIFY, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VerifyBoolExprContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterVerifyBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitVerifyBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitVerifyBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				declaration();
				}
				break;
			case 2:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				method();
				}
				break;
			case 3:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(VERIFY);
				setState(36);
				boolExpr(0);
				}
				break;
			case 4:
				_localctx = new VerifyMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(VERIFY);
				setState(38);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAccessorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAccessorMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAccessorMethod(this);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterMutatorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitMutatorMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitMutatorMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
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
		public MutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutator; }
	 
		public MutatorContext() { }
		public void copyFrom(MutatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MutatorsContext extends MutatorContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode REQUIRE() { return getToken(VerifierParser.REQUIRE, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(VerifierParser.DO, 0); }
		public TerminalNode ENSURE() { return getToken(VerifierParser.ENSURE, 0); }
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
		}
		public MutatorsContext(MutatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterMutators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitMutators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitMutators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutatorContext mutator() throws RecognitionException {
		MutatorContext _localctx = new MutatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mutator);
		int _la;
		try {
			_localctx = new MutatorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				match(T__0);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					uninitialDecl();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(52);
				match(T__1);
				}
			}

			setState(56);
			match(REQUIRE);
			setState(57);
			boolExpr(0);
			setState(58);
			match(DO);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				implementation();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(64);
			match(ENSURE);
			setState(65);
			boolExpr(0);
			setState(66);
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
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
	 
		public AccessorContext() { }
		public void copyFrom(AccessorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AccessorsContext extends AccessorContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
		}
		public TerminalNode REQUIRE() { return getToken(VerifierParser.REQUIRE, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(VerifierParser.DO, 0); }
		public TerminalNode ENSURE() { return getToken(VerifierParser.ENSURE, 0); }
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public AccessorsContext(AccessorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAccessors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAccessors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAccessors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accessor);
		int _la;
		try {
			_localctx = new AccessorsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(69);
				match(T__0);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					uninitialDecl();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(75);
				match(T__1);
				}
			}

			setState(79);
			uninitialDecl();
			setState(80);
			match(REQUIRE);
			setState(81);
			boolExpr(0);
			setState(82);
			match(DO);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				implementation();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(88);
			match(ENSURE);
			setState(89);
			boolExpr(0);
			setState(90);
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
	public static class InitialVarDeclContext extends DeclarationContext {
		public InitialDeclContext initialDecl() {
			return getRuleContext(InitialDeclContext.class,0);
		}
		public InitialVarDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterInitialVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitInitialVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitInitialVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UninitialVarDeclContext extends DeclarationContext {
		public UninitialDeclContext uninitialDecl() {
			return getRuleContext(UninitialDeclContext.class,0);
		}
		public UninitialVarDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUninitialVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUninitialVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUninitialVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new UninitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				uninitialDecl();
				}
				break;
			case 2:
				_localctx = new InitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				initialDecl();
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

	public static class UninitialDeclContext extends ParserRuleContext {
		public UninitialDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uninitialDecl; }
	 
		public UninitialDeclContext() { }
		public void copyFrom(UninitialDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleVarContext extends UninitialDeclContext {
		public Token type;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public SingleVarContext(UninitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterSingleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitSingleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedPairDeclContext extends UninitialDeclContext {
		public Token left;
		public Token right;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(VerifierParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(VerifierParser.BOOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(VerifierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(VerifierParser.INT, i);
		}
		public List<TerminalNode> REAL() { return getTokens(VerifierParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(VerifierParser.REAL, i);
		}
		public UnnamedPairDeclContext(UninitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedPairDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedPairDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedPairDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedPairDeclContext extends UninitialDeclContext {
		public Token left;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(VerifierParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(VerifierParser.BOOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(VerifierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(VerifierParser.INT, i);
		}
		public List<TerminalNode> REAL() { return getTokens(VerifierParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(VerifierParser.REAL, i);
		}
		public NamedPairDeclContext(UninitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedPairDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedPairDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedPairDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclContext extends UninitialDeclContext {
		public Token type;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(VerifierParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public ArrayDeclContext(UninitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UninitialDeclContext uninitialDecl() throws RecognitionException {
		UninitialDeclContext _localctx = new UninitialDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_uninitialDecl);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ID);
				setState(97);
				match(T__2);
				setState(98);
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
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ID);
				setState(100);
				match(T__2);
				setState(101);
				match(ARRAY);
				setState(102);
				match(T__3);
				setState(103);
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
				setState(104);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(ID);
				setState(106);
				match(T__2);
				setState(107);
				match(PAIR);
				setState(108);
				match(T__3);
				setState(109);
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
				setState(110);
				match(T__5);
				setState(111);
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
				setState(112);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(ID);
				setState(114);
				match(T__2);
				setState(115);
				match(PAIR);
				setState(116);
				match(T__3);
				setState(117);
				match(ID);
				setState(118);
				match(T__2);
				setState(119);
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
				setState(120);
				match(T__5);
				setState(121);
				match(ID);
				setState(122);
				match(T__2);
				setState(123);
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
				setState(124);
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

	public static class InitialDeclContext extends ParserRuleContext {
		public InitialDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialDecl; }
	 
		public InitialDeclContext() { }
		public void copyFrom(InitialDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntArrayValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(VerifierParser.ARRAY, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public IntArrayValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIntArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIntArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIntArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedRealArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> REAL() { return getTokens(VerifierParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(VerifierParser.REAL, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<TerminalNode> REALNUM() { return getTokens(VerifierParser.REALNUM); }
		public TerminalNode REALNUM(int i) {
			return getToken(VerifierParser.REALNUM, i);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public NamedRealArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedRealArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedRealArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedRealArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedRealBoolPairValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public UnnamedRealBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedRealBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedRealBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedRealBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumValueDeclContext extends InitialDeclContext {
		public Token type;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public NumValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNumValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNumValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNumValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedIntArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> INT() { return getTokens(VerifierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(VerifierParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<TerminalNode> INTNUM() { return getTokens(VerifierParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(VerifierParser.INTNUM, i);
		}
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public NamedIntArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedIntArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedIntArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedIntArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedIntBoolPairValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public UnnamedIntBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedIntBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedIntBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedIntBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedIntBoolPairValueDeclContext extends InitialDeclContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NamedIntBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedIntBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedIntBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedIntBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(VerifierParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolArrayValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedIntArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> INT() { return getTokens(VerifierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(VerifierParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<TerminalNode> INTNUM() { return getTokens(VerifierParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(VerifierParser.INTNUM, i);
		}
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public UnnamedIntArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedIntArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedIntArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedIntArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedBoolBoolPairValueDeclContext extends InitialDeclContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(VerifierParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(VerifierParser.BOOL, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public NamedBoolBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedBoolBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedBoolBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedBoolBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedRealBoolPairValueDeclContext extends InitialDeclContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NamedRealBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedRealBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedRealBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedRealBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedRealArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> REAL() { return getTokens(VerifierParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(VerifierParser.REAL, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<TerminalNode> REALNUM() { return getTokens(VerifierParser.REALNUM); }
		public TerminalNode REALNUM(int i) {
			return getToken(VerifierParser.REALNUM, i);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public UnnamedRealArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedRealArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedRealArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedRealArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealArrayValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode ARRAY() { return getToken(VerifierParser.ARRAY, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public RealArrayValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterRealArrayValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitRealArrayValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitRealArrayValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedBoolBoolPairValueDeclContext extends InitialDeclContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> BOOL() { return getTokens(VerifierParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(VerifierParser.BOOL, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public UnnamedBoolBoolPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedBoolBoolPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedBoolBoolPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedBoolBoolPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedBoolArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public UnnamedBoolArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedBoolArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedBoolArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedBoolArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedBoolArithPairValueDeclContext extends InitialDeclContext {
		public Token type;
		public Token right;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public NamedBoolArithPairValueDeclContext(InitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedBoolArithPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedBoolArithPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedBoolArithPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialDeclContext initialDecl() throws RecognitionException {
		InitialDeclContext _localctx = new InitialDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initialDecl);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				setState(128);
				match(T__2);
				setState(129);
				match(BOOL);
				setState(130);
				match(EQUAL);
				setState(131);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__2);
				setState(134);
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
				setState(135);
				match(EQUAL);
				setState(136);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
				setState(139);
				match(ARRAY);
				setState(140);
				match(T__3);
				setState(141);
				match(BOOL);
				setState(142);
				match(T__4);
				setState(143);
				match(EQUAL);
				setState(144);
				match(T__6);
				setState(145);
				boolExpr(0);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(146);
					match(T__7);
					setState(147);
					boolExpr(0);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__2);
				setState(157);
				match(ARRAY);
				setState(158);
				match(T__3);
				setState(159);
				match(INT);
				setState(160);
				match(T__4);
				setState(161);
				match(EQUAL);
				setState(162);
				match(T__6);
				setState(163);
				arithmetic(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(164);
					match(T__7);
					setState(165);
					arithmetic(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__8);
				}
				break;
			case 5:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(ID);
				setState(174);
				match(T__2);
				setState(175);
				match(ARRAY);
				setState(176);
				match(T__3);
				setState(177);
				match(REAL);
				setState(178);
				match(T__4);
				setState(179);
				match(EQUAL);
				setState(180);
				match(T__6);
				setState(181);
				arithmetic(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(182);
					match(T__7);
					setState(183);
					arithmetic(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__8);
				}
				break;
			case 6:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(ID);
				setState(192);
				match(T__2);
				setState(193);
				match(PAIR);
				setState(194);
				match(T__3);
				setState(195);
				match(BOOL);
				setState(196);
				match(T__5);
				setState(197);
				match(BOOL);
				setState(198);
				match(T__4);
				setState(199);
				match(EQUAL);
				setState(200);
				match(T__3);
				setState(201);
				boolExpr(0);
				setState(202);
				match(T__5);
				setState(203);
				boolExpr(0);
				setState(204);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__2);
				setState(208);
				match(PAIR);
				setState(209);
				match(T__3);
				setState(210);
				match(BOOL);
				setState(211);
				match(T__5);
				setState(212);
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
				setState(213);
				match(T__4);
				setState(214);
				match(EQUAL);
				setState(215);
				match(T__3);
				setState(216);
				boolExpr(0);
				setState(217);
				match(T__5);
				setState(218);
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
				setState(219);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(ID);
				setState(222);
				match(T__2);
				setState(223);
				match(PAIR);
				setState(224);
				match(T__3);
				setState(225);
				match(INT);
				setState(226);
				match(T__5);
				setState(227);
				match(BOOL);
				setState(228);
				match(T__4);
				setState(229);
				match(EQUAL);
				setState(230);
				match(T__3);
				setState(231);
				match(INTNUM);
				setState(232);
				match(T__5);
				setState(233);
				boolExpr(0);
				setState(234);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__2);
				setState(238);
				match(PAIR);
				setState(239);
				match(T__3);
				setState(240);
				match(INT);
				setState(241);
				match(T__5);
				setState(242);
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
				setState(243);
				match(T__4);
				setState(244);
				match(EQUAL);
				setState(245);
				match(T__3);
				setState(246);
				match(INTNUM);
				setState(247);
				match(T__5);
				setState(248);
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
				setState(249);
				match(T__4);
				}
				break;
			case 10:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__2);
				setState(252);
				match(PAIR);
				setState(253);
				match(T__3);
				setState(254);
				match(REAL);
				setState(255);
				match(T__5);
				setState(256);
				match(BOOL);
				setState(257);
				match(T__4);
				setState(258);
				match(EQUAL);
				setState(259);
				match(T__3);
				setState(260);
				match(REALNUM);
				setState(261);
				match(T__5);
				setState(262);
				boolExpr(0);
				setState(263);
				match(T__4);
				}
				break;
			case 11:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__2);
				setState(267);
				match(PAIR);
				setState(268);
				match(T__3);
				setState(269);
				match(REAL);
				setState(270);
				match(T__5);
				setState(271);
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
				setState(272);
				match(T__4);
				setState(273);
				match(EQUAL);
				setState(274);
				match(T__3);
				setState(275);
				match(REALNUM);
				setState(276);
				match(T__5);
				setState(277);
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
				setState(278);
				match(T__4);
				}
				break;
			case 12:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(279);
				match(ID);
				setState(280);
				match(T__2);
				setState(281);
				match(PAIR);
				setState(282);
				match(T__3);
				setState(283);
				match(ID);
				setState(284);
				match(T__2);
				setState(285);
				match(BOOL);
				setState(286);
				match(T__5);
				setState(287);
				match(ID);
				setState(288);
				match(T__2);
				setState(289);
				match(BOOL);
				setState(290);
				match(T__4);
				setState(291);
				match(EQUAL);
				setState(292);
				match(T__3);
				setState(293);
				boolExpr(0);
				setState(294);
				match(T__5);
				setState(295);
				boolExpr(0);
				setState(296);
				match(T__4);
				}
				break;
			case 13:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(298);
				match(ID);
				setState(299);
				match(T__2);
				setState(300);
				match(PAIR);
				setState(301);
				match(T__3);
				setState(302);
				match(ID);
				setState(303);
				match(T__2);
				setState(304);
				match(BOOL);
				setState(305);
				match(T__5);
				setState(306);
				match(ID);
				setState(307);
				match(T__2);
				setState(308);
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
				setState(309);
				match(T__4);
				setState(310);
				match(EQUAL);
				setState(311);
				match(T__3);
				setState(312);
				boolExpr(0);
				setState(313);
				match(T__5);
				setState(314);
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
				setState(315);
				match(T__4);
				}
				break;
			case 14:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(317);
				match(ID);
				setState(318);
				match(T__2);
				setState(319);
				match(PAIR);
				setState(320);
				match(T__3);
				setState(321);
				match(ID);
				setState(322);
				match(T__2);
				setState(323);
				match(INT);
				setState(324);
				match(T__5);
				setState(325);
				match(ID);
				setState(326);
				match(T__2);
				setState(327);
				match(BOOL);
				setState(328);
				match(T__4);
				setState(329);
				match(EQUAL);
				setState(330);
				match(T__3);
				setState(331);
				match(INTNUM);
				setState(332);
				match(T__5);
				setState(333);
				boolExpr(0);
				setState(334);
				match(T__4);
				}
				break;
			case 15:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(336);
				match(ID);
				setState(337);
				match(T__2);
				setState(338);
				match(PAIR);
				setState(339);
				match(T__3);
				setState(340);
				match(ID);
				setState(341);
				match(T__2);
				setState(342);
				match(INT);
				setState(343);
				match(T__5);
				setState(344);
				match(ID);
				setState(345);
				match(T__2);
				setState(346);
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
				setState(347);
				match(T__4);
				setState(348);
				match(EQUAL);
				setState(349);
				match(T__3);
				setState(350);
				match(INTNUM);
				setState(351);
				match(T__5);
				setState(352);
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
				setState(353);
				match(T__4);
				}
				break;
			case 16:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(354);
				match(ID);
				setState(355);
				match(T__2);
				setState(356);
				match(PAIR);
				setState(357);
				match(T__3);
				setState(358);
				match(ID);
				setState(359);
				match(T__2);
				setState(360);
				match(REAL);
				setState(361);
				match(T__5);
				setState(362);
				match(ID);
				setState(363);
				match(T__2);
				setState(364);
				match(BOOL);
				setState(365);
				match(T__4);
				setState(366);
				match(EQUAL);
				setState(367);
				match(T__3);
				setState(368);
				match(REALNUM);
				setState(369);
				match(T__5);
				setState(370);
				boolExpr(0);
				setState(371);
				match(T__4);
				}
				break;
			case 17:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(373);
				match(ID);
				setState(374);
				match(T__2);
				setState(375);
				match(PAIR);
				setState(376);
				match(T__3);
				setState(377);
				match(ID);
				setState(378);
				match(T__2);
				setState(379);
				match(REAL);
				setState(380);
				match(T__5);
				setState(381);
				match(ID);
				setState(382);
				match(T__2);
				setState(383);
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
				setState(384);
				match(T__4);
				setState(385);
				match(EQUAL);
				setState(386);
				match(T__3);
				setState(387);
				match(REALNUM);
				setState(388);
				match(T__5);
				setState(389);
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
				setState(390);
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

	public static class ImplementationContext extends ParserRuleContext {
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
	 
		public ImplementationContext() { }
		public void copyFrom(ImplementationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends ImplementationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarAssignmentContext(ImplementationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implementation);
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(ID);
				setState(396);
				match(T__9);
				setState(397);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new ArithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(ID);
				setState(399);
				match(T__9);
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
		public TerminalNode OR() { return getToken(VerifierParser.OR, 0); }
		public OrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOr(this);
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
		public TerminalNode IFF() { return getToken(VerifierParser.IFF, 0); }
		public IffContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVarContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public BoolVarContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(VerifierParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNot(this);
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
		public TerminalNode IMPLIES() { return getToken(VerifierParser.IMPLIES, 0); }
		public ImpliesContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitImplies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitImplies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BoolExprContext {
		public TerminalNode EXISTS() { return getToken(VerifierParser.EXISTS, 0); }
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitExists(this);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterRelate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitRelate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitRelate(this);
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
		public TerminalNode AND() { return getToken(VerifierParser.AND, 0); }
		public AndContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends BoolExprContext {
		public TerminalNode FALSE() { return getToken(VerifierParser.FALSE, 0); }
		public BoolFalseContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexBoolArrayContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public IndexBoolArrayContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIndexBoolArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIndexBoolArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIndexBoolArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallContext extends BoolExprContext {
		public TerminalNode FORALL() { return getToken(VerifierParser.FORALL, 0); }
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterForall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitForall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitForall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTrueContext extends BoolExprContext {
		public TerminalNode TRUE() { return getToken(VerifierParser.TRUE, 0); }
		public BoolTrueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolTrue(this);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitParen(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(404);
				match(NOT);
				setState(405);
				boolExpr(13);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(FORALL);
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(407);
					varDecl();
					}
					}
					setState(410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(412);
				match(T__10);
				setState(413);
				boolExpr(8);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				match(EXISTS);
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(416);
					varDecl();
					}
					}
					setState(419); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(421);
				match(T__10);
				setState(422);
				boolExpr(7);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				match(ID);
				setState(426);
				match(T__3);
				setState(427);
				arithmetic(0);
				setState(428);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(431);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432);
				match(T__0);
				setState(433);
				boolExpr(0);
				setState(434);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(436);
				relation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(439);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(440);
						match(AND);
						setState(441);
						boolExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(442);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(443);
						match(OR);
						setState(444);
						boolExpr(12);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(445);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(446);
						match(IMPLIES);
						setState(447);
						boolExpr(11);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(448);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(449);
						match(IFF);
						setState(450);
						boolExpr(10);
						}
						break;
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public QuantifyVarContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterQuantifyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitQuantifyVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitQuantifyVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(ID);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(457);
				match(T__7);
				setState(458);
				match(ID);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(T__2);
			setState(465);
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
			setState(466);
			match(T__5);
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
		public TerminalNode LESSOREQUAL() { return getToken(VerifierParser.LESSOREQUAL, 0); }
		public LessOrEqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLessOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLessOrEqual(this);
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
		public TerminalNode LESSTHAN() { return getToken(VerifierParser.LESSTHAN, 0); }
		public LessThanContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLessThan(this);
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
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public EqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitEqual(this);
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
		public TerminalNode GREATERTHAN() { return getToken(VerifierParser.GREATERTHAN, 0); }
		public GreaterThanContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitGreaterThan(this);
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
		public TerminalNode GREATEROREQUAL() { return getToken(VerifierParser.GREATEROREQUAL, 0); }
		public GreaterOrEqualContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitGreaterOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitGreaterOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				arithmetic(0);
				setState(469);
				match(EQUAL);
				setState(470);
				arithmetic(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				arithmetic(0);
				setState(473);
				match(GREATERTHAN);
				setState(474);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				arithmetic(0);
				setState(477);
				match(LESSTHAN);
				setState(478);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				arithmetic(0);
				setState(481);
				match(GREATEROREQUAL);
				setState(482);
				arithmetic(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				arithmetic(0);
				setState(485);
				match(LESSOREQUAL);
				setState(486);
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
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticVarContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithmeticVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithmeticVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithmeticVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntNumContext extends ArithmeticContext {
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public IntNumContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIntNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIntNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIntNum(this);
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
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithParen(this);
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
		public TerminalNode MUL() { return getToken(VerifierParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VerifierParser.DIV, 0); }
		public MulDivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitMulDiv(this);
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
		public TerminalNode ADD() { return getToken(VerifierParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(VerifierParser.SUB, 0); }
		public AddSubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealNumContext extends ArithmeticContext {
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public RealNumContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterRealNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitRealNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitRealNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexArithmeticArrayContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public IndexArithmeticArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIndexArithmeticArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIndexArithmeticArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIndexArithmeticArray(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(491);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				match(ID);
				setState(493);
				match(T__3);
				setState(494);
				arithmetic(0);
				setState(495);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				match(INTNUM);
				}
				break;
			case 4:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				match(REALNUM);
				}
				break;
			case 5:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(T__0);
				setState(500);
				arithmetic(0);
				setState(501);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(505);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(506);
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
						setState(507);
						arithmetic(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(508);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(509);
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
						setState(510);
						arithmetic(7);
						}
						break;
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 10:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0207\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\6\5\63\n\5\r\5"+
		"\16\5\64\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\6\6J\n\6\r\6\16\6K\3\6\3\6\5\6P\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6W\n\6\r\6\16\6X\3\6\3\6\3\6\3\6\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0097"+
		"\n\t\f\t\16\t\u009a\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u018a\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0194\n\13\3\f\3\f\3\f\3\f\3\f\6\f\u019b\n\f\r\f\16\f\u019c"+
		"\3\f\3\f\3\f\3\f\3\f\6\f\u01a4\n\f\r\f\16\f\u01a5\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01b8\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01c6\n\f\f\f\16\f\u01c9\13\f"+
		"\3\r\3\r\3\r\7\r\u01ce\n\r\f\r\16\r\u01d1\13\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01eb\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01fa\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0202\n\17\f\17\16\17\u0205\13\17\3\17\2\4\26\34\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\16\20\3\2\17\20\3\2-.\3\2&"+
		"\'\3\2()\2\u0234\2\37\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\nF\3\2"+
		"\2\2\f`\3\2\2\2\16\177\3\2\2\2\20\u0189\3\2\2\2\22\u018b\3\2\2\2\24\u0193"+
		"\3\2\2\2\26\u01b7\3\2\2\2\30\u01ca\3\2\2\2\32\u01ea\3\2\2\2\34\u01f9\3"+
		"\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3"+
		"\3\2\2\2#*\5\f\7\2$*\5\6\4\2%&\7\23\2\2&*\5\26\f\2\'(\7\23\2\2(*\7,\2"+
		"\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)\'\3\2\2\2*\5\3\2\2\2+.\5\b\5\2,.\5\n"+
		"\6\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/8\7,\2\2\60\62\7\3\2\2\61\63\5\16"+
		"\b\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\7\4\2\2\679\3\2\2\28\60\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\24"+
		"\2\2;<\5\26\f\2<>\7\26\2\2=?\5\22\n\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A"+
		"\3\2\2\2AB\3\2\2\2BC\7\25\2\2CD\5\26\f\2DE\7\27\2\2E\t\3\2\2\2FO\7,\2"+
		"\2GI\7\3\2\2HJ\5\16\b\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\7\4\2\2NP\3\2\2\2OG\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\16\b\2RS\7"+
		"\24\2\2ST\5\26\f\2TV\7\26\2\2UW\5\22\n\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\7\25\2\2[\\\5\26\f\2\\]\7\27\2\2]\13\3\2\2\2^a"+
		"\5\16\b\2_a\5\20\t\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bc\7,\2\2cd\7\5\2\2"+
		"d\u0080\t\2\2\2ef\7,\2\2fg\7\5\2\2gh\7\21\2\2hi\7\6\2\2ij\t\2\2\2j\u0080"+
		"\7\7\2\2kl\7,\2\2lm\7\5\2\2mn\7\22\2\2no\7\6\2\2op\t\2\2\2pq\7\b\2\2q"+
		"r\t\2\2\2r\u0080\7\7\2\2st\7,\2\2tu\7\5\2\2uv\7\22\2\2vw\7\6\2\2wx\7,"+
		"\2\2xy\7\5\2\2yz\t\2\2\2z{\7\b\2\2{|\7,\2\2|}\7\5\2\2}~\t\2\2\2~\u0080"+
		"\7\7\2\2\177b\3\2\2\2\177e\3\2\2\2\177k\3\2\2\2\177s\3\2\2\2\u0080\17"+
		"\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0083\7\5\2\2\u0083\u0084\7\16\2\2\u0084"+
		"\u0085\7!\2\2\u0085\u018a\5\26\f\2\u0086\u0087\7,\2\2\u0087\u0088\7\5"+
		"\2\2\u0088\u0089\t\3\2\2\u0089\u008a\7!\2\2\u008a\u018a\5\34\17\2\u008b"+
		"\u008c\7,\2\2\u008c\u008d\7\5\2\2\u008d\u008e\7\21\2\2\u008e\u008f\7\6"+
		"\2\2\u008f\u0090\7\16\2\2\u0090\u0091\7\7\2\2\u0091\u0092\7!\2\2\u0092"+
		"\u0093\7\t\2\2\u0093\u0098\5\26\f\2\u0094\u0095\7\n\2\2\u0095\u0097\5"+
		"\26\f\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\13"+
		"\2\2\u009c\u018a\3\2\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\5\2\2\u009f"+
		"\u00a0\7\21\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\7"+
		"\7\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00aa\5\34\17\2\u00a6"+
		"\u00a7\7\n\2\2\u00a7\u00a9\5\34\17\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u018a\3\2\2\2\u00af\u00b0\7"+
		",\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b4\7\20\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\7\t"+
		"\2\2\u00b7\u00bc\5\34\17\2\u00b8\u00b9\7\n\2\2\u00b9\u00bb\5\34\17\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0"+
		"\u018a\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7\22"+
		"\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\7\b\2\2\u00c7"+
		"\u00c8\7\16\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\7\6"+
		"\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5\26\f\2\u00ce"+
		"\u00cf\7\7\2\2\u00cf\u018a\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\7\5"+
		"\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\u00d6\7\b\2\2\u00d6\u00d7\t\3\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9\7!"+
		"\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5\26\f\2\u00db\u00dc\7\b\2\2\u00dc"+
		"\u00dd\t\4\2\2\u00dd\u00de\7\7\2\2\u00de\u018a\3\2\2\2\u00df\u00e0\7,"+
		"\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\7\6\2\2\u00e3"+
		"\u00e4\7\17\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7"+
		"\7\2\2\u00e7\u00e8\7!\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\7-\2\2\u00ea"+
		"\u00eb\7\b\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7\7\2\2\u00ed\u018a\3"+
		"\2\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\7\5\2\2\u00f0\u00f1\7\22\2\2\u00f1"+
		"\u00f2\7\6\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\t"+
		"\3\2\2\u00f5\u00f6\7\7\2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u00f9\7-\2\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\t\4\2\2\u00fb\u018a\7\7"+
		"\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\7\22\2\2\u00ff"+
		"\u0100\7\6\2\2\u0100\u0101\7\20\2\2\u0101\u0102\7\b\2\2\u0102\u0103\7"+
		"\16\2\2\u0103\u0104\7\7\2\2\u0104\u0105\7!\2\2\u0105\u0106\7\6\2\2\u0106"+
		"\u0107\7.\2\2\u0107\u0108\7\b\2\2\u0108\u0109\5\26\f\2\u0109\u010a\7\7"+
		"\2\2\u010a\u018a\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010d\7\5\2\2\u010d"+
		"\u010e\7\22\2\2\u010e\u010f\7\6\2\2\u010f\u0110\7\20\2\2\u0110\u0111\7"+
		"\b\2\2\u0111\u0112\t\3\2\2\u0112\u0113\7\7\2\2\u0113\u0114\7!\2\2\u0114"+
		"\u0115\7\6\2\2\u0115\u0116\7.\2\2\u0116\u0117\7\b\2\2\u0117\u0118\t\4"+
		"\2\2\u0118\u018a\7\7\2\2\u0119\u011a\7,\2\2\u011a\u011b\7\5\2\2\u011b"+
		"\u011c\7\22\2\2\u011c\u011d\7\6\2\2\u011d\u011e\7,\2\2\u011e\u011f\7\5"+
		"\2\2\u011f\u0120\7\16\2\2\u0120\u0121\7\b\2\2\u0121\u0122\7,\2\2\u0122"+
		"\u0123\7\5\2\2\u0123\u0124\7\16\2\2\u0124\u0125\7\7\2\2\u0125\u0126\7"+
		"!\2\2\u0126\u0127\7\6\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7\b\2\2\u0129"+
		"\u012a\5\26\f\2\u012a\u012b\7\7\2\2\u012b\u018a\3\2\2\2\u012c\u012d\7"+
		",\2\2\u012d\u012e\7\5\2\2\u012e\u012f\7\22\2\2\u012f\u0130\7\6\2\2\u0130"+
		"\u0131\7,\2\2\u0131\u0132\7\5\2\2\u0132\u0133\7\16\2\2\u0133\u0134\7\b"+
		"\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\5\2\2\u0136\u0137\t\3\2\2\u0137"+
		"\u0138\7\7\2\2\u0138\u0139\7!\2\2\u0139\u013a\7\6\2\2\u013a\u013b\5\26"+
		"\f\2\u013b\u013c\7\b\2\2\u013c\u013d\t\4\2\2\u013d\u013e\7\7\2\2\u013e"+
		"\u018a\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141\7\5\2\2\u0141\u0142\7\22"+
		"\2\2\u0142\u0143\7\6\2\2\u0143\u0144\7,\2\2\u0144\u0145\7\5\2\2\u0145"+
		"\u0146\7\17\2\2\u0146\u0147\7\b\2\2\u0147\u0148\7,\2\2\u0148\u0149\7\5"+
		"\2\2\u0149\u014a\7\16\2\2\u014a\u014b\7\7\2\2\u014b\u014c\7!\2\2\u014c"+
		"\u014d\7\6\2\2\u014d\u014e\7-\2\2\u014e\u014f\7\b\2\2\u014f\u0150\5\26"+
		"\f\2\u0150\u0151\7\7\2\2\u0151\u018a\3\2\2\2\u0152\u0153\7,\2\2\u0153"+
		"\u0154\7\5\2\2\u0154\u0155\7\22\2\2\u0155\u0156\7\6\2\2\u0156\u0157\7"+
		",\2\2\u0157\u0158\7\5\2\2\u0158\u0159\7\17\2\2\u0159\u015a\7\b\2\2\u015a"+
		"\u015b\7,\2\2\u015b\u015c\7\5\2\2\u015c\u015d\t\3\2\2\u015d\u015e\7\7"+
		"\2\2\u015e\u015f\7!\2\2\u015f\u0160\7\6\2\2\u0160\u0161\7-\2\2\u0161\u0162"+
		"\7\b\2\2\u0162\u0163\t\4\2\2\u0163\u018a\7\7\2\2\u0164\u0165\7,\2\2\u0165"+
		"\u0166\7\5\2\2\u0166\u0167\7\22\2\2\u0167\u0168\7\6\2\2\u0168\u0169\7"+
		",\2\2\u0169\u016a\7\5\2\2\u016a\u016b\7\20\2\2\u016b\u016c\7\b\2\2\u016c"+
		"\u016d\7,\2\2\u016d\u016e\7\5\2\2\u016e\u016f\7\16\2\2\u016f\u0170\7\7"+
		"\2\2\u0170\u0171\7!\2\2\u0171\u0172\7\6\2\2\u0172\u0173\7.\2\2\u0173\u0174"+
		"\7\b\2\2\u0174\u0175\5\26\f\2\u0175\u0176\7\7\2\2\u0176\u018a\3\2\2\2"+
		"\u0177\u0178\7,\2\2\u0178\u0179\7\5\2\2\u0179\u017a\7\22\2\2\u017a\u017b"+
		"\7\6\2\2\u017b\u017c\7,\2\2\u017c\u017d\7\5\2\2\u017d\u017e\7\20\2\2\u017e"+
		"\u017f\7\b\2\2\u017f\u0180\7,\2\2\u0180\u0181\7\5\2\2\u0181\u0182\t\3"+
		"\2\2\u0182\u0183\7\7\2\2\u0183\u0184\7!\2\2\u0184\u0185\7\6\2\2\u0185"+
		"\u0186\7.\2\2\u0186\u0187\7\b\2\2\u0187\u0188\t\4\2\2\u0188\u018a\7\7"+
		"\2\2\u0189\u0081\3\2\2\2\u0189\u0086\3\2\2\2\u0189\u008b\3\2\2\2\u0189"+
		"\u009d\3\2\2\2\u0189\u00af\3\2\2\2\u0189\u00c1\3\2\2\2\u0189\u00d0\3\2"+
		"\2\2\u0189\u00df\3\2\2\2\u0189\u00ee\3\2\2\2\u0189\u00fc\3\2\2\2\u0189"+
		"\u010b\3\2\2\2\u0189\u0119\3\2\2\2\u0189\u012c\3\2\2\2\u0189\u013f\3\2"+
		"\2\2\u0189\u0152\3\2\2\2\u0189\u0164\3\2\2\2\u0189\u0177\3\2\2\2\u018a"+
		"\21\3\2\2\2\u018b\u018c\5\24\13\2\u018c\23\3\2\2\2\u018d\u018e\7,\2\2"+
		"\u018e\u018f\7\f\2\2\u018f\u0194\5\26\f\2\u0190\u0191\7,\2\2\u0191\u0192"+
		"\7\f\2\2\u0192\u0194\5\34\17\2\u0193\u018d\3\2\2\2\u0193\u0190\3\2\2\2"+
		"\u0194\25\3\2\2\2\u0195\u0196\b\f\1\2\u0196\u0197\7\34\2\2\u0197\u01b8"+
		"\5\26\f\17\u0198\u019a\7\30\2\2\u0199\u019b\5\30\r\2\u019a\u0199\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019f\7\r\2\2\u019f\u01a0\5\26\f\n\u01a0\u01b8\3\2\2\2"+
		"\u01a1\u01a3\7\31\2\2\u01a2\u01a4\5\30\r\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\7\r\2\2\u01a8\u01a9\5\26\f\t\u01a9\u01b8\3\2\2\2\u01aa\u01b8\7"+
		",\2\2\u01ab\u01ac\7,\2\2\u01ac\u01ad\7\6\2\2\u01ad\u01ae\5\34\17\2\u01ae"+
		"\u01af\7\7\2\2\u01af\u01b8\3\2\2\2\u01b0\u01b8\7\32\2\2\u01b1\u01b8\7"+
		"\33\2\2\u01b2\u01b3\7\3\2\2\u01b3\u01b4\5\26\f\2\u01b4\u01b5\7\4\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b8\5\32\16\2\u01b7\u0195\3\2\2\2\u01b7\u0198\3"+
		"\2\2\2\u01b7\u01a1\3\2\2\2\u01b7\u01aa\3\2\2\2\u01b7\u01ab\3\2\2\2\u01b7"+
		"\u01b0\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01c7\3\2\2\2\u01b9\u01ba\f\16\2\2\u01ba\u01bb\7\35\2\2\u01bb"+
		"\u01c6\5\26\f\17\u01bc\u01bd\f\r\2\2\u01bd\u01be\7\36\2\2\u01be\u01c6"+
		"\5\26\f\16\u01bf\u01c0\f\f\2\2\u01c0\u01c1\7\37\2\2\u01c1\u01c6\5\26\f"+
		"\r\u01c2\u01c3\f\13\2\2\u01c3\u01c4\7 \2\2\u01c4\u01c6\5\26\f\f\u01c5"+
		"\u01b9\3\2\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c2\3\2"+
		"\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\27\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cf\7,\2\2\u01cb\u01cc\7\n\2\2"+
		"\u01cc\u01ce\7,\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d3\7\5\2\2\u01d3\u01d4\t\2\2\2\u01d4\u01d5\7\b\2\2\u01d5\31\3\2\2"+
		"\2\u01d6\u01d7\5\34\17\2\u01d7\u01d8\7!\2\2\u01d8\u01d9\5\34\17\2\u01d9"+
		"\u01eb\3\2\2\2\u01da\u01db\5\34\17\2\u01db\u01dc\7\"\2\2\u01dc\u01dd\5"+
		"\34\17\2\u01dd\u01eb\3\2\2\2\u01de\u01df\5\34\17\2\u01df\u01e0\7#\2\2"+
		"\u01e0\u01e1\5\34\17\2\u01e1\u01eb\3\2\2\2\u01e2\u01e3\5\34\17\2\u01e3"+
		"\u01e4\7$\2\2\u01e4\u01e5\5\34\17\2\u01e5\u01eb\3\2\2\2\u01e6\u01e7\5"+
		"\34\17\2\u01e7\u01e8\7%\2\2\u01e8\u01e9\5\34\17\2\u01e9\u01eb\3\2\2\2"+
		"\u01ea\u01d6\3\2\2\2\u01ea\u01da\3\2\2\2\u01ea\u01de\3\2\2\2\u01ea\u01e2"+
		"\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\33\3\2\2\2\u01ec\u01ed\b\17\1\2\u01ed"+
		"\u01fa\7,\2\2\u01ee\u01ef\7,\2\2\u01ef\u01f0\7\6\2\2\u01f0\u01f1\5\34"+
		"\17\2\u01f1\u01f2\7\7\2\2\u01f2\u01fa\3\2\2\2\u01f3\u01fa\7-\2\2\u01f4"+
		"\u01fa\7.\2\2\u01f5\u01f6\7\3\2\2\u01f6\u01f7\5\34\17\2\u01f7\u01f8\7"+
		"\4\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01ec\3\2\2\2\u01f9\u01ee\3\2\2\2\u01f9"+
		"\u01f3\3\2\2\2\u01f9\u01f4\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa\u0203\3\2"+
		"\2\2\u01fb\u01fc\f\t\2\2\u01fc\u01fd\t\5\2\2\u01fd\u0202\5\34\17\n\u01fe"+
		"\u01ff\f\b\2\2\u01ff\u0200\t\6\2\2\u0200\u0202\5\34\17\t\u0201\u01fb\3"+
		"\2\2\2\u0201\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\35\3\2\2\2\u0205\u0203\3\2\2\2\34!)-\648@KOX`\177"+
		"\u0098\u00aa\u00bc\u0189\u0193\u019c\u01a5\u01b7\u01c5\u01c7\u01cf\u01ea"+
		"\u01f9\u0201\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}