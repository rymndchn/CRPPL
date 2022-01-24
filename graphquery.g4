// Define a grammar CRPPL.

grammar graphquery;

graphquery: DO GRAPH OPENPARENTHESIS (TYPE)? COMMA TABLECOLUMN IS LABELONE COMMA TABLECOLUMN IS LABELTWO CLOSEPARENTHESIS;

fragment A  : ('A'|'a') ;
fragment B  : ('B'|'b') ;
fragment C  : ('C'|'c') ;
fragment D  : ('D'|'d') ;
fragment E  : ('E'|'e') ;
fragment F  : ('F'|'f') ;
fragment G  : ('G'|'g') ;
fragment H  : ('H'|'h') ;
fragment I  : ('I'|'i') ;
fragment J  : ('J'|'j') ;
fragment K  : ('K'|'k') ;
fragment L  : ('L'|'l') ;
fragment M  : ('M'|'m') ;
fragment N  : ('N'|'n') ;
fragment O  : ('O'|'o') ;
fragment P  : ('P'|'p') ;
fragment Q  : ('Q'|'q') ;
fragment R  : ('R'|'r') ;
fragment S  : ('S'|'s') ;
fragment T  : ('T'|'t') ;
fragment U  : ('U'|'u') ;
fragment V  : ('V'|'v') ;
fragment W  : ('W'|'w') ;
fragment X  : ('X'|'x') ;
fragment Y  : ('Y'|'y') ;
fragment Z  : ('Z'|'z') ;

DO: D O;
GRAPH : G R A P H;
TYPE: (PIE | BAR | LINE);
IS: I S;
LABELONE: (X_AXIS | LABEL);
LABELTWO: (Y_AXIS | VALUE);
TABLECOLUMN: (LOWERCASE | UPPERCASE | UNDERSCORE)+;

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment PIE: P I E;
fragment BAR: B A R;
fragment LINE: L I N E;
fragment X_AXIS: X UNDERSCORE A X I S;
fragment LABEL: L A B E L;
fragment Y_AXIS: Y UNDERSCORE A X I S;
fragment VALUE: V A L U E;
UNDERSCORE: '_';
COMMA: ',';
OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';

WHITESPACE: ' ' -> skip;
NEXTLINE: '\n' -> skip;
CARRIAGERETURN: '\r' -> skip;