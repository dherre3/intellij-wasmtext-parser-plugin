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

public class WasmMemoryImpl extends ASTWrapperPsiElement implements WasmMemory {

  public WasmMemoryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitMemory(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmDataShort getDataShort() {
    return findChildByClass(WasmDataShort.class);
  }

  @Override
  @Nullable
  public WasmExportShort getExportShort() {
    return findChildByClass(WasmExportShort.class);
  }

  @Override
  @Nullable
  public WasmImportShort getImportShort() {
    return findChildByClass(WasmImportShort.class);
  }

  @Override
  @Nullable
  public WasmMemoryType getMemoryType() {
    return findChildByClass(WasmMemoryType.class);
  }

}
