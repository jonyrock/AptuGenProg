language prop(java);

prefix = "AST"
package = "ru.aptu.xml"
gentree=true
genast=true
positions="offset, line"
endpositions="offset"

:: lexer

tagOpen(String): /<[a-zA-Z_][a-zA-Z_0-9]*>/ { $symbol = current().substring(1, current().length() - 1); }
tagClose(String): /<\/[a-zA-Z_][a-zA-Z_0-9]*>/ { $symbol = current().substring(2, current().length()-1); }
innerText(String): /[a-zA-Z_0-9]+/ { $symbol = current(); }
_skip:       /[\n\t\r ]+/ (space)


:: parser

input ::= rts=tag;
tag ::= name=tagOpen inner=inner+ (cname=tagClose {
        String openName = (String)tmStack[tmHead - 2].value;
        String closeName = (String)tmStack[tmHead].value;
        if(!openName.equals(closeName)) {
            reporter.error(tmNext.offset, tmNext.endoffset, tmNext.line,
						MessageFormat.format("Wrong close tag \"" + closeName + "\", where \"" + openName + "\" is expected before line {0}",
								tmLexer.getTokenLine()));
        }
    }
);
inner ::= elem=tag | elem=tagText;
tagText ::= text=innerText;





