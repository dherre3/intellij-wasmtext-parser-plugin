// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmTable extends PsiElement {

  @Nullable
  WasmElemShort getElemShort();

  @Nullable
  WasmElemType getElemType();

  @NotNull
  List<WasmExportShort> getExportShortList();

  @Nullable
  WasmImportShort getImportShort();

  @Nullable
  WasmTableType getTableType();

}
