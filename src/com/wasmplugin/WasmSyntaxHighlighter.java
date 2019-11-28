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
    public static final TextAttributesKey GLOBAL_CHARACTER =
            createTextAttributesKey("SIMPLE_GLOBAL_CHARACTER", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey NUMBER_CHARACTER =
            createTextAttributesKey("SIMPLE_NUMBER_CHARACTER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("WASM_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{ NUMBER_CHARACTER };
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_ATTR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] VALUE_TYPES = new TextAttributesKey[]{VALUE_TYPE};
    private static final TextAttributesKey[] GLOBAL_CHARACTERS = new TextAttributesKey[]{GLOBAL_CHARACTER};

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
        }else if(tokenType.equals(BLOCK_COMMENT)||tokenType.equals(LINE_COMMENT)){
            return COMMENT_KEYS;
        }else if(tokenType.equals(TID)){
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(TNAME)) {
            return VALUE_KEYS;
        }else if (tokenType.equals(TINT)||tokenType.equals(TFLOAT)) {
            return NUMBER_KEYS;
        }else if (tokenType.equals(TSET_GLOBAL)||tokenType.equals(TGET_GLOBAL)) {
            return GLOBAL_CHARACTERS;
        } else if(isValueType(tokenType)){
            return VALUE_TYPES;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
    private static boolean isKeyword(IElementType tokenType){
        IElementType[] keywords = {TMEMORY, TTABLE, TANYFUNC, TDATA,
                TELEM, TEXPORT, TIMPORT, TMODULE,TLOCAL,TGET_GLOBAL,
                TGET_LOCAL,TSET_GLOBAL,TSET_LOCAL,TTEE_GLOBAL,
                TTYPE, TFUNC, TPARAM, TRESULT, TMUT, TGLOBAL,TSTART,
                TBLOCK, TLOOP, TIF, TUNREACHABLE, TNOP, TBR, TBR_IF,
                TBR_TABLE, TRETURN, TCALL, TCALL_INDIRECT, TDROP,
                TSELECT, TEND, TTHEN, TELSE
        };
        return Arrays.asList(keywords).contains(tokenType);
    }
    private static boolean isValueType(IElementType tokenType){
        IElementType[] valueTypes = { TI32, TI64, TF32, TF64};
        return Arrays.asList(valueTypes).contains(tokenType);
    }
}