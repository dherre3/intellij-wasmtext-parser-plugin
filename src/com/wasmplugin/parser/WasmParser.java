// This is a generated file. Not intended for manual editing.
package com.wasmplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.wasmplugin.psi.WasmTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WasmParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t instanceof IFileElementType) {
      r = parse_root_(t, b, 0);
    }
    else {
      r = false;
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // param_list* result*
  public static boolean abbr_type_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABBR_TYPE_USE, "<abbr type use>");
    r = abbr_type_use_0(b, l + 1);
    r = r && abbr_type_use_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list*
  private static boolean abbr_type_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!param_list(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_type_use_0", c)) break;
    }
    return true;
  }

  // result*
  private static boolean abbr_type_use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abbr_type_use_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!result(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "abbr_type_use_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TALIGN  TEQUAL TINT
  public static boolean align_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "align_arg")) return false;
    if (!nextTokenIs(b, TALIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TALIGN, TEQUAL, TINT);
    exit_section_(b, m, ALIGN_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // TBLOCK TID? result? instruction* TEND TID?
  //                     |   TLOOP TID? result? instruction* TEND TID?
  //                     |   TIF TID? result? instruction* else_clause? TEND TID?
  static boolean block_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_instruction_0(b, l + 1);
    if (!r) r = block_instruction_1(b, l + 1);
    if (!r) r = block_instruction_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TBLOCK TID? result? instruction* TEND TID?
  private static boolean block_instruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBLOCK);
    r = r && block_instruction_0_1(b, l + 1);
    r = r && block_instruction_0_2(b, l + 1);
    r = r && block_instruction_0_3(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean block_instruction_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_0_3", c)) break;
    }
    return true;
  }

  // TID?
  private static boolean block_instruction_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_0_5")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLOOP TID? result? instruction* TEND TID?
  private static boolean block_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLOOP);
    r = r && block_instruction_1_1(b, l + 1);
    r = r && block_instruction_1_2(b, l + 1);
    r = r && block_instruction_1_3(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean block_instruction_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_1_3", c)) break;
    }
    return true;
  }

  // TID?
  private static boolean block_instruction_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_1_5")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TIF TID? result? instruction* else_clause? TEND TID?
  private static boolean block_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIF);
    r = r && block_instruction_2_1(b, l + 1);
    r = r && block_instruction_2_2(b, l + 1);
    r = r && block_instruction_2_3(b, l + 1);
    r = r && block_instruction_2_4(b, l + 1);
    r = r && consumeToken(b, TEND);
    r = r && block_instruction_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean block_instruction_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean block_instruction_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_2")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean block_instruction_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_instruction_2_3", c)) break;
    }
    return true;
  }

  // else_clause?
  private static boolean block_instruction_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_4")) return false;
    else_clause(b, l + 1);
    return true;
  }

  // TID?
  private static boolean block_instruction_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_instruction_2_6")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // TLP TDATA idx? offset_abbrv TNAME TRP
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA);
    r = r && data_2(b, l + 1);
    r = r && offset_abbrv(b, l + 1);
    r = r && consumeTokens(b, 0, TNAME, TRP);
    exit_section_(b, m, DATA, r);
    return r;
  }

  // idx?
  private static boolean data_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_2")) return false;
    idx(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TLP TDATA TNAME TRP
  public static boolean data_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA, TNAME, TRP);
    exit_section_(b, m, DATA_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TELEM idx* TRP
  public static boolean elem_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TELEM);
    r = r && elem_short_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, ELEM_SHORT, r);
    return r;
  }

  // idx*
  private static boolean elem_short_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_short_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elem_short_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TFUNCREF
  public static boolean elem_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_type")) return false;
    if (!nextTokenIs(b, TFUNCREF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TFUNCREF);
    exit_section_(b, m, ELEM_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TELEM idx? offset_abbrv idx*  TRP
  public static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TELEM);
    r = r && element_2(b, l + 1);
    r = r && offset_abbrv(b, l + 1);
    r = r && element_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, ELEMENT, r);
    return r;
  }

  // idx?
  private static boolean element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_2")) return false;
    idx(b, l + 1);
    return true;
  }

  // idx*
  private static boolean element_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TELSE TID? instruction*
  static boolean else_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause")) return false;
    if (!nextTokenIs(b, TELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TELSE);
    r = r && else_clause_1(b, l + 1);
    r = r && else_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean else_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_1")) return false;
    consumeToken(b, TID);
    return true;
  }

  // instruction*
  private static boolean else_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_clause_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TTHEN instruction* TRP
  static boolean else_clause_folded(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_folded")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTHEN);
    r = r && else_clause_folded_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // instruction*
  private static boolean else_clause_folded_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_folded_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_clause_folded_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TEXPORT TNAME export_desc TRP
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TEXPORT, TNAME);
    r = r && export_desc(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, EXPORT, r);
    return r;
  }

  /* ********************************************************** */
  // TLP (TFUNC|TMEMORY|TTABLE|TGLOBAL) idx TRP
  public static boolean export_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_desc")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && export_desc_1(b, l + 1);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, EXPORT_DESC, r);
    return r;
  }

  // TFUNC|TMEMORY|TTABLE|TGLOBAL
  private static boolean export_desc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_desc_1")) return false;
    boolean r;
    r = consumeToken(b, TFUNC);
    if (!r) r = consumeToken(b, TMEMORY);
    if (!r) r = consumeToken(b, TTABLE);
    if (!r) r = consumeToken(b, TGLOBAL);
    return r;
  }

  /* ********************************************************** */
  // TLP TEXPORT TNAME TRP
  public static boolean export_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TEXPORT, TNAME, TRP);
    exit_section_(b, m, EXPORT_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // instruction*
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP plain_instruction folded_instruction* TRP
  //                     |   TLP TBLOCK TID? result? instruction* TRP
  //                     |   TLP TLOOP TID? result? instruction* TRP
  //                     |   TLP TIF TID? result? folded_instruction* TLP TTHEN instruction*  TRP else_clause_folded? TRP
  static boolean folded_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = folded_instruction_0(b, l + 1);
    if (!r) r = folded_instruction_1(b, l + 1);
    if (!r) r = folded_instruction_2(b, l + 1);
    if (!r) r = folded_instruction_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TLP plain_instruction folded_instruction* TRP
  private static boolean folded_instruction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && plain_instruction(b, l + 1);
    r = r && folded_instruction_0_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // folded_instruction*
  private static boolean folded_instruction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!folded_instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_0_2", c)) break;
    }
    return true;
  }

  // TLP TBLOCK TID? result? instruction* TRP
  private static boolean folded_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TBLOCK);
    r = r && folded_instruction_1_2(b, l + 1);
    r = r && folded_instruction_1_3(b, l + 1);
    r = r && folded_instruction_1_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean folded_instruction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_3")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean folded_instruction_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_1_4", c)) break;
    }
    return true;
  }

  // TLP TLOOP TID? result? instruction* TRP
  private static boolean folded_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOOP);
    r = r && folded_instruction_2_2(b, l + 1);
    r = r && folded_instruction_2_3(b, l + 1);
    r = r && folded_instruction_2_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean folded_instruction_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_3")) return false;
    result(b, l + 1);
    return true;
  }

  // instruction*
  private static boolean folded_instruction_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_2_4", c)) break;
    }
    return true;
  }

  // TLP TIF TID? result? folded_instruction* TLP TTHEN instruction*  TRP else_clause_folded? TRP
  private static boolean folded_instruction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIF);
    r = r && folded_instruction_3_2(b, l + 1);
    r = r && folded_instruction_3_3(b, l + 1);
    r = r && folded_instruction_3_4(b, l + 1);
    r = r && consumeTokens(b, 0, TLP, TTHEN);
    r = r && folded_instruction_3_7(b, l + 1);
    r = r && consumeToken(b, TRP);
    r = r && folded_instruction_3_9(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean folded_instruction_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // result?
  private static boolean folded_instruction_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_3")) return false;
    result(b, l + 1);
    return true;
  }

  // folded_instruction*
  private static boolean folded_instruction_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!folded_instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_3_4", c)) break;
    }
    return true;
  }

  // instruction*
  private static boolean folded_instruction_3_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "folded_instruction_3_7", c)) break;
    }
    return true;
  }

  // else_clause_folded?
  private static boolean folded_instruction_3_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "folded_instruction_3_9")) return false;
    else_clause_folded(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TLP TFUNC TID? export_short* type_use local* instruction* TRP
  //         | TLP TFUNC TID? export_short* import_short* type_use TRP
  public static boolean func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_0(b, l + 1);
    if (!r) r = func_1(b, l + 1);
    exit_section_(b, m, FUNC, r);
    return r;
  }

  // TLP TFUNC TID? export_short* type_use local* instruction* TRP
  private static boolean func_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && func_0_2(b, l + 1);
    r = r && func_0_3(b, l + 1);
    r = r && type_use(b, l + 1);
    r = r && func_0_5(b, l + 1);
    r = r && func_0_6(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean func_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // export_short*
  private static boolean func_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!export_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_0_3", c)) break;
    }
    return true;
  }

  // local*
  private static boolean func_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!local(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_0_5", c)) break;
    }
    return true;
  }

  // instruction*
  private static boolean func_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!instruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_0_6", c)) break;
    }
    return true;
  }

  // TLP TFUNC TID? export_short* import_short* type_use TRP
  private static boolean func_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && func_1_2(b, l + 1);
    r = r && func_1_3(b, l + 1);
    r = r && func_1_4(b, l + 1);
    r = r && type_use(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean func_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // export_short*
  private static boolean func_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!export_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_1_3", c)) break;
    }
    return true;
  }

  // import_short*
  private static boolean func_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_1_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TFUNC param_list* result* TRP
  public static boolean func_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && func_type_2(b, l + 1);
    r = r && func_type_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, FUNC_TYPE, r);
    return r;
  }

  // param_list*
  private static boolean func_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!param_list(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_type_2", c)) break;
    }
    return true;
  }

  // result*
  private static boolean func_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!result(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_type_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TGLOBAL TID? global_type   expression  TRP
  //         | TLP TGLOBAL TID? import_short global_type TRP
  //         | TLP TGLOBAL TID? export_short+ import_short* TRP
  public static boolean global(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_0(b, l + 1);
    if (!r) r = global_1(b, l + 1);
    if (!r) r = global_2(b, l + 1);
    exit_section_(b, m, GLOBAL, r);
    return r;
  }

  // TLP TGLOBAL TID? global_type   expression  TRP
  private static boolean global_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_0_2(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean global_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TGLOBAL TID? import_short global_type TRP
  private static boolean global_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_1_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean global_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TGLOBAL TID? export_short+ import_short* TRP
  private static boolean global_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_2_2(b, l + 1);
    r = r && global_2_3(b, l + 1);
    r = r && global_2_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean global_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // export_short+
  private static boolean global_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = export_short(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!export_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_2_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // import_short*
  private static boolean global_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_2_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // value_type | TLP TMUT value_type TRP
  public static boolean global_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_TYPE, "<global type>");
    r = value_type(b, l + 1);
    if (!r) r = global_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TLP TMUT value_type TRP
  private static boolean global_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMUT);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TINT|TID
  public static boolean idx(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idx")) return false;
    if (!nextTokenIs(b, "<idx>", TID, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDX, "<idx>");
    r = consumeToken(b, TINT);
    if (!r) r = consumeToken(b, TID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TLP TIMPORT TNAME TNAME import_desc TRP
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIMPORT, TNAME, TNAME);
    r = r && import_desc(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TFUNC TID? type_use TRP
  //             | TLP TTABLE TID? table_type TRP
  //             | TLP TMEMORY TID? memory_type TRP
  //             | TLP TGLOBAL TID? global_type TRP
  public static boolean import_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_desc_0(b, l + 1);
    if (!r) r = import_desc_1(b, l + 1);
    if (!r) r = import_desc_2(b, l + 1);
    if (!r) r = import_desc_3(b, l + 1);
    exit_section_(b, m, IMPORT_DESC, r);
    return r;
  }

  // TLP TFUNC TID? type_use TRP
  private static boolean import_desc_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TFUNC);
    r = r && import_desc_0_2(b, l + 1);
    r = r && type_use(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean import_desc_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TTABLE TID? table_type TRP
  private static boolean import_desc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && import_desc_1_2(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean import_desc_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TMEMORY TID? memory_type TRP
  private static boolean import_desc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && import_desc_2_2(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean import_desc_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TGLOBAL TID? global_type TRP
  private static boolean import_desc_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && import_desc_3_2(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean import_desc_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // TLP TIMPORT TNAME TNAME TRP
  public static boolean import_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TIMPORT, TNAME, TNAME, TRP);
    exit_section_(b, m, IMPORT_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // block_instruction | plain_instruction | folded_instruction
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION, "<instruction>");
    r = block_instruction(b, l + 1);
    if (!r) r = plain_instruction(b, l + 1);
    if (!r) r = folded_instruction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TINT TINT?
  public static boolean limits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limits")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TINT);
    r = r && limits_1(b, l + 1);
    exit_section_(b, m, LIMITS, r);
    return r;
  }

  // TINT?
  private static boolean limits_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limits_1")) return false;
    consumeToken(b, TINT);
    return true;
  }

  /* ********************************************************** */
  // TLP TLOCAL  TID? value_type TRP
  //         | TLP TLOCAL value_type* TRP
  public static boolean local(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_0(b, l + 1);
    if (!r) r = local_1(b, l + 1);
    exit_section_(b, m, LOCAL, r);
    return r;
  }

  // TLP TLOCAL  TID? value_type TRP
  private static boolean local_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOCAL);
    r = r && local_0_2(b, l + 1);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean local_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TLOCAL value_type* TRP
  private static boolean local_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TLOCAL);
    r = r && local_1_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_type*
  private static boolean local_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "local_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // offset_arg? align_arg?
  public static boolean mem_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEM_ARG, "<mem arg>");
    r = mem_arg_0(b, l + 1);
    r = r && mem_arg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // offset_arg?
  private static boolean mem_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg_0")) return false;
    offset_arg(b, l + 1);
    return true;
  }

  // align_arg?
  private static boolean mem_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mem_arg_1")) return false;
    align_arg(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TLP TMEMORY TID? data_short TRP
  //         | TLP TMEMORY TID? export_short* import_short* memory_type TRP
  public static boolean memory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memory_0(b, l + 1);
    if (!r) r = memory_1(b, l + 1);
    exit_section_(b, m, MEMORY, r);
    return r;
  }

  // TLP TMEMORY TID? data_short TRP
  private static boolean memory_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_0_2(b, l + 1);
    r = r && data_short(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean memory_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TMEMORY TID? export_short* import_short* memory_type TRP
  private static boolean memory_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_1_2(b, l + 1);
    r = r && memory_1_3(b, l + 1);
    r = r && memory_1_4(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean memory_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // export_short*
  private static boolean memory_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!export_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "memory_1_3", c)) break;
    }
    return true;
  }

  // import_short*
  private static boolean memory_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "memory_1_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // limits
  public static boolean memory_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_type")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    exit_section_(b, m, MEMORY_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TMODULE TID? module_field* TRP| module_field*
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    if (!r) r = module_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TLP TMODULE TID? module_field* TRP
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMODULE);
    r = r && module_0_2(b, l + 1);
    r = r && module_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean module_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // module_field*
  private static boolean module_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_0_3", c)) break;
    }
    return true;
  }

  // module_field*
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type
  //                              | import
  //                              | table
  //                              | memory
  //                              | global
  //                              | export
  //                              | element
  //                              | data
  //                              | start
  //                              | func
  static boolean module_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_field")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = import_$(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = memory(b, l + 1);
    if (!r) r = global(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = element(b, l + 1);
    if (!r) r = data(b, l + 1);
    if (!r) r = start(b, l + 1);
    if (!r) r = func(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TFLOAT | TINT
  public static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    if (!nextTokenIs(b, "<num>", TFLOAT, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUM, "<num>");
    r = consumeToken(b, TFLOAT);
    if (!r) r = consumeToken(b, TINT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TLP TOFFSET? expression TRP | expression
  public static boolean offset_abbrv(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_abbrv")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OFFSET_ABBRV, "<offset abbrv>");
    r = offset_abbrv_0(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TLP TOFFSET? expression TRP
  private static boolean offset_abbrv_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_abbrv_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TLP);
    r = r && offset_abbrv_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TOFFSET?
  private static boolean offset_abbrv_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_abbrv_0_1")) return false;
    consumeToken(b, TOFFSET);
    return true;
  }

  /* ********************************************************** */
  // TOFFSET  TEQUAL TINT
  public static boolean offset_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "offset_arg")) return false;
    if (!nextTokenIs(b, TOFFSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TOFFSET, TEQUAL, TINT);
    exit_section_(b, m, OFFSET_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TPARAM value_type* TRP
  public static boolean param_abbreviated(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_abbreviated")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TPARAM);
    r = r && param_abbreviated_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, PARAM_ABBREVIATED, r);
    return r;
  }

  // value_type*
  private static boolean param_abbreviated_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_abbreviated_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_abbreviated_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TPARAM TID? value_type TRP
  public static boolean param_explicit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_explicit")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TPARAM);
    r = r && param_explicit_2(b, l + 1);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, PARAM_EXPLICIT, r);
    return r;
  }

  // TID?
  private static boolean param_explicit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_explicit_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // param_abbreviated
  //               |param_explicit
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_abbreviated(b, l + 1);
    if (!r) r = param_explicit(b, l + 1);
    exit_section_(b, m, PARAM_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // TUNREACHABLE
  //                     |  TNOP
  //                     |   TBR idx
  //                     |   TBR_IF idx
  //                     |   TBR_TABLE idx+
  //                     |   TRETURN 
  //                     |   TCALL idx
  //                     |   TCALL_INDIRECT type_use // TODO(dherre3): Verify that not identifier is bound to the parameters.
  //                     // Parametric Instructions
  //                     |   TDROP
  //                     |   TSELECT
  //                     |   TGET_LOCAL idx
  //                     |   TSET_LOCAL idx
  //                     |   TGET_GLOBAL idx
  //                     |   TSET_GLOBAL idx
  //                     |   TTEE_GLOBAL idx
  //                     // Memory Instructions
  //                     |   TI32 TDOT TLOAD mem_arg
  //                     |   TI64 TDOT TLOAD mem_arg
  //                     |   TF32 TDOT TLOAD mem_arg
  //                     |   TF64 TDOT TLOAD mem_arg
  //                     |   TI32 TDOT TLOAD8_S mem_arg
  //                     |   TI32 TDOT TLOAD8_U mem_arg
  //                     |   TI32 TDOT TLOAD16_S mem_arg
  //                     |   TI32 TDOT TLOAD16_U mem_arg
  //                     |   TI64 TDOT TLOAD8_S mem_arg
  //                     |   TI64 TDOT TLOAD8_U mem_arg
  //                     |   TI64 TDOT TLOAD16_S mem_arg
  //                     |   TI64 TDOT TLOAD16_U mem_arg
  //                     |   TI64 TDOT TLOAD32_S mem_arg
  //                     |   TI64 TDOT TLOAD32_U mem_arg
  //                     |   TI32 TDOT TSTORE mem_arg
  //                     |   TI64 TDOT TSTORE mem_arg
  //                     |   TF32 TDOT TSTORE mem_arg
  //                     |   TF64 TDOT TSTORE mem_arg
  //                     |   TI32 TDOT TSTORE8 mem_arg
  //                     |   TI32 TDOT TSTORE16 mem_arg
  //                     |   TI64 TDOT TSTORE8 mem_arg
  //                     |   TI64 TDOT TSTORE16 mem_arg
  //                     |   TI64 TDOT TSTORE32 mem_arg
  //                     |   TSIZE
  //                     |   TGROW
  //                     //      Numeric instructions
  //                     // const
  //                     |   TI32 TDOT TCONST TINT
  //                     |   TI64 TDOT TCONST TINT
  //                     |   TF32 TDOT TCONST num
  //                     |   TF64 TDOT TCONST num
  //                     // i32 ops
  //                     |   TI32 TDOT TCLZ
  //                     |   TI32 TDOT TCTZ
  //                     |   TI32 TDOT TPOPCNT
  //                     |   TI32 TDOT TADD
  //                     |   TI32 TDOT TMUL
  //                     |   TI32 TDOT TSUB
  //                     |   TI32 TDOT TDIV_S
  //                     |   TI32 TDOT TDIV_U
  //                     |   TI32 TDOT TREM_S
  //                     |   TI32 TDOT TREM_U
  //                     |   TI32 TDOT TAND
  //                     |   TI32 TDOT TOR
  //                     |   TI32 TDOT TXOR
  //                     |   TI32 TDOT TSHL
  //                     |   TI32 TDOT TSHR_S
  //                     |   TI32 TDOT TSHR_U
  //                     |   TI32 TDOT TROTL
  //                     |   TI32 TDOT TROTR
  //                     // i64 ops
  //                     |   TI64 TDOT TCLZ
  //                     |   TI64 TDOT TCTZ
  //                     |   TI64 TDOT TPOPCNT
  //                     |   TI64 TDOT TADD
  //                     |   TI64 TDOT TMUL
  //                     |   TI64 TDOT TSUB
  //                     |   TI64 TDOT TDIV_S
  //                     |   TI64 TDOT TDIV_U
  //                     |   TI64 TDOT TREM_S
  //                     |   TI64 TDOT TREM_U
  //                     |   TI64 TDOT TAND
  //                     |   TI64 TDOT TOR
  //                     |   TI64 TDOT TXOR
  //                     |   TI64 TDOT TSHL
  //                     |   TI64 TDOT TSHR_S
  //                     |   TI64 TDOT TSHR_U
  //                     |   TI64 TDOT TROTL
  //                     |   TI64 TDOT TROTR
  //                     // f32 opts
  //                     |   TF32 TDOT TABS
  //                     |   TF32 TDOT TNEG
  //                     |   TF32 TDOT TCEIL
  //                     |   TF32 TDOT TFLOOR
  //                     |   TF32 TDOT TTRUNC
  //                     |   TF32 TDOT TNEAREST
  //                     |   TF32 TDOT TSQRT
  //                     |   TF32 TDOT TADD
  //                     |   TF32 TDOT TSUB
  //                     |   TF32 TDOT TMUL
  //                     |   TF32 TDOT TDIV
  //                     |   TF32 TDOT TMIN
  //                     |   TF32 TDOT TMAX
  //                     |   TF32 TDOT TCOPYSIGN
  //                     // f64.opts
  //                     |   TF64 TDOT TABS
  //                     |   TF64 TDOT TNEG
  //                     |   TF64 TDOT TCEIL
  //                     |   TF64 TDOT TFLOOR
  //                     |   TF64 TDOT TTRUNC
  //                     |   TF64 TDOT TNEAREST
  //                     |   TF64 TDOT TSQRT
  //                     |   TF64 TDOT TADD
  //                     |   TF64 TDOT TSUB
  //                     |   TF64 TDOT TMUL
  //                     |   TF64 TDOT TDIV
  //                     |   TF64 TDOT TMIN
  //                     |   TF64 TDOT TMAX
  //                     |   TF64 TDOT TCOPYSIGN
  //                     //
  //                     |   TI32 TDOT  TEQZ
  //                     |   TI32 TDOT TEQ
  //                     |   TI32 TDOT TNE
  //                     |   TI32 TDOT TLT_S
  //                     |   TI32 TDOT TLT_U
  //                     |   TI32 TDOT TGT_S
  //                     |   TI32 TDOT TGT_U
  //                     |   TI32 TDOT TLE_S
  //                     |   TI32 TDOT TLE_U
  //                     |   TI32 TDOT TGE_S
  //                     |   TI32 TDOT TGE_U
  //                     //
  //                     |   TI64 TDOT  TEQZ
  //                     |   TI64 TDOT TEQ
  //                     |   TI64 TDOT TNE
  //                     |   TI64 TDOT TLT_S
  //                     |   TI64 TDOT TLT_U
  //                     |   TI64 TDOT TGT_S
  //                     |   TI64 TDOT TGT_U
  //                     |   TI64 TDOT TLE_U
  //                     |   TI64 TDOT TLE_S
  //                     |   TI64 TDOT TGE_S
  //                     |   TI64 TDOT TGE_U
  //                     //
  //                     |   TF32 TDOT TEQ
  //                     |   TF32 TDOT TNE
  //                     |   TF32 TDOT TLT
  //                     |   TF32 TDOT TGT
  //                     |   TF32 TDOT TLE
  //                     |   TF32 TDOT TGE
  //                     //
  //                     |   TF64 TDOT TEQ
  //                     |   TF64 TDOT TNE
  //                     |   TF64 TDOT TLT
  //                     |   TF64 TDOT TGT
  //                     |   TF64 TDOT TLE
  //                     |   TF64 TDOT TGE
  //                     //
  //                     |   TI32 TDOT TWRAP_I64
  //                     |   TI32 TDOT TTRUNC_S_F32
  //                     |   TI32 TDOT TTRUNC_U_F32
  //                     |   TI32 TDOT TTRUNC_S_F64
  //                     |   TI32 TDOT TTRUNC_U_F64
  //                     |   TI32 TDOT TTRUNC_SAT_F32_U
  //                     |   TI32 TDOT TTRUNC_SAT_F32_S
  //                     |   TI32 TDOT TTRUNC_SAT_F64_U
  //                     |   TI32 TDOT TTRUNC_SAT_F64_S
  //                     |   TI32 TDOT TEXTEND8_S
  //                     |   TI32 TDOT TEXTEND16_S
  //                     |   TI64 TDOT TEXTEND_S_I32
  //                     |   TI64 TDOT TEXTEND_U_I32
  //                     |   TI64 TDOT TEXTEND8_S
  //                     |   TI64 TDOT TEXTEND16_S
  //                     |   TI64 TDOT TEXTEND32_S
  //                     |   TI64 TDOT TTRUNC_S_F32
  //                     |   TI64 TDOT TTRUNC_U_F32
  //                     |   TI64 TDOT TTRUNC_S_F64
  //                     |   TI64 TDOT TTRUNC_U_F64
  //                     |   TI64 TDOT TTRUNC_SAT_F32_U
  //                     |   TI64 TDOT TTRUNC_SAT_F32_S
  //                     |   TI64 TDOT TTRUNC_SAT_F64_U
  //                     |   TI64 TDOT TTRUNC_SAT_F64_S
  //                     |   TF32 TDOT TCONVERT_S_I32
  //                     |   TF32 TDOT TCONVERT_U_I32
  //                     |   TF32 TDOT TCONVERT_S_I64
  //                     |   TF32 TDOT TCONVERT_U_I64
  //                     |   TF32 TDOT TDEMOTE_F64
  //                     |   TF64 TDOT TCONVERT_S_I32
  //                     |   TF64 TDOT TCONVERT_U_I32
  //                     |   TF64 TDOT TCONVERT_S_I64
  //                     |   TF64 TDOT TCONVERT_U_I64
  //                     |   TF64 TDOT TPROMOTE_F32
  //                     |   TI32 TDOT TREINTERPRET_F32
  //                     |   TI64 TDOT TREINTERPRET_F64
  //                     |   TF32 TDOT TREINTERPRET_I32
  //                     |   TF64 TDOT TREINTERPRET_I64
  // BLOCK_COMMENT | LINE_COMMENT
  static boolean plain_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TUNREACHABLE);
    if (!r) r = consumeToken(b, TNOP);
    if (!r) r = plain_instruction_2(b, l + 1);
    if (!r) r = plain_instruction_3(b, l + 1);
    if (!r) r = plain_instruction_4(b, l + 1);
    if (!r) r = consumeToken(b, TRETURN);
    if (!r) r = plain_instruction_6(b, l + 1);
    if (!r) r = plain_instruction_7(b, l + 1);
    if (!r) r = consumeToken(b, TDROP);
    if (!r) r = consumeToken(b, TSELECT);
    if (!r) r = plain_instruction_10(b, l + 1);
    if (!r) r = plain_instruction_11(b, l + 1);
    if (!r) r = plain_instruction_12(b, l + 1);
    if (!r) r = plain_instruction_13(b, l + 1);
    if (!r) r = plain_instruction_14(b, l + 1);
    if (!r) r = plain_instruction_15(b, l + 1);
    if (!r) r = plain_instruction_16(b, l + 1);
    if (!r) r = plain_instruction_17(b, l + 1);
    if (!r) r = plain_instruction_18(b, l + 1);
    if (!r) r = plain_instruction_19(b, l + 1);
    if (!r) r = plain_instruction_20(b, l + 1);
    if (!r) r = plain_instruction_21(b, l + 1);
    if (!r) r = plain_instruction_22(b, l + 1);
    if (!r) r = plain_instruction_23(b, l + 1);
    if (!r) r = plain_instruction_24(b, l + 1);
    if (!r) r = plain_instruction_25(b, l + 1);
    if (!r) r = plain_instruction_26(b, l + 1);
    if (!r) r = plain_instruction_27(b, l + 1);
    if (!r) r = plain_instruction_28(b, l + 1);
    if (!r) r = plain_instruction_29(b, l + 1);
    if (!r) r = plain_instruction_30(b, l + 1);
    if (!r) r = plain_instruction_31(b, l + 1);
    if (!r) r = plain_instruction_32(b, l + 1);
    if (!r) r = plain_instruction_33(b, l + 1);
    if (!r) r = plain_instruction_34(b, l + 1);
    if (!r) r = plain_instruction_35(b, l + 1);
    if (!r) r = plain_instruction_36(b, l + 1);
    if (!r) r = plain_instruction_37(b, l + 1);
    if (!r) r = consumeToken(b, TSIZE);
    if (!r) r = consumeToken(b, TGROW);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCONST, TINT);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCONST, TINT);
    if (!r) r = plain_instruction_42(b, l + 1);
    if (!r) r = plain_instruction_43(b, l + 1);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCLZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TCTZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TPOPCNT);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TDIV_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TDIV_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREM_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREM_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TAND);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TOR);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TXOR);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHR_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TSHR_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TROTL);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TROTR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCLZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TCTZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TPOPCNT);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TDIV_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TDIV_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREM_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREM_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TAND);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TOR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TXOR);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHR_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TSHR_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TROTL);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TROTR);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TABS);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNEG);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCEIL);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TFLOOR);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TTRUNC);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNEAREST);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TSQRT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TDIV);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMIN);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TMAX);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCOPYSIGN);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TABS);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNEG);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCEIL);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TFLOOR);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TTRUNC);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNEAREST);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TSQRT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TADD);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TSUB);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMUL);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TDIV);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMIN);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TMAX);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCOPYSIGN);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEQZ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLT_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLT_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGT_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGT_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLE_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TLE_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGE_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TGE_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEQZ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLT_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLT_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGT_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGT_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLE_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TLE_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGE_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TGE_U);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TLT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TGT);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TLE);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TGE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TEQ);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TNE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TLT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TGT);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TLE);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TGE);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TWRAP_I64);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_S_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_U_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_S_F64);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_U_F64);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_SAT_F32_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_SAT_F32_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_SAT_F64_U);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TTRUNC_SAT_F64_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEXTEND8_S);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TEXTEND16_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND_S_I32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND_U_I32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND8_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND16_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TEXTEND32_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_S_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_U_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_S_F64);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_U_F64);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_SAT_F32_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_SAT_F32_S);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_SAT_F64_U);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TTRUNC_SAT_F64_S);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_S_I32);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_U_I32);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_S_I64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TCONVERT_U_I64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TDEMOTE_F64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_S_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_U_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_S_I64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TCONVERT_U_I64);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TPROMOTE_F32);
    if (!r) r = parseTokens(b, 0, TI32, TDOT, TREINTERPRET_F32);
    if (!r) r = parseTokens(b, 0, TI64, TDOT, TREINTERPRET_F64);
    if (!r) r = parseTokens(b, 0, TF32, TDOT, TREINTERPRET_I32);
    if (!r) r = parseTokens(b, 0, TF64, TDOT, TREINTERPRET_I64, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TBR idx
  private static boolean plain_instruction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TBR_IF idx
  private static boolean plain_instruction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR_IF);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TBR_TABLE idx+
  private static boolean plain_instruction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TBR_TABLE);
    r = r && plain_instruction_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // idx+
  private static boolean plain_instruction_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idx(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!idx(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plain_instruction_4_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TCALL idx
  private static boolean plain_instruction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TCALL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TCALL_INDIRECT type_use
  private static boolean plain_instruction_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TCALL_INDIRECT);
    r = r && type_use(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TGET_LOCAL idx
  private static boolean plain_instruction_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TGET_LOCAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TSET_LOCAL idx
  private static boolean plain_instruction_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TSET_LOCAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TGET_GLOBAL idx
  private static boolean plain_instruction_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TGET_GLOBAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TSET_GLOBAL idx
  private static boolean plain_instruction_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TSET_GLOBAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TTEE_GLOBAL idx
  private static boolean plain_instruction_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TTEE_GLOBAL);
    r = r && idx(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TLOAD mem_arg
  private static boolean plain_instruction_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD mem_arg
  private static boolean plain_instruction_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF32 TDOT TLOAD mem_arg
  private static boolean plain_instruction_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF64 TDOT TLOAD mem_arg
  private static boolean plain_instruction_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TLOAD);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TLOAD8_S mem_arg
  private static boolean plain_instruction_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD8_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TLOAD8_U mem_arg
  private static boolean plain_instruction_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD8_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TLOAD16_S mem_arg
  private static boolean plain_instruction_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_21")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD16_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TLOAD16_U mem_arg
  private static boolean plain_instruction_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_22")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TLOAD16_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD8_S mem_arg
  private static boolean plain_instruction_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_23")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD8_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD8_U mem_arg
  private static boolean plain_instruction_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_24")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD8_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD16_S mem_arg
  private static boolean plain_instruction_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_25")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD16_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD16_U mem_arg
  private static boolean plain_instruction_26(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_26")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD16_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD32_S mem_arg
  private static boolean plain_instruction_27(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_27")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD32_S);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TLOAD32_U mem_arg
  private static boolean plain_instruction_28(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_28")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TLOAD32_U);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TSTORE mem_arg
  private static boolean plain_instruction_29(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_29")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TSTORE mem_arg
  private static boolean plain_instruction_30(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_30")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF32 TDOT TSTORE mem_arg
  private static boolean plain_instruction_31(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_31")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF64 TDOT TSTORE mem_arg
  private static boolean plain_instruction_32(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_32")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TSTORE);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TSTORE8 mem_arg
  private static boolean plain_instruction_33(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_33")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE8);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI32 TDOT TSTORE16 mem_arg
  private static boolean plain_instruction_34(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_34")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI32, TDOT, TSTORE16);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TSTORE8 mem_arg
  private static boolean plain_instruction_35(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_35")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE8);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TSTORE16 mem_arg
  private static boolean plain_instruction_36(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_36")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE16);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TI64 TDOT TSTORE32 mem_arg
  private static boolean plain_instruction_37(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_37")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TI64, TDOT, TSTORE32);
    r = r && mem_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF32 TDOT TCONST num
  private static boolean plain_instruction_42(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_42")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF32, TDOT, TCONST);
    r = r && num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TF64 TDOT TCONST num
  private static boolean plain_instruction_43(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plain_instruction_43")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TF64, TDOT, TCONST);
    r = r && num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TRESULT  value_type* TRP
  public static boolean result(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TRESULT);
    r = r && result_2(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, RESULT, r);
    return r;
  }

  // value_type*
  private static boolean result_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "result_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TLP TSTART idx TRP
  public static boolean start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "start")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TSTART);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, START, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TTABLE TID? table_type TRP
  //         | TLP TTABLE TID? elem_type elem_short TRP
  //         | TLP TTABLE TID? import_short table_type  TRP
  //         | TLP TTABLE TID? export_short+ import_short* table_type  TRP
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_0(b, l + 1);
    if (!r) r = table_1(b, l + 1);
    if (!r) r = table_2(b, l + 1);
    if (!r) r = table_3(b, l + 1);
    exit_section_(b, m, TABLE, r);
    return r;
  }

  // TLP TTABLE TID? table_type TRP
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_0_2(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean table_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TTABLE TID? elem_type elem_short TRP
  private static boolean table_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_1_2(b, l + 1);
    r = r && elem_type(b, l + 1);
    r = r && elem_short(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean table_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TTABLE TID? import_short table_type  TRP
  private static boolean table_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_2_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean table_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // TLP TTABLE TID? export_short+ import_short* table_type  TRP
  private static boolean table_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_3_2(b, l + 1);
    r = r && table_3_3(b, l + 1);
    r = r && table_3_4(b, l + 1);
    r = r && table_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // TID?
  private static boolean table_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // export_short+
  private static boolean table_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = export_short(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!export_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_3_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // import_short*
  private static boolean table_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_short(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_3_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // limits elem_type
  public static boolean table_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_type")) return false;
    if (!nextTokenIs(b, TINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    r = r && elem_type(b, l + 1);
    exit_section_(b, m, TABLE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // TLP TTYPE TID? func_type TRP
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTYPE);
    r = r && type_2(b, l + 1);
    r = r && func_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // TID?
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // TLP TTYPE idx TRP abbr_type_use
  //         |   abbr_type_use
  public static boolean type_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_USE, "<type use>");
    r = type_use_0(b, l + 1);
    if (!r) r = abbr_type_use(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TLP TTYPE idx TRP abbr_type_use
  private static boolean type_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTYPE);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    r = r && abbr_type_use(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TI32|TF64|TF32|TI64
  public static boolean value_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE, "<value type>");
    r = consumeToken(b, TI32);
    if (!r) r = consumeToken(b, TF64);
    if (!r) r = consumeToken(b, TF32);
    if (!r) r = consumeToken(b, TI64);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
