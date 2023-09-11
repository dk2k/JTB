/* Generated by JTB 1.5.1 */
package examples.java.ex3jtb.syntaxtree;

/**
 * Provides constants reflecting the JTB user nodes.<br>
 */
public class NodeConstants {

  /** The number of JTB user nodes */
  public static final int NB_JTB_USER_NODES = 8;

  /** The ASTStart JTB user node's index */
  public static final int JTB_USER_ASTSTART = 0;

  /** The ASTStart JTB control signature */
  public static final int JTB_SIG_ASTSTART = 1859009853;

  /** The ASTExpression JTB user node's index */
  public static final int JTB_USER_ASTEXPRESSION = 1;

  /** The ASTExpression JTB control signature */
  public static final int JTB_SIG_ASTEXPRESSION = -762347234;

  /** The ASTAdditiveExpression JTB user node's index */
  public static final int JTB_USER_ASTADDITIVEEXPRESSION = 2;

  /** The ASTAdditiveExpression JTB control signature */
  public static final int JTB_SIG_ASTADDITIVEEXPRESSION = -1807059397;

  /** The ASTMultiplicativeExpression JTB user node's index */
  public static final int JTB_USER_ASTMULTIPLICATIVEEXPRESSION = 3;

  /** The ASTMultiplicativeExpression JTB control signature */
  public static final int JTB_SIG_ASTMULTIPLICATIVEEXPRESSION = 853643830;

  /** The ASTUnaryExpression JTB user node's index */
  public static final int JTB_USER_ASTUNARYEXPRESSION = 4;

  /** The ASTUnaryExpression JTB control signature */
  public static final int JTB_SIG_ASTUNARYEXPRESSION = 953155740;

  /** The ASTMyID JTB user node's index */
  public static final int JTB_USER_ASTMYID = 5;

  /** The ASTMyID JTB control signature */
  public static final int JTB_SIG_ASTMYID = 0;

  /** The ASTInteger JTB user node's index */
  public static final int JTB_USER_ASTINTEGER = 6;

  /** The ASTInteger JTB control signature */
  public static final int JTB_SIG_ASTINTEGER = 640957941;

  /** The ASTjc_1 JTB user node's index */
  public static final int JTB_USER_ASTJC_1 = 7;

  /** The ASTjc_1 JTB control signature */
  public static final int JTB_SIG_ASTJC_1 = 0;

  /** The JTB user nodes' array */
  public static final String[] JTB_USER_NODE_NAME = new String[NB_JTB_USER_NODES];

  /** Initialize the JTB user nodes' array */
  static {
  JTB_USER_NODE_NAME[0] = "ASTStart"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[1] = "ASTExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[2] = "ASTAdditiveExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[3] = "ASTMultiplicativeExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[4] = "ASTUnaryExpression"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[5] = "ASTMyID"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[6] = "ASTInteger"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[7] = "ASTjc_1"; //$NON-NLS-1$
  }

  /** The JTB control signatures' array */
  public static final int[] JTB_SIGNATURE = new int[NB_JTB_USER_NODES];

  /** Initialize the JTB control signatures' array */
  static {
  JTB_SIGNATURE[0] = JTB_SIG_ASTSTART;
  JTB_SIGNATURE[1] = JTB_SIG_ASTEXPRESSION;
  JTB_SIGNATURE[2] = JTB_SIG_ASTADDITIVEEXPRESSION;
  JTB_SIGNATURE[3] = JTB_SIG_ASTMULTIPLICATIVEEXPRESSION;
  JTB_SIGNATURE[4] = JTB_SIG_ASTUNARYEXPRESSION;
  JTB_SIGNATURE[5] = JTB_SIG_ASTMYID;
  JTB_SIGNATURE[6] = JTB_SIG_ASTINTEGER;
  JTB_SIGNATURE[7] = JTB_SIG_ASTJC_1;
  }

}