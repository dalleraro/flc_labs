

class Lab1E3 {
  public static void main(String args[]) {
    if(args.length == 0) {
      System.out.println("Usage: java Yylex <inputfile>");
   }
   else {
      System.out.println("<HTML>");
      System.out.println("<BODY bgcolor = #FFFFFF>");

      for(int i = 0; i < args.length; i++) {
        Yylex scanner = null;

        try {
          System.out.println("<H2>" + args[i] + "</H2>");
          System.out.println("<CODE>");

          scanner = new Yylex(new java.io.FileReader(args[i]));
          while(scanner.yylex() != Yylex.YYEOF);
          System.out.println("</CODE>");
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \"" + args[i] + "\""    );
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \"" + args[i]     + "\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
      System.out.println("</BODY>");
      System.out.println("</HTML>");
   }
  }
}

