package com.wasmplugin;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Wasm Template Context
 *
 * @author linux_china
 */
public class WasmTemplateContext extends TemplateContextType {
    protected WasmTemplateContext() {
        super("Wasm", "Wasm");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile psiFile, int offset) {
        return psiFile.getName().endsWith(".wat");
    }
}
