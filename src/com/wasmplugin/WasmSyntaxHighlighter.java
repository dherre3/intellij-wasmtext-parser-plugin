package com.wasmplugin;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import static com.wasmplugin.psi.WasmTypes.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
//import static com.wasmplugin.psi.WasmTypes.TMEMORY;

public class WasmSyntaxHighlighter extends SyntaxHighlighterBase{

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("WASM_KEYWORDS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("WASM_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey VALUE_TYPE =
            createTextAttributesKey("VALUE_TYPE", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey COMMENT_ATTR =
            createTextAttributesKey("WASM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("WASM_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_ATTR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] VALUE_TYPES = new TextAttributesKey[]{VALUE_TYPE};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new WasmLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {

        if (isKeyword(tokenType)) {
            return KEY_KEYS;
        }else if(tokenType.equals(TID)){
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(TSTRING)) {
            return VALUE_KEYS;
        } else if(isValueType(tokenType)){
            return VALUE_TYPES;
        } else if (tokenType.equals(COMMENT_ATTR)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
    private static boolean isKeyword(IElementType tokenType){
        IElementType[] keywords = {TMEMORY, TTABLE, TANYFUNC, TDATA,
                TELEM, TEXPORT, TIMPORT, TMODULE,
                TTYPE, TFUNC, TPARAM, TRESULT, TMUT, TGLOBAL};
        return Arrays.asList(keywords).contains(tokenType);
    }
    private static boolean isValueType(IElementType tokenType){
        IElementType[] valueTypes = { TI32, TI64, TF32, TF64};
        return Arrays.asList(valueTypes).contains(tokenType);
    }
}