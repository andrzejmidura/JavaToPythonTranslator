grammar java;

@header {
    package antlr;
}

program: imports classes;

imports: (KW_IMPORT full_package SEP_SEM)*;
full_package: PACKAGE_ID('.'PACKAGE_ID)*;

classes: (classDef)+;

classDef:  class_header SEP_CUBL class_body SEP_CUBR;
class_header: (KW_PUBLIC)? (KW_ABSTRACT)? KW_CLASS ID (KW_EXTENDS ID)? (KW_IMPLEMENTS ID)*;
class_body: (varDefinition | method | classDef)*;

varDefinition: (access_mod)? type ID (SEP_ASS expression)? SEP_SEM;

expression
	: literal
	| ID
	| functionCall
	| objectFuncCall
	| objectCreationCall
	| SEP_PARL expression SEP_PARR
	| expression (OP_ARITHM | OP_REL | OP_LOG) expression
	;

method: method_header block;
method_header: (access_mod)? (KW_ABSTRACT)? type ID SEP_PARL multiple_arg SEP_PARR;
single_arg: type ID;
multiple_arg: (single_arg (',' single_arg)*)?;

block: SEP_CUBL line* SEP_CUBR;

line: (statement SEP_SEM) | ifStatement | whileStatement | doWhileStatement | COMMENT | returnStatement;

returnStatement: KW_RETURN expression SEP_SEM;
statement: (varDefinition | assignment | functionCall | objectFuncCall);

assignment: ID (SEP_ASS | OP_ASSIGN) expression;

functionCall: ID SEP_PARL multiple_arg SEP_PARR nthFuncCall;
objectCreationCall: KW_NEW ID SEP_PARL multiple_arg SEP_PARR;
objectFuncCall: ID '.' ID SEP_PARL multiple_arg SEP_PARR nthFuncCall;
nthFuncCall: ('.' ID SEP_PARL multiple_arg SEP_PARR)*;

ifStatement: KW_IF SEP_PARL expression SEP_PARR block elseIfStatement* elseStatement?;
elseIfStatement: KW_ELSE KW_IF SEP_PARL expression SEP_PARR block;
elseStatement: KW_ELSE block;

whileStatement: KW_WHILE SEP_PARL expression SEP_PARR block;

doWhileStatement: KW_DO block KW_WHILE SEP_PARL expression SEP_PARR;

type: KW_INT | KW_FLOAT | KW_CHAR | KW_BOOLEAN | ID;

literal: LIT_INT | LIT_FLOAT | LIT_CHAR | LIT_STR | LIT_BOOL | LIT_NULL;

access_mod: KW_PRIVATE | KW_PROTECTED | KW_PUBLIC;


// tokens

ID				: [a-zA-Z_$][a-zA-Z0-9_$]*;
PACKAGE_ID		: [a-zA-Z]+;

KW_ABSTRACT		: 'abstract';
KW_BOOLEAN		: 'boolean';
KW_BYTE			: 'byte';
KW_BREAK		: 'break';
KW_CLASS		: 'class';
KW_CASE			: 'case';
KW_CATCH		: 'catch';
KW_CHAR			: 'char';
KW_CONST		: 'const';
KW_CONTINUE		: 'continue';
KW_DEFAULT		: 'default';
KW_DO			: 'do';
KW_ELSE			: 'else';
KW_ENUM			: 'enum';
KW_EXTENDS		: 'extends';
KW_FINAL		: 'final';
KW_FINALLY		: 'finally';
KW_FLOAT		: 'float';
KW_FOR			: 'for';
KW_IF			: 'if';
KW_IMPLEMENTS	: 'implements';
KW_IMPORT		: 'import';
KW_INSTANCEOF	: 'instanceof';
KW_INT			: 'int';
KW_INTERFACE	: 'interface';
KW_LONG			: 'long';
KW_NEW			: 'new';
KW_PACKAGE		: 'package';
KW_PRIVATE		: 'private';
KW_PROTECTED	: 'protected';
KW_PUBLIC		: 'public';
KW_RETURN		: 'return';
KW_SHORT		: 'short';
KW_STATIC		: 'static';
KW_SWITCH		: 'switch';
KW_THIS			: 'this';
KW_THROW		: 'throw';
KW_THROWS		: 'throws';
KW_TRY			: 'try';
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
SEP_COM			: ',';
SEP_ASS			: '=';
SEP_SEM			: ';';
SEP_PER			: '.';

OP_ARITHM		: '+' | '-' | '/' | '*' | '%';
OP_UNARY		: '++' | '--' | '!';
OP_ASSIGN		: '+=' | '-=' | '*=' | '/=' | '%=' | '^=';
OP_REL			: '==' | '!=' | '<' | '>' | '<=' | '>=';
OP_LOG			: '&&' | ' | ';
OP_BITWISE		: '&' | '|' | '^' | '~';
OP_SHIFT		: '<<' | '>>' | '>>>';

COMMENT			: '//' .* ('\n' | EOF)
				| '/*' .* '*/';
WS				: [ \t\r\n]+ -> skip;


