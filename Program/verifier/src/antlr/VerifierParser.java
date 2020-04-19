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
		RULE_initialDecl = 23, RULE_unnamedDecl = 24, RULE_boolExpr = 25, RULE_varDecl = 26, 
		RULE_relationalExpr = 27, RULE_arithmeticExpr = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "precondition", "postcondition", 
			"contract", "local", "implementation", "assignment", "alternation", "ifstat", 
			"elseifstat", "elsestat", "loop", "initImp", "invariantStat", "exitCondition", 
			"loopBody", "variantStat", "declaration", "uninitialDecl", "initialDecl", 
			"unnamedDecl", "boolExpr", "varDecl", "relationalExpr", "arithmeticExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "':'", "':='", "'<<'", "','", "'>>'", "'['", 
			"']'", "'|'", "'.'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", "'PAIR'", 
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				line();
				}
				}
				setState(61); 
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				declaration();
				}
				break;
			case 2:
				_localctx = new AssignDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				assignment();
				}
				break;
			case 3:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				method();
				}
				break;
			case 4:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(VERIFY);
				setState(67);
				boolExpr(0);
				}
				break;
			case 5:
				_localctx = new VerifyMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(VERIFY);
				setState(69);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
			setState(76);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(77);
				match(T__0);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(78);
					uninitialDecl();
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(79);
						match(T__1);
						setState(80);
						uninitialDecl();
						}
						}
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(88);
				match(T__2);
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(91);
				precondition();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(94);
				local();
				}
			}

			setState(97);
			match(DO);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				implementation();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(103);
				postcondition();
				}
			}

			setState(106);
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
			setState(108);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(109);
				match(T__0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(110);
					uninitialDecl();
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(111);
						match(T__1);
						setState(112);
						uninitialDecl();
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(120);
				match(T__2);
				}
			}

			setState(123);
			match(T__3);
			setState(124);
			unnamedDecl();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(125);
				precondition();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(128);
				local();
				}
			}

			setState(131);
			match(DO);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				implementation();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << FROM) | (1L << ID))) != 0) );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(137);
				postcondition();
				}
			}

			setState(140);
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
			setState(142);
			match(REQUIRE);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				contract();
				}
				}
				setState(146); 
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
			setState(148);
			match(ENSURE);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				contract();
				}
				}
				setState(152); 
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__3);
				}
				break;
			}
			setState(158);
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
			setState(160);
			match(LOCAL);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				declaration();
				}
				}
				setState(164); 
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESULT:
			case ID:
				_localctx = new ImpAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				assignment();
				}
				break;
			case IF:
				_localctx = new ImpAlternationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				alternation();
				}
				break;
			case FROM:
				_localctx = new ImpLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
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
	public static class SingleVarResultAssignContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public SingleVarResultAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterSingleVarResultAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitSingleVarResultAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitSingleVarResultAssign(this);
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
	public static class ArithArrayAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public ArithArrayAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArithArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArithArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArithArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
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
	public static class BoolArrayAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolArrayAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterBoolArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitBoolArrayAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitBoolArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySingleVarAssignContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArraySingleVarAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArraySingleVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArraySingleVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArraySingleVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayValueResultAssignContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public ArrayValueResultAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterArrayValueResultAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitArrayValueResultAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitArrayValueResultAssign(this);
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
	public static class SingleVarAssignContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(VerifierParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VerifierParser.ID, i);
		}
		public SingleVarAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterSingleVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitSingleVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitSingleVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__4);
				setState(173);
				match(ID);
				setState(174);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
				setState(176);
				match(T__4);
				setState(177);
				boolExpr(0);
				setState(178);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ArithAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__4);
				setState(182);
				arithmeticExpr(0);
				setState(183);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new BoolArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(ID);
				setState(186);
				match(T__4);
				setState(187);
				match(T__5);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << FORALL) | (1L << EXISTS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(188);
					boolExpr(0);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(189);
						match(T__6);
						setState(190);
						boolExpr(0);
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(198);
				match(T__7);
				setState(199);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ArithArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(ID);
				setState(201);
				match(T__4);
				setState(202);
				match(T__5);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(203);
					arithmeticExpr(0);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(204);
						match(T__6);
						setState(205);
						arithmeticExpr(0);
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(213);
				match(T__7);
				setState(214);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new ArraySingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(ID);
				setState(216);
				match(T__8);
				setState(217);
				arithmeticExpr(0);
				setState(218);
				match(T__9);
				setState(219);
				match(T__4);
				setState(220);
				match(ID);
				setState(221);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new BoolArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(ID);
				setState(224);
				match(T__8);
				setState(225);
				arithmeticExpr(0);
				setState(226);
				match(T__9);
				setState(227);
				match(T__4);
				setState(228);
				boolExpr(0);
				setState(229);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new ArithArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				match(ID);
				setState(232);
				match(T__8);
				setState(233);
				arithmeticExpr(0);
				setState(234);
				match(T__9);
				setState(235);
				match(T__4);
				setState(236);
				arithmeticExpr(0);
				setState(237);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new SingleVarResultAssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				match(RESULT);
				setState(240);
				match(T__4);
				setState(241);
				match(ID);
				setState(242);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new ArrayValueResultAssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				match(RESULT);
				setState(244);
				match(T__4);
				setState(245);
				match(ID);
				setState(246);
				match(T__8);
				setState(247);
				arithmeticExpr(0);
				setState(248);
				match(T__9);
				setState(249);
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
			setState(253);
			ifstat();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(254);
				elseifstat();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(260);
				elsestat();
				}
			}

			setState(263);
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
			setState(265);
			match(IF);
			setState(266);
			boolExpr(0);
			setState(267);
			match(THEN);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				implementation();
				}
				}
				setState(271); 
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
			setState(273);
			match(ELSEIF);
			setState(274);
			boolExpr(0);
			setState(275);
			match(THEN);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				implementation();
				}
				}
				setState(279); 
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
			setState(281);
			match(ELSE);
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				implementation();
				}
				}
				setState(285); 
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
			setState(287);
			initImp();
			setState(288);
			invariantStat();
			setState(289);
			exitCondition();
			setState(290);
			loopBody();
			setState(291);
			variantStat();
			setState(292);
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
			setState(294);
			match(FROM);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				implementation();
				}
				}
				setState(298); 
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
			setState(300);
			match(INVARIANT);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(301);
				match(ID);
				setState(302);
				match(T__3);
				}
				break;
			}
			setState(305);
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
			setState(307);
			match(UNTIL);
			setState(308);
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
			setState(310);
			match(LOOP);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				implementation();
				}
				}
				setState(314); 
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
			setState(316);
			match(VARIANT);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(317);
				match(ID);
				setState(318);
				match(T__3);
				}
				break;
			}
			setState(321);
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
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new UninitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				uninitialDecl();
				}
				break;
			case 2:
				_localctx = new InitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(ID);
				setState(328);
				match(T__3);
				setState(329);
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
				setState(330);
				match(ID);
				setState(331);
				match(T__3);
				setState(332);
				match(ARRAY);
				setState(333);
				match(T__8);
				setState(334);
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
				setState(335);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(ID);
				setState(337);
				match(T__3);
				setState(338);
				match(PAIR);
				setState(339);
				match(T__8);
				setState(340);
				match(ID);
				setState(341);
				match(T__3);
				setState(342);
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
				setState(343);
				match(T__1);
				setState(344);
				match(ID);
				setState(345);
				match(T__3);
				setState(346);
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
				setState(347);
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
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(ID);
				setState(351);
				match(T__3);
				setState(352);
				match(BOOL);
				setState(353);
				match(EQUAL);
				setState(354);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(ID);
				setState(356);
				match(T__3);
				setState(357);
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
				setState(358);
				match(EQUAL);
				setState(359);
				arithmeticExpr(0);
				}
				break;
			case 3:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(ID);
				setState(361);
				match(T__3);
				setState(362);
				match(ARRAY);
				setState(363);
				match(T__8);
				setState(364);
				match(BOOL);
				setState(365);
				match(T__9);
				setState(366);
				match(EQUAL);
				setState(367);
				match(T__5);
				setState(368);
				boolExpr(0);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(369);
					match(T__6);
					setState(370);
					boolExpr(0);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(ID);
				setState(379);
				match(T__3);
				setState(380);
				match(ARRAY);
				setState(381);
				match(T__8);
				setState(382);
				match(INT);
				setState(383);
				match(T__9);
				setState(384);
				match(EQUAL);
				setState(385);
				match(T__5);
				setState(386);
				arithmeticExpr(0);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(387);
					match(T__6);
					setState(388);
					arithmeticExpr(0);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(ID);
				setState(397);
				match(T__3);
				setState(398);
				match(ARRAY);
				setState(399);
				match(T__8);
				setState(400);
				match(REAL);
				setState(401);
				match(T__9);
				setState(402);
				match(EQUAL);
				setState(403);
				match(T__5);
				setState(404);
				arithmeticExpr(0);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(405);
					match(T__6);
					setState(406);
					arithmeticExpr(0);
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				match(ID);
				setState(415);
				match(T__3);
				setState(416);
				match(PAIR);
				setState(417);
				match(T__8);
				setState(418);
				match(BOOL);
				setState(419);
				match(T__1);
				setState(420);
				match(BOOL);
				setState(421);
				match(T__9);
				setState(422);
				match(EQUAL);
				setState(423);
				match(T__8);
				setState(424);
				boolExpr(0);
				setState(425);
				match(T__1);
				setState(426);
				boolExpr(0);
				setState(427);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				match(ID);
				setState(430);
				match(T__3);
				setState(431);
				match(PAIR);
				setState(432);
				match(T__8);
				setState(433);
				match(BOOL);
				setState(434);
				match(T__1);
				setState(435);
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
				setState(436);
				match(T__9);
				setState(437);
				match(EQUAL);
				setState(438);
				match(T__8);
				setState(439);
				boolExpr(0);
				setState(440);
				match(T__1);
				setState(441);
				arithmeticExpr(0);
				setState(442);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(444);
				match(ID);
				setState(445);
				match(T__3);
				setState(446);
				match(PAIR);
				setState(447);
				match(T__8);
				setState(448);
				match(INT);
				setState(449);
				match(T__1);
				setState(450);
				match(BOOL);
				setState(451);
				match(T__9);
				setState(452);
				match(EQUAL);
				setState(453);
				match(T__8);
				setState(454);
				arithmeticExpr(0);
				setState(455);
				match(T__1);
				setState(456);
				boolExpr(0);
				setState(457);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				match(ID);
				setState(460);
				match(T__3);
				setState(461);
				match(PAIR);
				setState(462);
				match(T__8);
				setState(463);
				match(INT);
				setState(464);
				match(T__1);
				setState(465);
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
				setState(466);
				match(T__9);
				setState(467);
				match(EQUAL);
				setState(468);
				match(T__8);
				setState(469);
				arithmeticExpr(0);
				setState(470);
				match(T__1);
				setState(471);
				arithmeticExpr(0);
				setState(472);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				match(ID);
				setState(475);
				match(T__3);
				setState(476);
				match(PAIR);
				setState(477);
				match(T__8);
				setState(478);
				match(REAL);
				setState(479);
				match(T__1);
				setState(480);
				match(BOOL);
				setState(481);
				match(T__9);
				setState(482);
				match(EQUAL);
				setState(483);
				match(T__8);
				setState(484);
				arithmeticExpr(0);
				setState(485);
				match(T__1);
				setState(486);
				boolExpr(0);
				setState(487);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(489);
				match(ID);
				setState(490);
				match(T__3);
				setState(491);
				match(PAIR);
				setState(492);
				match(T__8);
				setState(493);
				match(REAL);
				setState(494);
				match(T__1);
				setState(495);
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
				setState(496);
				match(T__9);
				setState(497);
				match(EQUAL);
				setState(498);
				match(T__8);
				setState(499);
				arithmeticExpr(0);
				setState(500);
				match(T__1);
				setState(501);
				arithmeticExpr(0);
				setState(502);
				match(T__9);
				}
				break;
			case 12:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(504);
				match(ID);
				setState(505);
				match(T__3);
				setState(506);
				match(PAIR);
				setState(507);
				match(T__8);
				setState(508);
				match(ID);
				setState(509);
				match(T__3);
				setState(510);
				match(BOOL);
				setState(511);
				match(T__1);
				setState(512);
				match(ID);
				setState(513);
				match(T__3);
				setState(514);
				match(BOOL);
				setState(515);
				match(T__9);
				setState(516);
				match(EQUAL);
				setState(517);
				match(T__8);
				setState(518);
				boolExpr(0);
				setState(519);
				match(T__1);
				setState(520);
				boolExpr(0);
				setState(521);
				match(T__9);
				}
				break;
			case 13:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(523);
				match(ID);
				setState(524);
				match(T__3);
				setState(525);
				match(PAIR);
				setState(526);
				match(T__8);
				setState(527);
				match(ID);
				setState(528);
				match(T__3);
				setState(529);
				match(BOOL);
				setState(530);
				match(T__1);
				setState(531);
				match(ID);
				setState(532);
				match(T__3);
				setState(533);
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
				setState(534);
				match(T__9);
				setState(535);
				match(EQUAL);
				setState(536);
				match(T__8);
				setState(537);
				boolExpr(0);
				setState(538);
				match(T__1);
				setState(539);
				arithmeticExpr(0);
				setState(540);
				match(T__9);
				}
				break;
			case 14:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(542);
				match(ID);
				setState(543);
				match(T__3);
				setState(544);
				match(PAIR);
				setState(545);
				match(T__8);
				setState(546);
				match(ID);
				setState(547);
				match(T__3);
				setState(548);
				match(INT);
				setState(549);
				match(T__1);
				setState(550);
				match(ID);
				setState(551);
				match(T__3);
				setState(552);
				match(BOOL);
				setState(553);
				match(T__9);
				setState(554);
				match(EQUAL);
				setState(555);
				match(T__8);
				setState(556);
				arithmeticExpr(0);
				setState(557);
				match(T__1);
				setState(558);
				boolExpr(0);
				setState(559);
				match(T__9);
				}
				break;
			case 15:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(561);
				match(ID);
				setState(562);
				match(T__3);
				setState(563);
				match(PAIR);
				setState(564);
				match(T__8);
				setState(565);
				match(ID);
				setState(566);
				match(T__3);
				setState(567);
				match(INT);
				setState(568);
				match(T__1);
				setState(569);
				match(ID);
				setState(570);
				match(T__3);
				setState(571);
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
				setState(572);
				match(T__9);
				setState(573);
				match(EQUAL);
				setState(574);
				match(T__8);
				setState(575);
				arithmeticExpr(0);
				setState(576);
				match(T__1);
				setState(577);
				arithmeticExpr(0);
				setState(578);
				match(T__9);
				}
				break;
			case 16:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(580);
				match(ID);
				setState(581);
				match(T__3);
				setState(582);
				match(PAIR);
				setState(583);
				match(T__8);
				setState(584);
				match(ID);
				setState(585);
				match(T__3);
				setState(586);
				match(REAL);
				setState(587);
				match(T__1);
				setState(588);
				match(ID);
				setState(589);
				match(T__3);
				setState(590);
				match(BOOL);
				setState(591);
				match(T__9);
				setState(592);
				match(EQUAL);
				setState(593);
				match(T__8);
				setState(594);
				arithmeticExpr(0);
				setState(595);
				match(T__1);
				setState(596);
				boolExpr(0);
				setState(597);
				match(T__9);
				}
				break;
			case 17:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(599);
				match(ID);
				setState(600);
				match(T__3);
				setState(601);
				match(PAIR);
				setState(602);
				match(T__8);
				setState(603);
				match(ID);
				setState(604);
				match(T__3);
				setState(605);
				match(REAL);
				setState(606);
				match(T__1);
				setState(607);
				match(ID);
				setState(608);
				match(T__3);
				setState(609);
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
				setState(610);
				match(T__9);
				setState(611);
				match(EQUAL);
				setState(612);
				match(T__8);
				setState(613);
				arithmeticExpr(0);
				setState(614);
				match(T__1);
				setState(615);
				arithmeticExpr(0);
				setState(616);
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
		public TerminalNode PAIR() { return getToken(VerifierParser.PAIR, 0); }
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
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
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new UnnamedSingleVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
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
				setState(621);
				match(ARRAY);
				setState(622);
				match(T__8);
				setState(623);
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
				setState(624);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(PAIR);
				setState(626);
				match(T__8);
				setState(627);
				unnamedDecl();
				setState(628);
				match(T__1);
				setState(629);
				unnamedDecl();
				setState(630);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new UnnamedPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				match(PAIR);
				setState(633);
				match(T__8);
				setState(634);
				uninitialDecl();
				setState(635);
				match(T__1);
				setState(636);
				uninitialDecl();
				setState(637);
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
	public static class OldBoolArrayContext extends BoolExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public OldBoolArrayContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldBoolArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldBoolArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldBoolArray(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(642);
				match(NOT);
				setState(643);
				boolExpr(20);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				match(FORALL);
				setState(646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(645);
					varDecl();
					}
					}
					setState(648); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(650);
				match(T__10);
				setState(651);
				boolExpr(15);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(653);
				match(EXISTS);
				setState(655); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(654);
					varDecl();
					}
					}
					setState(657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(659);
				match(T__10);
				setState(660);
				boolExpr(14);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(662);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663);
				match(ID);
				setState(664);
				match(T__8);
				setState(665);
				arithmeticExpr(0);
				setState(666);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new OldBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				match(OLD);
				setState(669);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new OldBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				match(OLD);
				setState(671);
				match(ID);
				setState(672);
				match(T__8);
				setState(673);
				arithmeticExpr(0);
				setState(674);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new BoolResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(676);
				match(RESULT);
				}
				break;
			case 9:
				{
				_localctx = new BoolArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(677);
				match(RESULT);
				setState(678);
				match(T__8);
				setState(679);
				arithmeticExpr(0);
				setState(680);
				match(T__9);
				}
				break;
			case 10:
				{
				_localctx = new BoolPairFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				match(ID);
				setState(683);
				match(T__11);
				setState(684);
				match(FIRST);
				}
				break;
			case 11:
				{
				_localctx = new BoolPairSecondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(685);
				match(ID);
				setState(686);
				match(T__11);
				setState(687);
				match(SECOND);
				}
				break;
			case 12:
				{
				_localctx = new BoolPairElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(ID);
				setState(689);
				match(T__11);
				setState(690);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(691);
				match(TRUE);
				}
				break;
			case 14:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(692);
				match(FALSE);
				}
				break;
			case 15:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(693);
				match(T__0);
				setState(694);
				boolExpr(0);
				setState(695);
				match(T__2);
				}
				break;
			case 16:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(697);
				relationalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(700);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(701);
						match(AND);
						setState(702);
						boolExpr(20);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(703);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(704);
						match(OR);
						setState(705);
						boolExpr(19);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(706);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(707);
						match(IMPLIES);
						setState(708);
						boolExpr(18);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(709);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(710);
						match(IFF);
						setState(711);
						boolExpr(17);
						}
						break;
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 52, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(ID);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(718);
				match(T__6);
				setState(719);
				match(ID);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(T__3);
			setState(726);
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
			setState(727);
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
		enterRule(_localctx, 54, RULE_relationalExpr);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				arithmeticExpr(0);
				setState(730);
				match(EQUAL);
				setState(731);
				arithmeticExpr(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				arithmeticExpr(0);
				setState(734);
				match(GREATERTHAN);
				setState(735);
				arithmeticExpr(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				arithmeticExpr(0);
				setState(738);
				match(LESSTHAN);
				setState(739);
				arithmeticExpr(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				arithmeticExpr(0);
				setState(742);
				match(GREATEROREQUAL);
				setState(743);
				arithmeticExpr(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				arithmeticExpr(0);
				setState(746);
				match(LESSOREQUAL);
				setState(747);
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
	public static class OldArithArrayContext extends ArithmeticExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public OldArithArrayContext(ArithmeticExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).enterOldArithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerifierListener ) ((VerifierListener)listener).exitOldArithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerifierVisitor ) return ((VerifierVisitor<? extends T>)visitor).visitOldArithArray(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_arithmeticExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(752);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(753);
				match(ID);
				setState(754);
				match(T__8);
				setState(755);
				arithmeticExpr(0);
				setState(756);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new OldArithVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(758);
				match(OLD);
				setState(759);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new OldArithArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(760);
				match(OLD);
				setState(761);
				match(ID);
				setState(762);
				match(T__8);
				setState(763);
				arithmeticExpr(0);
				setState(764);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new ArithResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(766);
				match(RESULT);
				}
				break;
			case 6:
				{
				_localctx = new ArithArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(767);
				match(RESULT);
				setState(768);
				match(T__8);
				setState(769);
				arithmeticExpr(0);
				setState(770);
				match(T__9);
				}
				break;
			case 7:
				{
				_localctx = new ArithPairFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(772);
				match(ID);
				setState(773);
				match(T__11);
				setState(774);
				match(FIRST);
				}
				break;
			case 8:
				{
				_localctx = new ArithPairSecondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(775);
				match(ID);
				setState(776);
				match(T__11);
				setState(777);
				match(SECOND);
				}
				break;
			case 9:
				{
				_localctx = new ArithPairElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(778);
				match(ID);
				setState(779);
				match(T__11);
				setState(780);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(781);
				match(INTNUM);
				}
				break;
			case 11:
				{
				_localctx = new CountArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(782);
				match(ID);
				setState(783);
				match(T__11);
				setState(784);
				match(COUNT);
				}
				break;
			case 12:
				{
				_localctx = new LowerArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(785);
				match(ID);
				setState(786);
				match(T__11);
				setState(787);
				match(LOWER);
				}
				break;
			case 13:
				{
				_localctx = new UpperArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(788);
				match(ID);
				setState(789);
				match(T__11);
				setState(790);
				match(UPPER);
				}
				break;
			case 14:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(791);
				match(REALNUM);
				}
				break;
			case 15:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(792);
				match(T__0);
				setState(793);
				arithmeticExpr(0);
				setState(794);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(804);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(798);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(799);
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
						setState(800);
						arithmeticExpr(18);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
						setState(801);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(802);
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
						setState(803);
						arithmeticExpr(17);
						}
						break;
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		case 25:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 28:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u032c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2>\n\2\r\2\16"+
		"\2?\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\5\4M\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\5\5Y\n\5\3\5\5\5\\\n\5\3\5\5\5_\n\5\3"+
		"\5\5\5b\n\5\3\5\3\5\6\5f\n\5\r\5\16\5g\3\5\5\5k\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\7\6t\n\6\f\6\16\6w\13\6\5\6y\n\6\3\6\5\6|\n\6\3\6\3\6\3\6\5"+
		"\6\u0081\n\6\3\6\5\6\u0084\n\6\3\6\3\6\6\6\u0088\n\6\r\6\16\6\u0089\3"+
		"\6\5\6\u008d\n\6\3\6\3\6\3\7\3\7\6\7\u0093\n\7\r\7\16\7\u0094\3\b\3\b"+
		"\6\b\u0099\n\b\r\b\16\b\u009a\3\t\3\t\5\t\u009f\n\t\3\t\3\t\3\n\3\n\6"+
		"\n\u00a5\n\n\r\n\16\n\u00a6\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00c2\n\f\f\f\16\f\u00c5\13\f\5\f\u00c7\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00d1\n\f\f\f\16\f\u00d4\13\f\5\f\u00d6\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00fe\n\f\3\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\r\5\r\u0108\n"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u0110\n\16\r\16\16\16\u0111\3\17\3"+
		"\17\3\17\3\17\6\17\u0118\n\17\r\17\16\17\u0119\3\20\3\20\6\20\u011e\n"+
		"\20\r\20\16\20\u011f\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22"+
		"\u012b\n\22\r\22\16\22\u012c\3\23\3\23\3\23\5\23\u0132\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\6\25\u013b\n\25\r\25\16\25\u013c\3\26\3\26\3"+
		"\26\5\26\u0142\n\26\3\26\3\26\3\27\3\27\5\27\u0148\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u015f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0176\n\31\f\31\16\31\u0179\13\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0188\n\31\f\31\16\31\u018b\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7"+
		"\31\u019a\n\31\f\31\16\31\u019d\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
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
		"\31\3\31\3\31\3\31\5\31\u026d\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0282"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\6\33\u0289\n\33\r\33\16\33\u028a\3\33\3"+
		"\33\3\33\3\33\3\33\6\33\u0292\n\33\r\33\16\33\u0293\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02bd\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u02cb\n\33\f\33\16\33\u02ce"+
		"\13\33\3\34\3\34\3\34\7\34\u02d3\n\34\f\34\16\34\u02d6\13\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02f0\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u031f\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0327\n\36\f\36\16"+
		"\36\u032a\13\36\3\36\2\4\64:\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\6\3\2\17\21\3\2\20\21\3\289\3\2:;\2\u0381\2"+
		"=\3\2\2\2\4H\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nn\3\2\2\2\f\u0090\3\2\2\2"+
		"\16\u0096\3\2\2\2\20\u009e\3\2\2\2\22\u00a2\3\2\2\2\24\u00ab\3\2\2\2\26"+
		"\u00fd\3\2\2\2\30\u00ff\3\2\2\2\32\u010b\3\2\2\2\34\u0113\3\2\2\2\36\u011b"+
		"\3\2\2\2 \u0121\3\2\2\2\"\u0128\3\2\2\2$\u012e\3\2\2\2&\u0135\3\2\2\2"+
		"(\u0138\3\2\2\2*\u013e\3\2\2\2,\u0147\3\2\2\2.\u015e\3\2\2\2\60\u026c"+
		"\3\2\2\2\62\u0281\3\2\2\2\64\u02bc\3\2\2\2\66\u02cf\3\2\2\28\u02ef\3\2"+
		"\2\2:\u031e\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\3\3\2\2\2AI\5,\27\2BI\5\26\f\2CI\5\6\4\2DE\7\26\2\2EI\5\64\33\2FG\7"+
		"\26\2\2GI\7>\2\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HF\3\2\2\2I\5"+
		"\3\2\2\2JM\5\b\5\2KM\5\n\6\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2N[\7>\2\2O"+
		"X\7\3\2\2PU\5.\30\2QR\7\4\2\2RT\5.\30\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XP\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\5\2"+
		"\2[O\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\f\7\2^]\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\7\35\2\2df\5\24\13\2e"+
		"d\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\16\b\2ji\3\2\2\2"+
		"jk\3\2\2\2kl\3\2\2\2lm\7\36\2\2m\t\3\2\2\2n{\7>\2\2ox\7\3\2\2pu\5.\30"+
		"\2qr\7\4\2\2rt\5.\30\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2xp\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\5\2\2{o\3\2\2\2{|\3\2\2"+
		"\2|}\3\2\2\2}~\7\6\2\2~\u0080\5\62\32\2\177\u0081\5\f\7\2\u0080\177\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\22\n\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\35"+
		"\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\16"+
		"\b\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\7\36\2\2\u008f\13\3\2\2\2\u0090\u0092\7\33\2\2\u0091\u0093\5\20"+
		"\t\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\r\3\2\2\2\u0096\u0098\7\34\2\2\u0097\u0099\5\20\t"+
		"\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009f\7\6\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\64"+
		"\33\2\u00a1\21\3\2\2\2\u00a2\u00a4\7\32\2\2\u00a3\u00a5\5,\27\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\23\3\2\2\2\u00a8\u00ac\5\26\f\2\u00a9\u00ac\5\30\r\2\u00aa"+
		"\u00ac\5 \21\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7\7\2\2\u00af\u00b0"+
		"\7>\2\2\u00b0\u00fe\7\4\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7\7\2\2\u00b3"+
		"\u00b4\5\64\33\2\u00b4\u00b5\7\4\2\2\u00b5\u00fe\3\2\2\2\u00b6\u00b7\7"+
		">\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\5:\36\2\u00b9\u00ba\7\4\2\2\u00ba"+
		"\u00fe\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00c6\7\b"+
		"\2\2\u00be\u00c3\5\64\33\2\u00bf\u00c0\7\t\2\2\u00c0\u00c2\5\64\33\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00fe\7\4"+
		"\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00d5\7\b\2\2\u00cd"+
		"\u00d2\5:\36\2\u00ce\u00cf\7\t\2\2\u00cf\u00d1\5:\36\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00fe\7\4\2\2\u00d9"+
		"\u00da\7>\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\5:\36\2\u00dc\u00dd\7\f"+
		"\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7\4\2\2\u00e0"+
		"\u00fe\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4\5:"+
		"\36\2\u00e4\u00e5\7\f\2\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\64\33\2\u00e7"+
		"\u00e8\7\4\2\2\u00e8\u00fe\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7\13"+
		"\2\2\u00eb\u00ec\5:\36\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\7\7\2\2\u00ee"+
		"\u00ef\5:\36\2\u00ef\u00f0\7\4\2\2\u00f0\u00fe\3\2\2\2\u00f1\u00f2\7 "+
		"\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7>\2\2\u00f4\u00fe\7\4\2\2\u00f5"+
		"\u00f6\7 \2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7\13"+
		"\2\2\u00f9\u00fa\5:\36\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\7\4\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ad\3\2\2\2\u00fd\u00b1\3\2\2\2\u00fd\u00b6\3\2"+
		"\2\2\u00fd\u00bb\3\2\2\2\u00fd\u00ca\3\2\2\2\u00fd\u00d9\3\2\2\2\u00fd"+
		"\u00e1\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f5\3\2"+
		"\2\2\u00fe\27\3\2\2\2\u00ff\u0103\5\32\16\2\u0100\u0102\5\34\17\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5\36\20\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\36"+
		"\2\2\u010a\31\3\2\2\2\u010b\u010c\7!\2\2\u010c\u010d\5\64\33\2\u010d\u010f"+
		"\7#\2\2\u010e\u0110\5\24\13\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\33\3\2\2\2\u0113\u0114"+
		"\7\"\2\2\u0114\u0115\5\64\33\2\u0115\u0117\7#\2\2\u0116\u0118\5\24\13"+
		"\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\35\3\2\2\2\u011b\u011d\7$\2\2\u011c\u011e\5\24\13\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\37\3\2\2\2\u0121\u0122\5\"\22\2\u0122\u0123\5$\23\2\u0123\u0124"+
		"\5&\24\2\u0124\u0125\5(\25\2\u0125\u0126\5*\26\2\u0126\u0127\7\36\2\2"+
		"\u0127!\3\2\2\2\u0128\u012a\7%\2\2\u0129\u012b\5\24\13\2\u012a\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"#\3\2\2\2\u012e\u0131\7&\2\2\u012f\u0130\7>\2\2\u0130\u0132\7\6\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\5\64"+
		"\33\2\u0134%\3\2\2\2\u0135\u0136\7\'\2\2\u0136\u0137\5\64\33\2\u0137\'"+
		"\3\2\2\2\u0138\u013a\7(\2\2\u0139\u013b\5\24\13\2\u013a\u0139\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d)\3"+
		"\2\2\2\u013e\u0141\7)\2\2\u013f\u0140\7>\2\2\u0140\u0142\7\6\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5:"+
		"\36\2\u0144+\3\2\2\2\u0145\u0148\5.\30\2\u0146\u0148\5\60\31\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0146\3\2\2\2\u0148-\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014b"+
		"\7\6\2\2\u014b\u015f\t\2\2\2\u014c\u014d\7>\2\2\u014d\u014e\7\6\2\2\u014e"+
		"\u014f\7\22\2\2\u014f\u0150\7\13\2\2\u0150\u0151\t\2\2\2\u0151\u015f\7"+
		"\f\2\2\u0152\u0153\7>\2\2\u0153\u0154\7\6\2\2\u0154\u0155\7\23\2\2\u0155"+
		"\u0156\7\13\2\2\u0156\u0157\7>\2\2\u0157\u0158\7\6\2\2\u0158\u0159\t\2"+
		"\2\2\u0159\u015a\7\4\2\2\u015a\u015b\7>\2\2\u015b\u015c\7\6\2\2\u015c"+
		"\u015d\t\2\2\2\u015d\u015f\7\f\2\2\u015e\u0149\3\2\2\2\u015e\u014c\3\2"+
		"\2\2\u015e\u0152\3\2\2\2\u015f/\3\2\2\2\u0160\u0161\7>\2\2\u0161\u0162"+
		"\7\6\2\2\u0162\u0163\7\17\2\2\u0163\u0164\7\63\2\2\u0164\u026d\5\64\33"+
		"\2\u0165\u0166\7>\2\2\u0166\u0167\7\6\2\2\u0167\u0168\t\3\2\2\u0168\u0169"+
		"\7\63\2\2\u0169\u026d\5:\36\2\u016a\u016b\7>\2\2\u016b\u016c\7\6\2\2\u016c"+
		"\u016d\7\22\2\2\u016d\u016e\7\13\2\2\u016e\u016f\7\17\2\2\u016f\u0170"+
		"\7\f\2\2\u0170\u0171\7\63\2\2\u0171\u0172\7\b\2\2\u0172\u0177\5\64\33"+
		"\2\u0173\u0174\7\t\2\2\u0174\u0176\5\64\33\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\n\2\2\u017b\u026d\3\2\2\2\u017c"+
		"\u017d\7>\2\2\u017d\u017e\7\6\2\2\u017e\u017f\7\22\2\2\u017f\u0180\7\13"+
		"\2\2\u0180\u0181\7\20\2\2\u0181\u0182\7\f\2\2\u0182\u0183\7\63\2\2\u0183"+
		"\u0184\7\b\2\2\u0184\u0189\5:\36\2\u0185\u0186\7\t\2\2\u0186\u0188\5:"+
		"\36\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\n"+
		"\2\2\u018d\u026d\3\2\2\2\u018e\u018f\7>\2\2\u018f\u0190\7\6\2\2\u0190"+
		"\u0191\7\22\2\2\u0191\u0192\7\13\2\2\u0192\u0193\7\21\2\2\u0193\u0194"+
		"\7\f\2\2\u0194\u0195\7\63\2\2\u0195\u0196\7\b\2\2\u0196\u019b\5:\36\2"+
		"\u0197\u0198\7\t\2\2\u0198\u019a\5:\36\2\u0199\u0197\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7\n\2\2\u019f\u026d\3\2\2\2\u01a0\u01a1\7>"+
		"\2\2\u01a1\u01a2\7\6\2\2\u01a2\u01a3\7\23\2\2\u01a3\u01a4\7\13\2\2\u01a4"+
		"\u01a5\7\17\2\2\u01a5\u01a6\7\4\2\2\u01a6\u01a7\7\17\2\2\u01a7\u01a8\7"+
		"\f\2\2\u01a8\u01a9\7\63\2\2\u01a9\u01aa\7\13\2\2\u01aa\u01ab\5\64\33\2"+
		"\u01ab\u01ac\7\4\2\2\u01ac\u01ad\5\64\33\2\u01ad\u01ae\7\f\2\2\u01ae\u026d"+
		"\3\2\2\2\u01af\u01b0\7>\2\2\u01b0\u01b1\7\6\2\2\u01b1\u01b2\7\23\2\2\u01b2"+
		"\u01b3\7\13\2\2\u01b3\u01b4\7\17\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01b6\t"+
		"\3\2\2\u01b6\u01b7\7\f\2\2\u01b7\u01b8\7\63\2\2\u01b8\u01b9\7\13\2\2\u01b9"+
		"\u01ba\5\64\33\2\u01ba\u01bb\7\4\2\2\u01bb\u01bc\5:\36\2\u01bc\u01bd\7"+
		"\f\2\2\u01bd\u026d\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0\7\6\2\2\u01c0"+
		"\u01c1\7\23\2\2\u01c1\u01c2\7\13\2\2\u01c2\u01c3\7\20\2\2\u01c3\u01c4"+
		"\7\4\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c6\7\f\2\2\u01c6\u01c7\7\63\2\2"+
		"\u01c7\u01c8\7\13\2\2\u01c8\u01c9\5:\36\2\u01c9\u01ca\7\4\2\2\u01ca\u01cb"+
		"\5\64\33\2\u01cb\u01cc\7\f\2\2\u01cc\u026d\3\2\2\2\u01cd\u01ce\7>\2\2"+
		"\u01ce\u01cf\7\6\2\2\u01cf\u01d0\7\23\2\2\u01d0\u01d1\7\13\2\2\u01d1\u01d2"+
		"\7\20\2\2\u01d2\u01d3\7\4\2\2\u01d3\u01d4\t\3\2\2\u01d4\u01d5\7\f\2\2"+
		"\u01d5\u01d6\7\63\2\2\u01d6\u01d7\7\13\2\2\u01d7\u01d8\5:\36\2\u01d8\u01d9"+
		"\7\4\2\2\u01d9\u01da\5:\36\2\u01da\u01db\7\f\2\2\u01db\u026d\3\2\2\2\u01dc"+
		"\u01dd\7>\2\2\u01dd\u01de\7\6\2\2\u01de\u01df\7\23\2\2\u01df\u01e0\7\13"+
		"\2\2\u01e0\u01e1\7\21\2\2\u01e1\u01e2\7\4\2\2\u01e2\u01e3\7\17\2\2\u01e3"+
		"\u01e4\7\f\2\2\u01e4\u01e5\7\63\2\2\u01e5\u01e6\7\13\2\2\u01e6\u01e7\5"+
		":\36\2\u01e7\u01e8\7\4\2\2\u01e8\u01e9\5\64\33\2\u01e9\u01ea\7\f\2\2\u01ea"+
		"\u026d\3\2\2\2\u01eb\u01ec\7>\2\2\u01ec\u01ed\7\6\2\2\u01ed\u01ee\7\23"+
		"\2\2\u01ee\u01ef\7\13\2\2\u01ef\u01f0\7\21\2\2\u01f0\u01f1\7\4\2\2\u01f1"+
		"\u01f2\t\3\2\2\u01f2\u01f3\7\f\2\2\u01f3\u01f4\7\63\2\2\u01f4\u01f5\7"+
		"\13\2\2\u01f5\u01f6\5:\36\2\u01f6\u01f7\7\4\2\2\u01f7\u01f8\5:\36\2\u01f8"+
		"\u01f9\7\f\2\2\u01f9\u026d\3\2\2\2\u01fa\u01fb\7>\2\2\u01fb\u01fc\7\6"+
		"\2\2\u01fc\u01fd\7\23\2\2\u01fd\u01fe\7\13\2\2\u01fe\u01ff\7>\2\2\u01ff"+
		"\u0200\7\6\2\2\u0200\u0201\7\17\2\2\u0201\u0202\7\4\2\2\u0202\u0203\7"+
		">\2\2\u0203\u0204\7\6\2\2\u0204\u0205\7\17\2\2\u0205\u0206\7\f\2\2\u0206"+
		"\u0207\7\63\2\2\u0207\u0208\7\13\2\2\u0208\u0209\5\64\33\2\u0209\u020a"+
		"\7\4\2\2\u020a\u020b\5\64\33\2\u020b\u020c\7\f\2\2\u020c\u026d\3\2\2\2"+
		"\u020d\u020e\7>\2\2\u020e\u020f\7\6\2\2\u020f\u0210\7\23\2\2\u0210\u0211"+
		"\7\13\2\2\u0211\u0212\7>\2\2\u0212\u0213\7\6\2\2\u0213\u0214\7\17\2\2"+
		"\u0214\u0215\7\4\2\2\u0215\u0216\7>\2\2\u0216\u0217\7\6\2\2\u0217\u0218"+
		"\t\3\2\2\u0218\u0219\7\f\2\2\u0219\u021a\7\63\2\2\u021a\u021b\7\13\2\2"+
		"\u021b\u021c\5\64\33\2\u021c\u021d\7\4\2\2\u021d\u021e\5:\36\2\u021e\u021f"+
		"\7\f\2\2\u021f\u026d\3\2\2\2\u0220\u0221\7>\2\2\u0221\u0222\7\6\2\2\u0222"+
		"\u0223\7\23\2\2\u0223\u0224\7\13\2\2\u0224\u0225\7>\2\2\u0225\u0226\7"+
		"\6\2\2\u0226\u0227\7\20\2\2\u0227\u0228\7\4\2\2\u0228\u0229\7>\2\2\u0229"+
		"\u022a\7\6\2\2\u022a\u022b\7\17\2\2\u022b\u022c\7\f\2\2\u022c\u022d\7"+
		"\63\2\2\u022d\u022e\7\13\2\2\u022e\u022f\5:\36\2\u022f\u0230\7\4\2\2\u0230"+
		"\u0231\5\64\33\2\u0231\u0232\7\f\2\2\u0232\u026d\3\2\2\2\u0233\u0234\7"+
		">\2\2\u0234\u0235\7\6\2\2\u0235\u0236\7\23\2\2\u0236\u0237\7\13\2\2\u0237"+
		"\u0238\7>\2\2\u0238\u0239\7\6\2\2\u0239\u023a\7\20\2\2\u023a\u023b\7\4"+
		"\2\2\u023b\u023c\7>\2\2\u023c\u023d\7\6\2\2\u023d\u023e\t\3\2\2\u023e"+
		"\u023f\7\f\2\2\u023f\u0240\7\63\2\2\u0240\u0241\7\13\2\2\u0241\u0242\5"+
		":\36\2\u0242\u0243\7\4\2\2\u0243\u0244\5:\36\2\u0244\u0245\7\f\2\2\u0245"+
		"\u026d\3\2\2\2\u0246\u0247\7>\2\2\u0247\u0248\7\6\2\2\u0248\u0249\7\23"+
		"\2\2\u0249\u024a\7\13\2\2\u024a\u024b\7>\2\2\u024b\u024c\7\6\2\2\u024c"+
		"\u024d\7\21\2\2\u024d\u024e\7\4\2\2\u024e\u024f\7>\2\2\u024f\u0250\7\6"+
		"\2\2\u0250\u0251\7\17\2\2\u0251\u0252\7\f\2\2\u0252\u0253\7\63\2\2\u0253"+
		"\u0254\7\13\2\2\u0254\u0255\5:\36\2\u0255\u0256\7\4\2\2\u0256\u0257\5"+
		"\64\33\2\u0257\u0258\7\f\2\2\u0258\u026d\3\2\2\2\u0259\u025a\7>\2\2\u025a"+
		"\u025b\7\6\2\2\u025b\u025c\7\23\2\2\u025c\u025d\7\13\2\2\u025d\u025e\7"+
		">\2\2\u025e\u025f\7\6\2\2\u025f\u0260\7\21\2\2\u0260\u0261\7\4\2\2\u0261"+
		"\u0262\7>\2\2\u0262\u0263\7\6\2\2\u0263\u0264\t\3\2\2\u0264\u0265\7\f"+
		"\2\2\u0265\u0266\7\63\2\2\u0266\u0267\7\13\2\2\u0267\u0268\5:\36\2\u0268"+
		"\u0269\7\4\2\2\u0269\u026a\5:\36\2\u026a\u026b\7\f\2\2\u026b\u026d\3\2"+
		"\2\2\u026c\u0160\3\2\2\2\u026c\u0165\3\2\2\2\u026c\u016a\3\2\2\2\u026c"+
		"\u017c\3\2\2\2\u026c\u018e\3\2\2\2\u026c\u01a0\3\2\2\2\u026c\u01af\3\2"+
		"\2\2\u026c\u01be\3\2\2\2\u026c\u01cd\3\2\2\2\u026c\u01dc\3\2\2\2\u026c"+
		"\u01eb\3\2\2\2\u026c\u01fa\3\2\2\2\u026c\u020d\3\2\2\2\u026c\u0220\3\2"+
		"\2\2\u026c\u0233\3\2\2\2\u026c\u0246\3\2\2\2\u026c\u0259\3\2\2\2\u026d"+
		"\61\3\2\2\2\u026e\u0282\t\2\2\2\u026f\u0270\7\22\2\2\u0270\u0271\7\13"+
		"\2\2\u0271\u0272\t\2\2\2\u0272\u0282\7\f\2\2\u0273\u0274\7\23\2\2\u0274"+
		"\u0275\7\13\2\2\u0275\u0276\5\62\32\2\u0276\u0277\7\4\2\2\u0277\u0278"+
		"\5\62\32\2\u0278\u0279\7\f\2\2\u0279\u0282\3\2\2\2\u027a\u027b\7\23\2"+
		"\2\u027b\u027c\7\13\2\2\u027c\u027d\5.\30\2\u027d\u027e\7\4\2\2\u027e"+
		"\u027f\5.\30\2\u027f\u0280\7\f\2\2\u0280\u0282\3\2\2\2\u0281\u026e\3\2"+
		"\2\2\u0281\u026f\3\2\2\2\u0281\u0273\3\2\2\2\u0281\u027a\3\2\2\2\u0282"+
		"\63\3\2\2\2\u0283\u0284\b\33\1\2\u0284\u0285\7.\2\2\u0285\u02bd\5\64\33"+
		"\26\u0286\u0288\7*\2\2\u0287\u0289\5\66\34\2\u0288\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\7\r\2\2\u028d\u028e\5\64\33\21\u028e\u02bd\3\2\2\2\u028f"+
		"\u0291\7+\2\2\u0290\u0292\5\66\34\2\u0291\u0290\3\2\2\2\u0292\u0293\3"+
		"\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0296\7\r\2\2\u0296\u0297\5\64\33\20\u0297\u02bd\3\2\2\2\u0298\u02bd"+
		"\7>\2\2\u0299\u029a\7>\2\2\u029a\u029b\7\13\2\2\u029b\u029c\5:\36\2\u029c"+
		"\u029d\7\f\2\2\u029d\u02bd\3\2\2\2\u029e\u029f\7\37\2\2\u029f\u02bd\7"+
		">\2\2\u02a0\u02a1\7\37\2\2\u02a1\u02a2\7>\2\2\u02a2\u02a3\7\13\2\2\u02a3"+
		"\u02a4\5:\36\2\u02a4\u02a5\7\f\2\2\u02a5\u02bd\3\2\2\2\u02a6\u02bd\7 "+
		"\2\2\u02a7\u02a8\7 \2\2\u02a8\u02a9\7\13\2\2\u02a9\u02aa\5:\36\2\u02aa"+
		"\u02ab\7\f\2\2\u02ab\u02bd\3\2\2\2\u02ac\u02ad\7>\2\2\u02ad\u02ae\7\16"+
		"\2\2\u02ae\u02bd\7\24\2\2\u02af\u02b0\7>\2\2\u02b0\u02b1\7\16\2\2\u02b1"+
		"\u02bd\7\25\2\2\u02b2\u02b3\7>\2\2\u02b3\u02b4\7\16\2\2\u02b4\u02bd\7"+
		">\2\2\u02b5\u02bd\7,\2\2\u02b6\u02bd\7-\2\2\u02b7\u02b8\7\3\2\2\u02b8"+
		"\u02b9\5\64\33\2\u02b9\u02ba\7\5\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02bd\5"+
		"8\35\2\u02bc\u0283\3\2\2\2\u02bc\u0286\3\2\2\2\u02bc\u028f\3\2\2\2\u02bc"+
		"\u0298\3\2\2\2\u02bc\u0299\3\2\2\2\u02bc\u029e\3\2\2\2\u02bc\u02a0\3\2"+
		"\2\2\u02bc\u02a6\3\2\2\2\u02bc\u02a7\3\2\2\2\u02bc\u02ac\3\2\2\2\u02bc"+
		"\u02af\3\2\2\2\u02bc\u02b2\3\2\2\2\u02bc\u02b5\3\2\2\2\u02bc\u02b6\3\2"+
		"\2\2\u02bc\u02b7\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02cc\3\2\2\2\u02be"+
		"\u02bf\f\25\2\2\u02bf\u02c0\7/\2\2\u02c0\u02cb\5\64\33\26\u02c1\u02c2"+
		"\f\24\2\2\u02c2\u02c3\7\60\2\2\u02c3\u02cb\5\64\33\25\u02c4\u02c5\f\23"+
		"\2\2\u02c5\u02c6\7\61\2\2\u02c6\u02cb\5\64\33\24\u02c7\u02c8\f\22\2\2"+
		"\u02c8\u02c9\7\62\2\2\u02c9\u02cb\5\64\33\23\u02ca\u02be\3\2\2\2\u02ca"+
		"\u02c1\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c7\3\2\2\2\u02cb\u02ce\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\65\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\u02d4\7>\2\2\u02d0\u02d1\7\t\2\2\u02d1\u02d3\7>\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\6\2\2\u02d8"+
		"\u02d9\t\2\2\2\u02d9\u02da\7\4\2\2\u02da\67\3\2\2\2\u02db\u02dc\5:\36"+
		"\2\u02dc\u02dd\7\63\2\2\u02dd\u02de\5:\36\2\u02de\u02f0\3\2\2\2\u02df"+
		"\u02e0\5:\36\2\u02e0\u02e1\7\64\2\2\u02e1\u02e2\5:\36\2\u02e2\u02f0\3"+
		"\2\2\2\u02e3\u02e4\5:\36\2\u02e4\u02e5\7\65\2\2\u02e5\u02e6\5:\36\2\u02e6"+
		"\u02f0\3\2\2\2\u02e7\u02e8\5:\36\2\u02e8\u02e9\7\66\2\2\u02e9\u02ea\5"+
		":\36\2\u02ea\u02f0\3\2\2\2\u02eb\u02ec\5:\36\2\u02ec\u02ed\7\67\2\2\u02ed"+
		"\u02ee\5:\36\2\u02ee\u02f0\3\2\2\2\u02ef\u02db\3\2\2\2\u02ef\u02df\3\2"+
		"\2\2\u02ef\u02e3\3\2\2\2\u02ef\u02e7\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0"+
		"9\3\2\2\2\u02f1\u02f2\b\36\1\2\u02f2\u031f\7>\2\2\u02f3\u02f4\7>\2\2\u02f4"+
		"\u02f5\7\13\2\2\u02f5\u02f6\5:\36\2\u02f6\u02f7\7\f\2\2\u02f7\u031f\3"+
		"\2\2\2\u02f8\u02f9\7\37\2\2\u02f9\u031f\7>\2\2\u02fa\u02fb\7\37\2\2\u02fb"+
		"\u02fc\7>\2\2\u02fc\u02fd\7\13\2\2\u02fd\u02fe\5:\36\2\u02fe\u02ff\7\f"+
		"\2\2\u02ff\u031f\3\2\2\2\u0300\u031f\7 \2\2\u0301\u0302\7 \2\2\u0302\u0303"+
		"\7\13\2\2\u0303\u0304\5:\36\2\u0304\u0305\7\f\2\2\u0305\u031f\3\2\2\2"+
		"\u0306\u0307\7>\2\2\u0307\u0308\7\16\2\2\u0308\u031f\7\24\2\2\u0309\u030a"+
		"\7>\2\2\u030a\u030b\7\16\2\2\u030b\u031f\7\25\2\2\u030c\u030d\7>\2\2\u030d"+
		"\u030e\7\16\2\2\u030e\u031f\7>\2\2\u030f\u031f\7?\2\2\u0310\u0311\7>\2"+
		"\2\u0311\u0312\7\16\2\2\u0312\u031f\7\27\2\2\u0313\u0314\7>\2\2\u0314"+
		"\u0315\7\16\2\2\u0315\u031f\7\30\2\2\u0316\u0317\7>\2\2\u0317\u0318\7"+
		"\16\2\2\u0318\u031f\7\31\2\2\u0319\u031f\7@\2\2\u031a\u031b\7\3\2\2\u031b"+
		"\u031c\5:\36\2\u031c\u031d\7\5\2\2\u031d\u031f\3\2\2\2\u031e\u02f1\3\2"+
		"\2\2\u031e\u02f3\3\2\2\2\u031e\u02f8\3\2\2\2\u031e\u02fa\3\2\2\2\u031e"+
		"\u0300\3\2\2\2\u031e\u0301\3\2\2\2\u031e\u0306\3\2\2\2\u031e\u0309\3\2"+
		"\2\2\u031e\u030c\3\2\2\2\u031e\u030f\3\2\2\2\u031e\u0310\3\2\2\2\u031e"+
		"\u0313\3\2\2\2\u031e\u0316\3\2\2\2\u031e\u0319\3\2\2\2\u031e\u031a\3\2"+
		"\2\2\u031f\u0328\3\2\2\2\u0320\u0321\f\23\2\2\u0321\u0322\t\4\2\2\u0322"+
		"\u0327\5:\36\24\u0323\u0324\f\22\2\2\u0324\u0325\t\5\2\2\u0325\u0327\5"+
		":\36\23\u0326\u0320\3\2\2\2\u0326\u0323\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329;\3\2\2\2\u032a\u0328\3\2\2\2"+
		"\67?HLUX[^agjux{\u0080\u0083\u0089\u008c\u0094\u009a\u009e\u00a6\u00ab"+
		"\u00c3\u00c6\u00d2\u00d5\u00fd\u0103\u0107\u0111\u0119\u011f\u012c\u0131"+
		"\u013c\u0141\u0147\u015e\u0177\u0189\u019b\u026c\u0281\u028a\u0293\u02bc"+
		"\u02ca\u02cc\u02d4\u02ef\u031e\u0326\u0328";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}