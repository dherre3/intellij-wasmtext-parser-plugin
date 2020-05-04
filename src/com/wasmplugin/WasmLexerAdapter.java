package com.wasmplugin;

import com.intellij.lexer.FlexAdapter;

public class WasmLexerAdapter extends FlexAdapter {
    public WasmLexerAdapter() {
        super(new WasmLexer(null));
    }
}
