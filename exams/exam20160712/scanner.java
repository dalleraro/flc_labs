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
    "\11\0\1\56\1\55\1\57\1\57\1\54\22\0\1\56\2\0\1\1"+
    "\4\0\1\27\1\30\1\3\1\14\1\33\1\15\1\0\1\2\1\4"+
    "\1\6\1\16\1\22\1\5\1\20\1\17\1\23\1\24\1\21\1\34"+
    "\1\25\1\0\1\26\1\0\1\7\1\0\1\40\7\11\1\36\3\11"+
    "\1\35\1\37\11\11\1\41\2\11\6\0\1\44\1\10\1\45\1\10"+
    "\1\46\2\10\1\53\1\12\1\13\3\10\1\51\1\10\1\47\1\10"+
    "\1\50\1\42\1\43\2\10\1\52\3\10\1\31\1\0\1\32\7\0"+
    "\1\57\u1fa2\0\1\57\1\57\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\2\4\1\1\2\5\1\6"+
    "\1\7\1\4\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\4\5\2\20\1\21\3\0\1\5\1\4"+
    "\6\5\3\0\1\5\1\4\1\22\4\5\2\0\1\5"+
    "\1\4\1\23\1\5\1\24\1\5\1\25\1\0\1\5"+
    "\1\0\1\5\1\26\1\0\1\25\1\5\1\0\1\27"+
    "\2\0\1\5\6\0\1\25\1\5\5\0\1\25\1\5"+
    "\10\0\1\5\1\0\1\30\1\5\1\0\1\5\1\0"+
    "\1\31\12\0\1\31\16\0\1\31\5\0\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
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
    "\0\0\0\60\0\140\0\220\0\60\0\60\0\300\0\360"+
    "\0\u0120\0\u0150\0\60\0\60\0\u0180\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u01b0\0\u01e0\0\u0210"+
    "\0\u0240\0\u0270\0\60\0\60\0\u02a0\0\u02d0\0\u0300\0\u0330"+
    "\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0"+
    "\0\u04e0\0\u0510\0\u0540\0\u0570\0\u0120\0\u05a0\0\u05d0\0\u0600"+
    "\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0120\0\u0720\0\u0120"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0120\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\u0120\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40"+
    "\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\60\0\u0c30\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10"+
    "\0\60\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\u10e0"+
    "\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260"+
    "\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0"+
    "\0\u1410\0\u1440\0\u1470\0\u14a0\0\u14d0\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
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
    "\1\2\1\3\1\4\1\5\1\6\2\7\1\10\2\11"+
    "\2\12\1\13\1\14\1\15\6\7\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\4\11\1\27"+
    "\2\11\1\30\1\11\1\31\4\11\1\32\2\33\62\0"+
    "\1\34\61\0\1\35\60\0\3\7\7\0\7\7\43\0"+
    "\1\36\1\37\2\36\21\0\5\37\12\36\10\0\3\11"+
    "\1\0\4\11\2\0\7\11\10\0\17\11\10\0\3\11"+
    "\1\0\2\11\2\40\2\0\7\11\10\0\17\11\10\0"+
    "\1\41\2\7\7\0\7\7\37\0\3\11\1\0\4\11"+
    "\2\0\7\11\10\0\1\11\1\42\1\11\1\43\13\11"+
    "\10\0\3\11\1\0\4\11\2\0\7\11\10\0\6\11"+
    "\1\44\6\11\1\45\1\11\10\0\3\11\1\0\4\11"+
    "\2\0\7\11\10\0\7\11\1\46\7\11\10\0\3\11"+
    "\1\0\4\11\2\0\7\11\10\0\13\11\1\47\3\11"+
    "\61\0\1\33\2\0\3\35\1\50\54\35\10\0\1\51"+
    "\1\0\2\51\26\0\12\51\15\0\1\52\23\0\5\52"+
    "\22\0\3\11\1\0\2\11\2\53\2\0\7\11\10\0"+
    "\17\11\10\0\2\7\1\54\7\0\7\7\37\0\3\11"+
    "\1\0\4\11\2\0\7\11\10\0\2\11\1\55\14\11"+
    "\10\0\3\11\1\0\4\11\2\0\7\11\10\0\4\11"+
    "\1\55\12\11\10\0\3\11\1\0\4\11\2\0\7\11"+
    "\10\0\7\11\1\56\7\11\10\0\3\11\1\0\2\11"+
    "\1\57\1\11\2\0\7\11\10\0\17\11\10\0\3\11"+
    "\1\0\4\11\2\0\7\11\10\0\5\11\1\60\11\11"+
    "\10\0\3\11\1\0\2\11\1\61\1\11\2\0\7\11"+
    "\10\0\17\11\4\0\2\35\1\33\1\50\54\35\10\0"+
    "\1\62\1\0\2\62\26\0\12\62\15\0\1\63\23\0"+
    "\5\63\22\0\3\11\1\0\2\11\2\64\2\0\7\11"+
    "\10\0\17\11\10\0\3\7\7\0\1\7\1\65\5\7"+
    "\37\0\3\11\1\0\4\11\2\0\7\11\10\0\6\11"+
    "\1\66\10\11\10\0\3\11\1\0\4\11\2\0\7\11"+
    "\10\0\6\11\1\67\10\11\10\0\3\11\1\0\4\11"+
    "\2\0\7\11\10\0\11\11\1\70\5\11\10\0\3\11"+
    "\1\0\4\11\2\0\7\11\10\0\14\11\1\71\2\11"+
    "\14\0\1\72\1\0\2\72\26\0\12\72\15\0\1\73"+
    "\23\0\5\73\22\0\3\11\1\0\2\11\2\74\2\0"+
    "\7\11\10\0\17\11\6\0\1\75\1\0\3\7\7\0"+
    "\7\7\37\0\3\11\1\0\4\11\2\0\7\11\10\0"+
    "\10\11\1\76\6\11\10\0\3\11\1\0\4\11\2\0"+
    "\7\11\10\0\6\11\1\77\10\11\12\0\1\100\1\0"+
    "\1\62\1\0\2\62\26\0\12\62\15\0\1\101\23\0"+
    "\5\101\22\0\3\11\1\0\2\11\2\102\2\0\7\11"+
    "\10\0\17\11\10\0\1\103\57\0\3\11\1\0\4\11"+
    "\2\0\7\11\10\0\16\11\1\104\10\0\1\105\1\0"+
    "\1\106\57\0\1\100\2\0\1\73\23\0\5\73\22\0"+
    "\3\11\1\0\2\11\2\107\2\110\7\11\10\0\17\11"+
    "\23\0\1\111\1\112\2\0\1\113\1\114\37\0\1\106"+
    "\1\0\1\115\55\0\1\116\1\0\1\116\55\0\3\11"+
    "\1\0\2\11\2\117\2\0\7\11\10\0\17\11\16\0"+
    "\2\120\46\0\1\121\57\0\1\122\57\0\1\123\57\0"+
    "\1\124\61\0\1\116\1\0\1\125\55\0\1\125\1\0"+
    "\1\125\55\0\3\11\1\0\2\11\2\126\2\0\7\11"+
    "\10\0\17\11\16\0\2\127\50\0\1\130\1\0\1\131"+
    "\7\0\1\132\3\0\1\133\53\0\1\134\3\0\1\135"+
    "\41\0\1\130\1\0\1\131\7\0\1\131\3\0\1\135"+
    "\41\0\1\130\1\0\1\136\55\0\3\11\1\0\2\11"+
    "\2\137\2\0\7\11\10\0\17\11\16\0\2\140\51\0"+
    "\2\141\7\0\7\141\37\0\3\141\7\0\7\141\37\0"+
    "\1\141\1\0\1\141\7\0\7\141\37\0\1\141\74\0"+
    "\1\141\2\0\1\141\37\0\1\141\1\0\1\141\55\0"+
    "\3\141\7\0\1\141\1\0\1\141\1\0\1\141\41\0"+
    "\3\11\1\0\2\11\2\142\2\0\7\11\10\0\17\11"+
    "\16\0\2\143\50\0\3\11\1\0\2\11\2\144\2\0"+
    "\7\11\10\0\17\11\16\0\2\145\50\0\3\11\1\0"+
    "\4\11\2\110\7\11\10\0\17\11\16\0\2\146\56\0"+
    "\2\147\2\150\54\0\2\151\56\0\2\152\56\0\2\153"+
    "\56\0\2\154\56\0\2\155\56\0\2\156\56\0\2\157"+
    "\56\0\2\160\56\0\2\161\56\0\2\162\60\0\2\150"+
    "\54\0\2\163\56\0\2\164\2\165\54\0\2\166\56\0"+
    "\2\167\56\0\2\170\56\0\2\171\56\0\2\172\56\0"+
    "\2\173\56\0\2\174\56\0\2\175\56\0\2\176\56\0"+
    "\2\177\60\0\2\165\54\0\2\200\56\0\2\201\56\0"+
    "\2\202\56\0\2\203\56\0\2\204\56\0\2\205\56\0"+
    "\2\206\44\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5376];
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
    "\1\0\1\11\2\1\2\11\4\1\2\11\1\1\10\11"+
    "\5\1\2\11\3\0\10\1\3\0\7\1\2\0\7\1"+
    "\1\0\1\1\1\0\2\1\1\0\2\1\1\0\1\1"+
    "\2\0\1\1\6\0\2\1\5\0\1\11\1\1\10\0"+
    "\1\1\1\0\1\11\1\1\1\0\1\1\1\0\1\1"+
    "\12\0\1\1\16\0\1\1\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
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
    private Symbol sym(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol sym(int type, Object value) {
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
    while (i < 182) {
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
            { System.out.println("Scanner Error: " + yytext());
            }
          case 26: break;
          case 2: 
            { return sym(sym.DIV);
            }
          case 27: break;
          case 3: 
            { return sym(sym.MUL);
            }
          case 28: break;
          case 4: 
            { return sym(sym.UINT, Integer.parseInt(yytext()));
            }
          case 29: break;
          case 5: 
            { return sym(sym.VAR, yytext());
            }
          case 30: break;
          case 6: 
            { return sym(sym.PLUS);
            }
          case 31: break;
          case 7: 
            { return sym(sym.MINUS);
            }
          case 32: break;
          case 8: 
            { return sym(sym.S);
            }
          case 33: break;
          case 9: 
            { return sym(sym.EQ);
            }
          case 34: break;
          case 10: 
            { return sym(sym.RO);
            }
          case 35: break;
          case 11: 
            { return sym(sym.RC);
            }
          case 36: break;
          case 12: 
            { return sym(sym.CO);
            }
          case 37: break;
          case 13: 
            { return sym(sym.CC);
            }
          case 38: break;
          case 14: 
            { return sym(sym.CM);
            }
          case 39: break;
          case 15: 
            { return sym(sym.C);
            }
          case 40: break;
          case 16: 
            { ;
            }
          case 41: break;
          case 17: 
            { return sym(sym.SEP);
            }
          case 42: break;
          case 18: 
            { return sym(sym.OP, yytext());
            }
          case 43: break;
          case 19: 
            { return sym(sym.STAT);
            }
          case 44: break;
          case 20: 
            { return sym(sym.CASE);
            }
          case 45: break;
          case 21: 
            { return sym(sym.TOKEN1);
            }
          case 46: break;
          case 22: 
            { return sym(sym.PRINT);
            }
          case 47: break;
          case 23: 
            { return sym(sym.SWITCH);
            }
          case 48: break;
          case 24: 
            { return sym(sym.DATE);
            }
          case 49: break;
          case 25: 
            { return sym(sym.TOKEN2);
            }
          case 50: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
