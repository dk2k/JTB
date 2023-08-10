/* Generated by JTB 1.5.1 */
package examples.java.ex1jtb.syntaxtree;

import examples.java.ex1jtb.Token;

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
  public static final int NB_JTB_USER_NODES = 7;

  /** The Start JTB user node's index */
  public static final int JTB_USER_START = 0;

  /** The Start JTB control signature */
  public static final int JTB_SIG_START = 1859009853;

  /** The Expression JTB user node's index */
  public static final int JTB_USER_EXPRESSION = 1;

  /** The Expression JTB control signature */
  public static final int JTB_SIG_EXPRESSION = -762347234;

  /** The AdditiveExpression JTB user node's index */
  public static final int JTB_USER_ADDITIVEEXPRESSION = 2;

  /** The AdditiveExpression JTB control signature */
  public static final int JTB_SIG_ADDITIVEEXPRESSION = -1807059397;

  /** The MultiplicativeExpression JTB user node's index */
  public static final int JTB_USER_MULTIPLICATIVEEXPRESSION = 3;

  /** The MultiplicativeExpression JTB control signature */
  public static final int JTB_SIG_MULTIPLICATIVEEXPRESSION = 853643830;

  /** The UnaryExpression JTB user node's index */
  public static final int JTB_USER_UNARYEXPRESSION = 4;

  /** The UnaryExpression JTB control signature */
  public static final int JTB_SIG_UNARYEXPRESSION = 190447292;

  /** The Identifier JTB user node's index */
  public static final int JTB_USER_IDENTIFIER = 5;

  /** The Identifier JTB control signature */
  public static final int JTB_SIG_IDENTIFIER = -1580059612;

  /** The EgInteger JTB user node's index */
  public static final int JTB_USER_EGINTEGER = 6;

  /** The EgInteger JTB control signature */
  public static final int JTB_SIG_EGINTEGER = -1048223857;

  /** The JTB user nodes' array */
  public static final String[] JTB_USER_NODE_NAME = new String[NB_JTB_USER_NODES];

  /** Initialize the JTB user nodes' array */
  static {
  JTB_USER_NODE_NAME[0] = "Start"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[1] = "Expression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[2] = "AdditiveExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[3] = "MultiplicativeExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[4] = "UnaryExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[5] = "Identifier"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[6] = "EgInteger"; //$NON-NLS-1$
  }

  /** The JTB control signatures' array */
  public static final int[] JTB_SIGNATURE = new int[NB_JTB_USER_NODES];

  /** Initialize the JTB control signatures' array */
  static {
  JTB_SIGNATURE[0] = JTB_SIG_START;
  JTB_SIGNATURE[1] = JTB_SIG_EXPRESSION;
  JTB_SIGNATURE[2] = JTB_SIG_ADDITIVEEXPRESSION;
  JTB_SIGNATURE[3] = JTB_SIG_MULTIPLICATIVEEXPRESSION;
  JTB_SIGNATURE[4] = JTB_SIG_UNARYEXPRESSION;
  JTB_SIGNATURE[5] = JTB_SIG_IDENTIFIER;
  JTB_SIGNATURE[6] = JTB_SIG_EGINTEGER;
  }

}
