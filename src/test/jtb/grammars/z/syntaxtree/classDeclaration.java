/* Generated by JTB 1.5.1 */
package grammars.z.syntaxtree;

import grammars.z.visitor.IRetVisitor;
import grammars.z.visitor.IRetArguVisitor;
import grammars.z.visitor.IVoidVisitor;
import grammars.z.visitor.IVoidArguVisitor;


@SuppressWarnings("javadoc")
public class classDeclaration implements INode {

  public NodeToken f0;

  public className f1;

  public NodeToken f2;

  public NodeListOptional f3;

  public NodeToken f4;

  public NodeToken f5;

  public NodeToken f6;

  private static final long serialVersionUID = 151L;

  public classDeclaration(final NodeToken n0, final className n1, final NodeToken n2, final NodeListOptional n3, final NodeToken n4, final NodeToken n5, final NodeToken n6) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
  }
  /*
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None;VoidArgu,void,A;Ret,R,None;RetArgu,R,A)
   */

  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }


}
