/* Generated by JTB 1.5.1 */
package grammars.fm.syntaxtree;

import grammars.fm.visitor.IVis2Visitor;
import grammars.fm.visitor.IVoidVisitor;


@SuppressWarnings("javadoc")
public class classDeclaration implements INode {

  public skip f0;

  public NodeToken f1;

  public NodeToken f2;

  public NodeListOptional f3;

  public NodeToken f4;

  public NodeToken f5;

  public NodeToken f6;

  private static final long serialVersionUID = 151L;

  public classDeclaration(final skip n0, final NodeToken n1, final NodeToken n2, final NodeListOptional n3, final NodeToken n4, final NodeToken n5, final NodeToken n6) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
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
