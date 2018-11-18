package com.wasmplugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WasmTextLanguage extends Language {
    public static final WasmTextLanguage INSTANCE = new WasmTextLanguage();
    private WasmTextLanguage() {
        super("Wasm");
    }
    protected WasmTextLanguage(@NotNull String ID) {
        super(ID);
    }

    protected WasmTextLanguage(@NotNull String ID, @NotNull String... mimeTypes) {
        super(ID, mimeTypes);
    }

    protected WasmTextLanguage(@Nullable Language baseLanguage, @NotNull String ID, @NotNull String... mimeTypes) {
        super(baseLanguage, ID, mimeTypes);
    }

    protected WasmTextLanguage(@NotNull String ID, boolean register) {
        super(ID, register);
    }
}
