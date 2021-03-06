// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WastTable extends PsiElement {

  @NotNull
  WastElemShort getElemShort();

  @NotNull
  WastElemType getElemType();

  @NotNull
  List<WastExportShort> getExportShortList();

  @NotNull
  List<WastImportShort> getImportShortList();

  @NotNull
  WastTableType getTableType();

}
