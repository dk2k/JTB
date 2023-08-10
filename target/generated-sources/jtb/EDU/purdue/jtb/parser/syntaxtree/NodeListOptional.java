/* Generated by JTB 1.5.1 */
package EDU.purdue.jtb.parser.syntaxtree;

import java.util.ArrayList;
import java.util.Iterator;
import EDU.purdue.jtb.parser.visitor.IIntVisitor;
import EDU.purdue.jtb.parser.visitor.IVoidVisitor;

/**
 * Represents an optional grammar list (*), e.g. ' ( A )* '.<br>
 * The class stores the nodes list in an ArrayList.
 */
public class NodeListOptional implements INodeList {

  /** The list of nodes */
  public ArrayList<INode> nodes;

  /** The allocation sizes table */
  private static final int allocTb[] = {0, 1, 2, 3, 4, 5, 10, 20, 50};

  /** The allocation number */
  private int allocNb = 0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Initializes an empty list of nodes with a default first allocation.
   */
  public NodeListOptional() {
    nodes = new ArrayList<>(allocTb[allocNb]);
  }

  /**
   * Initializes an empty list of nodes with a given allocation.
   *
   * @param sz - the list size
   */
  public NodeListOptional(final int sz) {
    nodes = new ArrayList<>(sz);
  }

  /**
   * Initializes an empty list of nodes with a default first allocation and adds a first node.
   *
   * @param firstNode - the node to add
   */
  public NodeListOptional(final INode firstNode) {
    nodes = new ArrayList<>(allocTb[allocNb]);
    addNode(firstNode);
  }

  /**
   * Initializes an empty list of nodes with a given allocation and adds a first node.
   *
   * @param sz - the list size
   * @param firstNode - the node to add
   */
  public NodeListOptional(final int sz, final INode firstNode) {
    nodes = new ArrayList<>(sz);
    addNode(firstNode);
  }

  /**
   * Adds a node to the list of nodes, managing progressive allocation increments.
   *
   * @param n - the node to add
   */
  @Override
  public void addNode(final INode n) {
    if (++allocNb < allocTb.length)
      nodes.ensureCapacity(allocTb[allocNb]);
    else
      nodes.ensureCapacity((allocNb - allocTb.length + 2) * allocTb[(allocTb.length - 1)]);
    nodes.add(n);
  }

  /**
   * Gets the node in the list at a given position.
   *
   * @param i - the node's position
   * @return the node
   */
  @Override
  public INode elementAt(final int i) {
    return nodes.get(i); }

  /**
   * Returns an iterator on the nodes list.
   *
   * @return the iterator
   */
  @Override
  public Iterator<INode> elements() {
    return nodes.iterator(); }

  /**
   * Returns the number of nodes in the list.
   *
   * @return the list size
   */
  @Override
  public int size() {
    return nodes.size(); }

  /**
   * @return true if there is at least one node, false otherwise
   */
  public boolean present() {
    return (nodes.size() != 0); }

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
