// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WastMemory extends PsiElement {

  @Nullable
  WastDataShort getDataShort();

  @NotNull
  List<WastExportShort> getExportShortList();

  @NotNull
  List<WastImportShort> getImportShortList();

  @Nullable
  WastMemoryType getMemoryType();

}
