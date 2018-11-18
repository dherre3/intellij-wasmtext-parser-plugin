package com.wasmplugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WasmFileType extends LanguageFileType {
    public static final WasmFileType INSTANCE = new WasmFileType();

    private WasmFileType(){
        super(WasmTextLanguage.INSTANCE);
    }
    protected WasmFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "Wasm Text File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "WebAssembly text format file (.wat)";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "wat";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return WasmIcon.FILE;
    }
}
