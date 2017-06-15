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
l = [a-zA-Z]
n = [0-9]
hex = [0-9A-F]
isbn = {n}{2}\-{n}{2}\-{hex}{5}\-({l}|{n})

%%

\"({l}|{ws}|,|\.)+\"    {return symbol(sym.NAME);}
"-"                  {return symbol(sym.D);}
"/"                  {return symbol(sym.SL);}
"%"                  {return symbol(sym.PERC);}
{isbn}               {return symbol(sym.ISBN);}
":"                  {return symbol(sym.C);}
";"                  {return symbol(sym.S);}
">"                  {return symbol(sym.MAJ);}
","                  {return symbol(sym.CM);}
LI|LS                {return symbol(sym.LT, yytext());}  
AV|BO|SO             {return symbol(sym.GE, yytext());}
{l}                  {return symbol(sym.L);}
{n}+                 {return symbol(sym.N);}

{ws}|{nl}            {;}


. {System.out.println("SCANNER ERROR: "+yytext());}
