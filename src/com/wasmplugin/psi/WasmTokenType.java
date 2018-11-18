package com.wasmplugin.psi;


import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;
import com.wasmplugin.WasmTextLanguage;

public class WasmTokenType extends IElementType {
    public WasmTokenType(@NotNull @NonNls String debugName) {
        super(debugName, WasmTextLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WasmTokenType." + super.toString();
    }
}