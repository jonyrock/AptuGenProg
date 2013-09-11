language prop(java);

prefix = "AST"
package = "ru.aptu.xml"
gentree=true
genast=true
positions="offset, line"
endpositions="offset"

:: lexer

identifier(String): /[a-zA-Z_][a-zA-Z_0-9]*/   { $symbol = current(); }
val(Integer):  /-?[0-9]+/                     { $symbol = Integer.parseInt(current()); }
eq:             /=/
semicol:        /;/
_skip:          /[\n\t\r ]+/ (space)

:: parser

input ::= s=stmt* ;
stmt ::= identifier eq val semicol;

%%



