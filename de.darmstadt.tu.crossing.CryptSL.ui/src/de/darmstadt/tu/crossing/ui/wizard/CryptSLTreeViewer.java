package de.darmstadt.tu.crossing.ui.wizard;

import java.util.LinkedList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ITreePathContentProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.part.DrillDownComposite;

public class CryptSLTreeViewer extends TreeViewer {

	public CryptSLTreeViewer(CryptSLDrillDownComposite drillDown, int none) {
		//
		super(drillDown, none);
	}

	@Override
	protected void internalInitializeTree(Control tree) {
		createChildren(tree);
		internalExpandToLevel(tree, 0);
	}

	/**
	 * {@see org.eclipse.jface.viewers.TreeViewer#createChildren(Widget)}
	 * createchildren (Widget, boolean) is changed to createChild(Widget,boolean)
	 * 
	 */
	@Override
	protected void createChildren(final Widget widget) {
		createChild(widget, true);
	}

	/**
	 * {@see org.eclipse.jface.viewers.TreeViewer#internalExpandToLevel(Widget,int)}
	 * createchildren (Widget, boolean) is changed to createChild(Widget,boolean)
	 * 
	 */
	@Override
	protected void internalExpandToLevel(Widget widget, int level) {
		if (level == ALL_LEVELS || level > 0) {
			if (widget instanceof Item && widget.getData() != null
					&& !isExpandable((Item) widget, null, widget.getData())) {
				return;
			}
			createChild(widget, false);
			if (widget instanceof Item) {
				setExpanded((Item) widget, true);
			}
			if (level == ALL_LEVELS || level > 1) {
				Item[] children = getChildren(widget);
				if (children != null) {
					int newLevel = (level == ALL_LEVELS ? ALL_LEVELS : level - 1);
					for (Item element : children) {
						internalExpandToLevel(element, newLevel);
					}
				}
			}
		}
	}

	/**
	 * {@see org.eclipse.jface.viewers.TreeViewer#createChildren(Widget,boolean)}
	 * only creates "src" folder as a child of parent project
	 * 
	 */
	void createChild(final Widget widget, boolean materialize) {
		boolean oldBusy = isBusy();
		setBusy(true);
		try {
			final Item[] items = getChildren(widget);
			if (items != null && items.length > 0) {
				Object data = items[0].getData();
				if (data != null) {
					return; // children already there!
				}
			}

			if (items != null) {
				for (Item item : items) {
					if (item.getData() != null) {
						disassociate(item);
						Assert.isTrue(item.getData() == null, "Second or later child is non -null");//$NON-NLS-1$

					}
					item.dispose();
				}
			}
			Object d = widget.getData();
			if (d != null) {
				Object parentElement = d;
				Object[] children;
				if (isTreePathContentProvider() && widget instanceof Item) {
					TreePath path = getTreePathFromItem((Item) widget);
					children = getSortedChildren(path);
				} else {
					children = getSortedChildren(parentElement);
				}

				for (Object element : children) {
					if (d.equals(getRoot())) {
						createTreeItem(widget, element, -1);
					} else {
						IFolder iFolder = (IFolder) element;
						if (iFolder.getName().equals("src")) {
							createTreeItem(widget, element, -1);
						}
					}
				}
			}
		} finally {
			setBusy(oldBusy);
		}
	}

	private boolean isExpandable(Item item, TreePath parentPath, Object element) {
		Object elementOrTreePath = element;
		if (isTreePathContentProvider()) {
			if (parentPath != null) {
				elementOrTreePath = parentPath.createChildPath(element);
			} else {
				elementOrTreePath = getTreePathFromItem(item);
			}
		}
		return isExpandable(elementOrTreePath);
	}

	private boolean isTreePathContentProvider() {
		return getContentProvider() instanceof ITreePathContentProvider;
	}
}