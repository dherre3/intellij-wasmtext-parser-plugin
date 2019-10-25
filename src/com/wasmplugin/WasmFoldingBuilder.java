package com.wasmplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.wasmplugin.psi.WasmFunc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Wasm Folding Builder
 *
 * @author linux_china
 */
public class WasmFoldingBuilder extends FoldingBuilderEx {
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        FoldingGroup group = FoldingGroup.newGroup("simple");

        List<FoldingDescriptor> descriptors = new ArrayList<>();
        Collection<WasmFunc> funcExpressions = PsiTreeUtil.findChildrenOfType(root, WasmFunc.class);
        for (final WasmFunc funcExpression : funcExpressions) {
            descriptors.add(new FoldingDescriptor(funcExpression.getNode(),
                    new TextRange(funcExpression.getTextRange().getStartOffset() + 1,
                            funcExpression.getTextRange().getEndOffset() - 1),
                    group) {
                @Override
                public String getPlaceholderText() {
                    // funcExpression
                    String text = funcExpression.getText();
                    if (text.contains(System.lineSeparator())) {
                        return text.substring(0, text.indexOf(System.lineSeparator())) + "...";
                    }
                    return "(func ...";
                }
            });

        }
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode astNode) {
        return "func...";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode astNode) {
        return true;
    }
}
