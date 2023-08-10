/* Generated by JTB 1.5.1 */
package grammars.fm.syntaxtree;

import java.util.ArrayList;
import java.util.Iterator;
import grammars.fm.visitor.IVis2Visitor;
import grammars.fm.visitor.IVoidVisitor;

@SuppressWarnings("javadoc")
public class NodeSequence implements INodeList {

  public ArrayList<INode> nodes;

  private static final long serialVersionUID = 151L;

  public NodeSequence() {
    nodes = new ArrayList<>();
  }

  public NodeSequence(final int sz) {
    nodes = new ArrayList<>(sz);
  }

  public NodeSequence(final INode firstNode) {
    nodes = new ArrayList<>();
    addNode(firstNode);
  }

  public NodeSequence(final int sz, final INode firstNode) {
    nodes = new ArrayList<>(sz);
    addNode(firstNode);
  }

  @Override
  public void addNode(final INode n) {
    nodes.add(n);
  }

  @Override
  public INode elementAt(final int i) {
    return nodes.get(i); }

  @Override
  public Iterator<INode> elements() {
    return nodes.iterator(); }

  @Override
  public int size() {
    return nodes.size(); }

  /*
   * Visitors accept methods (no -novis option, visitors specification : Void,void,None;Vis2,int,java.lang.String)
   */

  @Override
  public int accept(final IVis2Visitor vis, final String argu) {
    return vis.visit(this, argu);
  }

  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
