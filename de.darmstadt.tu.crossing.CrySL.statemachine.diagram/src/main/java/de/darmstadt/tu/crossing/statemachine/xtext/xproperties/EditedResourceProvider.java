/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.darmstadt.tu.crossing.statemachine.xtext.xproperties;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class EditedResourceProvider implements IEditedResourceProvider {
  @Inject
  private FileExtensionProvider fileExtensionProvider;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private XtextResource resource;
  
  @Override
  public XtextResource createResource() {
    final XtextResourceSet resourceSet = new XtextResourceSet();
    String _head = IterableExtensions.<String>head(this.fileExtensionProvider.getFileExtensions());
    String _plus = ("embeddedResource." + _head);
    final URI uri = URI.createURI(_plus);
    Resource _createResource = resourceSet.createResource(uri);
    this.resource = ((XtextResource) _createResource);
    return this.resource;
  }
  
  @Pure
  public XtextResource getResource() {
    return this.resource;
  }
}
