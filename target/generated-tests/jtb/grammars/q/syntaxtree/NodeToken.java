/* Generated by JTB 1.5.1 */
package grammars.q.syntaxtree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.List;
import grammars.q.visitor.IRetVisitor;
import grammars.q.visitor.IRetArguVisitor;
import grammars.q.visitor.IVoidVisitor;
import grammars.q.visitor.IVoidArguVisitor;

import grammars.q.Token;

@SuppressWarnings("javadoc")
public class NodeToken extends Token implements INode {

  public String tokenImage;

 public List<NodeToken> specialTokens;

  private static final long serialVersionUID = 151L;

  public NodeToken(final int aKind) {
    this(aKind, null);
  }

  public NodeToken(final int aKind, final String aImage) {
    kind = aKind;
    tokenImage = image = aImage;
  }

  @Override
  public String toString() {
    return tokenImage;
  }

  public NodeToken getSpecialAt(final int i) {
    if (specialTokens == null)
      throw new NoSuchElementException("No specialTokens in token"); //$NON-NLS-1$
    return specialTokens.get(i);
  }

  public int numSpecials() {
    if (specialTokens == null)
      return 0;
    return specialTokens.size();
  }

  public void addSpecial(final NodeToken s) {
    if (specialTokens == null)
     specialTokens = new ArrayList<>();
    specialTokens.add(s);
  }

  public void trimSpecials() {
    if (specialTokens == null)
      return;
    ((ArrayList<NodeToken>) specialTokens).trimToSize();
  }

  public String getSpecials(final String spc) {
    if (specialTokens == null)
      return ""; //$NON-NLS-1$
    int stLastLine = -1;
    final StringBuilder buf = new StringBuilder(64);
    boolean hasEol = false;
    for (final Iterator<NodeToken> e = specialTokens.iterator(); e.hasNext();) {
      final NodeToken st = e.next();
      final char c = st.tokenImage.charAt(st.tokenImage.length() - 1);
      hasEol = c == '\n' || c == '\r';
      if (stLastLine != -1)
        // not first line 
        if (stLastLine != st.beginLine) {
          // if not on the same line as the previous
          for (int i = stLastLine + 1; i < st.beginLine; i++)
            // keep blank lines
          buf.append(LS);
          buf.append(spc);
        } else
          // on the same line as the previous
          buf.append(' ');
      buf.append(st.tokenImage);
      if (!hasEol && e.hasNext())
        // not a single line comment and not the last one
        buf.append(LS);
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
    return buf.toString();
  }

  public String withSpecials(final String spc) {
    return withSpecials(spc, null);
  }

  public String withSpecials(final String spc, final String var) {
    final String specials = getSpecials(spc);
    int len = specials.length() + 1;
    if (len == 1)
      return (var == null ? tokenImage : var + tokenImage);
    if (var != null)
      len += var.length();
    StringBuilder buf = new StringBuilder(len + tokenImage.length());
    buf.append(specials);
    // see if needed to add a space
    int stLastLine = -1;
    if (specialTokens != null)
    for (NodeToken e : specialTokens) {
      stLastLine = e.endLine;
    }
    if (stLastLine == beginLine)
      buf.append(' ');
    if (var != null)
      buf.append(var);
    buf.append(tokenImage);
    return buf.toString();
  }

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
