/* Generated by JTB 1.5.1 */
package examples.java.ex2jtb.syntaxtree;

import examples.java.ex2jtb.visitor.IGenVisitor;


/**
 * JTB node class for the production ASTInteger:<br>
 * Corresponding grammar:<br>
 * f0 -> < INTEGER_LITERAL ><br>
 * s: -1048223857<br>
 */
public class ASTInteger implements INode {

  /** Child node 0 */
  public NodeToken f0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with its child node.
   *
   * @param n0 - the child node
   */
  public ASTInteger(final NodeToken n0) {
    f0 = n0;
  }
  /*
   * Visitors accept methods (no -novis option, visitors specification : Gen,void,java.lang.String)
   */

  /**
   * Accepts a {@link IGenVisitor} visitor with user argument data.
   *
   * @param vis - the visitor
   * @param argu - the user Argument data
   */
  @Override
  public void accept(final IGenVisitor vis, final String argu) {
    vis.visit(this, argu);
  }


}
