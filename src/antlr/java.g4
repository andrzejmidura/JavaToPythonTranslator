grammar java;

@header {
    package antlr;
}
prog: imps clss # Program
	;

imps: (KW_IMPORT fpac SEP_SEM)*	# Imports
	;
fpac: ID('.'ID)* # Full_package
	;

clss: (classDef)+ # Classes
	;

classDef:  cls_head SEP_CUBL cls_body SEP_CUBR # Class_definition
	;

cls_head: (KW_PUBLIC)? (KW_ABSTRACT)? KW_CLASS ID (KW_EXTENDS ID)? (KW_IMPLEMENTS ID)* # Class_header
	;

cls_body: (var_def | mth | classDef)* # Class_body
	;

var_def: (access_mod)? type ID (SEP_ASS expr)? SEP_SEM # Variable_definition
	;

expr
	: lit	# Literal_expression
	| ID	# Identifier_expression
    | funcCall	# Function_call_expression
    | objFuncCall	# Object_function_call_expression
    | objCreationCall	# Object_creation_call_expression
    | SEP_PARL expr SEP_PARR # Parentheses_expression
	| expr (OP_ARITHM_MUL | OP_REL | OP_LOG) expr	# Multiplicative_expression
    | expr OP_ARITHM_ADD expr	# Additive_expression
    ;

mth: mth_head blck # Method
	;

mth_head: (access_mod)? (KW_ABSTRACT)? (type | KW_VOID) ID SEP_PARL marg SEP_PARR # Method_header
	;

sarg: type ID # Single_arg
	;

marg: (sarg (',' sarg)*)? # Multiple_arg
	;

blck: SEP_CUBL ln* SEP_CUBR # Block
	;

ln: (stat SEP_SEM) # Statement_line
	| ifStat	# If_statement_line
	| whileStat	# While_statement_line
	| doWhileStatement	# Do_while_statement_line
	| COMMENT	# Comment_line
	| ret_stat # Return_statement_line
	;

ret_stat: KW_RETURN expr SEP_SEM # Return_statement
	;

stat: (var_def | asgn | funcCall | objFuncCall) # Statement
	;

asgn: ID (SEP_ASS | OP_ASSIGN) expr # Assigment
	;

funcCall: ID SEP_PARL marg SEP_PARR nthFuncCall # Function_call
	;

objCreationCall: KW_NEW ID SEP_PARL marg SEP_PARR # Object_creation_call
	;

objFuncCall: ID '.' ID SEP_PARL marg SEP_PARR nthFuncCall	# Object_function_call
	;

nthFuncCall: ('.' ID SEP_PARL marg SEP_PARR)* # Nth_func_call
	;

ifStat: KW_IF SEP_PARL expr SEP_PARR blck elseIfStat* elseStat? # If_statement
	;
	
elseIfStat: KW_ELSE KW_IF SEP_PARL expr SEP_PARR blck # Else_if_statement
	;

elseStat: KW_ELSE blck # Else_statement
	;

whileStat: KW_WHILE SEP_PARL expr SEP_PARR blck # While_statement
	;

doWhileStatement: KW_DO blck KW_WHILE SEP_PARL expr SEP_PARR # Do_while_statement
	;

type: KW_INT | KW_FLOAT | KW_CHAR | KW_BOOLEAN | ID # Type
	;

lit: LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STR | LIT_BOOL | LIT_NULL # Literal
	;

access_mod: KW_PRIVATE | KW_PROTECTED | KW_PUBLIC # Access_modifier
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


