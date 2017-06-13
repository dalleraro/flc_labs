
%%

%integer
%unicode

%state COMMENT

nl          = \n|\r|\r\n
keyword     = auto|break|case|char|const|continue|default|do|double|else|enum|extern|float|for|goto|if|int|long|register|return|short|signed|sizeof|static|struct|switch|typedef|union|unsigned|void|volatile|while
directive   = (#include|#define).*{nl}
const       = [0-9]+

string      = \" ~ \"

id          = [a-zA-Z_][a-zA-Z0-9_]*
op          = "+"|"-"|"/"|"*"|"<"|">"|"=="|"<="|">="|"="

%%

<YYINITIAL> {
  {keyword} {
    Htmllib.colPrint(Htmllib.C_LBLUE);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  {const} {
    Htmllib.colPrint(Htmllib.C_LRED);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  {directive} {
    Htmllib.colPrint(Htmllib.C_LGREEN);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  {op} {
    Htmllib.colPrint(Htmllib.C_BLUE);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  {string} {
    Htmllib.colPrint(Htmllib.C_RED);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  {id} {
    Htmllib.colPrint(Htmllib.C_GREEN);
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
  }
  "/*" {
    yybegin(COMMENT);
    Htmllib.colPrint(Htmllib.C_CYAN);
    Htmllib.textPrint(yytext());
  }
  {nl} {
    Htmllib.textPrint(yytext());
  }
  .  {
    Htmllib.textPrint(yytext());
  }

}

<COMMENT> {
  [^*]+ {
    Htmllib.textPrint(yytext());
  }
  "*"+[^/] {
    Htmllib.textPrint(yytext());
  }
  "*"+"/" {
    Htmllib.textPrint(yytext());
    Htmllib.endTagPrint();
    yybegin(YYINITIAL);
  }
}

