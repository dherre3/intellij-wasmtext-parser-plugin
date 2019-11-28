package com.wasmplugin;

import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProviderDescriptor;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.editor.markup.GutterIconRenderer;
import com.intellij.psi.PsiElement;
import com.wasmplugin.psi.WasmExport;
import com.wasmplugin.psi.WasmImport;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * wasm line marker provider
 *
 * @author linux_china
 */
public class WasmLineMarkerProvider extends LineMarkerProviderDescriptor {
    @Nls(capitalization = Nls.Capitalization.Sentence)
    @Nullable("null means disabled")
    @Override
    public String getName() {
        return null;
    }

    @Nullable
    @Override
    public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement psiElement) {
        if (psiElement instanceof WasmExport) {
            return new LineMarkerInfo(psiElement, psiElement.getTextRange(), AllIcons.Actions.Export, null, null, GutterIconRenderer.Alignment.CENTER);
        } else if (psiElement instanceof WasmImport) {
            return new LineMarkerInfo(psiElement, psiElement.getTextRange(), AllIcons.Css.Import, null, null, GutterIconRenderer.Alignment.CENTER);
        }
        return null;
    }
}
