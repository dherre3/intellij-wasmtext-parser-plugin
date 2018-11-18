package com.wasmplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import com.wasmplugin.WasmFileType;
import com.wasmplugin.WasmTextLanguage;

import javax.swing.*;

public class WasmFile extends PsiFileBase {
    public WasmFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WasmTextLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WasmFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Wasm Text File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
