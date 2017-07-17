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

iptk = [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]
ip = {iptk}\.{iptk}\.{iptk}\.{iptk}
hint = 21[3-9] | 2[2-9][0-9] | [3-9][0-9][0-9] | [12][0-9][0-9][0-9] | 3[0-6][0-9][0-9] | 37[01][0-9] | 3720

integer =   [1-9][0-9]*|0
float =     {integer}?\.[0-9]+

id =        [a-z_][a-zA-Z0-9_]*

%%

([a-z]{3,6}|{hint})("-""--"*|"??"+){ip}?  {return symbol(sym.HWORD);}

"%"   {return symbol(sym.SEP);}

","   {return symbol(sym.CM);}
"."   {return symbol(sym.DOT);}
";"   {return symbol(sym.S);}
":"   {return symbol(sym.C);}

"+"   {return symbol(sym.PLUS);}
"-"   {return symbol(sym.MINUS);}
"*"   {return symbol(sym.MUL);}
"/"   {return symbol(sym.DIV);}

">"   {return symbol(sym.MAJ);}
"<"   {return symbol(sym.MIN);}
"="   {return symbol(sym.EQ);}

"("   {return symbol(sym.RO);}
")"   {return symbol(sym.RC);}
"{"   {return symbol(sym.CO);}
"}"   {return symbol(sym.CC);}




"int"|"float"  {return symbol(sym.TYPE, yytext());}
"if"           {return symbol(sym.IF);}
"else"         {return symbol(sym.ELSE);}
"print"        {return symbol(sym.PRINT);}

{integer}   {return symbol(sym.INT, new Integer(yytext()));}
{float}     {return symbol(sym.FLOAT, new Double(yytext()));}
{id}        {return symbol(sym.ID, yytext());}

{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
