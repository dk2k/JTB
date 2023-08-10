/* TcfGrammar.java */
/* Generated By:JavaCC: Do not edit this line. TcfGrammar.java */
package grammars.tcf;

import grammars.tcf.visitor.*;
import grammars.tcf.syntaxtree.*;


public class TcfGrammar implements TcfGrammarConstants {


  /* --- User code --- */

  public static void main(String args[]) {
    System.err.println("TcfGrammar Reading ...");
    new TcfGrammar(System.in);
    try {
      System.err.println("... Parsing ...");
      Start start = TcfGrammar.Start();
      System.err.println("... Parsing OK, now visiting ...");
      DepthFirstVoidVisitor v = new MyVisitor();
      start.accept(v);
      System.err.println("TcfGrammar ending.");
      System.exit(0);
    }
    catch (ParseException e) {
      System.err.print("... Oops! ParseException: ");
      System.err.println(e.getMessage());
      e = null;
      System.err.println("TcfGrammar returning");
      System.err.flush();
      System.exit(-2);
    }
    catch (final Exception e) {
      System.err.println("... Oops! Exception: ");
      e.printStackTrace();
      System.err.println("TcfGrammar exiting");
      System.err.flush();
      System.exit(-1);
    }
  }

  private static void info(final String aMsg) {
    String tk0 = getToken(0).toString();
    String tk1 = getToken(1).toString();
    String ct0 = tk0 == null ? "!null!" : tk0.length() == 0 ? "!empty!" : tk0;
    String ct1 = tk1 == null ? "!null!" : tk1.length() == 0 ? "!empty!" : tk1;
    System.err.println(aMsg + ", current token = " + ct0 + ", next token = " + ct1);
  }

