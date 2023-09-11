/* Generated by JTB 1.5.1 */
package examples.java.ex2jtb.visitor;

import static examples.java.ex2jtb.syntaxtree.NodeConstants.*;
import examples.java.ex2jtb.Token;
import examples.java.ex2jtb.syntaxtree.*;
import examples.java.ex2jtb.visitor.signature.NodeFieldsSignature;

/**
 * Provides default methods which visit each node in the tree in depth-first order.<br>
 * In your "Gen" visitors extend this class and override part or all of these methods.
 *
 */
public class DepthFirstGenVisitor implements IGenVisitor {


  /*
   * Base nodes classes visit methods (to be overridden if necessary)
   */

  /**
   * Visits a {@link NodeChoice} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final NodeChoice n, final String argu) {
    n.choice.accept(this, argu);
    return;
  }

  /**
   * Visits a {@link NodeList} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final NodeList n, final String argu) {
    for (INode e : n.nodes) {
      e.accept(this, argu);
    }
    return;
  }

  /**
   * Visits a {@link NodeListOptional} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final NodeListOptional n, final String argu) {
    if (n.present()) {
      for (INode e : n.nodes) {
        e.accept(this, argu);
      }
      return;
    }
    return;
  }

  /**
   * Visits a {@link NodeOptional} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final NodeOptional n, final String argu) {
    if (n.present()) {
      n.node.accept(this, argu);
      return;
    }
    return;
  }

  /**
   * Visits a {@link NodeSequence} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final NodeSequence n, final String argu) {
    for (INode e : n.nodes) {
      e.accept(this, argu);
    }
    return;
  }

  /**
   * Visits a {@link Token} node.
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  public void visit(final Token n, @SuppressWarnings("unused") final String argu) {
    @SuppressWarnings("unused")
    final String tkIm = n.image;
    return;
  }

  /*
   * User grammar generated visit methods (to be overridden if necessary)
   */

  /**
   * Visits a {@link ASTStart} node, whose children are the following :
   * <p>
   * f0 -> Expression()<br>
   * f1 -> ";"<br>
   * s: 1859009853<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ 1859009853, JTB_SIG_ASTSTART, JTB_USER_ASTSTART })
  public void visit(final ASTStart n, final String argu) {
    // f0 -> Expression()
    n.f0.accept(this, argu);
    // f1 -> ";"
    n.f1.accept(this, argu);
  }

  /**
   * Visits a {@link ASTExpression} node, whose child is the following :
   * <p>
   * f0 -> AdditiveExpression()<br>
   * s: -762347234<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ -762347234, JTB_SIG_ASTEXPRESSION, JTB_USER_ASTEXPRESSION })
  public void visit(final ASTExpression n, final String argu) {
    // f0 -> AdditiveExpression()
    n.f0.accept(this, argu);
  }

  /**
   * Visits a {@link ASTAdditiveExpression} node, whose children are the following :
   * <p>
   * f0 -> MultiplicativeExpression()<br>
   * f1 -> ( #0 ( %0 "+"<br>
   * .. .. . .. | %1 "-" )<br>
   * .. .. . #1 MultiplicativeExpression() )*<br>
   * s: -1807059397<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ -1807059397, JTB_SIG_ASTADDITIVEEXPRESSION, JTB_USER_ASTADDITIVEEXPRESSION })
  public void visit(final ASTAdditiveExpression n, final String argu) {
    // f0 -> MultiplicativeExpression()
    n.f0.accept(this, argu);
    // f1 -> ( #0 ( %0 "+"
    // .. .. . .. | %1 "-" )
    // .. .. . #1 MultiplicativeExpression() )*
    n.f1.accept(this, argu);
  }

  /**
   * Visits a {@link ASTMultiplicativeExpression} node, whose children are the following :
   * <p>
   * f0 -> UnaryExpression()<br>
   * f1 -> ( #0 ( %0 "*"<br>
   * .. .. . .. | %1 "/"<br>
   * .. .. . .. | %2 "%" )<br>
   * .. .. . #1 UnaryExpression() )*<br>
   * s: 853643830<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ 853643830, JTB_SIG_ASTMULTIPLICATIVEEXPRESSION, JTB_USER_ASTMULTIPLICATIVEEXPRESSION })
  public void visit(final ASTMultiplicativeExpression n, final String argu) {
    // f0 -> UnaryExpression()
    n.f0.accept(this, argu);
    // f1 -> ( #0 ( %0 "*"
    // .. .. . .. | %1 "/"
    // .. .. . .. | %2 "%" )
    // .. .. . #1 UnaryExpression() )*
    n.f1.accept(this, argu);
  }

  /**
   * Visits a {@link ASTUnaryExpression} node, whose child is the following :
   * <p>
   * f0 -> . %0 #0 "(" #1 Expression() #2 ")"<br>
   * .. .. | %1 MyID()<br>
   * .. .. | %2 Integer()<br>
   * s: 953155740<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ 953155740, JTB_SIG_ASTUNARYEXPRESSION, JTB_USER_ASTUNARYEXPRESSION })
  public void visit(final ASTUnaryExpression n, final String argu) {
    // f0 -> . %0 #0 "(" #1 Expression() #2 ")"
    // .. .. | %1 MyID()
    // .. .. | %2 Integer()
    n.f0.accept(this, argu);
  }

  /**
   * Visits a {@link ASTMyID} node, whose child is the following :
   * <p>
   * f0 -> < IDENTIFIER ><br>
   * s: -1580059612<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ -1580059612, JTB_SIG_ASTMYID, JTB_USER_ASTMYID })
  public void visit(final ASTMyID n, final String argu) {
    // f0 -> < IDENTIFIER >
    n.f0.accept(this, argu);
  }

  /**
   * Visits a {@link ASTInteger} node, whose children are the following :
   * <p>
   * f0 -> < INTEGER_LITERAL ><br>
   * f1 -> jc_1()<br>
   * s: 640957941<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @Override
  @NodeFieldsSignature({ 640957941, JTB_SIG_ASTINTEGER, JTB_USER_ASTINTEGER })
  public void visit(final ASTInteger n, final String argu) {
    // f0 -> < INTEGER_LITERAL >
    n.f0.accept(this, argu);
    // f1 -> jc_1()
    n.f1.accept(this, argu);
  }

  /**
   * Visits a {@link ASTjc_1} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  @SuppressWarnings("unused")
  @Override
  @NodeFieldsSignature({ 0, JTB_SIG_ASTJC_1, JTB_USER_ASTJC_1 })
  public void visit(final ASTjc_1 n, final String argu) {
    /* empty node, nothing that can be generated so far */
  }

}