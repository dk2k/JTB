/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import EDU.purdue.jtb.parser.Token;
import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;


/**
 * JTB node class for the production MethodDeclaration:<br>
 * Corresponding grammar:<br>
 * f0 -> [ TypeParameters() ]<br>
 * f1 -> ResultType()<br>
 * f2 -> MethodDeclarator()<br>
 * f3 -> [ #0 "throws" #1 NameList() ]<br>
 * f4 -> ( %0 Block()<br>
 * .. .. | %1 ";" )<br>
 * s: -418256626<br>
 */
public class MethodDeclaration implements INode {

  /** Child node 0 */
  public NodeOptional f0;

  /** Child node 1 */
  public ResultType f1;

  /** Child node 2 */
  public MethodDeclarator f2;

  /** Child node 3 */
  public NodeOptional f3;

  /** Child node 4 */
  public NodeChoice f4;

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
  public MethodDeclaration(final NodeOptional n0, final ResultType n1, final MethodDeclarator n2, final NodeOptional n3, final NodeChoice n4) {
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