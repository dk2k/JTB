/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;


/**
 * JTB node class for the production CompilationUnit:<br>
 * Corresponding grammar:<br>
 * f0 -> [ PackageDeclaration() ]<br>
 * f1 -> ( ImportDeclaration() )*<br>
 * f2 -> ( TypeDeclaration() )*<br>
 * s: 1761039264<br>
 */
public class CompilationUnit implements INode {

  /** Child node 0 */
  public NodeOptional f0;

  /** Child node 1 */
  public NodeListOptional f1;

  /** Child node 2 */
  public NodeListOptional f2;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   */
  public CompilationUnit(final NodeOptional n0, final NodeListOptional n1, final NodeListOptional n2) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
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
