/* Eg2.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. Eg2.java */
// added to the original JJTree example
package examples.java.ex2jjt;

/** An Arithmetic Grammar. */
public class Eg2/*@bgen(jjtree)*/implements Eg2TreeConstants, Eg2Constants {/*@bgen(jjtree)*/
  protected static JJTEg2State jjtree = new JJTEg2State();/** Main entry point. */
  public static void main(String args [])
  {
    System.err.flush();
    System.out.println("Reading from standard input (JJTree version)...");
    Eg2 t = new Eg2(System.in);
    try
    {
      ASTStart n = t.Start();
      n.dump("");
      System.out.println("Thank you.");
      System.exit(0);
    }
    catch (Exception e)
    {
      System.out.flush();
      System.err.println("Oops.");
      System.err.println(e.getMessage());
      e.printStackTrace();
      System.exit(-1);
    }
  }

/** Main production. */
  static final public ASTStart Start() throws ParseException {/*@bgen(jjtree) Start */
  ASTStart jjtn000 = new ASTStart(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
      jj_consume_token(14);
jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
{if ("" != null) return jjtn000;}
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
}

/** An Expression. */
  static final public void Expression() throws ParseException {
    AdditiveExpression();
}

/** An Additive Expression. */
  static final public void AdditiveExpression() throws ParseException {
ASTAdd jjtn001 = new ASTAdd(JJTADD);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
    try {
      MultiplicativeExpression();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 15:
        case 16:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 15:{
          jj_consume_token(15);
          break;
          }
        case 16:{
          jj_consume_token(16);
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        MultiplicativeExpression();
      }
    } catch (Throwable jjte001) {
if (jjtc001) {
      jjtree.clearNodeScope(jjtn001);
      jjtc001 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte001 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte001;}
    }
    if (jjte001 instanceof ParseException) {
      {if (true) throw (ParseException)jjte001;}
    }
    {if (true) throw (Error)jjte001;}
    } finally {
if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
    }
    }
}

/** A Multiplicative Expression. */
  static final public void MultiplicativeExpression() throws ParseException {
ASTMult jjtn001 = new ASTMult(JJTMULT);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
    try {
      UnaryExpression();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 17:
        case 18:
        case 19:{
          ;
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 17:{
          jj_consume_token(17);
          break;
          }
        case 18:{
          jj_consume_token(18);
          break;
          }
        case 19:{
          jj_consume_token(19);
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        UnaryExpression();
      }
    } catch (Throwable jjte001) {
if (jjtc001) {
      jjtree.clearNodeScope(jjtn001);
      jjtc001 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte001 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte001;}
    }
    if (jjte001 instanceof ParseException) {
      {if (true) throw (ParseException)jjte001;}
    }
    {if (true) throw (Error)jjte001;}
    } finally {
if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
    }
    }
}

/** A Unary Expression. */
// slightly modified, need to create the node
//void UnaryExpression() #void : {}
  static final public void UnaryExpression() throws ParseException {/*@bgen(jjtree) UnaryExpression */
  ASTUnaryExpression jjtn000 = new ASTUnaryExpression(JJTUNARYEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 20:{
        jj_consume_token(20);
        Expression();
        jj_consume_token(21);
        break;
        }
      case IDENTIFIER:{
        MyID();
jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
ASTMyID m = (ASTMyID) ( (ASTUnaryExpression) jjtree.peekNode() ).jjtGetChild(0);
    m.setName("reset");
        break;
        }
      case INTEGER_LITERAL:{
        Integer();
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

/** An Identifier. */
  static final public void MyID() throws ParseException {/*@bgen(jjtree) MyID */
  ASTMyID jjtn000 = new ASTMyID(JJTMYID);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(IDENTIFIER);
jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
// slightly modified from the original example
    jjtn000.setName(t.image + " modified");
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

/** An Integer. */
  static final public void Integer() throws ParseException {/*@bgen(jjtree) Integer */
  ASTInteger jjtn000 = new ASTInteger(JJTINTEGER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INTEGER_LITERAL);
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public Eg2TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x18000,0x18000,0xe0000,0xe0000,0x100880,};
	}

  /** Constructor with InputStream. */
  public Eg2(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Eg2(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new Eg2TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Eg2(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new Eg2TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new Eg2TokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Eg2(Eg2TokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Eg2TokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[22];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 5; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 22; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
