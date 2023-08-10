/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;


/**
 * JTB node class for the production EnumBody:<br>
 * Corresponding grammar:<br>
 * f0 -> "{"<br>
 * f1 -> [ #0 EnumConstant()<br>
 * .. .. . #1 ( $0 "," $1 EnumConstant() )* ]<br>
 * f2 -> [ "," ]<br>
 * f3 -> [ #0 ";"<br>
 * .. .. . #1 ( ClassOrInterfaceBodyDeclaration() )* ]<br>
 * f4 -> "}"<br>
 * s: -1338633176<br>
 */
public class EnumBody implements INode {

  /** Child node 0 */
  public NodeToken f0;

  /** Child node 1 */
  public NodeOptional f1;

  /** Child node 2 */
  public NodeOptional f2;

  /** Child node 3 */
  public NodeOptional f3;

  /** Child node 4 */
  public NodeToken f4;

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
  public EnumBody(final NodeToken n0, final NodeOptional n1, final NodeOptional n2, final NodeOptional n3, final NodeToken n4) {
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
