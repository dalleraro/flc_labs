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
num1 = -([12][0-9]|3[0-5]|[1-9])|([0-9]|[1-9][0-9]|[1-2][0-9][0-9]|3[0-2][0-9]|33[0-3])
bin3 = 101|11[01]|1[01][01][01]|1[01][01][01][01]|100[01][01][01]|101000
sep = "####"+
t1s1 = "%%%%%"+
t1s2 = ("**"|"???"){2,3} 
date = 2015\/12\/(1[2-9]|2[0-9]|3[01]) | 2016\/(01\/(0([1-4]|[6-9])|[12][0-9]|3[01])|(02\/(0[1-9]|[12][0-9]))|(03\/(0[1-9]|1[0-3])))

str = [a-zA-Z0-9_]+

num = [1-9][0-9]*

%%

";"   {return symbol(sym.S);}
":"   {return symbol(sym.C);}
","   {return symbol(sym.CM);}
"("   {return symbol(sym.RO);}
")"   {return symbol(sym.RC);}
"{"   {return symbol(sym.CO);}
"}"   {return symbol(sym.CC);}
"="   {return symbol(sym.EQ);}
"->"  {return symbol(sym.ARROW);}
"|"   {return symbol(sym.PIPE);}

{sep}                   {return symbol(sym.SEP);}
({t1s1}|{t1s2}){num1}?  {return symbol(sym.TOKEN1);}
{date}("+"|"-"){date}   {return symbol(sym.TOKEN2);}
"$"{bin3}               {return symbol(sym.TOKEN3);}

\"{str}\"   {return symbol(sym.NAME, yytext());}
{num}       {return symbol(sym.NUM, new Integer(yytext()));}

"m"               {return symbol(sym.M);}
"m/s"             {return symbol(sym.MS);}
"PART"{num}       {return symbol(sym.PART, yytext());}
"PRINT_MIN_MAX"   {return symbol(sym.PRINT);}

"//".*$     {}
{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
