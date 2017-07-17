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
hour = 08\:(31(\:1[2-9]|[2-5][0-9])?|(3[2-9]|[4-5][0-9])(\:[0-5][0-9])?) | 09\:[0-5][0-9](\:[0-5][0-9])? | 1[0-9]\:[0-5][0-9](\:[0-5][0-9])? | 2[0-2]\:[0-5][0-9](\:[0-5][0-9])? | 23\:(([01][0-9]|20)(\:[0-5][0-9])?|21(\:0[0-9])?) 
ch = X|Y
ct = 0 | "-"?[2468] | "-"?[1-9][02468] | "-"1[0-3][02468] | [1-7][0-9][02468] | 8[01][02468] | 82[024]

c = [a-zA-Z]
num = [1-9][0-9]*
fnum = [0-9]*\.[0-9]{2}
cun = 1[2-9] | [2-9][0-9] | 1[0-2][0-9] | 13[0-2]

%%

";"      {return symbol(sym.S);}
":"      {return symbol(sym.C);}
"."      {return symbol(sym.DOT);}
","      {return symbol(sym.CM);}


"*****"                          {return symbol(sym.SEP);}

{hour}\;                         {return symbol(sym.HOUR);}
({ch}{ch}{ch}({ch}{ch})*)?{ct}\; {return symbol(sym.CODE);}

{fnum}                           {return symbol(sym.FNUM, new Double(yytext()));}
{num}                            {return symbol(sym.NUM, new Integer(yytext()));}
{c}{c}{c}({c}{c})*(\.{cun}\.{cun})+    {return symbol(sym.UCODE, yytext());}

"->"                             {return symbol(sym.ARROW);}
"Auction"                        {return symbol(sym.AUCT);}
"Euro"|"euro"                    {return symbol(sym.EURO);}
"min"                            {return symbol(sym.MIN);}
{c}+{ws}{c}+                     {return symbol(sym.STRSTR);}

\"~\"                           {return symbol(sym.PRODN);}

"//".*$     {}
{nl}|{ws}   {}

.  {System.err.println("SCANNER ERROR: "+yytext());}
