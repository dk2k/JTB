/* Generated by JTB 1.5.1 */
package grammars.b.syntaxtree;

import grammars.b.visitor.IRetVisitor;
import grammars.b.visitor.IRetArguVisitor;
import grammars.b.visitor.IVoidVisitor;
import grammars.b.visitor.IVoidArguVisitor;


/**
 * JTB node class for the production expun_a2:<br>
 * Corresponding grammar:<br>
 * f0 -> < ID ><br>
 * f1 -> Identifier()<br>
 * f2 -> ( %0 < ID ><br>
 * .. .. | %1 #0 Identifier()<br>
 * .. .. . .. #1 ( &0 < ID ><br>
 * .. .. . .. .. | &1 Identifier() ) )<br>
 * s: 1070599542<br>
 */
public class expun_a2 implements INode {

  /** Child node 0 */
  public NodeToken f0;

  /** Child node 1 */
  public Identifier f1;

  /** Child node 2 */
  public NodeChoice f2;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   */
  public expun_a2(final NodeToken n0, final Identifier n1, final NodeChoice n2) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
  }
  /*
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None;VoidArgu,void,A;Ret,R,None;RetArgu,R,A)
   */

  /**
   * Accepts a {@link IRetVisitor} visitor with user return data.
   *
   * @param <R> - the return type parameter
   * @param vis - the visitor
   * @return the user Return data
   */
  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  /**
   * Accepts a {@link IRetArguVisitor} visitor with user return and argument data.
   *
   * @param <R> - the return type parameter
   * @param <A> - The argument 0 type parameter
   * @param vis - the visitor
   * @param argu - the user Argument data
   * @return the user Return data
   */
  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
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

  /**
   * Accepts a {@link IVoidArguVisitor} visitor with user argument data.
   *
   * @param <A> - The argument 0 type parameter
   * @param vis - the visitor
   * @param argu - the user Argument data
   */
  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }


}
