// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wasmplugin.psi.impl.*;

public interface WasmTypes {

  IElementType ABBR_TYPE_USE = new WasmElementType("ABBR_TYPE_USE");
  IElementType ALIGN_ARG = new WasmElementType("ALIGN_ARG");
  IElementType COM = new WasmElementType("COM");
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
  IElementType LOCAL_ABBR = new WasmElementType("LOCAL_ABBR");
  IElementType MEMORY = new WasmElementType("MEMORY");
  IElementType MEMORY_TYPE = new WasmElementType("MEMORY_TYPE");
  IElementType MEM_ARG = new WasmElementType("MEM_ARG");
  IElementType NUM = new WasmElementType("NUM");
  IElementType OFFSET_ABBRV = new WasmElementType("OFFSET_ABBRV");
  IElementType OFFSET_ARG = new WasmElementType("OFFSET_ARG");
  IElementType PARAM_EXPLICIT = new WasmElementType("PARAM_EXPLICIT");
  IElementType PARAM_LIST = new WasmElementType("PARAM_LIST");
  IElementType RESULT = new WasmElementType("RESULT");
  IElementType RESULT_EXPLICIT = new WasmElementType("RESULT_EXPLICIT");
  IElementType START = new WasmElementType("START");
  IElementType TABLE = new WasmElementType("TABLE");
  IElementType TABLE_TYPE = new WasmElementType("TABLE_TYPE");
  IElementType TYPE = new WasmElementType("TYPE");
  IElementType TYPE_USE = new WasmElementType("TYPE_USE");
  IElementType VALUE_TYPE = new WasmElementType("VALUE_TYPE");

