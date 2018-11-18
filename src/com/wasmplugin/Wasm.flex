package com.wasmplugin;

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
      StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
%}

CRLF=\R
WHITE_SPACE=[\ U+09 U+0A U+0D]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
ID_CHAR=[0-9]|[a-z]|[A-Z]|[!]  |  [#]  |  [$]  |  [%]  |  [&]  |  [′]  |  [∗]  |  [+]  |  [−]  |  [.]  | [/] | [:]  |  [<]  |  [=]  |  [>]  |  [?]  |  [@]  |  [∖]  |  [’]  |  [_]  |  [`]  |  [|]  |[~]
%state WAITING_VALUE
%%
<YYINITIAL> "$"{ID_CHAR}                           {  return symbol(WasmTypes.IDENTIFIER); }

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return WasmTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return WasmTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return WasmTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return WasmTypes.VALUE; }


({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
