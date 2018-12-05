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

public class WasmInstructionImpl extends ASTWrapperPsiElement implements WasmInstruction {

  public WasmInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WasmVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WasmVisitor) accept((WasmVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WasmIdx getIdx() {
    return findChildByClass(WasmIdx.class);
  }

  @Override
  @NotNull
  public List<WasmInstruction> getInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WasmInstruction.class);
  }

  @Override
  @Nullable
  public WasmMemArg getMemArg() {
    return findChildByClass(WasmMemArg.class);
  }

  @Override
  @Nullable
  public WasmNum getNum() {
    return findChildByClass(WasmNum.class);
  }

  @Override
  @Nullable
  public WasmResult getResult() {
    return findChildByClass(WasmResult.class);
  }

  @Override
  @Nullable
  public WasmTypeUse getTypeUse() {
    return findChildByClass(WasmTypeUse.class);
  }

}
