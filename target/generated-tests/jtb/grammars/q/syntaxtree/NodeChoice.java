/* Generated by JTB 1.5.1 */
package grammars.q.syntaxtree;

import grammars.q.visitor.IRetVisitor;
import grammars.q.visitor.IRetArguVisitor;
import grammars.q.visitor.IVoidVisitor;
import grammars.q.visitor.IVoidArguVisitor;

/**
 * Represents a grammar choice (|), e.g. ' ( A | B ) '.<br>
 * The class stores the node and the "which" choice indicator (0, 1, ...).
 */
public class NodeChoice implements INode {

  /** The real node */
  public INode choice;

  /** The "which" choice indicator */
  public int which;

  /** The total number of choices */
  public int total;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the {@link NodeChoice} with a given node and non standard (-1) which choice and total number of choices.
   *
   * @param node - the node
   */
  public NodeChoice(final INode node) {
   this(node, -1, -1);
  }

  /**
   * Constructs the {@link NodeChoice} with a given node, a which choice and a total (not controlled).
   *
   * @param node - the node
   * @param whichChoice - the which choice
   * @param totalChoices - the total number of choices
   */
  public NodeChoice(final INode node, final int whichChoice, final int totalChoices) {
    choice = node;
    which = whichChoice;
    total = totalChoices;
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