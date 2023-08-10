/* Generated by JTB 1.5.1 */
package grammars.q.visitor;

import grammars.q.syntaxtree.*;

@SuppressWarnings("javadoc")
public interface IRetArguVisitor<R, A> {

  public R visit(final NodeChoice n, final A argu);

  public R visit(final NodeList n, final A argu);

  public R visit(final NodeListOptional n, final A argu);

  public R visit(final NodeOptional n, final A argu);

  public R visit(final NodeSequence n, final A argu);

  public R visit(final NodeToken n, final A argu);

  public R visit(final classDeclaration n, final A argu);

  public R visit(final className n, final A argu);

  public R visit(final method n, final A argu);

  public R visit(final methodName n, final A argu);

  public R visit(final instruction n, final A argu);

  public R visit(final bp_jual n, final A argu);

  public R visit(final bp_hm n, final A argu);

  public R visit(final jc_0 n, final A argu);

}
