/* Generated by JTB 1.5.1 */
package grammars.tcf.visitor;

import grammars.tcf.syntaxtree.*;

/**
 * All "IVoidVisitor" visitors must implement this interface.

 */
public interface IVoidVisitor {

  /*
   * Base nodes visit methods
   */

  /**
   * Visits a {@link NodeChoice} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeChoice n);

  /**
   * Visits a {@link NodeList} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeList n);

  /**
   * Visits a {@link NodeListOptional} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeListOptional n);

  /**
   * Visits a {@link NodeOptional} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeOptional n);

  /**
   * Visits a {@link NodeSequence} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeSequence n);

  /**
   * Visits a {@link NodeToken} node.
   *
   * @param n - the node to visit
   */
  public void visit(final NodeToken n);

  /*
   * User grammar generated visit methods
   */

  /**
   * Visits a {@link Start} node, whose child is the following :
   * <p>
   * f0 -> . %0 #0 Tcf1() #1 < EOF ><br>
   * .. .. | %1 :0 bp_iv1()<br>
   * .. .. . .. :1 bp_iv2()<br>
   * .. .. . ..   :2 . &0 bp_iv3()<br>
   * .. .. . .. .. | &1 bp_iv3_()<br>
   * .. .. . ..   :3 . &0 bp_iv3()<br>
   * .. .. . .. .. | &1 {}<br>
   * .. .. . .. :4 $0 bp_iv4() $1 bp_iv5()<br>
   * .. .. . ..   :5 . &0 $0 bp_iv6() $1 bp_iv7()<br>
   * .. .. . .. .. | &1 {}<br>
   * .. .. . .. #6 < EOF ><br>
   * s: 1737026419<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Start n);

  /**
   * Visits a {@link Tcf1} node, whose children are the following :
   * <p>
   * f0 -> Identifier()<br>
   * f1 -> f2 -> ( %0 Identifier()<br>
   * .. .. .. .. | %1 Integer_literal() )*<br>
   * f3 -> "."<br>
   * s: -1969773913<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Tcf1 n);

  /**
   * Visits a {@link Tcf2} node, whose children are the following :
   * <p>
   * f0 -> Identifier()<br>
   * f1 -> ( %0 Identifier()<br>
   * .. .. | !1 Integer_literal() )*<br>
   * s: 1526084756<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Tcf2 n);

  /**
   * Visits a {@link Tcf3} node, whose children are the following :
   * <p>
   * {}f0 -> Identifier()<br>
   * f1 -> f2 -> ( %0 Identifier()<br>
   * .. .. .. .. | %1 Integer_literal() )*<br>
   * f3 -> "."<br>
   * s: 1429321349<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Tcf3 n);

  /**
   * Visits a {@link Tcf4} node, whose children are the following :
   * <p>
   * f0 -> Identifier()<br>
   * f1 -> f2 -> ( %0 Identifier()<br>
   * .. .. .. .. | %1 Integer_literal() )*<br>
   * s: 887598099<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Tcf4 n);

  /**
   * Visits a {@link bp_iv1} node, whose child is the following :
   * <p>
   * f0 -> "1*"<br>
   * s: -699039424<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv1 n);

  /**
   * Visits a {@link bp_iv2} node, whose child is the following :
   * <p>
   * f0 -> "2*"<br>
   * s: -699038463<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv2 n);

  /**
   * Visits a {@link bp_iv3} node, whose child is the following :
   * <p>
   * f0 -> "3*"<br>
   * s: -699037502<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv3 n);

  /**
   * Visits a {@link bp_iv3_} node, whose children are the following :
   * <p>
   * f0 -> "3_"<br>
   * f1 -> < NUM_3_9 ><br>
   * s: -1427135545<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv3_ n);

  /**
   * Visits a {@link bp_iv4} node, whose child is the following :
   * <p>
   * f0 -> "4*"<br>
   * s: -699036541<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv4 n);

  /**
   * Visits a {@link bp_iv5} node, whose child is the following :
   * <p>
   * f0 -> "5*"<br>
   * s: -699035580<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv5 n);

  /**
   * Visits a {@link bp_iv6} node, whose child is the following :
   * <p>
   * f0 -> "6*"<br>
   * s: -699034619<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv6 n);

  /**
   * Visits a {@link bp_iv7} node, whose child is the following :
   * <p>
   * f0 -> "7*"<br>
   * s: -699033658<br>
   *
   * @param n - the node to visit
   */
  public void visit(final bp_iv7 n);

  /**
   * Visits a {@link Identifier} node, whose child is the following :
   * <p>
   * f0 -> < IDENTIFIER ><br>
   * s: -1580059612<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Identifier n);

  /**
   * Visits a {@link Integer_literal} node, whose child is the following :
   * <p>
   * f0 -> < INTEGER_LITERAL ><br>
   * s: -1048223857<br>
   *
   * @param n - the node to visit
   */
  public void visit(final Integer_literal n);

}
