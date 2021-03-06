// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.wasmplugin.psi.WasmTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.wasmplugin.psi.*;

public class WastInstructionImpl extends ASTWrapperPsiElement implements WastInstruction {

  public WastInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WastVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WastVisitor) accept((WastVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WastIdx getIdx() {
    return findChildByClass(WastIdx.class);
  }

  @Override
  @NotNull
  public List<WastInstruction> getInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WastInstruction.class);
  }

  @Override
  @Nullable
  public WastMemArg getMemArg() {
    return findChildByClass(WastMemArg.class);
  }

  @Override
  @Nullable
  public WastNum getNum() {
    return findChildByClass(WastNum.class);
  }

  @Override
  @Nullable
  public WastResult getResult() {
    return findChildByClass(WastResult.class);
  }

  @Override
  @Nullable
  public WastTypeUse getTypeUse() {
    return findChildByClass(WastTypeUse.class);
  }

}
