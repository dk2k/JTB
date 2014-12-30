/* Generated by JTB 1.4.7 */
package EDU.purdue.jtb.syntaxtree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import EDU.purdue.jtb.visitor.IRetArguVisitor;
import EDU.purdue.jtb.visitor.IRetVisitor;
import EDU.purdue.jtb.visitor.IVoidArguVisitor;
import EDU.purdue.jtb.visitor.IVoidVisitor;

/**
 * Represents a single token in the grammar.<br>
 * If the "-tk" option is used, also contains a ArrayList of preceding special tokens.<br>
 * The class stores the token image, kind and position information, and the special tokens list.<br>
 */
public class NodeToken implements INode {

  /** The token image */
  public String               tokenImage;

  /** The list of special tokens */
  public ArrayList<NodeToken> specialTokens;

  /** The token first line (-1 means not available) */
  public int                  beginLine;

  /** The token first column (-1 means not available) */
  public int                  beginColumn;

  /** The token last line (-1 means not available) */
  public int                  endLine;

  /** The token last column (-1 means not available) */
  public int                  endColumn;

  /** The JavaCC token "kind" integer (-1 means not available) */
  public int                  kind;

  /** The serial version UID */
  private static final long   serialVersionUID = 147L;

  /** The OS line separator */
  public static final String  LS               = System.getProperty("line.separator");

  /**
   * Initializes a {@link NodeToken} with a given string and no position information.
   * 
   * @param s - the token string
   */
  public NodeToken(final String s) {
    this(s, -1, -1, -1, -1, -1);
  }

  /**
   * Initializes a {@link NodeToken} with a given string and position information.
   * 
   * @param s - the token string
   * @param kn - the token kind
   * @param bl - the first line
   * @param bc - the first column
   * @param el - the last line
   * @param ec - the last column
   */
  public NodeToken(final String s, final int kn, final int bl, final int bc, final int el,
                   final int ec) {
    tokenImage = s;
    specialTokens = null;
    kind = kn;
    beginLine = bl;
    beginColumn = bc;
    endLine = el;
    endColumn = ec;
  }

  /**
   * Gets the special token in the special tokens list at a given position.
   * 
   * @param i - the special token's position
   * @return the special token
   */
  public NodeToken getSpecialAt(final int i) {
    if (specialTokens == null)
      throw new NoSuchElementException("No specialTokens in token");
    return specialTokens.get(i);
  }

  /**
   * @return the number of special tokens
   */
  public int numSpecials() {
    if (specialTokens == null)
      return 0;
    return specialTokens.size();
  }

  /**
   * Adds a special token to the special tokens list.
   * 
   * @param s - the special token to add
   */
  public void addSpecial(final NodeToken s) {
    if (specialTokens == null)
      specialTokens = new ArrayList<NodeToken>();
    specialTokens.add(s);
  }

  /**
   * Trims the special tokens list.
   */
  public void trimSpecials() {
    if (specialTokens == null)
      return;
    specialTokens.trimToSize();
  }

  /**
   * @return the token image
   */
  @Override
  public String toString() {
    return tokenImage;
  }

  /**
   * Returns the list of special tokens of the current {@link NodeToken} as a string,<br>
   * taking in account a given indentation, keeping original lines.
   * 
   * @param spc - the indentation
   * @return the string representing the special tokens list
   */
  public String getSpecials(final String spc) {
    if (specialTokens == null)
      return "";
    int stLastLine = -1;
    final StringBuilder buf = new StringBuilder(64);
    boolean hasEol = false;
    for (final Iterator<NodeToken> e = specialTokens.iterator(); e.hasNext();) {
      final NodeToken st = e.next();
      final char c = st.tokenImage.charAt(st.tokenImage.length() - 1);
      hasEol = c == '\n' || c == '\r';
      //      buf.append(" /* getSpecials stLastLine = ").append(stLastLine).append(", st.beginLine = ")
      //         .append(st.beginLine).append(", c = ").append(hasEol ? "eol" : String.valueOf(c))
      //         .append(" */");
      if (stLastLine != -1)
        // not first line 
        if (stLastLine != st.beginLine)
          // if not on the same line as the previous
          buf.append(spc);
        else
          // on the same line as the previous 
          buf.append(" ");
      buf.append(st.tokenImage);
      if (!hasEol && e.hasNext()) {
        // not a single line comment and not the last one
        buf.append(LS);
      }
      stLastLine = st.endLine;
    }
    // keep the same number of blank lines before the current non special
    for (int i = stLastLine + (hasEol ? 1 : 0); i < beginLine; i++) {
      buf.append(LS);
      if (i != beginLine - 1)
        buf.append(spc);
    }
    // indent if the current non special is not on the same line
    if (stLastLine != beginLine)
      buf.append(spc);
    //    buf.append(" /* getSpecials stLastLine = ").append(stLastLine).append(", beginLine = ")
    //       .append(beginLine).append(", size = ").append(specialTokens.size()).append(", hasEol = ")
    //       .append(hasEol).append(" */ ");
    return buf.toString();
  }

  /**
   * Returns the list of special tokens of the current {@link NodeToken} and the current<br>
   * {@link NodeToken} as a string, taking in account a given indentation.
   * 
   * @param spc - the indentation
   * @return the string representing the special tokens list and the token
   */
  public String withSpecials(final String spc) {
    return withSpecials(spc, null);
  }

  /**
   * Returns the list of special tokens of the current {@link NodeToken} and the current<br>
   * {@link NodeToken} as a string, taking in account a given indentation and a given assignment.
   * 
   * @param spc - the indentation
   * @param var - the generated variable assignment to insert
   * @return the string representing the special tokens list and the token
   */
  public String withSpecials(final String spc, final String var) {
    final String specials = getSpecials(spc);
    int len = specials.length();
    if (len == 0)
      return (var == null ? tokenImage : var + tokenImage);
    if (var != null)
      len += var.length();
    final StringBuilder buf = new StringBuilder(len + tokenImage.length());
    buf.append(specials);
    // see if needed to add a space
    int stLastLine = -1;
    for (final Iterator<NodeToken> e = specialTokens.iterator(); e.hasNext();) {
      stLastLine = e.next().endLine;
    }
    if (stLastLine == beginLine)
      buf.append(" ");
    if (var != null)
      buf.append(var);
    buf.append(tokenImage);
    //    buf.append(" /* withSpecials lastLine = ").append(stLastLine).append(", beginLine = ")
    //       .append(beginLine).append(" */ ");
    return buf.toString();
  }

  /**
   * Accepts a {@link IRetArguVisitor} visitor with user Return and Argument data.
   * 
   * @param <R> - the user Return type
   * @param <A> - the user Argument type
   * @param vis - the visitor
   * @param argu - the user Argument data
   * @return the user Return data
   */
  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  /**
   * Accepts a {@link IRetVisitor} visitor with user Return data.
   * 
   * @param <R> - the user Return type
   * @param vis - the visitor
   * @return the user Return data
   */
  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  /**
   * Accepts a {@link IVoidArguVisitor} visitor with user Argument data.
   * 
   * @param <A> - the user Argument type
   * @param vis - the visitor
   * @param argu - the user Argument data
   */
  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  /**
   * Accepts a {@link IVoidVisitor} visitor with no user Return nor Argument data.
   * 
   * @param vis - the visitor
   */
  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
