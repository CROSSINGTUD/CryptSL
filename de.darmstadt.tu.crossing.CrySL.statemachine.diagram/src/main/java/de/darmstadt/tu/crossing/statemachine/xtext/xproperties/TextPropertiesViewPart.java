/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure3;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.EObjectSelectionListener;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.EditedResourceProvider;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.EmbeddedResourceValidator;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.IModelMerger;

@SuppressWarnings("all")
public class TextPropertiesViewPart extends ViewPart {
  @Inject
  private EditedResourceProvider resourceProvider;
  
  @Inject
  private IModelMerger modelMerger;
  
  @Inject
  private EmbeddedEditorFactory editorFactory;
  
  @Inject
  private EmbeddedResourceValidator resourceValidator;
  
  @Inject
  private ISerializer serializer;
  
  private final ArrayList<Resource> swtResources = new ArrayList<Resource>();
  
  private final ExecutorService executorService = Executors.newCachedThreadPool();
  
  private EObjectSelectionListener selectionListener;
  
  private XtextSourceViewer viewer;
  
  private EmbeddedEditorModelAccess modelAccess;
  
  private EObject currentViewedObject;
  
  private TransactionalEditingDomain editingDomain;
  
  private String lastMergedContent;
  
  private boolean refreshing;
  
  private boolean mergingBack;
  
  private Thread clearStatusThread;
  
  private List<Issue> validationErrors;
  
  @Override
  public void createPartControl(final Composite parent) {
    final IValidationIssueProcessor _function = new IValidationIssueProcessor() {
      @Override
      public void processIssues(final List<Issue> issues, final IProgressMonitor monitor) {
        final Function1<Issue, Boolean> _function = new Function1<Issue, Boolean>() {
          @Override
          public Boolean apply(final Issue it) {
            Severity _severity = it.getSeverity();
            return Boolean.valueOf(Objects.equal(_severity, Severity.ERROR));
          }
        };
        TextPropertiesViewPart.this.validationErrors = IterableExtensions.<Issue>toList(IterableExtensions.<Issue>filter(issues, _function));
        final Callable<String> _function_1 = new Callable<String>() {
          @Override
          public String call() throws Exception {
            return TextPropertiesViewPart.this.documentChanged();
          }
        };
        TextPropertiesViewPart.this.executorService.<String>submit(_function_1);
      }
    };
    final EmbeddedEditor editor = this.editorFactory.newEditor(this.resourceProvider).showErrorAndWarningAnnotations().withResourceValidator(this.resourceValidator).processIssuesBy(_function).withParent(parent);
    this.modelAccess = editor.createPartialEditor();
    this.viewer = editor.getViewer();
    StyledText _textWidget = this.viewer.getTextWidget();
    _textWidget.setFont(this.getFont());
    final Function0<String> _function_1 = new Function0<String>() {
      @Override
      public String apply() {
        return TextPropertiesViewPart.this.modelAccess.getSerializedModel();
      }
    };
    this.resourceValidator.setEmbeddedTextProvider(_function_1);
    final Function0<ITextRegion> _function_2 = new Function0<ITextRegion>() {
      @Override
      public ITextRegion apply() {
        TextRegion _xblockexpression = null;
        {
          final IRegion region = TextPropertiesViewPart.this.viewer.getVisibleRegion();
          int _offset = region.getOffset();
          int _length = region.getLength();
          _xblockexpression = new TextRegion(_offset, _length);
        }
        return _xblockexpression;
      }
    };
    this.resourceValidator.setVisibleRegionProvider(_function_2);
    EObjectSelectionListener _eObjectSelectionListener = new EObjectSelectionListener();
    this.selectionListener = _eObjectSelectionListener;
    final Procedure3<EObject, Notification, TransactionalEditingDomain> _function_3 = new Procedure3<EObject, Notification, TransactionalEditingDomain>() {
      @Override
      public void apply(final EObject object, final Notification notification, final TransactionalEditingDomain editingDomain) {
        TextPropertiesViewPart.this.refresh(object, notification);
        TextPropertiesViewPart.this.editingDomain = editingDomain;
      }
    };
    this.selectionListener.addStateChangeListener(_function_3);
    this.refresh(this.selectionListener.getSelectedObject(), null);
    this.editingDomain = this.selectionListener.getEditingDomain();
  }
  
  protected Font getFont() {
    Display _display = this.getViewSite().getShell().getDisplay();
    final Font font = new Font(_display, "Courier", 14, 0);
    this.swtResources.add(font);
    return font;
  }
  
  @Override
  public void dispose() {
    if (this.selectionListener!=null) {
      this.selectionListener.dispose();
    }
    final Consumer<Resource> _function = new Consumer<Resource>() {
      @Override
      public void accept(final Resource it) {
        it.dispose();
      }
    };
    this.swtResources.forEach(_function);
    this.swtResources.clear();
    this.executorService.shutdown();
    super.dispose();
  }
  
