/*
 * @author max
 */
package com.intellij.psi.impl.java.stubs.impl;

import com.intellij.psi.PsiParameterList;
import com.intellij.psi.impl.java.stubs.JavaStubElementTypes;
import com.intellij.psi.impl.java.stubs.PsiParameterListStub;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class PsiParameterListStubImpl extends StubBase<PsiParameterList> implements PsiParameterListStub {
  public PsiParameterListStubImpl(final StubElement parent) {
    super(parent, JavaStubElementTypes.PARAMETER_LIST);
  }

  @SuppressWarnings({"HardCodedStringLiteral"})
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("PsiParameterListStub");
    return builder.toString();
  }
}