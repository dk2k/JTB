/* Generated by JTB 1.5.1 */
package grammars.z.syntaxtree;

import grammars.z.visitor.IRetVisitor;
import grammars.z.visitor.IRetArguVisitor;
import grammars.z.visitor.IVoidVisitor;
import grammars.z.visitor.IVoidArguVisitor;

@SuppressWarnings("javadoc")
public class NodeOptional implements INode {

  public INode node;

  private static final long serialVersionUID = 151L;

  public NodeOptional() {
    node = null;
  }

  public NodeOptional(final INode n) {
    addNode(n);
  }

  public void addNode(final INode n) {
    if (node != null)
      throw new Error("Attempt to set optional node twice"); //$NON-NLS-1$
    node = n;
  }

  public boolean present() {
    return (node != null); }

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
