package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.DrillDownComposite;

public class CryptSLDrillDownComposite extends DrillDownComposite {
	private ToolBarManager toolBarMgr;

	private TreeViewer fChildTree;

	private DrillDownAdapter adapter;

	public CryptSLDrillDownComposite(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * { @see org.eclipse.ui.part.DrillDownComposite#setChildTree(TreeViewer)} 
	 *      navigation buttons are removed
	 */
	@Override
	public void setChildTree(TreeViewer aViewer) {
		// Save viewer.
		fChildTree = aViewer;

		// Create adapter.
		adapter = new DrillDownAdapter(fChildTree);

		// Set tree layout.
		fChildTree.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		layout();
	}
}