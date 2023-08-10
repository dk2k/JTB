/* Generated by JTB 1.5.1 */
package examples.java.ex1jtb.syntaxtree;

import examples.java.ex1jtb.visitor.IGenVisitor;

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
   * Visitors accept methods (no -novis option, visitors specification : Gen,void,java.lang.String)
   */

  /**
   * Accepts a {@link IGenVisitor} visitor with user argument data.
   *
   * @param vis - the visitor
   * @param argu - the user Argument data
   */
  @Override
  public void accept(final IGenVisitor vis, final String argu) {
    vis.visit(this, argu);
  }

}
