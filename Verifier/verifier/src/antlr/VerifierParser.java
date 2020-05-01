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
		T__9=10, T__10=11, T__11=12, BOOL=13, INT=14, REAL=15, ARRAY=16, PAIR=17, 
		FIRST=18, SECOND=19, VERIFY=20, COUNT=21, LOWER=22, UPPER=23, LOCAL=24, 
		REQUIRE=25, ENSURE=26, DO=27, END=28, OLD=29, RESULT=30, IF=31, ELSEIF=32, 
		THEN=33, ELSE=34, FROM=35, INVARIANT=36, UNTIL=37, LOOP=38, VARIANT=39, 
		FORALL=40, EXISTS=41, TRUE=42, FALSE=43, NOT=44, AND=45, OR=46, IMPLIES=47, 
		IFF=48, EQUAL=49, GREATERTHAN=50, LESSTHAN=51, GREATEROREQUAL=52, LESSOREQUAL=53, 
		MUL=54, DIV=55, ADD=56, SUB=57, COMMENT=58, WS=59, ID=60, INTNUM=61, REALNUM=62;
	public static final int
		RULE_stat = 0, RULE_line = 1, RULE_method = 2, RULE_mutator = 3, RULE_accessor = 4, 
		RULE_precondition = 5, RULE_postcondition = 6, RULE_contract = 7, RULE_local = 8, 
		RULE_implementation = 9, RULE_assignment = 10, RULE_alternation = 11, 
		RULE_ifstat = 12, RULE_elseifstat = 13, RULE_elsestat = 14, RULE_loop = 15, 
		RULE_initImp = 16, RULE_invariantStat = 17, RULE_exitCondition = 18, RULE_loopBody = 19, 
		RULE_variantStat = 20, RULE_declaration = 21, RULE_uninitialDecl = 22, 
		RULE_initialDecl = 23, RULE_unnamedDecl = 24, RULE_expr = 25, RULE_boolExpr = 26, 
		RULE_varDecl = 27, RULE_relationalExpr = 28, RULE_arithmeticExpr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "precondition", "postcondition", 
			"contract", "local", "implementation", "assignment", "alternation", "ifstat", 
			"elseifstat", "elsestat", "loop", "initImp", "invariantStat", "exitCondition", 
			"loopBody", "variantStat", "declaration", "uninitialDecl", "initialDecl", 
			"unnamedDecl", "expr", "boolExpr", "varDecl", "relationalExpr", "arithmeticExpr"
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				line();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERIFY) | (1L << RESULT) | (1L << ID))) != 0) );
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
	public static class AssignDeclContext extends LineContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignDeclContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAssignDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAssignDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAssignDecl(this);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				declaration();
				}
				break;
			case 2:
				_localctx = new AssignDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				assignment();
				}
				break;
			case 3:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				method();
				}
				break;
			case 4:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(VERIFY);
				setState(69);
				boolExpr(0);
				}
				break;
			case 5:
				_localctx = new VerifyMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(VERIFY);
				setState(71);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
		public TerminalNode DO() { return getToken(VerifierParser.DO, 0); }
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public PreconditionContext precondition() {
			return getRuleContext(PreconditionContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public PostconditionContext postcondition() {
			return getRuleContext(PostconditionContext.class,0);
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
			setState(78);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(79);
				match(T__0);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(80);
					uninitialDecl();
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(81);
						match(T__1);
						setState(82);
						uninitialDecl();
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(90);
				match(T__2);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(93);
				precondition();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(96);
				local();
				}
			}

			setState(99);
			match(DO);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				implementation();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(105);
				postcondition();
				}
			}

			setState(108);
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
		public UnnamedDeclContext unnamedDecl() {
			return getRuleContext(UnnamedDeclContext.class,0);
		}
		public TerminalNode DO() { return getToken(VerifierParser.DO, 0); }
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public PreconditionContext precondition() {
			return getRuleContext(PreconditionContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public PostconditionContext postcondition() {
			return getRuleContext(PostconditionContext.class,0);
		}
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
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
			setState(110);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(111);
				match(T__0);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(112);
					uninitialDecl();
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(113);
						match(T__1);
						setState(114);
						uninitialDecl();
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(122);
				match(T__2);
				}
			}

			setState(125);
			match(T__3);
			setState(126);
			unnamedDecl();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(127);
				precondition();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(130);
				local();
				}
			}

			setState(133);
			match(DO);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				implementation();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(139);
				postcondition();
				}
			}

			setState(142);
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

	public static class PreconditionContext extends ParserRuleContext {
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
	 
		public PreconditionContext() { }
		public void copyFrom(PreconditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreContractContext extends PreconditionContext {
		public TerminalNode REQUIRE() { return getToken(VerifierParser.REQUIRE, 0); }
		public List<ContractContext> contract() {
			return getRuleContexts(ContractContext.class);
		}
		public ContractContext contract(int i) {
			return getRuleContext(ContractContext.class,i);
		}
		public PreContractContext(PreconditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPreContract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPreContract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPreContract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_precondition);
		int _la;
		try {
			_localctx = new PreContractContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(REQUIRE);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				contract();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << FORALL) | (1L << EXISTS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0) );
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

	public static class PostconditionContext extends ParserRuleContext {
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
	 
		public PostconditionContext() { }
		public void copyFrom(PostconditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostContractContext extends PostconditionContext {
		public TerminalNode ENSURE() { return getToken(VerifierParser.ENSURE, 0); }
		public List<ContractContext> contract() {
			return getRuleContexts(ContractContext.class);
		}
		public ContractContext contract(int i) {
			return getRuleContext(ContractContext.class,i);
		}
		public PostContractContext(PostconditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPostContract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPostContract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPostContract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postcondition);
		int _la;
		try {
			_localctx = new PostContractContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ENSURE);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				contract();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << FORALL) | (1L << EXISTS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0) );
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

	public static class ContractContext extends ParserRuleContext {
		public ContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract; }
	 
		public ContractContext() { }
		public void copyFrom(ContractContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContractsContext extends ContractContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ContractsContext(ContractContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterContracts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitContracts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitContracts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractContext contract() throws RecognitionException {
		ContractContext _localctx = new ContractContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contract);
		try {
			_localctx = new ContractsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ID);
				setState(157);
				match(T__3);
				}
				break;
			}
			setState(160);
			boolExpr(0);
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

	public static class LocalContext extends ParserRuleContext {
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
	 
		public LocalContext() { }
		public void copyFrom(LocalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocalDeclContext extends LocalContext {
		public TerminalNode LOCAL() { return getToken(VerifierParser.LOCAL, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public LocalDeclContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLocalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLocalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_local);
		int _la;
		try {
			_localctx = new LocalDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LOCAL);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				declaration();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class ImpAssignmentContext extends ImplementationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ImpAssignmentContext(ImplementationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterImpAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitImpAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitImpAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpLoopContext extends ImplementationContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ImpLoopContext(ImplementationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterImpLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitImpLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitImpLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpAlternationContext extends ImplementationContext {
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public ImpAlternationContext(ImplementationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterImpAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitImpAlternation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitImpAlternation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_implementation);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESULT:
			case ID:
				_localctx = new ImpAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				assignment();
				}
				break;
			case IF:
				_localctx = new ImpAlternationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				alternation();
				}
				break;
			case FROM:
				_localctx = new ImpLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				loop();
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
	public static class ArrayEAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public ArrayEAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToArrayEContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairEAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithArrayInitializeContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public ArithArrayInitializeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithArrayInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithArrayInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithArrayInitialize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToPairEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArrayResultAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public Token a;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(VerifierParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(VerifierParser.FIRST, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(VerifierParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(VerifierParser.SECOND, i);
		}
		public PairResultAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayEAssignToBoolEContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArrayEAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToArrayEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArrayResultAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayInitializeContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolArrayInitializeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolArrayInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolArrayInitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolArrayInitialize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToPairEContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public NormalVarAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairReinitializeContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PairReinitializeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairReinitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairReinitialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairReinitialize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToArrayEContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairResultAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToPairEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public NormalResultAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayEAssignToNormalVarContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArrayEAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToArithEContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairEAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public NormalVarAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayEAssignToPairEContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArrayEAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public ArrayResultAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToBoolEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NormalResultAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayEAssignToArithEContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public ArrayEAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToBoolEContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public PairResultAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToBoolEContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairEAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public NormalResultAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToPairEContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairResultAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToNormalVarContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public NormalVarAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToArrayEContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public NormalVarAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToArrayEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public NormalResultAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToPairEContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairEAssignToPairEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToBoolEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArrayResultAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToArithEContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public NormalVarAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToNormalVarContext extends AssignmentContext {
		public Token e;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairEAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToNormalVarContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public PairResultAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToArithEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public NormalResultAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToNormalVarContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArrayResultAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalVarAssignToBoolEContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NormalVarAssignToBoolEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalVarAssignToBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalVarAssignToBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalVarAssignToBoolE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairResultAssignToArithEContext extends AssignmentContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public PairResultAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairResultAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairResultAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairResultAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalResultAssignToNormalVarContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public NormalResultAssignToNormalVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNormalResultAssignToNormalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNormalResultAssignToNormalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNormalResultAssignToNormalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayEAssignToArrayEContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public ArrayEAssignToArrayEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayEAssignToArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayEAssignToArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayEAssignToArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairEAssignToPairFSContext extends AssignmentContext {
		public Token e;
		public Token a;
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(VerifierParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(VerifierParser.FIRST, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(VerifierParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(VerifierParser.SECOND, i);
		}
		public PairEAssignToPairFSContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterPairEAssignToPairFS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitPairEAssignToPairFS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitPairEAssignToPairFS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayResultAssignToArithEContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public ArrayResultAssignToArithEContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayResultAssignToArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayResultAssignToArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayResultAssignToArithE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new BoolArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				setState(174);
				match(T__4);
				setState(175);
				match(T__5);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << FORALL) | (1L << EXISTS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(176);
					boolExpr(0);
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(177);
						match(T__6);
						setState(178);
						boolExpr(0);
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(186);
				match(T__7);
				setState(187);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ArithArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ID);
				setState(189);
				match(T__4);
				setState(190);
				match(T__5);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(191);
					arithmeticExpr(0);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(192);
						match(T__6);
						setState(193);
						arithmeticExpr(0);
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(201);
				match(T__7);
				setState(202);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new PairReinitializeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
				setState(204);
				match(T__4);
				setState(205);
				match(T__8);
				setState(206);
				expr();
				setState(207);
				match(T__1);
				setState(208);
				expr();
				setState(209);
				match(T__9);
				setState(210);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new NormalVarAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__4);
				setState(214);
				match(ID);
				setState(215);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new NormalVarAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(ID);
				setState(217);
				match(T__4);
				setState(218);
				match(ID);
				setState(219);
				match(T__8);
				setState(220);
				arithmeticExpr(0);
				setState(221);
				match(T__9);
				setState(222);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new NormalVarAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(ID);
				setState(225);
				match(T__4);
				setState(226);
				match(ID);
				setState(227);
				match(T__10);
				setState(228);
				((NormalVarAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((NormalVarAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new NormalVarAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(ID);
				setState(231);
				match(T__4);
				setState(232);
				match(ID);
				setState(233);
				match(T__10);
				setState(234);
				match(ID);
				setState(235);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new NormalVarAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__4);
				setState(238);
				boolExpr(0);
				setState(239);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new NormalVarAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__4);
				setState(243);
				arithmeticExpr(0);
				setState(244);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new ArrayEAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				match(ID);
				setState(247);
				match(T__8);
				setState(248);
				arithmeticExpr(0);
				setState(249);
				match(T__9);
				setState(250);
				match(T__4);
				setState(251);
				match(ID);
				setState(252);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new ArrayEAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(254);
				match(ID);
				setState(255);
				match(T__8);
				setState(256);
				arithmeticExpr(0);
				setState(257);
				match(T__9);
				setState(258);
				match(T__4);
				setState(259);
				match(ID);
				setState(260);
				match(T__8);
				setState(261);
				arithmeticExpr(0);
				setState(262);
				match(T__9);
				setState(263);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new ArrayEAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__8);
				setState(267);
				arithmeticExpr(0);
				setState(268);
				match(T__9);
				setState(269);
				match(T__4);
				setState(270);
				match(ID);
				setState(271);
				match(T__10);
				setState(272);
				((ArrayEAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((ArrayEAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new ArrayEAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(275);
				match(ID);
				setState(276);
				match(T__8);
				setState(277);
				arithmeticExpr(0);
				setState(278);
				match(T__9);
				setState(279);
				match(T__4);
				setState(280);
				match(ID);
				setState(281);
				match(T__10);
				setState(282);
				match(ID);
				setState(283);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new ArrayEAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(285);
				match(ID);
				setState(286);
				match(T__8);
				setState(287);
				arithmeticExpr(0);
				setState(288);
				match(T__9);
				setState(289);
				match(T__4);
				setState(290);
				boolExpr(0);
				setState(291);
				match(T__1);
				}
				break;
			case 15:
				_localctx = new ArrayEAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__8);
				setState(295);
				arithmeticExpr(0);
				setState(296);
				match(T__9);
				setState(297);
				match(T__4);
				setState(298);
				arithmeticExpr(0);
				setState(299);
				match(T__1);
				}
				break;
			case 16:
				_localctx = new PairEAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(301);
				match(ID);
				setState(302);
				match(T__10);
				setState(303);
				((PairEAssignToNormalVarContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToNormalVarContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				match(T__4);
				setState(305);
				match(ID);
				setState(306);
				match(T__1);
				}
				break;
			case 17:
				_localctx = new PairEAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(307);
				match(ID);
				setState(308);
				match(T__10);
				setState(309);
				((PairEAssignToArrayEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToArrayEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				match(T__4);
				setState(311);
				match(ID);
				setState(312);
				match(T__8);
				setState(313);
				arithmeticExpr(0);
				setState(314);
				match(T__9);
				setState(315);
				match(T__1);
				}
				break;
			case 18:
				_localctx = new PairEAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(317);
				match(ID);
				setState(318);
				match(T__10);
				setState(319);
				((PairEAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				match(T__4);
				setState(321);
				match(ID);
				setState(322);
				match(T__10);
				setState(323);
				((PairEAssignToPairFSContext)_localctx).a = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((PairEAssignToPairFSContext)_localctx).a = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(324);
				match(T__1);
				}
				break;
			case 19:
				_localctx = new PairEAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(325);
				match(ID);
				setState(326);
				match(T__10);
				setState(327);
				((PairEAssignToPairEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToPairEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				match(T__4);
				setState(329);
				match(ID);
				setState(330);
				match(T__10);
				setState(331);
				match(ID);
				setState(332);
				match(T__1);
				}
				break;
			case 20:
				_localctx = new PairEAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(333);
				match(ID);
				setState(334);
				match(T__10);
				setState(335);
				((PairEAssignToBoolEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToBoolEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				match(T__4);
				setState(337);
				boolExpr(0);
				setState(338);
				match(T__1);
				}
				break;
			case 21:
				_localctx = new PairEAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(340);
				match(ID);
				setState(341);
				match(T__10);
				setState(342);
				((PairEAssignToArithEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairEAssignToArithEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				match(T__4);
				setState(344);
				arithmeticExpr(0);
				setState(345);
				match(T__1);
				}
				break;
			case 22:
				_localctx = new NormalResultAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(347);
				match(RESULT);
				setState(348);
				match(T__4);
				setState(349);
				match(ID);
				setState(350);
				match(T__1);
				}
				break;
			case 23:
				_localctx = new NormalResultAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(351);
				match(RESULT);
				setState(352);
				match(T__4);
				setState(353);
				match(ID);
				setState(354);
				match(T__8);
				setState(355);
				arithmeticExpr(0);
				setState(356);
				match(T__9);
				setState(357);
				match(T__1);
				}
				break;
			case 24:
				_localctx = new NormalResultAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(359);
				match(RESULT);
				setState(360);
				match(T__4);
				setState(361);
				match(ID);
				setState(362);
				match(T__10);
				setState(363);
				((NormalResultAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((NormalResultAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				match(T__1);
				}
				break;
			case 25:
				_localctx = new NormalResultAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(365);
				match(RESULT);
				setState(366);
				match(T__4);
				setState(367);
				match(ID);
				setState(368);
				match(T__10);
				setState(369);
				match(ID);
				setState(370);
				match(T__1);
				}
				break;
			case 26:
				_localctx = new NormalResultAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(371);
				match(RESULT);
				setState(372);
				match(T__4);
				setState(373);
				boolExpr(0);
				setState(374);
				match(T__1);
				}
				break;
			case 27:
				_localctx = new NormalResultAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(376);
				match(RESULT);
				setState(377);
				match(T__4);
				setState(378);
				arithmeticExpr(0);
				setState(379);
				match(T__1);
				}
				break;
			case 28:
				_localctx = new ArrayResultAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(381);
				match(RESULT);
				setState(382);
				match(T__8);
				setState(383);
				arithmeticExpr(0);
				setState(384);
				match(T__9);
				setState(385);
				match(T__4);
				setState(386);
				match(ID);
				setState(387);
				match(T__1);
				}
				break;
			case 29:
				_localctx = new ArrayResultAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(389);
				match(RESULT);
				setState(390);
				match(T__8);
				setState(391);
				arithmeticExpr(0);
				setState(392);
				match(T__9);
				setState(393);
				match(T__4);
				setState(394);
				match(ID);
				setState(395);
				match(T__8);
				setState(396);
				arithmeticExpr(0);
				setState(397);
				match(T__9);
				setState(398);
				match(T__1);
				}
				break;
			case 30:
				_localctx = new ArrayResultAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(400);
				match(RESULT);
				setState(401);
				match(T__8);
				setState(402);
				arithmeticExpr(0);
				setState(403);
				match(T__9);
				setState(404);
				match(T__4);
				setState(405);
				match(ID);
				setState(406);
				match(T__10);
				setState(407);
				((ArrayResultAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((ArrayResultAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				match(T__1);
				}
				break;
			case 31:
				_localctx = new ArrayResultAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(410);
				match(RESULT);
				setState(411);
				match(T__8);
				setState(412);
				arithmeticExpr(0);
				setState(413);
				match(T__9);
				setState(414);
				match(T__4);
				setState(415);
				match(ID);
				setState(416);
				match(T__10);
				setState(417);
				match(ID);
				setState(418);
				match(T__1);
				}
				break;
			case 32:
				_localctx = new ArrayResultAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(420);
				match(RESULT);
				setState(421);
				match(T__8);
				setState(422);
				arithmeticExpr(0);
				setState(423);
				match(T__9);
				setState(424);
				match(T__4);
				setState(425);
				boolExpr(0);
				setState(426);
				match(T__1);
				}
				break;
			case 33:
				_localctx = new ArrayResultAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(428);
				match(RESULT);
				setState(429);
				match(T__8);
				setState(430);
				arithmeticExpr(0);
				setState(431);
				match(T__9);
				setState(432);
				match(T__4);
				setState(433);
				arithmeticExpr(0);
				setState(434);
				match(T__1);
				}
				break;
			case 34:
				_localctx = new PairResultAssignToNormalVarContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(436);
				match(RESULT);
				setState(437);
				match(T__10);
				setState(438);
				((PairResultAssignToNormalVarContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToNormalVarContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				match(T__4);
				setState(440);
				match(ID);
				setState(441);
				match(T__1);
				}
				break;
			case 35:
				_localctx = new PairResultAssignToArrayEContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(442);
				match(RESULT);
				setState(443);
				match(T__10);
				setState(444);
				((PairResultAssignToArrayEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToArrayEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				match(T__4);
				setState(446);
				match(ID);
				setState(447);
				match(T__8);
				setState(448);
				arithmeticExpr(0);
				setState(449);
				match(T__9);
				setState(450);
				match(T__1);
				}
				break;
			case 36:
				_localctx = new PairResultAssignToPairFSContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(452);
				match(RESULT);
				setState(453);
				match(T__10);
				setState(454);
				((PairResultAssignToPairFSContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToPairFSContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				match(T__4);
				setState(456);
				match(ID);
				setState(457);
				match(T__10);
				setState(458);
				((PairResultAssignToPairFSContext)_localctx).a = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==SECOND) ) {
					((PairResultAssignToPairFSContext)_localctx).a = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(459);
				match(T__1);
				}
				break;
			case 37:
				_localctx = new PairResultAssignToPairEContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(460);
				match(RESULT);
				setState(461);
				match(T__10);
				setState(462);
				((PairResultAssignToPairEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToPairEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				match(T__4);
				setState(464);
				match(ID);
				setState(465);
				match(T__10);
				setState(466);
				match(ID);
				setState(467);
				match(T__1);
				}
				break;
			case 38:
				_localctx = new PairResultAssignToBoolEContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(468);
				match(RESULT);
				setState(469);
				match(T__10);
				setState(470);
				((PairResultAssignToBoolEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToBoolEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(T__4);
				setState(472);
				boolExpr(0);
				setState(473);
				match(T__1);
				}
				break;
			case 39:
				_localctx = new PairResultAssignToArithEContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(475);
				match(RESULT);
				setState(476);
				match(T__10);
				setState(477);
				((PairResultAssignToArithEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((PairResultAssignToArithEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
				match(T__4);
				setState(479);
				arithmeticExpr(0);
				setState(480);
				match(T__1);
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

	public static class AlternationContext extends ParserRuleContext {
		public AlternationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternation; }
	 
		public AlternationContext() { }
		public void copyFrom(AlternationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlternationBodyContext extends AlternationContext {
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public List<ElseifstatContext> elseifstat() {
			return getRuleContexts(ElseifstatContext.class);
		}
		public ElseifstatContext elseifstat(int i) {
			return getRuleContext(ElseifstatContext.class,i);
		}
		public ElsestatContext elsestat() {
			return getRuleContext(ElsestatContext.class,0);
		}
		public AlternationBodyContext(AlternationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterAlternationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitAlternationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitAlternationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternationContext alternation() throws RecognitionException {
		AlternationContext _localctx = new AlternationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alternation);
		int _la;
		try {
			_localctx = new AlternationBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			ifstat();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(485);
				elseifstat();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(491);
				elsestat();
				}
			}

			setState(494);
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

	public static class IfstatContext extends ParserRuleContext {
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	 
		public IfstatContext() { }
		public void copyFrom(IfstatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends IfstatContext {
		public TerminalNode IF() { return getToken(VerifierParser.IF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VerifierParser.THEN, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public IfStatementContext(IfstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstat);
		int _la;
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(IF);
			setState(497);
			boolExpr(0);
			setState(498);
			match(THEN);
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				implementation();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
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

	public static class ElseifstatContext extends ParserRuleContext {
		public ElseifstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstat; }
	 
		public ElseifstatContext() { }
		public void copyFrom(ElseifstatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementContext extends ElseifstatContext {
		public TerminalNode ELSEIF() { return getToken(VerifierParser.ELSEIF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VerifierParser.THEN, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public ElseIfStatementContext(ElseifstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstatContext elseifstat() throws RecognitionException {
		ElseifstatContext _localctx = new ElseifstatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseifstat);
		int _la;
		try {
			_localctx = new ElseIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(ELSEIF);
			setState(505);
			boolExpr(0);
			setState(506);
			match(THEN);
			setState(508); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				implementation();
				}
				}
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
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

	public static class ElsestatContext extends ParserRuleContext {
		public ElsestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestat; }
	 
		public ElsestatContext() { }
		public void copyFrom(ElsestatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatementContext extends ElsestatContext {
		public TerminalNode ELSE() { return getToken(VerifierParser.ELSE, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public ElseStatementContext(ElsestatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatContext elsestat() throws RecognitionException {
		ElsestatContext _localctx = new ElsestatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elsestat);
		int _la;
		try {
			_localctx = new ElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(ELSE);
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				implementation();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopsContext extends LoopContext {
		public InitImpContext initImp() {
			return getRuleContext(InitImpContext.class,0);
		}
		public InvariantStatContext invariantStat() {
			return getRuleContext(InvariantStatContext.class,0);
		}
		public ExitConditionContext exitCondition() {
			return getRuleContext(ExitConditionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public VariantStatContext variantStat() {
			return getRuleContext(VariantStatContext.class,0);
		}
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public LoopsContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		try {
			_localctx = new LoopsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			initImp();
			setState(519);
			invariantStat();
			setState(520);
			exitCondition();
			setState(521);
			loopBody();
			setState(522);
			variantStat();
			setState(523);
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

	public static class InitImpContext extends ParserRuleContext {
		public InitImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initImp; }
	 
		public InitImpContext() { }
		public void copyFrom(InitImpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopInitialImpsContext extends InitImpContext {
		public TerminalNode FROM() { return getToken(VerifierParser.FROM, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public LoopInitialImpsContext(InitImpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoopInitialImps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoopInitialImps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoopInitialImps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitImpContext initImp() throws RecognitionException {
		InitImpContext _localctx = new InitImpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initImp);
		int _la;
		try {
			_localctx = new LoopInitialImpsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(FROM);
			setState(527); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(526);
				implementation();
				}
				}
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
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

	public static class InvariantStatContext extends ParserRuleContext {
		public InvariantStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariantStat; }
	 
		public InvariantStatContext() { }
		public void copyFrom(InvariantStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopInvariantContext extends InvariantStatContext {
		public TerminalNode INVARIANT() { return getToken(VerifierParser.INVARIANT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public LoopInvariantContext(InvariantStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoopInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoopInvariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoopInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantStatContext invariantStat() throws RecognitionException {
		InvariantStatContext _localctx = new InvariantStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invariantStat);
		try {
			_localctx = new LoopInvariantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(INVARIANT);
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(532);
				match(ID);
				setState(533);
				match(T__3);
				}
				break;
			}
			setState(536);
			boolExpr(0);
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

	public static class ExitConditionContext extends ParserRuleContext {
		public ExitConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCondition; }
	 
		public ExitConditionContext() { }
		public void copyFrom(ExitConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopExitConditionContext extends ExitConditionContext {
		public TerminalNode UNTIL() { return getToken(VerifierParser.UNTIL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public LoopExitConditionContext(ExitConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoopExitCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoopExitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoopExitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitConditionContext exitCondition() throws RecognitionException {
		ExitConditionContext _localctx = new ExitConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exitCondition);
		try {
			_localctx = new LoopExitConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(UNTIL);
			setState(539);
			boolExpr(0);
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

	public static class LoopBodyContext extends ParserRuleContext {
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
	 
		public LoopBodyContext() { }
		public void copyFrom(LoopBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopBodyImpsContext extends LoopBodyContext {
		public TerminalNode LOOP() { return getToken(VerifierParser.LOOP, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public LoopBodyImpsContext(LoopBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoopBodyImps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoopBodyImps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoopBodyImps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopBody);
		int _la;
		try {
			_localctx = new LoopBodyImpsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LOOP);
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
				implementation();
				}
				}
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
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

	public static class VariantStatContext extends ParserRuleContext {
		public VariantStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantStat; }
	 
		public VariantStatContext() { }
		public void copyFrom(VariantStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopVariantContext extends VariantStatContext {
		public TerminalNode VARIANT() { return getToken(VerifierParser.VARIANT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public LoopVariantContext(VariantStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLoopVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLoopVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLoopVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantStatContext variantStat() throws RecognitionException {
		VariantStatContext _localctx = new VariantStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variantStat);
		try {
			_localctx = new LoopVariantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(VARIANT);
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(548);
				match(ID);
				setState(549);
				match(T__3);
				}
				break;
			}
			setState(552);
			arithmeticExpr(0);
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
		enterRule(_localctx, 42, RULE_declaration);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new UninitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				uninitialDecl();
				}
				break;
			case 2:
				_localctx = new InitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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
	public static class NamedPairUnnamedEleDeclContext extends UninitialDeclContext {
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
		public NamedPairUnnamedEleDeclContext(UninitialDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterNamedPairUnnamedEleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitNamedPairUnnamedEleDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitNamedPairUnnamedEleDecl(this);
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
		enterRule(_localctx, 44, RULE_uninitialDecl);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(ID);
				setState(559);
				match(T__3);
				setState(560);
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
				setState(561);
				match(ID);
				setState(562);
				match(T__3);
				setState(563);
				match(ARRAY);
				setState(564);
				match(T__8);
				setState(565);
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
				setState(566);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(ID);
				setState(568);
				match(T__3);
				setState(569);
				match(PAIR);
				setState(570);
				match(T__8);
				setState(571);
				match(ID);
				setState(572);
				match(T__3);
				setState(573);
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
				setState(574);
				match(T__1);
				setState(575);
				match(ID);
				setState(576);
				match(T__3);
				setState(577);
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
				setState(578);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new NamedPairUnnamedEleDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				match(ID);
				setState(580);
				match(T__3);
				setState(581);
				match(PAIR);
				setState(582);
				match(T__8);
				setState(583);
				((NamedPairUnnamedEleDeclContext)_localctx).left = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((NamedPairUnnamedEleDeclContext)_localctx).left = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(584);
				match(T__1);
				setState(585);
				((NamedPairUnnamedEleDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((NamedPairUnnamedEleDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(586);
				match(T__9);
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
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
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
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
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
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
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
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> INT() { return getTokens(VerifierParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(VerifierParser.INT, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
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
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> REAL() { return getTokens(VerifierParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(VerifierParser.REAL, i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
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
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
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
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
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
		enterRule(_localctx, 46, RULE_initialDecl);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(ID);
				setState(590);
				match(T__3);
				setState(591);
				match(BOOL);
				setState(592);
				match(EQUAL);
				setState(593);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(ID);
				setState(595);
				match(T__3);
				setState(596);
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
				setState(597);
				match(EQUAL);
				setState(598);
				arithmeticExpr(0);
				}
				break;
			case 3:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(ID);
				setState(600);
				match(T__3);
				setState(601);
				match(ARRAY);
				setState(602);
				match(T__8);
				setState(603);
				match(BOOL);
				setState(604);
				match(T__9);
				setState(605);
				match(EQUAL);
				setState(606);
				match(T__5);
				setState(607);
				boolExpr(0);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(608);
					match(T__6);
					setState(609);
					boolExpr(0);
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(615);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				match(ID);
				setState(618);
				match(T__3);
				setState(619);
				match(ARRAY);
				setState(620);
				match(T__8);
				setState(621);
				match(INT);
				setState(622);
				match(T__9);
				setState(623);
				match(EQUAL);
				setState(624);
				match(T__5);
				setState(625);
				arithmeticExpr(0);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(626);
					match(T__6);
					setState(627);
					arithmeticExpr(0);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(635);
				match(ID);
				setState(636);
				match(T__3);
				setState(637);
				match(ARRAY);
				setState(638);
				match(T__8);
				setState(639);
				match(REAL);
				setState(640);
				match(T__9);
				setState(641);
				match(EQUAL);
				setState(642);
				match(T__5);
				setState(643);
				arithmeticExpr(0);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(644);
					match(T__6);
					setState(645);
					arithmeticExpr(0);
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(651);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				match(ID);
				setState(654);
				match(T__3);
				setState(655);
				match(PAIR);
				setState(656);
				match(T__8);
				setState(657);
				match(BOOL);
				setState(658);
				match(T__1);
				setState(659);
				match(BOOL);
				setState(660);
				match(T__9);
				setState(661);
				match(EQUAL);
				setState(662);
				match(T__8);
				setState(663);
				boolExpr(0);
				setState(664);
				match(T__1);
				setState(665);
				boolExpr(0);
				setState(666);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
				match(ID);
				setState(669);
				match(T__3);
				setState(670);
				match(PAIR);
				setState(671);
				match(T__8);
				setState(672);
				match(BOOL);
				setState(673);
				match(T__1);
				setState(674);
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
				setState(675);
				match(T__9);
				setState(676);
				match(EQUAL);
				setState(677);
				match(T__8);
				setState(678);
				boolExpr(0);
				setState(679);
				match(T__1);
				setState(680);
				arithmeticExpr(0);
				setState(681);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(683);
				match(ID);
				setState(684);
				match(T__3);
				setState(685);
				match(PAIR);
				setState(686);
				match(T__8);
				setState(687);
				match(INT);
				setState(688);
				match(T__1);
				setState(689);
				match(BOOL);
				setState(690);
				match(T__9);
				setState(691);
				match(EQUAL);
				setState(692);
				match(T__8);
				setState(693);
				arithmeticExpr(0);
				setState(694);
				match(T__1);
				setState(695);
				boolExpr(0);
				setState(696);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
				match(ID);
				setState(699);
				match(T__3);
				setState(700);
				match(PAIR);
				setState(701);
				match(T__8);
				setState(702);
				match(INT);
				setState(703);
				match(T__1);
				setState(704);
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
				setState(705);
				match(T__9);
				setState(706);
				match(EQUAL);
				setState(707);
				match(T__8);
				setState(708);
				arithmeticExpr(0);
				setState(709);
				match(T__1);
				setState(710);
				arithmeticExpr(0);
				setState(711);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(713);
				match(ID);
				setState(714);
				match(T__3);
				setState(715);
				match(PAIR);
				setState(716);
				match(T__8);
				setState(717);
				match(REAL);
				setState(718);
				match(T__1);
				setState(719);
				match(BOOL);
				setState(720);
				match(T__9);
				setState(721);
				match(EQUAL);
				setState(722);
				match(T__8);
				setState(723);
				arithmeticExpr(0);
				setState(724);
				match(T__1);
				setState(725);
				boolExpr(0);
				setState(726);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(728);
				match(ID);
				setState(729);
				match(T__3);
				setState(730);
				match(PAIR);
				setState(731);
				match(T__8);
				setState(732);
				match(REAL);
				setState(733);
				match(T__1);
				setState(734);
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
				setState(735);
				match(T__9);
				setState(736);
				match(EQUAL);
				setState(737);
				match(T__8);
				setState(738);
				arithmeticExpr(0);
				setState(739);
				match(T__1);
				setState(740);
				arithmeticExpr(0);
				setState(741);
				match(T__9);
				}
				break;
			case 12:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(743);
				match(ID);
				setState(744);
				match(T__3);
				setState(745);
				match(PAIR);
				setState(746);
				match(T__8);
				setState(747);
				match(ID);
				setState(748);
				match(T__3);
				setState(749);
				match(BOOL);
				setState(750);
				match(T__1);
				setState(751);
				match(ID);
				setState(752);
				match(T__3);
				setState(753);
				match(BOOL);
				setState(754);
				match(T__9);
				setState(755);
				match(EQUAL);
				setState(756);
				match(T__8);
				setState(757);
				boolExpr(0);
				setState(758);
				match(T__1);
				setState(759);
				boolExpr(0);
				setState(760);
				match(T__9);
				}
				break;
			case 13:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(762);
				match(ID);
				setState(763);
				match(T__3);
				setState(764);
				match(PAIR);
				setState(765);
				match(T__8);
				setState(766);
				match(ID);
				setState(767);
				match(T__3);
				setState(768);
				match(BOOL);
				setState(769);
				match(T__1);
				setState(770);
				match(ID);
				setState(771);
				match(T__3);
				setState(772);
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
				setState(773);
				match(T__9);
				setState(774);
				match(EQUAL);
				setState(775);
				match(T__8);
				setState(776);
				boolExpr(0);
				setState(777);
				match(T__1);
				setState(778);
				arithmeticExpr(0);
				setState(779);
				match(T__9);
				}
				break;
			case 14:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(781);
				match(ID);
				setState(782);
				match(T__3);
				setState(783);
				match(PAIR);
				setState(784);
				match(T__8);
				setState(785);
				match(ID);
				setState(786);
				match(T__3);
				setState(787);
				match(INT);
				setState(788);
				match(T__1);
				setState(789);
				match(ID);
				setState(790);
				match(T__3);
				setState(791);
				match(BOOL);
				setState(792);
				match(T__9);
				setState(793);
				match(EQUAL);
				setState(794);
				match(T__8);
				setState(795);
				arithmeticExpr(0);
				setState(796);
				match(T__1);
				setState(797);
				boolExpr(0);
				setState(798);
				match(T__9);
				}
				break;
			case 15:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(800);
				match(ID);
				setState(801);
				match(T__3);
				setState(802);
				match(PAIR);
				setState(803);
				match(T__8);
				setState(804);
				match(ID);
				setState(805);
				match(T__3);
				setState(806);
				match(INT);
				setState(807);
				match(T__1);
				setState(808);
				match(ID);
				setState(809);
				match(T__3);
				setState(810);
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
				setState(811);
				match(T__9);
				setState(812);
				match(EQUAL);
				setState(813);
				match(T__8);
				setState(814);
				arithmeticExpr(0);
				setState(815);
				match(T__1);
				setState(816);
				arithmeticExpr(0);
				setState(817);
				match(T__9);
				}
				break;
			case 16:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(819);
				match(ID);
				setState(820);
				match(T__3);
				setState(821);
				match(PAIR);
				setState(822);
				match(T__8);
				setState(823);
				match(ID);
				setState(824);
				match(T__3);
				setState(825);
				match(REAL);
				setState(826);
				match(T__1);
				setState(827);
				match(ID);
				setState(828);
				match(T__3);
				setState(829);
				match(BOOL);
				setState(830);
				match(T__9);
				setState(831);
				match(EQUAL);
				setState(832);
				match(T__8);
				setState(833);
				arithmeticExpr(0);
				setState(834);
				match(T__1);
				setState(835);
				boolExpr(0);
				setState(836);
				match(T__9);
				}
				break;
			case 17:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(838);
				match(ID);
				setState(839);
				match(T__3);
				setState(840);
				match(PAIR);
				setState(841);
				match(T__8);
				setState(842);
				match(ID);
				setState(843);
				match(T__3);
				setState(844);
				match(REAL);
				setState(845);
				match(T__1);
				setState(846);
				match(ID);
				setState(847);
				match(T__3);
				setState(848);
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
				setState(849);
				match(T__9);
				setState(850);
				match(EQUAL);
				setState(851);
				match(T__8);
				setState(852);
				arithmeticExpr(0);
				setState(853);
				match(T__1);
				setState(854);
				arithmeticExpr(0);
				setState(855);
				match(T__9);
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

	public static class UnnamedDeclContext extends ParserRuleContext {
		public UnnamedDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedDecl; }
	 
		public UnnamedDeclContext() { }
		public void copyFrom(UnnamedDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnnamedArrayDeclContext extends UnnamedDeclContext {
		public Token type;
		public TerminalNode ARRAY() { return getToken(VerifierParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public UnnamedArrayDeclContext(UnnamedDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedPairDeclContext extends UnnamedDeclContext {
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<UnnamedDeclContext> unnamedDecl() {
			return getRuleContexts(UnnamedDeclContext.class);
		}
		public UnnamedDeclContext unnamedDecl(int i) {
			return getRuleContext(UnnamedDeclContext.class,i);
		}
		public UnnamedPairDeclContext(UnnamedDeclContext ctx) { copyFrom(ctx); }
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
	public static class UnnamedPairValueDeclContext extends UnnamedDeclContext {
		public Token left;
		public Token right;
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
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
		public UnnamedPairValueDeclContext(UnnamedDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedPairValueDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedPairValueDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedPairValueDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedSingleVarDeclContext extends UnnamedDeclContext {
		public Token type;
		public TerminalNode BOOL() { return getToken(VerifierParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(VerifierParser.INT, 0); }
		public TerminalNode REAL() { return getToken(VerifierParser.REAL, 0); }
		public UnnamedSingleVarDeclContext(UnnamedDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUnnamedSingleVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUnnamedSingleVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUnnamedSingleVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamedDeclContext unnamedDecl() throws RecognitionException {
		UnnamedDeclContext _localctx = new UnnamedDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unnamedDecl);
		int _la;
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new UnnamedSingleVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				((UnnamedSingleVarDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedSingleVarDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new UnnamedArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(ARRAY);
				setState(861);
				match(T__8);
				setState(862);
				((UnnamedArrayDeclContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedArrayDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(863);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(PAIR);
				setState(865);
				match(T__8);
				setState(866);
				unnamedDecl();
				setState(867);
				match(T__1);
				setState(868);
				unnamedDecl();
				setState(869);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new UnnamedPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(PAIR);
				setState(872);
				match(T__8);
				setState(873);
				match(ID);
				setState(874);
				match(T__3);
				setState(875);
				((UnnamedPairValueDeclContext)_localctx).left = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedPairValueDeclContext)_localctx).left = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(876);
				match(T__1);
				setState(877);
				match(ID);
				setState(878);
				match(T__3);
				setState(879);
				((UnnamedPairValueDeclContext)_localctx).right = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL))) != 0)) ) {
					((UnnamedPairValueDeclContext)_localctx).right = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(880);
				match(T__9);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithEContext extends ExprContext {
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArithEContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolEContext extends ExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolEContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new BoolEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new ArithEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				arithmeticExpr(0);
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
	public static class OldBoolArrayEContext extends BoolExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public OldBoolArrayEContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldBoolArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldBoolArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldBoolArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OldBoolPairEContext extends BoolExprContext {
		public Token e;
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public OldBoolPairEContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldBoolPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldBoolPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldBoolPairE(this);
			else return visitor.visitChildren(this);
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
	public static class OldBoolVarContext extends BoolExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public OldBoolVarContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolPairElementContext extends BoolExprContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public BoolPairElementContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolPairElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolPairElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolPairElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolPairFirstContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public BoolPairFirstContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolPairFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolPairFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolPairFirst(this);
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
	public static class BoolPairResultContext extends BoolExprContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public BoolPairResultContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolPairResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolPairResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolPairResult(this);
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
	public static class BoolResultContext extends BoolExprContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public BoolResultContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelateContext extends BoolExprContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
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
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
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
	public static class BoolPairSecondContext extends BoolExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public BoolPairSecondContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolPairSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolPairSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolPairSecond(this);
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
	public static class BoolArrayResultContext extends BoolExprContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BoolArrayResultContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolArrayResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolArrayResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolArrayResult(this);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(888);
				match(NOT);
				setState(889);
				boolExpr(22);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(890);
				match(FORALL);
				setState(892); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(891);
					varDecl();
					}
					}
					setState(894); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(896);
				match(T__11);
				setState(897);
				boolExpr(17);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(899);
				match(EXISTS);
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(900);
					varDecl();
					}
					}
					setState(903); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(905);
				match(T__11);
				setState(906);
				boolExpr(16);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(908);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(909);
				match(ID);
				setState(910);
				match(T__8);
				setState(911);
				arithmeticExpr(0);
				setState(912);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new OldBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(914);
				match(OLD);
				setState(915);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new OldBoolArrayEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(916);
				match(OLD);
				setState(917);
				match(ID);
				setState(918);
				match(T__8);
				setState(919);
				arithmeticExpr(0);
				setState(920);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new OldBoolPairEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(922);
				match(OLD);
				setState(923);
				match(ID);
				setState(924);
				match(T__10);
				setState(925);
				((OldBoolPairEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((OldBoolPairEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new BoolResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926);
				match(RESULT);
				}
				break;
			case 10:
				{
				_localctx = new BoolArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(927);
				match(RESULT);
				setState(928);
				match(T__8);
				setState(929);
				arithmeticExpr(0);
				setState(930);
				match(T__9);
				}
				break;
			case 11:
				{
				_localctx = new BoolPairResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(932);
				match(RESULT);
				setState(933);
				match(T__10);
				setState(934);
				((BoolPairResultContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((BoolPairResultContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 12:
				{
				_localctx = new BoolPairFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(935);
				match(ID);
				setState(936);
				match(T__10);
				setState(937);
				match(FIRST);
				}
				break;
			case 13:
				{
				_localctx = new BoolPairSecondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(938);
				match(ID);
				setState(939);
				match(T__10);
				setState(940);
				match(SECOND);
				}
				break;
			case 14:
				{
				_localctx = new BoolPairElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(941);
				match(ID);
				setState(942);
				match(T__10);
				setState(943);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(944);
				match(TRUE);
				}
				break;
			case 16:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(945);
				match(FALSE);
				}
				break;
			case 17:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(946);
				match(T__0);
				setState(947);
				boolExpr(0);
				setState(948);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(950);
				relationalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(965);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(953);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(954);
						match(AND);
						setState(955);
						boolExpr(22);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(956);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(957);
						match(OR);
						setState(958);
						boolExpr(21);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(959);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(960);
						match(IMPLIES);
						setState(961);
						boolExpr(20);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(962);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(963);
						match(IFF);
						setState(964);
						boolExpr(19);
						}
						break;
					}
					} 
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 54, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(ID);
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(971);
				match(T__6);
				setState(972);
				match(ID);
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(978);
			match(T__3);
			setState(979);
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
			setState(980);
			match(T__1);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
	 
		public RelationalExprContext() { }
		public void copyFrom(RelationalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessOrEqualContext extends RelationalExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode LESSOREQUAL() { return getToken(VerifierParser.LESSOREQUAL, 0); }
		public LessOrEqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
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
	public static class LessThanContext extends RelationalExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(VerifierParser.LESSTHAN, 0); }
		public LessThanContext(RelationalExprContext ctx) { copyFrom(ctx); }
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
	public static class EqualContext extends RelationalExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(VerifierParser.EQUAL, 0); }
		public EqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
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
	public static class GreaterThanContext extends RelationalExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(VerifierParser.GREATERTHAN, 0); }
		public GreaterThanContext(RelationalExprContext ctx) { copyFrom(ctx); }
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
	public static class GreaterOrEqualContext extends RelationalExprContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode GREATEROREQUAL() { return getToken(VerifierParser.GREATEROREQUAL, 0); }
		public GreaterOrEqualContext(RelationalExprContext ctx) { copyFrom(ctx); }
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

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relationalExpr);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				arithmeticExpr(0);
				setState(983);
				match(EQUAL);
				setState(984);
				arithmeticExpr(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				arithmeticExpr(0);
				setState(987);
				match(GREATERTHAN);
				setState(988);
				arithmeticExpr(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				arithmeticExpr(0);
				setState(991);
				match(LESSTHAN);
				setState(992);
				arithmeticExpr(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				arithmeticExpr(0);
				setState(995);
				match(GREATEROREQUAL);
				setState(996);
				arithmeticExpr(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
				arithmeticExpr(0);
				setState(999);
				match(LESSOREQUAL);
				setState(1000);
				arithmeticExpr(0);
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

	public static class ArithmeticExprContext extends ParserRuleContext {
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
	 
		public ArithmeticExprContext() { }
		public void copyFrom(ArithmeticExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticVarContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticVarContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class IntNumContext extends ArithmeticExprContext {
		public TerminalNode INTNUM() { return getToken(VerifierParser.INTNUM, 0); }
		public IntNumContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class ArithParenContext extends ArithmeticExprContext {
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArithParenContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class MulDivContext extends ArithmeticExprContext {
		public Token op;
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(VerifierParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VerifierParser.DIV, 0); }
		public MulDivContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class AddSubContext extends ArithmeticExprContext {
		public Token op;
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(VerifierParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(VerifierParser.SUB, 0); }
		public AddSubContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class ArithPairElementContext extends ArithmeticExprContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithPairElementContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithPairElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithPairElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithPairElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpperArrayContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode UPPER() { return getToken(VerifierParser.UPPER, 0); }
		public UpperArrayContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterUpperArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitUpperArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitUpperArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealNumContext extends ArithmeticExprContext {
		public TerminalNode REALNUM() { return getToken(VerifierParser.REALNUM, 0); }
		public RealNumContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class IndexArithmeticArrayContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public IndexArithmeticArrayContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
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
	public static class ArithResultContext extends ArithmeticExprContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithResultContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowerArrayContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode LOWER() { return getToken(VerifierParser.LOWER, 0); }
		public LowerArrayContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterLowerArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitLowerArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitLowerArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OldArithPairEContext extends ArithmeticExprContext {
		public Token e;
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public OldArithPairEContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldArithPairE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldArithPairE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldArithPairE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithPairResultContext extends ArithmeticExprContext {
		public Token e;
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithPairResultContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithPairResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithPairResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithPairResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithPairSecondContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode SECOND() { return getToken(VerifierParser.SECOND, 0); }
		public ArithPairSecondContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithPairSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithPairSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithPairSecond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OldArithArrayEContext extends ArithmeticExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public OldArithArrayEContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldArithArrayE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldArithArrayE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldArithArrayE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithArrayResultContext extends ArithmeticExprContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArithArrayResultContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithArrayResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithArrayResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithArrayResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountArrayContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode COUNT() { return getToken(VerifierParser.COUNT, 0); }
		public CountArrayContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterCountArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitCountArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitCountArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithPairFirstContext extends ArithmeticExprContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode FIRST() { return getToken(VerifierParser.FIRST, 0); }
		public ArithPairFirstContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithPairFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithPairFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithPairFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OldArithVarContext extends ArithmeticExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public OldArithVarContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldArithVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldArithVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldArithVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		return arithmeticExpr(0);
	}

	private ArithmeticExprContext arithmeticExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, _parentState);
		ArithmeticExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_arithmeticExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1005);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1006);
				match(ID);
				setState(1007);
				match(T__8);
				setState(1008);
				arithmeticExpr(0);
				setState(1009);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new OldArithVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1011);
				match(OLD);
				setState(1012);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new OldArithArrayEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				match(OLD);
				setState(1014);
				match(ID);
				setState(1015);
				match(T__8);
				setState(1016);
				arithmeticExpr(0);
				setState(1017);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new OldArithPairEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1019);
				match(OLD);
				setState(1020);
				match(ID);
				setState(1021);
				match(T__10);
				setState(1022);
				((OldArithPairEContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((OldArithPairEContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new ArithResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1023);
				match(RESULT);
				}
				break;
			case 7:
				{
				_localctx = new ArithArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1024);
				match(RESULT);
				setState(1025);
				match(T__8);
				setState(1026);
				arithmeticExpr(0);
				setState(1027);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new ArithPairResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1029);
				match(RESULT);
				setState(1030);
				match(T__10);
				setState(1031);
				((ArithPairResultContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIRST) | (1L << SECOND) | (1L << ID))) != 0)) ) {
					((ArithPairResultContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new ArithPairFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1032);
				match(ID);
				setState(1033);
				match(T__10);
				setState(1034);
				match(FIRST);
				}
				break;
			case 10:
				{
				_localctx = new ArithPairSecondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1035);
				match(ID);
				setState(1036);
				match(T__10);
				setState(1037);
				match(SECOND);
				}
				break;
			case 11:
				{
				_localctx = new ArithPairElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1038);
				match(ID);
				setState(1039);
				match(T__10);
				setState(1040);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1041);
				match(INTNUM);
				}
				break;
			case 13:
				{
				_localctx = new CountArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1042);
				match(ID);
				setState(1043);
				match(T__10);
				setState(1044);
				match(COUNT);
				}
				break;
			case 14:
				{
				_localctx = new LowerArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1045);
				match(ID);
				setState(1046);
				match(T__10);
				setState(1047);
				match(LOWER);
				}
				break;
			case 15:
				{
				_localctx = new UpperArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1048);
				match(ID);
				setState(1049);
				match(T__10);
				setState(1050);
				match(UPPER);
				}
				break;
			case 16:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1051);
				match(REALNUM);
				}
				break;
			case 17:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1052);
				match(T__0);
				setState(1053);
				arithmeticExpr(0);
				setState(1054);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1064);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(1058);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1059);
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
						setState(1060);
						arithmeticExpr(20);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(1061);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1062);
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
						setState(1063);
						arithmeticExpr(19);
						}
						break;
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		case 26:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 29:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0430\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\5\4O\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\5\5[\n\5\3\5\5\5^\n\5\3\5\5"+
		"\5a\n\5\3\5\5\5d\n\5\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\5\5m\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6v\n\6\f\6\16\6y\13\6\5\6{\n\6\3\6\5\6~\n\6\3\6\3"+
		"\6\3\6\5\6\u0083\n\6\3\6\5\6\u0086\n\6\3\6\3\6\6\6\u008a\n\6\r\6\16\6"+
		"\u008b\3\6\5\6\u008f\n\6\3\6\3\6\3\7\3\7\6\7\u0095\n\7\r\7\16\7\u0096"+
		"\3\b\3\b\6\b\u009b\n\b\r\b\16\b\u009c\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\3"+
		"\n\3\n\6\n\u00a7\n\n\r\n\16\n\u00a8\3\13\3\13\3\13\5\13\u00ae\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\5\f\u00bb\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\5\f\u00ca"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u01e5\n\f\3\r\3\r\7\r\u01e9\n\r\f\r\16\r\u01ec\13\r\3\r\5"+
		"\r\u01ef\n\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u01f7\n\16\r\16\16\16\u01f8"+
		"\3\17\3\17\3\17\3\17\6\17\u01ff\n\17\r\17\16\17\u0200\3\20\3\20\6\20\u0205"+
		"\n\20\r\20\16\20\u0206\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6"+
		"\22\u0212\n\22\r\22\16\22\u0213\3\23\3\23\3\23\5\23\u0219\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\6\25\u0222\n\25\r\25\16\25\u0223\3\26\3\26"+
		"\3\26\5\26\u0229\n\26\3\26\3\26\3\27\3\27\5\27\u022f\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u024e"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0265\n\31\f\31\16\31\u0268"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0277\n\31\f\31\16\31\u027a\13\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0289\n\31\f\31\16\31\u028c\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u035c\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0374\n\32\3\33\3\33\5\33"+
		"\u0378\n\33\3\34\3\34\3\34\3\34\3\34\6\34\u037f\n\34\r\34\16\34\u0380"+
		"\3\34\3\34\3\34\3\34\3\34\6\34\u0388\n\34\r\34\16\34\u0389\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u03ba\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u03c8\n\34\f\34\16\34\u03cb\13\34\3\35\3\35\3\35"+
		"\7\35\u03d0\n\35\f\35\16\35\u03d3\13\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u03ed\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0423\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u042b"+
		"\n\37\f\37\16\37\u042e\13\37\3\37\2\4\66< \2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\b\3\2\24\25\4\2\24\25>>\3\2\17"+
		"\21\3\2\20\21\3\289\3\2:;\2\u04a7\2?\3\2\2\2\4J\3\2\2\2\6N\3\2\2\2\bP"+
		"\3\2\2\2\np\3\2\2\2\f\u0092\3\2\2\2\16\u0098\3\2\2\2\20\u00a0\3\2\2\2"+
		"\22\u00a4\3\2\2\2\24\u00ad\3\2\2\2\26\u01e4\3\2\2\2\30\u01e6\3\2\2\2\32"+
		"\u01f2\3\2\2\2\34\u01fa\3\2\2\2\36\u0202\3\2\2\2 \u0208\3\2\2\2\"\u020f"+
		"\3\2\2\2$\u0215\3\2\2\2&\u021c\3\2\2\2(\u021f\3\2\2\2*\u0225\3\2\2\2,"+
		"\u022e\3\2\2\2.\u024d\3\2\2\2\60\u035b\3\2\2\2\62\u0373\3\2\2\2\64\u0377"+
		"\3\2\2\2\66\u03b9\3\2\2\28\u03cc\3\2\2\2:\u03ec\3\2\2\2<\u0422\3\2\2\2"+
		">@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CK\5,\27"+
		"\2DK\5\26\f\2EK\5\6\4\2FG\7\26\2\2GK\5\66\34\2HI\7\26\2\2IK\7>\2\2JC\3"+
		"\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JH\3\2\2\2K\5\3\2\2\2LO\5\b\5\2MO"+
		"\5\n\6\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2P]\7>\2\2QZ\7\3\2\2RW\5.\30\2S"+
		"T\7\4\2\2TV\5.\30\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\5\2\2]Q\3\2\2\2]^\3\2\2"+
		"\2^`\3\2\2\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5\22\n\2cb\3\2"+
		"\2\2cd\3\2\2\2de\3\2\2\2eg\7\35\2\2fh\5\24\13\2gf\3\2\2\2hi\3\2\2\2ig"+
		"\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5\16\b\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"no\7\36\2\2o\t\3\2\2\2p}\7>\2\2qz\7\3\2\2rw\5.\30\2st\7\4\2\2tv\5.\30"+
		"\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|~\7\5\2\2}q\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\6\2\2\u0080\u0082\5\62\32\2\u0081\u0083\5\f\7\2\u0082\u0081\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\22\n\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\35"+
		"\2\2\u0088\u008a\5\24\13\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\16"+
		"\b\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\36\2\2\u0091\13\3\2\2\2\u0092\u0094\7\33\2\2\u0093\u0095\5\20"+
		"\t\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\r\3\2\2\2\u0098\u009a\7\34\2\2\u0099\u009b\5\20\t"+
		"\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a1\7\6\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\66"+
		"\34\2\u00a3\21\3\2\2\2\u00a4\u00a6\7\32\2\2\u00a5\u00a7\5,\27\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\23\3\2\2\2\u00aa\u00ae\5\26\f\2\u00ab\u00ae\5\30\r\2\u00ac"+
		"\u00ae\5 \21\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\25\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00ba"+
		"\7\b\2\2\u00b2\u00b7\5\66\34\2\u00b3\u00b4\7\t\2\2\u00b4\u00b6\5\66\34"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u01e5\7\4"+
		"\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c9\7\b\2\2\u00c1"+
		"\u00c6\5<\37\2\u00c2\u00c3\7\t\2\2\u00c3\u00c5\5<\37\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\n\2\2\u00cc\u01e5\7\4\2\2\u00cd"+
		"\u00ce\7>\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1\5\64"+
		"\33\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5\64\33\2\u00d3\u00d4\7\f\2\2\u00d4"+
		"\u00d5\7\4\2\2\u00d5\u01e5\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7\7"+
		"\2\2\u00d8\u00d9\7>\2\2\u00d9\u01e5\7\4\2\2\u00da\u00db\7>\2\2\u00db\u00dc"+
		"\7\7\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7\13\2\2\u00de\u00df\5<\37\2\u00df"+
		"\u00e0\7\f\2\2\u00e0\u00e1\7\4\2\2\u00e1\u01e5\3\2\2\2\u00e2\u00e3\7>"+
		"\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7\r\2\2\u00e6"+
		"\u00e7\t\2\2\2\u00e7\u01e5\7\4\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7\7"+
		"\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed\7>\2\2\u00ed\u01e5"+
		"\7\4\2\2\u00ee\u00ef\7>\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\5\66\34\2"+
		"\u00f1\u00f2\7\4\2\2\u00f2\u01e5\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5"+
		"\7\7\2\2\u00f5\u00f6\5<\37\2\u00f6\u00f7\7\4\2\2\u00f7\u01e5\3\2\2\2\u00f8"+
		"\u00f9\7>\2\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7\f"+
		"\2\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7\4\2\2\u00ff"+
		"\u01e5\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102\7\13\2\2\u0102\u0103\5<"+
		"\37\2\u0103\u0104\7\f\2\2\u0104\u0105\7\7\2\2\u0105\u0106\7>\2\2\u0106"+
		"\u0107\7\13\2\2\u0107\u0108\5<\37\2\u0108\u0109\7\f\2\2\u0109\u010a\7"+
		"\4\2\2\u010a\u01e5\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d\7\13\2\2\u010d"+
		"\u010e\5<\37\2\u010e\u010f\7\f\2\2\u010f\u0110\7\7\2\2\u0110\u0111\7>"+
		"\2\2\u0111\u0112\7\r\2\2\u0112\u0113\t\2\2\2\u0113\u0114\7\4\2\2\u0114"+
		"\u01e5\3\2\2\2\u0115\u0116\7>\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5<"+
		"\37\2\u0118\u0119\7\f\2\2\u0119\u011a\7\7\2\2\u011a\u011b\7>\2\2\u011b"+
		"\u011c\7\r\2\2\u011c\u011d\7>\2\2\u011d\u011e\7\4\2\2\u011e\u01e5\3\2"+
		"\2\2\u011f\u0120\7>\2\2\u0120\u0121\7\13\2\2\u0121\u0122\5<\37\2\u0122"+
		"\u0123\7\f\2\2\u0123\u0124\7\7\2\2\u0124\u0125\5\66\34\2\u0125\u0126\7"+
		"\4\2\2\u0126\u01e5\3\2\2\2\u0127\u0128\7>\2\2\u0128\u0129\7\13\2\2\u0129"+
		"\u012a\5<\37\2\u012a\u012b\7\f\2\2\u012b\u012c\7\7\2\2\u012c\u012d\5<"+
		"\37\2\u012d\u012e\7\4\2\2\u012e\u01e5\3\2\2\2\u012f\u0130\7>\2\2\u0130"+
		"\u0131\7\r\2\2\u0131\u0132\t\3\2\2\u0132\u0133\7\7\2\2\u0133\u0134\7>"+
		"\2\2\u0134\u01e5\7\4\2\2\u0135\u0136\7>\2\2\u0136\u0137\7\r\2\2\u0137"+
		"\u0138\t\3\2\2\u0138\u0139\7\7\2\2\u0139\u013a\7>\2\2\u013a\u013b\7\13"+
		"\2\2\u013b\u013c\5<\37\2\u013c\u013d\7\f\2\2\u013d\u013e\7\4\2\2\u013e"+
		"\u01e5\3\2\2\2\u013f\u0140\7>\2\2\u0140\u0141\7\r\2\2\u0141\u0142\t\3"+
		"\2\2\u0142\u0143\7\7\2\2\u0143\u0144\7>\2\2\u0144\u0145\7\r\2\2\u0145"+
		"\u0146\t\2\2\2\u0146\u01e5\7\4\2\2\u0147\u0148\7>\2\2\u0148\u0149\7\r"+
		"\2\2\u0149\u014a\t\3\2\2\u014a\u014b\7\7\2\2\u014b\u014c\7>\2\2\u014c"+
		"\u014d\7\r\2\2\u014d\u014e\7>\2\2\u014e\u01e5\7\4\2\2\u014f\u0150\7>\2"+
		"\2\u0150\u0151\7\r\2\2\u0151\u0152\t\3\2\2\u0152\u0153\7\7\2\2\u0153\u0154"+
		"\5\66\34\2\u0154\u0155\7\4\2\2\u0155\u01e5\3\2\2\2\u0156\u0157\7>\2\2"+
		"\u0157\u0158\7\r\2\2\u0158\u0159\t\3\2\2\u0159\u015a\7\7\2\2\u015a\u015b"+
		"\5<\37\2\u015b\u015c\7\4\2\2\u015c\u01e5\3\2\2\2\u015d\u015e\7 \2\2\u015e"+
		"\u015f\7\7\2\2\u015f\u0160\7>\2\2\u0160\u01e5\7\4\2\2\u0161\u0162\7 \2"+
		"\2\u0162\u0163\7\7\2\2\u0163\u0164\7>\2\2\u0164\u0165\7\13\2\2\u0165\u0166"+
		"\5<\37\2\u0166\u0167\7\f\2\2\u0167\u0168\7\4\2\2\u0168\u01e5\3\2\2\2\u0169"+
		"\u016a\7 \2\2\u016a\u016b\7\7\2\2\u016b\u016c\7>\2\2\u016c\u016d\7\r\2"+
		"\2\u016d\u016e\t\2\2\2\u016e\u01e5\7\4\2\2\u016f\u0170\7 \2\2\u0170\u0171"+
		"\7\7\2\2\u0171\u0172\7>\2\2\u0172\u0173\7\r\2\2\u0173\u0174\7>\2\2\u0174"+
		"\u01e5\7\4\2\2\u0175\u0176\7 \2\2\u0176\u0177\7\7\2\2\u0177\u0178\5\66"+
		"\34\2\u0178\u0179\7\4\2\2\u0179\u01e5\3\2\2\2\u017a\u017b\7 \2\2\u017b"+
		"\u017c\7\7\2\2\u017c\u017d\5<\37\2\u017d\u017e\7\4\2\2\u017e\u01e5\3\2"+
		"\2\2\u017f\u0180\7 \2\2\u0180\u0181\7\13\2\2\u0181\u0182\5<\37\2\u0182"+
		"\u0183\7\f\2\2\u0183\u0184\7\7\2\2\u0184\u0185\7>\2\2\u0185\u0186\7\4"+
		"\2\2\u0186\u01e5\3\2\2\2\u0187\u0188\7 \2\2\u0188\u0189\7\13\2\2\u0189"+
		"\u018a\5<\37\2\u018a\u018b\7\f\2\2\u018b\u018c\7\7\2\2\u018c\u018d\7>"+
		"\2\2\u018d\u018e\7\13\2\2\u018e\u018f\5<\37\2\u018f\u0190\7\f\2\2\u0190"+
		"\u0191\7\4\2\2\u0191\u01e5\3\2\2\2\u0192\u0193\7 \2\2\u0193\u0194\7\13"+
		"\2\2\u0194\u0195\5<\37\2\u0195\u0196\7\f\2\2\u0196\u0197\7\7\2\2\u0197"+
		"\u0198\7>\2\2\u0198\u0199\7\r\2\2\u0199\u019a\t\2\2\2\u019a\u019b\7\4"+
		"\2\2\u019b\u01e5\3\2\2\2\u019c\u019d\7 \2\2\u019d\u019e\7\13\2\2\u019e"+
		"\u019f\5<\37\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\7\7\2\2\u01a1\u01a2\7>"+
		"\2\2\u01a2\u01a3\7\r\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a5\7\4\2\2\u01a5"+
		"\u01e5\3\2\2\2\u01a6\u01a7\7 \2\2\u01a7\u01a8\7\13\2\2\u01a8\u01a9\5<"+
		"\37\2\u01a9\u01aa\7\f\2\2\u01aa\u01ab\7\7\2\2\u01ab\u01ac\5\66\34\2\u01ac"+
		"\u01ad\7\4\2\2\u01ad\u01e5\3\2\2\2\u01ae\u01af\7 \2\2\u01af\u01b0\7\13"+
		"\2\2\u01b0\u01b1\5<\37\2\u01b1\u01b2\7\f\2\2\u01b2\u01b3\7\7\2\2\u01b3"+
		"\u01b4\5<\37\2\u01b4\u01b5\7\4\2\2\u01b5\u01e5\3\2\2\2\u01b6\u01b7\7 "+
		"\2\2\u01b7\u01b8\7\r\2\2\u01b8\u01b9\t\3\2\2\u01b9\u01ba\7\7\2\2\u01ba"+
		"\u01bb\7>\2\2\u01bb\u01e5\7\4\2\2\u01bc\u01bd\7 \2\2\u01bd\u01be\7\r\2"+
		"\2\u01be\u01bf\t\3\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\7>\2\2\u01c1\u01c2"+
		"\7\13\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7\f\2\2\u01c4\u01c5\7\4\2\2"+
		"\u01c5\u01e5\3\2\2\2\u01c6\u01c7\7 \2\2\u01c7\u01c8\7\r\2\2\u01c8\u01c9"+
		"\t\3\2\2\u01c9\u01ca\7\7\2\2\u01ca\u01cb\7>\2\2\u01cb\u01cc\7\r\2\2\u01cc"+
		"\u01cd\t\2\2\2\u01cd\u01e5\7\4\2\2\u01ce\u01cf\7 \2\2\u01cf\u01d0\7\r"+
		"\2\2\u01d0\u01d1\t\3\2\2\u01d1\u01d2\7\7\2\2\u01d2\u01d3\7>\2\2\u01d3"+
		"\u01d4\7\r\2\2\u01d4\u01d5\7>\2\2\u01d5\u01e5\7\4\2\2\u01d6\u01d7\7 \2"+
		"\2\u01d7\u01d8\7\r\2\2\u01d8\u01d9\t\3\2\2\u01d9\u01da\7\7\2\2\u01da\u01db"+
		"\5\66\34\2\u01db\u01dc\7\4\2\2\u01dc\u01e5\3\2\2\2\u01dd\u01de\7 \2\2"+
		"\u01de\u01df\7\r\2\2\u01df\u01e0\t\3\2\2\u01e0\u01e1\7\7\2\2\u01e1\u01e2"+
		"\5<\37\2\u01e2\u01e3\7\4\2\2\u01e3\u01e5\3\2\2\2\u01e4\u00af\3\2\2\2\u01e4"+
		"\u00be\3\2\2\2\u01e4\u00cd\3\2\2\2\u01e4\u00d6\3\2\2\2\u01e4\u00da\3\2"+
		"\2\2\u01e4\u00e2\3\2\2\2\u01e4\u00e8\3\2\2\2\u01e4\u00ee\3\2\2\2\u01e4"+
		"\u00f3\3\2\2\2\u01e4\u00f8\3\2\2\2\u01e4\u0100\3\2\2\2\u01e4\u010b\3\2"+
		"\2\2\u01e4\u0115\3\2\2\2\u01e4\u011f\3\2\2\2\u01e4\u0127\3\2\2\2\u01e4"+
		"\u012f\3\2\2\2\u01e4\u0135\3\2\2\2\u01e4\u013f\3\2\2\2\u01e4\u0147\3\2"+
		"\2\2\u01e4\u014f\3\2\2\2\u01e4\u0156\3\2\2\2\u01e4\u015d\3\2\2\2\u01e4"+
		"\u0161\3\2\2\2\u01e4\u0169\3\2\2\2\u01e4\u016f\3\2\2\2\u01e4\u0175\3\2"+
		"\2\2\u01e4\u017a\3\2\2\2\u01e4\u017f\3\2\2\2\u01e4\u0187\3\2\2\2\u01e4"+
		"\u0192\3\2\2\2\u01e4\u019c\3\2\2\2\u01e4\u01a6\3\2\2\2\u01e4\u01ae\3\2"+
		"\2\2\u01e4\u01b6\3\2\2\2\u01e4\u01bc\3\2\2\2\u01e4\u01c6\3\2\2\2\u01e4"+
		"\u01ce\3\2\2\2\u01e4\u01d6\3\2\2\2\u01e4\u01dd\3\2\2\2\u01e5\27\3\2\2"+
		"\2\u01e6\u01ea\5\32\16\2\u01e7\u01e9\5\34\17\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\5\36\20\2\u01ee\u01ed\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\36\2\2\u01f1\31\3\2\2"+
		"\2\u01f2\u01f3\7!\2\2\u01f3\u01f4\5\66\34\2\u01f4\u01f6\7#\2\2\u01f5\u01f7"+
		"\5\24\13\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f8\u01f9\3\2\2\2\u01f9\33\3\2\2\2\u01fa\u01fb\7\"\2\2\u01fb\u01fc"+
		"\5\66\34\2\u01fc\u01fe\7#\2\2\u01fd\u01ff\5\24\13\2\u01fe\u01fd\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\35"+
		"\3\2\2\2\u0202\u0204\7$\2\2\u0203\u0205\5\24\13\2\u0204\u0203\3\2\2\2"+
		"\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\37"+
		"\3\2\2\2\u0208\u0209\5\"\22\2\u0209\u020a\5$\23\2\u020a\u020b\5&\24\2"+
		"\u020b\u020c\5(\25\2\u020c\u020d\5*\26\2\u020d\u020e\7\36\2\2\u020e!\3"+
		"\2\2\2\u020f\u0211\7%\2\2\u0210\u0212\5\24\13\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214#\3\2\2\2"+
		"\u0215\u0218\7&\2\2\u0216\u0217\7>\2\2\u0217\u0219\7\6\2\2\u0218\u0216"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5\66\34\2"+
		"\u021b%\3\2\2\2\u021c\u021d\7\'\2\2\u021d\u021e\5\66\34\2\u021e\'\3\2"+
		"\2\2\u021f\u0221\7(\2\2\u0220\u0222\5\24\13\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224)\3\2\2\2"+
		"\u0225\u0228\7)\2\2\u0226\u0227\7>\2\2\u0227\u0229\7\6\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5<\37\2\u022b"+
		"+\3\2\2\2\u022c\u022f\5.\30\2\u022d\u022f\5\60\31\2\u022e\u022c\3\2\2"+
		"\2\u022e\u022d\3\2\2\2\u022f-\3\2\2\2\u0230\u0231\7>\2\2\u0231\u0232\7"+
		"\6\2\2\u0232\u024e\t\4\2\2\u0233\u0234\7>\2\2\u0234\u0235\7\6\2\2\u0235"+
		"\u0236\7\22\2\2\u0236\u0237\7\13\2\2\u0237\u0238\t\4\2\2\u0238\u024e\7"+
		"\f\2\2\u0239\u023a\7>\2\2\u023a\u023b\7\6\2\2\u023b\u023c\7\23\2\2\u023c"+
		"\u023d\7\13\2\2\u023d\u023e\7>\2\2\u023e\u023f\7\6\2\2\u023f\u0240\t\4"+
		"\2\2\u0240\u0241\7\4\2\2\u0241\u0242\7>\2\2\u0242\u0243\7\6\2\2\u0243"+
		"\u0244\t\4\2\2\u0244\u024e\7\f\2\2\u0245\u0246\7>\2\2\u0246\u0247\7\6"+
		"\2\2\u0247\u0248\7\23\2\2\u0248\u0249\7\13\2\2\u0249\u024a\t\4\2\2\u024a"+
		"\u024b\7\4\2\2\u024b\u024c\t\4\2\2\u024c\u024e\7\f\2\2\u024d\u0230\3\2"+
		"\2\2\u024d\u0233\3\2\2\2\u024d\u0239\3\2\2\2\u024d\u0245\3\2\2\2\u024e"+
		"/\3\2\2\2\u024f\u0250\7>\2\2\u0250\u0251\7\6\2\2\u0251\u0252\7\17\2\2"+
		"\u0252\u0253\7\63\2\2\u0253\u035c\5\66\34\2\u0254\u0255\7>\2\2\u0255\u0256"+
		"\7\6\2\2\u0256\u0257\t\5\2\2\u0257\u0258\7\63\2\2\u0258\u035c\5<\37\2"+
		"\u0259\u025a\7>\2\2\u025a\u025b\7\6\2\2\u025b\u025c\7\22\2\2\u025c\u025d"+
		"\7\13\2\2\u025d\u025e\7\17\2\2\u025e\u025f\7\f\2\2\u025f\u0260\7\63\2"+
		"\2\u0260\u0261\7\b\2\2\u0261\u0266\5\66\34\2\u0262\u0263\7\t\2\2\u0263"+
		"\u0265\5\66\34\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3"+
		"\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026a\7\n\2\2\u026a\u035c\3\2\2\2\u026b\u026c\7>\2\2\u026c\u026d\7\6"+
		"\2\2\u026d\u026e\7\22\2\2\u026e\u026f\7\13\2\2\u026f\u0270\7\20\2\2\u0270"+
		"\u0271\7\f\2\2\u0271\u0272\7\63\2\2\u0272\u0273\7\b\2\2\u0273\u0278\5"+
		"<\37\2\u0274\u0275\7\t\2\2\u0275\u0277\5<\37\2\u0276\u0274\3\2\2\2\u0277"+
		"\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7\n\2\2\u027c\u035c\3\2\2\2\u027d"+
		"\u027e\7>\2\2\u027e\u027f\7\6\2\2\u027f\u0280\7\22\2\2\u0280\u0281\7\13"+
		"\2\2\u0281\u0282\7\21\2\2\u0282\u0283\7\f\2\2\u0283\u0284\7\63\2\2\u0284"+
		"\u0285\7\b\2\2\u0285\u028a\5<\37\2\u0286\u0287\7\t\2\2\u0287\u0289\5<"+
		"\37\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\7\n"+
		"\2\2\u028e\u035c\3\2\2\2\u028f\u0290\7>\2\2\u0290\u0291\7\6\2\2\u0291"+
		"\u0292\7\23\2\2\u0292\u0293\7\13\2\2\u0293\u0294\7\17\2\2\u0294\u0295"+
		"\7\4\2\2\u0295\u0296\7\17\2\2\u0296\u0297\7\f\2\2\u0297\u0298\7\63\2\2"+
		"\u0298\u0299\7\13\2\2\u0299\u029a\5\66\34\2\u029a\u029b\7\4\2\2\u029b"+
		"\u029c\5\66\34\2\u029c\u029d\7\f\2\2\u029d\u035c\3\2\2\2\u029e\u029f\7"+
		">\2\2\u029f\u02a0\7\6\2\2\u02a0\u02a1\7\23\2\2\u02a1\u02a2\7\13\2\2\u02a2"+
		"\u02a3\7\17\2\2\u02a3\u02a4\7\4\2\2\u02a4\u02a5\t\5\2\2\u02a5\u02a6\7"+
		"\f\2\2\u02a6\u02a7\7\63\2\2\u02a7\u02a8\7\13\2\2\u02a8\u02a9\5\66\34\2"+
		"\u02a9\u02aa\7\4\2\2\u02aa\u02ab\5<\37\2\u02ab\u02ac\7\f\2\2\u02ac\u035c"+
		"\3\2\2\2\u02ad\u02ae\7>\2\2\u02ae\u02af\7\6\2\2\u02af\u02b0\7\23\2\2\u02b0"+
		"\u02b1\7\13\2\2\u02b1\u02b2\7\20\2\2\u02b2\u02b3\7\4\2\2\u02b3\u02b4\7"+
		"\17\2\2\u02b4\u02b5\7\f\2\2\u02b5\u02b6\7\63\2\2\u02b6\u02b7\7\13\2\2"+
		"\u02b7\u02b8\5<\37\2\u02b8\u02b9\7\4\2\2\u02b9\u02ba\5\66\34\2\u02ba\u02bb"+
		"\7\f\2\2\u02bb\u035c\3\2\2\2\u02bc\u02bd\7>\2\2\u02bd\u02be\7\6\2\2\u02be"+
		"\u02bf\7\23\2\2\u02bf\u02c0\7\13\2\2\u02c0\u02c1\7\20\2\2\u02c1\u02c2"+
		"\7\4\2\2\u02c2\u02c3\t\5\2\2\u02c3\u02c4\7\f\2\2\u02c4\u02c5\7\63\2\2"+
		"\u02c5\u02c6\7\13\2\2\u02c6\u02c7\5<\37\2\u02c7\u02c8\7\4\2\2\u02c8\u02c9"+
		"\5<\37\2\u02c9\u02ca\7\f\2\2\u02ca\u035c\3\2\2\2\u02cb\u02cc\7>\2\2\u02cc"+
		"\u02cd\7\6\2\2\u02cd\u02ce\7\23\2\2\u02ce\u02cf\7\13\2\2\u02cf\u02d0\7"+
		"\21\2\2\u02d0\u02d1\7\4\2\2\u02d1\u02d2\7\17\2\2\u02d2\u02d3\7\f\2\2\u02d3"+
		"\u02d4\7\63\2\2\u02d4\u02d5\7\13\2\2\u02d5\u02d6\5<\37\2\u02d6\u02d7\7"+
		"\4\2\2\u02d7\u02d8\5\66\34\2\u02d8\u02d9\7\f\2\2\u02d9\u035c\3\2\2\2\u02da"+
		"\u02db\7>\2\2\u02db\u02dc\7\6\2\2\u02dc\u02dd\7\23\2\2\u02dd\u02de\7\13"+
		"\2\2\u02de\u02df\7\21\2\2\u02df\u02e0\7\4\2\2\u02e0\u02e1\t\5\2\2\u02e1"+
		"\u02e2\7\f\2\2\u02e2\u02e3\7\63\2\2\u02e3\u02e4\7\13\2\2\u02e4\u02e5\5"+
		"<\37\2\u02e5\u02e6\7\4\2\2\u02e6\u02e7\5<\37\2\u02e7\u02e8\7\f\2\2\u02e8"+
		"\u035c\3\2\2\2\u02e9\u02ea\7>\2\2\u02ea\u02eb\7\6\2\2\u02eb\u02ec\7\23"+
		"\2\2\u02ec\u02ed\7\13\2\2\u02ed\u02ee\7>\2\2\u02ee\u02ef\7\6\2\2\u02ef"+
		"\u02f0\7\17\2\2\u02f0\u02f1\7\4\2\2\u02f1\u02f2\7>\2\2\u02f2\u02f3\7\6"+
		"\2\2\u02f3\u02f4\7\17\2\2\u02f4\u02f5\7\f\2\2\u02f5\u02f6\7\63\2\2\u02f6"+
		"\u02f7\7\13\2\2\u02f7\u02f8\5\66\34\2\u02f8\u02f9\7\4\2\2\u02f9\u02fa"+
		"\5\66\34\2\u02fa\u02fb\7\f\2\2\u02fb\u035c\3\2\2\2\u02fc\u02fd\7>\2\2"+
		"\u02fd\u02fe\7\6\2\2\u02fe\u02ff\7\23\2\2\u02ff\u0300\7\13\2\2\u0300\u0301"+
		"\7>\2\2\u0301\u0302\7\6\2\2\u0302\u0303\7\17\2\2\u0303\u0304\7\4\2\2\u0304"+
		"\u0305\7>\2\2\u0305\u0306\7\6\2\2\u0306\u0307\t\5\2\2\u0307\u0308\7\f"+
		"\2\2\u0308\u0309\7\63\2\2\u0309\u030a\7\13\2\2\u030a\u030b\5\66\34\2\u030b"+
		"\u030c\7\4\2\2\u030c\u030d\5<\37\2\u030d\u030e\7\f\2\2\u030e\u035c\3\2"+
		"\2\2\u030f\u0310\7>\2\2\u0310\u0311\7\6\2\2\u0311\u0312\7\23\2\2\u0312"+
		"\u0313\7\13\2\2\u0313\u0314\7>\2\2\u0314\u0315\7\6\2\2\u0315\u0316\7\20"+
		"\2\2\u0316\u0317\7\4\2\2\u0317\u0318\7>\2\2\u0318\u0319\7\6\2\2\u0319"+
		"\u031a\7\17\2\2\u031a\u031b\7\f\2\2\u031b\u031c\7\63\2\2\u031c\u031d\7"+
		"\13\2\2\u031d\u031e\5<\37\2\u031e\u031f\7\4\2\2\u031f\u0320\5\66\34\2"+
		"\u0320\u0321\7\f\2\2\u0321\u035c\3\2\2\2\u0322\u0323\7>\2\2\u0323\u0324"+
		"\7\6\2\2\u0324\u0325\7\23\2\2\u0325\u0326\7\13\2\2\u0326\u0327\7>\2\2"+
		"\u0327\u0328\7\6\2\2\u0328\u0329\7\20\2\2\u0329\u032a\7\4\2\2\u032a\u032b"+
		"\7>\2\2\u032b\u032c\7\6\2\2\u032c\u032d\t\5\2\2\u032d\u032e\7\f\2\2\u032e"+
		"\u032f\7\63\2\2\u032f\u0330\7\13\2\2\u0330\u0331\5<\37\2\u0331\u0332\7"+
		"\4\2\2\u0332\u0333\5<\37\2\u0333\u0334\7\f\2\2\u0334\u035c\3\2\2\2\u0335"+
		"\u0336\7>\2\2\u0336\u0337\7\6\2\2\u0337\u0338\7\23\2\2\u0338\u0339\7\13"+
		"\2\2\u0339\u033a\7>\2\2\u033a\u033b\7\6\2\2\u033b\u033c\7\21\2\2\u033c"+
		"\u033d\7\4\2\2\u033d\u033e\7>\2\2\u033e\u033f\7\6\2\2\u033f\u0340\7\17"+
		"\2\2\u0340\u0341\7\f\2\2\u0341\u0342\7\63\2\2\u0342\u0343\7\13\2\2\u0343"+
		"\u0344\5<\37\2\u0344\u0345\7\4\2\2\u0345\u0346\5\66\34\2\u0346\u0347\7"+
		"\f\2\2\u0347\u035c\3\2\2\2\u0348\u0349\7>\2\2\u0349\u034a\7\6\2\2\u034a"+
		"\u034b\7\23\2\2\u034b\u034c\7\13\2\2\u034c\u034d\7>\2\2\u034d\u034e\7"+
		"\6\2\2\u034e\u034f\7\21\2\2\u034f\u0350\7\4\2\2\u0350\u0351\7>\2\2\u0351"+
		"\u0352\7\6\2\2\u0352\u0353\t\5\2\2\u0353\u0354\7\f\2\2\u0354\u0355\7\63"+
		"\2\2\u0355\u0356\7\13\2\2\u0356\u0357\5<\37\2\u0357\u0358\7\4\2\2\u0358"+
		"\u0359\5<\37\2\u0359\u035a\7\f\2\2\u035a\u035c\3\2\2\2\u035b\u024f\3\2"+
		"\2\2\u035b\u0254\3\2\2\2\u035b\u0259\3\2\2\2\u035b\u026b\3\2\2\2\u035b"+
		"\u027d\3\2\2\2\u035b\u028f\3\2\2\2\u035b\u029e\3\2\2\2\u035b\u02ad\3\2"+
		"\2\2\u035b\u02bc\3\2\2\2\u035b\u02cb\3\2\2\2\u035b\u02da\3\2\2\2\u035b"+
		"\u02e9\3\2\2\2\u035b\u02fc\3\2\2\2\u035b\u030f\3\2\2\2\u035b\u0322\3\2"+
		"\2\2\u035b\u0335\3\2\2\2\u035b\u0348\3\2\2\2\u035c\61\3\2\2\2\u035d\u0374"+
		"\t\4\2\2\u035e\u035f\7\22\2\2\u035f\u0360\7\13\2\2\u0360\u0361\t\4\2\2"+
		"\u0361\u0374\7\f\2\2\u0362\u0363\7\23\2\2\u0363\u0364\7\13\2\2\u0364\u0365"+
		"\5\62\32\2\u0365\u0366\7\4\2\2\u0366\u0367\5\62\32\2\u0367\u0368\7\f\2"+
		"\2\u0368\u0374\3\2\2\2\u0369\u036a\7\23\2\2\u036a\u036b\7\13\2\2\u036b"+
		"\u036c\7>\2\2\u036c\u036d\7\6\2\2\u036d\u036e\t\4\2\2\u036e\u036f\7\4"+
		"\2\2\u036f\u0370\7>\2\2\u0370\u0371\7\6\2\2\u0371\u0372\t\4\2\2\u0372"+
		"\u0374\7\f\2\2\u0373\u035d\3\2\2\2\u0373\u035e\3\2\2\2\u0373\u0362\3\2"+
		"\2\2\u0373\u0369\3\2\2\2\u0374\63\3\2\2\2\u0375\u0378\5\66\34\2\u0376"+
		"\u0378\5<\37\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378\65\3\2\2"+
		"\2\u0379\u037a\b\34\1\2\u037a\u037b\7.\2\2\u037b\u03ba\5\66\34\30\u037c"+
		"\u037e\7*\2\2\u037d\u037f\58\35\2\u037e\u037d\3\2\2\2\u037f\u0380\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u0383\7\16\2\2\u0383\u0384\5\66\34\23\u0384\u03ba\3\2\2\2\u0385\u0387"+
		"\7+\2\2\u0386\u0388\58\35\2\u0387\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\7\16"+
		"\2\2\u038c\u038d\5\66\34\22\u038d\u03ba\3\2\2\2\u038e\u03ba\7>\2\2\u038f"+
		"\u0390\7>\2\2\u0390\u0391\7\13\2\2\u0391\u0392\5<\37\2\u0392\u0393\7\f"+
		"\2\2\u0393\u03ba\3\2\2\2\u0394\u0395\7\37\2\2\u0395\u03ba\7>\2\2\u0396"+
		"\u0397\7\37\2\2\u0397\u0398\7>\2\2\u0398\u0399\7\13\2\2\u0399\u039a\5"+
		"<\37\2\u039a\u039b\7\f\2\2\u039b\u03ba\3\2\2\2\u039c\u039d\7\37\2\2\u039d"+
		"\u039e\7>\2\2\u039e\u039f\7\r\2\2\u039f\u03ba\t\3\2\2\u03a0\u03ba\7 \2"+
		"\2\u03a1\u03a2\7 \2\2\u03a2\u03a3\7\13\2\2\u03a3\u03a4\5<\37\2\u03a4\u03a5"+
		"\7\f\2\2\u03a5\u03ba\3\2\2\2\u03a6\u03a7\7 \2\2\u03a7\u03a8\7\r\2\2\u03a8"+
		"\u03ba\t\3\2\2\u03a9\u03aa\7>\2\2\u03aa\u03ab\7\r\2\2\u03ab\u03ba\7\24"+
		"\2\2\u03ac\u03ad\7>\2\2\u03ad\u03ae\7\r\2\2\u03ae\u03ba\7\25\2\2\u03af"+
		"\u03b0\7>\2\2\u03b0\u03b1\7\r\2\2\u03b1\u03ba\7>\2\2\u03b2\u03ba\7,\2"+
		"\2\u03b3\u03ba\7-\2\2\u03b4\u03b5\7\3\2\2\u03b5\u03b6\5\66\34\2\u03b6"+
		"\u03b7\7\5\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03ba\5:\36\2\u03b9\u0379\3\2"+
		"\2\2\u03b9\u037c\3\2\2\2\u03b9\u0385\3\2\2\2\u03b9\u038e\3\2\2\2\u03b9"+
		"\u038f\3\2\2\2\u03b9\u0394\3\2\2\2\u03b9\u0396\3\2\2\2\u03b9\u039c\3\2"+
		"\2\2\u03b9\u03a0\3\2\2\2\u03b9\u03a1\3\2\2\2\u03b9\u03a6\3\2\2\2\u03b9"+
		"\u03a9\3\2\2\2\u03b9\u03ac\3\2\2\2\u03b9\u03af\3\2\2\2\u03b9\u03b2\3\2"+
		"\2\2\u03b9\u03b3\3\2\2\2\u03b9\u03b4\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba"+
		"\u03c9\3\2\2\2\u03bb\u03bc\f\27\2\2\u03bc\u03bd\7/\2\2\u03bd\u03c8\5\66"+
		"\34\30\u03be\u03bf\f\26\2\2\u03bf\u03c0\7\60\2\2\u03c0\u03c8\5\66\34\27"+
		"\u03c1\u03c2\f\25\2\2\u03c2\u03c3\7\61\2\2\u03c3\u03c8\5\66\34\26\u03c4"+
		"\u03c5\f\24\2\2\u03c5\u03c6\7\62\2\2\u03c6\u03c8\5\66\34\25\u03c7\u03bb"+
		"\3\2\2\2\u03c7\u03be\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c7\u03c4\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\67\3\2\2"+
		"\2\u03cb\u03c9\3\2\2\2\u03cc\u03d1\7>\2\2\u03cd\u03ce\7\t\2\2\u03ce\u03d0"+
		"\7>\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\7\6"+
		"\2\2\u03d5\u03d6\t\4\2\2\u03d6\u03d7\7\4\2\2\u03d79\3\2\2\2\u03d8\u03d9"+
		"\5<\37\2\u03d9\u03da\7\63\2\2\u03da\u03db\5<\37\2\u03db\u03ed\3\2\2\2"+
		"\u03dc\u03dd\5<\37\2\u03dd\u03de\7\64\2\2\u03de\u03df\5<\37\2\u03df\u03ed"+
		"\3\2\2\2\u03e0\u03e1\5<\37\2\u03e1\u03e2\7\65\2\2\u03e2\u03e3\5<\37\2"+
		"\u03e3\u03ed\3\2\2\2\u03e4\u03e5\5<\37\2\u03e5\u03e6\7\66\2\2\u03e6\u03e7"+
		"\5<\37\2\u03e7\u03ed\3\2\2\2\u03e8\u03e9\5<\37\2\u03e9\u03ea\7\67\2\2"+
		"\u03ea\u03eb\5<\37\2\u03eb\u03ed\3\2\2\2\u03ec\u03d8\3\2\2\2\u03ec\u03dc"+
		"\3\2\2\2\u03ec\u03e0\3\2\2\2\u03ec\u03e4\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ed"+
		";\3\2\2\2\u03ee\u03ef\b\37\1\2\u03ef\u0423\7>\2\2\u03f0\u03f1\7>\2\2\u03f1"+
		"\u03f2\7\13\2\2\u03f2\u03f3\5<\37\2\u03f3\u03f4\7\f\2\2\u03f4\u0423\3"+
		"\2\2\2\u03f5\u03f6\7\37\2\2\u03f6\u0423\7>\2\2\u03f7\u03f8\7\37\2\2\u03f8"+
		"\u03f9\7>\2\2\u03f9\u03fa\7\13\2\2\u03fa\u03fb\5<\37\2\u03fb\u03fc\7\f"+
		"\2\2\u03fc\u0423\3\2\2\2\u03fd\u03fe\7\37\2\2\u03fe\u03ff\7>\2\2\u03ff"+
		"\u0400\7\r\2\2\u0400\u0423\t\3\2\2\u0401\u0423\7 \2\2\u0402\u0403\7 \2"+
		"\2\u0403\u0404\7\13\2\2\u0404\u0405\5<\37\2\u0405\u0406\7\f\2\2\u0406"+
		"\u0423\3\2\2\2\u0407\u0408\7 \2\2\u0408\u0409\7\r\2\2\u0409\u0423\t\3"+
		"\2\2\u040a\u040b\7>\2\2\u040b\u040c\7\r\2\2\u040c\u0423\7\24\2\2\u040d"+
		"\u040e\7>\2\2\u040e\u040f\7\r\2\2\u040f\u0423\7\25\2\2\u0410\u0411\7>"+
		"\2\2\u0411\u0412\7\r\2\2\u0412\u0423\7>\2\2\u0413\u0423\7?\2\2\u0414\u0415"+
		"\7>\2\2\u0415\u0416\7\r\2\2\u0416\u0423\7\27\2\2\u0417\u0418\7>\2\2\u0418"+
		"\u0419\7\r\2\2\u0419\u0423\7\30\2\2\u041a\u041b\7>\2\2\u041b\u041c\7\r"+
		"\2\2\u041c\u0423\7\31\2\2\u041d\u0423\7@\2\2\u041e\u041f\7\3\2\2\u041f"+
		"\u0420\5<\37\2\u0420\u0421\7\5\2\2\u0421\u0423\3\2\2\2\u0422\u03ee\3\2"+
		"\2\2\u0422\u03f0\3\2\2\2\u0422\u03f5\3\2\2\2\u0422\u03f7\3\2\2\2\u0422"+
		"\u03fd\3\2\2\2\u0422\u0401\3\2\2\2\u0422\u0402\3\2\2\2\u0422\u0407\3\2"+
		"\2\2\u0422\u040a\3\2\2\2\u0422\u040d\3\2\2\2\u0422\u0410\3\2\2\2\u0422"+
		"\u0413\3\2\2\2\u0422\u0414\3\2\2\2\u0422\u0417\3\2\2\2\u0422\u041a\3\2"+
		"\2\2\u0422\u041d\3\2\2\2\u0422\u041e\3\2\2\2\u0423\u042c\3\2\2\2\u0424"+
		"\u0425\f\25\2\2\u0425\u0426\t\6\2\2\u0426\u042b\5<\37\26\u0427\u0428\f"+
		"\24\2\2\u0428\u0429\t\7\2\2\u0429\u042b\5<\37\25\u042a\u0424\3\2\2\2\u042a"+
		"\u0427\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2"+
		"\2\2\u042d=\3\2\2\2\u042e\u042c\3\2\2\28AJNWZ]`cilwz}\u0082\u0085\u008b"+
		"\u008e\u0096\u009c\u00a0\u00a8\u00ad\u00b7\u00ba\u00c6\u00c9\u01e4\u01ea"+
		"\u01ee\u01f8\u0200\u0206\u0213\u0218\u0223\u0228\u022e\u024d\u0266\u0278"+
		"\u028a\u035b\u0373\u0377\u0380\u0389\u03b9\u03c7\u03c9\u03d1\u03ec\u0422"+
		"\u042a\u042c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}