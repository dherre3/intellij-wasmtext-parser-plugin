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

public class WastParamListImpl extends ASTWrapperPsiElement implements WastParamList {

  public WastParamListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WastVisitor visitor) {
    visitor.visitParamList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WastVisitor) accept((WastVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WastParamExplicit> getParamExplicitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WastParamExplicit.class);
  }

  @Override
  @NotNull
  public List<WastValueType> getValueTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WastValueType.class);
  }

}
