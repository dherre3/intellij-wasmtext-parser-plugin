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
digit =     [0-9]
hexdigit =  [0-9a-fA-F]
num =       {digit} ("_"? {digit})*
hexnum =    {hexdigit} ("_"? {hexdigit})*
letter =    [a-zA-Z]
symbol =    [+\-*\\/\^~=<>!?@#$%&|:`.']
character = [^\x00-\x1f\"\\]
        | "\\" [nrt\'\"]
        | "\\" {hexdigit} {hexdigit}
sign =      "+"|"-"
nat =       {num} | "0x" {hexnum}
int =       {sign}? {nat}
frac =      {num}
hexfrac =   {hexnum}
hexfloat =  {sign}? "0x" {hexnum} "." {hexfrac}? |{sign}? "0x" {hexnum} ("." {hexfrac}?)? [pP] {sign}? {num}
infinity =  {sign}? "inf"
nan =       {sign}? "nan"| {sign}? "nan:0x" {hexnum}
float =     {sign}? {num} "." {frac}?
    |     {sign}? {num} ("." {frac}?)? [eE] {sign}? {num}
fN = {float}|{nan}|{infinity}|{hexfloat}
text =      "\"" {character}* "\""
name =      "$" ({letter}| {digit}| "_" | {symbol})+

LINE_COMMENT     = ";;" [^\u000A]* [\u000A]
BLOCK_COMMENT     = "(;" {BLOCK_CHAR}*";)"
BLOCK_CHAR = ([^;(]|([;][^)])|([(][^;]))
WHITE_SPACE=[ ]
FORMAT=[\t\r\n]

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
<YYINITIAL> "align"                              {return WasmTypes.TALIGN;}
<YYINITIAL> "data"                              {return WasmTypes.TDATA;}
<YYINITIAL> "start"                              {return WasmTypes.TSTART;}
<YYINITIAL> "global"                              {return WasmTypes.TGLOBAL;}
<YYINITIAL> "import"                              {return WasmTypes.TIMPORT;}
<YYINITIAL> "export"                              {return WasmTypes.TEXPORT;}
<YYINITIAL> "const"                              {return WasmTypes.TCONST;}
<YYINITIAL> "get_global"                          {return WasmTypes.TGET_GLOBAL;}
<YYINITIAL> "local"                              {return WasmTypes.TLOCAL;}
<YYINITIAL> "result"                              {return WasmTypes.TRESULT;}
<YYINITIAL> ")"                              {return WasmTypes.TRP;}
<YYINITIAL> "("                              {return WasmTypes.TLP;}
<YYINITIAL> "."                              {return WasmTypes.TDOT;}
<YYINITIAL> "i32"                              {return WasmTypes.TI32;}
<YYINITIAL> "f64"                              {return WasmTypes.TF64;}
<YYINITIAL> "i64"                              {return WasmTypes.TI64;}
<YYINITIAL> "f32"                              {return WasmTypes.TF32;}
<YYINITIAL> "anyfunc"                           {return WasmTypes.TANYFUNC;}
<YYINITIAL> "mut"                           {return WasmTypes.TMUT;}
<YYINITIAL> "="                           {return WasmTypes.TEQ;}
<YYINITIAL> "block"                           {return WasmTypes.TBLOCK;}
<YYINITIAL> "end"                           {return WasmTypes.TEND;}
<YYINITIAL> "loop"                           {return WasmTypes.TLOOP;}
<YYINITIAL> "if"                           {return WasmTypes.TIF;}
<YYINITIAL> "then"                           {return WasmTypes.TTHEN;}
<YYINITIAL> "else"                           {return WasmTypes.TELSE;}
<YYINITIAL> "unreachable"                    {return WasmTypes.TUNREACHABLE;}
<YYINITIAL> "nop"                           {return WasmTypes.TNOP;}
<YYINITIAL> "br"                           {return WasmTypes.TBR;}
<YYINITIAL> "br_if"                           {return WasmTypes.TBR_IF;}
<YYINITIAL> "br_table"                           {return WasmTypes.TBR_TABLE;}
<YYINITIAL> "return"                           {return WasmTypes.TRETURN;}
<YYINITIAL> "call"                           {return WasmTypes.TCALL;}
<YYINITIAL> "call_indirect"                 {return WasmTypes.TCALL_INDIRECT;}
<YYINITIAL> "drop"                           {return WasmTypes.TDROP;}
<YYINITIAL> "select"                           {return WasmTypes.TSELECT;}
<YYINITIAL> "get_local"                           {return WasmTypes.TGET_LOCAL;}
<YYINITIAL> "set_local"                           {return WasmTypes.TSET_LOCAL;}
<YYINITIAL> "get_global"                           {return WasmTypes.TGET_GLOBAL;}
<YYINITIAL> "set_global"                           {return WasmTypes.TSET_GLOBAL;}
<YYINITIAL> "tee_local"                           {return WasmTypes.TTEE_GLOBAL;}
<YYINITIAL> "load"                           {return WasmTypes.TLOAD;}
<YYINITIAL> "load8_s"                           {return WasmTypes.TLOAD8_S;}
<YYINITIAL> "load8_u"                           {return WasmTypes.TLOAD8_U;}
<YYINITIAL> "load16_s"                           {return WasmTypes.TLOAD16_S;}
<YYINITIAL> "load16_u"                           {return WasmTypes.TLOAD16_U;}
<YYINITIAL> "load32_s"                           {return WasmTypes.TLOAD32_S;}
<YYINITIAL> "load32_u"                           {return WasmTypes.TLOAD32_U;}
<YYINITIAL> "store"                           {return WasmTypes.TSTORE;}
<YYINITIAL> "store8"                           {return WasmTypes.TSTORE8;}
<YYINITIAL> "store16"                           {return WasmTypes.TSTORE16;}
<YYINITIAL> "store32"                           {return WasmTypes.TSTORE32;}
<YYINITIAL> "memory"                           {return WasmTypes.TMEMORY;}
<YYINITIAL> "size"                           {return WasmTypes.TSIZE;}
<YYINITIAL> "grow"                           {return WasmTypes.TGROW;}
<YYINITIAL> "clz"                           {return WasmTypes.TCLZ;}
<YYINITIAL> "ctz"                           {return WasmTypes.TCTZ;}
<YYINITIAL> "popcnt"                        {return WasmTypes.TPOPCNT;}
<YYINITIAL> "add"                           {return WasmTypes.TADD;}
<YYINITIAL> "mul"                           {return WasmTypes.TMUL;}
<YYINITIAL> "sub"                           {return WasmTypes.TSUB;}
<YYINITIAL> "div_s"                         {return WasmTypes.TDIV_S;}
<YYINITIAL> "div_u"                         {return WasmTypes.TDIV_U;}
<YYINITIAL> "rem_s"                         {return WasmTypes.TREM_S;}
<YYINITIAL> "rem_u"                         {return WasmTypes.TREM_U;}
<YYINITIAL> "and"                           {return WasmTypes.TAND;}
<YYINITIAL> "or"                            {return WasmTypes.TOR;}
<YYINITIAL> "xor"                           {return WasmTypes.TXOR;}
<YYINITIAL> "shl"                           {return WasmTypes.TSHL;}
<YYINITIAL> "shr_s"                         {return WasmTypes.TSHR_S;}
<YYINITIAL> "shr_u"                         {return WasmTypes.TSHR_U;}
<YYINITIAL> "abs"                           {return WasmTypes.TABS;}
<YYINITIAL> "neg"                           {return WasmTypes.TNEG;}
<YYINITIAL> "ceil"                          {return WasmTypes.TCEIL;}
<YYINITIAL> "floor"                         {return WasmTypes.TFLOOR;}
<YYINITIAL> "trunc"                         {return WasmTypes.TTRUNC;}
<YYINITIAL> "nearest"                       {return WasmTypes.TNEAREST;}
<YYINITIAL> "sqrt"                          {return WasmTypes.TSQRT;}
<YYINITIAL> "div"                           {return WasmTypes.TDIV;}
<YYINITIAL> "min"                           {return WasmTypes.TMIN;}
<YYINITIAL> "max"                           {return WasmTypes.TMAX;}
<YYINITIAL> "copysign"                      {return WasmTypes.TCOPYSIGN;}
<YYINITIAL> "eqz"                           {return WasmTypes.TEQZ;}
<YYINITIAL> "eq"                            {return WasmTypes.TEQ;}
<YYINITIAL> "ne"                            {return WasmTypes.TNE;}
<YYINITIAL> "lt_s"                          {return WasmTypes.TLT_S;}
<YYINITIAL> "lt_u"                          {return WasmTypes.TLT_U;}
<YYINITIAL> "gt_s"                          {return WasmTypes.TGT_S;}
<YYINITIAL> "gt_u"                          {return WasmTypes.TGT_U;}
<YYINITIAL> "le_s"                          {return WasmTypes.TLE_S;}
<YYINITIAL> "le_u"                          {return WasmTypes.TLE_U;}
<YYINITIAL> "ge_s"                          {return WasmTypes.TGE_S;}
<YYINITIAL> "ge_u"                          {return WasmTypes.TGE_U;}
<YYINITIAL> "lt"                            {return WasmTypes.TLT;}
<YYINITIAL> "gt"                            {return WasmTypes.TGT;}
<YYINITIAL> "le"                            {return WasmTypes.TLE;}
<YYINITIAL> "ge"                            {return WasmTypes.TGE;}

<YYINITIAL> "wrap/i64"                            {return WasmTypes.TWRAP_I64;}
<YYINITIAL> "trunc_s/f32"                            {return WasmTypes.TTRUNC_S_F32;}
<YYINITIAL> "trunc_u/f32"                            {return WasmTypes.TTRUNC_U_F32;}
<YYINITIAL> "trunc_s/f64"                            {return WasmTypes.TTRUNC_S_F64;}
<YYINITIAL> "trunc_u/f64"                            {return WasmTypes.TTRUNC_U_F64;}
<YYINITIAL> "extend_s/i32"                            {return WasmTypes.TEXTEND_S_I32;}
<YYINITIAL> "extend_u/i32"                            {return WasmTypes.TEXTEND_U_I32;}
<YYINITIAL> "convert_s/i32"                            {return WasmTypes.TCONVERT_S_I32;}
<YYINITIAL> "convert_u/i32"                            {return WasmTypes.TCONVERT_U_I32;}
<YYINITIAL> "convert_s/i64"                            {return WasmTypes.TCONVERT_S_I64;}
<YYINITIAL> "convert_u/i64"                            {return WasmTypes.TCONVERT_U_I64;}
<YYINITIAL> "demote/f64"                            {return WasmTypes.TDEMOTE_F64;}
<YYINITIAL> "promote/f32"                            {return WasmTypes.TPROMOTE_F32;}
<YYINITIAL> "reinterpret/f32"                            {return WasmTypes.TREINTERPRET_F32;}
<YYINITIAL> "reinterpret/f64"                            {return WasmTypes.TREINTERPRET_F64;}
<YYINITIAL> "reinterpret/i32"                            {return WasmTypes.TREINTERPRET_I32;}
<YYINITIAL> "reinterpret/i64"                            {return WasmTypes.TREINTERPRET_I64;}

<YYINITIAL> {text}                           {return WasmTypes.TNAME;}
<YYINITIAL> {name}                           {  return WasmTypes.TID; }
<YYINITIAL> {int}                       { return WasmTypes.TINT;}
<YYINITIAL> {fN}                       { return WasmTypes.TFLOAT;}
//<YYINITIAL> {INTEGER_WASM}                       { return WasmTypes.TINTEGER);}
//<YYINITIAL> {FLOATING_WASM}                      { return WasmTypes.TFP);}
<YYINITIAL> {LINE_COMMENT}                 { return WasmTypes.LINE_COMMENT; }
<YYINITIAL> {BLOCK_COMMENT}                 { return WasmTypes.BLOCK_COMMENT; }
<YYINITIAL>({FORMAT}|{WHITE_SPACE})+  { return TokenType.WHITE_SPACE;}
[^]                                   { return TokenType.BAD_CHARACTER; }
