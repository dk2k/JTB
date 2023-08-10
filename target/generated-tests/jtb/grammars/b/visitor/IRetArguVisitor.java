/* Generated by JTB 1.5.1 */
package grammars.b.visitor;

import grammars.b.syntaxtree.*;

/**
 * All "IRetArguVisitor" visitors must implement this interface.

 * @param <R> - The return type parameter
 * @param <A> - The argument 0 type parameter
 */
public interface IRetArguVisitor<R, A> {

  /*
   * Base nodes visit methods
   */

  /**
   * Visits a {@link NodeChoice} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeChoice n, final A argu);

  /**
   * Visits a {@link NodeList} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeList n, final A argu);

  /**
   * Visits a {@link NodeListOptional} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeListOptional n, final A argu);

  /**
   * Visits a {@link NodeOptional} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeOptional n, final A argu);

  /**
   * Visits a {@link NodeSequence} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeSequence n, final A argu);

  /**
   * Visits a {@link NodeToken} node), passing it argument(s).
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final NodeToken n, final A argu);

  /*
   * User grammar generated visit methods
   */

  /**
   * Visits a {@link jcp_v$} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_v$ n, final A argu);

  /**
   * Visits a {@link jcp_iv$} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_iv$ n, final A argu);

  /**
   * Visits a {@link jcp_ui$} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_ui$ n, final A argu);

  /**
   * Visits a {@link jcp_s$} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_s$ n, final A argu);

  /**
   * Visits a {@link jcp_ubar$} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_ubar$ n, final A argu);

  /**
   * Visits a {@link Start} node, whose child is the following :
   * <p>
   * f0 -> . %0 < EOF ><br>
   * .. .. | %1 #00 bp_v() #01 bp_v_()<br>
   * .. .. . .. #02 bp_w() #03 bp_w_() #04 bp_x()<br>
   * .. .. . .. #05 bp_x_() #06 bp_x__() #07 bp_y()<br>
   * .. .. . .. #08 bp_y_() #09 bp_z_() #10 bp_z__()<br>
   * .. .. . .. #11 bp_v_o() #12 bp_v_o() #13 bp_ui()<br>
   * .. .. . .. #14 bp_s() #15 bp_sa()<br>
   * .. .. . .. #16 bp_v1() #17 bp_v2() #18 bp_v3()<br>
   * .. .. . .. #19 bp_s1() #20 bp_s2() #21 bp_s3()<br>
   * .. .. . .. #22 bp_c() #23 bp_ca() #24 bp_h()<br>
   * .. .. . .. #25 bp_haa() #26 bp_l()<br>
   * .. .. . .. #27 bp_d() #28 bp_da() #29 bp_f()<br>
   * .. .. . .. #30 bp_jual() #31 bp_hm() #32 < EOF ><br>
   * .. .. | %2 #0 ";" #1 bp_tu_a() #2 bp_acc()<br>
   * .. .. . .. #3 bp_DoubleThrows()<br>
   * .. .. . .. :4 bp_DoubleThrows()<br>
   * .. .. . .. #5 jcp_DoubleThrows()<br>
   * .. .. . .. :6 jcp_DoubleThrows()<br>
   * .. .. . .. #7 skipButBuild() #8 < EOF ><br>
   * .. .. | %3 #0 "," #1 expch_a() #2 expch_b()<br>
   * .. .. . .. #3 expch_c() #4 expch_c() #5 expch_c()<br>
   * .. .. . .. #6 expch_c() #7 expch_c() #8 expch_c()<br>
   * .. .. | %4 #0 "." #1 expch_em_lxac() #2 expch_em_lxac()<br>
   * .. .. . .. #3 expch_em_lxac() #4 expch_em_lxac()<br>
   * .. .. . .. #5 expch_wnsn() #6 expch_wnsn() #7 expch_2ch()<br>
   * s: 1245641368<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final Start n, final A argu);

  /**
   * Visits a {@link bp_v} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v n, final A argu);

  /**
   * Visits a {@link bp_v_} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v_ n, final A argu);

  /**
   * Visits a {@link bp_w} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_w n, final A argu);

  /**
   * Visits a {@link bp_w_} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_w_ n, final A argu);

  /**
   * Visits a {@link bp_x} node, whose child is the following :
   * <p>
   * f0 -> bp_v()<br>
   * s: 130120127<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_x n, final A argu);

  /**
   * Visits a {@link bp_x_} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_x_ n, final A argu);

  /**
   * Visits a {@link bp_x__} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_x__ n, final A argu);

  /**
   * Visits a {@link bp_y} node, whose children are the following :
   * <p>
   * f0 -> < Y:":y" ><br>
   * f1 -> ":"<br>
   * s: 1249636947<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_y n, final A argu);

  /**
   * Visits a {@link bp_y_} node, whose child is the following :
   * <p>
   * f0 -> "!"<br>
   * s: 2055659818<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_y_ n, final A argu);

  /**
   * Visits a {@link bp_z_} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_z_ n, final A argu);

  /**
   * Visits a {@link bp_z__} node, whose child is the following :
   * <p>
   * f0 -> bp_y_()<br>
   * s: -261101121<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_z__ n, final A argu);

  /**
   * Visits a {@link bp_v_o} node, whose children are the following :
   * <p>
   * f0 -> ( %0 #0 ( &0 "_foo"<br>
   * .. .. . .. .. | &1 {} )<br>
   * .. .. . .. #1 "_bar" #2 < ID ><br>
   * .. .. | %1 #0 "_bar" #1 "_bar" )<br>
   * f1 -> ( %0 #0 ( &0 {}<br>
   * .. .. . .. .. | &1 "_foo" )<br>
   * .. .. . .. #1 "_bar" #2 < ID ><br>
   * .. .. | %1 #0 "_bar" #1 "_bar" )<br>
   * s: 1752869627<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v_o n, final A argu);

  /**
   * Visits a {@link bp_i} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_i n, final A argu);

  /**
   * Visits a {@link bp_i2} node, whose child is the following :
   * <p>
   * f0 -> bp_i()<br>
   * s: 130107634<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_i2 n, final A argu);

  /**
   * Visits a {@link bp_ui} node, whose child is the following :
   * <p>
   * f0 -> < ID >.kind<br>
   * s: 1875637612<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_ui n, final A argu);

  /**
   * Visits a {@link bp_s} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_s n, final A argu);

  /**
   * Visits a {@link bp_sa} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_sa n, final A argu);

  /**
   * Visits a {@link bp_v1} node, whose child is the following :
   * <p>
   * f0 -> bp_v()<br>
   * s: 130120127<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v1 n, final A argu);

  /**
   * Visits a {@link bp_v2} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v2 n, final A argu);

  /**
   * Visits a {@link bp_v3} node, whose child is the following :
   * <p>
   * f0 -> bp_v()<br>
   * s: 130120127<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_v3 n, final A argu);

  /**
   * Visits a {@link bp_s1} node, whose child is the following :
   * <p>
   * f0 -> bp_s()<br>
   * s: 130117244<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_s1 n, final A argu);

  /**
   * Visits a {@link bp_s2} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_s2 n, final A argu);

  /**
   * Visits a {@link bp_s3} node, whose child is the following :
   * <p>
   * f0 -> bp_s()<br>
   * s: 130117244<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_s3 n, final A argu);

  /**
   * Visits a {@link bp_c} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_c n, final A argu);

  /**
   * Visits a {@link bp_ca} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_ca n, final A argu);

  /**
   * Visits a {@link bp_h} node, whose child is the following :
   * <p>
   * f0 -> ( < ID > )<br>
   * s: -2053831081<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_h n, final A argu);

  /**
   * Visits a {@link bp_haa} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_haa n, final A argu);

  /**
   * Visits a {@link bp_l} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_l n, final A argu);

  /**
   * Visits a {@link bp_d} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_d n, final A argu);

  /**
   * Visits a {@link bp_da} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_da n, final A argu);

  /**
   * Visits a {@link bp_f} node, whose child is the following :
   * <p>
   * f0 -> < efID ><br>
   * s: 861265399<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_f n, final A argu);

  /**
   * Visits a {@link bp_jual} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_jual n, final A argu);

  /**
   * Visits a {@link bp_hm} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_hm n, final A argu);

  /**
   * Visits a {@link bp_tu_a} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> ( #0 skipButBuild()<br>
   * .. .. . #1 jcp_ubar$() )<br>
   * f2 -> bp_v()<br>
   * s: -554973151<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_tu_a n, final A argu);

  /**
   * Visits a {@link bp_acc} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> [ "xyz" ]<br>
   * f2 -> ( bp_i() )*<br>
   * f3 -> ( %0 bp_v()<br>
   * .. .. | %1 ( #0 bp_w() #1 bp_x() ) )<br>
   * s: -2115359581<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_acc n, final A argu);

  /**
   * Visits a {@link bp_DoubleThrows} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_DoubleThrows n, final A argu);

  /**
   * Visits a {@link bp_class1} node, whose child is the following :
   * <p>
   * f0 -> < ID ><br>
   * s: -1032372970<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final bp_class1 n, final A argu);

  /**
   * Visits a {@link jcp_DoubleThrows} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final jcp_DoubleThrows n, final A argu);

  /**
   * Visits a {@link skipButBuild} node, with no child :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final skipButBuild n, final A argu);

  /**
   * Visits a {@link expch_a} node, whose child is the following :
   * <p>
   * f0 -> . %0 #0 "!" #1 < ID ><br>
   * .. .. | %1 "!abc"<br>
   * s: 1194643558<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_a n, final A argu);

  /**
   * Visits a {@link expch_b} node, whose child is the following :
   * <p>
   * f0 -> ( %0 #0 "?" #1 < abID ><br>
   * .. .. | %1 "?abc" )<br>
   * s: -2010824528<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_b n, final A argu);

  /**
   * Visits a {@link expch_c} node, whose child is the following :
   * <p>
   * f0 -> ( %0 ( &0 #0 < NUM_3_9 > #1 "!NUM_3_9!"<br>
   * .. .. . .. | &1 #0 < NUM_3_9 > #1 < ID ><br>
   * .. .. . .. | &2 #0 < ID > #1 "i==0"<br>
   * .. .. . .. | &3 #0 ( $0 < ID > $1 "i==1" )?<br>
   * .. .. . .. . .. #1 ( $0 < ID > $1 "j==2" )*<br>
   * .. .. . .. . .. #2 ( $0 < ID > $1 "j==3" )+ )<br>
   * .. .. | %1 < ES ><br>
   * .. .. | %2 #0 < NUM_3_9 > #1 "*39*" )<br>
   * s: -1450696804<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_c n, final A argu);

  /**
   * Visits a {@link expch_em_lxac} node, whose children are the following :
   * <p>
   * f0 -> ( %0 ":poi"<br>
   * .. .. | %1 ":uyt"<br>
   * .. .. | %2 ":rez"<br>
   * .. .. | %3 {} )<br>
   * f1 -> "/"<br>
   * s: -1331397378<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_em_lxac n, final A argu);

  /**
   * Visits a {@link expch_wnsn} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_wnsn n, final A argu);

  /**
   * Visits a {@link expch_2ch} node, whose children are the following :
   * <p>
   * f0 -> ( %0 ",jkl"<br>
   * .. .. | %1 {} )<br>
   * f1 -> ( %0 {}<br>
   * .. .. | %1 ",stu" )<br>
   * s: 1094260034<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_2ch n, final A argu);

  /**
   * Visits a {@link expch_bl_a} node, whose child is the following :
   * <p>
   * f0 -> . %0 < NUM_3_9 ><br>
   * .. .. | %1 {}<br>
   * s: -396343826<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_a n, final A argu);

  /**
   * Visits a {@link expch_bl_a$} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_a$ n, final A argu);

  /**
   * Visits a {@link expch_bl_b} node, whose child is the following :
   * <p>
   * f0 -> . %0 {}<br>
   * .. .. | %1 < NUM_3_9 ><br>
   * s: 1722077994<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_b n, final A argu);

  /**
   * Visits a {@link expch_bl_b$} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_b$ n, final A argu);

  /**
   * Visits a {@link expch_bl_c} node, whose child is the following :
   * <p>
   * f0 -> . %0 {}<br>
   * .. .. | %1 < NUM_3_9 ><br>
   * s: 1722077994<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_c n, final A argu);

  /**
   * Visits a {@link expch_bl_c$} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_c$ n, final A argu);

  /**
   * Visits a {@link expch_bl_d} node, whose child is the following :
   * <p>
   * f0 -> . %0 < A_BS_B ><br>
   * .. .. | %1 < NUM_3_9 ><br>
   * .. .. | %2 {}<br>
   * .. .. | %3 {}<br>
   * .. .. | %4 {}<br>
   * .. .. | %5 {}<br>
   * .. .. | %6 {}<br>
   * .. .. | %7 "$^$^"<br>
   * s: 1959280963<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_bl_d n, final A argu);

  /**
   * Visits a {@link expch_eu_a} node, whose child is the following :
   * <p>
   * f0 -> . %0 < abID ><br>
   * .. .. | %1 {}<br>
   * .. .. | %2 < OP:["+"] ><br>
   * .. .. | %3 #0 "*1"<br>
   * .. .. . .. #1 ( &0 < SC1:";1" ><br>
   * .. .. . .. .. | &1 {}<br>
   * .. .. . .. .. | &2 < efID > )<br>
   * .. .. . .. #2 [ ( ( &0 < abID ><br>
   * .. .. . .. .. . . | &1 < "*2" ><br>
   * .. .. . .. .. . . | &2 {} ) )? ]<br>
   * .. .. . .. #3 ( ( ( &0 < abID ><br>
   * .. .. . .. .. . . | &1 < "*2" ><br>
   * .. .. . .. .. . . | &2 {} ) )? )?<br>
   * .. .. . .. #4 ( $0 "*4"<br>
   * .. .. . .. .. . $1 ( ( &0 {}<br>
   * .. .. . .. .. . .. . | &1 {}<br>
   * .. .. . .. .. . .. . | &2 < efID > ) )* )*<br>
   * .. .. . .. #5 ( $0 ( < "*5" > )?<br>
   * .. .. . .. .. . $1 ( ( &0 < abID ><br>
   * .. .. . .. .. . .. . | &1 {}<br>
   * .. .. . .. .. . .. . | &2 < SC4:(";4")+ ><br>
   * .. .. . .. .. . .. . | &3 {}<br>
   * .. .. . .. .. . .. . | &4 {} ) )+ )+<br>
   * s: 1610864831<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expch_eu_a n, final A argu);

  /**
   * Visits a {@link expun_a1} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * f3 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * s: 1376158947<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_a1 n, final A argu);

  /**
   * Visits a {@link expun_b1} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * f3 -> eu_id_or_ident()<br>
   * s: -1408399324<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_b1 n, final A argu);

  /**
   * Visits a {@link expun_c1} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * s: 1973180222<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_c1 n, final A argu);

  /**
   * Visits a {@link expun_d1} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * s: 1973180222<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_d1 n, final A argu);

  /**
   * Visits a {@link expun_a2} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 #0 Identifier()<br>
   * .. .. . .. #1 ( &0 < ID ><br>
   * .. .. . .. .. | &1 Identifier() ) )<br>
   * s: 1070599542<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_a2 n, final A argu);

  /**
   * Visits a {@link expun_b2} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 #0 Identifier() #1 eu_id_or_ident() )<br>
   * s: 1485056343<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_b2 n, final A argu);

  /**
   * Visits a {@link expun_c2} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * s: 1973180222<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_c2 n, final A argu);

  /**
   * Visits a {@link expun_d2} node, whose children are the following :
   * <p>
   * f0 -> < ID ><br>
   * f1 -> Identifier()<br>
   * f2 -> ( %0 < ID ><br>
   * .. .. | %1 Identifier() )<br>
   * s: 1973180222<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_d2 n, final A argu);

  /**
   * Visits a {@link expun_a3} node, whose child is the following :
   * <p>
   * f0 -> ( %0 < ID ><br>
   * .. .. | %1 #0 Identifier() #1 eu_id_or_ident() )<br>
   * s: 1613489651<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_a3 n, final A argu);

  /**
   * Visits a {@link expun_b3} node, whose child is the following :
   * <p>
   * f0 -> ( %0 {}<br>
   * .. .. | %1 #0 Identifier() #1 eu_id_or_ident() )<br>
   * s: -234196616<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_b3 n, final A argu);

  /**
   * Visits a {@link expun_c3} node, whose child is the following :
   * <p>
   * f0 -> ( %0 < ID ><br>
   * .. .. | %1 {} )<br>
   * s: 1971178170<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_c3 n, final A argu);

  /**
   * Visits a {@link expun_d3} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final expun_d3 n, final A argu);

  /**
   * Visits a {@link eu_id_or_ident} node, whose child is the following :
   * <p>
   * f0 -> . %0 < ID ><br>
   * .. .. | %1 Identifier()<br>
   * s: 205316371<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final eu_id_or_ident n, final A argu);

  /**
   * Visits a {@link Identifier} node, whose child is the following :
   * <p>
   * f0 -> . %0 < A_BS_B ><br>
   * .. .. | %1 < ID ><br>
   * s: 2078928335<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final Identifier n, final A argu);

  /**
   * Visits a {@link check_proper_formatting} node, whose child is the following :
   * <p>
   * f0 -> . %0 < ID ><br>
   * .. .. | %1 < ES ><br>
   * s: 1099811577<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final check_proper_formatting n, final A argu);

  /**
   * Visits a {@link f0_eu1_be} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_be n, final A argu);

  /**
   * Visits a {@link f0_eu1_b1} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_b1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_b2} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_b2 n, final A argu);

  /**
   * Visits a {@link f0_eu1_ias1} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_be()<br>
   * s: -1061049602<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_ias1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_ias2} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_b1()<br>
   * s: -1061099574<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_ias2 n, final A argu);

  /**
   * Visits a {@link f0_eu2_all1} node, whose children are the following :
   * <p>
   * f0 -> [ ";".image ]<br>
   * f1 -> f0_eu1_b1()<br>
   * f2 -> ( #0 ";; "<br>
   * .. .. . #1 ( $0 ";;; " $1 ";;;; " ) )<br>
   * f3 -> ( < NUM_3_9 > )*<br>
   * f4 -> ( ( %0 ":"<br>
   * .. .. . | %1 #0 ":" #1 < ES > ) )?<br>
   * f5 -> f0_eu1_peias2()<br>
   * f6 ->   %0 expch_a()<br>
   * .. .. | %1 expch_b()<br>
   * f7 -> ( %0 expch_2ch()<br>
   * .. .. | %1 expch_bl_a() )<br>
   * s: -1657766831<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu2_all1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_jc} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_jc n, final A argu);

  /**
   * Visits a {@link f0_eu1_peias1} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_b2()<br>
   * s: -1061098613<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_peias1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_peias2} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_b2()<br>
   * s: -1061098613<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_peias2 n, final A argu);

  /**
   * Visits a {@link f0_eu1_pejc1} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_pejc1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_pejc2} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_pejc2 n, final A argu);

  /**
   * Visits a {@link f0_eu1_resl1} node, whose child is the following :
   * <p>
   * f0 -> "!"<br>
   * s: 2055659818<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_resl1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_resl2} node, whose child is the following :
   * <p>
   * f0 -> < resl2:"!x" ><br>
   * s: 788986552<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_resl2 n, final A argu);

  /**
   * Visits a {@link f0_eu1_resl3} node, whose child is the following :
   * <p>
   * f0 -> < resl3:< resl2 > ><br>
   * s: 1643973678<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_resl3 n, final A argu);

  /**
   * Visits a {@link f0_eu1_recrec1} node, whose child is the following :
   * <p>
   * f0 -> < recrec1:< abID >< ID >|< efID > ><br>
   * s: 11265239<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_recrec1 n, final A argu);

  /**
   * Visits a {@link f0_eu1_recrec2} node, whose child is the following :
   * <p>
   * f0 -> < recrec2:"!"|< resl2 >|< resl3 >|< efID >|("#1")|(("#2")?"#3"|(("#4")*"#5"|("#6")+))|("#7"< A_BS_B >)("#8"|< SYN_ESC >) ><br>
   * s: -823049317<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_recrec2 n, final A argu);

  /**
   * Visits a {@link f0_eu1_recrec3} node, whose child is the following :
   * <p>
   * f0 -> < recrec3:"'"|< recrec1 >|< recrec2 > ><br>
   * s: -2056495050<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_recrec3 n, final A argu);

  /**
   * Visits a {@link f0_eu1_retk} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_retk n, final A argu);

  /**
   * Visits a {@link f0_eu1_reeof} node, whose child is the following :
   * <p>
   * f0 -> < EOF ><br>
   * s: -1942121731<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_eu1_reeof n, final A argu);

  /**
   * Visits a {@link f0_laeu2_be} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_laeu2_be n, final A argu);

  /**
   * Visits a {@link f0_laeu2_b1} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_laeu2_b1 n, final A argu);

  /**
   * Visits a {@link f0_laeu2_ias1} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_be()<br>
   * s: -1061049602<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_laeu2_ias1 n, final A argu);

  /**
   * Visits a {@link f0_laeu2_ias2} node, whose child is the following :
   * <p>
   * f0 -> f0_eu1_b1()<br>
   * s: -1061099574<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_laeu2_ias2 n, final A argu);

  /**
   * Visits a {@link f0_laeu2_jc} node, whose children are the following :
   * <p>
   * s: 0<br>
   *
   * @param n - the node to visit
   * @param argu - the user argument 0
   * @return the user return information
   */
  public R visit(final f0_laeu2_jc n, final A argu);

}
