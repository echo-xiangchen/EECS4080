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
		VERIFY=18, COUNT=19, LOCAL=20, REQUIRE=21, ENSURE=22, DO=23, END=24, OLD=25, 
		RESULT=26, FORALL=27, EXISTS=28, TRUE=29, FALSE=30, NOT=31, AND=32, OR=33, 
		IMPLIES=34, IFF=35, EQUAL=36, GREATERTHAN=37, LESSTHAN=38, GREATEROREQUAL=39, 
		LESSOREQUAL=40, MUL=41, DIV=42, ADD=43, SUB=44, COMMENT=45, WS=46, ID=47, 
		INTNUM=48, REALNUM=49;
	public static final int
		RULE_stat = 0, RULE_line = 1, RULE_method = 2, RULE_mutator = 3, RULE_accessor = 4, 
		RULE_precondition = 5, RULE_postcondition = 6, RULE_contract = 7, RULE_local = 8, 
		RULE_implementation = 9, RULE_assignment = 10, RULE_declaration = 11, 
		RULE_uninitialDecl = 12, RULE_initialDecl = 13, RULE_unnamedDecl = 14, 
		RULE_boolExpr = 15, RULE_varDecl = 16, RULE_relation = 17, RULE_arithmetic = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "precondition", "postcondition", 
			"contract", "local", "implementation", "assignment", "declaration", "uninitialDecl", 
			"initialDecl", "unnamedDecl", "boolExpr", "varDecl", "relation", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "';'", "')'", "':'", "':='", "'['", "']'", "'<<'", "','", 
			"'>>'", "'|'", "'.'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'ARRAY'", 
			"'PAIR'", "'verify'", "'count'", "'local'", "'require'", "'ensure'", 
			"'do'", "'end'", "'old'", "'Result'", "'forall'", "'exists'", "'true'", 
			"'false'", "'not'", "'and'", "'or'", "'=>'", "'<=>'", "'='", "'>'", "'<'", 
			"'>='", "'<='", "'*'", "'/'", "'+'", "'-'"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				line();
				}
				}
				setState(41); 
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				declaration();
				}
				break;
			case 2:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				method();
				}
				break;
			case 3:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(VERIFY);
				setState(46);
				boolExpr(0);
				}
				break;
			case 4:
				_localctx = new VerifyMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(VERIFY);
				setState(48);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
		}
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
			setState(55);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(56);
				match(T__0);
				setState(57);
				uninitialDecl();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(58);
					match(T__1);
					setState(59);
					uninitialDecl();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(T__2);
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(69);
				precondition();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(72);
				local();
				}
			}

			setState(75);
			match(DO);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				implementation();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(81);
				postcondition();
				}
			}

			setState(84);
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
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
		}
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
			setState(86);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(87);
				match(T__0);
				setState(88);
				uninitialDecl();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(89);
					match(T__1);
					setState(90);
					uninitialDecl();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(T__2);
				}
			}

			setState(100);
			unnamedDecl();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(101);
				precondition();
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(104);
				local();
				}
			}

			setState(107);
			match(DO);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				implementation();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(113);
				postcondition();
				}
			}

			setState(116);
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
			setState(118);
			match(REQUIRE);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				contract();
				}
				}
				setState(122); 
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
			setState(124);
			match(ENSURE);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				contract();
				}
				}
				setState(128); 
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(130);
				match(ID);
				setState(131);
				match(T__3);
				}
				break;
			}
			setState(134);
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
			setState(136);
			match(LOCAL);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				declaration();
				}
				}
				setState(140); 
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
		enterRule(_localctx, 18, RULE_implementation);
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
	public static class ArithArrayAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
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
	public static class BoolArrayAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new SingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__4);
				setState(146);
				match(ID);
				setState(147);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__4);
				setState(150);
				boolExpr(0);
				setState(151);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ArithAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__4);
				setState(155);
				arithmetic(0);
				setState(156);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ArraySingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(ID);
				setState(159);
				match(T__5);
				setState(160);
				arithmetic(0);
				setState(161);
				match(T__6);
				setState(162);
				match(T__4);
				setState(163);
				match(ID);
				setState(164);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new BoolArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__5);
				setState(168);
				arithmetic(0);
				setState(169);
				match(T__6);
				setState(170);
				match(T__4);
				setState(171);
				boolExpr(0);
				}
				break;
			case 6:
				_localctx = new ArithArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(ID);
				setState(174);
				match(T__5);
				setState(175);
				arithmetic(0);
				setState(176);
				match(T__6);
				setState(177);
				match(T__4);
				setState(178);
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
		enterRule(_localctx, 22, RULE_declaration);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new UninitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				uninitialDecl();
				}
				break;
			case 2:
				_localctx = new InitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 24, RULE_uninitialDecl);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__3);
				setState(188);
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
				setState(189);
				match(ID);
				setState(190);
				match(T__3);
				setState(191);
				match(ARRAY);
				setState(192);
				match(T__5);
				setState(193);
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
				setState(194);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(ID);
				setState(196);
				match(T__3);
				setState(197);
				match(PAIR);
				setState(198);
				match(T__5);
				setState(199);
				match(ID);
				setState(200);
				match(T__3);
				setState(201);
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
				setState(202);
				match(T__1);
				setState(203);
				match(ID);
				setState(204);
				match(T__3);
				setState(205);
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
				setState(206);
				match(T__6);
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
		enterRule(_localctx, 26, RULE_initialDecl);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ID);
				setState(210);
				match(T__3);
				setState(211);
				match(BOOL);
				setState(212);
				match(EQUAL);
				setState(213);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(ID);
				setState(215);
				match(T__3);
				setState(216);
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
				setState(217);
				match(EQUAL);
				setState(218);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__3);
				setState(221);
				match(ARRAY);
				setState(222);
				match(T__5);
				setState(223);
				match(BOOL);
				setState(224);
				match(T__6);
				setState(225);
				match(EQUAL);
				setState(226);
				match(T__7);
				setState(227);
				boolExpr(0);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(228);
					match(T__8);
					setState(229);
					boolExpr(0);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__3);
				setState(239);
				match(ARRAY);
				setState(240);
				match(T__5);
				setState(241);
				match(INT);
				setState(242);
				match(T__6);
				setState(243);
				match(EQUAL);
				setState(244);
				match(T__7);
				setState(245);
				arithmetic(0);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(246);
					match(T__8);
					setState(247);
					arithmetic(0);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__9);
				}
				break;
			case 5:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(ID);
				setState(256);
				match(T__3);
				setState(257);
				match(ARRAY);
				setState(258);
				match(T__5);
				setState(259);
				match(REAL);
				setState(260);
				match(T__6);
				setState(261);
				match(EQUAL);
				setState(262);
				match(T__7);
				setState(263);
				arithmetic(0);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(264);
					match(T__8);
					setState(265);
					arithmetic(0);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(ID);
				setState(274);
				match(T__3);
				setState(275);
				match(PAIR);
				setState(276);
				match(T__5);
				setState(277);
				match(BOOL);
				setState(278);
				match(T__1);
				setState(279);
				match(BOOL);
				setState(280);
				match(T__6);
				setState(281);
				match(EQUAL);
				setState(282);
				match(T__5);
				setState(283);
				boolExpr(0);
				setState(284);
				match(T__1);
				setState(285);
				boolExpr(0);
				setState(286);
				match(T__6);
				}
				break;
			case 7:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(ID);
				setState(289);
				match(T__3);
				setState(290);
				match(PAIR);
				setState(291);
				match(T__5);
				setState(292);
				match(BOOL);
				setState(293);
				match(T__1);
				setState(294);
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
				setState(295);
				match(T__6);
				setState(296);
				match(EQUAL);
				setState(297);
				match(T__5);
				setState(298);
				boolExpr(0);
				setState(299);
				match(T__1);
				setState(300);
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
				setState(301);
				match(T__6);
				}
				break;
			case 8:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				match(ID);
				setState(304);
				match(T__3);
				setState(305);
				match(PAIR);
				setState(306);
				match(T__5);
				setState(307);
				match(INT);
				setState(308);
				match(T__1);
				setState(309);
				match(BOOL);
				setState(310);
				match(T__6);
				setState(311);
				match(EQUAL);
				setState(312);
				match(T__5);
				setState(313);
				match(INTNUM);
				setState(314);
				match(T__1);
				setState(315);
				boolExpr(0);
				setState(316);
				match(T__6);
				}
				break;
			case 9:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(318);
				match(ID);
				setState(319);
				match(T__3);
				setState(320);
				match(PAIR);
				setState(321);
				match(T__5);
				setState(322);
				match(INT);
				setState(323);
				match(T__1);
				setState(324);
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
				setState(325);
				match(T__6);
				setState(326);
				match(EQUAL);
				setState(327);
				match(T__5);
				setState(328);
				match(INTNUM);
				setState(329);
				match(T__1);
				setState(330);
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
				setState(331);
				match(T__6);
				}
				break;
			case 10:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(332);
				match(ID);
				setState(333);
				match(T__3);
				setState(334);
				match(PAIR);
				setState(335);
				match(T__5);
				setState(336);
				match(REAL);
				setState(337);
				match(T__1);
				setState(338);
				match(BOOL);
				setState(339);
				match(T__6);
				setState(340);
				match(EQUAL);
				setState(341);
				match(T__5);
				setState(342);
				match(REALNUM);
				setState(343);
				match(T__1);
				setState(344);
				boolExpr(0);
				setState(345);
				match(T__6);
				}
				break;
			case 11:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(347);
				match(ID);
				setState(348);
				match(T__3);
				setState(349);
				match(PAIR);
				setState(350);
				match(T__5);
				setState(351);
				match(REAL);
				setState(352);
				match(T__1);
				setState(353);
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
				setState(354);
				match(T__6);
				setState(355);
				match(EQUAL);
				setState(356);
				match(T__5);
				setState(357);
				match(REALNUM);
				setState(358);
				match(T__1);
				setState(359);
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
				setState(360);
				match(T__6);
				}
				break;
			case 12:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(361);
				match(ID);
				setState(362);
				match(T__3);
				setState(363);
				match(PAIR);
				setState(364);
				match(T__5);
				setState(365);
				match(ID);
				setState(366);
				match(T__3);
				setState(367);
				match(BOOL);
				setState(368);
				match(T__1);
				setState(369);
				match(ID);
				setState(370);
				match(T__3);
				setState(371);
				match(BOOL);
				setState(372);
				match(T__6);
				setState(373);
				match(EQUAL);
				setState(374);
				match(T__5);
				setState(375);
				boolExpr(0);
				setState(376);
				match(T__1);
				setState(377);
				boolExpr(0);
				setState(378);
				match(T__6);
				}
				break;
			case 13:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(380);
				match(ID);
				setState(381);
				match(T__3);
				setState(382);
				match(PAIR);
				setState(383);
				match(T__5);
				setState(384);
				match(ID);
				setState(385);
				match(T__3);
				setState(386);
				match(BOOL);
				setState(387);
				match(T__1);
				setState(388);
				match(ID);
				setState(389);
				match(T__3);
				setState(390);
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
				setState(391);
				match(T__6);
				setState(392);
				match(EQUAL);
				setState(393);
				match(T__5);
				setState(394);
				boolExpr(0);
				setState(395);
				match(T__1);
				setState(396);
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
				setState(397);
				match(T__6);
				}
				break;
			case 14:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(399);
				match(ID);
				setState(400);
				match(T__3);
				setState(401);
				match(PAIR);
				setState(402);
				match(T__5);
				setState(403);
				match(ID);
				setState(404);
				match(T__3);
				setState(405);
				match(INT);
				setState(406);
				match(T__1);
				setState(407);
				match(ID);
				setState(408);
				match(T__3);
				setState(409);
				match(BOOL);
				setState(410);
				match(T__6);
				setState(411);
				match(EQUAL);
				setState(412);
				match(T__5);
				setState(413);
				match(INTNUM);
				setState(414);
				match(T__1);
				setState(415);
				boolExpr(0);
				setState(416);
				match(T__6);
				}
				break;
			case 15:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(418);
				match(ID);
				setState(419);
				match(T__3);
				setState(420);
				match(PAIR);
				setState(421);
				match(T__5);
				setState(422);
				match(ID);
				setState(423);
				match(T__3);
				setState(424);
				match(INT);
				setState(425);
				match(T__1);
				setState(426);
				match(ID);
				setState(427);
				match(T__3);
				setState(428);
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
				setState(429);
				match(T__6);
				setState(430);
				match(EQUAL);
				setState(431);
				match(T__5);
				setState(432);
				match(INTNUM);
				setState(433);
				match(T__1);
				setState(434);
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
				setState(435);
				match(T__6);
				}
				break;
			case 16:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(436);
				match(ID);
				setState(437);
				match(T__3);
				setState(438);
				match(PAIR);
				setState(439);
				match(T__5);
				setState(440);
				match(ID);
				setState(441);
				match(T__3);
				setState(442);
				match(REAL);
				setState(443);
				match(T__1);
				setState(444);
				match(ID);
				setState(445);
				match(T__3);
				setState(446);
				match(BOOL);
				setState(447);
				match(T__6);
				setState(448);
				match(EQUAL);
				setState(449);
				match(T__5);
				setState(450);
				match(REALNUM);
				setState(451);
				match(T__1);
				setState(452);
				boolExpr(0);
				setState(453);
				match(T__6);
				}
				break;
			case 17:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(455);
				match(ID);
				setState(456);
				match(T__3);
				setState(457);
				match(PAIR);
				setState(458);
				match(T__5);
				setState(459);
				match(ID);
				setState(460);
				match(T__3);
				setState(461);
				match(REAL);
				setState(462);
				match(T__1);
				setState(463);
				match(ID);
				setState(464);
				match(T__3);
				setState(465);
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
				setState(466);
				match(T__6);
				setState(467);
				match(EQUAL);
				setState(468);
				match(T__5);
				setState(469);
				match(REALNUM);
				setState(470);
				match(T__1);
				setState(471);
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
				setState(472);
				match(T__6);
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
		public List<UninitialDeclContext> uninitialDecl() {
			return getRuleContexts(UninitialDeclContext.class);
		}
		public UninitialDeclContext uninitialDecl(int i) {
			return getRuleContext(UninitialDeclContext.class,i);
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
		public List<UnnamedDeclContext> unnamedDecl() {
			return getRuleContexts(UnnamedDeclContext.class);
		}
		public UnnamedDeclContext unnamedDecl(int i) {
			return getRuleContext(UnnamedDeclContext.class,i);
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
		enterRule(_localctx, 28, RULE_unnamedDecl);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new UnnamedSingleVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
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
				setState(476);
				match(ARRAY);
				setState(477);
				match(T__5);
				setState(478);
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
				setState(479);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new UnnamedPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				match(PAIR);
				setState(481);
				match(T__5);
				setState(482);
				unnamedDecl();
				setState(483);
				match(T__1);
				setState(484);
				unnamedDecl();
				setState(485);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(PAIR);
				setState(488);
				match(T__5);
				setState(489);
				uninitialDecl();
				setState(490);
				match(T__1);
				setState(491);
				uninitialDecl();
				setState(492);
				match(T__6);
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
	public static class OldBoolArrayContext extends BoolExprContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
	public static class BoolArrayResultContext extends BoolExprContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(497);
				match(NOT);
				setState(498);
				boolExpr(17);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(FORALL);
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(500);
					varDecl();
					}
					}
					setState(503); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(505);
				match(T__10);
				setState(506);
				boolExpr(12);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				match(EXISTS);
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(509);
					varDecl();
					}
					}
					setState(512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(514);
				match(T__10);
				setState(515);
				boolExpr(11);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(ID);
				setState(519);
				match(T__5);
				setState(520);
				arithmetic(0);
				setState(521);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new OldBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				match(OLD);
				setState(524);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new OldBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(525);
				match(OLD);
				setState(526);
				match(ID);
				setState(527);
				match(T__5);
				setState(528);
				arithmetic(0);
				setState(529);
				match(T__6);
				}
				break;
			case 8:
				{
				_localctx = new BoolResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(531);
				match(RESULT);
				}
				break;
			case 9:
				{
				_localctx = new BoolArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(532);
				match(RESULT);
				setState(533);
				match(T__5);
				setState(534);
				arithmetic(0);
				setState(535);
				match(T__6);
				}
				break;
			case 10:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(537);
				match(TRUE);
				}
				break;
			case 11:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(538);
				match(FALSE);
				}
				break;
			case 12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539);
				match(T__0);
				setState(540);
				boolExpr(0);
				setState(541);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				relation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(546);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(547);
						match(AND);
						setState(548);
						boolExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(549);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(550);
						match(OR);
						setState(551);
						boolExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(552);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(553);
						match(IMPLIES);
						setState(554);
						boolExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(555);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(556);
						match(IFF);
						setState(557);
						boolExpr(14);
						}
						break;
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 32, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(ID);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(564);
				match(T__8);
				setState(565);
				match(ID);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(T__3);
			setState(572);
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
			setState(573);
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
		enterRule(_localctx, 34, RULE_relation);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				arithmetic(0);
				setState(576);
				match(EQUAL);
				setState(577);
				arithmetic(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				arithmetic(0);
				setState(580);
				match(GREATERTHAN);
				setState(581);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				arithmetic(0);
				setState(584);
				match(LESSTHAN);
				setState(585);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				arithmetic(0);
				setState(588);
				match(GREATEROREQUAL);
				setState(589);
				arithmetic(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				arithmetic(0);
				setState(592);
				match(LESSOREQUAL);
				setState(593);
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
	public static class OldArithArrayContext extends ArithmeticContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public OldArithArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
	public static class ArithResultContext extends ArithmeticContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithResultContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
	public static class ArithArrayResultContext extends ArithmeticContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArithArrayResultContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
	public static class CountArrayContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode COUNT() { return getToken(VerifierParser.COUNT, 0); }
		public CountArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
	public static class OldArithVarContext extends ArithmeticContext {
		public TerminalNode OLD() { return getToken(VerifierParser.OLD, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public OldArithVarContext(ArithmeticContext ctx) { copyFrom(ctx); }
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

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(598);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(599);
				match(ID);
				setState(600);
				match(T__5);
				setState(601);
				arithmetic(0);
				setState(602);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new OldArithVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(604);
				match(OLD);
				setState(605);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new OldArithArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				match(OLD);
				setState(607);
				match(ID);
				setState(608);
				match(T__5);
				setState(609);
				arithmetic(0);
				setState(610);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new ArithResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				match(RESULT);
				}
				break;
			case 6:
				{
				_localctx = new ArithArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				match(RESULT);
				setState(614);
				match(T__5);
				setState(615);
				arithmetic(0);
				setState(616);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				match(INTNUM);
				}
				break;
			case 8:
				{
				_localctx = new CountArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				match(ID);
				setState(620);
				match(T__11);
				setState(621);
				match(COUNT);
				}
				break;
			case 9:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(622);
				match(REALNUM);
				}
				break;
			case 10:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(623);
				match(T__0);
				setState(624);
				arithmetic(0);
				setState(625);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(629);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(630);
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
						setState(631);
						arithmetic(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(632);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(633);
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
						setState(634);
						arithmetic(12);
						}
						break;
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		case 15:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 18:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0283\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5"+
		"\3\5\3\5\5\5F\n\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\3\5\6\5P\n\5\r\5\16\5"+
		"Q\3\5\5\5U\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6"+
		"\3\6\5\6e\n\6\3\6\3\6\5\6i\n\6\3\6\5\6l\n\6\3\6\3\6\6\6p\n\6\r\6\16\6"+
		"q\3\6\5\6u\n\6\3\6\3\6\3\7\3\7\6\7{\n\7\r\7\16\7|\3\b\3\b\6\b\u0081\n"+
		"\b\r\b\16\b\u0082\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\n\3\n\6\n\u008d\n\n"+
		"\r\n\16\n\u008e\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\r\3\r\5\r\u00bb\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00e9\n\17\f\17\16\17\u00ec\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fb\n\17\f\17\16"+
		"\17\u00fe\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u010d\n\17\f\17\16\17\u0110\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01dc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01f1\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\6\21\u01f8\n\21\r\21\16\21\u01f9\3\21\3\21\3\21\3"+
		"\21\3\21\6\21\u0201\n\21\r\21\16\21\u0202\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0223\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0231\n\21"+
		"\f\21\16\21\u0234\13\21\3\22\3\22\3\22\7\22\u0239\n\22\f\22\16\22\u023c"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0256\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0276\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u027e\n"+
		"\24\f\24\16\24\u0281\13\24\3\24\2\4 &\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\7\3\2\17\21\3\2\20\21\3\2\62\63\3\2+,\3\2-.\2\u02c4\2"+
		")\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nX\3\2\2\2\fx\3\2\2\2\16"+
		"~\3\2\2\2\20\u0086\3\2\2\2\22\u008a\3\2\2\2\24\u0090\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00ba\3\2\2\2\32\u00d1\3\2\2\2\34\u01db\3\2\2\2\36\u01f0\3"+
		"\2\2\2 \u0222\3\2\2\2\"\u0235\3\2\2\2$\u0255\3\2\2\2&\u0275\3\2\2\2(*"+
		"\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\64\5\30\r"+
		"\2.\64\5\6\4\2/\60\7\24\2\2\60\64\5 \21\2\61\62\7\24\2\2\62\64\7\61\2"+
		"\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\61\3\2\2\2\64\5\3\2\2\2\658"+
		"\5\b\5\2\668\5\n\6\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29E\7\61\2\2"+
		":;\7\3\2\2;@\5\32\16\2<=\7\4\2\2=?\5\32\16\2><\3\2\2\2?B\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\5\2\2DF\3\2\2\2E:\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GI\5\f\7\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\22\n\2KJ\3"+
		"\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\31\2\2NP\5\24\13\2ON\3\2\2\2PQ\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\5\16\b\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2VW\7\32\2\2W\t\3\2\2\2Xd\7\61\2\2YZ\7\3\2\2Z_\5\32\16\2[\\\7\4\2\2\\"+
		"^\5\32\16\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2"+
		"\2bc\7\5\2\2ce\3\2\2\2dY\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\5\36\20\2gi\5\f"+
		"\7\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\5\22\n\2kj\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mo\7\31\2\2np\5\24\13\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2su\5\16\b\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\32\2\2w\13\3\2"+
		"\2\2xz\7\27\2\2y{\5\20\t\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r"+
		"\3\2\2\2~\u0080\7\30\2\2\177\u0081\5\20\t\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084"+
		"\u0085\7\61\2\2\u0085\u0087\7\6\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5 \21\2\u0089\21\3\2\2\2\u008a"+
		"\u008c\7\26\2\2\u008b\u008d\5\30\r\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\25\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7\7"+
		"\2\2\u0094\u0095\7\61\2\2\u0095\u00b7\7\4\2\2\u0096\u0097\7\61\2\2\u0097"+
		"\u0098\7\7\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\4\2\2\u009a\u00b7\3\2"+
		"\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5&\24\2\u009e"+
		"\u009f\7\4\2\2\u009f\u00b7\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7"+
		"\b\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\7\7\2\2\u00a5"+
		"\u00a6\7\61\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\7"+
		"\61\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7\t\2\2\u00ac"+
		"\u00ad\7\7\2\2\u00ad\u00ae\5 \21\2\u00ae\u00b7\3\2\2\2\u00af\u00b0\7\61"+
		"\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b4\7\7\2\2\u00b4\u00b5\5&\24\2\u00b5\u00b7\3\2\2\2\u00b6\u0092\3\2"+
		"\2\2\u00b6\u0096\3\2\2\2\u00b6\u009b\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6"+
		"\u00a8\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\27\3\2\2\2\u00b8\u00bb\5\32\16"+
		"\2\u00b9\u00bb\5\34\17\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\7\6\2\2\u00be\u00d2\t\2\2"+
		"\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\22\2\2\u00c2"+
		"\u00c3\7\b\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00d2\7\t\2\2\u00c5\u00c6\7\61"+
		"\2\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7\b\2\2\u00c9"+
		"\u00ca\7\61\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\7"+
		"\4\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7\6\2\2\u00cf\u00d0\t\2\2\2\u00d0"+
		"\u00d2\7\t\2\2\u00d1\u00bc\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c5\3\2"+
		"\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6"+
		"\7\17\2\2\u00d6\u00d7\7&\2\2\u00d7\u01dc\5 \21\2\u00d8\u00d9\7\61\2\2"+
		"\u00d9\u00da\7\6\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\7&\2\2\u00dc\u01dc"+
		"\5&\24\2\u00dd\u00de\7\61\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\7\22\2\2"+
		"\u00e0\u00e1\7\b\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4"+
		"\7&\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00ea\5 \21\2\u00e6\u00e7\7\13\2\2\u00e7"+
		"\u00e9\5 \21\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u01dc\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7"+
		"\6\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\7\b\2\2\u00f3\u00f4\7\20\2\2\u00f4"+
		"\u00f5\7\t\2\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7\n\2\2\u00f7\u00fc\5&\24"+
		"\2\u00f8\u00f9\7\13\2\2\u00f9\u00fb\5&\24\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u01dc\3\2\2\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0103\7\6\2\2\u0103\u0104\7\22\2\2\u0104\u0105\7"+
		"\b\2\2\u0105\u0106\7\21\2\2\u0106\u0107\7\t\2\2\u0107\u0108\7&\2\2\u0108"+
		"\u0109\7\n\2\2\u0109\u010e\5&\24\2\u010a\u010b\7\13\2\2\u010b\u010d\5"+
		"&\24\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\f"+
		"\2\2\u0112\u01dc\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\7\6\2\2\u0115"+
		"\u0116\7\23\2\2\u0116\u0117\7\b\2\2\u0117\u0118\7\17\2\2\u0118\u0119\7"+
		"\4\2\2\u0119\u011a\7\17\2\2\u011a\u011b\7\t\2\2\u011b\u011c\7&\2\2\u011c"+
		"\u011d\7\b\2\2\u011d\u011e\5 \21\2\u011e\u011f\7\4\2\2\u011f\u0120\5 "+
		"\21\2\u0120\u0121\7\t\2\2\u0121\u01dc\3\2\2\2\u0122\u0123\7\61\2\2\u0123"+
		"\u0124\7\6\2\2\u0124\u0125\7\23\2\2\u0125\u0126\7\b\2\2\u0126\u0127\7"+
		"\17\2\2\u0127\u0128\7\4\2\2\u0128\u0129\t\3\2\2\u0129\u012a\7\t\2\2\u012a"+
		"\u012b\7&\2\2\u012b\u012c\7\b\2\2\u012c\u012d\5 \21\2\u012d\u012e\7\4"+
		"\2\2\u012e\u012f\t\4\2\2\u012f\u0130\7\t\2\2\u0130\u01dc\3\2\2\2\u0131"+
		"\u0132\7\61\2\2\u0132\u0133\7\6\2\2\u0133\u0134\7\23\2\2\u0134\u0135\7"+
		"\b\2\2\u0135\u0136\7\20\2\2\u0136\u0137\7\4\2\2\u0137\u0138\7\17\2\2\u0138"+
		"\u0139\7\t\2\2\u0139\u013a\7&\2\2\u013a\u013b\7\b\2\2\u013b\u013c\7\62"+
		"\2\2\u013c\u013d\7\4\2\2\u013d\u013e\5 \21\2\u013e\u013f\7\t\2\2\u013f"+
		"\u01dc\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7\6\2\2\u0142\u0143\7"+
		"\23\2\2\u0143\u0144\7\b\2\2\u0144\u0145\7\20\2\2\u0145\u0146\7\4\2\2\u0146"+
		"\u0147\t\3\2\2\u0147\u0148\7\t\2\2\u0148\u0149\7&\2\2\u0149\u014a\7\b"+
		"\2\2\u014a\u014b\7\62\2\2\u014b\u014c\7\4\2\2\u014c\u014d\t\4\2\2\u014d"+
		"\u01dc\7\t\2\2\u014e\u014f\7\61\2\2\u014f\u0150\7\6\2\2\u0150\u0151\7"+
		"\23\2\2\u0151\u0152\7\b\2\2\u0152\u0153\7\21\2\2\u0153\u0154\7\4\2\2\u0154"+
		"\u0155\7\17\2\2\u0155\u0156\7\t\2\2\u0156\u0157\7&\2\2\u0157\u0158\7\b"+
		"\2\2\u0158\u0159\7\63\2\2\u0159\u015a\7\4\2\2\u015a\u015b\5 \21\2\u015b"+
		"\u015c\7\t\2\2\u015c\u01dc\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7"+
		"\6\2\2\u015f\u0160\7\23\2\2\u0160\u0161\7\b\2\2\u0161\u0162\7\21\2\2\u0162"+
		"\u0163\7\4\2\2\u0163\u0164\t\3\2\2\u0164\u0165\7\t\2\2\u0165\u0166\7&"+
		"\2\2\u0166\u0167\7\b\2\2\u0167\u0168\7\63\2\2\u0168\u0169\7\4\2\2\u0169"+
		"\u016a\t\4\2\2\u016a\u01dc\7\t\2\2\u016b\u016c\7\61\2\2\u016c\u016d\7"+
		"\6\2\2\u016d\u016e\7\23\2\2\u016e\u016f\7\b\2\2\u016f\u0170\7\61\2\2\u0170"+
		"\u0171\7\6\2\2\u0171\u0172\7\17\2\2\u0172\u0173\7\4\2\2\u0173\u0174\7"+
		"\61\2\2\u0174\u0175\7\6\2\2\u0175\u0176\7\17\2\2\u0176\u0177\7\t\2\2\u0177"+
		"\u0178\7&\2\2\u0178\u0179\7\b\2\2\u0179\u017a\5 \21\2\u017a\u017b\7\4"+
		"\2\2\u017b\u017c\5 \21\2\u017c\u017d\7\t\2\2\u017d\u01dc\3\2\2\2\u017e"+
		"\u017f\7\61\2\2\u017f\u0180\7\6\2\2\u0180\u0181\7\23\2\2\u0181\u0182\7"+
		"\b\2\2\u0182\u0183\7\61\2\2\u0183\u0184\7\6\2\2\u0184\u0185\7\17\2\2\u0185"+
		"\u0186\7\4\2\2\u0186\u0187\7\61\2\2\u0187\u0188\7\6\2\2\u0188\u0189\t"+
		"\3\2\2\u0189\u018a\7\t\2\2\u018a\u018b\7&\2\2\u018b\u018c\7\b\2\2\u018c"+
		"\u018d\5 \21\2\u018d\u018e\7\4\2\2\u018e\u018f\t\4\2\2\u018f\u0190\7\t"+
		"\2\2\u0190\u01dc\3\2\2\2\u0191\u0192\7\61\2\2\u0192\u0193\7\6\2\2\u0193"+
		"\u0194\7\23\2\2\u0194\u0195\7\b\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7"+
		"\6\2\2\u0197\u0198\7\20\2\2\u0198\u0199\7\4\2\2\u0199\u019a\7\61\2\2\u019a"+
		"\u019b\7\6\2\2\u019b\u019c\7\17\2\2\u019c\u019d\7\t\2\2\u019d\u019e\7"+
		"&\2\2\u019e\u019f\7\b\2\2\u019f\u01a0\7\62\2\2\u01a0\u01a1\7\4\2\2\u01a1"+
		"\u01a2\5 \21\2\u01a2\u01a3\7\t\2\2\u01a3\u01dc\3\2\2\2\u01a4\u01a5\7\61"+
		"\2\2\u01a5\u01a6\7\6\2\2\u01a6\u01a7\7\23\2\2\u01a7\u01a8\7\b\2\2\u01a8"+
		"\u01a9\7\61\2\2\u01a9\u01aa\7\6\2\2\u01aa\u01ab\7\20\2\2\u01ab\u01ac\7"+
		"\4\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\7\6\2\2\u01ae\u01af\t\3\2\2\u01af"+
		"\u01b0\7\t\2\2\u01b0\u01b1\7&\2\2\u01b1\u01b2\7\b\2\2\u01b2\u01b3\7\62"+
		"\2\2\u01b3\u01b4\7\4\2\2\u01b4\u01b5\t\4\2\2\u01b5\u01dc\7\t\2\2\u01b6"+
		"\u01b7\7\61\2\2\u01b7\u01b8\7\6\2\2\u01b8\u01b9\7\23\2\2\u01b9\u01ba\7"+
		"\b\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bc\7\6\2\2\u01bc\u01bd\7\21\2\2\u01bd"+
		"\u01be\7\4\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7\6\2\2\u01c0\u01c1\7"+
		"\17\2\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\7&\2\2\u01c3\u01c4\7\b\2\2\u01c4"+
		"\u01c5\7\63\2\2\u01c5\u01c6\7\4\2\2\u01c6\u01c7\5 \21\2\u01c7\u01c8\7"+
		"\t\2\2\u01c8\u01dc\3\2\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\7\6\2\2\u01cb"+
		"\u01cc\7\23\2\2\u01cc\u01cd\7\b\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf\7"+
		"\6\2\2\u01cf\u01d0\7\21\2\2\u01d0\u01d1\7\4\2\2\u01d1\u01d2\7\61\2\2\u01d2"+
		"\u01d3\7\6\2\2\u01d3\u01d4\t\3\2\2\u01d4\u01d5\7\t\2\2\u01d5\u01d6\7&"+
		"\2\2\u01d6\u01d7\7\b\2\2\u01d7\u01d8\7\63\2\2\u01d8\u01d9\7\4\2\2\u01d9"+
		"\u01da\t\4\2\2\u01da\u01dc\7\t\2\2\u01db\u00d3\3\2\2\2\u01db\u00d8\3\2"+
		"\2\2\u01db\u00dd\3\2\2\2\u01db\u00ef\3\2\2\2\u01db\u0101\3\2\2\2\u01db"+
		"\u0113\3\2\2\2\u01db\u0122\3\2\2\2\u01db\u0131\3\2\2\2\u01db\u0140\3\2"+
		"\2\2\u01db\u014e\3\2\2\2\u01db\u015d\3\2\2\2\u01db\u016b\3\2\2\2\u01db"+
		"\u017e\3\2\2\2\u01db\u0191\3\2\2\2\u01db\u01a4\3\2\2\2\u01db\u01b6\3\2"+
		"\2\2\u01db\u01c9\3\2\2\2\u01dc\35\3\2\2\2\u01dd\u01f1\t\2\2\2\u01de\u01df"+
		"\7\22\2\2\u01df\u01e0\7\b\2\2\u01e0\u01e1\t\2\2\2\u01e1\u01f1\7\t\2\2"+
		"\u01e2\u01e3\7\23\2\2\u01e3\u01e4\7\b\2\2\u01e4\u01e5\5\36\20\2\u01e5"+
		"\u01e6\7\4\2\2\u01e6\u01e7\5\36\20\2\u01e7\u01e8\7\t\2\2\u01e8\u01f1\3"+
		"\2\2\2\u01e9\u01ea\7\23\2\2\u01ea\u01eb\7\b\2\2\u01eb\u01ec\5\32\16\2"+
		"\u01ec\u01ed\7\4\2\2\u01ed\u01ee\5\32\16\2\u01ee\u01ef\7\t\2\2\u01ef\u01f1"+
		"\3\2\2\2\u01f0\u01dd\3\2\2\2\u01f0\u01de\3\2\2\2\u01f0\u01e2\3\2\2\2\u01f0"+
		"\u01e9\3\2\2\2\u01f1\37\3\2\2\2\u01f2\u01f3\b\21\1\2\u01f3\u01f4\7!\2"+
		"\2\u01f4\u0223\5 \21\23\u01f5\u01f7\7\35\2\2\u01f6\u01f8\5\"\22\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\r\2\2\u01fc\u01fd\5 \21\16\u01fd"+
		"\u0223\3\2\2\2\u01fe\u0200\7\36\2\2\u01ff\u0201\5\"\22\2\u0200\u01ff\3"+
		"\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7\r\2\2\u0205\u0206\5 \21\r\u0206\u0223\3\2"+
		"\2\2\u0207\u0223\7\61\2\2\u0208\u0209\7\61\2\2\u0209\u020a\7\b\2\2\u020a"+
		"\u020b\5&\24\2\u020b\u020c\7\t\2\2\u020c\u0223\3\2\2\2\u020d\u020e\7\33"+
		"\2\2\u020e\u0223\7\61\2\2\u020f\u0210\7\33\2\2\u0210\u0211\7\61\2\2\u0211"+
		"\u0212\7\b\2\2\u0212\u0213\5&\24\2\u0213\u0214\7\t\2\2\u0214\u0223\3\2"+
		"\2\2\u0215\u0223\7\34\2\2\u0216\u0217\7\34\2\2\u0217\u0218\7\b\2\2\u0218"+
		"\u0219\5&\24\2\u0219\u021a\7\t\2\2\u021a\u0223\3\2\2\2\u021b\u0223\7\37"+
		"\2\2\u021c\u0223\7 \2\2\u021d\u021e\7\3\2\2\u021e\u021f\5 \21\2\u021f"+
		"\u0220\7\5\2\2\u0220\u0223\3\2\2\2\u0221\u0223\5$\23\2\u0222\u01f2\3\2"+
		"\2\2\u0222\u01f5\3\2\2\2\u0222\u01fe\3\2\2\2\u0222\u0207\3\2\2\2\u0222"+
		"\u0208\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u020f\3\2\2\2\u0222\u0215\3\2"+
		"\2\2\u0222\u0216\3\2\2\2\u0222\u021b\3\2\2\2\u0222\u021c\3\2\2\2\u0222"+
		"\u021d\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u0232\3\2\2\2\u0224\u0225\f\22"+
		"\2\2\u0225\u0226\7\"\2\2\u0226\u0231\5 \21\23\u0227\u0228\f\21\2\2\u0228"+
		"\u0229\7#\2\2\u0229\u0231\5 \21\22\u022a\u022b\f\20\2\2\u022b\u022c\7"+
		"$\2\2\u022c\u0231\5 \21\21\u022d\u022e\f\17\2\2\u022e\u022f\7%\2\2\u022f"+
		"\u0231\5 \21\20\u0230\u0224\3\2\2\2\u0230\u0227\3\2\2\2\u0230\u022a\3"+
		"\2\2\2\u0230\u022d\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233!\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u023a\7\61\2\2"+
		"\u0236\u0237\7\13\2\2\u0237\u0239\7\61\2\2\u0238\u0236\3\2\2\2\u0239\u023c"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023d\u023e\7\6\2\2\u023e\u023f\t\2\2\2\u023f\u0240\7\4"+
		"\2\2\u0240#\3\2\2\2\u0241\u0242\5&\24\2\u0242\u0243\7&\2\2\u0243\u0244"+
		"\5&\24\2\u0244\u0256\3\2\2\2\u0245\u0246\5&\24\2\u0246\u0247\7\'\2\2\u0247"+
		"\u0248\5&\24\2\u0248\u0256\3\2\2\2\u0249\u024a\5&\24\2\u024a\u024b\7("+
		"\2\2\u024b\u024c\5&\24\2\u024c\u0256\3\2\2\2\u024d\u024e\5&\24\2\u024e"+
		"\u024f\7)\2\2\u024f\u0250\5&\24\2\u0250\u0256\3\2\2\2\u0251\u0252\5&\24"+
		"\2\u0252\u0253\7*\2\2\u0253\u0254\5&\24\2\u0254\u0256\3\2\2\2\u0255\u0241"+
		"\3\2\2\2\u0255\u0245\3\2\2\2\u0255\u0249\3\2\2\2\u0255\u024d\3\2\2\2\u0255"+
		"\u0251\3\2\2\2\u0256%\3\2\2\2\u0257\u0258\b\24\1\2\u0258\u0276\7\61\2"+
		"\2\u0259\u025a\7\61\2\2\u025a\u025b\7\b\2\2\u025b\u025c\5&\24\2\u025c"+
		"\u025d\7\t\2\2\u025d\u0276\3\2\2\2\u025e\u025f\7\33\2\2\u025f\u0276\7"+
		"\61\2\2\u0260\u0261\7\33\2\2\u0261\u0262\7\61\2\2\u0262\u0263\7\b\2\2"+
		"\u0263\u0264\5&\24\2\u0264\u0265\7\t\2\2\u0265\u0276\3\2\2\2\u0266\u0276"+
		"\7\34\2\2\u0267\u0268\7\34\2\2\u0268\u0269\7\b\2\2\u0269\u026a\5&\24\2"+
		"\u026a\u026b\7\t\2\2\u026b\u0276\3\2\2\2\u026c\u0276\7\62\2\2\u026d\u026e"+
		"\7\61\2\2\u026e\u026f\7\16\2\2\u026f\u0276\7\25\2\2\u0270\u0276\7\63\2"+
		"\2\u0271\u0272\7\3\2\2\u0272\u0273\5&\24\2\u0273\u0274\7\5\2\2\u0274\u0276"+
		"\3\2\2\2\u0275\u0257\3\2\2\2\u0275\u0259\3\2\2\2\u0275\u025e\3\2\2\2\u0275"+
		"\u0260\3\2\2\2\u0275\u0266\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u026c\3\2"+
		"\2\2\u0275\u026d\3\2\2\2\u0275\u0270\3\2\2\2\u0275\u0271\3\2\2\2\u0276"+
		"\u027f\3\2\2\2\u0277\u0278\f\16\2\2\u0278\u0279\t\5\2\2\u0279\u027e\5"+
		"&\24\17\u027a\u027b\f\r\2\2\u027b\u027c\t\6\2\2\u027c\u027e\5&\24\16\u027d"+
		"\u0277\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\'\3\2\2\2\u0281\u027f\3\2\2\2\'+\63\67"+
		"@EHKQT_dhkqt|\u0082\u0086\u008e\u00b6\u00ba\u00d1\u00ea\u00fc\u010e\u01db"+
		"\u01f0\u01f9\u0202\u0222\u0230\u0232\u023a\u0255\u0275\u027d\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}