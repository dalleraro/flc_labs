
%%

%standalone
%class PathRec

nl =            \n|\r|\r\n
digit =         [0-9]
letter =        [^0-9\\/\|\":\*\n\r <>]

Id =            ({letter}|{digit})({letter}|{digit})*
PathName =      {Id}
FileName =      {Id}
FileType =      {Id}
Drive =         {letter}
PathFileName =  ({Drive}:)?\\?({PathName}\\)*{FileName}(\.{FileType})?

%%

^{PathFileName}$  {System.out.println("Path found: " + yytext());}
^.+$              {System.out.println("Error: " + yytext());}
{nl}              {;}

