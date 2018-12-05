// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmFunc extends PsiElement {

  @NotNull
  List<WasmInstruction> getInstructionList();

  @Nullable
  WasmLocal getLocal();

  @NotNull
  WasmTypeUse getTypeUse();

}
