package com.wasmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.wasmplugin.WasmTextLanguage;
import org.jetbrains.annotations.*;

public class WasmElementType extends IElementType {
    public WasmElementType(@NotNull @NonNls String debugName) {
        super(debugName, WasmTextLanguage.INSTANCE);
    }
}
