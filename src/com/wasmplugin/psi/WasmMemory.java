// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmMemory extends PsiElement {

  @Nullable
  WasmDataShort getDataShort();

  @NotNull
  List<WasmExportShort> getExportShortList();

  @NotNull
  List<WasmImportShort> getImportShortList();

  @Nullable
  WasmMemoryType getMemoryType();

}
