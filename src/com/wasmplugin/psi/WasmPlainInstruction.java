// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WasmPlainInstruction extends PsiElement {

  @Nullable
  WasmIdx getIdx();

  @Nullable
  WasmMemArg getMemArg();

  @Nullable
  WasmNum getNum();

  @Nullable
  WasmTypeUse getTypeUse();

}
