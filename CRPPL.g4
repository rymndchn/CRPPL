// Define a grammar CRPPL.

grammar CRPPL;

//MULTI EXPRESSION.
multiexpr: (validexpr+)? EOF?;

//VALID EXPRESSION.
validexpr: generalquery
         | importfile
         | defineconstant
         | altercolumn
         | assignment
         | expr
         | changevalue
         | graphquery
         | createfunction
         | functioncall
         | conditionalstatement
         ;

//ARITHMETIC EXPRESSION.
expr:   '(' expr ')'
         | left=expr op=(MULT | DIV) right=expr
         | left=expr op=(ADD | SUB) right=expr
         | value=NUM_EXPR
         | IDENTIFIER
         ;

//PARSER RULES.
generalquery: GET (OPERATING_FUNCTION OF)? IDENTIFIER (SEPARATOR (OPERATING_FUNCTION OF)? IDENTIFIER)* (FOR IDENTIFIER OPERATOR LITERAL (SEPARATOR IDENTIFIER OPERATOR LITERAL)*)? ON IDENTIFIER (GROUPBY IDENTIFIER (SEPARATOR IDENTIFIER)*)?;
importfile: RESERVEDWORD_DO IMPORTFILE OPENPARENTHESIS (LITERAL|IDENTIFIER) SEPARATOR (LITERAL|IDENTIFIER) CLOSEPARENTHESIS AS IDENTIFIER;
defineconstant: IDENTIFIER RESERVEDWORD_CONSTANT LITERAL;
altercolumn: (NEWCOLUMN|DELETECOLUMN) IDENTIFIER FOR IDENTIFIER;

assignment: IDENTIFIER ASSIGNEMT_OPERATOR (expr);
changevalue: CHANGEVALUE OF IDENTIFIER TO (LITERAL|IDENTIFIER) FOR (LITERAL|IDENTIFIER) OPERATOR (LITERAL|IDENTIFIER) ON IDENTIFIER;

graphquery: RESERVEDWORD_DO GRAPH OPENPARENTHESIS (TYPE)? SEPARATOR LITERAL ASSIGNEMT_OPERATOR LABELONE SEPARATOR LITERAL ASSIGNEMT_OPERATOR LABELTWO SEPARATOR IDENTIFIER CLOSEPARENTHESIS;

createfunction: CREATEFUNCTION IDENTIFIER OPENPARENTHESIS (IDENTIFIER (SEPARATOR IDENTIFIER)*)? CLOSEPARENTHESIS ((generalquery | importfile | altercolumn | changevalue | expr | assignment | defineconstant | functioncall | graphquery | conditionalstatement)*?) (RETURN | (RETURN IDENTIFIER))? ENDFUNCTION;

functioncall : RESERVEDWORD_DO functionprototype;

functionprototype : IDENTIFIER OPENPARENTHESIS (IDENTIFIER (SEPARATOR (LITERAL | IDENTIFIER))*)? CLOSEPARENTHESIS;

conditionalstatement: IF (booleanstatement) THEN (validexpr)(validexpr)* (ELSE_IF (booleanstatement) THEN (validexpr)(validexpr)*)* (ELSE (validexpr)(validexpr)*)? END_IF;

booleanstatement: (
  OPENPARENTHESIS (NEGATOR)*(IDENTIFIER|TRUE|FALSE) CLOSEPARENTHESIS | 
  
  OPENPARENTHESIS (NEGATOR)*(LITERAL|IDENTIFIER|TRUE|FALSE| booleanstatement) ((OPERATOR|BOOLEAN_CONNECTOR (NEGATOR)*) (LITERAL|IDENTIFIER|TRUE|FALSE|booleanstatement))* CLOSEPARENTHESIS 
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



//Arithmetic operation queries.
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
NUM_EXPR : [0-9]+ ('.' [0-9]+)?;
NUM : [0-9];

//GENERAL QUERY RESERVED WORD LEXEMES
GET: G E T;
OF: O F;
FOR: F O R;
ON: O N;
GROUPBY: G R O U P UNDERSCORE B Y;

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
DELETECOLUMN: D E L E T E UNDERSCORE C O L U M N;
CHANGEVALUE: C H A N G E UNDERSCORE V A L U E;
TO: T O;

//FILE IMPORT RESERVED WORD LEXEMES
IMPORTFILE: I M P O R T UNDERSCORE F I L E;
ASSIGNEMT_OPERATOR: I S;
RESERVEDWORD_DO: D O;
AS: A S;

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
fragment MIN: M I N;
fragment MEAN: M E A N;
fragment MAX: M A X;

//OPERATOR LEXEMES
fragment EQUALS: '=' | E Q U A L;
fragment GREATERTHAN: G T;
fragment GREATERTHANEQUAL: G T E;
fragment LESSTHAN: L T;
fragment LESSTHANEQUAL: L T E;
fragment NOTEQUAL: N O T UNDERSCORE E Q U A L;

//BOOLEAN CONNECTOR LEXEMES
fragment AND: A N D;
fragment OR: O R;
fragment XOR: X O R;

//NEGATOR LEXEMES
fragment NOT: N O T;

//SEPARATOR LEXEMES
fragment COMMA: ',';
OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';

RESERVEDWORD: ( TRUE | FALSE);


OPERATOR: ( EQUALS | GREATERTHAN | GREATERTHANEQUAL | LESSTHAN | LESSTHANEQUAL | NOTEQUAL );
BOOLEAN_CONNECTOR: ( AND | OR | XOR);
NEGATOR: NOT;
OPERATING_FUNCTION: (SUM | MEAN | MIN | MAX);


SEPARATOR: (COMMA);

LITERAL: '\'' (.*?) '\'';

IDENTIFIER: (LOWERCASE | UPPERCASE | NUMBERS | UNDERSCORE)+;

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
TAB: '\t' -> skip;
CARRIAGERETURN: '\r' -> skip;