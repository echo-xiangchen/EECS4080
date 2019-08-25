// Generated from ActionLogic.g4 by ANTLR 4.7.2

	import java.util.*;
	import java.io.FileInputStream;
	import java.io.InputStream;
	import com.microsoft.z3.*; 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionLogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NOT=4, AND=5, OR=6, IMPLIES=7, EQUALS=8, VAR=9, 
		NEWLINE=10, WS=11;
	public static final int
		RULE_stat = 0, RULE_varDecl = 1, RULE_formula = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "varDecl", "formula"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'not'", "'and'", "'or'", "'=>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NOT", "AND", "OR", "IMPLIES", "EQUALS", "VAR", 
			"NEWLINE", "WS"
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
	public String getGrammarFileName() { return "ActionLogic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		String eval2 (int op, String formula) {
			if (op == NOT) {
				return "not " + formula;
			}
			return "";
		}

		String eval3 (String left, int op, String right) {
			switch (op) {
				case AND : return "and " + left + " " + right;
				case OR : return "or " + left + " " +right;
				case IMPLIES : return "=> " + left + " " +right;
				case EQUALS : return "= " + left + " " +right;
			}
			return "";
		}

	public ActionLogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public VarDeclContext varDecl;
		public FormulaContext formula;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((StatContext)_localctx).varDecl = varDecl();
			setState(7);
			((StatContext)_localctx).formula = formula(0);

					String[] varSplit = (((StatContext)_localctx).varDecl.v).replaceAll("\n", "").split(",");

					String varDecl = "";
						int i = 0;
						while(i < varSplit.length) {
							varDecl = varDecl + "(declare-const " + varSplit[i] + " Bool)";
							i++;
						}

					String funDecl = "(define-fun conjecture () Bool (" + ((StatContext)_localctx).formula.v + " ))" + "(assert (not conjecture))";

					String value = "";
						int j = 0;
						while(j < varSplit.length) {
							value = value + "(assert (or (= " + varSplit[j] + " true) (= " + varSplit[j] + " false)))";
							j++;
						}


					String output = varDecl + funDecl + value;

					// create z3 contex object
					HashMap<String, String> cfg = new HashMap<String, String>();
			        cfg.put("model", "true");
			        Context ctx = new Context(cfg);

			        // create the formula
			        BoolExpr formula = ctx.parseSMTLIB2String(output, null, null, null, null)[0];

			        // create the solver
			        Solver s = ctx.mkSolver();
			        s.add(formula);
			        	
			        Status result = s.check();

			        // show the result: sat, unsat, unknow
			        if (result == Status.SATISFIABLE){  
			        	System.out.println("The formula is not tautology.");
			        	
			        	// get the model
			        	Model m = s.getModel();
			        	
			        	// split the output model string
			        	String[] splited = m.toString().replaceAll("\n", "").split("\\(define-fun ");
			        	
			        	// print the witness
			        	System.out.println("\nWitness:");
			        	for(int k = 1; k < splited.length; k++) {
			        	System.out.println(splited[k].charAt(0) + " = " + splited[k].substring(11, 16).replaceAll("\\)", ""));
			        		}
			        	
			           }  
			        else if(result == Status.UNSATISFIABLE)  
			            System.out.println("The formula is tautology.");  
			        else   
			            System.out.println("Unknow formula."); 
					//System.out.println(output);
				
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

	public static class VarDeclContext extends ParserRuleContext {
		public String v;
		public List<TerminalNode> VAR() { return getTokens(ActionLogicParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ActionLogicParser.VAR, i);
		}
		public TerminalNode NEWLINE() { return getToken(ActionLogicParser.NEWLINE, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(VAR);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(11);
				match(T__0);
				setState(12);
				match(VAR);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(NEWLINE);
			((VarDeclContext)_localctx).v =  _input.getText(_localctx.start, _input.LT(-1));
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

	public static class FormulaContext extends ParserRuleContext {
		public String v;
		public FormulaContext l;
		public Token op;
		public FormulaContext f;
		public Token VAR;
		public FormulaContext r;
		public TerminalNode NOT() { return getToken(ActionLogicParser.NOT, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode VAR() { return getToken(ActionLogicParser.VAR, 0); }
		public TerminalNode AND() { return getToken(ActionLogicParser.AND, 0); }
		public TerminalNode OR() { return getToken(ActionLogicParser.OR, 0); }
		public TerminalNode IMPLIES() { return getToken(ActionLogicParser.IMPLIES, 0); }
		public TerminalNode EQUALS() { return getToken(ActionLogicParser.EQUALS, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionLogicListener ) ((ActionLogicListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(22);
				((FormulaContext)_localctx).op = match(NOT);
				setState(23);
				((FormulaContext)_localctx).f = formula(7);
				((FormulaContext)_localctx).v =  eval2((((FormulaContext)_localctx).op!=null?((FormulaContext)_localctx).op.getType():0), ((FormulaContext)_localctx).f.v);
				}
				break;
			case VAR:
				{
				setState(26);
				((FormulaContext)_localctx).VAR = match(VAR);
				((FormulaContext)_localctx).v =  (((FormulaContext)_localctx).VAR!=null?((FormulaContext)_localctx).VAR.getText():null);
				}
				break;
			case T__1:
				{
				setState(28);
				match(T__1);
				setState(29);
				((FormulaContext)_localctx).f = formula(0);
				setState(30);
				match(T__2);
				((FormulaContext)_localctx).v =  " ( " + ((FormulaContext)_localctx).f.v + " ) ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(35);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(36);
						((FormulaContext)_localctx).op = match(AND);
						setState(37);
						((FormulaContext)_localctx).r = formula(7);
						((FormulaContext)_localctx).v =  eval3(((FormulaContext)_localctx).l.v, (((FormulaContext)_localctx).op!=null?((FormulaContext)_localctx).op.getType():0), ((FormulaContext)_localctx).r.v);
						}
						break;
					case 2:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						((FormulaContext)_localctx).op = match(OR);
						setState(42);
						((FormulaContext)_localctx).r = formula(6);
						((FormulaContext)_localctx).v =  eval3(((FormulaContext)_localctx).l.v, (((FormulaContext)_localctx).op!=null?((FormulaContext)_localctx).op.getType():0), ((FormulaContext)_localctx).r.v);
						}
						break;
					case 3:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						((FormulaContext)_localctx).op = match(IMPLIES);
						setState(47);
						((FormulaContext)_localctx).r = formula(5);
						((FormulaContext)_localctx).v =  eval3(((FormulaContext)_localctx).l.v, (((FormulaContext)_localctx).op!=null?((FormulaContext)_localctx).op.getType():0), ((FormulaContext)_localctx).r.v);
						}
						break;
					case 4:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						((FormulaContext)_localctx).op = match(EQUALS);
						setState(52);
						((FormulaContext)_localctx).r = formula(4);
						((FormulaContext)_localctx).v =  eval3(((FormulaContext)_localctx).l.v, (((FormulaContext)_localctx).op!=null?((FormulaContext)_localctx).op.getType():0), ((FormulaContext)_localctx).r.v);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		case 2:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\20\n\3\f\3\16\3\23\13\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\2\3\6\5\2\4\6\2\2\2B\2\b\3\2\2\2\4"+
		"\f\3\2\2\2\6#\3\2\2\2\b\t\5\4\3\2\t\n\5\6\4\2\n\13\b\2\1\2\13\3\3\2\2"+
		"\2\f\21\7\13\2\2\r\16\7\3\2\2\16\20\7\13\2\2\17\r\3\2\2\2\20\23\3\2\2"+
		"\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\f\2"+
		"\2\25\26\b\3\1\2\26\5\3\2\2\2\27\30\b\4\1\2\30\31\7\6\2\2\31\32\5\6\4"+
		"\t\32\33\b\4\1\2\33$\3\2\2\2\34\35\7\13\2\2\35$\b\4\1\2\36\37\7\4\2\2"+
		"\37 \5\6\4\2 !\7\5\2\2!\"\b\4\1\2\"$\3\2\2\2#\27\3\2\2\2#\34\3\2\2\2#"+
		"\36\3\2\2\2$;\3\2\2\2%&\f\b\2\2&\'\7\7\2\2\'(\5\6\4\t()\b\4\1\2):\3\2"+
		"\2\2*+\f\7\2\2+,\7\b\2\2,-\5\6\4\b-.\b\4\1\2.:\3\2\2\2/\60\f\6\2\2\60"+
		"\61\7\t\2\2\61\62\5\6\4\7\62\63\b\4\1\2\63:\3\2\2\2\64\65\f\5\2\2\65\66"+
		"\7\n\2\2\66\67\5\6\4\6\678\b\4\1\28:\3\2\2\29%\3\2\2\29*\3\2\2\29/\3\2"+
		"\2\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2\6"+
		"\21#9;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}