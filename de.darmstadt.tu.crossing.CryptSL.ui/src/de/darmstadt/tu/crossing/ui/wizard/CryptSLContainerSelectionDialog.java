package de.darmstadt.tu.crossing.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.ISelectionValidator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup;

public class CryptSLContainerSelectionDialog extends SelectionDialog {
	/**
	 * mirrored from 
	 * { @see org.eclipse.jface.dialogs.ContainerSelectionDialog}
	 * 
	 */
	private static final String EMPTY_STRING = ""; //$NON-NLS-1$

	// the widget group;
	CryptSLContainerSelectionGroup group;

	// the root resource to populate the viewer with
	private IContainer initialSelection;

	// allow the user to type in a new container name
	private boolean allowNewContainerName = false;

	// the validation message
	Label statusMessage;

	// for validating the selection
	ISelectionValidator validator;

	// show closed projects by default
	private boolean showClosedProjects = true;

	/**
	 * {@inheritDoc}
	 */
	public CryptSLContainerSelectionDialog(Shell parentShell, IContainer initialRoot, boolean allowNewContainerName,
			String message) {
		super(parentShell);
		setTitle(IDEWorkbenchMessages.ContainerSelectionDialog_title);
		this.initialSelection = initialRoot;
		this.allowNewContainerName = allowNewContainerName;
		if (message != null) {
			setMessage(message);
		} else {
			setMessage(IDEWorkbenchMessages.ContainerSelectionDialog_message);
		}
		setShellStyle(getShellStyle() | SWT.SHEET);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(shell, IIDEHelpContextIds.CONTAINER_SELECTION_DIALOG);
	}

	/**
	 * {@see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.
	 *      Composite)} 
	 *      Creates and returns the contents of the upper part of this dialog.
	 *      ContainerSelectionGroup is changed to CryptSLContainerSelectionGroup to restrict the user to just select "src"
	 *      folder of project as container.
	 * 
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// create composite
		Composite area = (Composite) super.createDialogArea(parent);

		// check whether container selection is done by the user. If not disable "OK"
		// button.
		Listener listener = event -> {
			if (group.getSelectedFolder() != null) {
				if (getOkButton() != null) {
					getOkButton().setEnabled(true);
				}
			} else {
				if (getOkButton() != null) {
					getOkButton().setEnabled(false);
				}
			}
		};

		// container selection group
		group = new CryptSLContainerSelectionGroup(area, listener, allowNewContainerName, getMessage(),
				showClosedProjects);
		if (initialSelection != null) {
			group.setSelectedContainer(initialSelection);
		}

		statusMessage = new Label(area, SWT.WRAP);
		statusMessage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		statusMessage.setText(" \n "); //$NON-NLS-1$
		statusMessage.setFont(parent.getFont());
		return dialogArea;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void okPressed() {
		List chosenContainerPathList = new ArrayList();
		IPath returnValue = group.getContainerFullPath();
		if (returnValue != null) {
			chosenContainerPathList.add(returnValue);
		}
		setResult(chosenContainerPathList);
		super.okPressed();
	}

	public void setValidator(ISelectionValidator validator) {
		this.validator = validator;
	}

	public void showClosedProjects(boolean show) {
		this.showClosedProjects = show;
	}

}