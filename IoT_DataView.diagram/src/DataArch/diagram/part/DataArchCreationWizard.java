/*
 * 
 */
package DataArch.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class DataArchCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected DataArch.diagram.part.DataArchCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected DataArch.diagram.part.DataArchCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(DataArch.diagram.part.Messages.DataArchCreationWizardTitle);
		setDefaultPageImageDescriptor(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDataArchWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new DataArch.diagram.part.DataArchCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"dataarch_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(DataArch.diagram.part.Messages.DataArchCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(DataArch.diagram.part.Messages.DataArchCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new DataArch.diagram.part.DataArchCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"dataarch") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".dataarch_diagram".length()); //$NON-NLS-1$
					setFileName(DataArch.diagram.part.DataArchDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "dataarch")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(DataArch.diagram.part.Messages.DataArchCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(DataArch.diagram.part.Messages.DataArchCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = DataArch.diagram.part.DataArchDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						DataArch.diagram.part.DataArchDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								DataArch.diagram.part.Messages.DataArchCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						DataArch.diagram.part.Messages.DataArchCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
