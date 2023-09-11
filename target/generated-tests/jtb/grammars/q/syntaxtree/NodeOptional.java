/* Generated by JTB 1.5.1 */
package grammars.q.syntaxtree;

import grammars.q.visitor.IRetVisitor;
import grammars.q.visitor.IRetArguVisitor;
import grammars.q.visitor.IVoidVisitor;
import grammars.q.visitor.IVoidArguVisitor;

/**
 * Represents a grammar optional node (? or []), e.g. ' ( A )? ' or ' [ A ] '.<br>
 * The class stores the node.
 */
public class NodeOptional implements INode {

  /** The node (if null there is no node) */
  public INode node;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Initializes an empty {@link NodeOptional}.
   */
  public NodeOptional() {
    node = null;
  }

  /**
   * Initializes a {@link NodeOptional} with a node.
   *
   * @param n - the node
   */
  public NodeOptional(final INode n) {
    addNode(n);
  }

  /**
   * Adds a node to the {@link NodeOptional}.
   *
   * @param n - the node to add
   */
  public void addNode(final INode n) {
    if (node != null)
      throw new Error("Attempt to set optional node twice"); //$NON-NLS-1$
    node = n;
  }

  /**
   * @return true if the node exists, false otherwise
   */
  public boolean present() {
    return (node != null); }

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