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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public final class FrameworkAdapters {
  public interface IAdapter {
    public abstract boolean appliesTo(final Object element);
    
    public abstract EObject getModel(final Object element);
    
    public abstract TransactionalEditingDomain getEditingDomain(final Object element);
  }
  
  private FrameworkAdapters() {
  }
  
  private static final ArrayList<FrameworkAdapters.IAdapter> adapters = new ArrayList<FrameworkAdapters.IAdapter>();
  
  public static boolean addAdapter(final FrameworkAdapters.IAdapter adapter) {
    boolean _xsynchronizedexpression = false;
    synchronized (FrameworkAdapters.adapters) {
      boolean _xifexpression = false;
      final Function1<FrameworkAdapters.IAdapter, Boolean> _function = new Function1<FrameworkAdapters.IAdapter, Boolean>() {
        @Override
        public Boolean apply(final FrameworkAdapters.IAdapter it) {
          Class<? extends FrameworkAdapters.IAdapter> _class = it.getClass();
          Class<? extends FrameworkAdapters.IAdapter> _class_1 = adapter.getClass();
          return Boolean.valueOf(Objects.equal(_class, _class_1));
        }
      };
      boolean _exists = IterableExtensions.<FrameworkAdapters.IAdapter>exists(FrameworkAdapters.adapters, _function);
      boolean _not = (!_exists);
      if (_not) {
        _xifexpression = FrameworkAdapters.adapters.add(adapter);
      }
      _xsynchronizedexpression = _xifexpression;
    }
    return _xsynchronizedexpression;
  }
  
  public static FrameworkAdapters.IAdapter getAdapter(final Object element) {
    FrameworkAdapters.IAdapter _xsynchronizedexpression = null;
    synchronized (FrameworkAdapters.adapters) {
      final Function1<FrameworkAdapters.IAdapter, Boolean> _function = new Function1<FrameworkAdapters.IAdapter, Boolean>() {
        @Override
        public Boolean apply(final FrameworkAdapters.IAdapter it) {
          return Boolean.valueOf(it.appliesTo(element));
        }
      };
      _xsynchronizedexpression = IterableExtensions.<FrameworkAdapters.IAdapter>findFirst(FrameworkAdapters.adapters, _function);
    }
    return _xsynchronizedexpression;
  }
}
