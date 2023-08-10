/* Generated by JTB 1.5.1 */
package examples.java.ex1jtb.syntaxtree;

import examples.java.ex1jtb.visitor.IGenVisitor;


/**
 * JTB node class for the production UnaryExpression:<br>
 * Corresponding grammar:<br>
 * f0 -> . %0 #0 "(" #1 Expression() #2 ")"<br>
 * .. .. | %1 Identifier()<br>
 * .. .. | %2 EgInteger()<br>
 * s: 190447292<br>
 */
public class UnaryExpression implements INode {

  /** Child node 0 */
  public NodeChoice f0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with its child node.
   *
   * @param n0 - the child node
   */
  public UnaryExpression(final NodeChoice n0) {
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
