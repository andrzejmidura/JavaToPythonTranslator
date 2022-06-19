// Generated from java.g4 by ANTLR 4.10.1

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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public ImpsContext imps() {
			return getRuleContext(ImpsContext.class,0);
		}
		public ClssContext clss() {
			return getRuleContext(ClssContext.class,0);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new ProgramContext(_localctx);
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
		public ImpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imps; }
	 
		public ImpsContext() { }
		public void copyFrom(ImpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportsContext extends ImpsContext {
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
		public ImportsContext(ImpsContext ctx) { copyFrom(ctx); }
	}

	public final ImpsContext imps() throws RecognitionException {
		ImpsContext _localctx = new ImpsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imps);
		int _la;
		try {
			_localctx = new ImportsContext(_localctx);
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
		public FpacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpac; }
	 
		public FpacContext() { }
		public void copyFrom(FpacContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Full_packageContext extends FpacContext {
		public List<TerminalNode> ID() { return getTokens(javaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(javaParser.ID, i);
		}
		public Full_packageContext(FpacContext ctx) { copyFrom(ctx); }
	}

	public final FpacContext fpac() throws RecognitionException {
		FpacContext _localctx = new FpacContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fpac);
		int _la;
		try {
			_localctx = new Full_packageContext(_localctx);
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
		public ClssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clss; }
	 
		public ClssContext() { }
		public void copyFrom(ClssContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassesContext extends ClssContext {
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public ClassesContext(ClssContext ctx) { copyFrom(ctx); }
	}

	public final ClssContext clss() throws RecognitionException {
		ClssContext _localctx = new ClssContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clss);
		int _la;
		try {
			_localctx = new ClassesContext(_localctx);
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
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	 
		public ClassDefContext() { }
		public void copyFrom(ClassDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_definitionContext extends ClassDefContext {
		public Cls_headContext cls_head() {
			return getRuleContext(Cls_headContext.class,0);
		}
		public TerminalNode SEP_CUBL() { return getToken(javaParser.SEP_CUBL, 0); }
		public Cls_bodyContext cls_body() {
			return getRuleContext(Cls_bodyContext.class,0);
		}
		public TerminalNode SEP_CUBR() { return getToken(javaParser.SEP_CUBR, 0); }
		public Class_definitionContext(ClassDefContext ctx) { copyFrom(ctx); }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDef);
		try {
			_localctx = new Class_definitionContext(_localctx);
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
		public Cls_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_head; }
	 
		public Cls_headContext() { }
		public void copyFrom(Cls_headContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_headerContext extends Cls_headContext {
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
		public Class_headerContext(Cls_headContext ctx) { copyFrom(ctx); }
	}

	public final Cls_headContext cls_head() throws RecognitionException {
		Cls_headContext _localctx = new Cls_headContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cls_head);
		int _la;
		try {
			_localctx = new Class_headerContext(_localctx);
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
		public Cls_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_body; }
	 
		public Cls_bodyContext() { }
		public void copyFrom(Cls_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_bodyContext extends Cls_bodyContext {
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
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public Class_bodyContext(Cls_bodyContext ctx) { copyFrom(ctx); }
	}

	public final Cls_bodyContext cls_body() throws RecognitionException {
		Cls_bodyContext _localctx = new Cls_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cls_body);
		int _la;
		try {
			_localctx = new Class_bodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ABSTRACT) | (1L << KW_BOOLEAN) | (1L << KW_CLASS) | (1L << KW_CHAR) | (1L << KW_FLOAT) | (1L << KW_INT) | (1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC) | (1L << KW_VOID) | (1L << ID))) != 0)) {
				{
				setState(112);
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
				case 3:
					{
					setState(111);
					classDef();
					}
					break;
				}
				}
				setState(116);
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
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	 
		public Var_defContext() { }
		public void copyFrom(Var_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Variable_definitionContext extends Var_defContext {
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
		public Variable_definitionContext(Var_defContext ctx) { copyFrom(ctx); }
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_def);
		int _la;
		try {
			_localctx = new Variable_definitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC))) != 0)) {
				{
				setState(117);
				access_mod();
				}
			}

			setState(120);
			type();
			setState(121);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP_ASS) {
				{
				setState(122);
				match(SEP_ASS);
				setState(123);
				expr(0);
				}
			}

			setState(126);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_call_expressionContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public Function_call_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Literal_expressionContext extends ExprContext {
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public Literal_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Multiplicative_expressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_ARITHM_MUL() { return getToken(javaParser.OP_ARITHM_MUL, 0); }
		public TerminalNode OP_REL() { return getToken(javaParser.OP_REL, 0); }
		public TerminalNode OP_LOG() { return getToken(javaParser.OP_LOG, 0); }
		public Multiplicative_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Parentheses_expressionContext extends ExprContext {
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public Parentheses_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Object_creation_call_expressionContext extends ExprContext {
		public ObjCreationCallContext objCreationCall() {
			return getRuleContext(ObjCreationCallContext.class,0);
		}
		public Object_creation_call_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Identifier_expressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public Identifier_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Object_function_call_expressionContext extends ExprContext {
		public ObjFuncCallContext objFuncCall() {
			return getRuleContext(ObjFuncCallContext.class,0);
		}
		public Object_function_call_expressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Additive_expressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_ARITHM_ADD() { return getToken(javaParser.OP_ARITHM_ADD, 0); }
		public Additive_expressionContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new Literal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				lit();
				}
				break;
			case 2:
				{
				_localctx = new Identifier_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				funcCall();
				}
				break;
			case 4:
				{
				_localctx = new Object_function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				objFuncCall();
				}
				break;
			case 5:
				{
				_localctx = new Object_creation_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				objCreationCall();
				}
				break;
			case 6:
				{
				_localctx = new Parentheses_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(SEP_PARL);
				setState(135);
				expr(0);
				setState(136);
				match(SEP_PARR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARITHM_MUL) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Additive_expressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(144);
						match(OP_ARITHM_ADD);
						setState(145);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(150);
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
		public MthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mth; }
	 
		public MthContext() { }
		public void copyFrom(MthContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends MthContext {
		public Mth_headContext mth_head() {
			return getRuleContext(Mth_headContext.class,0);
		}
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public MethodContext(MthContext ctx) { copyFrom(ctx); }
	}

	public final MthContext mth() throws RecognitionException {
		MthContext _localctx = new MthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mth);
		try {
			_localctx = new MethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			mth_head();
			setState(152);
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
		public Mth_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mth_head; }
	 
		public Mth_headContext() { }
		public void copyFrom(Mth_headContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Method_headerContext extends Mth_headContext {
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
		public Method_headerContext(Mth_headContext ctx) { copyFrom(ctx); }
	}

	public final Mth_headContext mth_head() throws RecognitionException {
		Mth_headContext _localctx = new Mth_headContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mth_head);
		int _la;
		try {
			_localctx = new Method_headerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC))) != 0)) {
				{
				setState(154);
				access_mod();
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ABSTRACT) {
				{
				setState(157);
				match(KW_ABSTRACT);
				}
			}

			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_INT:
			case ID:
				{
				setState(160);
				type();
				}
				break;
			case KW_VOID:
				{
				setState(161);
				match(KW_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			match(ID);
			setState(165);
			match(SEP_PARL);
			setState(166);
			marg();
			setState(167);
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
		public SargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sarg; }
	 
		public SargContext() { }
		public void copyFrom(SargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single_argContext extends SargContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public Single_argContext(SargContext ctx) { copyFrom(ctx); }
	}

	public final SargContext sarg() throws RecognitionException {
		SargContext _localctx = new SargContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sarg);
		try {
			_localctx = new Single_argContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			type();
			setState(170);
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
		public MargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marg; }
	 
		public MargContext() { }
		public void copyFrom(MargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multiple_argContext extends MargContext {
		public List<SargContext> sarg() {
			return getRuleContexts(SargContext.class);
		}
		public SargContext sarg(int i) {
			return getRuleContext(SargContext.class,i);
		}
		public Multiple_argContext(MargContext ctx) { copyFrom(ctx); }
	}

	public final MargContext marg() throws RecognitionException {
		MargContext _localctx = new MargContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_marg);
		int _la;
		try {
			_localctx = new Multiple_argContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_FLOAT) | (1L << KW_INT) | (1L << ID))) != 0)) {
				{
				setState(172);
				sarg();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(173);
					match(T__1);
					setState(174);
					sarg();
					}
					}
					setState(179);
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
		public BlckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck; }
	 
		public BlckContext() { }
		public void copyFrom(BlckContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockContext extends BlckContext {
		public TerminalNode SEP_CUBL() { return getToken(javaParser.SEP_CUBL, 0); }
		public TerminalNode SEP_CUBR() { return getToken(javaParser.SEP_CUBR, 0); }
		public List<LnContext> ln() {
			return getRuleContexts(LnContext.class);
		}
		public LnContext ln(int i) {
			return getRuleContext(LnContext.class,i);
		}
		public BlockContext(BlckContext ctx) { copyFrom(ctx); }
	}

	public final BlckContext blck() throws RecognitionException {
		BlckContext _localctx = new BlckContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blck);
		int _la;
		try {
			_localctx = new BlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SEP_CUBL);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BOOLEAN) | (1L << KW_CHAR) | (1L << KW_DO) | (1L << KW_FLOAT) | (1L << KW_IF) | (1L << KW_INT) | (1L << KW_PRIVATE) | (1L << KW_PROTECTED) | (1L << KW_PUBLIC) | (1L << KW_RETURN) | (1L << KW_WHILE) | (1L << COMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(183);
				ln();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
	}
	public static class Comment_lineContext extends LnContext {
		public TerminalNode COMMENT() { return getToken(javaParser.COMMENT, 0); }
		public Comment_lineContext(LnContext ctx) { copyFrom(ctx); }
	}
	public static class If_statement_lineContext extends LnContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public If_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
	}
	public static class Return_statement_lineContext extends LnContext {
		public Ret_statContext ret_stat() {
			return getRuleContext(Ret_statContext.class,0);
		}
		public Return_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_lineContext extends LnContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode SEP_SEM() { return getToken(javaParser.SEP_SEM, 0); }
		public Statement_lineContext(LnContext ctx) { copyFrom(ctx); }
	}
	public static class Do_while_statement_lineContext extends LnContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public Do_while_statement_lineContext(LnContext ctx) { copyFrom(ctx); }
	}

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ln);
		try {
			setState(199);
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
				setState(191);
				stat();
				setState(192);
				match(SEP_SEM);
				}
				}
				break;
			case KW_IF:
				_localctx = new If_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				ifStat();
				}
				break;
			case KW_WHILE:
				_localctx = new While_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				whileStat();
				}
				break;
			case KW_DO:
				_localctx = new Do_while_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				doWhileStatement();
				}
				break;
			case COMMENT:
				_localctx = new Comment_lineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(COMMENT);
				}
				break;
			case KW_RETURN:
				_localctx = new Return_statement_lineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
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
		public Ret_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stat; }
	 
		public Ret_statContext() { }
		public void copyFrom(Ret_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_statementContext extends Ret_statContext {
		public TerminalNode KW_RETURN() { return getToken(javaParser.KW_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_SEM() { return getToken(javaParser.SEP_SEM, 0); }
		public Return_statementContext(Ret_statContext ctx) { copyFrom(ctx); }
	}

	public final Ret_statContext ret_stat() throws RecognitionException {
		Ret_statContext _localctx = new Ret_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ret_stat);
		try {
			_localctx = new Return_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(KW_RETURN);
			setState(202);
			expr(0);
			setState(203);
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementContext extends StatContext {
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
		public StatementContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat);
		try {
			_localctx = new StatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(205);
				var_def();
				}
				break;
			case 2:
				{
				setState(206);
				asgn();
				}
				break;
			case 3:
				{
				setState(207);
				funcCall();
				}
				break;
			case 4:
				{
				setState(208);
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
		public AsgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgn; }
	 
		public AsgnContext() { }
		public void copyFrom(AsgnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssigmentContext extends AsgnContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_ASS() { return getToken(javaParser.SEP_ASS, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(javaParser.OP_ASSIGN, 0); }
		public AssigmentContext(AsgnContext ctx) { copyFrom(ctx); }
	}

	public final AsgnContext asgn() throws RecognitionException {
		AsgnContext _localctx = new AsgnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asgn);
		int _la;
		try {
			_localctx = new AssigmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==SEP_ASS || _la==OP_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
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
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	 
		public FuncCallContext() { }
		public void copyFrom(FuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_callContext extends FuncCallContext {
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public NthFuncCallContext nthFuncCall() {
			return getRuleContext(NthFuncCallContext.class,0);
		}
		public Function_callContext(FuncCallContext ctx) { copyFrom(ctx); }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCall);
		try {
			_localctx = new Function_callContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			setState(216);
			match(SEP_PARL);
			setState(217);
			marg();
			setState(218);
			match(SEP_PARR);
			setState(219);
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
		public ObjCreationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objCreationCall; }
	 
		public ObjCreationCallContext() { }
		public void copyFrom(ObjCreationCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Object_creation_callContext extends ObjCreationCallContext {
		public TerminalNode KW_NEW() { return getToken(javaParser.KW_NEW, 0); }
		public TerminalNode ID() { return getToken(javaParser.ID, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public MargContext marg() {
			return getRuleContext(MargContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public Object_creation_callContext(ObjCreationCallContext ctx) { copyFrom(ctx); }
	}

	public final ObjCreationCallContext objCreationCall() throws RecognitionException {
		ObjCreationCallContext _localctx = new ObjCreationCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objCreationCall);
		try {
			_localctx = new Object_creation_callContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(KW_NEW);
			setState(222);
			match(ID);
			setState(223);
			match(SEP_PARL);
			setState(224);
			marg();
			setState(225);
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
		public ObjFuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFuncCall; }
	 
		public ObjFuncCallContext() { }
		public void copyFrom(ObjFuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Object_function_callContext extends ObjFuncCallContext {
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
		public Object_function_callContext(ObjFuncCallContext ctx) { copyFrom(ctx); }
	}

	public final ObjFuncCallContext objFuncCall() throws RecognitionException {
		ObjFuncCallContext _localctx = new ObjFuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objFuncCall);
		try {
			_localctx = new Object_function_callContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(T__0);
			setState(229);
			match(ID);
			setState(230);
			match(SEP_PARL);
			setState(231);
			marg();
			setState(232);
			match(SEP_PARR);
			setState(233);
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
		public NthFuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nthFuncCall; }
	 
		public NthFuncCallContext() { }
		public void copyFrom(NthFuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Nth_func_callContext extends NthFuncCallContext {
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
		public Nth_func_callContext(NthFuncCallContext ctx) { copyFrom(ctx); }
	}

	public final NthFuncCallContext nthFuncCall() throws RecognitionException {
		NthFuncCallContext _localctx = new NthFuncCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nthFuncCall);
		try {
			int _alt;
			_localctx = new Nth_func_callContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					match(T__0);
					setState(236);
					match(ID);
					setState(237);
					match(SEP_PARL);
					setState(238);
					marg();
					setState(239);
					match(SEP_PARR);
					}
					} 
				}
				setState(245);
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
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
	 
		public IfStatContext() { }
		public void copyFrom(IfStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_statementContext extends IfStatContext {
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
		public If_statementContext(IfStatContext ctx) { copyFrom(ctx); }
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStat);
		int _la;
		try {
			int _alt;
			_localctx = new If_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KW_IF);
			setState(247);
			match(SEP_PARL);
			setState(248);
			expr(0);
			setState(249);
			match(SEP_PARR);
			setState(250);
			blck();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					elseIfStat();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(257);
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
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
	 
		public ElseIfStatContext() { }
		public void copyFrom(ElseIfStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Else_if_statementContext extends ElseIfStatContext {
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
		public Else_if_statementContext(ElseIfStatContext ctx) { copyFrom(ctx); }
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseIfStat);
		try {
			_localctx = new Else_if_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(KW_ELSE);
			setState(261);
			match(KW_IF);
			setState(262);
			match(SEP_PARL);
			setState(263);
			expr(0);
			setState(264);
			match(SEP_PARR);
			setState(265);
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
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
	 
		public ElseStatContext() { }
		public void copyFrom(ElseStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Else_statementContext extends ElseStatContext {
		public TerminalNode KW_ELSE() { return getToken(javaParser.KW_ELSE, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public Else_statementContext(ElseStatContext ctx) { copyFrom(ctx); }
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseStat);
		try {
			_localctx = new Else_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(KW_ELSE);
			setState(268);
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
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
	 
		public WhileStatContext() { }
		public void copyFrom(WhileStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_statementContext extends WhileStatContext {
		public TerminalNode KW_WHILE() { return getToken(javaParser.KW_WHILE, 0); }
		public TerminalNode SEP_PARL() { return getToken(javaParser.SEP_PARL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP_PARR() { return getToken(javaParser.SEP_PARR, 0); }
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public While_statementContext(WhileStatContext ctx) { copyFrom(ctx); }
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStat);
		try {
			_localctx = new While_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(KW_WHILE);
			setState(271);
			match(SEP_PARL);
			setState(272);
			expr(0);
			setState(273);
			match(SEP_PARR);
			setState(274);
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
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	 
		public DoWhileStatementContext() { }
		public void copyFrom(DoWhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Do_while_statementContext extends DoWhileStatementContext {
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
		public Do_while_statementContext(DoWhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doWhileStatement);
		try {
			_localctx = new Do_while_statementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(KW_DO);
			setState(277);
			blck();
			setState(278);
			match(KW_WHILE);
			setState(279);
			match(SEP_PARL);
			setState(280);
			expr(0);
			setState(281);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
	}

	public final Access_modContext access_mod() throws RecognitionException {
		Access_modContext _localctx = new Access_modContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_access_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		"\u0004\u00010\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0005l\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006q\b\u0006"+
		"\n\u0006\f\u0006t\t\u0006\u0001\u0007\u0003\u0007w\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007}\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0003\n\u009c\b\n\u0001\n\u0003\n\u009f\b\n\u0001\n\u0001\n\u0003"+
		"\n\u00a3\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00b0\b\f\n\f\f\f\u00b3"+
		"\t\f\u0003\f\u00b5\b\f\u0001\r\u0001\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00d2\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f2\b\u0015\n"+
		"\u0015\f\u0015\u00f5\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00fd\b\u0016\n\u0016\f\u0016"+
		"\u0100\t\u0016\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001\u0010"+
		"\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0005\u0002\u0000&&*+\u0002\u0000"+
		"$$))\u0005\u0000\u0004\u0004\u0007\u0007\u000b\u000b\u000f\u000f00\u0001"+
		"\u0000\u0018\u001d\u0001\u0000\u0011\u0013\u0127\u0000<\u0001\u0000\u0000"+
		"\u0000\u0002E\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006"+
		"Q\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fr\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"\u008a\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014"+
		"\u009b\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018"+
		"\u00b4\u0001\u0000\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c"+
		"\u00c7\u0001\u0000\u0000\u0000\u001e\u00c9\u0001\u0000\u0000\u0000 \u00d1"+
		"\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00d7\u0001"+
		"\u0000\u0000\u0000&\u00dd\u0001\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000"+
		"\u0000*\u00f3\u0001\u0000\u0000\u0000,\u00f6\u0001\u0000\u0000\u0000."+
		"\u0104\u0001\u0000\u0000\u00000\u010b\u0001\u0000\u0000\u00002\u010e\u0001"+
		"\u0000\u0000\u00004\u0114\u0001\u0000\u0000\u00006\u011b\u0001\u0000\u0000"+
		"\u00008\u011d\u0001\u0000\u0000\u0000:\u011f\u0001\u0000\u0000\u0000<"+
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
		"mq\u0003\u000e\u0007\u0000nq\u0003\u0012\t\u0000oq\u0003\b\u0004\u0000"+
		"pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000s\r\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0003"+
		":\u001d\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u00036\u001b\u0000y|\u00050\u0000\u0000z{\u0005$"+
		"\u0000\u0000{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005%\u0000\u0000\u007f"+
		"\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0006\b\uffff\uffff\u0000\u0081"+
		"\u008b\u00038\u001c\u0000\u0082\u008b\u00050\u0000\u0000\u0083\u008b\u0003"+
		"$\u0012\u0000\u0084\u008b\u0003(\u0014\u0000\u0085\u008b\u0003&\u0013"+
		"\u0000\u0086\u0087\u0005 \u0000\u0000\u0087\u0088\u0003\u0010\b\u0000"+
		"\u0088\u0089\u0005!\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0080\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a"+
		"\u0083\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a"+
		"\u0085\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b"+
		"\u0094\u0001\u0000\u0000\u0000\u008c\u008d\n\u0002\u0000\u0000\u008d\u008e"+
		"\u0007\u0000\u0000\u0000\u008e\u0093\u0003\u0010\b\u0003\u008f\u0090\n"+
		"\u0001\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091\u0093\u0003\u0010"+
		"\b\u0002\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0011\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000"+
		"\u0098\u0099\u0003\u001a\r\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0003:\u001d\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0005\u0003\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u00036\u001b\u0000\u00a1\u00a3\u0005\u0016\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u00050\u0000\u0000\u00a5\u00a6\u0005 \u0000"+
		"\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00a8\u0005!\u0000\u0000"+
		"\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u00036\u001b\u0000\u00aa"+
		"\u00ab\u00050\u0000\u0000\u00ab\u0017\u0001\u0000\u0000\u0000\u00ac\u00b1"+
		"\u0003\u0016\u000b\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae\u00b0"+
		"\u0003\u0016\u000b\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00ba"+
		"\u0005\"\u0000\u0000\u00b7\u00b9\u0003\u001c\u000e\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"#\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003 \u0010"+
		"\u0000\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c8\u0003,\u0016\u0000\u00c3\u00c8\u00032\u0019\u0000\u00c4\u00c8"+
		"\u00034\u001a\u0000\u00c5\u00c8\u0005.\u0000\u0000\u00c6\u00c8\u0003\u001e"+
		"\u000f\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0014"+
		"\u0000\u0000\u00ca\u00cb\u0003\u0010\b\u0000\u00cb\u00cc\u0005%\u0000"+
		"\u0000\u00cc\u001f\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003\u000e\u0007"+
		"\u0000\u00ce\u00d2\u0003\"\u0011\u0000\u00cf\u00d2\u0003$\u0012\u0000"+
		"\u00d0\u00d2\u0003(\u0014\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2!\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u00050\u0000\u0000\u00d4\u00d5\u0007\u0001\u0000\u0000\u00d5\u00d6\u0003"+
		"\u0010\b\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8\u00050\u0000"+
		"\u0000\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00da\u0003\u0018\f\u0000"+
		"\u00da\u00db\u0005!\u0000\u0000\u00db\u00dc\u0003*\u0015\u0000\u00dc%"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0010\u0000\u0000\u00de\u00df"+
		"\u00050\u0000\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0\u00e1\u0003\u0018"+
		"\f\u0000\u00e1\u00e2\u0005!\u0000\u0000\u00e2\'\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5"+
		"\u00e6\u00050\u0000\u0000\u00e6\u00e7\u0005 \u0000\u0000\u00e7\u00e8\u0003"+
		"\u0018\f\u0000\u00e8\u00e9\u0005!\u0000\u0000\u00e9\u00ea\u0003*\u0015"+
		"\u0000\u00ea)\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000\u0000"+
		"\u00ec\u00ed\u00050\u0000\u0000\u00ed\u00ee\u0005 \u0000\u0000\u00ee\u00ef"+
		"\u0003\u0018\f\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\f\u0000\u0000\u00f7\u00f8\u0005 \u0000"+
		"\u0000\u00f8\u00f9\u0003\u0010\b\u0000\u00f9\u00fa\u0005!\u0000\u0000"+
		"\u00fa\u00fe\u0003\u001a\r\u0000\u00fb\u00fd\u0003.\u0017\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u00030\u0018\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103-\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\t\u0000\u0000\u0105\u0106\u0005\f\u0000\u0000\u0106\u0107\u0005 \u0000"+
		"\u0000\u0107\u0108\u0003\u0010\b\u0000\u0108\u0109\u0005!\u0000\u0000"+
		"\u0109\u010a\u0003\u001a\r\u0000\u010a/\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\t\u0000\u0000\u010c\u010d\u0003\u001a\r\u0000\u010d1\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u0017\u0000\u0000\u010f\u0110\u0005"+
		" \u0000\u0000\u0110\u0111\u0003\u0010\b\u0000\u0111\u0112\u0005!\u0000"+
		"\u0000\u0112\u0113\u0003\u001a\r\u0000\u01133\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\b\u0000\u0000\u0115\u0116\u0003\u001a\r\u0000\u0116"+
		"\u0117\u0005\u0017\u0000\u0000\u0117\u0118\u0005 \u0000\u0000\u0118\u0119"+
		"\u0003\u0010\b\u0000\u0119\u011a\u0005!\u0000\u0000\u011a5\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0007\u0002\u0000\u0000\u011c7\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0007\u0003\u0000\u0000\u011e9\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0007\u0004\u0000\u0000\u0120;\u0001\u0000\u0000\u0000\u0019"+
		"EMS[^djprv|\u008a\u0092\u0094\u009b\u009e\u00a2\u00b1\u00b4\u00ba\u00c7"+
		"\u00d1\u00f3\u00fe\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}