/* Generated by JTB 1.5.1 */
package grammars.fm.syntaxtree;

import grammars.fm.visitor.IVis2Visitor;
import grammars.fm.visitor.IVoidVisitor;


@SuppressWarnings("javadoc")
public class method implements INode {

  public methodName f0;

  public NodeToken f1;

  public NodeList f2;

  public NodeToken f3;

  private static final long serialVersionUID = 151L;

  public method(final methodName n0, final NodeToken n1, final NodeList n2, final NodeToken n3) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
  }
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
