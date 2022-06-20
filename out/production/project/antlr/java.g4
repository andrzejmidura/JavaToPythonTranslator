grammar java;

@header {
    package antlr;
}
prog: imps clss
	;

imps: (KW_IMPORT fpac SEP_SEM)*
	;
fpac: ID('.'ID)*
	;

clss: (classDef)+
	;

classDef:  cls_head SEP_CUBL cls_body SEP_CUBR
	;

cls_head: (KW_PUBLIC)? (KW_ABSTRACT)? KW_CLASS ID (KW_EXTENDS ID)? (KW_IMPLEMENTS ID)*
	;

cls_body: (var_def | mth)*
	;

var_def: (access_mod)? type ID (SEP_ASS expr)? SEP_SEM
	;

expr
	: lit
	| ID
    | funcCall
    | objFuncCall
    | objCreationCall
    | SEP_PARL expr SEP_PARR
	| expr (OP_ARITHM_MUL | OP_REL | OP_LOG) expr
    | expr OP_ARITHM_ADD expr
    ;

mth: mth_head blck
	;

mth_head: (access_mod)? (KW_ABSTRACT)? (type | KW_VOID) ID SEP_PARL marg SEP_PARR
	;

sarg: type ID
	;

marg: (sarg (',' sarg)*)?
	;

blck: SEP_CUBL ln* SEP_CUBR
	;

ln: (stat SEP_SEM) # Statement_line
	| ifStat	# If_statement_line
	| whileStat	# While_statement_line
	| doWhileStatement	# Do_while_statement_line
	| COMMENT	# Comment_line
	| ret_stat # Return_statement_line
	;

ret_stat: KW_RETURN expr SEP_SEM
	;

stat: var_def
	| asgn
	| funcCall
	| objFuncCall
	;

asgn: ID (SEP_ASS | OP_ASSIGN) expr
	;

funcCall: ID SEP_PARL marg SEP_PARR nthFuncCall
	;

objCreationCall: KW_NEW ID SEP_PARL marg SEP_PARR
	;

objFuncCall: ID '.' ID SEP_PARL marg SEP_PARR nthFuncCall
	;

nthFuncCall: ('.' ID SEP_PARL marg SEP_PARR)*
	;

ifStat: KW_IF SEP_PARL expr SEP_PARR blck elseIfStat* elseStat?
	;
	
elseIfStat: KW_ELSE KW_IF SEP_PARL expr SEP_PARR blck
	;

elseStat: KW_ELSE blck
	;

whileStat: KW_WHILE SEP_PARL expr SEP_PARR blck
	;

doWhileStatement: KW_DO blck KW_WHILE SEP_PARL expr SEP_PARR
	;

type: KW_INT | KW_FLOAT | KW_CHAR | KW_BOOLEAN | ID
	;

lit: LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STR | LIT_BOOL | LIT_NULL
	;

access_mod: KW_PRIVATE | KW_PROTECTED | KW_PUBLIC
	;


// tokens



KW_ABSTRACT		: 'abstract';
KW_BOOLEAN		: 'boolean';
KW_CLASS		: 'class';
KW_CASE			: 'case';
KW_CHAR			: 'char';
KW_DO			: 'do';
KW_ELSE			: 'else';
KW_EXTENDS		: 'extends';
KW_FLOAT		: 'float';
KW_IF			: 'if';
KW_IMPLEMENTS	: 'implements';
KW_IMPORT		: 'import';
KW_INT			: 'int';
KW_NEW			: 'new';
KW_PRIVATE		: 'private';
KW_PROTECTED	: 'protected';
KW_PUBLIC		: 'public';
KW_RETURN		: 'return';
KW_SHORT		: 'short';
KW_VOID			: 'void';
KW_WHILE		: 'while';

LIT_INT			: '0' | '-'?[1-9][0-9]*;
LIT_FLOAT		: '-'?('0' | [1-9][0-9]*)'.'[0-9]+;
LIT_CHAR		: '\'' ~'\'' '\'';
LIT_STR			: '"' ~'"'* '"';
LIT_BOOL		: 'true' | 'false';
LIT_NULL		: 'null';

SEP_SQBL		: '[';
SEP_SQBR		: ']';
SEP_PARL		: '(';
SEP_PARR		: ')';
SEP_CUBL		: '{';
SEP_CUBR		: '}';
SEP_ASS			: '=';
SEP_SEM			: ';';

OP_ARITHM_MUL	: '/' | '*' | '%';
OP_ARITHM_ADD	: '+' | '-';
OP_UNARY		: '++' | '--' | '!';
OP_ASSIGN		: '+=' | '-=' | '*=' | '/=' | '%=' | '^=';
OP_REL			: '==' | '!=' | '<' | '>' | '<=' | '>=';
OP_LOG			: '&&' | ' | ';
OP_BITWISE		: '&' | '|' | '^' | '~';
OP_SHIFT		: '<<' | '>>' | '>>>';

COMMENT			: '//' ~('\n')* '\n'
				| '/*' ~('*')* '*/';
				
WS				: [ \t\r\n]+ -> skip;

ID				: [a-zA-Z_$][a-zA-Z0-9_$]*;


