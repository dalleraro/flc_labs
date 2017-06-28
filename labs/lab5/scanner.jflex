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

nl = \r|\n|\r\n
ws = [ \t]
svar = [a-z]
vvar = [A-Z]
real = ("+"|"-")?[0-9]+(\.[0-9]+)?([eE]("+"|"-")?[0-9]+)?

%%

"^"      {return symbol(sym.POW);}
"*"      {return symbol(sym.MUL);}
"/"      {return symbol(sym.DIV);}
"."      {return symbol(sym.PROD);}
"+"      {return symbol(sym.SUM);}
"-"      {return symbol(sym.SUB);}

{svar}   {return symbol(sym.SVAR, new Character(yycharat(0)));}
{vvar}   {return symbol(sym.VVAR, new Character(yycharat(0)));}
{real}   {return symbol(sym.NUM, new Double(yytext()));}

"["      {return symbol(sym.SO);}
"]"      {return symbol(sym.SC);}
"("      {return symbol(sym.RO);}
")"      {return symbol(sym.RC);}
";"      {return symbol(sym.SEM);}
"?"      {return symbol(sym.END);}
","      {return symbol(sym.CM);}
"="      {return symbol(sym.EQ);}

"/*" ~ "*/" {;}
{nl}|{ws}   {;}

. {System.out.println("SCANNER ERROR: "+yytext());}
