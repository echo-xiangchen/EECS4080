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
		VERIFY=18, COUNT=19, LOWER=20, UPPER=21, LOCAL=22, REQUIRE=23, ENSURE=24, 
		DO=25, END=26, OLD=27, RESULT=28, IF=29, THEN=30, ELSE=31, FROM=32, UNTIL=33, 
		LOOP=34, INVARIANT=35, VARIANT=36, FORALL=37, EXISTS=38, TRUE=39, FALSE=40, 
		NOT=41, AND=42, OR=43, IMPLIES=44, IFF=45, EQUAL=46, GREATERTHAN=47, LESSTHAN=48, 
		GREATEROREQUAL=49, LESSOREQUAL=50, MUL=51, DIV=52, ADD=53, SUB=54, COMMENT=55, 
		WS=56, ID=57, INTNUM=58, REALNUM=59;
	public static final int
		RULE_stat = 0, RULE_line = 1, RULE_method = 2, RULE_mutator = 3, RULE_accessor = 4, 
		RULE_precondition = 5, RULE_postcondition = 6, RULE_contract = 7, RULE_local = 8, 
		RULE_implementation = 9, RULE_assignment = 10, RULE_alternation = 11, 
		RULE_declaration = 12, RULE_uninitialDecl = 13, RULE_initialDecl = 14, 
		RULE_unnamedDecl = 15, RULE_boolExpr = 16, RULE_varDecl = 17, RULE_relation = 18, 
		RULE_arithmetic = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "line", "method", "mutator", "accessor", "precondition", "postcondition", 
			"contract", "local", "implementation", "assignment", "alternation", "declaration", 
			"uninitialDecl", "initialDecl", "unnamedDecl", "boolExpr", "varDecl", 
			"relation", "arithmetic"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				line();
				}
				}
				setState(43); 
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaration();
				}
				break;
			case 2:
				_localctx = new AssignDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assignment();
				}
				break;
			case 3:
				_localctx = new DefineMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				method();
				}
				break;
			case 4:
				_localctx = new VerifyBoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(VERIFY);
				setState(49);
				boolExpr(0);
				}
				break;
			case 5:
				_localctx = new VerifyMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(VERIFY);
				setState(51);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MutatorMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				mutator();
				}
				break;
			case 2:
				_localctx = new AccessorMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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
			setState(58);
			match(ID);
			setState(59);
			match(T__0);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				uninitialDecl();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(61);
					match(T__1);
					setState(62);
					uninitialDecl();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(71);
				precondition();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(74);
				local();
				}
			}

			setState(77);
			match(DO);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				implementation();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << ID))) != 0) );
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(83);
				postcondition();
				}
			}

			setState(86);
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
			setState(88);
			match(ID);
			setState(89);
			match(T__0);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(90);
				uninitialDecl();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(91);
					match(T__1);
					setState(92);
					uninitialDecl();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(T__2);
			setState(101);
			match(T__3);
			setState(102);
			unnamedDecl();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRE) {
				{
				setState(103);
				precondition();
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL) {
				{
				setState(106);
				local();
				}
			}

			setState(109);
			match(DO);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				implementation();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << ID))) != 0) );
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(115);
				postcondition();
				}
			}

			setState(118);
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
			setState(120);
			match(REQUIRE);
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				contract();
				}
				}
				setState(124); 
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
			setState(126);
			match(ENSURE);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				contract();
				}
				}
				setState(130); 
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__3);
				}
				break;
			}
			setState(136);
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
			setState(138);
			match(LOCAL);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				declaration();
				}
				}
				setState(142); 
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESULT:
			case ID:
				_localctx = new ImpAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				assignment();
				}
				break;
			case IF:
				_localctx = new ImpAlternationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				alternation();
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
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
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
	public static class ArrayValueResultAssignContext extends AssignmentContext {
		public TerminalNode RESULT() { return getToken(VerifierParser.RESULT, 0); }
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new SingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__4);
				setState(150);
				match(ID);
				setState(151);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(T__4);
				setState(154);
				boolExpr(0);
				setState(155);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ArithAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(ID);
				setState(158);
				match(T__4);
				setState(159);
				arithmetic(0);
				setState(160);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new BoolArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__4);
				setState(164);
				match(T__5);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << FORALL) | (1L << EXISTS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(165);
					boolExpr(0);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(166);
						match(T__6);
						setState(167);
						boolExpr(0);
						}
						}
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(175);
				match(T__7);
				setState(176);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ArithArrayInitializeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__4);
				setState(179);
				match(T__5);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OLD) | (1L << RESULT) | (1L << ID) | (1L << INTNUM) | (1L << REALNUM))) != 0)) {
					{
					setState(180);
					arithmetic(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(181);
						match(T__6);
						setState(182);
						arithmetic(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(T__7);
				setState(191);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new ArraySingleVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(ID);
				setState(193);
				match(T__8);
				setState(194);
				arithmetic(0);
				setState(195);
				match(T__9);
				setState(196);
				match(T__4);
				setState(197);
				match(ID);
				setState(198);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new BoolArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(ID);
				setState(201);
				match(T__8);
				setState(202);
				arithmetic(0);
				setState(203);
				match(T__9);
				setState(204);
				match(T__4);
				setState(205);
				boolExpr(0);
				setState(206);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new ArithArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				match(ID);
				setState(209);
				match(T__8);
				setState(210);
				arithmetic(0);
				setState(211);
				match(T__9);
				setState(212);
				match(T__4);
				setState(213);
				arithmetic(0);
				setState(214);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new SingleVarResultAssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				match(RESULT);
				setState(217);
				match(T__4);
				setState(218);
				match(ID);
				setState(219);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new ArrayValueResultAssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(RESULT);
				setState(221);
				match(T__4);
				setState(222);
				match(ID);
				setState(223);
				match(T__8);
				setState(224);
				arithmetic(0);
				setState(225);
				match(T__9);
				setState(226);
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
		public ImplementationContext implementation;
		public List<ImplementationContext> imp1 = new ArrayList<ImplementationContext>();
		public List<ImplementationContext> imp2 = new ArrayList<ImplementationContext>();
		public TerminalNode IF() { return getToken(VerifierParser.IF, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VerifierParser.THEN, 0); }
		public TerminalNode END() { return getToken(VerifierParser.END, 0); }
		public List<ImplementationContext> implementation() {
			return getRuleContexts(ImplementationContext.class);
		}
		public ImplementationContext implementation(int i) {
			return getRuleContext(ImplementationContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VerifierParser.ELSE, 0); }
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
			setState(230);
			match(IF);
			setState(231);
			boolExpr(0);
			setState(232);
			match(THEN);
			setState(233);
			((AlternationBodyContext)_localctx).implementation = implementation();
			((AlternationBodyContext)_localctx).imp1.add(((AlternationBodyContext)_localctx).implementation);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(234);
				((AlternationBodyContext)_localctx).implementation = implementation();
				((AlternationBodyContext)_localctx).imp1.add(((AlternationBodyContext)_localctx).implementation);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(240);
				match(ELSE);
				setState(241);
				((AlternationBodyContext)_localctx).implementation = implementation();
				((AlternationBodyContext)_localctx).imp2.add(((AlternationBodyContext)_localctx).implementation);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESULT) | (1L << IF) | (1L << ID))) != 0)) {
					{
					{
					setState(242);
					((AlternationBodyContext)_localctx).implementation = implementation();
					((AlternationBodyContext)_localctx).imp2.add(((AlternationBodyContext)_localctx).implementation);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
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
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new UninitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				uninitialDecl();
				}
				break;
			case 2:
				_localctx = new InitialVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		enterRule(_localctx, 26, RULE_uninitialDecl);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new SingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ID);
				setState(257);
				match(T__3);
				setState(258);
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
				setState(259);
				match(ID);
				setState(260);
				match(T__3);
				setState(261);
				match(ARRAY);
				setState(262);
				match(T__8);
				setState(263);
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
				setState(264);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new NamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__3);
				setState(267);
				match(PAIR);
				setState(268);
				match(T__8);
				setState(269);
				match(ID);
				setState(270);
				match(T__3);
				setState(271);
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
				setState(272);
				match(T__1);
				setState(273);
				match(ID);
				setState(274);
				match(T__3);
				setState(275);
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
				setState(276);
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
		enterRule(_localctx, 28, RULE_initialDecl);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new BoolValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ID);
				setState(280);
				match(T__3);
				setState(281);
				match(BOOL);
				setState(282);
				match(EQUAL);
				setState(283);
				boolExpr(0);
				}
				break;
			case 2:
				_localctx = new NumValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(ID);
				setState(285);
				match(T__3);
				setState(286);
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
				setState(287);
				match(EQUAL);
				setState(288);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new BoolArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(ID);
				setState(290);
				match(T__3);
				setState(291);
				match(ARRAY);
				setState(292);
				match(T__8);
				setState(293);
				match(BOOL);
				setState(294);
				match(T__9);
				setState(295);
				match(EQUAL);
				setState(296);
				match(T__5);
				setState(297);
				boolExpr(0);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(298);
					match(T__6);
					setState(299);
					boolExpr(0);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IntArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(ID);
				setState(308);
				match(T__3);
				setState(309);
				match(ARRAY);
				setState(310);
				match(T__8);
				setState(311);
				match(INT);
				setState(312);
				match(T__9);
				setState(313);
				match(EQUAL);
				setState(314);
				match(T__5);
				setState(315);
				arithmetic(0);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(316);
					match(T__6);
					setState(317);
					arithmetic(0);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new RealArrayValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(ID);
				setState(326);
				match(T__3);
				setState(327);
				match(ARRAY);
				setState(328);
				match(T__8);
				setState(329);
				match(REAL);
				setState(330);
				match(T__9);
				setState(331);
				match(EQUAL);
				setState(332);
				match(T__5);
				setState(333);
				arithmetic(0);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(334);
					match(T__6);
					setState(335);
					arithmetic(0);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new UnnamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(ID);
				setState(344);
				match(T__3);
				setState(345);
				match(PAIR);
				setState(346);
				match(T__8);
				setState(347);
				match(BOOL);
				setState(348);
				match(T__1);
				setState(349);
				match(BOOL);
				setState(350);
				match(T__9);
				setState(351);
				match(EQUAL);
				setState(352);
				match(T__8);
				setState(353);
				boolExpr(0);
				setState(354);
				match(T__1);
				setState(355);
				boolExpr(0);
				setState(356);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new UnnamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				match(ID);
				setState(359);
				match(T__3);
				setState(360);
				match(PAIR);
				setState(361);
				match(T__8);
				setState(362);
				match(BOOL);
				setState(363);
				match(T__1);
				setState(364);
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
				setState(365);
				match(T__9);
				setState(366);
				match(EQUAL);
				setState(367);
				match(T__8);
				setState(368);
				boolExpr(0);
				setState(369);
				match(T__1);
				setState(370);
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
				setState(371);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new UnnamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				match(ID);
				setState(374);
				match(T__3);
				setState(375);
				match(PAIR);
				setState(376);
				match(T__8);
				setState(377);
				match(INT);
				setState(378);
				match(T__1);
				setState(379);
				match(BOOL);
				setState(380);
				match(T__9);
				setState(381);
				match(EQUAL);
				setState(382);
				match(T__8);
				setState(383);
				match(INTNUM);
				setState(384);
				match(T__1);
				setState(385);
				boolExpr(0);
				setState(386);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new UnnamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(388);
				match(ID);
				setState(389);
				match(T__3);
				setState(390);
				match(PAIR);
				setState(391);
				match(T__8);
				setState(392);
				match(INT);
				setState(393);
				match(T__1);
				setState(394);
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
				setState(395);
				match(T__9);
				setState(396);
				match(EQUAL);
				setState(397);
				match(T__8);
				setState(398);
				match(INTNUM);
				setState(399);
				match(T__1);
				setState(400);
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
				setState(401);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new UnnamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(402);
				match(ID);
				setState(403);
				match(T__3);
				setState(404);
				match(PAIR);
				setState(405);
				match(T__8);
				setState(406);
				match(REAL);
				setState(407);
				match(T__1);
				setState(408);
				match(BOOL);
				setState(409);
				match(T__9);
				setState(410);
				match(EQUAL);
				setState(411);
				match(T__8);
				setState(412);
				match(REALNUM);
				setState(413);
				match(T__1);
				setState(414);
				boolExpr(0);
				setState(415);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new UnnamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(417);
				match(ID);
				setState(418);
				match(T__3);
				setState(419);
				match(PAIR);
				setState(420);
				match(T__8);
				setState(421);
				match(REAL);
				setState(422);
				match(T__1);
				setState(423);
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
				setState(424);
				match(T__9);
				setState(425);
				match(EQUAL);
				setState(426);
				match(T__8);
				setState(427);
				match(REALNUM);
				setState(428);
				match(T__1);
				setState(429);
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
				setState(430);
				match(T__9);
				}
				break;
			case 12:
				_localctx = new NamedBoolBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(431);
				match(ID);
				setState(432);
				match(T__3);
				setState(433);
				match(PAIR);
				setState(434);
				match(T__8);
				setState(435);
				match(ID);
				setState(436);
				match(T__3);
				setState(437);
				match(BOOL);
				setState(438);
				match(T__1);
				setState(439);
				match(ID);
				setState(440);
				match(T__3);
				setState(441);
				match(BOOL);
				setState(442);
				match(T__9);
				setState(443);
				match(EQUAL);
				setState(444);
				match(T__8);
				setState(445);
				boolExpr(0);
				setState(446);
				match(T__1);
				setState(447);
				boolExpr(0);
				setState(448);
				match(T__9);
				}
				break;
			case 13:
				_localctx = new NamedBoolArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(450);
				match(ID);
				setState(451);
				match(T__3);
				setState(452);
				match(PAIR);
				setState(453);
				match(T__8);
				setState(454);
				match(ID);
				setState(455);
				match(T__3);
				setState(456);
				match(BOOL);
				setState(457);
				match(T__1);
				setState(458);
				match(ID);
				setState(459);
				match(T__3);
				setState(460);
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
				setState(461);
				match(T__9);
				setState(462);
				match(EQUAL);
				setState(463);
				match(T__8);
				setState(464);
				boolExpr(0);
				setState(465);
				match(T__1);
				setState(466);
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
				setState(467);
				match(T__9);
				}
				break;
			case 14:
				_localctx = new NamedIntBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(469);
				match(ID);
				setState(470);
				match(T__3);
				setState(471);
				match(PAIR);
				setState(472);
				match(T__8);
				setState(473);
				match(ID);
				setState(474);
				match(T__3);
				setState(475);
				match(INT);
				setState(476);
				match(T__1);
				setState(477);
				match(ID);
				setState(478);
				match(T__3);
				setState(479);
				match(BOOL);
				setState(480);
				match(T__9);
				setState(481);
				match(EQUAL);
				setState(482);
				match(T__8);
				setState(483);
				match(INTNUM);
				setState(484);
				match(T__1);
				setState(485);
				boolExpr(0);
				setState(486);
				match(T__9);
				}
				break;
			case 15:
				_localctx = new NamedIntArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(488);
				match(ID);
				setState(489);
				match(T__3);
				setState(490);
				match(PAIR);
				setState(491);
				match(T__8);
				setState(492);
				match(ID);
				setState(493);
				match(T__3);
				setState(494);
				match(INT);
				setState(495);
				match(T__1);
				setState(496);
				match(ID);
				setState(497);
				match(T__3);
				setState(498);
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
				setState(499);
				match(T__9);
				setState(500);
				match(EQUAL);
				setState(501);
				match(T__8);
				setState(502);
				match(INTNUM);
				setState(503);
				match(T__1);
				setState(504);
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
				setState(505);
				match(T__9);
				}
				break;
			case 16:
				_localctx = new NamedRealBoolPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(506);
				match(ID);
				setState(507);
				match(T__3);
				setState(508);
				match(PAIR);
				setState(509);
				match(T__8);
				setState(510);
				match(ID);
				setState(511);
				match(T__3);
				setState(512);
				match(REAL);
				setState(513);
				match(T__1);
				setState(514);
				match(ID);
				setState(515);
				match(T__3);
				setState(516);
				match(BOOL);
				setState(517);
				match(T__9);
				setState(518);
				match(EQUAL);
				setState(519);
				match(T__8);
				setState(520);
				match(REALNUM);
				setState(521);
				match(T__1);
				setState(522);
				boolExpr(0);
				setState(523);
				match(T__9);
				}
				break;
			case 17:
				_localctx = new NamedRealArithPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(525);
				match(ID);
				setState(526);
				match(T__3);
				setState(527);
				match(PAIR);
				setState(528);
				match(T__8);
				setState(529);
				match(ID);
				setState(530);
				match(T__3);
				setState(531);
				match(REAL);
				setState(532);
				match(T__1);
				setState(533);
				match(ID);
				setState(534);
				match(T__3);
				setState(535);
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
				setState(536);
				match(T__9);
				setState(537);
				match(EQUAL);
				setState(538);
				match(T__8);
				setState(539);
				match(REALNUM);
				setState(540);
				match(T__1);
				setState(541);
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
				setState(542);
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
		enterRule(_localctx, 30, RULE_unnamedDecl);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new UnnamedSingleVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
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
				setState(546);
				match(ARRAY);
				setState(547);
				match(T__8);
				setState(548);
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
				setState(549);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new UnnamedPairValueDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(PAIR);
				setState(551);
				match(T__8);
				setState(552);
				unnamedDecl();
				setState(553);
				match(T__1);
				setState(554);
				unnamedDecl();
				setState(555);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new UnnamedPairDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				match(PAIR);
				setState(558);
				match(T__8);
				setState(559);
				uninitialDecl();
				setState(560);
				match(T__1);
				setState(561);
				uninitialDecl();
				setState(562);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(567);
				match(NOT);
				setState(568);
				boolExpr(17);
				}
				break;
			case 2:
				{
				_localctx = new ForallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569);
				match(FORALL);
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(570);
					varDecl();
					}
					}
					setState(573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(575);
				match(T__10);
				setState(576);
				boolExpr(12);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578);
				match(EXISTS);
				setState(580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(579);
					varDecl();
					}
					}
					setState(582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(584);
				match(T__10);
				setState(585);
				boolExpr(11);
				}
				break;
			case 4:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IndexBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				match(ID);
				setState(589);
				match(T__8);
				setState(590);
				arithmetic(0);
				setState(591);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new OldBoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				match(OLD);
				setState(594);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new OldBoolArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(595);
				match(OLD);
				setState(596);
				match(ID);
				setState(597);
				match(T__8);
				setState(598);
				arithmetic(0);
				setState(599);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new BoolResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(601);
				match(RESULT);
				}
				break;
			case 9:
				{
				_localctx = new BoolArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(602);
				match(RESULT);
				setState(603);
				match(T__8);
				setState(604);
				arithmetic(0);
				setState(605);
				match(T__9);
				}
				break;
			case 10:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(607);
				match(TRUE);
				}
				break;
			case 11:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(608);
				match(FALSE);
				}
				break;
			case 12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(609);
				match(T__0);
				setState(610);
				boolExpr(0);
				setState(611);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new RelateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				relation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(616);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(617);
						match(AND);
						setState(618);
						boolExpr(17);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(619);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(620);
						match(OR);
						setState(621);
						boolExpr(16);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(622);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(623);
						match(IMPLIES);
						setState(624);
						boolExpr(15);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(625);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(626);
						match(IFF);
						setState(627);
						boolExpr(14);
						}
						break;
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 34, RULE_varDecl);
		int _la;
		try {
			_localctx = new QuantifyVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(ID);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(634);
				match(T__6);
				setState(635);
				match(ID);
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			match(T__3);
			setState(642);
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
			setState(643);
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
		enterRule(_localctx, 36, RULE_relation);
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				arithmetic(0);
				setState(646);
				match(EQUAL);
				setState(647);
				arithmetic(0);
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				arithmetic(0);
				setState(650);
				match(GREATERTHAN);
				setState(651);
				arithmetic(0);
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				arithmetic(0);
				setState(654);
				match(LESSTHAN);
				setState(655);
				arithmetic(0);
				}
				break;
			case 4:
				_localctx = new GreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				arithmetic(0);
				setState(658);
				match(GREATEROREQUAL);
				setState(659);
				arithmetic(0);
				}
				break;
			case 5:
				_localctx = new LessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(661);
				arithmetic(0);
				setState(662);
				match(LESSOREQUAL);
				setState(663);
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
	public static class UpperArrayContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode UPPER() { return getToken(VerifierParser.UPPER, 0); }
		public UpperArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
	public static class LowerArrayContext extends ArithmeticContext {
		public TerminalNode ID() { return getToken(VerifierParser.ID, 0); }
		public TerminalNode LOWER() { return getToken(VerifierParser.LOWER, 0); }
		public LowerArrayContext(ArithmeticContext ctx) { copyFrom(ctx); }
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new ArithmeticVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(668);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IndexArithmeticArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(669);
				match(ID);
				setState(670);
				match(T__8);
				setState(671);
				arithmetic(0);
				setState(672);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new OldArithVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(674);
				match(OLD);
				setState(675);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new OldArithArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(676);
				match(OLD);
				setState(677);
				match(ID);
				setState(678);
				match(T__8);
				setState(679);
				arithmetic(0);
				setState(680);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new ArithResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				match(RESULT);
				}
				break;
			case 6:
				{
				_localctx = new ArithArrayResultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(683);
				match(RESULT);
				setState(684);
				match(T__8);
				setState(685);
				arithmetic(0);
				setState(686);
				match(T__9);
				}
				break;
			case 7:
				{
				_localctx = new IntNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(INTNUM);
				}
				break;
			case 8:
				{
				_localctx = new CountArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(689);
				match(ID);
				setState(690);
				match(T__11);
				setState(691);
				match(COUNT);
				}
				break;
			case 9:
				{
				_localctx = new LowerArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(692);
				match(ID);
				setState(693);
				match(T__11);
				setState(694);
				match(LOWER);
				}
				break;
			case 10:
				{
				_localctx = new UpperArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				match(ID);
				setState(696);
				match(T__11);
				setState(697);
				match(UPPER);
				}
				break;
			case 11:
				{
				_localctx = new RealNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				match(REALNUM);
				}
				break;
			case 12:
				{
				_localctx = new ArithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				match(T__0);
				setState(700);
				arithmetic(0);
				setState(701);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(711);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(705);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(706);
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
						setState(707);
						arithmetic(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(708);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(709);
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
						setState(710);
						arithmetic(14);
						}
						break;
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		case 16:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 19:
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
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u02cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\7\5B\n\5"+
		"\f\5\16\5E\13\5\5\5G\n\5\3\5\3\5\5\5K\n\5\3\5\5\5N\n\5\3\5\3\5\6\5R\n"+
		"\5\r\5\16\5S\3\5\5\5W\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16"+
		"\6c\13\6\5\6e\n\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\6\3\6\6\6r\n"+
		"\6\r\6\16\6s\3\6\5\6w\n\6\3\6\3\6\3\7\3\7\6\7}\n\7\r\7\16\7~\3\b\3\b\6"+
		"\b\u0083\n\b\r\b\16\b\u0084\3\t\3\t\5\t\u0089\n\t\3\t\3\t\3\n\3\n\6\n"+
		"\u008f\n\n\r\n\16\n\u0090\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ab"+
		"\n\f\f\f\16\f\u00ae\13\f\5\f\u00b0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e7"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13\r\3\r\3\r\3\r"+
		"\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\5\r\u00fb\n\r\3\r\3\r\3\16\3\16\5\16"+
		"\u0101\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0118\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u012f\n\20\f\20\16\20\u0132\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0141"+
		"\n\20\f\20\16\20\u0144\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0153\n\20\f\20\16\20\u0156\13\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0222\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0237\n\21\3\22\3\22\3\22\3\22\3\22\6\22\u023e\n\22\r\22\16\22\u023f"+
		"\3\22\3\22\3\22\3\22\3\22\6\22\u0247\n\22\r\22\16\22\u0248\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0269\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0277\n\22\f\22\16\22\u027a\13\22\3\23\3\23\3\23\7\23\u027f"+
		"\n\23\f\23\16\23\u0282\13\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u029c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u02c2\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02ca\n\25\f\25\16\25\u02cd"+
		"\13\25\3\25\2\4\"(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7"+
		"\3\2\17\21\3\2\20\21\3\2<=\3\2\65\66\3\2\678\2\u031e\2+\3\2\2\2\4\66\3"+
		"\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nZ\3\2\2\2\fz\3\2\2\2\16\u0080\3\2\2\2\20"+
		"\u0088\3\2\2\2\22\u008c\3\2\2\2\24\u0094\3\2\2\2\26\u00e6\3\2\2\2\30\u00e8"+
		"\3\2\2\2\32\u0100\3\2\2\2\34\u0117\3\2\2\2\36\u0221\3\2\2\2 \u0236\3\2"+
		"\2\2\"\u0268\3\2\2\2$\u027b\3\2\2\2&\u029b\3\2\2\2(\u02c1\3\2\2\2*,\5"+
		"\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\67\5\32\16"+
		"\2\60\67\5\26\f\2\61\67\5\6\4\2\62\63\7\24\2\2\63\67\5\"\22\2\64\65\7"+
		"\24\2\2\65\67\7;\2\2\66/\3\2\2\2\66\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2"+
		"\2\2\66\64\3\2\2\2\67\5\3\2\2\28;\5\b\5\29;\5\n\6\2:8\3\2\2\2:9\3\2\2"+
		"\2;\7\3\2\2\2<=\7;\2\2=F\7\3\2\2>C\5\34\17\2?@\7\4\2\2@B\5\34\17\2A?\3"+
		"\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3"+
		"\2\2\2GH\3\2\2\2HJ\7\5\2\2IK\5\f\7\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5"+
		"\22\n\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\33\2\2PR\5\24\13\2QP\3\2\2\2"+
		"RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\16\b\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\34\2\2Y\t\3\2\2\2Z[\7;\2\2[d\7\3\2\2\\a\5\34\17\2]^\7"+
		"\4\2\2^`\5\34\17\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2c"+
		"a\3\2\2\2d\\\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\5\2\2gh\7\6\2\2hj\5 \21\2"+
		"ik\5\f\7\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\22\n\2ml\3\2\2\2mn\3\2\2"+
		"\2no\3\2\2\2oq\7\33\2\2pr\5\24\13\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2tv\3\2\2\2uw\5\16\b\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\34\2\2y"+
		"\13\3\2\2\2z|\7\31\2\2{}\5\20\t\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\r\3\2\2\2\u0080\u0082\7\32\2\2\u0081\u0083\5\20\t\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\17\3\2\2\2\u0086\u0087\7;\2\2\u0087\u0089\7\6\2\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\"\22\2\u008b\21"+
		"\3\2\2\2\u008c\u008e\7\30\2\2\u008d\u008f\5\32\16\2\u008e\u008d\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\23"+
		"\3\2\2\2\u0092\u0095\5\26\f\2\u0093\u0095\5\30\r\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\25\3\2\2\2\u0096\u0097\7;\2\2\u0097\u0098\7"+
		"\7\2\2\u0098\u0099\7;\2\2\u0099\u00e7\7\4\2\2\u009a\u009b\7;\2\2\u009b"+
		"\u009c\7\7\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7\4\2\2\u009e\u00e7\3"+
		"\2\2\2\u009f\u00a0\7;\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5(\25\2\u00a2"+
		"\u00a3\7\4\2\2\u00a3\u00e7\3\2\2\2\u00a4\u00a5\7;\2\2\u00a5\u00a6\7\7"+
		"\2\2\u00a6\u00af\7\b\2\2\u00a7\u00ac\5\"\22\2\u00a8\u00a9\7\t\2\2\u00a9"+
		"\u00ab\5\"\22\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\n"+
		"\2\2\u00b2\u00e7\7\4\2\2\u00b3\u00b4\7;\2\2\u00b4\u00b5\7\7\2\2\u00b5"+
		"\u00be\7\b\2\2\u00b6\u00bb\5(\25\2\u00b7\u00b8\7\t\2\2\u00b8\u00ba\5("+
		"\25\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1"+
		"\u00e7\7\4\2\2\u00c2\u00c3\7;\2\2\u00c3\u00c4\7\13\2\2\u00c4\u00c5\5("+
		"\25\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\7;\2\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00e7\3\2\2\2\u00ca\u00cb\7;\2\2\u00cb\u00cc\7\13"+
		"\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\7\7\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d1\7\4\2\2\u00d1\u00e7\3\2\2\2\u00d2\u00d3\7"+
		";\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\7\f\2\2\u00d6"+
		"\u00d7\7\7\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\7\4\2\2\u00d9\u00e7\3\2"+
		"\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\7;\2\2\u00dd"+
		"\u00e7\7\4\2\2\u00de\u00df\7\36\2\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\7"+
		";\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\7\f\2\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5\u00e7\3\2\2\2\u00e6\u0096\3\2\2\2\u00e6\u009a\3\2"+
		"\2\2\u00e6\u009f\3\2\2\2\u00e6\u00a4\3\2\2\2\u00e6\u00b3\3\2\2\2\u00e6"+
		"\u00c2\3\2\2\2\u00e6\u00ca\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00da\3\2"+
		"\2\2\u00e6\u00de\3\2\2\2\u00e7\27\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea"+
		"\5\"\22\2\u00ea\u00eb\7 \2\2\u00eb\u00ef\5\24\13\2\u00ec\u00ee\5\24\13"+
		"\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00fa\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7!\2\2\u00f3"+
		"\u00f7\5\24\13\2\u00f4\u00f6\5\24\13\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\7\34\2\2\u00fd\31\3\2\2\2\u00fe\u0101\5\34\17\2\u00ff"+
		"\u0101\5\36\20\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\33\3\2"+
		"\2\2\u0102\u0103\7;\2\2\u0103\u0104\7\6\2\2\u0104\u0118\t\2\2\2\u0105"+
		"\u0106\7;\2\2\u0106\u0107\7\6\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7\13"+
		"\2\2\u0109\u010a\t\2\2\2\u010a\u0118\7\f\2\2\u010b\u010c\7;\2\2\u010c"+
		"\u010d\7\6\2\2\u010d\u010e\7\23\2\2\u010e\u010f\7\13\2\2\u010f\u0110\7"+
		";\2\2\u0110\u0111\7\6\2\2\u0111\u0112\t\2\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\u0114\7;\2\2\u0114\u0115\7\6\2\2\u0115\u0116\t\2\2\2\u0116\u0118\7\f"+
		"\2\2\u0117\u0102\3\2\2\2\u0117\u0105\3\2\2\2\u0117\u010b\3\2\2\2\u0118"+
		"\35\3\2\2\2\u0119\u011a\7;\2\2\u011a\u011b\7\6\2\2\u011b\u011c\7\17\2"+
		"\2\u011c\u011d\7\60\2\2\u011d\u0222\5\"\22\2\u011e\u011f\7;\2\2\u011f"+
		"\u0120\7\6\2\2\u0120\u0121\t\3\2\2\u0121\u0122\7\60\2\2\u0122\u0222\5"+
		"(\25\2\u0123\u0124\7;\2\2\u0124\u0125\7\6\2\2\u0125\u0126\7\22\2\2\u0126"+
		"\u0127\7\13\2\2\u0127\u0128\7\17\2\2\u0128\u0129\7\f\2\2\u0129\u012a\7"+
		"\60\2\2\u012a\u012b\7\b\2\2\u012b\u0130\5\"\22\2\u012c\u012d\7\t\2\2\u012d"+
		"\u012f\5\"\22\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7\n\2\2\u0134\u0222\3\2\2\2\u0135\u0136\7;\2\2\u0136\u0137\7\6"+
		"\2\2\u0137\u0138\7\22\2\2\u0138\u0139\7\13\2\2\u0139\u013a\7\20\2\2\u013a"+
		"\u013b\7\f\2\2\u013b\u013c\7\60\2\2\u013c\u013d\7\b\2\2\u013d\u0142\5"+
		"(\25\2\u013e\u013f\7\t\2\2\u013f\u0141\5(\25\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\n\2\2\u0146\u0222\3\2\2\2\u0147"+
		"\u0148\7;\2\2\u0148\u0149\7\6\2\2\u0149\u014a\7\22\2\2\u014a\u014b\7\13"+
		"\2\2\u014b\u014c\7\21\2\2\u014c\u014d\7\f\2\2\u014d\u014e\7\60\2\2\u014e"+
		"\u014f\7\b\2\2\u014f\u0154\5(\25\2\u0150\u0151\7\t\2\2\u0151\u0153\5("+
		"\25\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\n"+
		"\2\2\u0158\u0222\3\2\2\2\u0159\u015a\7;\2\2\u015a\u015b\7\6\2\2\u015b"+
		"\u015c\7\23\2\2\u015c\u015d\7\13\2\2\u015d\u015e\7\17\2\2\u015e\u015f"+
		"\7\4\2\2\u015f\u0160\7\17\2\2\u0160\u0161\7\f\2\2\u0161\u0162\7\60\2\2"+
		"\u0162\u0163\7\13\2\2\u0163\u0164\5\"\22\2\u0164\u0165\7\4\2\2\u0165\u0166"+
		"\5\"\22\2\u0166\u0167\7\f\2\2\u0167\u0222\3\2\2\2\u0168\u0169\7;\2\2\u0169"+
		"\u016a\7\6\2\2\u016a\u016b\7\23\2\2\u016b\u016c\7\13\2\2\u016c\u016d\7"+
		"\17\2\2\u016d\u016e\7\4\2\2\u016e\u016f\t\3\2\2\u016f\u0170\7\f\2\2\u0170"+
		"\u0171\7\60\2\2\u0171\u0172\7\13\2\2\u0172\u0173\5\"\22\2\u0173\u0174"+
		"\7\4\2\2\u0174\u0175\t\4\2\2\u0175\u0176\7\f\2\2\u0176\u0222\3\2\2\2\u0177"+
		"\u0178\7;\2\2\u0178\u0179\7\6\2\2\u0179\u017a\7\23\2\2\u017a\u017b\7\13"+
		"\2\2\u017b\u017c\7\20\2\2\u017c\u017d\7\4\2\2\u017d\u017e\7\17\2\2\u017e"+
		"\u017f\7\f\2\2\u017f\u0180\7\60\2\2\u0180\u0181\7\13\2\2\u0181\u0182\7"+
		"<\2\2\u0182\u0183\7\4\2\2\u0183\u0184\5\"\22\2\u0184\u0185\7\f\2\2\u0185"+
		"\u0222\3\2\2\2\u0186\u0187\7;\2\2\u0187\u0188\7\6\2\2\u0188\u0189\7\23"+
		"\2\2\u0189\u018a\7\13\2\2\u018a\u018b\7\20\2\2\u018b\u018c\7\4\2\2\u018c"+
		"\u018d\t\3\2\2\u018d\u018e\7\f\2\2\u018e\u018f\7\60\2\2\u018f\u0190\7"+
		"\13\2\2\u0190\u0191\7<\2\2\u0191\u0192\7\4\2\2\u0192\u0193\t\4\2\2\u0193"+
		"\u0222\7\f\2\2\u0194\u0195\7;\2\2\u0195\u0196\7\6\2\2\u0196\u0197\7\23"+
		"\2\2\u0197\u0198\7\13\2\2\u0198\u0199\7\21\2\2\u0199\u019a\7\4\2\2\u019a"+
		"\u019b\7\17\2\2\u019b\u019c\7\f\2\2\u019c\u019d\7\60\2\2\u019d\u019e\7"+
		"\13\2\2\u019e\u019f\7=\2\2\u019f\u01a0\7\4\2\2\u01a0\u01a1\5\"\22\2\u01a1"+
		"\u01a2\7\f\2\2\u01a2\u0222\3\2\2\2\u01a3\u01a4\7;\2\2\u01a4\u01a5\7\6"+
		"\2\2\u01a5\u01a6\7\23\2\2\u01a6\u01a7\7\13\2\2\u01a7\u01a8\7\21\2\2\u01a8"+
		"\u01a9\7\4\2\2\u01a9\u01aa\t\3\2\2\u01aa\u01ab\7\f\2\2\u01ab\u01ac\7\60"+
		"\2\2\u01ac\u01ad\7\13\2\2\u01ad\u01ae\7=\2\2\u01ae\u01af\7\4\2\2\u01af"+
		"\u01b0\t\4\2\2\u01b0\u0222\7\f\2\2\u01b1\u01b2\7;\2\2\u01b2\u01b3\7\6"+
		"\2\2\u01b3\u01b4\7\23\2\2\u01b4\u01b5\7\13\2\2\u01b5\u01b6\7;\2\2\u01b6"+
		"\u01b7\7\6\2\2\u01b7\u01b8\7\17\2\2\u01b8\u01b9\7\4\2\2\u01b9\u01ba\7"+
		";\2\2\u01ba\u01bb\7\6\2\2\u01bb\u01bc\7\17\2\2\u01bc\u01bd\7\f\2\2\u01bd"+
		"\u01be\7\60\2\2\u01be\u01bf\7\13\2\2\u01bf\u01c0\5\"\22\2\u01c0\u01c1"+
		"\7\4\2\2\u01c1\u01c2\5\"\22\2\u01c2\u01c3\7\f\2\2\u01c3\u0222\3\2\2\2"+
		"\u01c4\u01c5\7;\2\2\u01c5\u01c6\7\6\2\2\u01c6\u01c7\7\23\2\2\u01c7\u01c8"+
		"\7\13\2\2\u01c8\u01c9\7;\2\2\u01c9\u01ca\7\6\2\2\u01ca\u01cb\7\17\2\2"+
		"\u01cb\u01cc\7\4\2\2\u01cc\u01cd\7;\2\2\u01cd\u01ce\7\6\2\2\u01ce\u01cf"+
		"\t\3\2\2\u01cf\u01d0\7\f\2\2\u01d0\u01d1\7\60\2\2\u01d1\u01d2\7\13\2\2"+
		"\u01d2\u01d3\5\"\22\2\u01d3\u01d4\7\4\2\2\u01d4\u01d5\t\4\2\2\u01d5\u01d6"+
		"\7\f\2\2\u01d6\u0222\3\2\2\2\u01d7\u01d8\7;\2\2\u01d8\u01d9\7\6\2\2\u01d9"+
		"\u01da\7\23\2\2\u01da\u01db\7\13\2\2\u01db\u01dc\7;\2\2\u01dc\u01dd\7"+
		"\6\2\2\u01dd\u01de\7\20\2\2\u01de\u01df\7\4\2\2\u01df\u01e0\7;\2\2\u01e0"+
		"\u01e1\7\6\2\2\u01e1\u01e2\7\17\2\2\u01e2\u01e3\7\f\2\2\u01e3\u01e4\7"+
		"\60\2\2\u01e4\u01e5\7\13\2\2\u01e5\u01e6\7<\2\2\u01e6\u01e7\7\4\2\2\u01e7"+
		"\u01e8\5\"\22\2\u01e8\u01e9\7\f\2\2\u01e9\u0222\3\2\2\2\u01ea\u01eb\7"+
		";\2\2\u01eb\u01ec\7\6\2\2\u01ec\u01ed\7\23\2\2\u01ed\u01ee\7\13\2\2\u01ee"+
		"\u01ef\7;\2\2\u01ef\u01f0\7\6\2\2\u01f0\u01f1\7\20\2\2\u01f1\u01f2\7\4"+
		"\2\2\u01f2\u01f3\7;\2\2\u01f3\u01f4\7\6\2\2\u01f4\u01f5\t\3\2\2\u01f5"+
		"\u01f6\7\f\2\2\u01f6\u01f7\7\60\2\2\u01f7\u01f8\7\13\2\2\u01f8\u01f9\7"+
		"<\2\2\u01f9\u01fa\7\4\2\2\u01fa\u01fb\t\4\2\2\u01fb\u0222\7\f\2\2\u01fc"+
		"\u01fd\7;\2\2\u01fd\u01fe\7\6\2\2\u01fe\u01ff\7\23\2\2\u01ff\u0200\7\13"+
		"\2\2\u0200\u0201\7;\2\2\u0201\u0202\7\6\2\2\u0202\u0203\7\21\2\2\u0203"+
		"\u0204\7\4\2\2\u0204\u0205\7;\2\2\u0205\u0206\7\6\2\2\u0206\u0207\7\17"+
		"\2\2\u0207\u0208\7\f\2\2\u0208\u0209\7\60\2\2\u0209\u020a\7\13\2\2\u020a"+
		"\u020b\7=\2\2\u020b\u020c\7\4\2\2\u020c\u020d\5\"\22\2\u020d\u020e\7\f"+
		"\2\2\u020e\u0222\3\2\2\2\u020f\u0210\7;\2\2\u0210\u0211\7\6\2\2\u0211"+
		"\u0212\7\23\2\2\u0212\u0213\7\13\2\2\u0213\u0214\7;\2\2\u0214\u0215\7"+
		"\6\2\2\u0215\u0216\7\21\2\2\u0216\u0217\7\4\2\2\u0217\u0218\7;\2\2\u0218"+
		"\u0219\7\6\2\2\u0219\u021a\t\3\2\2\u021a\u021b\7\f\2\2\u021b\u021c\7\60"+
		"\2\2\u021c\u021d\7\13\2\2\u021d\u021e\7=\2\2\u021e\u021f\7\4\2\2\u021f"+
		"\u0220\t\4\2\2\u0220\u0222\7\f\2\2\u0221\u0119\3\2\2\2\u0221\u011e\3\2"+
		"\2\2\u0221\u0123\3\2\2\2\u0221\u0135\3\2\2\2\u0221\u0147\3\2\2\2\u0221"+
		"\u0159\3\2\2\2\u0221\u0168\3\2\2\2\u0221\u0177\3\2\2\2\u0221\u0186\3\2"+
		"\2\2\u0221\u0194\3\2\2\2\u0221\u01a3\3\2\2\2\u0221\u01b1\3\2\2\2\u0221"+
		"\u01c4\3\2\2\2\u0221\u01d7\3\2\2\2\u0221\u01ea\3\2\2\2\u0221\u01fc\3\2"+
		"\2\2\u0221\u020f\3\2\2\2\u0222\37\3\2\2\2\u0223\u0237\t\2\2\2\u0224\u0225"+
		"\7\22\2\2\u0225\u0226\7\13\2\2\u0226\u0227\t\2\2\2\u0227\u0237\7\f\2\2"+
		"\u0228\u0229\7\23\2\2\u0229\u022a\7\13\2\2\u022a\u022b\5 \21\2\u022b\u022c"+
		"\7\4\2\2\u022c\u022d\5 \21\2\u022d\u022e\7\f\2\2\u022e\u0237\3\2\2\2\u022f"+
		"\u0230\7\23\2\2\u0230\u0231\7\13\2\2\u0231\u0232\5\34\17\2\u0232\u0233"+
		"\7\4\2\2\u0233\u0234\5\34\17\2\u0234\u0235\7\f\2\2\u0235\u0237\3\2\2\2"+
		"\u0236\u0223\3\2\2\2\u0236\u0224\3\2\2\2\u0236\u0228\3\2\2\2\u0236\u022f"+
		"\3\2\2\2\u0237!\3\2\2\2\u0238\u0239\b\22\1\2\u0239\u023a\7+\2\2\u023a"+
		"\u0269\5\"\22\23\u023b\u023d\7\'\2\2\u023c\u023e\5$\23\2\u023d\u023c\3"+
		"\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\7\r\2\2\u0242\u0243\5\"\22\16\u0243\u0269\3"+
		"\2\2\2\u0244\u0246\7(\2\2\u0245\u0247\5$\23\2\u0246\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024b\7\r\2\2\u024b\u024c\5\"\22\r\u024c\u0269\3\2\2\2\u024d"+
		"\u0269\7;\2\2\u024e\u024f\7;\2\2\u024f\u0250\7\13\2\2\u0250\u0251\5(\25"+
		"\2\u0251\u0252\7\f\2\2\u0252\u0269\3\2\2\2\u0253\u0254\7\35\2\2\u0254"+
		"\u0269\7;\2\2\u0255\u0256\7\35\2\2\u0256\u0257\7;\2\2\u0257\u0258\7\13"+
		"\2\2\u0258\u0259\5(\25\2\u0259\u025a\7\f\2\2\u025a\u0269\3\2\2\2\u025b"+
		"\u0269\7\36\2\2\u025c\u025d\7\36\2\2\u025d\u025e\7\13\2\2\u025e\u025f"+
		"\5(\25\2\u025f\u0260\7\f\2\2\u0260\u0269\3\2\2\2\u0261\u0269\7)\2\2\u0262"+
		"\u0269\7*\2\2\u0263\u0264\7\3\2\2\u0264\u0265\5\"\22\2\u0265\u0266\7\5"+
		"\2\2\u0266\u0269\3\2\2\2\u0267\u0269\5&\24\2\u0268\u0238\3\2\2\2\u0268"+
		"\u023b\3\2\2\2\u0268\u0244\3\2\2\2\u0268\u024d\3\2\2\2\u0268\u024e\3\2"+
		"\2\2\u0268\u0253\3\2\2\2\u0268\u0255\3\2\2\2\u0268\u025b\3\2\2\2\u0268"+
		"\u025c\3\2\2\2\u0268\u0261\3\2\2\2\u0268\u0262\3\2\2\2\u0268\u0263\3\2"+
		"\2\2\u0268\u0267\3\2\2\2\u0269\u0278\3\2\2\2\u026a\u026b\f\22\2\2\u026b"+
		"\u026c\7,\2\2\u026c\u0277\5\"\22\23\u026d\u026e\f\21\2\2\u026e\u026f\7"+
		"-\2\2\u026f\u0277\5\"\22\22\u0270\u0271\f\20\2\2\u0271\u0272\7.\2\2\u0272"+
		"\u0277\5\"\22\21\u0273\u0274\f\17\2\2\u0274\u0275\7/\2\2\u0275\u0277\5"+
		"\"\22\20\u0276\u026a\3\2\2\2\u0276\u026d\3\2\2\2\u0276\u0270\3\2\2\2\u0276"+
		"\u0273\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279#\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u0280\7;\2\2\u027c\u027d"+
		"\7\t\2\2\u027d\u027f\7;\2\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2"+
		"\2\2\u0283\u0284\7\6\2\2\u0284\u0285\t\2\2\2\u0285\u0286\7\4\2\2\u0286"+
		"%\3\2\2\2\u0287\u0288\5(\25\2\u0288\u0289\7\60\2\2\u0289\u028a\5(\25\2"+
		"\u028a\u029c\3\2\2\2\u028b\u028c\5(\25\2\u028c\u028d\7\61\2\2\u028d\u028e"+
		"\5(\25\2\u028e\u029c\3\2\2\2\u028f\u0290\5(\25\2\u0290\u0291\7\62\2\2"+
		"\u0291\u0292\5(\25\2\u0292\u029c\3\2\2\2\u0293\u0294\5(\25\2\u0294\u0295"+
		"\7\63\2\2\u0295\u0296\5(\25\2\u0296\u029c\3\2\2\2\u0297\u0298\5(\25\2"+
		"\u0298\u0299\7\64\2\2\u0299\u029a\5(\25\2\u029a\u029c\3\2\2\2\u029b\u0287"+
		"\3\2\2\2\u029b\u028b\3\2\2\2\u029b\u028f\3\2\2\2\u029b\u0293\3\2\2\2\u029b"+
		"\u0297\3\2\2\2\u029c\'\3\2\2\2\u029d\u029e\b\25\1\2\u029e\u02c2\7;\2\2"+
		"\u029f\u02a0\7;\2\2\u02a0\u02a1\7\13\2\2\u02a1\u02a2\5(\25\2\u02a2\u02a3"+
		"\7\f\2\2\u02a3\u02c2\3\2\2\2\u02a4\u02a5\7\35\2\2\u02a5\u02c2\7;\2\2\u02a6"+
		"\u02a7\7\35\2\2\u02a7\u02a8\7;\2\2\u02a8\u02a9\7\13\2\2\u02a9\u02aa\5"+
		"(\25\2\u02aa\u02ab\7\f\2\2\u02ab\u02c2\3\2\2\2\u02ac\u02c2\7\36\2\2\u02ad"+
		"\u02ae\7\36\2\2\u02ae\u02af\7\13\2\2\u02af\u02b0\5(\25\2\u02b0\u02b1\7"+
		"\f\2\2\u02b1\u02c2\3\2\2\2\u02b2\u02c2\7<\2\2\u02b3\u02b4\7;\2\2\u02b4"+
		"\u02b5\7\16\2\2\u02b5\u02c2\7\25\2\2\u02b6\u02b7\7;\2\2\u02b7\u02b8\7"+
		"\16\2\2\u02b8\u02c2\7\26\2\2\u02b9\u02ba\7;\2\2\u02ba\u02bb\7\16\2\2\u02bb"+
		"\u02c2\7\27\2\2\u02bc\u02c2\7=\2\2\u02bd\u02be\7\3\2\2\u02be\u02bf\5("+
		"\25\2\u02bf\u02c0\7\5\2\2\u02c0\u02c2\3\2\2\2\u02c1\u029d\3\2\2\2\u02c1"+
		"\u029f\3\2\2\2\u02c1\u02a4\3\2\2\2\u02c1\u02a6\3\2\2\2\u02c1\u02ac\3\2"+
		"\2\2\u02c1\u02ad\3\2\2\2\u02c1\u02b2\3\2\2\2\u02c1\u02b3\3\2\2\2\u02c1"+
		"\u02b6\3\2\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02bc\3\2\2\2\u02c1\u02bd\3\2"+
		"\2\2\u02c2\u02cb\3\2\2\2\u02c3\u02c4\f\20\2\2\u02c4\u02c5\t\5\2\2\u02c5"+
		"\u02ca\5(\25\21\u02c6\u02c7\f\17\2\2\u02c7\u02c8\t\6\2\2\u02c8\u02ca\5"+
		"(\25\20\u02c9\u02c3\3\2\2\2\u02c9\u02c6\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc)\3\2\2\2\u02cd\u02cb\3\2\2\2"+
		"/-\66:CFJMSVadjmsv~\u0084\u0088\u0090\u0094\u00ac\u00af\u00bb\u00be\u00e6"+
		"\u00ef\u00f7\u00fa\u0100\u0117\u0130\u0142\u0154\u0221\u0236\u023f\u0248"+
		"\u0268\u0276\u0278\u0280\u029b\u02c1\u02c9\u02cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}