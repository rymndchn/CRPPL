// Define a grammar CRPPL.

grammar CRPPL;

//MULTI EXPRESSION.
multiexpr: (validexpr+)? EOF?;

//VALID EXPRESSION.
validexpr: generalquery
         | importfile
         | altercolumn
         | createfunction
         | conditionalstatement
         | graphquery
         ;

//PARSER RULES.
generalquery: RESERVEDWORD (OPERATOR RESERVEDWORD)? LITERAL (SEPARATOR LITERAL)* (RESERVEDWORD LITERAL OPERATOR LITERAL (SEPARATOR LITERAL OPERATOR LITERAL)*)?;
importfile: RESERVEDWORD RESERVEDWORD SEPARATOR LITERAL SEPARATOR LITERAL SEPARATOR;
altercolumn: RESERVEDWORD LITERAL RESERVEDWORD LITERAL;
createfunction: RESERVEDWORD IDENTIFIER SEPARATOR (IDENTIFIER (SEPARATOR IDENTIFIER)*)* SEPARATOR multiexpr? RESERVEDWORD;
conditionalstatement: RESERVEDWORD IDENTIFIER OPERATOR LITERAL (OPERATOR IDENTIFIER OPERATOR LITERAL)* RESERVEDWORD multiexpr? (RESERVEDWORD multiexpr)? RESERVEDWORD;
graphquery: DO GRAPH PARENTHESIS (TYPE)? COMMA TABLECOLUMN IS LABELONE COMMA TABLECOLUMN IS LABELTWO PARENTHESIS;


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
fragment DO: D O;

//CONDITIONAL STATEMENT RESERVED WORD LEXEMES
fragment IF: I F;
fragment THEN: T H E N;
fragment ELSEIF: E L S E UNDERSCORE I F;
fragment ELSE: E L S E;
fragment TRUE: T R U E;
fragment FALSE: F A L S E;
fragment ENDIF: E N D UNDERSCORE I F;

//DATASET COLUMN OPERATIONS RESERVED WORD LEXEMES
fragment NEWCOLUMN: N E W UNDERSCORE C O L U M N;
fragment ALTERCOLUMN: A L T E R UNDERSCORE C O L U M N;
fragment DELETECOLUMN: D E L E T E UNDERSCORE C O L U M N;

//FILE IMPORT RESERVED WORD LEXEMES
fragment IMPORTFILE: I M P O R T UNDERSCORE F I L E;

//GRAPH QUERY LEXERS
DO: D O;
GRAPH : G R A P H;
TYPE: (PIE | BAR | LINE);
IS: I S;
LABELONE: (X_AXIS | LABEL);
LABELTWO: (Y_AXIS | VALUE);
COLUMN: (LOWERCASE | UPPERCASE | UNDERSCORE)+;

fragment PIE: P I E;
fragment BAR: B A R;
fragment LINE: L I N E;
fragment X_AXIS: X UNDERSCORE A X I S;
fragment Y_AXIS: Y UNDERSCORE A X I S;

PARENTHESIS: [()];

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
fragment OPENPARENTHESIS: '(';
fragment CLOSEPARENTHESIS: ')';

RESERVEDWORD: (GET | OF | FOR | CONSTANT | CREATEFUNCTION | ENDFUNCTION | RETURN | DO | IF | THEN | ELSEIF | ELSE | TRUE | FALSE | ENDIF | NEWCOLUMN | ALTERCOLUMN | DELETECOLUMN | IMPORTFILE | GRAPH | IS | XAXIS | YAXIS | LABEL | VALUE);

OPERATOR: (SUM | PRODUCT | QUOTIENT | DIFFERENCE | EQUALS | GREATERTHAN | GREATERTHANEQUAL | LESSTHAN | LESSTHANEQUAL | NOTEQUAL | AND | OR);

SEPARATOR: (COMMA | OPENPARENTHESIS | CLOSEPARENTHESIS);

LITERAL: '\'' (.*?) '\'';

IDENTIFIER: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
TAB: '\t' -> skip;
CARRIAGERETURN: '\r' -> skip;