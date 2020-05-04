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

public class WastMemoryImpl extends ASTWrapperPsiElement implements WastMemory {

  public WastMemoryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WastVisitor visitor) {
    visitor.visitMemory(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WastVisitor) accept((WastVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WastDataShort getDataShort() {
    return findChildByClass(WastDataShort.class);
  }

  @Override
  @NotNull
  public List<WastExportShort> getExportShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WastExportShort.class);
  }

  @Override
  @NotNull
  public List<WastImportShort> getImportShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WastImportShort.class);
  }

  @Override
  @Nullable
  public WastMemoryType getMemoryType() {
    return findChildByClass(WastMemoryType.class);
  }

}
