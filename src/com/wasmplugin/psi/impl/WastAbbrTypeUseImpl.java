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

public class WastAbbrTypeUseImpl extends ASTWrapperPsiElement implements WastAbbrTypeUse {

  public WastAbbrTypeUseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WastVisitor visitor) {
    visitor.visitAbbrTypeUse(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WastVisitor) accept((WastVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WastParamList getParamList() {
    return findChildByClass(WastParamList.class);
  }

  @Override
  @Nullable
  public WastResult getResult() {
    return findChildByClass(WastResult.class);
  }

}
