// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WastGlobal extends PsiElement {

  @NotNull
  List<WastExportShort> getExportShortList();

  @Nullable
  WastGlobalType getGlobalType();

  @Nullable
  WastImportShort getImportShort();

  @Nullable
  WastInstruction getInstruction();

}
