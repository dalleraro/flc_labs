
%%

%standalone

%class Lab1Es2
%unicode

nl = \n|\r\|\r\n
ipaddresscomp     = [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]
ipaddress         = ({ipaddresscomp}\.){3}{ipaddresscomp}
port              = [1-9][0-9]{0,3}
escape            = %[0-9A-F]{2}
name              = ([^\n\r%/<>.:\\#]|{escape})+
firstLevel        = it|eu|org|fr|nl|edu|com|ch
domain            = {name}\.{name}*\.{firstLevel}
proto             = http|ftp|gopher|https|nntp|file

%%
{proto}"://"({domain}|{ipaddress})(:{port})?("/"{name})*("/"|"/"{name}"."{name}(#{name})?)?   {
  System.out.println("Found URL: " + yytext());
  }

.+        {
  System.out.println("Error: " + yytext());
  }

{nl}   {;}
