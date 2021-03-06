/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>scanner.jflex</tt>
 */
class scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\53\1\53\1\1\22\0\1\3\1\0\1\37"+
    "\1\13\1\36\1\14\2\0\1\26\1\27\1\15\1\35\1\25\1\4"+
    "\1\0\1\20\1\10\1\12\1\5\1\7\1\11\1\17\1\21\3\6"+
    "\1\24\1\23\1\0\1\32\1\33\1\16\1\0\1\43\7\22\1\46"+
    "\3\22\1\51\1\47\1\22\1\42\1\22\1\44\1\22\1\45\3\22"+
    "\1\52\2\22\4\0\1\50\1\0\14\22\1\40\5\22\1\41\7\22"+
    "\1\30\1\34\1\31\7\0\1\53\u1fa2\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\2\3\5\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\1"+
    "\1\15\1\1\1\16\1\3\12\0\1\3\4\0\2\17"+
    "\2\0\1\20\1\21\2\0\2\3\1\22\1\0\1\23"+
    "\1\0\1\24\2\25\5\0\1\23\1\0\4\23\2\0"+
    "\2\25\1\26\4\0\3\23\1\0\2\25\31\0\1\27"+
    "\25\0\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\54\0\204\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\54\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370"+
    "\0\u039c\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0"+
    "\0\u04fc\0\u0528\0\u0554\0\54\0\u0580\0\u05ac\0\54\0\54"+
    "\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c"+
    "\0\54\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0108"+
    "\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\54\0\u091c\0\u0948"+
    "\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0134\0\u0a7c"+
    "\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\54\0\u0b58\0\u0b84\0\u0bb0"+
    "\0\u0bdc\0\u0c08\0\u0c34\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10"+
    "\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70"+
    "\0\u0e9c\0\u0ec8\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\54\0\u0fa4"+
    "\0\u0fd0\0\u0ffc\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104"+
    "\0\u1130\0\u115c\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u1238\0\u1264"+
    "\0\u1290\0\u12bc\0\u12e8\0\u1314\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\2\7\1\2\2\7"+
    "\1\10\1\11\1\12\1\13\1\7\1\14\1\7\1\2"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\2\1\25\1\2\1\26\1\27\1\30\1\2\1\31"+
    "\10\2\57\0\1\4\104\0\1\32\25\0\3\7\1\33"+
    "\2\7\4\0\1\7\1\0\1\7\37\0\6\7\4\0"+
    "\1\7\1\0\1\7\45\0\1\34\54\0\1\35\54\0"+
    "\1\36\54\0\1\37\55\0\1\40\45\0\1\41\46\0"+
    "\6\42\4\0\1\42\1\0\2\42\15\0\13\42\21\0"+
    "\1\43\76\0\1\44\1\45\14\0\5\7\1\46\4\0"+
    "\1\7\1\0\1\7\45\0\1\47\54\0\1\50\54\0"+
    "\1\51\1\52\53\0\1\36\35\0\1\40\1\53\1\54"+
    "\50\40\1\54\10\0\1\55\1\0\1\56\46\0\6\42"+
    "\4\0\1\42\1\0\2\42\14\0\1\57\13\42\42\0"+
    "\1\60\56\0\1\61\55\0\1\62\12\0\6\7\4\0"+
    "\1\63\1\0\1\64\45\0\1\65\54\0\1\66\54\0"+
    "\1\67\54\0\1\70\37\0\1\71\61\0\1\56\1\0"+
    "\1\72\51\0\1\73\1\0\1\73\106\0\1\74\55\0"+
    "\1\75\11\0\6\7\4\0\1\7\1\76\1\7\37\0"+
    "\6\7\4\0\1\7\1\77\1\7\45\0\1\100\54\0"+
    "\1\101\43\0\1\102\1\103\1\104\1\105\1\106\1\104"+
    "\1\103\2\0\1\107\1\110\1\104\1\0\1\104\50\0"+
    "\1\67\45\0\1\111\1\0\1\112\51\0\1\112\1\0"+
    "\1\112\46\0\3\113\1\0\2\113\4\0\1\113\1\0"+
    "\1\113\77\0\1\114\20\0\1\115\51\0\1\116\47\0"+
    "\1\102\1\103\1\104\1\105\1\106\1\104\1\103\1\0"+
    "\1\117\2\0\1\104\1\0\1\104\37\0\1\104\1\106"+
    "\1\120\1\0\1\106\1\104\4\0\1\106\1\0\1\106"+
    "\37\0\6\104\4\0\1\104\1\0\1\104\37\0\6\106"+
    "\4\0\1\106\1\0\1\106\37\0\1\104\1\106\1\121"+
    "\1\104\1\106\1\104\4\0\1\106\1\0\1\106\47\0"+
    "\1\122\54\0\1\123\45\0\1\124\1\0\1\125\51\0"+
    "\1\125\1\0\1\125\46\0\6\113\4\0\1\113\1\0"+
    "\1\113\102\0\1\126\10\0\1\127\53\0\1\130\1\0"+
    "\1\131\2\0\1\132\46\0\1\106\1\0\4\106\4\0"+
    "\1\106\41\0\1\106\1\0\2\106\1\0\1\106\45\0"+
    "\1\102\1\103\1\104\1\105\1\106\1\104\1\103\4\0"+
    "\1\104\1\0\1\104\50\0\1\122\45\0\1\125\114\0"+
    "\1\133\22\0\1\134\53\0\1\135\53\0\1\136\53\0"+
    "\1\137\101\0\1\140\12\0\1\141\1\0\1\142\2\0"+
    "\1\143\46\0\1\141\2\0\1\144\1\0\1\141\51\0"+
    "\1\144\1\0\1\145\46\0\1\141\1\0\1\142\1\146"+
    "\1\0\1\141\110\0\1\147\11\0\6\150\4\0\1\150"+
    "\1\0\1\150\42\0\1\150\1\0\1\150\46\0\3\150"+
    "\1\0\1\150\5\0\1\150\1\0\1\150\37\0\3\150"+
    "\1\0\2\150\4\0\1\150\1\0\1\150\37\0\1\150"+
    "\1\0\2\150\1\0\1\150\46\0\3\150\1\0\2\150"+
    "\6\0\1\150\102\0\1\151\7\0\1\152\30\0\1\152"+
    "\67\0\1\153\7\0\1\154\111\0\1\155\20\0\1\156"+
    "\115\0\1\157\13\0\1\160\60\0\1\161\1\0\1\162"+
    "\52\0\1\163\53\0\1\164\45\0\1\165\51\0\1\166"+
    "\50\0\1\167\53\0\1\170\1\0\1\171\2\0\1\172"+
    "\61\0\1\173\53\0\1\174\53\0\1\175\53\0\1\176"+
    "\40\0\1\177\1\0\1\200\2\0\1\201\46\0\1\177"+
    "\2\0\1\202\1\0\1\177\51\0\1\202\1\0\1\203"+
    "\46\0\1\177\1\0\1\200\1\204\1\0\1\177\46\0"+
    "\6\205\4\0\1\205\1\0\1\205\42\0\1\205\1\0"+
    "\1\205\46\0\3\205\1\0\1\205\5\0\1\205\1\0"+
    "\1\205\37\0\3\205\1\0\2\205\4\0\1\205\1\0"+
    "\1\205\37\0\1\205\1\0\2\205\1\0\1\205\46\0"+
    "\3\205\1\0\2\205\6\0\1\205\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4928];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\10\1\11\11\4\1\1\11"+
    "\1\1\12\0\1\1\4\0\1\1\1\11\2\0\2\11"+
    "\2\0\3\1\1\0\1\1\1\0\1\11\2\1\5\0"+
    "\1\1\1\0\3\1\1\11\2\0\3\1\4\0\3\1"+
    "\1\0\1\1\1\11\31\0\1\11\25\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("SCANNER ERROR: "+yytext());
            }
          case 25: break;
          case 2: 
            { 
            }
          case 26: break;
          case 3: 
            { return symbol(sym.NUM, new Integer(yytext()));
            }
          case 27: break;
          case 4: 
            { return symbol(sym.S);
            }
          case 28: break;
          case 5: 
            { return symbol(sym.C);
            }
          case 29: break;
          case 6: 
            { return symbol(sym.CM);
            }
          case 30: break;
          case 7: 
            { return symbol(sym.RO);
            }
          case 31: break;
          case 8: 
            { return symbol(sym.RC);
            }
          case 32: break;
          case 9: 
            { return symbol(sym.CO);
            }
          case 33: break;
          case 10: 
            { return symbol(sym.CC);
            }
          case 34: break;
          case 11: 
            { return symbol(sym.EQ);
            }
          case 35: break;
          case 12: 
            { return symbol(sym.PIPE);
            }
          case 36: break;
          case 13: 
            { return symbol(sym.M);
            }
          case 37: break;
          case 14: 
            { return symbol(sym.ARROW);
            }
          case 38: break;
          case 15: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -1);
            { 
            }
          case 39: break;
          case 16: 
            { return symbol(sym.NAME, yytext());
            }
          case 40: break;
          case 17: 
            { return symbol(sym.MS);
            }
          case 41: break;
          case 18: 
            { return symbol(sym.SEP);
            }
          case 42: break;
          case 19: 
            { return symbol(sym.TOKEN1);
            }
          case 43: break;
          case 20: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -2);
            { 
            }
          case 44: break;
          case 21: 
            { return symbol(sym.TOKEN3);
            }
          case 45: break;
          case 22: 
            { return symbol(sym.PART, yytext());
            }
          case 46: break;
          case 23: 
            { return symbol(sym.PRINT);
            }
          case 47: break;
          case 24: 
            { return symbol(sym.TOKEN2);
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
