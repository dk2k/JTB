/* Generated by JTB 1.5.1 */
import java.util.ArrayList;
import java.util.Iterator;

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
