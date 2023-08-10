/* TcfGrammarTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. TcfGrammarTokenManager.java */
package grammars.tcf;
import grammars.tcf.visitor.*;
import grammars.tcf.syntaxtree.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class TcfGrammarTokenManager implements TcfGrammarConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fff80000L) != 0L)
         {
            jjmatchedKind = 7;
            return 22;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 46:
         return jjStopAtPos(0, 17);
      case 49:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      case 50:
         return jjMoveStringLiteralDfa1_0(0x600000L);
      case 51:
         return jjMoveStringLiteralDfa1_0(0x3800000L);
      case 52:
         return jjMoveStringLiteralDfa1_0(0xc000000L);
      case 53:
         return jjMoveStringLiteralDfa1_0(0x30000000L);
      case 54:
         return jjMoveStringLiteralDfa1_0(0xc0000000L);
      case 55:
         return jjMoveStringLiteralDfa1_0(0x300000000L);
      case 58:
         return jjStopAtPos(0, 18);
      case 59:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 36:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 42:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 95:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 33;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddTwoStates(1, 2); }
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     { jjAddStates(0, 1); }
                  }
                  else if (curChar == 47)
                     { jjAddStates(2, 3); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddTwoStates(1, 2); }
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddStates(4, 6); }
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (curChar != 48)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(4, 6); }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(7, 2); }
                  break;
               case 8:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(8, 2); }
                  break;
               case 9:
                  if (curChar == 47)
                     { jjAddStates(2, 3); }
                  break;
               case 10:
                  if (curChar == 47)
                     { jjCheckNAddStates(7, 9); }
                  break;
               case 11:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(7, 9); }
                  break;
               case 12:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 13:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 14:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 16:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 17:
                  if (curChar == 42)
                     { jjAddStates(10, 11); }
                  break;
               case 18:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 20:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  { jjAddStates(0, 1); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(26, 27); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(12, 17); }
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAdd(26); }
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(28, 26); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(18, 20); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(21, 24); }
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(25, 29); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 0:
               case 4:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  { jjCheckNAdd(4); }
                  break;
               case 6:
                  if ((0x100000001000000L & l) != 0L)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(7, 2); }
                  break;
               case 11:
                  { jjAddStates(7, 9); }
                  break;
               case 16:
                  { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  { jjCheckNAddTwoStates(19, 17); }
                  break;
               case 23:
                  if ((0x400000004000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 26:
                  if ((0x400000004000L & l) != 0L && kind > 12)
                     kind = 12;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(7, 9); }
                  break;
               case 16:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(16, 17); }
                  break;
               case 18:
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(19, 17); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 33 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\73", "\56", "\72", "\61\52", "\61\44", "\62\52", "\62\44", 
"\63\52", "\63\44", "\63\137", "\64\52", "\64\44", "\65\52", "\65\44", "\66\52", 
"\66\44", "\67\52", "\67\44", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = grammars.tcf.syntaxtree.NodeConstants.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   22, 24, 10, 15, 6, 8, 2, 11, 12, 14, 18, 20, 28, 26, 29, 30, 
   31, 32, 28, 26, 29, 28, 26, 29, 30, 28, 26, 29, 30, 31, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public TcfGrammarTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public TcfGrammarTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 33; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffb881L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[33];
    static private final int[] jjstateSet = new int[2 * 33];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
