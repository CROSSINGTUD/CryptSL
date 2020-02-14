/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.IModelMerger;

@SuppressWarnings("all")
public class EmbeddedResourceValidator extends ResourceValidatorImpl {
  @Inject
  private OperationCanceledManager operationCanceledManager;
  
  @Inject
  private IModelMerger modelMerger;
  
  @Accessors
  private EObject originalObject;
  
  @Accessors
  private Function0<? extends String> embeddedTextProvider;
  
  @Accessors
  private Function0<? extends ITextRegion> visibleRegionProvider;
  
  @Override
  protected void validate(final Resource resource, final CheckMode mode, final CancelIndicator monitor, final IAcceptor<Issue> acceptor) {
    super.validate(resource, mode, monitor, acceptor);
    this.operationCanceledManager.checkCanceled(monitor);
    if ((this.originalObject == null)) {
      return;
    }
    final ITextRegion visibleRegion = this.visibleRegionProvider.apply();
    final EObject embeddedModel = IterableExtensions.<EObject>head(resource.getContents());
    final EObject matchingObject = this.modelMerger.findMatchingObject(embeddedModel, this.originalObject);
    if ((matchingObject == null)) {
      this.error("The selected element cannot be removed or renamed in this view.", 
        visibleRegion.getOffset(), visibleRegion.getLength(), acceptor);
    } else {
      final ICompositeNode selectedNode = NodeModelUtils.getNode(matchingObject);
      if ((selectedNode != null)) {
        final String embeddedText = this.embeddedTextProvider.apply();
        final int selectedOffset = selectedNode.getOffset();
        int _offset = visibleRegion.getOffset();
        boolean _greaterThan = (selectedOffset > _offset);
        if (_greaterThan) {
          final String prefix = embeddedText.substring(visibleRegion.getOffset(), selectedOffset);
          final int start = this.nonWhitespaceStart(prefix);
          if ((start >= 0)) {
            int _offset_1 = visibleRegion.getOffset();
            int _plus = (_offset_1 + start);
            int _nonWhitespaceEnd = this.nonWhitespaceEnd(prefix);
            int _minus = (_nonWhitespaceEnd - start);
            this.error("Only the content of the selected element may be edited in this view.", _plus, _minus, acceptor);
          }
        }
        int _length = selectedNode.getLength();
        final int selectedEndOffset = (selectedOffset + _length);
        int _offset_2 = visibleRegion.getOffset();
        int _length_1 = visibleRegion.getLength();
        final int visibleEndOffset = (_offset_2 + _length_1);
        if ((selectedEndOffset < visibleEndOffset)) {
          final String suffix = embeddedText.substring(selectedEndOffset, visibleEndOffset);
          final int start_1 = this.nonWhitespaceStart(suffix);
          if ((start_1 >= 0)) {
            int _nonWhitespaceEnd_1 = this.nonWhitespaceEnd(suffix);
            int _minus_1 = (_nonWhitespaceEnd_1 - start_1);
            this.error("Only the content of the selected element may be edited in this view.", 
              (selectedEndOffset + start_1), _minus_1, acceptor);
          }
        }
      }
    }
  }
  
  private int nonWhitespaceStart(final String s) {
    for (int i = 0; (i < s.length()); i++) {
      boolean _isWhitespace = Character.isWhitespace(s.charAt(i));
      boolean _not = (!_isWhitespace);
      if (_not) {
        return i;
      }
    }
    return (-1);
  }
  
  private int nonWhitespaceEnd(final String s) {
    for (int i = (s.length() - 1); (i >= 0); i--) {
      boolean _isWhitespace = Character.isWhitespace(s.charAt(i));
      boolean _not = (!_isWhitespace);
      if (_not) {
        return (i + 1);
      }
    }
    return (-1);
  }
  
  protected void error(final String message, final int offset, final int length, final IAcceptor<Issue> acceptor) {
    Issue.IssueImpl _issueImpl = new Issue.IssueImpl();
    final Procedure1<Issue.IssueImpl> _function = new Procedure1<Issue.IssueImpl>() {
      @Override
      public void apply(final Issue.IssueImpl issue) {
        issue.setType(CheckType.FAST);
        issue.setSeverity(Severity.ERROR);
        issue.setMessage(message);
        issue.setOffset(Integer.valueOf(offset));
        issue.setLength(Integer.valueOf(length));
      }
    };
    Issue.IssueImpl _doubleArrow = ObjectExtensions.<Issue.IssueImpl>operator_doubleArrow(_issueImpl, _function);
    acceptor.accept(_doubleArrow);
  }
  
  @Pure
  public EObject getOriginalObject() {
    return this.originalObject;
  }
  
  public void setOriginalObject(final EObject originalObject) {
    this.originalObject = originalObject;
  }
  
  @Pure
  public Function0<? extends String> getEmbeddedTextProvider() {
    return this.embeddedTextProvider;
  }
  
  public void setEmbeddedTextProvider(final Function0<? extends String> embeddedTextProvider) {
    this.embeddedTextProvider = embeddedTextProvider;
  }
  
  @Pure
  public Function0<? extends ITextRegion> getVisibleRegionProvider() {
    return this.visibleRegionProvider;
  }
  
  public void setVisibleRegionProvider(final Function0<? extends ITextRegion> visibleRegionProvider) {
    this.visibleRegionProvider = visibleRegionProvider;
  }
}
