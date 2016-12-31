/* Generated by JTB 1.4.12 */
package EDU.purdue.jtb.syntaxtree;

import EDU.purdue.jtb.visitor.IRetArguVisitor;
import EDU.purdue.jtb.visitor.IRetVisitor;
import EDU.purdue.jtb.visitor.IVoidArguVisitor;
import EDU.purdue.jtb.visitor.IVoidVisitor;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface INode extends java.io.Serializable {

  /** The OS line separator */
  public static final String LS = System.getProperty("line.separator");

  /**
   * Accepts a {@link IRetArguVisitor} visitor with user Return and Argument data.
   *
   * @param <R> - the user Return type
   * @param <A> - the user Argument type
   * @param vis - the visitor
   * @param argu - the user Argument data
   * @return the user Return data
   */
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu);

  /**
   * Accepts a {@link IRetVisitor} visitor with user Return data.
   *
   * @param <R> - the user Return type
   * @param vis - the visitor
   * @return the user Return data
   */
  public <R> R accept(final IRetVisitor<R> vis);

  /**
   * Accepts a {@link IVoidArguVisitor} visitor with user Argument data.
   *
   * @param <A> - the user Argument type
   * @param vis - the visitor
   * @param argu - the user Argument data
   */
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu);

  /**
   * Accepts a {@link IVoidVisitor} visitor with no user Return nor Argument data.
   *
   * @param vis - the visitor
   */
  public void accept(final IVoidVisitor vis);

}
