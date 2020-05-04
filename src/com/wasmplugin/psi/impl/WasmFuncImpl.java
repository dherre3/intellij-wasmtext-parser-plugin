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

public class WasmFuncImpl extends ASTWrapperPsiElement implements WasmFunc {

  public WasmFuncImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitFunc(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WasmExportShort> getExportShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmExportShort.class);
  }

  @Override
  @NotNull
  public List<WasmImportShort> getImportShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmImportShort.class);
  }

  @Override
  @NotNull
  public List<WasmInstruction> getInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmInstruction.class);
  }

  @Override
  @NotNull
  public List<WasmLocal> getLocalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmLocal.class);
  }

  @Override
  @NotNull
  public WasmTypeUse getTypeUse() {
    return findNotNullChildByClass(WasmTypeUse.class);
  }

}
