// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wasmplugin.psi.impl.*;

public interface WasmTypes {

  IElementType ABBR_TYPE_USE = new WasmElementType("ABBR_TYPE_USE");
  IElementType ALIGN_ARG = new WasmElementType("ALIGN_ARG");
  IElementType DATA = new WasmElementType("DATA");
  IElementType DATA_SHORT = new WasmElementType("DATA_SHORT");
  IElementType ELEMENT = new WasmElementType("ELEMENT");
  IElementType ELEM_SHORT = new WasmElementType("ELEM_SHORT");
  IElementType ELEM_TYPE = new WasmElementType("ELEM_TYPE");
  IElementType EXPORT = new WasmElementType("EXPORT");
  IElementType EXPORT_DESC = new WasmElementType("EXPORT_DESC");
  IElementType EXPORT_SHORT = new WasmElementType("EXPORT_SHORT");
  IElementType FUNC = new WasmElementType("FUNC");
  IElementType FUNC_TYPE = new WasmElementType("FUNC_TYPE");
  IElementType GLOBAL = new WasmElementType("GLOBAL");
  IElementType GLOBAL_TYPE = new WasmElementType("GLOBAL_TYPE");
  IElementType IDX = new WasmElementType("IDX");
  IElementType IMPORT = new WasmElementType("IMPORT");
  IElementType IMPORT_DESC = new WasmElementType("IMPORT_DESC");
  IElementType IMPORT_SHORT = new WasmElementType("IMPORT_SHORT");
  IElementType INSTRUCTION = new WasmElementType("INSTRUCTION");
  IElementType LIMITS = new WasmElementType("LIMITS");
  IElementType LOCAL = new WasmElementType("LOCAL");
  IElementType MEMORY = new WasmElementType("MEMORY");
  IElementType MEMORY_TYPE = new WasmElementType("MEMORY_TYPE");
  IElementType MEM_ARG = new WasmElementType("MEM_ARG");
  IElementType NUM = new WasmElementType("NUM");
  IElementType OFFSET_ABBRV = new WasmElementType("OFFSET_ABBRV");
  IElementType OFFSET_ARG = new WasmElementType("OFFSET_ARG");
  IElementType PARAM_ABBREVIATED = new WasmElementType("PARAM_ABBREVIATED");
  IElementType PARAM_EXPLICIT = new WasmElementType("PARAM_EXPLICIT");
  IElementType PARAM_LIST = new WasmElementType("PARAM_LIST");
  IElementType RESULT = new WasmElementType("RESULT");
  IElementType START = new WasmElementType("START");
  IElementType TABLE = new WasmElementType("TABLE");
  IElementType TABLE_TYPE = new WasmElementType("TABLE_TYPE");
  IElementType TYPE = new WasmElementType("TYPE");
  IElementType TYPE_USE = new WasmElementType("TYPE_USE");
  IElementType VALUE_TYPE = new WasmElementType("VALUE_TYPE");

