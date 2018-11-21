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

public class WasmImportDescImpl extends ASTWrapperPsiElement implements WasmImportDesc {

  public WasmImportDescImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitImportDesc(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmGlobalType getGlobalType() {
    return findChildByClass(WasmGlobalType.class);
  }

  @Override
  @Nullable
  public WasmMemoryType getMemoryType() {
    return findChildByClass(WasmMemoryType.class);
  }

  @Override
  @Nullable
  public WasmTableType getTableType() {
    return findChildByClass(WasmTableType.class);
  }

  @Override
  @Nullable
  public WasmTypeUse getTypeUse() {
    return findChildByClass(WasmTypeUse.class);
  }

}
