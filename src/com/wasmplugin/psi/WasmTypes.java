// This is a generated file. Not intended for manual editing.
package com.wasmplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.wasmplugin.psi.impl.*;

public interface WasmTypes {

  IElementType PROPERTY = new WasmElementType("PROPERTY");

  IElementType COMMENT = new WasmTokenType("COMMENT");
  IElementType CRLF = new WasmTokenType("CRLF");
  IElementType KEY = new WasmTokenType("KEY");
  IElementType SEPARATOR = new WasmTokenType("SEPARATOR");
  IElementType VALUE = new WasmTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new WasmPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
