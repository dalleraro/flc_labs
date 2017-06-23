import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup
%line
%column

%{
   private Symbol symbol(int type) {
      return new Symbol(type, yyline, yycolumn);
   }
   private Symbol symbol(int type, Object value) {
      return new Symbol(type, yyline, yycolumn, value);
   }
%}

nl = \n|\r|\r\n
ws = [ \t]
variable = [A-Z_][a-zA-Z0-9_]*
atoms = [a-z][a-zA-Z0-9_]*
int = ("+"|"-")?[0-9]+
float = ("+"|"-")?([1-9][0-9]*"."[0-9]*)|("."[0-9]+)|(0"."[0-9]*)(e{int})?

%%

"."                     {return symbol(sym.DOT);}
":-"                    {return symbol(sym.REND);}
"?-"                    {return symbol(sym.ISTR);}
","                     {return symbol(sym.CM);}
"("                     {return symbol(sym.RO);}
")"                     {return symbol(sym.RC);}
{atoms}|{int}|{float}   {return symbol(sym.ATOM);}
{variable}              {return symbol(sym.VARIABLE);}

{ws}|{nl}               {;}
"/*"~"*/"               {;}
