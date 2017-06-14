
%%

%standalone
%unicode

%class Lexer
%caseless

%xstate comment
%xstate otag
%xstate ctag

%{
   public int tags = 0;
   public int otags_table = 0;
   public int otags_h1 = 0;
   public int otags_h2 = 0;
   public int otags_h3 = 0;
   public int otags_h4 = 0;
   public int ctags_table = 0;
   public int ctags_h1 = 0;
   public int ctags_h2 = 0;
   public int ctags_h3 = 0;
   public int ctags_h4 = 0;
%}



%%

"<!--"          {yybegin(comment);}
<comment>"-->"  {yybegin(YYINITIAL);}
<comment>[^<>-]+     {;}

"<"/[^!/]       {
      ++tags; 
      yybegin(otag); 
      System.out.print(yytext());
   }

<otag>">"      {
      yybegin(YYINITIAL);
      System.out.print(yytext());
   }
<otag>table    {
      ++otags_table;
      System.out.print(yytext());
   }
<otag>h1       {
      ++otags_h1;
      System.out.print(yytext());
   }
<otag>h2       {
      ++otags_h2;
      System.out.print(yytext());
   }
<otag>h3       {
      ++otags_h3;
      System.out.print(yytext());
   }
<otag>h4       {
      ++otags_h4;
      System.out.print(yytext());
   }
<otag>[^<> \t\n\r]+|" "|\t|\n|\r|\r\n      {
      System.out.print(yytext());
   }
"</"           {
      ++tags;
      yybegin(ctag);
      System.out.print(yytext());
   }
<ctag>">"      {
      yybegin(YYINITIAL);
      System.out.print(yytext());
   }
<ctag>table    {
      ++ctags_table;
      System.out.print(yytext());
   }
<ctag>h1       {
      ++ctags_h1;
      System.out.print(yytext());
   }
<ctag>h2       {
      ++ctags_h2;
      System.out.print(yytext());
   }
<ctag>h3       {
      ++ctags_h3;
      System.out.print(yytext());
   }
<ctag>h4       {
      ++ctags_h4;
      System.out.print(yytext());
   }
<ctag>[^<> \t\n\r]+|" "|\t|\n|\r|\r\n       {
      System.out.print(yytext());
   }

[^ \t\n\r<>]+|" "|\t|\n|\r|\r\n  {
      System.out.print(yytext());
   }

<<EOF>>        {
      System.out.println("number of tags: " + tags);
      System.out.println("number of opening table tags: " + otags_table);
      System.out.println("number of opening h1 tags: " + otags_h1);
      System.out.println("number of opening h2 tags: " + otags_h2);
      System.out.println("number of opening h3 tags: " + otags_h3);
      System.out.println("number of opening h4 tags: " + otags_h4);
      System.out.println("number of closing table tags: " + ctags_table);
      System.out.println("number of closing h1 tags: " + ctags_h1);
      System.out.println("number of closing h2 tags: " + ctags_h2);
      System.out.println("number of closing h3 tags: " + ctags_h3);
      System.out.println("number of closing h4 tags: " + ctags_h4);
      return YYEOF;
   }
