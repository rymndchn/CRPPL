// Define a grammar CRPPL.

grammar CRPPL;

//MULTI EXPRESSION.
multiexpr: (validexpr+)? EOF?;

//VALID EXPRESSION.
validexpr: generalquery
         | importfile
         | defineconstant
         | altercolumn
         | graphquery
         | createfunction
         | conditionalstatement
         ;

//PARSER RULES.
generalquery: GET (OPERATING_FUNCTION OF)? (LITERAL|IDENTIFIER) (SEPARATOR GET (OPERATOR OF)? (LITERAL|IDENTIFIER))* (FOR (LITERAL|IDENTIFIER) OPERATOR (LITERAL|IDENTIFIER) (SEPARATOR (LITERAL|IDENTIFIER) OPERATOR (LITERAL|IDENTIFIER))*)?;
importfile: RESERVEDWORD_DO IMPORTFILE OPENPARENTHESIS (LITERAL|IDENTIFIER) SEPARATOR (LITERAL|IDENTIFIER) CLOSEPARENTHESIS;
defineconstant: IDENTIFIER RESERVEDWORD_CONSTANT LITERAL;
altercolumn: (NEWCOLUMN|ALTERCOLUMN|DELETECOLUMN) (LITERAL|IDENTIFIER) FOR (LITERAL|IDENTIFIER);
graphquery: RESERVEDWORD_DO GRAPH OPENPARENTHESIS (TYPE)? SEPARATOR LITERAL ASSIGNEMT_OPERATOR LABELONE SEPARATOR LITERAL ASSIGNEMT_OPERATOR LABELTWO CLOSEPARENTHESIS;

createfunction: CREATEFUNCTION IDENTIFIER OPENPARENTHESIS (IDENTIFIER (SEPARATOR IDENTIFIER)*)? CLOSEPARENTHESIS ((generalquery | importfile | altercolumn | graphquery | conditionalstatement)*?) (RETURN IDENTIFIER)? ENDFUNCTION;

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
GET: G E T;
OF: O F;
FOR: F O R;

//SUB-ROUTINE RESERVED WORD LEXEMES
CREATEFUNCTION: C R E A T E UNDERSCORE F U N C T I O N;
ENDFUNCTION: E N D UNDERSCORE F U N C T I O N;
RETURN: R E T U R N;

//CONDITIONAL STATEMENT RESERVED WORD LEXEMES
IF: I F;
THEN: T H E N;
ELSE_IF: E L S E UNDERSCORE I F;
ELSE: E L S E;
TRUE: T R U E;
FALSE: F A L S E;
END_IF: E N D UNDERSCORE I F;

//DATASET COLUMN OPERATIONS RESERVED WORD LEXEMES
NEWCOLUMN: N E W UNDERSCORE C O L U M N;
ALTERCOLUMN: A L T E R UNDERSCORE C O L U M N;
DELETECOLUMN: D E L E T E UNDERSCORE C O L U M N;

//FILE IMPORT RESERVED WORD LEXEMES
IMPORTFILE: I M P O R T UNDERSCORE F I L E;
ASSIGNEMT_OPERATOR: I S;
RESERVEDWORD_DO: D O;

//DEFINING CONSTANT RESERVED WORDS LEXEMES
RESERVEDWORD_CONSTANT: C O N S T A N T;

//GRAPH QUERY RESERVED WORD LEXEMES
GRAPH : G R A P H;
TYPE: (PIE | BAR | LINE);
LABELONE: (X_AXIS | LABEL);
LABELTWO: (Y_AXIS | VALUE);
//TABLECOLUMN: '\''(LOWERCASE | UPPERCASE | UNDERSCORE)+'\'';

fragment PIE: P I E;
fragment BAR: B A R;
fragment LINE: L I N E;
fragment X_AXIS: X UNDERSCORE A X I S;
fragment LABEL: L A B E L;
fragment Y_AXIS: Y UNDERSCORE A X I S;
fragment VALUE: V A L U E;

//OPERATING FUNCTION LEXEMES
fragment SUM: S U M;
fragment PRODUCT: P R O D U C T;
fragment QUOTIENT: Q U O T I E N T;
fragment DIFFERENCE: D I F F E R E N C E;

//OPERATOR LEXEMES
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

RESERVEDWORD: ( TRUE | FALSE);

OPERATING_FUNCTION: (SUM | PRODUCT | QUOTIENT | DIFFERENCE);
OPERATOR: ( EQUALS | GREATERTHAN | GREATERTHANEQUAL | LESSTHAN | LESSTHANEQUAL | NOTEQUAL | AND | OR);

SEPARATOR: (COMMA);

LITERAL: '\'' (.*?) '\'';

IDENTIFIER: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
TAB: '\t' -> skip;
CARRIAGERETURN: '\r' -> skip;