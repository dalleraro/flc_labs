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
double  =   (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+))(e|E("+"|"-")?[0-9]+)?

%%

"("   {return symbol(sym.RO);}
")"   {return symbol(sym.RC);}
"["   {return symbol(sym.SO);}
"]"   {return symbol(sym.SC);}
"{"   {return symbol(sym.CO);}
"}"   {return symbol(sym.CC);}
","   {return symbol(sym.CM);}
";"   {return symbol(sym.S);}
"+"   {return symbol(sym.PLUS);}
"-"   {return symbol(sym.MINUS);}
"/"   {return symbol(sym.DIV);}
"*"   {return symbol(sym.MUL);}
"!"   {return symbol(sym.NOT);}
"|"   {return symbol(sym.OR);}
"&"   {return symbol(sym.AND);}
">"   {return symbol(sym.MAJ);}
"<"   {return symbol(sym.MIN);}
"="  {return symbol(sym.EQ);}

"int"    {return symbol(sym.INT_TYPE);}
"double" {return symbol(sym.DOUBLE_TYPE);}
"while"  {return symbol(sym.WHILE);}
"if"     {return symbol(sym.IF);}
"else"   {return symbol(sym.ELSE);}
"print"  {return symbol(sym.PRINT);}

{integer}   {return symbol(sym.INT_N, new Integer(yytext()));}
{double}    {return symbol(sym.DOUBLE_N, new Double(yytext()));}
{id}        {return symbol(sym.ID, yytext());}

"/*"~"*/"   {}
{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
