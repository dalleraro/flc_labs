
%%

%standalone
%unicode

%class Lexer

%xstate COMMENT

nl              = \r|\n|\r\n

id              = [a-zA-Z_][a-zA-Z0-9_]*
int             = ("+"|"-")?[0-9]+
double          = ("+"|"-")?([1-9][0-9]*"."[0-9]*)|("."[0-9]+)|(0"."[0-9]*)
directive       = #include.*\n

%%

"/*"        {yybegin(COMMENT);}

"{"         {System.out.print("BO ");}
"}"         {System.out.print("BC ");}
"["         {System.out.print("SO ");}
"]"         {System.out.print("SC ");}
"("         {System.out.print("RO ");}
")"         {System.out.print("RC ");}
"+"         {System.out.print("PLUS ");}
"-"         {System.out.print("MINUS ");}
"*"         {System.out.print("MUL ");}
"/"         {System.out.print("DIV ");}
"="         {System.out.print("EQ ");}
";"         {System.out.print("S ");}
"."         {System.out.print("DOT ");}
","         {System.out.print("C ");}
"<"         {System.out.print("MIN ");}
">"         {System.out.print("MAJ ");}
"&"         {System.out.print("AND ");}
"|"         {System.out.print("OR ");}
"!"         {System.out.print("NOT ");}

int         {System.out.print("INT_TYPE ");}
double      {System.out.print("DOUBLE_TYPE ");}
if          {System.out.print("IF ");}
else        {System.out.print("ELSE ");}
while       {System.out.print("WHILE ");}
print       {System.out.print("PRINT ");}

{int}       {System.out.print("INT:"+yytext()+" ");}
{double}    {System.out.print("DOUBLE:"+yytext()+" ");}
{id}        {System.out.print("ID:"+yytext()+" ");}

{nl}|{directive}|" "|\t   {;}

<COMMENT>[^*]         {;}
<COMMENT>"*"+[^\/]*   {;}
<COMMENT>"*"+"/"      {yybegin(YYINITIAL);}
