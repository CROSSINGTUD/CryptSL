/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure3;
import org.eclipse.xtext.xbase.lib.Pure;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.FrameworkAdapters;

@SuppressWarnings("all")
class EObjectSelectionListener implements ISelectionListener {
  private final ArrayList<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>> stateChangeListeners = new ArrayList<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>>();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private EObject selectedObject;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IEditorPart currentEditor;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private TransactionalEditingDomain editingDomain;
  
  private Adapter adapter;
  
  public EObjectSelectionListener() {
    final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    final ISelectionService selectionService = workbenchWindow.getSelectionService();
    selectionService.addSelectionListener(this);
    this.selectionChanged(workbenchWindow.getActivePage().getActivePart(), selectionService.getSelection());
  }
  
  public TransactionalEditingDomain dispose() {
    TransactionalEditingDomain _xblockexpression = null;
    {
      final ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
      selectionService.removeSelectionListener(this);
      this.stateChangeListeners.clear();
      this.selectedObject = null;
      this.currentEditor = null;
      _xblockexpression = this.editingDomain = null;
    }
    return _xblockexpression;
  }
  
  public boolean addStateChangeListener(final Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain> listener) {
    return this.stateChangeListeners.add(listener);
  }
  
  @Override
  public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
    if ((part instanceof IEditorPart)) {
      this.currentEditor = ((IEditorPart)part);
      if ((selection instanceof IStructuredSelection)) {
        final Object element = ((IStructuredSelection) selection).getFirstElement();
        final FrameworkAdapters.IAdapter adapter = FrameworkAdapters.getAdapter(element);
        if ((adapter != null)) {
          this.handleSelection(adapter.getModel(element), adapter.getEditingDomain(element));
          return;
        }
      }
      this.editingDomain = null;
      this.handleSelection(null, null);
    }
  }
  
  private boolean handleSelection(final EObject object, final TransactionalEditingDomain editingDomain) {
    boolean _xifexpression = false;
    if ((object != this.selectedObject)) {
      boolean _xblockexpression = false;
      {
        boolean _notEquals = (!Objects.equal(this.selectedObject, null));
        if (_notEquals) {
          EList<Adapter> _eAdapters = this.selectedObject.eAdapters();
          _eAdapters.remove(this.adapter);
        }
        this.selectedObject = object;
        final Consumer<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>> _function = new Consumer<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>>() {
          @Override
          public void accept(final Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain> it) {
            it.apply(object, null, editingDomain);
          }
        };
        this.stateChangeListeners.forEach(_function);
        boolean _xifexpression_1 = false;
        if ((object != null)) {
          boolean _xblockexpression_1 = false;
          {
            this.adapter = new AdapterImpl() {
              @Override
              public void notifyChanged(final Notification msg) {
                int _eventType = msg.getEventType();
                boolean _notEquals = (_eventType != Notification.REMOVING_ADAPTER);
                if (_notEquals) {
                  final Consumer<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>> _function = new Consumer<Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain>>() {
                    @Override
                    public void accept(final Procedure3<? super EObject, ? super Notification, ? super TransactionalEditingDomain> it) {
                      it.apply(object, msg, editingDomain);
                    }
                  };
                  EObjectSelectionListener.this.stateChangeListeners.forEach(_function);
                }
              }
            };
            EList<Adapter> _eAdapters_1 = object.eAdapters();
            _xblockexpression_1 = _eAdapters_1.add(this.adapter);
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  @Pure
  public EObject getSelectedObject() {
    return this.selectedObject;
  }
  
  @Pure
  public IEditorPart getCurrentEditor() {
    return this.currentEditor;
  }
  
  @Pure
  public TransactionalEditingDomain getEditingDomain() {
    return this.editingDomain;
  }
}
