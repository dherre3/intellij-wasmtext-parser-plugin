// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WastFunc extends PsiElement {

  @NotNull
  List<WastExportShort> getExportShortList();

  @NotNull
  List<WastImportShort> getImportShortList();

  @NotNull
  List<WastInstruction> getInstructionList();

  @NotNull
  List<WastLocal> getLocalList();

  @NotNull
  WastTypeUse getTypeUse();

}