  protected void refresh(final EObject object, final Notification notification) {
    if ((this.refreshing || this.mergingBack)) {
      return;
    }
    this.refreshing = true;
    try {
      if (((object == this.currentViewedObject) && (notification != null))) {
        final EObject mergeResult = this.mergeForward(object, notification);
        if ((mergeResult != null)) {
          final String uriFragment = mergeResult.eResource().getURIFragment(mergeResult);
          final String serializedModel = this.serializer.serialize(mergeResult.eContainer(), SaveOptions.newBuilder().format().getOptions());
          this.modelAccess.updateModel(serializedModel, uriFragment);
          this.lastMergedContent = this.modelAccess.getEditablePart();
          return;
        }
      }
      if ((this.currentViewedObject != null)) {
        final String content = this.modelAccess.getEditablePart();
        boolean _notEquals = (!Objects.equal(content, this.lastMergedContent));
        if (_notEquals) {
          EObject mergeSource = null;
          if (((object != this.currentViewedObject) && this.validationErrors.isEmpty())) {
            mergeSource = this.mergeBack(this.currentViewedObject, this.editingDomain);
          }
          if ((mergeSource == null)) {
            this.handleDiscardedChanges();
          }
        }
      }
      this.resourceValidator.setOriginalObject(object);
      if ((object == null)) {
        this.lastMergedContent = "";
        this.modelAccess.updateModel(this.lastMergedContent);
      } else {
        final String uriFragment_1 = object.eResource().getURIFragment(object);
        final String serializedModel_1 = this.serializer.serialize(object.eContainer(), SaveOptions.newBuilder().format().getOptions());
        this.modelAccess.updateModel(serializedModel_1, uriFragment_1);
        this.viewer.setSelectedRange(0, 0);
        this.lastMergedContent = this.modelAccess.getEditablePart();
      }
      this.currentViewedObject = object;
    } finally {
      this.refreshing = false;
    }
  }
  
  protected String documentChanged() {
    String _xifexpression = null;
    if (((((!this.refreshing) && (!this.mergingBack)) && (this.currentViewedObject != null)) && this.validationErrors.isEmpty())) {
      String _xblockexpression = null;
      {
        this.mergingBack = true;
        String _xtrycatchfinallyexpression = null;
        try {
          String _xblockexpression_1 = null;
          {
            final EObject mergeSource = this.mergeBack(this.currentViewedObject, this.editingDomain);
            String _xifexpression_1 = null;
            if ((mergeSource != null)) {
              _xifexpression_1 = this.lastMergedContent = this.modelAccess.getEditablePart();
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          this.mergingBack = false;
        }
        _xblockexpression = _xtrycatchfinallyexpression;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected EObject mergeForward(final EObject object, final Notification notification) {
    final EObject modelCopy = this.resourceProvider.getResource().getParseResult().getRootASTElement();
    final EObject copy = this.modelMerger.findMatchingObject(modelCopy, object);
    if (((copy == null) || (copy.eContainer() == null))) {
      return null;
    }
    try {
      this.modelMerger.apply(notification, copy);
      return copy;
    } catch (final Throwable _t) {
      if (_t instanceof UnsupportedOperationException) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected EObject mergeBack(final EObject object, final TransactionalEditingDomain editingDomain) {
    final EObject modelCopy = this.resourceProvider.getResource().getParseResult().getRootASTElement();
    final EObject copy = this.modelMerger.findMatchingObject(modelCopy, object);
    if (((copy == null) || (copy.eContainer() == null))) {
      return null;
    }
    CommandStack _commandStack = editingDomain.getCommandStack();
    _commandStack.execute(new RecordingCommand(editingDomain, "Text Changes") {
      @Override
      protected void doExecute() {
        TextPropertiesViewPart.this.modelMerger.merge(copy, object);
      }
    });
    return copy;
  }
  
  protected Future<?> handleDiscardedChanges() {
    Future<?> _xblockexpression = null;
    {
      if ((this.clearStatusThread != null)) {
        this.clearStatusThread.interrupt();
      }
      final Display display = this.getViewSite().getShell().getDisplay();
      IActionBars _actionBars = this.getViewSite().getActionBars();
      IActionBars _actionBars_1 = this.selectionListener.getCurrentEditor().getEditorSite().getActionBars();
      final List<IActionBars> actionBars = Collections.<IActionBars>unmodifiableList(CollectionLiterals.<IActionBars>newArrayList(_actionBars, _actionBars_1));
      final Runnable _function = new Runnable() {
        @Override
        public void run() {
          final Consumer<IActionBars> _function = new Consumer<IActionBars>() {
            @Override
            public void accept(final IActionBars it) {
              IStatusLineManager _statusLineManager = it.getStatusLineManager();
              _statusLineManager.setErrorMessage("Warning: The previous text changes have been discarded due to validation errors.");
            }
          };
          actionBars.forEach(_function);
        }
      };
      display.asyncExec(_function);
      final Function1<Object, Object> _function_1 = new Function1<Object, Object>() {
        @Override
        public Object apply(final Object it) {
          Object _xtrycatchfinallyexpression = null;
          try {
            TextPropertiesViewPart.this.clearStatusThread = Thread.currentThread();
            Thread.sleep(5000);
            final Runnable _function = new Runnable() {
              @Override
              public void run() {
                final Consumer<IActionBars> _function = new Consumer<IActionBars>() {
                  @Override
                  public void accept(final IActionBars it) {
                    IStatusLineManager _statusLineManager = it.getStatusLineManager();
                    _statusLineManager.setErrorMessage(null);
                  }
                };
                actionBars.forEach(_function);
              }
            };
            display.syncExec(_function);
          } catch (final Throwable _t) {
            if (_t instanceof InterruptedException) {
              _xtrycatchfinallyexpression = null;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          } finally {
            Thread _currentThread = Thread.currentThread();
            boolean _equals = Objects.equal(TextPropertiesViewPart.this.clearStatusThread, _currentThread);
            if (_equals) {
              TextPropertiesViewPart.this.clearStatusThread = null;
            }
          }
          return _xtrycatchfinallyexpression;
        }
      };
      _xblockexpression = this.executorService.submit(
        ((Runnable) new Runnable() {
            public void run() {
              _function_1.apply(null);
            }
        }));
    }
    return _xblockexpression;
  }
  
  @Override
  public void setFocus() {
    this.viewer.getControl().setFocus();
  }
}
