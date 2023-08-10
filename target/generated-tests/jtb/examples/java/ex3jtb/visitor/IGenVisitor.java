/* Generated by JTB 1.5.1 */
package examples.java.ex3jtb.visitor;

import examples.java.ex3jtb.syntaxtree.*;
import java.lang.String;

/**
 * All "IGenVisitor" visitors must implement this interface.

 */
public interface IGenVisitor {

  /*
   * Base nodes visit methods
   */

  /**
   * Visits a {@link NodeChoice} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeChoice n, final String argu);

  /**
   * Visits a {@link NodeList} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeList n, final String argu);

  /**
   * Visits a {@link NodeListOptional} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeListOptional n, final String argu);

  /**
   * Visits a {@link NodeOptional} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeOptional n, final String argu);

  /**
   * Visits a {@link NodeSequence} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeSequence n, final String argu);

  /**
   * Visits a {@link NodeToken} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final NodeToken n, final String argu);

  /*
   * User grammar generated visit methods
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
  public void visit(final ASTStart n, final String argu);

  /**
   * Visits a {@link ASTExpression} node, whose child is the following :
   * <p>
   * f0 -> AdditiveExpression()<br>
   * s: -762347234<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final ASTExpression n, final String argu);

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
  public void visit(final ASTAdditiveExpression n, final String argu);

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
  public void visit(final ASTMultiplicativeExpression n, final String argu);

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
  public void visit(final ASTUnaryExpression n, final String argu);

  /**
   * Visits a {@link ASTMyID} node, whose child is the following :
   * <p>
   * f0 -> < IDENTIFIER ><br>
   * s: -1580059612<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final ASTMyID n, final String argu);

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
  public void visit(final ASTInteger n, final String argu);

  /**
   * Visits a {@link ASTjc_1} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   */
  public void visit(final ASTjc_1 n, final String argu);

}
