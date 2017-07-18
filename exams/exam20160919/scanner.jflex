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

sep = %%
// TODO: declare here regexp
//token = [0-9]

comment = "/*" ~ "*/"

ht1 = "-"([1-9]|[1-9][0-9]|1[0-7][0-9]|18[0-3])|[0-9]|[1-5][0-9]|6[0-3]
ht2 = [A-Z]
ht3 = "***"
ht4 = "xx"|"xy"|"yx"|"yy"

date = 2015\/(09\/(19|2[0-9]|30)|(10|12)\/(0[1-9]|[12][0-9]|3[01])|11\/(0[1-9]|[12][0-9]|30)) | 2016\/(01\/(0[1-9]|[12][0-9]|3[01])|02\/(0[1-9]|1[0-5]))
hour = 06":"(1[3-9]|[2-5][0-9])|0[6-9]":"[0-5][0-9]|1[0-4]":"[0-5][0-9]|15":"([0-3][0-9]|4[0-4])

//comment = "//".*|"/*" ~ "*/"
//quoted_string = \" ~ \"
uint = [0-9]|[1-9][0-9]*
ureal = {uint}?"."[0-9]+|{uint}"."[0-9]*

%%

// TODO: declare actions

"-"      {return sym(sym.DASH);}
";"      {return sym(sym.S);}
"?"      {return sym(sym.QM);}
":"      {return sym(sym.C);}
"("      {return sym(sym.RO);}
")"      {return sym(sym.RC);}
","      {return sym(sym.CM);}
"#"      {return sym(sym.HASH);}
"->"     {return sym(sym.ARROW);}

"AND"    {return sym(sym.AND);}
"OR"     {return sym(sym.OR);}
"NOT"    {return sym(sym.NOT);}

"TRUE"   {return sym(sym.TRUE);}
"FALSE"  {return sym(sym.FALSE);}

"PRESSURE" | "TEMP"  {return sym(sym.VAR_QT, yytext());}
"ADD" | "SUB"        {return sym(sym.OPER, yytext());}


"SET"    {return sym(sym.SET);}
"POWER"  {return sym(sym.POWER, yytext());}
"WATER"  {return sym(sym.WATER, yytext());}
"STATE_CHANGE1"   {return sym(sym.STATE_CHANGE1);}
"STATE_CHANGE2"   {return sym(sym.STATE_CHANGE2);}
"INCREASE"        {return sym(sym.INCREASE);}
"DECREASE"        {return sym(sym.DECREASE);}
"AVG"             {return sym(sym.AVG);}

{sep}{sep}{sep}*        { return sym(sym.SEP);}
 
{ht1}({ht2}{4}({ht2}{2})*)?({ht3}|{ht4}{4}{ht4}*)";"  {return sym(sym.TOKEN);}
{date}(":"{hour})?";"                                 {return sym(sym.DATE);}
 
//{uint}              { return sym(sym.UINT, Integer.parseInt(yytext())); }
{ureal}             { return sym(sym.UREAL, Double.parseDouble(yytext())); }

{comment}           {;}
\r|\n|\r\n|\ |\t    {;}

// effects of this line (to be left as last rule):
// - commented: exception if input does not match
// - uncommented: prints on screen non-matching chars, continue scanning input
.                  { System.out.println("Scanner Error: " + yytext()); }