  IElementType BLOCK_COMMENT = new WasmTokenType("BLOCK_COMMENT");
  IElementType LINE_COMMENT = new WasmTokenType("LINE_COMMENT");
  IElementType TABS = new WasmTokenType("tABS");
  IElementType TADD = new WasmTokenType("tADD");
  IElementType TALIGN = new WasmTokenType("tALIGN");
  IElementType TAND = new WasmTokenType("tAND");
  IElementType TANYFUNC = new WasmTokenType("tANYFUNC");
  IElementType TBLOCK = new WasmTokenType("tBLOCK");
  IElementType TBR = new WasmTokenType("tBR");
  IElementType TBR_IF = new WasmTokenType("tBR_IF");
  IElementType TBR_TABLE = new WasmTokenType("tBR_TABLE");
  IElementType TCALL = new WasmTokenType("tCALL");
  IElementType TCALL_INDIRECT = new WasmTokenType("tCALL_INDIRECT");
  IElementType TCEIL = new WasmTokenType("tCEIL");
  IElementType TCLZ = new WasmTokenType("tCLZ");
  IElementType TCONST = new WasmTokenType("tCONST");
  IElementType TCONVERT_S_I32 = new WasmTokenType("tCONVERT_S_I32");
  IElementType TCONVERT_S_I64 = new WasmTokenType("tCONVERT_S_I64");
  IElementType TCONVERT_U_I32 = new WasmTokenType("tCONVERT_U_I32");
  IElementType TCONVERT_U_I64 = new WasmTokenType("tCONVERT_U_I64");
  IElementType TCOPYSIGN = new WasmTokenType("tCOPYSIGN");
  IElementType TCTZ = new WasmTokenType("tCTZ");
  IElementType TDATA = new WasmTokenType("tDATA");
  IElementType TDEMOTE_F64 = new WasmTokenType("tDEMOTE_F64");
  IElementType TDIV = new WasmTokenType("tDIV");
  IElementType TDIV_S = new WasmTokenType("tDIV_S");
  IElementType TDIV_U = new WasmTokenType("tDIV_U");
  IElementType TDOT = new WasmTokenType("tDOT");
  IElementType TDROP = new WasmTokenType("tDROP");
  IElementType TELEM = new WasmTokenType("tELEM");
  IElementType TELSE = new WasmTokenType("tELSE");
  IElementType TEND = new WasmTokenType("tEND");
  IElementType TEQ = new WasmTokenType("tEQ");
  IElementType TEQZ = new WasmTokenType("tEQZ");
  IElementType TEXPORT = new WasmTokenType("tEXPORT");
  IElementType TEXTEND_S_I32 = new WasmTokenType("tEXTEND_S_I32");
  IElementType TEXTEND_U_I32 = new WasmTokenType("tEXTEND_U_I32");
  IElementType TF32 = new WasmTokenType("tF32");
  IElementType TF64 = new WasmTokenType("tF64");
  IElementType TFLOAT = new WasmTokenType("tFLOAT");
  IElementType TFLOOR = new WasmTokenType("tFLOOR");
  IElementType TFUNC = new WasmTokenType("tFUNC");
  IElementType TGE = new WasmTokenType("tGE");
  IElementType TGET_GLOBAL = new WasmTokenType("tGET_GLOBAL");
  IElementType TGET_LOCAL = new WasmTokenType("tGET_LOCAL");
  IElementType TGE_S = new WasmTokenType("tGE_S");
  IElementType TGE_U = new WasmTokenType("tGE_U");
  IElementType TGLOBAL = new WasmTokenType("tGLOBAL");
  IElementType TGROW = new WasmTokenType("tGROW");
  IElementType TGT = new WasmTokenType("tGT");
  IElementType TGT_S = new WasmTokenType("tGT_S");
  IElementType TGT_U = new WasmTokenType("tGT_U");
  IElementType TI32 = new WasmTokenType("tI32");
  IElementType TI64 = new WasmTokenType("tI64");
  IElementType TID = new WasmTokenType("tID");
  IElementType TIF = new WasmTokenType("tIF");
  IElementType TIMPORT = new WasmTokenType("tIMPORT");
  IElementType TINT = new WasmTokenType("tINT");
  IElementType TLE = new WasmTokenType("tLE");
  IElementType TLE_S = new WasmTokenType("tLE_S");
  IElementType TLE_U = new WasmTokenType("tLE_U");
  IElementType TLOAD = new WasmTokenType("tLOAD");
  IElementType TLOAD16_S = new WasmTokenType("tLOAD16_S");
  IElementType TLOAD16_U = new WasmTokenType("tLOAD16_U");
  IElementType TLOAD32_S = new WasmTokenType("tLOAD32_S");
  IElementType TLOAD32_U = new WasmTokenType("tLOAD32_U");
  IElementType TLOAD8_S = new WasmTokenType("tLOAD8_S");
  IElementType TLOAD8_U = new WasmTokenType("tLOAD8_U");
  IElementType TLOCAL = new WasmTokenType("tLOCAL");
  IElementType TLOOP = new WasmTokenType("tLOOP");
  IElementType TLP = new WasmTokenType("tLP");
  IElementType TLT = new WasmTokenType("tLT");
  IElementType TLT_S = new WasmTokenType("tLT_S");
  IElementType TLT_U = new WasmTokenType("tLT_U");
  IElementType TMAX = new WasmTokenType("tMAX");
  IElementType TMEMORY = new WasmTokenType("tMEMORY");
  IElementType TMIN = new WasmTokenType("tMIN");
  IElementType TMODULE = new WasmTokenType("tMODULE");
  IElementType TMUL = new WasmTokenType("tMUL");
  IElementType TMUT = new WasmTokenType("tMUT");
  IElementType TNAME = new WasmTokenType("tNAME");
  IElementType TNE = new WasmTokenType("tNE");
  IElementType TNEAREST = new WasmTokenType("tNEAREST");
  IElementType TNEG = new WasmTokenType("tNEG");
  IElementType TNOP = new WasmTokenType("tNOP");
  IElementType TOFFSET = new WasmTokenType("tOFFSET");
  IElementType TOR = new WasmTokenType("tOR");
  IElementType TPARAM = new WasmTokenType("tPARAM");
  IElementType TPOPCNT = new WasmTokenType("tPOPCNT");
  IElementType TPROMOTE_F32 = new WasmTokenType("tPROMOTE_F32");
  IElementType TREINTERPRET_F32 = new WasmTokenType("tREINTERPRET_F32");
  IElementType TREINTERPRET_F64 = new WasmTokenType("tREINTERPRET_F64");
  IElementType TREINTERPRET_I32 = new WasmTokenType("tREINTERPRET_I32");
  IElementType TREINTERPRET_I64 = new WasmTokenType("tREINTERPRET_I64");
  IElementType TREM_S = new WasmTokenType("tREM_S");
  IElementType TREM_U = new WasmTokenType("tREM_U");
  IElementType TRESULT = new WasmTokenType("tRESULT");
  IElementType TRETURN = new WasmTokenType("tRETURN");
  IElementType TROTL = new WasmTokenType("tROTL");
  IElementType TROTR = new WasmTokenType("tROTR");
  IElementType TRP = new WasmTokenType("tRP");
  IElementType TSELECT = new WasmTokenType("tSELECT");
  IElementType TSET_GLOBAL = new WasmTokenType("tSET_GLOBAL");
  IElementType TSET_LOCAL = new WasmTokenType("tSET_LOCAL");
  IElementType TSHL = new WasmTokenType("tSHL");
  IElementType TSHR_S = new WasmTokenType("tSHR_S");
  IElementType TSHR_U = new WasmTokenType("tSHR_U");
  IElementType TSIZE = new WasmTokenType("tSIZE");
  IElementType TSQRT = new WasmTokenType("tSQRT");
  IElementType TSTART = new WasmTokenType("tSTART");
  IElementType TSTORE = new WasmTokenType("tSTORE");
  IElementType TSTORE16 = new WasmTokenType("tSTORE16");
  IElementType TSTORE32 = new WasmTokenType("tSTORE32");
  IElementType TSTORE8 = new WasmTokenType("tSTORE8");
  IElementType TSUB = new WasmTokenType("tSUB");
  IElementType TTABLE = new WasmTokenType("tTABLE");
  IElementType TTEE_GLOBAL = new WasmTokenType("tTEE_GLOBAL");
  IElementType TTHEN = new WasmTokenType("tTHEN");
  IElementType TTRUNC = new WasmTokenType("tTRUNC");
  IElementType TTRUNC_S_F32 = new WasmTokenType("tTRUNC_S_F32");
  IElementType TTRUNC_S_F64 = new WasmTokenType("tTRUNC_S_F64");
  IElementType TTRUNC_U_F32 = new WasmTokenType("tTRUNC_U_F32");
  IElementType TTRUNC_U_F64 = new WasmTokenType("tTRUNC_U_F64");
  IElementType TTYPE = new WasmTokenType("tTYPE");
  IElementType TUNREACHABLE = new WasmTokenType("tUNREACHABLE");
  IElementType TWRAP_I64 = new WasmTokenType("tWRAP_I64");
  IElementType TXOR = new WasmTokenType("tXOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABBR_TYPE_USE) {
        return new WasmAbbrTypeUseImpl(node);
      }
      else if (type == ALIGN_ARG) {
        return new WasmAlignArgImpl(node);
      }
      else if (type == COM) {
        return new WasmComImpl(node);
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
      else if (type == LOCAL_ABBR) {
        return new WasmLocalAbbrImpl(node);
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
      else if (type == PARAM_EXPLICIT) {
        return new WasmParamExplicitImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new WasmParamListImpl(node);
      }
      else if (type == RESULT) {
        return new WasmResultImpl(node);
      }
      else if (type == RESULT_EXPLICIT) {
        return new WasmResultExplicitImpl(node);
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
