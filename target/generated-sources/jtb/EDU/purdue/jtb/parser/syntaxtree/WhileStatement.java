/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;


/**
 * JTB node class for the production WhileStatement:<br>
 * Corresponding grammar:<br>
 * f0 -> "while"<br>
 * f1 -> "("<br>
 * f2 -> Expression()<br>
 * f3 -> ")"<br>
 * f4 -> Statement()<br>
 * s: 503551312<br>
 */
public class WhileStatement implements INode {

  /** Child node 0 */
  public NodeToken f0;

  /** Child node 1 */
  public NodeToken f1;

  /** Child node 2 */
  public Expression f2;

  /** Child node 3 */
  public NodeToken f3;

  /** Child node 4 */
  public Statement f4;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   * @param n3 - next child node
   * @param n4 - next child node
   */
  public WhileStatement(final NodeToken n0, final NodeToken n1, final Expression n2, final NodeToken n3, final Statement n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
  }
  /*
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None;Int,int,None)
   */

  /**
   * Accepts a {@link IIntVisitor} visitor with user return data.
   *
   * @param vis - the visitor
   * @return the user Return data
   */
  @Override
  public int accept(final IIntVisitor vis) {
    return vis.visit(this);
  }

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
