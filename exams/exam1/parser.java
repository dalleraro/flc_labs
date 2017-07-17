
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Thu Jul 13 18:37:20 CEST 2017
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.HashMap;

/** CUP v0.10k generated parser.
  * @version Thu Jul 13 18:37:20 CEST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\003\005\000\002\004" +
    "\004\000\002\004\003\000\002\006\007\000\002\010\005" +
    "\000\002\010\003\000\002\011\005\000\002\005\004\000" +
    "\002\005\002\000\002\020\002\000\002\007\011\000\002" +
    "\012\006\000\002\012\003\000\002\017\002\000\002\013" +
    "\004\000\002\014\004\000\002\014\003\000\002\015\003" +
    "\000\002\015\003\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\004\004\005\001\002\000\006\004\ufffe\010" +
    "\ufffe\001\002\000\004\014\037\001\002\000\004\002\036" +
    "\001\002\000\006\004\005\010\011\001\002\000\006\004" +
    "\uffff\010\uffff\001\002\000\006\002\ufff8\014\ufff8\001\002" +
    "\000\006\002\000\014\013\001\002\000\004\011\015\001" +
    "\002\000\006\002\ufff9\014\ufff9\001\002\000\004\017\ufff7" +
    "\001\002\000\004\017\021\001\002\000\006\006\ufff4\012" +
    "\ufff4\001\002\000\006\006\024\012\023\001\002\000\004" +
    "\014\022\001\002\000\006\006\ufff2\012\ufff2\001\002\000" +
    "\010\014\030\015\031\016\027\001\002\000\004\017\ufff3" +
    "\001\002\000\004\017\021\001\002\000\006\006\ufff5\012" +
    "\ufff5\001\002\000\012\007\uffed\014\uffed\015\uffed\016\uffed" +
    "\001\002\000\012\007\uffef\014\uffef\015\uffef\016\uffef\001" +
    "\002\000\012\007\uffee\014\uffee\015\uffee\016\uffee\001\002" +
    "\000\012\007\ufff0\014\ufff0\015\ufff0\016\ufff0\001\002\000" +
    "\012\007\034\014\030\015\031\016\027\001\002\000\006" +
    "\002\ufff6\014\ufff6\001\002\000\012\007\ufff1\014\ufff1\015" +
    "\ufff1\016\ufff1\001\002\000\004\002\001\001\002\000\004" +
    "\011\047\001\002\000\006\005\ufffb\006\ufffb\001\002\000" +
    "\006\005\043\006\042\001\002\000\004\014\037\001\002" +
    "\000\004\013\044\001\002\000\004\014\045\001\002\000" +
    "\006\004\ufffd\010\ufffd\001\002\000\006\005\ufffc\006\ufffc" +
    "\001\002\000\004\016\050\001\002\000\006\005\ufffa\006" +
    "\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\010\003\005\004\006\006\003\001\001\000" +
    "\002\001\001\000\006\010\040\011\037\001\001\000\002" +
    "\001\001\000\004\006\007\001\001\000\002\001\001\000" +
    "\004\005\011\001\001\000\004\007\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\020\015\001\001\000" +
    "\006\012\017\013\016\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\014" +
    "\032\015\031\001\001\000\004\017\024\001\001\000\004" +
    "\013\025\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\045\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

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


   class Attribute {
      public String n;
      public Integer v;

      public Attribute(String n, Integer v){
         this.n = n;
         this.v = v;
      }
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
          case 20: // token ::= NUM 
            { parser.Tree.reduce(1,"token",0);
              String RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = n.toString(); 
              CUP$parser$result = new java_cup.runtime.Symbol(11/*token*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // token ::= WORD 
            { parser.Tree.reduce(1,"token",0);
              String RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = s; 
              CUP$parser$result = new java_cup.runtime.Symbol(11/*token*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // token ::= ID 
            { parser.Tree.reduce(1,"token",0);
              String RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = s; 
              CUP$parser$result = new java_cup.runtime.Symbol(11/*token*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // sentence ::= token 
            { parser.Tree.reduce(1,"sentence",0);
              String RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = t; 
              CUP$parser$result = new java_cup.runtime.Symbol(10/*sentence*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // sentence ::= sentence token 
            { parser.Tree.reduce(2,"sentence",0);
              String RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = s+" "+t; 
              CUP$parser$result = new java_cup.runtime.Symbol(10/*sentence*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // review ::= SCORE ID 
            { parser.Tree.reduce(2,"review",0);
              Integer RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                     String type = (String)parser.stack(-2);
                     HashMap attHash = (HashMap)parser.symbol_table.get(type);
                     RESULT = s * (Integer)attHash.get(a); 
                  
              CUP$parser$result = new java_cup.runtime.Symbol(9/*review*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // nt0 ::= 
            { parser.Tree.reduce(0,"nt0",0);
              String RESULT = null;
		 RESULT = (String)parser.stack(-2); 
              CUP$parser$result = new java_cup.runtime.Symbol(13/*nt0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // review_list ::= review 
            { parser.Tree.reduce(1,"review_list",0);
              Integer RESULT = null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = x; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*review_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // review_list ::= review_list CM nt0 review 
            { parser.Tree.reduce(4,"review_list",0);
              Integer RESULT = null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = x + y; 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*review_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // desc ::= ID C NT$0 review_list EQ sentence S 
            { parser.Tree.reduce(7,"desc",0);
              Object RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Integer v = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                     System.out.println(s+", "+v);
                  
              CUP$parser$result = new java_cup.runtime.Symbol(5/*desc*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$0 ::= 
            { parser.Tree.reduce(0,"NT$0",0);
              Object RESULT = null;
 RESULT = (String)parser.stack(-1); 
              CUP$parser$result = new java_cup.runtime.Symbol(14/*NT$0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // desc_list ::= 
            { parser.Tree.reduce(0,"desc_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*desc_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // desc_list ::= desc_list desc 
            { parser.Tree.reduce(2,"desc_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*desc_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // att ::= ID C NUM 
            { parser.Tree.reduce(3,"att",0);
              Attribute RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Integer v = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                     RESULT = new Attribute(n, v);
                  
              CUP$parser$result = new java_cup.runtime.Symbol(7/*att*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // att_list ::= att 
            { parser.Tree.reduce(1,"att_list",0);
              HashMap RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Attribute a = (Attribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		
                     HashMap attHash = new HashMap();
                     attHash.put(a.n, a.v);
                     RESULT = attHash;
                  
              CUP$parser$result = new java_cup.runtime.Symbol(6/*att_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // att_list ::= att_list CM att 
            { parser.Tree.reduce(3,"att_list",0);
              HashMap RESULT = null;
		int ahleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int ahright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		HashMap ah = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Attribute a = (Attribute)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		
                     ah.put(a.n, a.v);
                     RESULT = ah;
                  
              CUP$parser$result = new java_cup.runtime.Symbol(6/*att_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // def ::= RO att_list RC ARROW ID 
            { parser.Tree.reduce(5,"def",0);
              Object RESULT = null;
		int ahleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int ahright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		HashMap ah = (HashMap)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		
                     parser.symbol_table.put(s, ah);
                  
              CUP$parser$result = new java_cup.runtime.Symbol(4/*def*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // def_list ::= def 
            { parser.Tree.reduce(1,"def_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*def_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // def_list ::= def_list def 
            { parser.Tree.reduce(2,"def_list",0);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*def_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= def_list DOT desc_list 
            { parser.Tree.reduce(3,"prog",1);
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*prog*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
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
