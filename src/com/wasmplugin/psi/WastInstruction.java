// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WastInstruction extends PsiElement {

  @Nullable
  WastIdx getIdx();

  @NotNull
  List<WastInstruction> getInstructionList();

  @Nullable
  WastMemArg getMemArg();

  @Nullable
  WastNum getNum();

  @Nullable
  WastResult getResult();

  @Nullable
  WastTypeUse getTypeUse();

}
