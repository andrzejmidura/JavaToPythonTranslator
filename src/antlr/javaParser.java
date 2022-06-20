// Generated from .\java.g4 by ANTLR 4.10.1

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
public class javaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KW_ABSTRACT=3, KW_BOOLEAN=4, KW_CLASS=5, KW_CASE=6, KW_CHAR=7, 
		KW_DO=8, KW_ELSE=9, KW_EXTENDS=10, KW_FLOAT=11, KW_IF=12, KW_IMPLEMENTS=13, 
		KW_IMPORT=14, KW_INT=15, KW_NEW=16, KW_PRIVATE=17, KW_PROTECTED=18, KW_PUBLIC=19, 
		KW_RETURN=20, KW_SHORT=21, KW_VOID=22, KW_WHILE=23, LIT_INT=24, LIT_FLOAT=25, 
		LIT_CHAR=26, LIT_STR=27, LIT_BOOL=28, LIT_NULL=29, SEP_SQBL=30, SEP_SQBR=31, 
		SEP_PARL=32, SEP_PARR=33, SEP_CUBL=34, SEP_CUBR=35, SEP_ASS=36, SEP_SEM=37, 
		OP_ARITHM_MUL=38, OP_ARITHM_ADD=39, OP_UNARY=40, OP_ASSIGN=41, OP_REL=42, 
		OP_LOG=43, OP_BITWISE=44, OP_SHIFT=45, COMMENT=46, WS=47, ID=48;
	public static final int
		RULE_prog = 0, RULE_imps = 1, RULE_fpac = 2, RULE_clss = 3, RULE_classDef = 4, 
		RULE_cls_head = 5, RULE_cls_body = 6, RULE_var_def = 7, RULE_expr = 8, 
		RULE_mth = 9, RULE_mth_head = 10, RULE_sarg = 11, RULE_marg = 12, RULE_blck = 13, 
		RULE_ln = 14, RULE_ret_stat = 15, RULE_stat = 16, RULE_asgn = 17, RULE_funcCall = 18, 
		RULE_objCreationCall = 19, RULE_objFuncCall = 20, RULE_nthFuncCall = 21, 
		RULE_ifStat = 22, RULE_elseIfStat = 23, RULE_elseStat = 24, RULE_whileStat = 25, 
		RULE_doWhileStatement = 26, RULE_type = 27, RULE_lit = 28, RULE_access_mod = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "imps", "fpac", "clss", "classDef", "cls_head", "cls_body", "var_def", 
			"expr", "mth", "mth_head", "sarg", "marg", "blck", "ln", "ret_stat", 
			"stat", "asgn", "funcCall", "objCreationCall", "objFuncCall", "nthFuncCall", 
			"ifStat", "elseIfStat", "elseStat", "whileStat", "doWhileStatement", 
			"type", "lit", "access_mod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'abstract'", "'boolean'", "'class'", "'case'", "'char'", 
			"'do'", "'else'", "'extends'", "'float'", "'if'", "'implements'", "'import'", 
			"'int'", "'new'", "'private'", "'protected'", "'public'", "'return'", 
			"'short'", "'void'", "'while'", null, null, null, null, null, "'null'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "KW_ABSTRACT", "KW_BOOLEAN", "KW_CLASS", "KW_CASE", 
			"KW_CHAR", "KW_DO", "KW_ELSE", "KW_EXTENDS", "KW_FLOAT", "KW_IF", "KW_IMPLEMENTS", 
			"KW_IMPORT", "KW_INT", "KW_NEW", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", 
			"KW_RETURN", "KW_SHORT", "KW_VOID", "KW_WHILE", "LIT_INT", "LIT_FLOAT", 
			"LIT_CHAR", "LIT_STR", "LIT_BOOL", "LIT_NULL", "SEP_SQBL", "SEP_SQBR", 
			"SEP_PARL", "SEP_PARR", "SEP_CUBL", "SEP_CUBR", "SEP_ASS", "SEP_SEM", 
			"OP_ARITHM_MUL", "OP_ARITHM_ADD", "OP_UNARY", "OP_ASSIGN", "OP_REL", 
			"OP_LOG", "OP_BITWISE", "OP_SHIFT", "COMMENT", "WS", "ID"
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
	public String getGrammarFileName() { return "java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ImpsContext imps() {
			return getRuleContext(ImpsContext.class,0);
		}
		public ClssContext clss() {
			return getRuleContext(ClssContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			imps();
			setState(61);
			clss();
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

	public static class ImpsContext extends ParserRuleContext {
		public List<TerminalNode> KW_IMPORT() { return getTokens(javaParser.KW_IMPORT); }
		public TerminalNode KW_IMPORT(int i) {
			return getToken(javaParser.KW_IMPORT, i);
		}
		public List<FpacContext> fpac() {
			return getRuleContexts(FpacContext.class);
		}
		public FpacContext fpac(int i) {
			return getRuleContext(FpacContext.class,i);
		}
		public List<TerminalNode> SEP_SEM() { return getTokens(javaParser.SEP_SEM); }
		public TerminalNode SEP_SEM(int i) {
			return getToken(javaParser.SEP_SEM, i);
		}
		public ImpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterImps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitImps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitImps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpsContext imps() throws RecognitionException {
		ImpsContext _localctx = new ImpsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_IMPORT) {
				{
				{
				setState(63);
				match(KW_IMPORT);
				setState(64);
				fpac();
				setState(65);
				match(SEP_SEM);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FpacContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(javaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(javaParser.ID, i);
		}
		public FpacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFpac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFpac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFpac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FpacContext fpac() throws RecognitionException {
		FpacContext _localctx = new FpacContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fpac);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(73);
				match(T__0);
				setState(74);
				match(ID);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClssContext extends ParserRuleContext {
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public ClssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClssContext clss() throws RecognitionException {
		ClssContext _localctx = new ClssContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				classDef();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ABSTRACT) | (1L << KW_CLASS) | (1L << KW_PUBLIC))) != 0) );
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

	public static class ClassDefContext extends ParserRuleContext {
		public Cls_headContext cls_head() {
			return getRuleContext(Cls_headContext.class,0);
		}
		public TerminalNode SEP_CUBL() { return getToken(javaParser.SEP_CUBL, 0); }
		public Cls_bodyContext cls_body() {
			return getRuleContext(Cls_bodyContext.class,0);
		}
		public TerminalNode SEP_CUBR() { return getToken(javaParser.SEP_CUBR, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			cls_head();
			setState(86);
			match(SEP_CUBL);
			setState(87);
			cls_body();
			setState(88);
			match(SEP_CUBR);
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

	public static class Cls_headContext extends ParserRuleContext {
		public TerminalNode KW_CLASS() { return getToken(javaParser.KW_CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(javaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(javaParser.ID, i);
		}
		public TerminalNode KW_PUBLIC() { return getToken(javaParser.KW_PUBLIC, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(javaParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_EXTENDS() { return getToken(javaParser.KW_EXTENDS, 0); }
		public List<TerminalNode> KW_IMPLEMENTS() { return getTokens(javaParser.KW_IMPLEMENTS); }
		public TerminalNode KW_IMPLEMENTS(int i) {
			return getToken(javaParser.KW_IMPLEMENTS, i);
		}
		public Cls_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCls_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCls_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCls_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_headContext cls_head() throws RecognitionException {
		Cls_headContext _localctx = new Cls_headContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cls_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUBLIC) {
				{
				setState(90);
				match(KW_PUBLIC);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(93);
				match(KW_ABSTRACT);
				}
			}

			setState(96);
			match(KW_CLASS);
			setState(97);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTENDS) {
				{
				setState(98);
				match(KW_EXTENDS);
				setState(99);
				match(ID);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_IMPLEMENTS) {
				{
				{
				setState(102);
				match(KW_IMPLEMENTS);
				setState(103);
				match(ID);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Cls_bodyContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<MthContext> mth() {
			return getRuleContexts(MthContext.class);
		}
		public MthContext mth(int i) {
			return getRuleContext(MthContext.class,i);
		}
		public Cls_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterCls_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitCls_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitCls_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_bodyContext cls_body() throws RecognitionException {
		Cls_bodyContext _localctx = new Cls_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cls_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ABSTRACT) | (1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_FLOAT) | (1L << KW_INT) | (1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC) | (1L << KW_VOID) | (1L << ID))) != 0)) {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(109);
					var_def();
					}
					break;
				case 2:
					{
					setState(110);
					mth();
					}
					break;
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_SEM() { return getToken(javaParser.SEP_SEM, 0); }
		public Access_modContext access_mod() {
			return getRuleContext(Access_modContext.class,0);
		}
		public TerminalNode SEP_ASS() { return getToken(javaParser.SEP_ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC))) != 0)) {
				{
				setState(116);
				access_mod();
				}
			}

			setState(119);
			type();
			setState(120);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP_ASS) {
				{
				setState(121);
				match(SEP_ASS);
				setState(122);
				expr(0);
				}
			}

			setState(125);
			match(SEP_SEM);
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
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ObjFuncCallContext objFuncCall() {
			return getRuleContext(ObjFuncCallContext.class,0);
		}
		public ObjCreationCallContext objCreationCall() {
			return getRuleContext(ObjCreationCallContext.class,0);
		}
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public TerminalNode OP_ARITHM_MUL() { return getToken(javaParser.OP_ARITHM_MUL, 0); }
		public TerminalNode OP_REL() { return getToken(javaParser.OP_REL, 0); }
		public TerminalNode OP_LOG() { return getToken(javaParser.OP_LOG, 0); }
		public TerminalNode OP_ARITHM_ADD() { return getToken(javaParser.OP_ARITHM_ADD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(128);
				lit();
				}
				break;
			case 2:
				{
				setState(129);
				match(ID);
				}
				break;
			case 3:
				{
				setState(130);
				funcCall();
				}
				break;
			case 4:
				{
				setState(131);
				objFuncCall();
				}
				break;
			case 5:
				{
				setState(132);
				objCreationCall();
				}
				break;
			case 6:
				{
				setState(133);
				match(SEP_PARL);
				setState(134);
				expr(0);
				setState(135);
				match(SEP_PARR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(140);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARITHM_MUL) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(143);
						match(OP_ARITHM_ADD);
						setState(144);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MthContext extends ParserRuleContext {
		public Mth_headContext mth_head() {
			return getRuleContext(Mth_headContext.class,0);
		}
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public MthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MthContext mth() throws RecognitionException {
		MthContext _localctx = new MthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			mth_head();
			setState(151);
			blck();
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

	public static class Mth_headContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode KW_VOID() { return getToken(javaParser.KW_VOID, 0); }
		public Access_modContext access_mod() {
			return getRuleContext(Access_modContext.class,0);
		}
		public TerminalNode KW_ABSTRACT() { return getToken(javaParser.KW_ABSTRACT, 0); }
		public Mth_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mth_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMth_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMth_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMth_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mth_headContext mth_head() throws RecognitionException {
		Mth_headContext _localctx = new Mth_headContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mth_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC))) != 0)) {
				{
				setState(153);
				access_mod();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(156);
				match(KW_ABSTRACT);
				}
			}

			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_INT:
			case ID:
				{
				setState(159);
				type();
				}
				break;
			case KW_VOID:
				{
				setState(160);
				match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(ID);
			setState(164);
			match(SEP_PARL);
			setState(165);
			marg();
			setState(166);
			match(SEP_PARR);
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

	public static class SargContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public SargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterSarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitSarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitSarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SargContext sarg() throws RecognitionException {
		SargContext _localctx = new SargContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			type();
			setState(169);
			match(ID);
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

	public static class MargContext extends ParserRuleContext {
		public List<SargContext> sarg() {
			return getRuleContexts(SargContext.class);
		}
		public SargContext sarg(int i) {
			return getRuleContext(SargContext.class,i);
		}
		public MargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MargContext marg() throws RecognitionException {
		MargContext _localctx = new MargContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_marg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_FLOAT) | (1L << KW_INT) | (1L << ID))) != 0)) {
				{
				setState(171);
				sarg();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(172);
					match(T__1);
					setState(173);
					sarg();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class BlckContext extends ParserRuleContext {
		public TerminalNode SEP_CUBL() { return getToken(javaParser.SEP_CUBL, 0); }
		public TerminalNode SEP_CUBR() { return getToken(javaParser.SEP_CUBR, 0); }
		public List<LnContext> ln() {
			return getRuleContexts(LnContext.class);
		}
		public LnContext ln(int i) {
			return getRuleContext(LnContext.class,i);
		}
		public BlckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBlck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBlck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBlck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlckContext blck() throws RecognitionException {
		BlckContext _localctx = new BlckContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(SEP_CUBL);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_DO) | (1L << KW_FLOAT) | (1L << KW_IF) | (1L << KW_INT) | (1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC) | (1L << KW_RETURN) | (1L << KW_WHILE) | (1L << COMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(182);
				ln();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(SEP_CUBR);
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

	public static class LnContext extends ParserRuleContext {
		public LnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ln; }
	 
		public LnContext() { }
		public void copyFrom(LnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_statement_lineContext extends LnContext {
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public While_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhile_statement_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhile_statement_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhile_statement_line(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comment_lineContext extends LnContext {
		public TerminalNode COMMENT() { return getToken(javaParser.COMMENT, 0); }
		public Comment_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterComment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitComment_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitComment_line(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statement_lineContext extends LnContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public If_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIf_statement_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIf_statement_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIf_statement_line(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_statement_lineContext extends LnContext {
		public Ret_statContext ret_stat() {
			return getRuleContext(Ret_statContext.class,0);
		}
		public Return_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterReturn_statement_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitReturn_statement_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitReturn_statement_line(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_lineContext extends LnContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode SEP_SEM() { return getToken(javaParser.SEP_SEM, 0); }
		public Statement_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatement_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatement_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatement_line(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Do_while_statement_lineContext extends LnContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public Do_while_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDo_while_statement_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDo_while_statement_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDo_while_statement_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ln);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_INT:
			case KW_PRIVATE:
			case KW_PROTECTED:
			case KW_PUBLIC:
			case ID:
				_localctx = new Statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(190);
				stat();
				setState(191);
				match(SEP_SEM);
				}
				}
				break;
			case KW_IF:
				_localctx = new If_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				ifStat();
				}
				break;
			case KW_WHILE:
				_localctx = new While_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				whileStat();
				}
				break;
			case KW_DO:
				_localctx = new Do_while_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				doWhileStatement();
				}
				break;
			case COMMENT:
				_localctx = new Comment_lineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(COMMENT);
				}
				break;
			case KW_RETURN:
				_localctx = new Return_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				ret_stat();
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

	public static class Ret_statContext extends ParserRuleContext {
		public TerminalNode KW_RETURN() { return getToken(javaParser.KW_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_SEM() { return getToken(javaParser.SEP_SEM, 0); }
		public Ret_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterRet_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitRet_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitRet_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_statContext ret_stat() throws RecognitionException {
		Ret_statContext _localctx = new Ret_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ret_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(KW_RETURN);
			setState(201);
			expr(0);
			setState(202);
			match(SEP_SEM);
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

	public static class StatContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AsgnContext asgn() {
			return getRuleContext(AsgnContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ObjFuncCallContext objFuncCall() {
			return getRuleContext(ObjFuncCallContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(204);
				var_def();
				}
				break;
			case 2:
				{
				setState(205);
				asgn();
				}
				break;
			case 3:
				{
				setState(206);
				funcCall();
				}
				break;
			case 4:
				{
				setState(207);
				objFuncCall();
				}
				break;
			}
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

	public static class AsgnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_ASS() { return getToken(javaParser.SEP_ASS, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(javaParser.OP_ASSIGN, 0); }
		public AsgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAsgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAsgn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAsgn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsgnContext asgn() throws RecognitionException {
		AsgnContext _localctx = new AsgnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asgn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==SEP_ASS || _la==OP_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			expr(0);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public NthFuncCallContext nthFuncCall() {
			return getRuleContext(NthFuncCallContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(215);
			match(SEP_PARL);
			setState(216);
			marg();
			setState(217);
			match(SEP_PARR);
			setState(218);
			nthFuncCall();
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

	public static class ObjCreationCallContext extends ParserRuleContext {
		public TerminalNode KW_NEW() { return getToken(javaParser.KW_NEW, 0); }
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public ObjCreationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objCreationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterObjCreationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitObjCreationCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitObjCreationCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjCreationCallContext objCreationCall() throws RecognitionException {
		ObjCreationCallContext _localctx = new ObjCreationCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objCreationCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(KW_NEW);
			setState(221);
			match(ID);
			setState(222);
			match(SEP_PARL);
			setState(223);
			marg();
			setState(224);
			match(SEP_PARR);
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

	public static class ObjFuncCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(javaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(javaParser.ID, i);
		}
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public NthFuncCallContext nthFuncCall() {
			return getRuleContext(NthFuncCallContext.class,0);
		}
		public ObjFuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFuncCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterObjFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitObjFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitObjFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFuncCallContext objFuncCall() throws RecognitionException {
		ObjFuncCallContext _localctx = new ObjFuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objFuncCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			match(T__0);
			setState(228);
			match(ID);
			setState(229);
			match(SEP_PARL);
			setState(230);
			marg();
			setState(231);
			match(SEP_PARR);
			setState(232);
			nthFuncCall();
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

	public static class NthFuncCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(javaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(javaParser.ID, i);
		}
		public List<TerminalNode> SEP_PARL() { return getTokens(javaParser.SEP_PARL); }
		public TerminalNode SEP_PARL(int i) {
			return getToken(javaParser.SEP_PARL, i);
		}
		public List<MargContext> marg() {
			return getRuleContexts(MargContext.class);
		}
		public MargContext marg(int i) {
			return getRuleContext(MargContext.class,i);
		}
		public List<TerminalNode> SEP_PARR() { return getTokens(javaParser.SEP_PARR); }
		public TerminalNode SEP_PARR(int i) {
			return getToken(javaParser.SEP_PARR, i);
		}
		public NthFuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nthFuncCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterNthFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitNthFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitNthFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NthFuncCallContext nthFuncCall() throws RecognitionException {
		NthFuncCallContext _localctx = new NthFuncCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nthFuncCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(T__0);
					setState(235);
					match(ID);
					setState(236);
					match(SEP_PARL);
					setState(237);
					marg();
					setState(238);
					match(SEP_PARR);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(javaParser.KW_IF, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(KW_IF);
			setState(246);
			match(SEP_PARL);
			setState(247);
			expr(0);
			setState(248);
			match(SEP_PARR);
			setState(249);
			blck();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					elseIfStat();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(256);
				elseStat();
				}
			}

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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(javaParser.KW_ELSE, 0); }
		public TerminalNode KW_IF() { return getToken(javaParser.KW_IF, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(KW_ELSE);
			setState(260);
			match(KW_IF);
			setState(261);
			match(SEP_PARL);
			setState(262);
			expr(0);
			setState(263);
			match(SEP_PARR);
			setState(264);
			blck();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(javaParser.KW_ELSE, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(KW_ELSE);
			setState(267);
			blck();
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(javaParser.KW_WHILE, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(KW_WHILE);
			setState(270);
			match(SEP_PARL);
			setState(271);
			expr(0);
			setState(272);
			match(SEP_PARR);
			setState(273);
			blck();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode KW_DO() { return getToken(javaParser.KW_DO, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public TerminalNode KW_WHILE() { return getToken(javaParser.KW_WHILE, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(KW_DO);
			setState(276);
			blck();
			setState(277);
			match(KW_WHILE);
			setState(278);
			match(SEP_PARL);
			setState(279);
			expr(0);
			setState(280);
			match(SEP_PARR);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode KW_INT() { return getToken(javaParser.KW_INT, 0); }
		public TerminalNode KW_FLOAT() { return getToken(javaParser.KW_FLOAT, 0); }
		public TerminalNode KW_CHAR() { return getToken(javaParser.KW_CHAR, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(javaParser.KW_BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_FLOAT) | (1L << KW_INT) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LitContext extends ParserRuleContext {
		public TerminalNode LIT_INT() { return getToken(javaParser.LIT_INT, 0); }
		public TerminalNode LIT_FLOAT() { return getToken(javaParser.LIT_FLOAT, 0); }
		public TerminalNode LIT_CHAR() { return getToken(javaParser.LIT_CHAR, 0); }
		public TerminalNode LIT_STR() { return getToken(javaParser.LIT_STR, 0); }
		public TerminalNode LIT_BOOL() { return getToken(javaParser.LIT_BOOL, 0); }
		public TerminalNode LIT_NULL() { return getToken(javaParser.LIT_NULL, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIT_INT) | (1L << LIT_FLOAT) | (1L << LIT_CHAR) | (1L << LIT_STR) | (1L << LIT_BOOL) | (1L << LIT_NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Access_modContext extends ParserRuleContext {
		public TerminalNode KW_PRIVATE() { return getToken(javaParser.KW_PRIVATE, 0); }
		public TerminalNode KW_PROTECTED() { return getToken(javaParser.KW_PROTECTED, 0); }
		public TerminalNode KW_PUBLIC() { return getToken(javaParser.KW_PUBLIC, 0); }
		public Access_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAccess_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAccess_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAccess_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modContext access_mod() throws RecognitionException {
		Access_modContext _localctx = new Access_modContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_access_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u0121\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0004\u0003"+
		"R\b\u0003\u000b\u0003\f\u0003S\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0005\u0003"+
		"\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f"+
		"\u0005l\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006\n\u0006\f"+
		"\u0006s\t\u0006\u0001\u0007\u0003\u0007v\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008a\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0003\n\u009b\b\n\u0001\n\u0003\n\u009e\b\n\u0001\n\u0001\n\u0003\n\u00a2"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00af\b\f\n\f\f\f\u00b2\t\f\u0003"+
		"\f\u00b4\b\f\u0001\r\u0001\r\u0005\r\u00b8\b\r\n\r\f\r\u00bb\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00d1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f1\b\u0015\n\u0015"+
		"\f\u0015\u00f4\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00fc\b\u0016\n\u0016\f\u0016\u00ff"+
		"\t\u0016\u0001\u0016\u0003\u0016\u0102\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001\u0010\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0005\u0002\u0000&&*+\u0002\u0000$$"+
		"))\u0005\u0000\u0004\u0004\u0007\u0007\u000b\u000b\u000f\u000f00\u0001"+
		"\u0000\u0018\u001d\u0001\u0000\u0011\u0013\u0125\u0000<\u0001\u0000\u0000"+
		"\u0000\u0002E\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006"+
		"Q\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fq\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010"+
		"\u0089\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014"+
		"\u009a\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018"+
		"\u00b3\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c"+
		"\u00c6\u0001\u0000\u0000\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00d0"+
		"\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00d6\u0001"+
		"\u0000\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e2\u0001\u0000\u0000"+
		"\u0000*\u00f2\u0001\u0000\u0000\u0000,\u00f5\u0001\u0000\u0000\u0000."+
		"\u0103\u0001\u0000\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u010d\u0001"+
		"\u0000\u0000\u00004\u0113\u0001\u0000\u0000\u00006\u011a\u0001\u0000\u0000"+
		"\u00008\u011c\u0001\u0000\u0000\u0000:\u011e\u0001\u0000\u0000\u0000<"+
		"=\u0003\u0002\u0001\u0000=>\u0003\u0006\u0003\u0000>\u0001\u0001\u0000"+
		"\u0000\u0000?@\u0005\u000e\u0000\u0000@A\u0003\u0004\u0002\u0000AB\u0005"+
		"%\u0000\u0000BD\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u0003\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HM\u00050\u0000"+
		"\u0000IJ\u0005\u0001\u0000\u0000JL\u00050\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PR\u0003\b\u0004\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0007\u0001\u0000"+
		"\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005\"\u0000\u0000WX\u0003\f\u0006"+
		"\u0000XY\u0005#\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z\\\u0005\u0013"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001"+
		"\u0000\u0000\u0000]_\u0005\u0003\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000"+
		"\u0000ad\u00050\u0000\u0000bc\u0005\n\u0000\u0000ce\u00050\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ej\u0001\u0000\u0000"+
		"\u0000fg\u0005\r\u0000\u0000gi\u00050\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mp\u0003\u000e\u0007\u0000np\u0003\u0012\t\u0000om\u0001\u0000\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tv\u0003:\u001d\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u00036\u001b\u0000x{\u00050\u0000"+
		"\u0000yz\u0005$\u0000\u0000z|\u0003\u0010\b\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005%\u0000"+
		"\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\b\uffff\uffff"+
		"\u0000\u0080\u008a\u00038\u001c\u0000\u0081\u008a\u00050\u0000\u0000\u0082"+
		"\u008a\u0003$\u0012\u0000\u0083\u008a\u0003(\u0014\u0000\u0084\u008a\u0003"+
		"&\u0013\u0000\u0085\u0086\u0005 \u0000\u0000\u0086\u0087\u0003\u0010\b"+
		"\u0000\u0087\u0088\u0005!\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u007f\u0001\u0000\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000"+
		"\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000"+
		"\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000"+
		"\u008a\u0093\u0001\u0000\u0000\u0000\u008b\u008c\n\u0002\u0000\u0000\u008c"+
		"\u008d\u0007\u0000\u0000\u0000\u008d\u0092\u0003\u0010\b\u0003\u008e\u008f"+
		"\n\u0001\u0000\u0000\u008f\u0090\u0005\'\u0000\u0000\u0090\u0092\u0003"+
		"\u0010\b\u0002\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0011\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0014"+
		"\n\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u0013\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0003:\u001d\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0005\u0003\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u00036\u001b\u0000\u00a0\u00a2\u0005\u0016\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u00050\u0000\u0000\u00a4\u00a5"+
		"\u0005 \u0000\u0000\u00a5\u00a6\u0003\u0018\f\u0000\u00a6\u00a7\u0005"+
		"!\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u00036\u001b"+
		"\u0000\u00a9\u00aa\u00050\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000"+
		"\u00ab\u00b0\u0003\u0016\u000b\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000"+
		"\u00ad\u00af\u0003\u0016\u000b\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u0019\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b9\u0005\"\u0000\u0000\u00b6\u00b8\u0003\u001c\u000e\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005#\u0000\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003 \u0010\u0000\u00bf\u00c0\u0005%\u0000\u0000\u00c0\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c7\u0003,\u0016\u0000\u00c2\u00c7\u00032\u0019\u0000"+
		"\u00c3\u00c7\u00034\u001a\u0000\u00c4\u00c7\u0005.\u0000\u0000\u00c5\u00c7"+
		"\u0003\u001e\u000f\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0014\u0000\u0000\u00c9\u00ca\u0003\u0010\b\u0000\u00ca\u00cb\u0005"+
		"%\u0000\u0000\u00cb\u001f\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\u000e"+
		"\u0007\u0000\u00cd\u00d1\u0003\"\u0011\u0000\u00ce\u00d1\u0003$\u0012"+
		"\u0000\u00cf\u00d1\u0003(\u0014\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u00050\u0000\u0000\u00d3\u00d4\u0007\u0001\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0010\b\u0000\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"0\u0000\u0000\u00d7\u00d8\u0005 \u0000\u0000\u00d8\u00d9\u0003\u0018\f"+
		"\u0000\u00d9\u00da\u0005!\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db"+
		"%\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0010\u0000\u0000\u00dd\u00de"+
		"\u00050\u0000\u0000\u00de\u00df\u0005 \u0000\u0000\u00df\u00e0\u0003\u0018"+
		"\f\u0000\u00e0\u00e1\u0005!\u0000\u0000\u00e1\'\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u00050\u0000\u0000\u00e3\u00e4\u0005\u0001\u0000\u0000\u00e4"+
		"\u00e5\u00050\u0000\u0000\u00e5\u00e6\u0005 \u0000\u0000\u00e6\u00e7\u0003"+
		"\u0018\f\u0000\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u00e9\u0003*\u0015"+
		"\u0000\u00e9)\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0001\u0000\u0000"+
		"\u00eb\u00ec\u00050\u0000\u0000\u00ec\u00ed\u0005 \u0000\u0000\u00ed\u00ee"+
		"\u0003\u0018\f\u0000\u00ee\u00ef\u0005!\u0000\u0000\u00ef\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3+\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\f\u0000\u0000\u00f6\u00f7\u0005 \u0000"+
		"\u0000\u00f7\u00f8\u0003\u0010\b\u0000\u00f8\u00f9\u0005!\u0000\u0000"+
		"\u00f9\u00fd\u0003\u001a\r\u0000\u00fa\u00fc\u0003.\u0017\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u00030\u0018\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\t\u0000\u0000\u0104\u0105\u0005\f\u0000\u0000\u0105\u0106\u0005 \u0000"+
		"\u0000\u0106\u0107\u0003\u0010\b\u0000\u0107\u0108\u0005!\u0000\u0000"+
		"\u0108\u0109\u0003\u001a\r\u0000\u0109/\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\t\u0000\u0000\u010b\u010c\u0003\u001a\r\u0000\u010c1\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0017\u0000\u0000\u010e\u010f\u0005"+
		" \u0000\u0000\u010f\u0110\u0003\u0010\b\u0000\u0110\u0111\u0005!\u0000"+
		"\u0000\u0111\u0112\u0003\u001a\r\u0000\u01123\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\b\u0000\u0000\u0114\u0115\u0003\u001a\r\u0000\u0115"+
		"\u0116\u0005\u0017\u0000\u0000\u0116\u0117\u0005 \u0000\u0000\u0117\u0118"+
		"\u0003\u0010\b\u0000\u0118\u0119\u0005!\u0000\u0000\u01195\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0007\u0002\u0000\u0000\u011b7\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0007\u0003\u0000\u0000\u011d9\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0007\u0004\u0000\u0000\u011f;\u0001\u0000\u0000\u0000\u0019"+
		"EMS[^djoqu{\u0089\u0091\u0093\u009a\u009d\u00a1\u00b0\u00b3\u00b9\u00c6"+
		"\u00d0\u00f2\u00fd\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}