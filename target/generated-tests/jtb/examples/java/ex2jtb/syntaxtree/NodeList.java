/* Generated by JTB 1.5.1 */
package examples.java.ex2jtb.syntaxtree;

import java.util.ArrayList;
import java.util.Iterator;
import examples.java.ex2jtb.visitor.IGenVisitor;

/**
 * Represents a grammar list (+), e.g. ' ( A )+ '.<br>
 * The class stores the nodes list in an ArrayList.
 */
public class NodeList implements INodeList {

  /** The list of nodes */
  public ArrayList<INode> nodes;

  /** The allocation sizes table */
  private  final int allocTb[] = {1, 2, 3, 4, 5, 10, 20, 50};

  /** The allocation number */
  private int allocNb = 0;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Initializes an empty list of nodes with a default first allocation.
   */
  public NodeList() {
    nodes = new ArrayList<>(allocTb[allocNb]);
  }

  /**
   * Initializes an empty list of nodes with a given allocation.
   *
   * @param sz - the list size
   */
  public NodeList(final int sz) {
    nodes = new ArrayList<>(sz);
  }

  /**
   * Initializes an empty list of nodes with a default first allocation and adds a first node.
   *
   * @param firstNode - the node to add
   */
  public NodeList(final INode firstNode) {
    nodes = new ArrayList<>(allocTb[allocNb]);
    addNode(firstNode);
  }

  /**
   * Initializes an empty list of nodes with a given allocation and adds a first node.
   *
   * @param sz - the list size
   * @param firstNode - the node to add
   */
  public NodeList(final int sz, final INode firstNode) {
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