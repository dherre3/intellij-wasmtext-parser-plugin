// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmInstruction extends PsiElement {

  @Nullable
  WasmIdx getIdx();

  @NotNull
  List<WasmInstruction> getInstructionList();

  @Nullable
  WasmMemArg getMemArg();

  @Nullable
  WasmNum getNum();

  @Nullable
  WasmResult getResult();

  @Nullable
  WasmTypeUse getTypeUse();

}
