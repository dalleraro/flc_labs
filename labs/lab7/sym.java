
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Thu Jul 13 15:28:29 CEST 2017
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int NUM = 2;
  public static final int INT = 3;
  public static final int SC = 9;
  public static final int CM = 10;
  public static final int S = 11;
  public static final int EOF = 0;
  public static final int DOUBLE = 4;
  public static final int PTR = 12;
  public static final int ID = 7;
  public static final int SO = 8;
  public static final int error = 1;
  public static final int FLOAT = 5;
  public static final int CHAR = 6;
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[2]=new String("NUM");
		TT[3]=new String("INT");
		TT[9]=new String("SC");
		TT[10]=new String("CM");
		TT[11]=new String("S");
		TT[0]=new String("EOF");
		TT[4]=new String("DOUBLE");
		TT[12]=new String("PTR");
		TT[7]=new String("ID");
		TT[8]=new String("SO");
		TT[1]=new String("error");
		TT[5]=new String("FLOAT");
		TT[6]=new String("CHAR");
	}
public String getTT(int i){return TT[i];}
}
