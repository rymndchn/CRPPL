// Define a grammar CRPPL.

grammar CRPPL;

//MULTI EXPRESSION.
multiexpr: (validexpr+)? EOF?;

//VALID EXPRESSION.
validexpr: generalquery
         | importfile
         | altercolumn
         | reportvisualization
         | createfunction
         | conditionalstatement
         ;

//PARSER RULES.
generalquery: RESERVEDWORD (OPERATOR RESERVEDWORD)? LITERAL (SEPARATOR LITERAL)* (RESERVEDWORD LITERAL OPERATOR LITERAL (SEPARATOR LITERAL OPERATOR LITERAL)*)?;
importfile: RESERVEDWORD RESERVEDWORD SEPARATOR LITERAL SEPARATOR LITERAL SEPARATOR;
altercolumn: RESERVEDWORD LITERAL RESERVEDWORD LITERAL;
reportvisualization: DO GRAPH OPENPARENTHESIS LITERAL SEPARATOR LITERAL RESERVEDWORD RESERVEDWORD SEPARATOR LITERAL RESERVEDWORD RESERVEDWORD CLOSEPARENTHESIS;
createfunction: RESERVEDWORD IDENTIFIER SEPARATOR (IDENTIFIER (SEPARATOR IDENTIFIER)*)* SEPARATOR multiexpr? RESERVEDWORD;

conditionalstatement: IF (booleanstatement) THEN (validexpr)(validexpr)* (ELSE_IF (booleanstatement) THEN (validexpr)(validexpr)*)* (ELSE (validexpr)(validexpr)*)? END_IF;

booleanstatement: (
  OPENPARENTHESIS (IDENTIFIER|TRUE|FALSE) CLOSEPARENTHESIS | 
  
  OPENPARENTHESIS (LITERAL|IDENTIFIER|TRUE|FALSE| booleanstatement) (OPERATOR (LITERAL|IDENTIFIER|TRUE|FALSE|booleanstatement))* CLOSEPARENTHESIS
);




//LEXER RULES.
fragment A: ('A'|'a');
fragment B: ('B'|'b');
fragment C: ('C'|'c');
fragment D: ('D'|'d');
fragment E: ('E'|'e');
fragment F: ('F'|'f');
fragment G: ('G'|'g');
fragment H: ('H'|'h');
fragment I: ('I'|'i');
fragment J: ('J'|'j');
fragment K: ('K'|'k');
fragment L: ('L'|'l');
fragment M: ('M'|'m');
fragment N: ('N'|'n');
fragment O: ('O'|'o');
fragment P: ('P'|'p');
fragment Q: ('Q'|'q');
fragment R: ('R'|'r');
fragment S: ('S'|'s');
fragment T: ('T'|'t');
fragment U: ('U'|'u');
fragment V: ('V'|'v');
fragment W: ('W'|'w');
fragment X: ('X'|'x');
fragment Y: ('Y'|'y');
fragment Z: ('Z'|'z');

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NUMBERS: [0-9];
fragment UNDERSCORE: '_';
fragment ALPHANUMERIC: [a-zA-Z0-9]*;

//GENERAL QUERY RESERVED WORD LEXEMES
fragment GET: G E T;
fragment OF: O F;
fragment FOR: F O R;
fragment CONSTANT: C O N S T A N T;

//SUB-ROUTINE RESERVED WORD LEXEMES
fragment CREATEFUNCTION: C R E A T E UNDERSCORE F U N C T I O N;
fragment ENDFUNCTION: E N D UNDERSCORE F U N C T I O N;
fragment RETURN: R E T U R N;
DO: D O;

//CONDITIONAL STATEMENT RESERVED WORD LEXEMES
IF: I F;
THEN: T H E N;
ELSE_IF: E L S E UNDERSCORE I F;
ELSE: E L S E;
TRUE: T R U E;
FALSE: F A L S E;
END_IF: E N D UNDERSCORE I F;

//DATASET COLUMN OPERATIONS RESERVED WORD LEXEMES
fragment NEWCOLUMN: N E W UNDERSCORE C O L U M N;
fragment ALTERCOLUMN: A L T E R UNDERSCORE C O L U M N;
fragment DELETECOLUMN: D E L E T E UNDERSCORE C O L U M N;

//FILE IMPORT RESERVED WORD LEXEMES
fragment IMPORTFILE: I M P O R T UNDERSCORE F I L E;

//REPORT VISUALIZATION RESERVED WORD LEXEMES
GRAPH: G R A P H;
fragment IS: I S;
fragment XAXIS: X UNDERSCORE A X I S;
fragment YAXIS: Y UNDERSCORE A X I S;
fragment LABEL: L A B E L;
fragment VALUE: V A L U E;

//OPERATOR LEXEMES
fragment SUM: S U M;
fragment PRODUCT: P R O D U C T;
fragment QUOTIENT: Q U O T I E N T;
fragment DIFFERENCE: D I F F E R E N C E;
fragment EQUALS: '=' | E Q U A L;
fragment GREATERTHAN: G T;
fragment GREATERTHANEQUAL: G T E;
fragment LESSTHAN: L T;
fragment LESSTHANEQUAL: L T E;
fragment NOTEQUAL: N O T UNDERSCORE E Q U A L;
fragment AND: A N D;
fragment OR: O R;

//SEPARATOR LEXEMES
fragment COMMA: ',';
OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';



RESERVEDWORD: (GET | OF | FOR | CONSTANT | CREATEFUNCTION | ENDFUNCTION | RETURN | DO | TRUE | FALSE | NEWCOLUMN | ALTERCOLUMN | DELETECOLUMN | IMPORTFILE | IS | XAXIS | YAXIS | LABEL | VALUE);


OPERATING_FUNCTION: (SUM | PRODUCT | QUOTIENT | DIFFERENCE);
OPERATOR: ( EQUALS | GREATERTHAN | GREATERTHANEQUAL | LESSTHAN | LESSTHANEQUAL | NOTEQUAL | AND | OR);

SEPARATOR: (COMMA);

LITERAL: '\'' (.*?) '\'';

IDENTIFIER: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
TAB: '\t' -> skip;
CARRIAGERETURN: '\r' -> skip;