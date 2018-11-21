package com.wasmplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.wasmplugin.psi.WasmTypes;
import com.intellij.psi.TokenType;

%%

%class WasmLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}
%{

%}

LINE_COMMENT     = ";;" [^\u000A]* [\u000A]
BLOCK_COMMENT     = "(;" {BLOCK_CHAR}*";)"
COMMENT = {BLOCK_COMMENT}|{LINE_COMMENT}
BLOCK_CHAR = ([^;(]|([;][^)])|([(][^;]))
WHITE_SPACE=[ ]
FORMAT=[\t\r\n]
ID_CHAR=[0-9]|[a-z]|[A-Z]|[!]  |  [#]  |  [$]  |  [%]  |  [&]  |  [′]  |  [∗]  |  [+]  |  [−]  |  [.]  | [/] | [:]  |  [<]  |  [=]  |  [>]  |  [?]  |  [@]  |  [∖]  |  [’]  |  [_]  |  [`]  |  [|]  |[~]
IDENTIFIER="$"{ID_CHAR}
INTEGER = [0-9] | [1-9][0-9]+
UINTEGER = [0-9] | [1-9][0-9]+
SINTEGER = {SIGNED}{UINTEGER}
INTEGER_WASM={UINTEGER}|{SINTEGER}
FLOATING_WASM={INTEGER}"."{INTEGER} | {SIGNED}{INTEGER}"."{INTEGER}
STRING="\""([^\t\n\r\u007F\"\\\u0027] | "\\t" |"\\n"|"\\r"|"\\\""|"\\")*"\""
SIGNED="+" | "-"

%state STRING
%%
<YYINITIAL> "module"                              {return WasmTypes.TMODULE;}
<YYINITIAL> "func"                              {return WasmTypes.TFUNC;}
<YYINITIAL> "param"                              {return WasmTypes.TPARAM;}
<YYINITIAL> "result"                              {return WasmTypes.TRESULT;}
<YYINITIAL> "type"                              {return WasmTypes.TTYPE;}
<YYINITIAL> "table"                              {return WasmTypes.TTABLE;}
<YYINITIAL> "memory"                              {return WasmTypes.TMEMORY;}
<YYINITIAL> "elem"                              {return WasmTypes.TELEM;}
<YYINITIAL> "offset"                              {return WasmTypes.TOFFSET;}
<YYINITIAL> "data"                              {return WasmTypes.TDATA;}

<YYINITIAL> "start"                              {return WasmTypes.TSTART;}
<YYINITIAL> "global"                              {return WasmTypes.TGLOBAL;}
<YYINITIAL> "import"                              {return WasmTypes.TIMPORT;}
<YYINITIAL> "export"                              {return WasmTypes.TEXPORT;}
//<YYINITIAL> "local"                              {return WasmTypes.TLOCAL;}
<YYINITIAL> "result"                              {return WasmTypes.TRESULT;}
<YYINITIAL> ")"                              {return WasmTypes.TRP;}
<YYINITIAL> "("                              {return WasmTypes.TLP;}
//<YYINITIAL> "."                              {return WasmTypes.TDOT;}
<YYINITIAL> "i32"                              {return WasmTypes.TI32;}
<YYINITIAL> "f64"                              {return WasmTypes.TF64;}
<YYINITIAL> "i64"                              {return WasmTypes.TI64;}
<YYINITIAL> "f32"                              {return WasmTypes.TF32;}
<YYINITIAL> "anyfunc"                           {return WasmTypes.TANYFUNC;}
<YYINITIAL> "mut"                           {return WasmTypes.TMUT;}
<YYINITIAL> {STRING}                           {return WasmTypes.TSTRING;}
<YYINITIAL> {IDENTIFIER}                           {  return WasmTypes.TID; }
<YYINITIAL> {UINTEGER}                       { return WasmTypes.TUINTEGER;}
//<YYINITIAL> {INTEGER_WASM}                       { return WasmTypes.TINTEGER);}
//<YYINITIAL> {FLOATING_WASM}                      { return WasmTypes.TFP);}
<YYINITIAL> {COMMENT}                          { return WasmTypes.COMMENT; }
<YYINITIAL>({FORMAT}|{WHITE_SPACE})+  { return TokenType.WHITE_SPACE;}
[^]                                                         { return TokenType.BAD_CHARACTER; }
