/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.inject.ImplementedBy;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import de.darmstadt.tu.crossing.statemachine.xtext.xproperties.GenericModelMerger;

@ImplementedBy(GenericModelMerger.class)
@SuppressWarnings("all")
public interface IModelMerger {
  public abstract EObject findMatchingObject(final EObject model, final EObject object);
  
  public abstract void merge(final EObject source, final EObject destination);
  
  public abstract void apply(final Notification notification, final EObject destination);
}
