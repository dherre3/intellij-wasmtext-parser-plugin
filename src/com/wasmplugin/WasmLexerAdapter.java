package com.wasmplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class WasmLexerAdapter extends FlexAdapter {
    public WasmLexerAdapter() {
        super(new WasmLexer( null));
    }
}
