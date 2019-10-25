package de.darmstadt.tu.crossing.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.misc.ContainerContentProvider;
import org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.DrillDownComposite;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.jface.util.BidiUtils;

public class CryptSLContainerSelectionGroup extends ContainerSelectionGroup {

	// show all projects by default
	private boolean showClosedProjects = true;

	// Last selection made by user
	private IStructuredSelection selection;

	CryptSLTreeViewer treeViewer;

	// sizing constants
	private static final int SIZING_SELECTION_PANE_WIDTH = 320;

	private static final int SIZING_SELECTION_PANE_HEIGHT = 300;

	public CryptSLContainerSelectionGroup(Composite parent, Listener listener, boolean allowNewContainerName,
			String message, boolean showClosedProjects) {
		super(parent, listener, allowNewContainerName, message, showClosedProjects);
		this.showClosedProjects = showClosedProjects;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setSelectedContainer(IContainer container) {
		List itemsToExpand = new ArrayList();
		IContainer parent = container.getParent();
		while (parent != null) {
			itemsToExpand.add(0, parent);
			parent = parent.getParent();
		}
		treeViewer.setExpandedElements(itemsToExpand.toArray());
		treeViewer.setSelection(new StructuredSelection(container), true);
	}

	/**
	 * @see org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup#createTreeViewer(
	 *      int) creates a drill down with a tree viewer. DrillDownComposite and
	 *      TreeViewer is changed to restrict user just to select "src" folder of
	 *      the selected project.
	 * @see de.darmstadt.tu.crossing.ui.wizard.CryptSLTreeViewer
	 * @see de.darmstadt.tu.crossing.ui.CryptSLDrillDownComposite
	 * 
	 */
	@Override
	protected void createTreeViewer(int heightHint) {
		// Create drill down.
		CryptSLDrillDownComposite drillDown = new CryptSLDrillDownComposite(this, SWT.BORDER);
		GridData spec = new GridData(SWT.FILL, SWT.FILL, true, true);
		spec.widthHint = SIZING_SELECTION_PANE_WIDTH;
		spec.heightHint = heightHint;
		drillDown.setLayoutData(spec);

		// Create tree viewer inside drill down.
		treeViewer = new CryptSLTreeViewer(drillDown, SWT.NONE);
		drillDown.setChildTree(treeViewer);
		ContainerContentProvider cp = new ContainerContentProvider();
		cp.showClosedProjects(showClosedProjects);
		treeViewer.setContentProvider(cp);
		treeViewer.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());
		treeViewer.setComparator(new ViewerComparator());
		treeViewer.setUseHashlookup(true);
		treeViewer.addSelectionChangedListener(event -> {
			this.selection = event.getStructuredSelection();
			containerSelectionChanged((IContainer) selection.getFirstElement()); // allow null
		});
		treeViewer.addDoubleClickListener(event -> {
			ISelection selection = event.getSelection();
			if (selection instanceof IStructuredSelection) {
				Object item = ((IStructuredSelection) selection).getFirstElement();
				if (item == null) {
					return;
				}
				if (treeViewer.getExpandedState(item)) {
					treeViewer.collapseToLevel(item, 1);
				} else {
					treeViewer.expandToLevel(item, 1);
				}
			}
		});
		// This has to be done after the viewer has been laid out
		treeViewer.setInput(ResourcesPlugin.getWorkspace());
	}

	/**
	 * 
	 * @return the selected folder
	 */
	public IFolder getSelectedFolder() {
		if (this.selection.getFirstElement() instanceof IFolder) {
			IFolder ifolder = (IFolder) this.selection.getFirstElement();
			return ifolder;
		}
		return null;
	}
}