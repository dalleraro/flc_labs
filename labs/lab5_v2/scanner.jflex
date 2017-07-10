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

"["   {return symbol(sym.SO);}
"]"   {return symbol(sym.SC);}
"+"   {return symbol(sym.PLUS);}
"-"   {return symbol(sym.MINUS);}
"/"   {return symbol(sym.DIV);}
"*"   {return symbol(sym.MUL);}
"."   {return symbol(sym.DOT);}
"^"   {return symbol(sym.POW);}
"("   {return symbol(sym.RO);}
")"   {return symbol(sym.RC);}
";"   {return symbol(sym.S);}
","   {return symbol(sym.CM);}
"?"   {return symbol(sym.QM);}
"="   {return symbol(sym.EQ);}

{svar}   {return symbol(sym.SVAR, new Character(yycharat(0)));}
{vvar}   {return symbol(sym.VVAR, new Character(yycharat(0)));}
{real}   {return symbol(sym.REAL, new Double(yytext()));}

{nl}|{ws}   {}

.     {System.err.println("SCANNER ERROR: "+yytext());}

