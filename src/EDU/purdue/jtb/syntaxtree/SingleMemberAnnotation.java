/* Generated by JTB 1.4.11 */
package EDU.purdue.jtb.syntaxtree;

import EDU.purdue.jtb.visitor.*;

/**
 * JTB node class for the production SingleMemberAnnotation:<br>
 * Corresponding grammar:<br>
 * f0 -> "@"<br>
 * f1 -> Name()<br>
 * f2 -> "("<br>
 * f3 -> MemberValue()<br>
 * f4 -> ")"<br>
 */
public class SingleMemberAnnotation implements INode {

  /** Child node 1 */
  public NodeToken f0;

  /** Child node 2 */
  public Name f1;

  /** Child node 3 */
  public NodeToken f2;

  /** Child node 4 */
  public MemberValue f3;

  /** Child node 5 */
  public NodeToken f4;

  /** The serial version UID */
  private static final long serialVersionUID = 1411L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   * @param n3 - next child node
   * @param n4 - next child node
   */
  public SingleMemberAnnotation(final NodeToken n0, final Name n1, final NodeToken n2, final MemberValue n3, final NodeToken n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
  }

  /**
   * Accepts the IRetArguVisitor visitor.
   *
   * @param <R> the user return type
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   * @return a user chosen return information
   */
  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  /**
   * Accepts the IRetVisitor visitor.
   *
   * @param <R> the user return type
   * @param vis - the visitor
   * @return a user chosen return information
   */
  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  /**
   * Accepts the IVoidArguVisitor visitor.
   *
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   */
  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  /**
   * Accepts the IVoidVisitor visitor.
   *
   * @param vis - the visitor
   */
  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
