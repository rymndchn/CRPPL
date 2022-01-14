// Define a grammar CRPPL.

grammar CRPPL;

//MULTI EXPRESSION.
multiexpr: (validexpr+)? EOF;

//VALID EXPRESSION.
validexpr: generalquery
         | importdata
         | altercolumn
         | ifstatement
         ;

//PARSER RULES.



generalquery: GET (OPERAND OF)? LITERAL (COMMA LITERAL)* (FOR LITERAL EQUAL LITERAL (COMMA LITERAL EQUAL LITERAL)*)?;
importdata : DO IMPORTFILE GROUPINGSYMBOL LITERAL COMMA LITERAL GROUPINGSYMBOL;
altercolumn: (NEWCOLUMN | DELETECOLUMN) NAMEDCOLUMN FOR LITERAL;
ifstatement: IF (condition) THEN (validexpr)(validexpr)* (ELSE_IF (condition|TRUE|FALSE) THEN (validexpr)(validexpr)*)* (ELSE (validexpr)(validexpr)*)? END_IF;


//LEXER RULES.
//common lexers.
fragment A: ('A'|'a');
fragment C: ('C'|'c');
fragment D: ('D'|'d');
fragment E: ('E'|'e');
fragment F: ('F'|'f');
fragment G: ('G'|'g');
fragment H: ('H'|'h');
fragment I: ('I'|'i');
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
fragment W: ('W'|'w');

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NUMBERS: [0-9];
fragment UNDERSCORE: '_';
fragment ALPHANUMERIC: [a-zA-Z0-9]*;

fragment SUM: S U M;
fragment DIFFERENCE: D I F F E R E N C E;
fragment PRODUCT: P R O D U C T;
fragment QUOTIENT: Q U O T I E N T;
//fragment FOR: F O R;
fragment NEW: N E W;
fragment DELETE: D E L E T E;
fragment COLUMN: C O L U M N;
fragment NAMED: N A M E D;



//general query lexers.
GET: G E T;
OPERAND: (SUM | DIFFERENCE | PRODUCT | QUOTIENT);
OF: O F;
FOR: F O R;

// conditional lexers
IF: I F ;
ELSE: E L S E ;
THEN: T H E N ;
ELSE_IF: E L S E UNDERSCORE I F;
END_IF: E N D UNDERSCORE I F ;
TRUE: T R U E ;
FALSE:F A L S E ;


//altercolumn lexers.
NEWCOLUMN: NEW UNDERSCORE COLUMN;
DELETECOLUMN: DELETE UNDERSCORE COLUMN;
//LITERAL: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;
NAMEDCOLUMN: (NAMED WHITESPACE LITERAL);
//FORDATASET: (FOR WHITESPACE LITERAL);

//io lexers.
DO : D O;
IMPORTFILE : I M P O R T UNDERSCORE F I L E;

//sub routine lexers.
CREATEFUNCTION : C R E A T E UNDERSCORE F U N C T I O N;
RETURN : R E T U R N;
ENDFUNCTION : E N D UNDERSCORE F U N C T I O N;

COMMA: ',';
EQUAL: '=';
NOT_EQUAL: '!=';
AND: '&';
OR: '|';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
operator: AND|OR|GT|GTE|LT|LTE|EQUAL|NOT_EQUAL;
GROUPINGSYMBOL: [()];

LITERAL: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;

//COLUMNS: LITERAL (COMMA LITERAL)*;

condition: 
(
  (GROUPINGSYMBOL (LITERAL|TRUE|FALSE|condition) GROUPINGSYMBOL) | 
  
  (GROUPINGSYMBOL  (LITERAL|TRUE|FALSE|condition) operator (LITERAL|TRUE|FALSE) GROUPINGSYMBOL) 

  
)
(operator condition)*
;

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
CARRIAGERETURN: '\r' -> skip;