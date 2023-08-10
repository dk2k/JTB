/* Generated by JTB 1.5.1 */
package grammars.a.sgtree;

import java.util.ArrayList;
import java.util.List;
import grammars.a.sgvis.IVis2Visitor;
import grammars.a.sgvis.IVoidVisitor;


/**
 * JTB node class for the production ASTbp_jual123:<br>
 * Corresponding grammar:<br>
 * nodeToken -> < ID ><br>
 * s: 24392035<br>
 */
public class ASTbp_jual123 implements INode {

  /** Child node 0 */
  public NodeToken nodeToken;

  /** The parent node */
  private INode parent;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node with its child node.
   *
   * @param n0 - the child node
   */
  public ASTbp_jual123(final NodeToken n0) {
    nodeToken = n0;
    if (nodeToken != null)
      nodeToken.setParent(this);
  }
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

  /**
   * @return true if the node is a base node, false otherwise (always false : the node is a user node)
   */
  @Override
  public boolean isBaseNode() {
    return false;
  }


  /**
   * @return the number of all direct children (base + user nodes) (always 1))
   */
  @Override
  public int getNbAllChildren() {
    return 1;
  }

  /**
   * @return the number of direct base nodes children (always 1))
   */
  @Override
  public int getNbBaseChildren() {
    return 1;
  }

  /**
   * @return the number of direct user nodes children (always 0))
   */
  @Override
  public int getNbUserChildren() {
    return 0;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 1 nodes))
   */
  @Override
  public List<INode> getAllChildren() {
    if (lac == null) {
      lac = new ArrayList<>(1);
      lac.add(nodeToken);
    }
    return lac;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 1 nodes))
   */
  @Override
  public List<INode> getBaseChildren() {
    if (lbc == null) {
      lbc = new ArrayList<>(1);
      lbc.add(nodeToken);
    }
    return lbc;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 0 nodes))
   */
  @Override
  public List<INode> getUserChildren() {
    if (luc == null) {
      luc = new ArrayList<>(0);
    }
    return luc;
  }

}
