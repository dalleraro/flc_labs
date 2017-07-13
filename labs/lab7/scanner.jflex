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

nl =  \r|\n|\r\n
ws =  [ \t]
id =  [a-z_][a-zA-Z0-9_]*

integer =   [1-9][0-9]*|0

%%

"["   {return symbol(sym.SO);}
"]"   {return symbol(sym.SC);}
"*"   {return symbol(sym.PTR);}
","   {return symbol(sym.CM);}
";"   {return symbol(sym.S);}

"int"    {return symbol(sym.INT);}
"double" {return symbol(sym.DOUBLE);}
"float"  {return symbol(sym.FLOAT);}
"char"   {return symbol(sym.CHAR);}


{integer}   {return symbol(sym.NUM, new Integer(yytext()));}
{id}        {return symbol(sym.ID, yytext());}

"/*"~"*/"   {}
{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
