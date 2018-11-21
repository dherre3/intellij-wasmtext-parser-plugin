// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmImportDesc extends PsiElement {

  @Nullable
  WasmGlobalType getGlobalType();

  @Nullable
  WasmMemoryType getMemoryType();

  @Nullable
  WasmTableType getTableType();

  @Nullable
  WasmTypeUse getTypeUse();

}
