
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Jul 18 17:29:18 CEST 2017
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int PLUS = 18;
  public static final int CO = 7;
  public static final int CM = 5;
  public static final int STAT = 14;
  public static final int OP = 23;
  public static final int DATE = 13;
  public static final int S = 2;
  public static final int RO = 4;
  public static final int SWITCH = 17;
  public static final int CC = 8;
  public static final int RC = 6;
  public static final int EOF = 0;
  public static final int C = 9;
  public static final int DIV = 21;
  public static final int MINUS = 19;
  public static final int SEP = 10;
  public static final int CASE = 15;
  public static final int PRINT = 16;
  public static final int error = 1;
  public static final int TOKEN2 = 12;
  public static final int EQ = 3;
  public static final int TOKEN1 = 11;
  public static final int UINT = 24;
  public static final int MUL = 20;
  public static final int VAR = 22;
  public static final int UMINUS = 25;
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[18]=new String("PLUS");
		TT[7]=new String("CO");
		TT[5]=new String("CM");
		TT[14]=new String("STAT");
		TT[23]=new String("OP");
		TT[13]=new String("DATE");
		TT[2]=new String("S");
		TT[4]=new String("RO");
		TT[17]=new String("SWITCH");
		TT[8]=new String("CC");
		TT[6]=new String("RC");
		TT[0]=new String("EOF");
		TT[9]=new String("C");
		TT[21]=new String("DIV");
		TT[19]=new String("MINUS");
		TT[10]=new String("SEP");
		TT[15]=new String("CASE");
		TT[16]=new String("PRINT");
		TT[1]=new String("error");
		TT[12]=new String("TOKEN2");
		TT[3]=new String("EQ");
		TT[11]=new String("TOKEN1");
		TT[24]=new String("UINT");
		TT[20]=new String("MUL");
		TT[22]=new String("VAR");
		TT[25]=new String("UMINUS");
	}
public String getTT(int i){return TT[i];}
}