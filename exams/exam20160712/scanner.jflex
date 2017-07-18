import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column
%class scanner

%{
    private Symbol sym(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol sym(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    
%}

sep = ##
comment = "/*" ~ "*/"

uint = [0-9]|[1-9][0-9]*
//ureal = {uint}?"."[0-9]+|{uint}"."[0-9]*

bin1     = 11[01]|1[01][01][01]|100[01][01]|1010[01]
token1   = "?"([a-z]{4}([a-z]{2})*|[A-Z]{5}([A-Z]{2})*){bin1}?

st2      = "ij"|"ji"|"ii"|"jj"
sp2      = "+"|"-"
wd2      = ({st2}{3}){1,2}
token2   = {wd2}{sp2}{wd2}({sp2}{wd2}{sp2}{wd2})?

date     = 2016\/(05\/(2[89]|3[01]) | 06\/(0[1-9]|1[0-9]|2[0-3]|2[5-9]|30) | 07\/(0[1-9]|[12][0-9]|3[01]) | 08\/(0[1-9]|1[0-5]))

id       = [a-zA-Z][a-zA-Z0-9]*

%%

// TODO: declare actions
";"                  {return sym(sym.S);}
"="                  {return sym(sym.EQ);}
"+"                 { return sym(sym.PLUS); }
"-"                 { return sym(sym.MINUS); }
"*"                 { return sym(sym.MUL); }
"/"                 { return sym(sym.DIV); }
"("                  {return sym(sym.RO);}
")"                  {return sym(sym.RC);}
"{"                  {return sym(sym.CO);}
"}"                  {return sym(sym.CC);}
","                  {return sym(sym.CM);}
":"                  {return sym(sym.C);}

"MIN"|"MAX"          {return sym(sym.OP, yytext());}
"stat"               {return sym(sym.STAT);}
"case"               {return sym(sym.CASE);}
"print"              {return sym(sym.PRINT);}
"switch"             {return sym(sym.SWITCH);}

{sep}               { return sym(sym.SEP);}
 
{token1}             {return sym(sym.TOKEN1);}
{token2}             {return sym(sym.TOKEN2);}
{date}               {return sym(sym.DATE);}
 
{id}                 {return sym(sym.VAR, yytext());}
 
{uint}              { return sym(sym.UINT, Integer.parseInt(yytext())); }
//{ureal}             { return sym(sym.REAL, Double.parseDouble(yytext())); }

{comment}           {;}
\r|\n|\r\n|\ |\t    {;}

.                  { System.out.println("Scanner Error: " + yytext()); }
