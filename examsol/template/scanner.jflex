import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column
%class scanner

%{
    private Symbol sym(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol sym(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    
%}

sep = ##

//token = [0-9]
//comment = "/*" ~ "*/"
//comment = "//".*|"/*" ~ "*/"
//quoted_string = \" ~ \"
//uint = [0-9]|[1-9][0-9]*
//ureal = {uint}?"."[0-9]+|{uint}"."[0-9]*

%%

{sep}               { return sym(sym.SEP);}
 
//{uint}              { return sym(sym.UINT, Integer.parseInt(yytext())); }
//{ureal}             { return sym(sym.REAL, Double.parseDouble(yytext())); }

//{comment}           {;}
\r|\n|\r\n|\ |\t    {;}

.                  { System.out.println("Scanner Error: " + yytext()); }
