
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Jul 14 14:34:51 CEST 2017
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.HashMap;

/** CUP v0.10k generated parser.
  * @version Fri Jul 14 14:34:51 CEST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\003\004\000\002\004" +
    "\004\000\002\006\004\000\002\006\003\000\002\021\002" +
    "\000\002\007\010\000\002\022\002\000\002\010\006\000" +
    "\002\010\003\000\002\011\004\000\002\005\006\000\002" +
    "\005\006\000\002\013\005\000\002\014\005\000\002\012" +
    "\002\000\002\012\004\000\002\015\007\000\002\016\002" +
    "\000\002\017\005\000\002\017\003\000\002\020\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\010\004\001\002\000\004\017\040\001" +
    "\002\000\004\002\037\001\002\000\004\011\010\001\002" +
    "\000\004\002\000\001\002\000\006\012\013\013\014\001" +
    "\002\000\004\013\014\001\002\000\004\012\013\001\002" +
    "\000\004\007\017\001\002\000\004\007\015\001\002\000" +
    "\004\016\016\001\002\000\010\002\ufff3\012\ufff3\021\ufff3" +
    "\001\002\000\004\015\020\001\002\000\010\002\ufff4\013" +
    "\ufff4\021\ufff4\001\002\000\006\002\ufff2\021\ufff2\001\002" +
    "\000\006\002\ufff5\021\024\001\002\000\006\002\ufff1\021" +
    "\ufff1\001\002\000\004\007\uffef\001\002\000\004\007\026" +
    "\001\002\000\004\020\030\001\002\000\006\004\032\006" +
    "\033\001\002\000\006\004\uffec\006\uffec\001\002\000\006" +
    "\004\uffed\006\uffed\001\002\000\004\020\030\001\002\000" +
    "\006\002\ufff0\021\ufff0\001\002\000\006\004\uffee\006\uffee" +
    "\001\002\000\006\002\ufff2\021\ufff2\001\002\000\006\002" +
    "\ufff6\021\024\001\002\000\004\002\001\001\002\000\004" +
    "\014\044\001\002\000\006\011\uffff\017\040\001\002\000" +
    "\006\011\ufffd\017\ufffd\001\002\000\006\011\ufffe\017\ufffe" +
    "\001\002\000\004\007\045\001\002\000\004\020\ufffc\001" +
    "\002\000\004\020\051\001\002\000\006\004\053\006\054" +
    "\001\002\000\006\004\ufff8\006\ufff8\001\002\000\004\017" +
    "\052\001\002\000\006\004\ufff7\006\ufff7\001\002\000\004" +
    "\020\ufffa\001\002\000\006\011\ufffb\017\ufffb\001\002\000" +
    "\004\020\051\001\002\000\006\004\ufff9\006\ufff9\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\006\003\004\004\005\001\001\000\006\006" +
    "\040\007\041\001\001\000\002\001\001\000\004\005\006" +
    "\001\001\000\002\001\001\000\006\013\010\014\011\001" +
    "\001\000\004\014\034\001\001\000\004\013\020\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\021\001\001\000\004\015\022\001\001\000\002\001" +
    "\001\000\004\016\024\001\001\000\002\001\001\000\006" +
    "\017\026\020\030\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\020\033\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\035\001\001\000" +
    "\004\015\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\021\045\001\001\000\006" +
    "\010\046\011\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\022\054" +
    "\001\001\000\002\001\001\000\004\011\055\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    // String buffer used to store output program
    symbol_table = new HashMap();
    System.out.println("OUTPUT:");

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


   public HashMap symbol_table;

   public void report_error(String message, Object info) {
        System.err.print("ERROR: Syntax error");
        if (info instanceof Symbol)
            if (((Symbol)info).left != -1){
                int line = (((Symbol)info).left)+1;
                int column = (((Symbol)info).right)+1;
                System.err.print(" (linea "+line+", colonna "+column+"): ");
            } else System.err.print(": ");
        else System.err.print(": ");
    }
    
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos+position)).value);
    }
    
    public int getLine() {
        if (((Symbol)stack.elementAt(tos)).left != -1){
            return ((Symbol)stack.elementAt(tos)).left+1;
        }else return -1;
    }
    // Return the column number of actual symbol
    public int getColumn() {
        if (((Symbol)stack.elementAt(tos)).left != -1){
            return ((Symbol)stack.elementAt(tos)).right+1;
        }else return -1;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


   public void out(String str){
      System.out.println(str);
   }

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // song ::= NAME 
            { parser.Tree.reduce(1,"song",0);
              Integer RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		
                        Integer size = (Integer)parser.symbol_table.get(n);
                        out(n+" "+size);
                        RESULT = size;

                     
              CUP$parser$result = new java_cup.runtime.Symbol(14/*song*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // song_list ::= song 
            { parser.Tree.reduce(1,"song_list",0);
              Integer RESULT = null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = x; 
              CUP$parser$result = new java_cup.runtime.Symbol(13/*song_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // song_list ::= song_list CM song 
            { parser.Tree.reduce(3,"song_list",0);
              Integer RESULT = null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = x + y; 
              CUP$parser$result = new java_cup.runtime.Symbol(13/*song_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // nt0 ::= 
            { parser.Tree.reduce(0,"nt0",0);
              Object RESULT = null;
		 out((String)parser.stack(0)); 
              CUP$parser$result = new java_cup.runtime.Symbol(12/*nt0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // download ::= IP nt0 C song_list S 
            { parser.Tree.reduce(5,"download",0);
              Object RESULT = null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 out("TOTALE: "+t); 
              CUP$parser$result = new java_cup.runtime.Symbol(11/*download*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // download_list ::= download_list download 
            { parser.Tree.reduce(2,"download_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*download_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // download_list ::= 
            { parser.Tree.reduce(0,"download_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*download_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // time ::= TIMEH C HOUR 
            { parser.Tree.reduce(3,"time",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*time*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // date ::= DATEH C DATE 
            { parser.Tree.reduce(3,"date",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*date*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // secondsec ::= HEADER2 time date download_list 
            { parser.Tree.reduce(4,"secondsec",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*secondsec*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // secondsec ::= HEADER2 date time download_list 
            { parser.Tree.reduce(4,"secondsec",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*secondsec*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // file ::= NAME NUM 
            { parser.Tree.reduce(2,"file",0);
              Object RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer v = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		
                        Integer rate = (Integer)parser.stack(-2);
                        parser.symbol_table.put(n, v*rate);
                     
              CUP$parser$result = new java_cup.runtime.Symbol(7/*file*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // file_list ::= file 
            { parser.Tree.reduce(1,"file_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*file_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // file_list ::= file_list CM NT$1 file 
            { parser.Tree.reduce(4,"file_list",0);
              Object RESULT = null;
              // propagate RESULT from NT$1
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*file_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$1 ::= 
            { parser.Tree.reduce(0,"NT$1",0);
              Object RESULT = null;
 RESULT = (Integer)parser.stack(-2); 
              CUP$parser$result = new java_cup.runtime.Symbol(16/*NT$1*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // desc ::= NUM KBS C NT$0 file_list S 
            { parser.Tree.reduce(6,"desc",0);
              Object RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*desc*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$0 ::= 
            { parser.Tree.reduce(0,"NT$0",0);
              Object RESULT = null;
 RESULT = (Integer)parser.stack(-2); 
              CUP$parser$result = new java_cup.runtime.Symbol(15/*NT$0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // desc_list ::= desc 
            { parser.Tree.reduce(1,"desc_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*desc_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // desc_list ::= desc_list desc 
            { parser.Tree.reduce(2,"desc_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*desc_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // firstsec ::= HEADER1 desc_list 
            { parser.Tree.reduce(2,"firstsec",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*firstsec*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= firstsec secondsec 
            { parser.Tree.reduce(2,"prog",1);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*prog*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

