/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.intellij.json;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.json.JsonElementTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_JsonLexer.flex</tt>
 */
public class _JsonLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 13360 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\2\0\1\10\1\11\1\12\1\13\1\14\1\15\3\0"+
    "\1\16\1\17\1\20\1\21\2\0\1\22\3\0\1\22\71\0\1\23\1\0\1\24\1\25\1\26\1\27\2"+
    "\25\16\0\1\30\1\31\1\32\1\33\2\0\1\34\11\0\1\35\21\0\1\34\1\36\23\0\1\25\1"+
    "\37\3\0\1\22\1\40\1\37\4\0\1\41\1\37\4\0\1\35\1\42\1\25\3\0\2\43\1\25\1\26"+
    "\1\44\1\0\1\43\11\0\1\23\14\0\1\45\1\35\1\0\1\46\1\0\1\47\1\25\1\41\7\0\1"+
    "\50\14\0\1\24\1\25\6\0\1\51\1\21\5\0\1\51\2\25\3\0\1\2\10\25\1\46\1\26\6\25"+
    "\1\52\2\0\1\22\14\0\1\53\1\0\2\37\1\54\1\47\1\55\2\0\1\46\1\56\1\57\1\47\1"+
    "\60\1\41\1\61\1\53\1\0\1\2\1\44\1\54\1\62\1\55\2\0\1\46\1\63\1\64\1\62\1\65"+
    "\1\40\1\66\1\67\1\0\1\51\1\25\1\54\1\35\1\34\2\0\1\46\1\70\1\57\1\35\1\71"+
    "\1\72\1\25\1\53\1\0\1\40\1\25\1\54\1\47\1\55\2\0\1\46\1\70\1\57\1\47\1\65"+
    "\1\67\1\61\1\53\1\0\1\40\1\25\1\73\1\74\1\75\1\76\1\77\1\74\1\0\1\23\1\74"+
    "\1\75\1\100\1\25\1\67\1\0\1\25\1\40\1\54\1\30\1\46\2\0\1\46\1\45\1\101\1\30"+
    "\1\75\1\102\1\24\1\53\1\0\2\25\1\73\1\30\1\46\2\0\1\46\1\45\1\57\1\30\1\75"+
    "\1\102\1\32\1\53\1\0\1\103\1\25\1\73\1\30\1\46\4\0\1\50\1\30\1\104\1\41\1"+
    "\25\1\53\1\0\1\25\1\36\1\73\1\0\1\22\1\36\2\0\1\34\1\105\1\22\1\106\1\107"+
    "\1\0\2\25\1\110\1\25\1\37\6\0\1\62\1\0\1\22\1\0\1\24\4\25\1\111\1\112\1\52"+
    "\1\37\1\113\1\73\1\0\1\71\1\107\1\51\1\0\1\57\4\25\1\72\2\25\1\24\1\0\1\24"+
    "\1\114\1\115\1\0\1\37\3\0\1\26\1\37\1\0\1\30\2\0\1\37\3\0\1\26\1\32\7\25\11"+
    "\0\1\24\11\0\1\51\4\0\1\35\1\20\5\0\1\116\51\0\1\75\1\22\1\75\5\0\1\75\4\0"+
    "\1\75\1\22\1\75\1\0\1\22\7\0\1\75\10\0\1\50\4\25\2\0\2\25\12\0\1\26\1\25\1"+
    "\37\114\0\1\47\2\0\1\117\2\0\1\43\11\0\1\74\1\72\1\25\1\0\1\30\1\26\1\25\2"+
    "\0\1\26\1\25\2\0\1\2\1\25\1\0\1\30\1\120\1\25\12\0\1\121\1\122\1\0\1\24\3"+
    "\25\1\122\1\0\1\24\13\0\1\25\5\0\1\43\10\0\1\51\1\25\3\0\1\26\1\0\1\2\1\0"+
    "\1\2\1\67\4\0\1\51\1\26\1\25\5\0\1\2\3\0\1\24\1\0\1\24\4\25\3\0\1\2\7\0\1"+
    "\22\3\0\1\47\1\0\1\24\1\0\1\24\1\41\13\25\11\0\1\2\1\0\1\24\1\25\1\123\1\2"+
    "\1\25\16\0\1\2\1\25\7\0\1\25\1\0\1\101\5\0\1\51\12\25\1\116\3\0\1\22\1\25"+
    "\34\0\1\22\2\25\1\52\42\0\2\51\4\0\2\51\1\0\1\124\3\0\1\51\6\0\1\30\1\107"+
    "\1\125\1\26\1\53\1\2\1\0\1\26\1\125\1\26\1\126\1\127\3\25\1\130\1\25\1\41"+
    "\1\72\1\25\1\131\1\132\1\26\1\36\1\40\1\41\2\25\1\0\1\26\3\0\1\43\2\25\1\0"+
    "\1\26\1\133\1\0\1\72\1\25\1\106\1\36\1\105\1\134\1\27\1\135\1\0\1\57\1\136"+
    "\1\137\2\25\5\0\1\72\116\25\5\0\1\22\5\0\1\22\20\0\1\26\1\123\1\2\1\25\4\0"+
    "\1\35\1\20\7\0\1\41\1\25\1\41\2\0\1\22\1\25\10\22\4\0\5\25\1\41\72\25\1\140"+
    "\3\25\1\37\1\0\1\134\1\26\1\37\11\0\1\22\1\141\1\37\12\0\1\116\1\136\4\0\1"+
    "\51\1\37\12\0\1\22\2\25\3\0\1\43\6\25\170\0\1\51\11\25\71\0\1\26\6\25\21\0"+
    "\1\26\10\25\5\0\1\51\41\0\1\26\3\0\1\2\2\25\6\0\1\52\1\35\3\0\1\41\12\0\1"+
    "\24\3\25\1\41\1\0\1\36\14\0\1\60\1\2\1\25\1\0\1\43\11\25\6\0\2\25\1\72\6\0"+
    "\1\2\1\25\10\0\1\26\1\25\1\0\1\24\3\0\1\44\5\0\1\51\4\0\1\2\1\25\3\0\1\26"+
    "\10\0\1\72\1\41\1\0\1\24\4\25\6\0\1\22\1\25\1\0\1\51\1\0\1\24\2\0\1\22\1\110"+
    "\10\0\1\43\2\25\1\122\2\0\1\142\1\25\3\143\1\25\2\22\22\25\5\0\1\144\1\0\1"+
    "\24\64\0\1\2\1\25\2\0\1\22\1\123\5\0\1\2\40\25\55\0\1\51\15\0\1\24\4\25\1"+
    "\22\1\25\1\123\1\136\1\0\1\46\1\22\1\107\1\145\15\0\1\24\3\25\1\123\54\0\1"+
    "\51\2\25\10\0\1\36\6\0\5\25\1\0\1\26\2\0\2\25\1\22\1\25\1\77\2\25\1\136\3"+
    "\25\1\40\1\30\20\0\1\47\1\131\1\25\1\0\1\24\1\37\2\0\1\62\1\37\2\0\1\43\1"+
    "\67\12\0\1\22\3\36\1\146\1\147\2\25\1\150\1\0\1\45\2\0\1\22\2\0\1\151\1\0"+
    "\1\51\1\0\1\51\4\25\17\0\1\43\10\25\6\0\1\26\20\25\1\20\20\25\3\0\1\26\6\0"+
    "\1\72\5\25\3\0\1\22\2\25\3\0\1\43\6\25\3\0\1\51\4\0\1\2\1\0\1\134\5\25\23"+
    "\0\1\51\1\0\1\24\52\25\1\51\1\46\4\0\1\35\1\152\2\0\1\51\25\25\2\0\1\51\1"+
    "\25\3\0\1\24\10\25\7\0\1\67\10\25\1\153\1\52\1\45\1\37\2\0\1\2\1\62\4\25\3"+
    "\0\1\26\20\25\6\0\1\51\1\25\2\0\1\51\1\25\2\0\1\43\21\25\11\0\1\72\66\25\10"+
    "\0\1\22\3\25\1\67\1\0\2\25\7\0\1\154\2\25\3\0\1\72\1\0\1\24\6\0\1\30\1\0\10"+
    "\25\10\0\1\26\1\25\1\0\1\24\24\25\7\0\1\25\1\0\1\24\46\25\55\0\1\22\22\25"+
    "\14\0\1\43\63\25\5\0\1\22\72\25\7\0\1\72\130\25\10\0\1\26\1\25\5\0\1\22\1"+
    "\25\1\41\2\0\14\25\1\24\153\25\1\136\1\101\2\0\1\50\1\2\3\25\1\31\22\25\1"+
    "\146\67\25\12\0\1\30\10\0\1\30\1\155\1\156\1\0\1\157\1\45\7\0\1\35\1\50\2"+
    "\30\3\0\1\160\1\107\1\36\1\46\51\0\1\51\3\0\1\46\2\0\1\116\3\0\1\116\2\0\1"+
    "\30\3\0\1\30\2\0\1\22\3\0\1\22\3\0\1\46\3\0\1\46\2\0\1\116\1\53\6\0\1\45\3"+
    "\0\1\111\1\37\1\116\1\161\1\106\1\162\1\111\1\124\1\111\2\116\1\66\1\0\1\34"+
    "\1\0\1\2\1\54\1\34\1\0\1\2\50\25\32\0\1\22\5\25\106\0\1\26\1\25\33\0\1\51"+
    "\74\25\1\40\3\25\14\0\20\25\36\0\2\25");

  /* The ZZ_CMAP_A table has 920 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\20\1\3\1\2\2\1\1\2\6\20\4\0\1\3\1\20\1\7\1\0\1\20\2\0\1\11\2\20\1\6\1"+
    "\17\1\25\1\12\1\15\1\4\1\13\11\14\1\26\1\0\3\20\1\0\5\20\1\16\5\20\1\23\1"+
    "\10\1\24\2\20\1\0\1\34\3\20\1\32\1\33\5\20\1\35\1\20\1\37\3\20\1\30\1\36\1"+
    "\27\1\31\5\20\1\21\1\0\1\22\7\20\1\5\2\20\1\3\1\0\4\20\4\0\1\20\2\0\1\20\7"+
    "\0\1\20\4\0\1\20\5\0\7\20\1\0\2\20\4\0\4\20\16\0\5\20\7\0\1\20\1\0\1\20\1"+
    "\0\5\20\1\0\2\20\2\0\4\20\10\0\1\20\1\0\3\20\1\0\1\20\1\0\4\20\1\0\13\20\1"+
    "\0\1\20\2\0\6\20\1\0\7\20\1\0\1\20\15\0\1\20\1\0\2\20\1\0\2\20\1\0\4\20\10"+
    "\0\1\20\4\0\4\20\1\0\4\20\1\0\13\20\2\0\4\20\2\0\11\20\6\0\10\20\2\0\2\20"+
    "\1\0\3\20\1\0\4\20\2\0\6\20\1\0\1\20\3\0\4\20\2\0\5\20\2\0\4\20\5\0\2\20\1"+
    "\0\4\20\4\0\2\20\1\0\2\20\1\0\2\20\1\0\2\20\2\0\1\20\1\0\3\20\2\0\3\20\3\0"+
    "\4\20\1\0\1\20\7\0\3\20\1\0\2\20\1\0\5\20\1\0\3\20\2\0\1\20\11\0\2\20\1\0"+
    "\6\20\3\0\3\20\1\0\4\20\3\0\2\20\1\0\1\20\1\0\2\20\3\0\2\20\3\0\1\20\6\0\3"+
    "\20\3\0\3\20\5\0\2\20\2\0\2\20\5\0\1\20\1\0\5\20\1\0\4\20\1\0\1\20\4\0\1\20"+
    "\4\0\6\20\1\0\1\20\3\0\2\20\5\0\2\20\1\0\1\20\2\0\2\20\1\0\1\20\2\0\1\20\3"+
    "\0\3\20\1\0\1\20\1\0\1\20\5\0\1\20\1\0\1\20\1\0\1\20\4\0\5\20\1\0\4\20\1\3"+
    "\10\20\1\0\2\20\4\0\4\20\3\0\1\20\3\0\3\20\5\0\5\20\1\0\1\20\1\0\1\20\1\0"+
    "\1\20\1\0\1\20\2\0\3\20\1\0\2\20\13\3\5\20\2\1\5\20\1\3\4\0\1\20\12\0\1\3"+
    "\1\0\1\20\3\0\3\20\1\0\5\20\2\0\1\20\1\0\4\20\1\0\1\20\5\0\5\20\4\0\1\20\1"+
    "\0\1\3\4\0\3\20\1\0\2\20\2\0\3\20\2\0\5\20\2\0\6\20\1\0\3\20\1\0\2\20\2\0"+
    "\2\20\1\0\2\20\1\0\2\20\2\0\3\20\3\0\2\20\3\0\2\20\2\0\3\20\4\0\3\20\1\0\2"+
    "\20\1\0\2\20\3\0\1\20\2\0\5\20\1\0\2\20\1\0\3\20\2\0\1\20\4\0\1\20\2\0\2\20"+
    "\2\0\4\20\1\0\4\20\1\0\1\20\1\0\5\20\1\0\4\20\2\0\1\20\1\0\1\20\5\0\1\20\1"+
    "\0\1\20\1\0\3\20");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\1\3\1\4\1\5"+
    "\1\3\2\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\3\3\1\15\1\16\1\4\2\0\1\5\1\3\1\6"+
    "\3\3\1\15\1\16\1\3\3\6\3\3\1\0\1\16"+
    "\1\17\1\3\1\20\1\16\1\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[47];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\40\0\40\0\40\0\40\0\40"+
    "\0\40\0\u0160\0\u0180\0\u01a0\0\u01c0\0\u01e0\0\40\0\u0200"+
    "\0\u0220\0\40\0\u0240\0\u0260\0\u0280\0\u02a0\0\u02c0\0\u02e0"+
    "\0\u0300\0\u0320\0\u0340\0\u0360\0\u0380\0\u03a0\0\u03c0\0\u03e0"+
    "\0\u0400\0\240\0\240\0\u0420\0\240\0\40\0\240";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[47];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\12\1\13\2\6\1\2\1\6\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\3\6\1\23\3\6"+
    "\1\24\41\0\3\3\1\0\1\3\36\0\1\25\1\6"+
    "\1\26\3\0\5\6\1\0\1\6\6\0\11\6\1\0"+
    "\3\3\1\6\1\5\1\6\3\0\5\6\1\0\1\6"+
    "\6\0\11\6\4\0\3\6\3\0\5\6\1\0\1\6"+
    "\6\0\11\6\2\7\1\0\4\7\1\27\1\30\27\7"+
    "\2\10\1\0\5\10\1\31\1\32\26\10\4\0\3\6"+
    "\3\0\1\6\1\12\1\13\2\6\1\0\1\6\6\0"+
    "\11\6\4\0\3\6\3\0\3\6\1\33\1\34\1\0"+
    "\1\6\6\0\3\6\1\34\5\6\4\0\3\6\3\0"+
    "\1\6\2\13\1\33\1\34\1\0\1\6\6\0\3\6"+
    "\1\34\5\6\4\0\3\6\3\0\5\6\1\0\1\6"+
    "\6\0\1\6\1\35\7\6\4\0\3\6\3\0\5\6"+
    "\1\0\1\6\6\0\5\6\1\36\3\6\4\0\3\6"+
    "\3\0\5\6\1\0\1\6\6\0\2\6\1\37\6\6"+
    "\1\40\2\0\1\40\1\25\1\6\1\25\3\40\5\25"+
    "\1\40\1\25\6\40\11\25\4\41\2\26\1\42\3\41"+
    "\5\26\1\41\1\26\6\41\11\26\2\7\1\0\35\7"+
    "\2\10\1\0\35\10\4\0\3\6\3\0\1\6\2\43"+
    "\2\6\1\0\1\6\6\0\11\6\4\0\3\6\3\0"+
    "\3\44\2\6\1\45\1\6\6\0\11\6\4\0\3\6"+
    "\3\0\5\6\1\0\1\6\6\0\2\6\1\46\6\6"+
    "\4\0\3\6\3\0\5\6\1\0\1\6\6\0\6\6"+
    "\1\47\2\6\4\0\3\6\3\0\5\6\1\0\1\6"+
    "\6\0\6\6\1\50\2\6\1\40\2\0\2\40\1\0"+
    "\32\40\6\41\1\51\35\41\1\52\1\26\1\42\3\41"+
    "\5\26\1\41\1\26\6\41\11\26\4\0\3\6\3\0"+
    "\1\6\2\43\1\6\1\34\1\0\1\6\6\0\3\6"+
    "\1\34\5\6\4\0\3\6\3\0\1\6\2\44\2\6"+
    "\1\0\1\6\6\0\11\6\13\0\2\45\27\0\3\6"+
    "\3\0\5\6\1\0\1\6\6\0\3\6\1\53\5\6"+
    "\4\0\3\6\3\0\5\6\1\0\1\6\6\0\7\6"+
    "\1\54\1\6\4\0\3\6\3\0\5\6\1\0\1\6"+
    "\6\0\6\6\1\55\2\6\4\41\1\56\1\41\1\51"+
    "\31\41\4\0\3\6\3\0\5\6\1\0\1\6\6\0"+
    "\3\6\1\57\5\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1088];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\11\1\6\11\5\1\1\11\2\0\1\11"+
    "\16\1\1\0\4\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[47];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _JsonLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _JsonLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 18: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 19: break;
          case 3: 
            { return IDENTIFIER;
            }
          case 20: break;
          case 4: 
            { return DOUBLE_QUOTED_STRING;
            }
          case 21: break;
          case 5: 
            { return SINGLE_QUOTED_STRING;
            }
          case 22: break;
          case 6: 
            { return NUMBER;
            }
          case 23: break;
          case 7: 
            { return L_CURLY;
            }
          case 24: break;
          case 8: 
            { return R_CURLY;
            }
          case 25: break;
          case 9: 
            { return L_BRACKET;
            }
          case 26: break;
          case 10: 
            { return R_BRACKET;
            }
          case 27: break;
          case 11: 
            { return COMMA;
            }
          case 28: break;
          case 12: 
            { return COLON;
            }
          case 29: break;
          case 13: 
            { return LINE_COMMENT;
            }
          case 30: break;
          case 14: 
            { return BLOCK_COMMENT;
            }
          case 31: break;
          case 15: 
            { return TRUE;
            }
          case 32: break;
          case 16: 
            { return NULL;
            }
          case 33: break;
          case 17: 
            { return FALSE;
            }
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
