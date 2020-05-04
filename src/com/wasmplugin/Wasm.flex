package com.wasmplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.wasmplugin.psi.WasmTypes.*;
import static com.intellij.psi.TokenType.*;
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
num =       {digit} ("_"? {digit})*
letter =    [a-zA-Z]
symbol =    [+\-*\\/\^~=<>!?@#$%&|:`.']
character = [^\x00-\x1f\"\\]
        | "\\" [nrt\'\"]
        | "\\" {hexdigit} {hexdigit}
sign =      "+"|"-"
nat =       {num} | "0x" {hexnum}
int =       {sign}? {nat}
frac =      {num}
hexdigit =  [0-9a-fA-F]
hexnum =    {hexdigit} ("_"? {hexdigit})*
hexfrac =   {hexnum}
hexfloat =  {sign}? "0x" {hexnum} "." {hexfrac}? | {sign}? "0x" {hexnum} ("." {hexfrac}?)? [pP] {sign}? {num}
infinity =  {sign}? "inf"
nan =       {sign}? "nan"| {sign}? "nan:0x" {hexnum}
float =     {sign}? {num} "." {frac}?
    |     {sign}? {num} ("." {frac}?)? [eE] {sign}? {num}
fN = {float}|{nan}|{infinity}|{hexfloat}
text =      "\"" {character}* "\""
name =      "$" ({letter}| {digit}| "_" | {symbol})+

LINE_COMMENT     = ";;" [^\u000A]* [\u000A]
BLOCK_COMMENT     = "(;" ({BLOCK_CHAR}|{BLOCK_COMMENT2})*";)"
BLOCK_COMMENT2 = "(;" {BLOCK_CHAR}*";)"
BLOCK_CHAR = ([^;(]|([;][^)])|([(][^;]))
WHITE_SPACE=[ ]
FORMAT=[\t\r\n]

%%
<YYINITIAL>{
 "module"                              {return TMODULE;}
 "func"                              {return TFUNC;}
 "param"                              {return TPARAM;}
 "result"                              {return TRESULT;}
 "type"                              {return TTYPE;}
 "table"                              {return TTABLE;}
 "elem"                              {return TELEM;}
 "offset"                              {return TOFFSET;}
 "align"                              {return TALIGN;}
 "data"                              {return TDATA;}
 "start"                              {return TSTART;}
 "global"                              {return TGLOBAL;}
 "import"                              {return TIMPORT;}
 "export"                              {return TEXPORT;}
 "const"                              {return TCONST;}
 "local"                              {return TLOCAL;}
 ")"                              {return TRP;}
 "("                              {return TLP;}
 "."                              {return TDOT;}
 "i32"                              {return TI32;}
 "f64"                              {return TF64;}
 "i64"                              {return TI64;}
 "f32"                              {return TF32;}
 "anyfunc"|"funcref"                           {return TFUNCREF;}
 "mut"                           {return TMUT;}
 "="                           {return TEQUAL;}
 "block"                           {return TBLOCK;}
 "end"                           {return TEND;}
 "loop"                           {return TLOOP;}
 "if"                           {return TIF;}
 "then"                           {return TTHEN;}
 "else"                           {return TELSE;}
 "unreachable"                    {return TUNREACHABLE;}
 "nop"                           {return TNOP;}
 "br"                           {return TBR;}
 "br_if"                           {return TBR_IF;}
 "br_table"                           {return TBR_TABLE;}
 "return"                           {return TRETURN;}
 "call"                           {return TCALL;}
 "call_indirect"                 {return TCALL_INDIRECT;}
 "drop"                           {return TDROP;}
 "select"                           {return TSELECT;}
 "local.get"|"get_local"          {return TGET_LOCAL;}
"local.set"|"set_local"                 {return TSET_LOCAL;}
 "global.get" |"get_global"                           {return TGET_GLOBAL;}
 "global.set" |"set_global"                           {return TSET_GLOBAL;}
 "local.tee"|"tee_local"                           {return TTEE_GLOBAL;}
 "load"                           {return TLOAD;}
 "load8_s"                           {return TLOAD8_S;}
 "load8_u"                           {return TLOAD8_U;}
 "load16_s"                           {return TLOAD16_S;}
 "load16_u"                           {return TLOAD16_U;}
 "load32_s"                           {return TLOAD32_S;}
 "load32_u"                           {return TLOAD32_U;}
 "store"                           {return TSTORE;}
 "store8"                           {return TSTORE8;}
 "store16"                           {return TSTORE16;}
 "store32"                           {return TSTORE32;}
"memory"                           {return TMEMORY;}
 "memory.size"                           {return TSIZE;}
 "memory.grow"                           {return TGROW;}
 "clz"                           {return TCLZ;}
 "ctz"                           {return TCTZ;}
 "popcnt"                        {return TPOPCNT;}
 "add"                           {return TADD;}
 "mul"                           {return TMUL;}
 "sub"                           {return TSUB;}
 "div_s"                         {return TDIV_S;}
 "div_u"                         {return TDIV_U;}
 "rem_s"                         {return TREM_S;}
 "rem_u"                         {return TREM_U;}
 "and"                           {return TAND;}
 "or"                            {return TOR;}
 "xor"                           {return TXOR;}
 "shl"                           {return TSHL;}
 "shr_s"                         {return TSHR_S;}
 "shr_u"                         {return TSHR_U;}
 "abs"                           {return TABS;}
 "neg"                           {return TNEG;}
 "ceil"                          {return TCEIL;}
 "floor"                         {return TFLOOR;}
 "trunc"                         {return TTRUNC;}
 "nearest"                       {return TNEAREST;}
 "sqrt"                          {return TSQRT;}
 "div"                           {return TDIV;}
 "min"                           {return TMIN;}
 "max"                           {return TMAX;}
 "copysign"                      {return TCOPYSIGN;}
 "eqz"                           {return TEQZ;}
 "eq"                            {return TEQ;}
 "ne"                            {return TNE;}
 "lt_s"                          {return TLT_S;}
 "lt_u"                          {return TLT_U;}
 "gt_s"                          {return TGT_S;}
 "gt_u"                          {return TGT_U;}
 "le_s"                          {return TLE_S;}
 "le_u"                          {return TLE_U;}
 "ge_s"                          {return TGE_S;}
 "ge_u"                          {return TGE_U;}
 "lt"                            {return TLT;}
 "gt"                            {return TGT;}
 "le"                            {return TLE;}
 "ge"                            {return TGE;}

 "wrap/i64"|"wrap_i64"                            {return TWRAP_I64;}
 "trunc_sat_f32_u"           {return TTRUNC_SAT_F32_U;}
 "trunc_sat_f32_s"                            {return TTRUNC_SAT_F32_S;}
 "trunc_sat_f64_s"                            {return TTRUNC_SAT_F64_S;}
 "trunc_sat_f64_u"                            {return TTRUNC_SAT_F64_U;}
 "trunc_s/f32"|"trunc_f32_s"           {return TTRUNC_S_F32;}
 "trunc_u/f32"|"trunc_f32_u"                            {return TTRUNC_U_F32;}
 "trunc_s/f64"|"trunc_f64_s"                            {return TTRUNC_S_F64;}
 "trunc_u/f64"|"trunc_f64_u"                            {return TTRUNC_U_F64;}
 "extend8_s"                            {return TEXTEND8_S;}
 "extend16_s"                            {return TEXTEND16_S;}
 "extend32_s"                            {return TEXTEND32_S;}
 "extend_s/i32"|"extend_i32_s"                            {return TEXTEND_S_I32;}
 "extend_u/i32"|"extend_i32_u"                            {return TEXTEND_U_I32;}
 "convert_s/i32"|"convert_i32_s"                            {return TCONVERT_S_I32;}
 "convert_u/i32"|"convert_i32_u"                            {return TCONVERT_U_I32;}
 "convert_s/i64"|"convert_i64_s"                            {return TCONVERT_S_I64;}
 "convert_u/i64"|"convert_i64_u"          {return TCONVERT_U_I64;}
 "demote/f64"|"demote_f64"                            {return TDEMOTE_F64;}
 "promote/f32"|"promote_f32"                            {return TPROMOTE_F32;}
 "reinterpret/f32"|"reinterpret_f32"                            {return TREINTERPRET_F32;}
 "reinterpret/f64"|"reinterpret_f64"                            {return TREINTERPRET_F64;}
 "reinterpret/i32"|"reinterpret_i32"                            {return TREINTERPRET_I32;}
 "reinterpret/i64"|"reinterpret_i64"                            {return TREINTERPRET_I64;}
 {text}                           {return TNAME;}
 {name}                           {  return TID; }
 {int}                       { return TINT;}
 {fN}                       { return TFLOAT;}
 ({FORMAT}|{WHITE_SPACE}|{LINE_COMMENT}|{BLOCK_COMMENT})+  { return WHITE_SPACE;}
}
[^]                                   { return BAD_CHARACTER; }