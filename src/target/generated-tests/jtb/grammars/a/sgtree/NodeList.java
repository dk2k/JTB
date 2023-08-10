/* Generated by JTB 1.5.1 */
package grammars.a.sgtree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import grammars.a.sgvis.IVis2Visitor;
import grammars.a.sgvis.IVoidVisitor;

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

  /** The parent node */
  private INode parent;

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
    if (n != null)
      n.setParent(this);
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
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None;Vis2,R,A,int[],short...)
   */

  /**
   * Accepts a {@link IVis2Visitor} visitor with user return and argument data.
   *
   * @param <R> - the return type parameter
   * @param <A> - The argument 0 type parameter
   * @param vis - the visitor
   * @param argu - the user Argument data
   * @param argu1 - the user Argument data
   * @param argu2 - the user Argument data
   * @return the user Return data
   */
  @Override
  public <R, A> R accept(final IVis2Visitor<R, A> vis, final A argu, final int[] argu1, final short... argu2) {
    return vis.visit(this, argu, argu1, argu2);
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

  /*
   * Parent pointer getter and setter (-pp option)
   */

  /**
   * Gets the parent node.
   *
   * @return the parent node
   */
  @Override
  public INode getParent() {
    return parent;
  }

  /**
   * Sets the parent node.
   *
   * @param n - the parent node
   */
  @Override
  public void setParent(final INode n) {
    parent = n;
  }

  /*
   * Children methods (-chm option)
   */

  /** The list of all direct children (base + user nodes) */
  private List<INode> lac = null;

  /** The list of direct base nodes children */
  private List<INode> lbc = null;

  /** The list of direct user nodes children */
  private List<INode> luc = null;

  /** The number of direct base nodes children */
  private int nbLbc = -1;

  /** The number of direct user nodes children */
  private int nbLuc = -1;

  /**
   * @return the number of all direct children (base + user nodes) (1..N)
   */
  @Override
  public int getNbAllChildren() {
    return nodes.size();
  }

  /**
   * @return the number of direct base nodes children (0..N)
   */
  @Override
  public int getNbBaseChildren() {
    if (lbc == null)
      getBaseChildren();
    return nbLbc;
  }

  /**
   * @return the number of direct user nodes children (0..N)
   */
  @Override
  public int getNbUserChildren() {
    if (luc == null)
      getUserChildren();
    return nbLuc;
  }

  /**
   * @return the list of all direct children (base + user nodes) (1..N)
   */
  @Override
  public List<INode> getAllChildren() {
    if (lac == null) {
      lac = new ArrayList<>(nodes.size());
        lac.addAll(nodes);
    }
    return lac;
  }

  /**
   * @return the list of direct base nodes children (0..N)
   */
  @Override
  public List<INode> getBaseChildren() {
    if (lbc == null) {
      nbLbc = 0;
      for (final INode node : nodes)
        if (node.isBaseNode())
          nbLbc++;
      lbc = new ArrayList<>(nbLbc);
      for (final INode node : nodes)
        if (node.isBaseNode())
          lbc.add(node);
    }
    return lbc;
  }

  /**
   * @return the list of direct user nodes children (0..N)
   */
  @Override
  public List<INode> getUserChildren() {
    if (luc == null) {
      nbLuc = 0;
      for (final INode node : nodes)
        if (!node.isBaseNode())
          nbLuc++;
      luc = new ArrayList<>(nbLuc);
      for (final INode node : nodes)
        if (!node.isBaseNode())
          luc.add(node);
    }
    return luc;
  }

  /**
   * @return true if the node is a base node, false otherwise (always true : the node is a base node)
   */
  @Override
  public boolean isBaseNode() {
    return true;
  }

}
