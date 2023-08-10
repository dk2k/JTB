/* Generated by JTB 1.5.1 */
package grammars.y.syntaxtree;

import grammars.y.Token;

@SuppressWarnings("javadoc")
public class NodeConstants {

  public static Token newToken(int ofKind, String image) {
    return new NodeToken(ofKind, image);
  }

  public static final int NB_JTB_USER_NODES = 8;

  public static final int JTB_USER_CLASSDECLARATION = 0;

  public static final int JTB_SIG_CLASSDECLARATION = 0;

  public static final int JTB_USER_CLASSNAME = 1;

  public static final int JTB_SIG_CLASSNAME = 0;

  public static final int JTB_USER_METHOD = 2;

  public static final int JTB_SIG_METHOD = 0;

  public static final int JTB_USER_METHODNAME = 3;

  public static final int JTB_SIG_METHODNAME = 0;

  public static final int JTB_USER_INSTRUCTION = 4;

  public static final int JTB_SIG_INSTRUCTION = 0;

  public static final int JTB_USER_BP_JUAL = 5;

  public static final int JTB_SIG_BP_JUAL = 0;

  public static final int JTB_USER_BP_HM = 6;

  public static final int JTB_SIG_BP_HM = 0;

  public static final int JTB_USER_JC_0 = 7;

  public static final int JTB_SIG_JC_0 = 0;

  public static final String[] JTB_USER_NODE_NAME = new String[NB_JTB_USER_NODES];

  static {
  JTB_USER_NODE_NAME[0] = "classDeclaration"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[1] = "className"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[2] = "method"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[3] = "methodName"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[4] = "instruction"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[5] = "bp_jual"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[6] = "bp_hm"; //$NON-NLS-1$
  JTB_USER_NODE_NAME[7] = "jc_0"; //$NON-NLS-1$
  }

  public static final int[] JTB_SIGNATURE = new int[NB_JTB_USER_NODES];

  static {
  JTB_SIGNATURE[0] = JTB_SIG_CLASSDECLARATION;
  JTB_SIGNATURE[1] = JTB_SIG_CLASSNAME;
  JTB_SIGNATURE[2] = JTB_SIG_METHOD;
  JTB_SIGNATURE[3] = JTB_SIG_METHODNAME;
  JTB_SIGNATURE[4] = JTB_SIG_INSTRUCTION;
  JTB_SIGNATURE[5] = JTB_SIG_BP_JUAL;
  JTB_SIGNATURE[6] = JTB_SIG_BP_HM;
  JTB_SIGNATURE[7] = JTB_SIG_JC_0;
  }

}
