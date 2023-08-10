/* Generated by JTB 1.5.1 */
package grammars.tcf.syntaxtree;

import grammars.tcf.visitor.IVoidVisitor;


/**
 * JTB node class for the production Tcf3:<br>
 * Corresponding grammar:<br>
 * {}f0 -> Identifier()<br>
 * f1 -> f2 -> ( %0 Identifier()<br>
 * .. .. .. .. | %1 Integer_literal() )*<br>
 * f3 -> "."<br>
 * s: 1429321349<br>
 */
public class Tcf3 implements INode {

  /** Child node 0 */
  public Identifier f0;

  /** Child node 1 */
  public NodeListOptional f1;

  /** Child node 2 */
  public Tcf2 f2;

  /** Child node 3 */
  public NodeToken f3;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   * @param n3 - next child node
   */
  public Tcf3(final Identifier n0, final NodeListOptional n1, final Tcf2 n2, final NodeToken n3) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
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
