/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.IModelMerger;

@SuppressWarnings("all")
public class GenericModelMerger implements IModelMerger {
  @Override
  public EObject findMatchingObject(final EObject model, final EObject object) {
    Resource _eResource = model.eResource();
    Resource _eResource_1 = object.eResource();
    final DefaultComparisonScope scope = new DefaultComparisonScope(_eResource, _eResource_1, null);
    final Comparison comparison = EMFCompare.builder().build().compare(scope);
    return comparison.getMatch(object).getLeft();
  }
  
  protected List<EObject> findMatchingObjects(final EObject model, final Collection<EObject> objects) {
    boolean _isEmpty = objects.isEmpty();
    if (_isEmpty) {
      throw new IllegalArgumentException();
    }
    Resource _eResource = model.eResource();
    Resource _eResource_1 = IterableExtensions.<EObject>head(objects).eResource();
    final DefaultComparisonScope scope = new DefaultComparisonScope(_eResource, _eResource_1, null);
    final Comparison comparison = EMFCompare.builder().build().compare(scope);
    final Function1<EObject, EObject> _function = new Function1<EObject, EObject>() {
      @Override
      public EObject apply(final EObject object) {
        return comparison.getMatch(object).getLeft();
      }
    };
    return IterableExtensions.<EObject>toList(IterableExtensions.<EObject>filterNull(IterableExtensions.<EObject, EObject>map(objects, _function)));
  }
  
  @Override
  public void merge(final EObject source, final EObject destination) {
    final DefaultComparisonScope scope = new DefaultComparisonScope(destination, source, null);
    final Comparison comparison = EMFCompare.builder().build().compare(scope);
    IMerger.Registry _mergerRegistry = EMFCompareRCPPlugin.getDefault().getMergerRegistry();
    final BatchMerger merger = new BatchMerger(_mergerRegistry);
    EList<Diff> _differences = comparison.getDifferences();
    BasicMonitor _basicMonitor = new BasicMonitor();
    merger.copyAllRightToLeft(_differences, _basicMonitor);
  }
  
  @Override
  public void apply(final Notification notification, final EObject destination) {
    final Object feature = notification.getFeature();
    if ((feature instanceof EStructuralFeature)) {
      GenericModelMerger.assertNot(((feature instanceof EReference) && ((EReference) feature).isContainer()));
      int _eventType = notification.getEventType();
      switch (_eventType) {
        case Notification.ADD:
          GenericModelMerger.assertThat(((EStructuralFeature)feature).isMany());
          Object _eGet = destination.eGet(((EStructuralFeature)feature));
          final Collection<Object> collection = ((Collection<Object>) _eGet);
          if ((feature instanceof EReference)) {
            boolean _isContainment = ((EReference)feature).isContainment();
            if (_isContainment) {
              Object _newValue = notification.getNewValue();
              collection.add(EcoreUtil.<EObject>copy(((EObject) _newValue)));
            } else {
              Object _newValue_1 = notification.getNewValue();
              collection.add(this.findMatchingObject(destination, ((EObject) _newValue_1)));
            }
          } else {
            collection.add(notification.getNewValue());
          }
          break;
        case Notification.ADD_MANY:
          GenericModelMerger.assertThat(((EStructuralFeature)feature).isMany());
          Object _eGet_1 = destination.eGet(((EStructuralFeature)feature));
          final Collection<Object> collection_1 = ((Collection<Object>) _eGet_1);
          if ((feature instanceof EReference)) {
            boolean _isContainment_1 = ((EReference)feature).isContainment();
            if (_isContainment_1) {
              Object _newValue_2 = notification.getNewValue();
              final Function1<EObject, EObject> _function = new Function1<EObject, EObject>() {
                @Override
                public EObject apply(final EObject it) {
                  return EcoreUtil.<EObject>copy(it);
                }
              };
              Iterables.<Object>addAll(collection_1, IterableExtensions.<EObject, EObject>map(((Collection<EObject>) _newValue_2), _function));
            } else {
              Object _newValue_3 = notification.getNewValue();
              collection_1.addAll(this.findMatchingObjects(destination, ((Collection<EObject>) _newValue_3)));
            }
          } else {
            Object _newValue_4 = notification.getNewValue();
            collection_1.addAll(((Collection<Object>) _newValue_4));
          }
          break;
        case Notification.REMOVE:
          GenericModelMerger.assertThat(((EStructuralFeature)feature).isMany());
          Object _eGet_2 = destination.eGet(((EStructuralFeature)feature));
          final Collection<Object> collection_2 = ((Collection<Object>) _eGet_2);
          if ((feature instanceof EReference)) {
            Object _oldValue = notification.getOldValue();
            collection_2.remove(this.findMatchingObject(destination, ((EObject) _oldValue)));
          } else {
            collection_2.remove(notification.getOldValue());
          }
          break;
        case Notification.REMOVE_MANY:
          GenericModelMerger.assertThat(((EStructuralFeature)feature).isMany());
          Object _eGet_3 = destination.eGet(((EStructuralFeature)feature));
          final Collection<Object> collection_3 = ((Collection<Object>) _eGet_3);
          if ((feature instanceof EReference)) {
            Object _oldValue_1 = notification.getOldValue();
            collection_3.removeAll(this.findMatchingObjects(destination, ((Collection<EObject>) _oldValue_1)));
          } else {
            Object _oldValue_2 = notification.getOldValue();
            collection_3.removeAll(((Collection<Object>) _oldValue_2));
          }
          break;
        case Notification.SET:
          GenericModelMerger.assertNot(((EStructuralFeature)feature).isMany());
          if ((feature instanceof EReference)) {
            boolean _isContainment_2 = ((EReference)feature).isContainment();
            if (_isContainment_2) {
              Object _newValue_5 = notification.getNewValue();
              destination.eSet(((EStructuralFeature)feature), EcoreUtil.<EObject>copy(((EObject) _newValue_5)));
            } else {
              Object _newValue_6 = notification.getNewValue();
              destination.eSet(((EStructuralFeature)feature), this.findMatchingObject(destination, ((EObject) _newValue_6)));
            }
          } else {
            destination.eSet(((EStructuralFeature)feature), notification.getNewValue());
          }
          break;
        case Notification.UNSET:
          GenericModelMerger.assertNot(((EStructuralFeature)feature).isMany());
          destination.eUnset(((EStructuralFeature)feature));
          break;
      }
    } else {
      throw new UnsupportedOperationException((("Feature " + feature) + " not supported."));
    }
  }
  
  private static void assertThat(final boolean b) {
    if ((!b)) {
      throw new AssertionError();
    }
  }
  
  private static void assertNot(final boolean b) {
    GenericModelMerger.assertThat((!b));
  }
}
