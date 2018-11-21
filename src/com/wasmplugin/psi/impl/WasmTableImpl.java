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

public class WasmTableImpl extends ASTWrapperPsiElement implements WasmTable {

  public WasmTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitTable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmElemShort getElemShort() {
    return findChildByClass(WasmElemShort.class);
  }

  @Override
  @Nullable
  public WasmElemType getElemType() {
    return findChildByClass(WasmElemType.class);
  }

  @Override
  @NotNull
  public List<WasmExportShort> getExportShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmExportShort.class);
  }

  @Override
  @Nullable
  public WasmImportShort getImportShort() {
    return findChildByClass(WasmImportShort.class);
  }

  @Override
  @Nullable
  public WasmTableType getTableType() {
    return findChildByClass(WasmTableType.class);
  }

}
