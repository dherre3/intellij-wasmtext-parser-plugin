package com.wasmplugin;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.wasmplugin.psi.WasmTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Wasm brace matcher
 *
 * @author linux_china
 */
public class WasmBraceMatcher implements PairedBraceMatcher {
    private final BracePair[] pairs = new BracePair[]{
            new BracePair(WasmTypes.TLP, WasmTypes.TRP, false),
            new BracePair(WasmTypes.TBLOCK, WasmTypes.TEND, false),
            new BracePair(WasmTypes.TLOOP, WasmTypes.TEND, false),
            new BracePair(WasmTypes.TIF, WasmTypes.TEND, false),
            new BracePair(WasmTypes.TIF, WasmTypes.TELSE, false)
    };

    @NotNull
    @Override
    public BracePair[] getPairs() {
        return pairs;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
