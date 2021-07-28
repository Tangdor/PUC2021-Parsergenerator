grammar Grammar;



equalsValue :  (ID | NUM | booleans)  DOUBLE_EQUALS (ID | NUM | booleans) ;

addition: (ID | NUM) (PLUS (ID | NUM))+;

subtraction: (ID | NUM) (MINUS (ID | NUM))+;

multiplication: (ID | NUM) ((MUL | DIV) (ID| NUM))+;

variable: ID EQUALS  (NUM | LPAREN equalsValue RPAREN | addition | subtraction |  multiplication ((PLUS | MINUS) multiplication)* | booleans | STRING );

lambda: BACKSLASH ID ARROW expr;

booleans: TRUE | FALSE;

privPubl: PRIVATE | PUBLIC;

returnValue: STRING_VAL | INT | VOID;

ifthen:IF LPAREN (equalsValue|lambda) RPAREN THEN (expr|functions) (ELSE (expr|functions))* ;

let: LET ID EQUALS expr IN expr;

print: PRINT LPAREN STRING RPAREN;

returning: NUM|STRING|ID EQUALS (NUM |addition | subtraction |  multiplication ((PLUS | MINUS) multiplication)* | STRING );

functions: privPubl returnValue ID LPAREN (parameter  COMMA?)* RPAREN LBRACKET (lambda | variable | ifthen | let | print)* (RETURN returning)* RBRACKET| print;

parameter: (INT | STRING_VAL) ID    ;





expr :
      lambda
    | variable
    | ifthen
    | multiplication ((PLUS | MINUS) multiplication)*
    | let
    | addition
    | subtraction

    ;

//Tokens//
NUM:'0'|'-'?[1-9][0-9]*;

//Keywords
VOID: 'void';
COMMA: ',';
IF: 'if';
THEN:'then';
ELSE:'else';
LET :'let';
IN :'in';
PRINT : 'print';
PUBLIC :'public';
PRIVATE: 'private';
STRING: QUOTATIONS (~'"')* QUOTATIONS ;
STRING_VAL: 'string';
INT: 'int';
RETURN: 'return';

//Symbole
LPAREN:  '(' ;
RPAREN:  ')'  ;
BACKSLASH:  '\\' ;
ARROW: '=>' ;
EQUALS: '=';
QUOTATIONS:'"';
RBRACKET : '}';
LBRACKET : '{';
// Operatoren
PLUS:    '+'  ;
MINUS:   '-'  ;
MUL:     '*'  ;
DOUBLE_EQUALS: '==' ;
DIV : '/';


 // Literals
TRUE: 'TRUE';
FALSE: 'FALSE';


ID  : ID_START ID_CHAR*;

    fragment ID_START: [a-zA-Z]+;
    fragment ID_CHAR : ID_START | ('0'..'9') ;

WS: [ \t\r\n] -> skip;