// This is a generated file. Not intended for manual editing.
package com.wasmplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.wasmplugin.psi.WasmTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
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
    if (t == COM) {
      r = com(b, 0);
    }
    else if (t == DATA) {
      r = data(b, 0);
    }
    else if (t == DATA_SHORT) {
      r = data_short(b, 0);
    }
    else if (t == ELEM_SHORT) {
      r = elem_short(b, 0);
    }
    else if (t == ELEM_TYPE) {
      r = elem_type(b, 0);
    }
    else if (t == ELEMENT) {
      r = element(b, 0);
    }
    else if (t == EXPORT) {
      r = export(b, 0);
    }
    else if (t == EXPORT_DESC) {
      r = export_desc(b, 0);
    }
    else if (t == EXPORT_SHORT) {
      r = export_short(b, 0);
    }
    else if (t == FUNC_TYPE) {
      r = func_type(b, 0);
    }
    else if (t == GLOBAL) {
      r = global(b, 0);
    }
    else if (t == GLOBAL_TYPE) {
      r = global_type(b, 0);
    }
    else if (t == IDX) {
      r = idx(b, 0);
    }
    else if (t == IMPORT) {
      r = import_$(b, 0);
    }
    else if (t == IMPORT_DESC) {
      r = import_desc(b, 0);
    }
    else if (t == IMPORT_SHORT) {
      r = import_short(b, 0);
    }
    else if (t == LIMITS) {
      r = limits(b, 0);
    }
    else if (t == MEMORY) {
      r = memory(b, 0);
    }
    else if (t == MEMORY_TYPE) {
      r = memory_type(b, 0);
    }
    else if (t == OFF) {
      r = off(b, 0);
    }
    else if (t == PARAM_EXPLICIT) {
      r = param_explicit(b, 0);
    }
    else if (t == PARAM_LIST) {
      r = param_list(b, 0);
    }
    else if (t == RESULT) {
      r = result(b, 0);
    }
    else if (t == RESULT_EXPLICIT) {
      r = result_explicit(b, 0);
    }
    else if (t == START) {
      r = start(b, 0);
    }
    else if (t == TABLE) {
      r = table(b, 0);
    }
    else if (t == TABLE_TYPE) {
      r = table_type(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_USE) {
      r = type_use(b, 0);
    }
    else if (t == VALUE_TYPE) {
      r = value_type(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // BLOCK_COMMENT | LINE_COMMENT
  public static boolean com(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "com")) return false;
    if (!nextTokenIs(b, "<com>", BLOCK_COMMENT, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COM, "<com>");
    r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tDATA idx? off tSTRING* tRP
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA);
    r = r && data_2(b, l + 1);
    r = r && off(b, l + 1);
    r = r && data_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, DATA, r);
    return r;
  }

  // idx?
  private static boolean data_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_2")) return false;
    idx(b, l + 1);
    return true;
  }

  // tSTRING*
  private static boolean data_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, TSTRING)) break;
      if (!empty_element_parsed_guard_(b, "data_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tLP tDATA tSTRING tRP
  public static boolean data_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_short")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TDATA, TSTRING, TRP);
    exit_section_(b, m, DATA_SHORT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tELEM idx* tRP
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
  // tANYFUNC
  public static boolean elem_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elem_type")) return false;
    if (!nextTokenIs(b, TANYFUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TANYFUNC);
    exit_section_(b, m, ELEM_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tELEM idx? tLP off tRP tRP
  public static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TELEM);
    r = r && element_2(b, l + 1);
    r = r && consumeToken(b, TLP);
    r = r && off(b, l + 1);
    r = r && consumeTokens(b, 0, TRP, TRP);
    exit_section_(b, m, ELEMENT, r);
    return r;
  }

  // idx?
  private static boolean element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_2")) return false;
    idx(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tEXPORT tNAME export_desc tRP
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
  // tLP (tFUNC|tMEMORY|tTABLE|tGLOBAL) idx tRP
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

  // tFUNC|tMEMORY|tTABLE|tGLOBAL
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
  // tLP tEXPORT tNAME tRP
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
  // tLP tFUNC param_list? result? tRP
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

  // param_list?
  private static boolean func_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_2")) return false;
    param_list(b, l + 1);
    return true;
  }

  // result?
  private static boolean func_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_type_3")) return false;
    result(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tLP tGLOBAL tID? global_type /*TODO: MISSING EXPRESSION*/ tRP
  //         | tLP tGLOBAL tID? import_short global_type tRP
  //         | tLP tGLOBAL tID? export_short (import_short|export_short)* tRP
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

  // tLP tGLOBAL tID? global_type /*TODO: MISSING EXPRESSION*/ tRP
  private static boolean global_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_0_2(b, l + 1);
    r = r && global_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean global_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? import_short global_type tRP
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

  // tID?
  private static boolean global_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? export_short (import_short|export_short)* tRP
  private static boolean global_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TGLOBAL);
    r = r && global_2_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && global_2_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean global_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // (import_short|export_short)*
  private static boolean global_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!global_2_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_2_4", c)) break;
    }
    return true;
  }

  // import_short|export_short
  private static boolean global_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_2_4_0")) return false;
    boolean r;
    r = import_short(b, l + 1);
    if (!r) r = export_short(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // value_type | tLP tMUT value_type tRP
  public static boolean global_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_TYPE, "<global type>");
    r = value_type(b, l + 1);
    if (!r) r = global_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tLP tMUT value_type tRP
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
  // tUINTEGER | tID
  public static boolean idx(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idx")) return false;
    if (!nextTokenIs(b, "<idx>", TID, TUINTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDX, "<idx>");
    r = consumeToken(b, TUINTEGER);
    if (!r) r = consumeToken(b, TID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tLP tIMPORT tNAME tNAME import_desc tRP
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
  // tLP tFUNC tID? type_use tRP
  //             | tLP tTABLE tID? table_type tRP
  //             | tLP tMEMORY tID? memory_type tRP
  //             | tLP tGLOBAL tID? global_type tRP
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

  // tLP tFUNC tID? type_use tRP
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

  // tID?
  private static boolean import_desc_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? table_type tRP
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

  // tID?
  private static boolean import_desc_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? memory_type tRP
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

  // tID?
  private static boolean import_desc_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tGLOBAL tID? global_type tRP
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

  // tID?
  private static boolean import_desc_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_desc_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tIMPORT tNAME tNAME tRP
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
  // tUINTEGER | tUINTEGER tUINTEGER
  public static boolean limits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limits")) return false;
    if (!nextTokenIs(b, TUINTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TUINTEGER);
    if (!r) r = parseTokens(b, 0, TUINTEGER, TUINTEGER);
    exit_section_(b, m, LIMITS, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tMEMORY tID? memory_type tRP
  //         | tLP tMEMORY tID? data_short tRP
  //         | tLP tMEMORY tID? import_short memory_type tRP
  //         | tLP tMEMORY tID? export_short (data_short|export_short|import_short)* tRP
  public static boolean memory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memory_0(b, l + 1);
    if (!r) r = memory_1(b, l + 1);
    if (!r) r = memory_2(b, l + 1);
    if (!r) r = memory_3(b, l + 1);
    exit_section_(b, m, MEMORY, r);
    return r;
  }

  // tLP tMEMORY tID? memory_type tRP
  private static boolean memory_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_0_2(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? data_short tRP
  private static boolean memory_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_1_2(b, l + 1);
    r = r && data_short(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? import_short memory_type tRP
  private static boolean memory_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_2_2(b, l + 1);
    r = r && import_short(b, l + 1);
    r = r && memory_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tMEMORY tID? export_short (data_short|export_short|import_short)* tRP
  private static boolean memory_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TMEMORY);
    r = r && memory_3_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && memory_3_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean memory_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // (data_short|export_short|import_short)*
  private static boolean memory_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!memory_3_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "memory_3_4", c)) break;
    }
    return true;
  }

  // data_short|export_short|import_short
  private static boolean memory_3_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_3_4_0")) return false;
    boolean r;
    r = data_short(b, l + 1);
    if (!r) r = export_short(b, l + 1);
    if (!r) r = import_short(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // limits
  public static boolean memory_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_type")) return false;
    if (!nextTokenIs(b, TUINTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    exit_section_(b, m, MEMORY_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tMODULE tID? top_declaration* tRP | /*empty*/
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    if (!r) r = consumeToken(b, MODULE_1_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // tLP tMODULE tID? top_declaration* tRP
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

  // tID?
  private static boolean module_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // top_declaration*
  private static boolean module_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tOFFSET
  public static boolean off(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "off")) return false;
    if (!nextTokenIs(b, TOFFSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TOFFSET);
    exit_section_(b, m, OFF, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tPARAM tID? value_type tRP
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

  // tID?
  private static boolean param_explicit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_explicit_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tPARAM value_type value_type+ tRP
  //               |param_explicit+
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_list_0(b, l + 1);
    if (!r) r = param_list_1(b, l + 1);
    exit_section_(b, m, PARAM_LIST, r);
    return r;
  }

  // tLP tPARAM value_type value_type+ tRP
  private static boolean param_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TPARAM);
    r = r && value_type(b, l + 1);
    r = r && param_list_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_type+
  private static boolean param_list_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_type(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_list_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // param_explicit+
  private static boolean param_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_explicit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!param_explicit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "param_list_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tRESULT  value_type value_type+ tRP
  //         | result_explicit+
  public static boolean result(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = result_0(b, l + 1);
    if (!r) r = result_1(b, l + 1);
    exit_section_(b, m, RESULT, r);
    return r;
  }

  // tLP tRESULT  value_type value_type+ tRP
  private static boolean result_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TRESULT);
    r = r && value_type(b, l + 1);
    r = r && result_0_3(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // value_type+
  private static boolean result_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_type(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!value_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "result_0_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // result_explicit+
  private static boolean result_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = result_explicit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!result_explicit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "result_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tRESULT value_type tRP
  public static boolean result_explicit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_explicit")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TRESULT);
    r = r && value_type(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, RESULT_EXPLICIT, r);
    return r;
  }

  /* ********************************************************** */
  // tLP tSTART idx tRP
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
  // tLP tTABLE tID? table_type tRP
  //         | tLP tTABLE tID? elem_type elem_short
  //         | tLP tTABLE tID? import_short table_type tRP
  //         | tLP tTABLE tID? export_short (export_short|import_short|elem_short)* tRP
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

  // tLP tTABLE tID? table_type tRP
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

  // tID?
  private static boolean table_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? elem_type elem_short
  private static boolean table_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_1_2(b, l + 1);
    r = r && elem_type(b, l + 1);
    r = r && elem_short(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_1_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? import_short table_type tRP
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

  // tID?
  private static boolean table_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // tLP tTABLE tID? export_short (export_short|import_short|elem_short)* tRP
  private static boolean table_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTABLE);
    r = r && table_3_2(b, l + 1);
    r = r && export_short(b, l + 1);
    r = r && table_3_4(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  // tID?
  private static boolean table_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  // (export_short|import_short|elem_short)*
  private static boolean table_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!table_3_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_3_4", c)) break;
    }
    return true;
  }

  // export_short|import_short|elem_short
  private static boolean table_3_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_3_4_0")) return false;
    boolean r;
    r = export_short(b, l + 1);
    if (!r) r = import_short(b, l + 1);
    if (!r) r = elem_short(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // limits elem_type
  public static boolean table_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_type")) return false;
    if (!nextTokenIs(b, TUINTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = limits(b, l + 1);
    r = r && elem_type(b, l + 1);
    exit_section_(b, m, TABLE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // type
  //                             | import
  //                             | table
  //                             | memory
  //                             | global
  //                             | start
  //                             | export
  //                             | element
  //                             | data
  static boolean top_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_declaration")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = import_$(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = memory(b, l + 1);
    if (!r) r = global(b, l + 1);
    if (!r) r = start(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = element(b, l + 1);
    if (!r) r = data(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // tLP tTYPE tID? func_type tRP
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

  // tID?
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    consumeToken(b, TID);
    return true;
  }

  /* ********************************************************** */
  // tLP tTYPE idx tRP | func_type
  public static boolean type_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use")) return false;
    if (!nextTokenIs(b, TLP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_use_0(b, l + 1);
    if (!r) r = func_type(b, l + 1);
    exit_section_(b, m, TYPE_USE, r);
    return r;
  }

  // tLP tTYPE idx tRP
  private static boolean type_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TLP, TTYPE);
    r = r && idx(b, l + 1);
    r = r && consumeToken(b, TRP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tI32|tF64|tF32|tI64
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
