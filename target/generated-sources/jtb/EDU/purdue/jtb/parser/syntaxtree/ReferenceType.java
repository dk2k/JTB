/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;


/**
 * JTB node class for the production ReferenceType:<br>
 * Corresponding grammar:<br>
 * f0 -> . %0 #0 PrimitiveType()<br>
 * .. .. . .. #1 ( $0 "[" $1 "]" )+<br>
 * .. .. | %1 #0 ClassOrInterfaceType()<br>
 * .. .. . .. #1 ( $0 "[" $1 "]" )*<br>
 * s: -275468366<br>
 */
public class ReferenceType implements INode {

  /** Child node 0 */
  public NodeChoice f0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with its child node.
   *
   * @param n0 - the child node
   */
  public ReferenceType(final NodeChoice n0) {
    f0 = n0;
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
