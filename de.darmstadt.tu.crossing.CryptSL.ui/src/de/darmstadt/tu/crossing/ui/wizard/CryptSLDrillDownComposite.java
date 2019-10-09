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

public class CryptSLDrillDownComposite extends DrillDownComposite  {

	private ToolBarManager toolBarMgr;

    private TreeViewer fChildTree;

    private DrillDownAdapter adapter;
    
    public CryptSLDrillDownComposite(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}
    /**
     * Sets the child viewer.  This method should only be called once, after the
     * viewer has been created.
     *
     * @param aViewer the new child viewer
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