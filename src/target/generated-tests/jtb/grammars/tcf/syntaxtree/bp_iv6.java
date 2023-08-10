/* Generated by JTB 1.5.1 */
package grammars.tcf.syntaxtree;

import grammars.tcf.visitor.IVoidVisitor;


/**
 * JTB node class for the production bp_iv6:<br>
 * Corresponding grammar:<br>
 * f0 -> "6*"<br>
 * s: -699034619<br>
 */
public class bp_iv6 implements INode {

  /** Child node 0 */
  public NodeToken f0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with its child node.
   *
   * @param n0 - the child node
   */
  public bp_iv6(final NodeToken n0) {
    f0 = n0;
  }
  /*
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None)
   */

  /**
   * Accepts a {@link IVoidVisitor} visitor} visitor with user return data.
   *
   * @param vis - the visitor
   */
  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }


}
