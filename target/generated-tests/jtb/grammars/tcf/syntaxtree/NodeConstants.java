/* Generated by JTB 1.5.1 */
package grammars.tcf.syntaxtree;

import grammars.tcf.Token;

/**
 * Provides constants reflecting the JTB user nodes and a factory method for creating Tokens.<br>
 */
public class NodeConstants {

  /**
   * Factory method used by JavaCC to create a new Token object, which will be a (JTB) subclassed NodeToken object.
   *
   * @param ofKind - the token kind
   * @param image - the token image
   *
   * @return a new Token (which is also a NodeToken)
   */
  public static Token newToken(int ofKind, String image) {
    return new NodeToken(ofKind, image);
  }

  /** The number of JTB user nodes */
  public static final int NB_JTB_USER_NODES = 14;

  /** The Start JTB user node's index */
  public static final int JTB_USER_START = 0;

  /** The Start JTB control signature */
  public static final int JTB_SIG_START = 1737026419;

  /** The Tcf1 JTB user node's index */
  public static final int JTB_USER_TCF1 = 1;

  /** The Tcf1 JTB control signature */
  public static final int JTB_SIG_TCF1 = -1841305487;

  /** The Tcf2 JTB user node's index */
  public static final int JTB_USER_TCF2 = 2;

  /** The Tcf2 JTB control signature */
  public static final int JTB_SIG_TCF2 = 803552317;

  /** The Tcf3 JTB user node's index */
  public static final int JTB_USER_TCF3 = 3;

  /** The Tcf3 JTB control signature */
  public static final int JTB_SIG_TCF3 = 553976958;

  /** The bp_iv1 JTB user node's index */
  public static final int JTB_USER_BP_IV1 = 4;

  /** The bp_iv1 JTB control signature */
  public static final int JTB_SIG_BP_IV1 = -699039424;

  /** The bp_iv2 JTB user node's index */
  public static final int JTB_USER_BP_IV2 = 5;

  /** The bp_iv2 JTB control signature */
  public static final int JTB_SIG_BP_IV2 = -699038463;

  /** The bp_iv3 JTB user node's index */
  public static final int JTB_USER_BP_IV3 = 6;

  /** The bp_iv3 JTB control signature */
  public static final int JTB_SIG_BP_IV3 = -699037502;

  /** The bp_iv3_ JTB user node's index */
  public static final int JTB_USER_BP_IV3_ = 7;

  /** The bp_iv3_ JTB control signature */
  public static final int JTB_SIG_BP_IV3_ = -1427135545;

  /** The bp_iv4 JTB user node's index */
  public static final int JTB_USER_BP_IV4 = 8;

  /** The bp_iv4 JTB control signature */
  public static final int JTB_SIG_BP_IV4 = -699036541;

  /** The bp_iv5 JTB user node's index */
  public static final int JTB_USER_BP_IV5 = 9;

  /** The bp_iv5 JTB control signature */
  public static final int JTB_SIG_BP_IV5 = -699035580;

  /** The bp_iv6 JTB user node's index */
  public static final int JTB_USER_BP_IV6 = 10;

  /** The bp_iv6 JTB control signature */
  public static final int JTB_SIG_BP_IV6 = -699034619;

  /** The bp_iv7 JTB user node's index */
  public static final int JTB_USER_BP_IV7 = 11;

  /** The bp_iv7 JTB control signature */
  public static final int JTB_SIG_BP_IV7 = -699033658;

  /** The Identifier JTB user node's index */
  public static final int JTB_USER_IDENTIFIER = 12;

  /** The Identifier JTB control signature */
  public static final int JTB_SIG_IDENTIFIER = -1580059612;

  /** The Integer_literal_boum JTB user node's index */
  public static final int JTB_USER_INTEGER_LITERAL_BOUM = 13;

  /** The Integer_literal_boum JTB control signature */
  public static final int JTB_SIG_INTEGER_LITERAL_BOUM = -1048223857;

  /** The JTB user nodes' array */
  public static final String[] JTB_USER_NODE_NAME = new String[NB_JTB_USER_NODES];

  /** Initialize the JTB user nodes' array */
  static {
  JTB_USER_NODE_NAME[0] = "Start"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[1] = "Tcf1"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[2] = "Tcf2"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[3] = "Tcf3"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[4] = "bp_iv1"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[5] = "bp_iv2"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[6] = "bp_iv3"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[7] = "bp_iv3_"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[8] = "bp_iv4"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[9] = "bp_iv5"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[10] = "bp_iv6"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[11] = "bp_iv7"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[12] = "Identifier"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[13] = "Integer_literal_boum"; //$NON-NLS-1$
  }

  /** The JTB control signatures' array */
  public static final int[] JTB_SIGNATURE = new int[NB_JTB_USER_NODES];

  /** Initialize the JTB control signatures' array */
  static {
  JTB_SIGNATURE[0] = JTB_SIG_START;
  JTB_SIGNATURE[1] = JTB_SIG_TCF1;
  JTB_SIGNATURE[2] = JTB_SIG_TCF2;
  JTB_SIGNATURE[3] = JTB_SIG_TCF3;
  JTB_SIGNATURE[4] = JTB_SIG_BP_IV1;
  JTB_SIGNATURE[5] = JTB_SIG_BP_IV2;
  JTB_SIGNATURE[6] = JTB_SIG_BP_IV3;
  JTB_SIGNATURE[7] = JTB_SIG_BP_IV3_;
  JTB_SIGNATURE[8] = JTB_SIG_BP_IV4;
  JTB_SIGNATURE[9] = JTB_SIG_BP_IV5;
  JTB_SIGNATURE[10] = JTB_SIG_BP_IV6;
  JTB_SIGNATURE[11] = JTB_SIG_BP_IV7;
  JTB_SIGNATURE[12] = JTB_SIG_IDENTIFIER;
  JTB_SIGNATURE[13] = JTB_SIG_INTEGER_LITERAL_BOUM;
  }

}