  IElementType BLOCK_COMMENT = new WasmTokenType("BLOCK_COMMENT");
  IElementType LINE_COMMENT = new WasmTokenType("LINE_COMMENT");
  IElementType TABS = new WasmTokenType("TABS");
  IElementType TADD = new WasmTokenType("TADD");
  IElementType TALIGN = new WasmTokenType("TALIGN");
  IElementType TAND = new WasmTokenType("TAND");
  IElementType TBLOCK = new WasmTokenType("TBLOCK");
  IElementType TBR = new WasmTokenType("TBR");
  IElementType TBR_IF = new WasmTokenType("TBR_IF");
  IElementType TBR_TABLE = new WasmTokenType("TBR_TABLE");
  IElementType TCALL = new WasmTokenType("TCALL");
  IElementType TCALL_INDIRECT = new WasmTokenType("TCALL_INDIRECT");
  IElementType TCEIL = new WasmTokenType("TCEIL");
  IElementType TCLZ = new WasmTokenType("TCLZ");
  IElementType TCONST = new WasmTokenType("TCONST");
  IElementType TCONVERT_S_I32 = new WasmTokenType("TCONVERT_S_I32");
  IElementType TCONVERT_S_I64 = new WasmTokenType("TCONVERT_S_I64");
  IElementType TCONVERT_U_I32 = new WasmTokenType("TCONVERT_U_I32");
  IElementType TCONVERT_U_I64 = new WasmTokenType("TCONVERT_U_I64");
  IElementType TCOPYSIGN = new WasmTokenType("TCOPYSIGN");
  IElementType TCTZ = new WasmTokenType("TCTZ");
  IElementType TDATA = new WasmTokenType("TDATA");
  IElementType TDEMOTE_F64 = new WasmTokenType("TDEMOTE_F64");
  IElementType TDIV = new WasmTokenType("TDIV");
  IElementType TDIV_S = new WasmTokenType("TDIV_S");
  IElementType TDIV_U = new WasmTokenType("TDIV_U");
  IElementType TDOT = new WasmTokenType("TDOT");
  IElementType TDROP = new WasmTokenType("TDROP");
  IElementType TELEM = new WasmTokenType("TELEM");
  IElementType TELSE = new WasmTokenType("TELSE");
  IElementType TEND = new WasmTokenType("TEND");
  IElementType TEQ = new WasmTokenType("TEQ");
  IElementType TEQUAL = new WasmTokenType("TEQUAL");
  IElementType TEQZ = new WasmTokenType("TEQZ");
  IElementType TEXPORT = new WasmTokenType("TEXPORT");
  IElementType TEXTEND16_S = new WasmTokenType("TEXTEND16_S");
  IElementType TEXTEND32_S = new WasmTokenType("TEXTEND32_S");
  IElementType TEXTEND8_S = new WasmTokenType("TEXTEND8_S");
  IElementType TEXTEND_S_I32 = new WasmTokenType("TEXTEND_S_I32");
  IElementType TEXTEND_U_I32 = new WasmTokenType("TEXTEND_U_I32");
  IElementType TF32 = new WasmTokenType("TF32");
  IElementType TF64 = new WasmTokenType("TF64");
  IElementType TFLOAT = new WasmTokenType("TFLOAT");
  IElementType TFLOOR = new WasmTokenType("TFLOOR");
  IElementType TFUNC = new WasmTokenType("TFUNC");
  IElementType TFUNCREF = new WasmTokenType("TFUNCREF");
  IElementType TGE = new WasmTokenType("TGE");
  IElementType TGET_GLOBAL = new WasmTokenType("TGET_GLOBAL");
  IElementType TGET_LOCAL = new WasmTokenType("TGET_LOCAL");
  IElementType TGE_S = new WasmTokenType("TGE_S");
  IElementType TGE_U = new WasmTokenType("TGE_U");
  IElementType TGLOBAL = new WasmTokenType("TGLOBAL");
  IElementType TGROW = new WasmTokenType("TGROW");
  IElementType TGT = new WasmTokenType("TGT");
  IElementType TGT_S = new WasmTokenType("TGT_S");
  IElementType TGT_U = new WasmTokenType("TGT_U");
  IElementType TI32 = new WasmTokenType("TI32");
  IElementType TI64 = new WasmTokenType("TI64");
  IElementType TID = new WasmTokenType("TID");
  IElementType TIF = new WasmTokenType("TIF");
  IElementType TIMPORT = new WasmTokenType("TIMPORT");
  IElementType TINT = new WasmTokenType("TINT");
  IElementType TLE = new WasmTokenType("TLE");
  IElementType TLE_S = new WasmTokenType("TLE_S");
  IElementType TLE_U = new WasmTokenType("TLE_U");
  IElementType TLOAD = new WasmTokenType("TLOAD");
  IElementType TLOAD16_S = new WasmTokenType("TLOAD16_S");
  IElementType TLOAD16_U = new WasmTokenType("TLOAD16_U");
  IElementType TLOAD32_S = new WasmTokenType("TLOAD32_S");
  IElementType TLOAD32_U = new WasmTokenType("TLOAD32_U");
  IElementType TLOAD8_S = new WasmTokenType("TLOAD8_S");
  IElementType TLOAD8_U = new WasmTokenType("TLOAD8_U");
  IElementType TLOCAL = new WasmTokenType("TLOCAL");
  IElementType TLOOP = new WasmTokenType("TLOOP");
  IElementType TLP = new WasmTokenType("TLP");
  IElementType TLT = new WasmTokenType("TLT");
  IElementType TLT_S = new WasmTokenType("TLT_S");
  IElementType TLT_U = new WasmTokenType("TLT_U");
  IElementType TMAX = new WasmTokenType("TMAX");
  IElementType TMEMORY = new WasmTokenType("TMEMORY");
  IElementType TMIN = new WasmTokenType("TMIN");
  IElementType TMODULE = new WasmTokenType("TMODULE");
  IElementType TMUL = new WasmTokenType("TMUL");
  IElementType TMUT = new WasmTokenType("TMUT");
  IElementType TNAME = new WasmTokenType("TNAME");
  IElementType TNE = new WasmTokenType("TNE");
  IElementType TNEAREST = new WasmTokenType("TNEAREST");
  IElementType TNEG = new WasmTokenType("TNEG");
  IElementType TNOP = new WasmTokenType("TNOP");
  IElementType TOFFSET = new WasmTokenType("TOFFSET");
  IElementType TOR = new WasmTokenType("TOR");
  IElementType TPARAM = new WasmTokenType("TPARAM");
  IElementType TPOPCNT = new WasmTokenType("TPOPCNT");
  IElementType TPROMOTE_F32 = new WasmTokenType("TPROMOTE_F32");
  IElementType TREINTERPRET_F32 = new WasmTokenType("TREINTERPRET_F32");
  IElementType TREINTERPRET_F64 = new WasmTokenType("TREINTERPRET_F64");
  IElementType TREINTERPRET_I32 = new WasmTokenType("TREINTERPRET_I32");
  IElementType TREINTERPRET_I64 = new WasmTokenType("TREINTERPRET_I64");
  IElementType TREM_S = new WasmTokenType("TREM_S");
  IElementType TREM_U = new WasmTokenType("TREM_U");
  IElementType TRESULT = new WasmTokenType("TRESULT");
  IElementType TRETURN = new WasmTokenType("TRETURN");
  IElementType TROTL = new WasmTokenType("TROTL");
  IElementType TROTR = new WasmTokenType("TROTR");
  IElementType TRP = new WasmTokenType("TRP");
  IElementType TSELECT = new WasmTokenType("TSELECT");
  IElementType TSET_GLOBAL = new WasmTokenType("TSET_GLOBAL");
  IElementType TSET_LOCAL = new WasmTokenType("TSET_LOCAL");
  IElementType TSHL = new WasmTokenType("TSHL");
  IElementType TSHR_S = new WasmTokenType("TSHR_S");
  IElementType TSHR_U = new WasmTokenType("TSHR_U");
  IElementType TSIZE = new WasmTokenType("TSIZE");
  IElementType TSQRT = new WasmTokenType("TSQRT");
  IElementType TSTART = new WasmTokenType("TSTART");
  IElementType TSTORE = new WasmTokenType("TSTORE");
  IElementType TSTORE16 = new WasmTokenType("TSTORE16");
  IElementType TSTORE32 = new WasmTokenType("TSTORE32");
  IElementType TSTORE8 = new WasmTokenType("TSTORE8");
  IElementType TSUB = new WasmTokenType("TSUB");
  IElementType TTABLE = new WasmTokenType("TTABLE");
  IElementType TTEE_GLOBAL = new WasmTokenType("TTEE_GLOBAL");
  IElementType TTHEN = new WasmTokenType("TTHEN");
  IElementType TTRUNC = new WasmTokenType("TTRUNC");
  IElementType TTRUNC_SAT_F32_S = new WasmTokenType("TTRUNC_SAT_F32_S");
  IElementType TTRUNC_SAT_F32_U = new WasmTokenType("TTRUNC_SAT_F32_U");
  IElementType TTRUNC_SAT_F64_S = new WasmTokenType("TTRUNC_SAT_F64_S");
  IElementType TTRUNC_SAT_F64_U = new WasmTokenType("TTRUNC_SAT_F64_U");
  IElementType TTRUNC_S_F32 = new WasmTokenType("TTRUNC_S_F32");
  IElementType TTRUNC_S_F64 = new WasmTokenType("TTRUNC_S_F64");
  IElementType TTRUNC_U_F32 = new WasmTokenType("TTRUNC_U_F32");
  IElementType TTRUNC_U_F64 = new WasmTokenType("TTRUNC_U_F64");
  IElementType TTYPE = new WasmTokenType("TTYPE");
  IElementType TUNREACHABLE = new WasmTokenType("TUNREACHABLE");
  IElementType TWRAP_I64 = new WasmTokenType("TWRAP_I64");
  IElementType TXOR = new WasmTokenType("TXOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABBR_TYPE_USE) {
        return new WasmAbbrTypeUseImpl(node);
      }
      else if (type == ALIGN_ARG) {
        return new WasmAlignArgImpl(node);
      }
      else if (type == DATA) {
        return new WasmDataImpl(node);
      }
      else if (type == DATA_SHORT) {
        return new WasmDataShortImpl(node);
      }
      else if (type == ELEMENT) {
        return new WasmElementImpl(node);
      }
      else if (type == ELEM_SHORT) {
        return new WasmElemShortImpl(node);
      }
      else if (type == ELEM_TYPE) {
        return new WasmElemTypeImpl(node);
      }
      else if (type == EXPORT) {
        return new WasmExportImpl(node);
      }
      else if (type == EXPORT_DESC) {
        return new WasmExportDescImpl(node);
      }
      else if (type == EXPORT_SHORT) {
        return new WasmExportShortImpl(node);
      }
      else if (type == FUNC) {
        return new WasmFuncImpl(node);
      }
      else if (type == FUNC_TYPE) {
        return new WasmFuncTypeImpl(node);
      }
      else if (type == GLOBAL) {
        return new WasmGlobalImpl(node);
      }
      else if (type == GLOBAL_TYPE) {
        return new WasmGlobalTypeImpl(node);
      }
      else if (type == IDX) {
        return new WasmIdxImpl(node);
      }
      else if (type == IMPORT) {
        return new WasmImportImpl(node);
      }
      else if (type == IMPORT_DESC) {
        return new WasmImportDescImpl(node);
      }
      else if (type == IMPORT_SHORT) {
        return new WasmImportShortImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new WasmInstructionImpl(node);
      }
      else if (type == LIMITS) {
        return new WasmLimitsImpl(node);
      }
      else if (type == LOCAL) {
        return new WasmLocalImpl(node);
      }
      else if (type == MEMORY) {
        return new WasmMemoryImpl(node);
      }
      else if (type == MEMORY_TYPE) {
        return new WasmMemoryTypeImpl(node);
      }
      else if (type == MEM_ARG) {
        return new WasmMemArgImpl(node);
      }
      else if (type == NUM) {
        return new WasmNumImpl(node);
      }
      else if (type == OFFSET_ABBRV) {
        return new WasmOffsetAbbrvImpl(node);
      }
      else if (type == OFFSET_ARG) {
        return new WasmOffsetArgImpl(node);
      }
      else if (type == PARAM_ABBREVIATED) {
        return new WasmParamAbbreviatedImpl(node);
      }
      else if (type == PARAM_EXPLICIT) {
        return new WasmParamExplicitImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new WasmParamListImpl(node);
      }
      else if (type == RESULT) {
        return new WasmResultImpl(node);
      }
      else if (type == START) {
        return new WasmStartImpl(node);
      }
      else if (type == TABLE) {
        return new WasmTableImpl(node);
      }
      else if (type == TABLE_TYPE) {
        return new WasmTableTypeImpl(node);
      }
      else if (type == TYPE) {
        return new WasmTypeImpl(node);
      }
      else if (type == TYPE_USE) {
        return new WasmTypeUseImpl(node);
      }
      else if (type == VALUE_TYPE) {
        return new WasmValueTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
