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

public class WasmParamListImpl extends ASTWrapperPsiElement implements WasmParamList {

  public WasmParamListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitParamList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmParamAbbreviated getParamAbbreviated() {
    return findChildByClass(WasmParamAbbreviated.class);
  }

  @Override
  @Nullable
  public WasmParamExplicit getParamExplicit() {
    return findChildByClass(WasmParamExplicit.class);
  }

}
