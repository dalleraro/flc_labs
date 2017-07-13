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
word = ([a-z]|[A-Z])+

integer =   [1-9][0-9]*|0

%%

"("   {return symbol(sym.RO);}
")"   {return symbol(sym.RC);}
","   {return symbol(sym.CM);}
"."   {return symbol(sym.DOT);}
";"   {return symbol(sym.S);}
":"   {return symbol(sym.C);}
"="   {return symbol(sym.EQ);}
"->"  {return symbol(sym.ARROW);}

"+"   {return symbol(sym.SCORE, new Integer(2));}
"-"   {return symbol(sym.SCORE, new Integer(0));}
"/"   {return symbol(sym.SCORE, new Integer(1));}
"*"   {return symbol(sym.SCORE, new Integer(3));}

{integer}   {return symbol(sym.NUM, new Integer(yytext()));}
{id}        {return symbol(sym.ID, yytext());}
{word}      {return symbol(sym.WORD, yytext());}

"//".*$   {}
{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
