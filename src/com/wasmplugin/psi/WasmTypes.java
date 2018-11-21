// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wasmplugin.psi.impl.*;

public interface WasmTypes {

  IElementType COM = new WasmElementType("COM");
  IElementType DATA = new WasmElementType("DATA");
  IElementType DATA_SHORT = new WasmElementType("DATA_SHORT");
  IElementType ELEMENT = new WasmElementType("ELEMENT");
  IElementType ELEM_SHORT = new WasmElementType("ELEM_SHORT");
  IElementType ELEM_TYPE = new WasmElementType("ELEM_TYPE");
  IElementType EXPORT = new WasmElementType("EXPORT");
  IElementType EXPORT_DESC = new WasmElementType("EXPORT_DESC");
  IElementType EXPORT_SHORT = new WasmElementType("EXPORT_SHORT");
  IElementType FUNC_TYPE = new WasmElementType("FUNC_TYPE");
  IElementType GLOBAL = new WasmElementType("GLOBAL");
  IElementType GLOBAL_TYPE = new WasmElementType("GLOBAL_TYPE");
  IElementType IDX = new WasmElementType("IDX");
  IElementType IMPORT = new WasmElementType("IMPORT");
  IElementType IMPORT_DESC = new WasmElementType("IMPORT_DESC");
  IElementType IMPORT_SHORT = new WasmElementType("IMPORT_SHORT");
  IElementType LIMITS = new WasmElementType("LIMITS");
  IElementType MEMORY = new WasmElementType("MEMORY");
  IElementType MEMORY_TYPE = new WasmElementType("MEMORY_TYPE");
  IElementType OFF = new WasmElementType("OFF");
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

  IElementType COMMENT = new WasmTokenType("COMMENT");
  IElementType MODULE_1_0 = new WasmTokenType("module_1_0");
  IElementType TANYFUNC = new WasmTokenType("tANYFUNC");
  IElementType TDATA = new WasmTokenType("tDATA");
  IElementType TELEM = new WasmTokenType("tELEM");
  IElementType TEXPORT = new WasmTokenType("tEXPORT");
  IElementType TF32 = new WasmTokenType("tF32");
  IElementType TF64 = new WasmTokenType("tF64");
  IElementType TFUNC = new WasmTokenType("tFUNC");
  IElementType TGLOBAL = new WasmTokenType("tGLOBAL");
  IElementType TI32 = new WasmTokenType("tI32");
  IElementType TI64 = new WasmTokenType("tI64");
  IElementType TID = new WasmTokenType("tID");
  IElementType TIMPORT = new WasmTokenType("tIMPORT");
  IElementType TLP = new WasmTokenType("tLP");
  IElementType TMEMORY = new WasmTokenType("tMEMORY");
  IElementType TMODULE = new WasmTokenType("tMODULE");
  IElementType TMUT = new WasmTokenType("tMUT");
  IElementType TNAME = new WasmTokenType("tNAME");
  IElementType TOFFSET = new WasmTokenType("tOFFSET");
  IElementType TPARAM = new WasmTokenType("tPARAM");
  IElementType TRESULT = new WasmTokenType("tRESULT");
  IElementType TRP = new WasmTokenType("tRP");
  IElementType TSTART = new WasmTokenType("tSTART");
  IElementType TSTRING = new WasmTokenType("tSTRING");
  IElementType TTABLE = new WasmTokenType("tTABLE");
  IElementType TTYPE = new WasmTokenType("tTYPE");
  IElementType TUINTEGER = new WasmTokenType("tUINTEGER");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COM) {
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
      else if (type == LIMITS) {
        return new WasmLimitsImpl(node);
      }
      else if (type == MEMORY) {
        return new WasmMemoryImpl(node);
      }
      else if (type == MEMORY_TYPE) {
        return new WasmMemoryTypeImpl(node);
      }
      else if (type == OFF) {
        return new WasmOffImpl(node);
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
