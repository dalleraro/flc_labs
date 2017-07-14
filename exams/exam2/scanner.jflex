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
name = [a-zA-Z][a-zA-Z0-9_]*".mp3"

dd = 0[1-9]|[12][0-9]|3[01]
mm = 0[1-9]|1[0-2]
yyyy = [0-9]{4}
hour = ([01][0-9]|2[0-3])\:[0-5][0-9]
iptk = [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]

integer =   [1-9][0-9]*|0

%%

"mp3_list:" {return symbol(sym.HEADER1);}
"server:"   {return symbol(sym.HEADER2);}
"data"     {return symbol(sym.DATEH);}
"time"     {return symbol(sym.TIMEH);}

{dd}"/"{mm}"/"{yyyy}  {return symbol(sym.DATE);}
{hour}   {return symbol(sym.HOUR);}
{iptk}"."{iptk}"."{iptk}"."{iptk}        {return symbol(sym.IP, yytext());}

"Kb/s"      {return symbol(sym.KBS);}

","   {return symbol(sym.CM);}
"."   {return symbol(sym.DOT);}
";"   {return symbol(sym.S);}
":"   {return symbol(sym.C);}

{integer}   {return symbol(sym.NUM, new Integer(yytext()));}
{name}      {return symbol(sym.NAME, yytext());}

{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
