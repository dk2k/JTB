/* Generated by JTB 1.5.1 */
package examples.java.ex3jtb.syntaxtree;

import java.util.ArrayList;
import java.util.List;
import examples.java.ex3jtb.visitor.IGenVisitor;


/**
 * JTB node class for the production ASTjc_1:<br>
 * Corresponding grammar:<br>
 * s: 0<br>
 */
public class ASTjc_1 implements INode {

  /** The parent node */
  private INode parent;

  /** The serial version UID */
  private static final long serialVersionUID = 151L;

  /**
   * Constructs the node (which has no child).
   */
  public ASTjc_1() {
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
   * @return the number of all direct children (base + user nodes) (0))
   */
  @Override
  public int getNbAllChildren() {
    return 0;
  }

  /**
   * @return the number of direct base nodes children (0))
   */
  @Override
  public int getNbBaseChildren() {
    return 0;
  }

  /**
   * @return the number of direct user nodes children (0))
   */
  @Override
  public int getNbUserChildren() {
    return 0;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 0 node))
   */
  @Override
  public List<INode> getAllChildren() {
    if (lac == null) {
      lac = new ArrayList<>(0);
    }
    return lac;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 0 node))
   */
  @Override
  public List<INode> getBaseChildren() {
    if (lbc == null) {
      lbc = new ArrayList<>(0);
    }
    return lbc;
  }

  /**
   * @return the list of all direct children (base + user nodes) (always 0 node))
   */
  @Override
  public List<INode> getUserChildren() {
    if (luc == null) {
      luc = new ArrayList<>(0);
    }
    return luc;
  }

  }
