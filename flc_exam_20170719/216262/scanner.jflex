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

bin1    = 0*10*10*|0*10*10*10*10*
w1      = (xy)*x? | (yx)*y?

date    = 2017\/(01\/(1[89]|2[0-9]|3[01]) | 02\/(0[1-9]|1[0-9]|2[0-8]) | (03|05)\/(0[1-9]|[12][0-9]|3[01]) | (04|06)\/(0[1-9]|[12][0-9]|30) | 07\/0[12])
hour    = 01":"(1[2-9]|[2-5][0-9])|(0[2-9]|10)":"[0-5][0-9] | 11":"([0-2][0-9]|3[0-7])

num3    = 1[579]|[2-9][13579]|[1-9][0-9][13579]|1[0-4][0-9][13579]|15[0-6][13579]|157[13]
sep3    = "/"|"$"|"+"

comment = "/*" ~ "*/"

int = ([0-9]|[1-9][0-9]*)

var_name = [a-zA-Z_][a-zA-Z0-9_]*

//ureal = {uint}?"."[0-9]+|{uint}"."[0-9]*
%%

";"                 { return sym(sym.S); }
","                 { return sym(sym.CM); }
"="                 { return sym(sym.EQ); }
"+"                 { return sym(sym.PLUS); }
"-"                 { return sym(sym.MINUS); }
"*"                 { return sym(sym.STAR); }
"/"                 { return sym(sym.DIV); }
"^"                 { return sym(sym.POW); }
"("                 { return sym(sym.RO); }
")"                 { return sym(sym.RC); }
"{"                 { return sym(sym.CO); }
"}"                 { return sym(sym.CC); }

"?"({bin1}|{w1})                                { return sym(sym.TOKEN1); }
{date}(":"{hour})?                              { return sym(sym.TOKEN2); }
{num3}({sep3}{num3}){5}(({sep3}{num3}){2})?     { return sym(sym.TOKEN3); }

"###""#"*             { return sym(sym.SEP);}
 
"CONFIGURE"              { return sym(sym.CONF);}
"TEMPERATURE"|"HUMIDITY"|"temperature"|"humidity" { return sym(sym.ENTITY, yytext().toLowerCase()); }
"STORE"                  { return sym(sym.STORE); }
"AVG"|"avg"              { return sym(sym.AVG); }
"CASE"                   { return sym(sym.CASE); }
"IS"                     { return sym(sym.IS); }
"IN RANGE"               { return sym(sym.RANGE); }
"EQUAL"                  { return sym(sym.EQUAL); }

{var_name}          { return sym(sym.VAR, yytext()); }

{int}                 { return sym(sym.INT, Integer.parseInt(yytext())); }
//{ureal}             { return sym(sym.REAL, Double.parseDouble(yytext())); }

{comment}           {;}
\r|\n|\r\n|\ |\t    {;}

.                  { System.out.println("Scanner Error: " + yytext()); }
