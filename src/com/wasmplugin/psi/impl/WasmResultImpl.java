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

public class WasmResultImpl extends ASTWrapperPsiElement implements WasmResult {

  public WasmResultImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitResult(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WasmResultExplicit> getResultExplicitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmResultExplicit.class);
  }

  @Override
  @NotNull
  public List<WasmValueType> getValueTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmValueType.class);
  }

}
