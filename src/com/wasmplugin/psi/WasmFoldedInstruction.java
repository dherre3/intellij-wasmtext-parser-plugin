// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmFoldedInstruction extends PsiElement {

  @Nullable
  WasmElseClause getElseClause();

  @NotNull
  List<WasmFoldedInstruction> getFoldedInstructionList();

  @NotNull
  List<WasmInstruction> getInstructionList();

  @Nullable
  WasmPlainInstruction getPlainInstruction();

  @Nullable
  WasmResult getResult();

}