  static final public Start Start() throws ParseException {// --- JTB generated node declarations ---
  NodeChoice n0 = null;
  NodeSequence n1 = null;
  Tcf1 n2 = null;
  NodeToken n3 = null;
  Token n4 = null;
  NodeSequence n5 = null;
  NodeSequence n6 = null;
  bp_iv1 n7 = null;
  NodeSequence n8 = null;
  bp_iv2 n9 = null;
  NodeChoice n10 = null;
  NodeSequence n11 = null;
  bp_iv3 n12 = null;
  NodeSequence n13 = null;
  bp_iv3_ n14 = null;
  NodeChoice n15 = null;
  NodeSequence n16 = null;
  bp_iv3 n17 = null;
  NodeSequence n18 = null;
  bp_iv4 n19 = null;
  bp_iv5 n20 = null;
  NodeChoice n21 = null;
  NodeSequence n22 = null;
  bp_iv6 n23 = null;
  bp_iv7 n24 = null;
  NodeToken n25 = null;
  Token n26 = null;
  Start jtbNode = null;
  // --- user BNFProduction java block ---
  int[] iva = new int[]{ 11 };
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
info("before 1st choice");
n1 = new NodeSequence(2);
      n2 = Tcf1();
n1.addNode(n2);
info("passed Tcf1()");
      n4 = jj_consume_token(0);
n4.beginColumn++;
n4.endColumn++;
n3 = (NodeToken) n4;
n1.addNode(n3);
n0 = new NodeChoice(n1, 0, 2);
info("after 1st EOF");
      break;
      }
    case 18:{
System.err.println("nodes will be created or not depending on the input data and differently by JTB and JJT");
n5 = new NodeSequence(7);
info("before 2nd choice");
      try {
n6 = new NodeSequence(1);
        n7 = bp_iv1(iva);
n6.addNode(n7);
      } catch (Exception e) {

      }
n5.addNode(n6);
info("passed bp_iv1(iva)");
      try {
        bp_iv1$(1);
      } catch (Exception e) {

      }
info("passed bp_iv1$(1)");
      try {
n8 = new NodeSequence(1);
        n9 = bp_iv2(iva);
n8.addNode(n9);
        bp_iv2$(2);
      } catch (Exception e) {

      }
n5.addNode(n8);
info("passed bp_iv2(iva) bp_iv2$(2)");
      try {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 22:{
n11 = new NodeSequence(1);
          n12 = bp_iv3(iva);
n11.addNode(n12);
n10 = new NodeChoice(n11, 0, 2);
          break;
          }
        case 24:{
n13 = new NodeSequence(1);
          n14 = bp_iv3_(30);
n13.addNode(n14);
n10 = new NodeChoice(n13, 1, 2);
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Exception e) {

      }
n5.addNode(n10);
info("passed bp_iv3(iva) | bp_iv3_(30)");
      try {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 22:{
n16 = new NodeSequence(1);
          n17 = bp_iv3(iva);
n16.addNode(n17);
n15 = new NodeChoice(n16, 0, 2);
          break;
          }
        case 23:{
          bp_iv3$(3);
n15 = new NodeChoice(null, 1, 2);
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Exception e) {

      }
n5.addNode(n15);
info("passed bp_iv3(iva) | bp_iv3$(3)");
      try {
n18 = new NodeSequence(2);
        n19 = bp_iv4(iva);
n18.addNode(n19);
        bp_iv4$(4);
        n20 = bp_iv5(iva);
n18.addNode(n20);
        bp_iv5$(5);
      } catch (Exception e) {

      }
n5.addNode(n18);
info("passed bp_iv4(iva) bp_iv4$(4) bp_iv5(iva) bp_iv5$(5)");
      try {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 29:{
n22 = new NodeSequence(2);
          n23 = bp_iv6(iva);
n22.addNode(n23);
          n24 = bp_iv7(iva);
n22.addNode(n24);
n21 = new NodeChoice(n22, 0, 2);
          break;
          }
        case 30:{
          bp_iv6$(6);
          bp_iv7$(7);
n21 = new NodeChoice(null, 1, 2);
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Exception e) {

      }
n5.addNode(n21);
info("passed bp_iv6(iva) bp_iv7(iva) | bp_iv6$(6) bp_iv7$(7)");
      n26 = jj_consume_token(0);
n26.beginColumn++;
n26.endColumn++;
n25 = (NodeToken) n26;
n5.addNode(n25);
info("after 2nd EOF");
n0 = new NodeChoice(n5, 1, 2);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
jtbNode = new Start(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final public Tcf1 Tcf1() throws ParseException {// --- JTB generated node declarations ---
  Identifier n0 = null;
  NodeListOptional n1 = new NodeListOptional();
  NodeChoice n2 = null;
  NodeSequence n3 = null;
  Identifier n4 = null;
  NodeSequence n5 = null;
  Integer_literal n6 = null;
  Tcf2 n7 = null;
  NodeToken n8 = null;
  Token n9 = null;
  Tcf1 jtbNode = null;
    try {
System.err.println("--- Tcf1 in try ---");
      // ExpansionChoices with no choice, but with a sequence of 4 nodes
          n0 = Identifier();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INTEGER_LITERAL:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          break label_1;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENTIFIER:{
n3 = new NodeSequence(1);
          n4 = Identifier();
n3.addNode(n4);
n2 = new NodeChoice(n3, 0, 2);
          break;
          }
        case INTEGER_LITERAL:{
n5 = new NodeSequence(1);
          n6 = Integer_literal();
n5.addNode(n6);
n2 = new NodeChoice(n5, 1, 2);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
n1.addNode(n2);
      }
n1.nodes.trimToSize();
      jj_consume_token(16);
System.err.println("--- Tcf1 should not see a node ';' ---");
      n7 = Tcf2();
    } catch (NullPointerException npe) {
System.err.println("--- Tcf1 in catch NPE: swallowed NPE: < " + npe.getMessage() + " >");
  // note that here the node which should have been created by the production that raised the NPE
  //  (Integer_literal()) will not be created and inserted in the tree

    } catch (Exception e) {
System.err.println("--- Tcf1 in catch Ex; could occurr with invalid input; " + e);
    e = null;
    } finally {
System.err.println("--- Tcf1 in finally --- ");
    }
    n9 = jj_consume_token(17);
n8 = (NodeToken) n9;
System.err.println("--- Tcf1 should see '.' and return ---");
jtbNode = new Tcf1(n0, n1, n7, n8);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final public Tcf2 Tcf2() throws ParseException {// --- JTB generated node declarations ---
  Identifier n0 = null;
  NodeListOptional n1 = new NodeListOptional();
  NodeChoice n2 = null;
  NodeSequence n3 = null;
  Identifier n4 = null;
  NodeSequence n5 = null;
  NodeSequence n6 = null;
  Integer_literal n7 = null;
  Tcf2 jtbNode = null;
    try {
System.err.println("--- Tcf2 in try ---");
      // ExpansionChoices with no choice, but with a sequence of 2 nodes
          n0 = Identifier();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INTEGER_LITERAL:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          break label_2;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENTIFIER:{
n3 = new NodeSequence(1);
          n4 = Identifier();
n3.addNode(n4);
n2 = new NodeChoice(n3, 0, 2);
          break;
          }
        case INTEGER_LITERAL:{
n5 = new NodeSequence(1);
          try {
System.err.println("--- Tcf2 in subtry ---");
n6 = new NodeSequence(1);
            n7 = Integer_literal();
n6.addNode(n7);
          } catch (NullPointerException npe) {
System.err.println("--- Tcf2 in subcatch NPE: swallowed NPE: < " + npe.getMessage() + " >");
          }
n2 = new NodeChoice(n5, 1, 2);
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
n1.addNode(n2);
      }
n1.nodes.trimToSize();
    } catch (Exception e) {
System.err.println("--- Tcf2 in catch Ex; could occurr with invalid input; " + e);
    e = null;
    } finally {
System.err.println("--- Tcf2 in finally --- ");
    }
jtbNode = new Tcf2(n0, n1);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final public Tcf3 Tcf3() throws ParseException {// --- JTB generated node declarations ---
  Identifier n0 = null;
  NodeListOptional n1 = new NodeListOptional();
  NodeChoice n2 = null;
  NodeSequence n3 = null;
  Identifier n4 = null;
  NodeSequence n5 = null;
  Integer_literal n6 = null;
  Tcf2 n7 = null;
  NodeToken n8 = null;
  Token n9 = null;
  Tcf3 jtbNode = null;
    try {
System.err.println("--- Tcf3 in try ---");
      // ExpansionChoices with no choice, but with a sequence of 4 nodes
          n0 = Identifier();
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INTEGER_LITERAL:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_3;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENTIFIER:{
n3 = new NodeSequence(1);
          n4 = Identifier();
n3.addNode(n4);
n2 = new NodeChoice(n3, 0, 2);
          break;
          }
        case INTEGER_LITERAL:{
n5 = new NodeSequence(1);
          n6 = Integer_literal();
n5.addNode(n6);
n2 = new NodeChoice(n5, 1, 2);
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
n1.addNode(n2);
      }
n1.nodes.trimToSize();
      jj_consume_token(16);
System.err.println("--- Tcf3 should not see a node ';' ---");
      n7 = Tcf2();
    } finally {
System.err.println("--- Tcf3 in finally --- ");
    }
    n9 = jj_consume_token(17);
n8 = (NodeToken) n9;
System.err.println("--- Tcf3 should see '.' and return ---");
jtbNode = new Tcf3(n0, n1, n7, n8);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final public Tcf4 Tcf4() throws ParseException {// --- JTB generated node declarations ---
  Identifier n0 = null;
  NodeListOptional n1 = new NodeListOptional();
  NodeChoice n2 = null;
  NodeSequence n3 = null;
  Identifier n4 = null;
  NodeSequence n5 = null;
  Integer_literal n6 = null;
  Tcf2 n7 = null;
  Tcf4 jtbNode = null;
    try {
System.err.println("--- Tcf4 in try ---");
      // ExpansionChoices with no choice, but with a sequence of 4 nodes
          n0 = Identifier();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INTEGER_LITERAL:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          break label_4;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENTIFIER:{
n3 = new NodeSequence(1);
          n4 = Identifier();
n3.addNode(n4);
n2 = new NodeChoice(n3, 0, 2);
          break;
          }
        case INTEGER_LITERAL:{
n5 = new NodeSequence(1);
          n6 = Integer_literal();
n5.addNode(n6);
n2 = new NodeChoice(n5, 1, 2);
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
n1.addNode(n2);
      }
n1.nodes.trimToSize();
      jj_consume_token(16);
System.err.println("--- Tcf4 should not see a node ';' ---");
      n7 = Tcf2();
    } catch (/* final */ NullPointerException npe) {
System.err.println("--- Tcf4 in catch NPE: swallowed NPE: < " + npe.getMessage() + " >");
  // note that here the node which should have been created by the production that raised the NPE
  //  (Integer_literal()) will not be created and inserted in the tree

    } catch (Exception e) {
System.err.println("--- Tcf4 in catch Ex; could occurr with invalid input; " + e);
    e = null;
    }
jtbNode = new Tcf4(n0, n1, n7);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private bp_iv1 bp_iv1(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv1 jtbNode = null;
info("iv1 0");
    n1 = jj_consume_token(18);
n0 = (NodeToken) n1;
info("iv1 1");
    jj_consume_token(NUM_2$);
info("iv1 2");
{if (true) throw new IllegalStateException("dummy ise 1");}
jtbNode = new bp_iv1(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv1$(final int i) throws ParseException, IllegalStateException {
info("iv1$ 0");
    jj_consume_token(19);
info("iv1$ 1");
    jj_consume_token(NUM_3_9);
info("iv1$ 2");
if (i == 1) {
      {if (true) throw new IllegalStateException("dummy ise 1$");}
    }
}

  static final private bp_iv2 bp_iv2(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv2 jtbNode = null;
info("iv2 0");
    n1 = jj_consume_token(20);
n0 = (NodeToken) n1;
info("iv2 1");
    jj_consume_token(NUM_2$);
info("iv2 2");
{if (true) throw new IllegalStateException("dummy ise 2");}
jtbNode = new bp_iv2(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv2$(final int i) throws ParseException, IllegalStateException {
info("iv2$ 0");
    jj_consume_token(21);
info("iv2$ 1");
    jj_consume_token(NUM_3_9);
info("iv2$ 2");
if (i == 2) {
      {if (true) throw new IllegalStateException("dummy ise 2$");}
    }
}

  static final private bp_iv3 bp_iv3(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv3 jtbNode = null;
info("iv3 0");
    n1 = jj_consume_token(22);
n0 = (NodeToken) n1;
info("iv3 1");
    jj_consume_token(NUM_2$);
info("iv3 2");
{if (true) throw new IllegalStateException("dummy ise 3");}
jtbNode = new bp_iv3(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv3$(final int i) throws ParseException, IllegalStateException {
info("iv3$ 0");
    jj_consume_token(23);
info("iv3$ 1");
    jj_consume_token(NUM_3_9);
info("iv3$ 2");
if (i == 3) {
      {if (true) throw new IllegalStateException("dummy ise 3$");}
    }
}

  static final private bp_iv3_ bp_iv3_(final int i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  NodeToken n2 = null;
  Token n3 = null;
  bp_iv3_ jtbNode = null;
info("iv3_ 0");
    n1 = jj_consume_token(24);
n0 = (NodeToken) n1;
info("iv3_ 1");
    n3 = jj_consume_token(NUM_3_9);
n2 = (NodeToken) n3;
info("iv3_ 2");
if (i == 3) {
      {if (true) throw new IllegalStateException("dummy ise 3_");}
    }
jtbNode = new bp_iv3_(n0, n2);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private bp_iv4 bp_iv4(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv4 jtbNode = null;
info("iv4 0");
    n1 = jj_consume_token(25);
n0 = (NodeToken) n1;
info("iv4 1");
    jj_consume_token(NUM_2$);
info("iv4 2");
{if (true) throw new IllegalStateException("dummy ise 4");}
jtbNode = new bp_iv4(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv4$(final int i) throws ParseException, IllegalStateException {
info("iv4$ 0");
    jj_consume_token(26);
info("iv4$ 1");
    jj_consume_token(NUM_3_9);
info("iv4$ 2");
if (i == 4) {
      {if (true) throw new IllegalStateException("dummy ise 4$");}
    }
}

  static final private bp_iv5 bp_iv5(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv5 jtbNode = null;
info("iv5 0");
    n1 = jj_consume_token(27);
n0 = (NodeToken) n1;
info("iv5 1");
    jj_consume_token(NUM_2$);
info("iv5 2");
{if (true) throw new IllegalStateException("dummy ise 5");}
jtbNode = new bp_iv5(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv5$(final int i) throws ParseException, IllegalStateException {
info("iv5$ 0");
    jj_consume_token(28);
info("iv5$ 1");
    jj_consume_token(NUM_3_9);
info("iv5$ 2");
if (i == 5) {
      {if (true) throw new IllegalStateException("dummy ise 5$");}
    }
}

  static final private bp_iv6 bp_iv6(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv6 jtbNode = null;
info("iv6 0");
    n1 = jj_consume_token(29);
n0 = (NodeToken) n1;
info("iv6 1");
    jj_consume_token(NUM_2$);
info("iv6 2");
{if (true) throw new IllegalStateException("dummy ise 6");}
jtbNode = new bp_iv6(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv6$(final int i) throws ParseException, IllegalStateException {
info("iv6$ 0");
    jj_consume_token(30);
info("iv6$ 1");
    jj_consume_token(NUM_3_9);
info("iv6$ 2");
if (i == 6) {
      {if (true) throw new IllegalStateException("dummy ise 6$");}
    }
}

  static final private bp_iv7 bp_iv7(int[] i) throws ParseException, IllegalStateException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  bp_iv7 jtbNode = null;
info("iv7 0");
    n1 = jj_consume_token(31);
n0 = (NodeToken) n1;
info("iv7 1");
    jj_consume_token(NUM_2$);
info("iv7 2");
{if (true) throw new IllegalStateException("dummy ise 7");}
jtbNode = new bp_iv7(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final private void bp_iv7$(final int i) throws ParseException, IllegalStateException {
info("iv7$ 0");
    jj_consume_token(32);
info("iv7$ 1");
    jj_consume_token(NUM_3_9);
info("iv7$ 2");
if (i == 7) {
      {if (true) throw new IllegalStateException("dummy ise 7$");}
    }
}

  static final public Identifier Identifier() throws ParseException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  Identifier jtbNode = null;
  // --- user BNFProduction java block ---
  Token tk = null;
    // --- user BNFProduction ExpansionChoices ---
      n1 = jj_consume_token(IDENTIFIER);
n0 = (NodeToken) n1;
tk = n1;
System.err.println("--- Identifier found < " + tk.image + " > ---");
jtbNode = new Identifier(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static final public Integer_literal Integer_literal() throws ParseException {// --- JTB generated node declarations ---
  NodeToken n0 = null;
  Token n1 = null;
  Integer_literal jtbNode = null;
  // --- user BNFProduction java block ---
  Token tk = null;
    // --- user BNFProduction ExpansionChoices ---
      n1 = jj_consume_token(INTEGER_LITERAL);
n0 = (NodeToken) n1;
tk = n1;
System.err.println("--- Integer_literal found < " + tk.image + " > ---");
    {if (true) throw new NullPointerException("boum");}
jtbNode = new Integer_literal(n0);
{if ("" != null) return jtbNode;}
    throw new Error("Missing return statement in function");
}

  static void justSkip() throws ParseException, IllegalStateException {Token tk = getNextToken();
  throw new IllegalStateException();
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public TcfGrammarTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x1400000,0xc00000,0x60000000,0x42000,0x2080,0x2080,0x2080,0x2080,0x2080,0x2080,0x2080,0x2080,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}

  /** Constructor with InputStream. */
  public TcfGrammar(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public TcfGrammar(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new TcfGrammarTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
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
	 jj_gen = 0;
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public TcfGrammar(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new TcfGrammarTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new TcfGrammarTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public TcfGrammar(TcfGrammarTokenManager tm) {
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
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TcfGrammarTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 12; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[33];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 12; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 33; i++) {
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


/** Tracing visitor, in same file for simplicity; just traces */
class MyVisitor extends DepthFirstVoidVisitor {
  /* --- User code --- */

  /** {@inheritDoc} */
  @Override public void visit(final NodeChoice n) {
    System.err.println("*** Entering visit NodeChoice ***");
    super.visit(n);
    System.err.println("*** Exiting visit NodeChoice ***");
    return;
  }

  /** {@inheritDoc} */
  @Override public void visit(final NodeList n) {
    System.err.println("*** Entering visit NodeList ***");
    super.visit(n);
    System.err.println("*** Exiting visit NodeList ***");
    return;
  }

  /** {@inheritDoc} */
  @Override public void visit(final NodeListOptional n) {
    System.err.println("*** Entering visit NodeListOptional ***");
    super.visit(n);
    System.err.println("*** Exiting visit NodeListOptional ***");
    return;
  }

  /** {@inheritDoc} */
  @Override public void visit(final NodeOptional n) {
    System.err.println("*** Entering visit NodeOptional ***");
    super.visit(n);
    System.err.println("*** Exiting visit NodeOptional ***");
    return;
  }

  /** {@inheritDoc} */
  @Override public void visit(final NodeSequence n) {
    System.err.println("*** Entering visit NodeSequence ***");
    super.visit(n);
    System.err.println("*** Exiting visit NodeSequence ***");
    return;
  }

  /** {@inheritDoc} */
  @Override public void visit(NodeToken n) {
    System.err.println("*** Just visited <" + n.tokenImage + "> ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Start n) {
    System.err.println("*** Entering visit Start ***");
    super.visit(n);
    System.err.println("*** Exiting visit Start ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Tcf1 n) {
    System.err.println("*** Entering visit Tcf1 ***");
    super.visit(n);
    System.err.println("*** Exiting visit Tcf1 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Tcf2 n) {
    System.err.println("*** Entering visit Tcf2 ***");
    super.visit(n);
    System.err.println("*** Exiting visit Tcf2 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Tcf3 n) {
    System.err.println("*** Entering visit Tcf3 ***");
    super.visit(n);
    System.err.println("*** Exiting visit Tcf3 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Tcf4 n) {
    System.err.println("*** Entering visit Tcf4 ***");
    super.visit(n);
    System.err.println("*** Exiting visit Tcf4 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv1 n) {
    System.err.println("*** Entering visit bp_iv1 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv1 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv2 n) {
    System.err.println("*** Entering visit bp_iv2 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv2 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv3 n) {
    System.err.println("*** Entering visit bp_iv3 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv3 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv3_ n) {
    System.err.println("*** Entering visit bp_iv3_ ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv3_ ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv4 n) {
    System.err.println("*** Entering visit bp_iv4 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv4 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv5 n) {
    System.err.println("*** Entering visit bp_iv5 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv5 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv6 n) {
    System.err.println("*** Entering visit bp_iv6 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv6 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(bp_iv7 n) {
    System.err.println("*** Entering visit bp_iv7 ***");
    super.visit(n);
    System.err.println("*** Exiting visit bp_iv7 ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Identifier n) {
    System.err.println("*** Entering visit Identifier ***");
    super.visit(n);
    System.err.println("*** Exiting visit Identifier ***");
  }

  /** {@inheritDoc} */
  @Override public void visit(Integer_literal n) {
    System.err.println("*** Entering visit Integer_literal ***");
    super.visit(n);
    System.err.println("*** Exiting visit Integer_literal ***");
  }
}
