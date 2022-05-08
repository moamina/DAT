/*
* 
*/
package DataArch.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class DataArchNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DataArchNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DataArch.diagram.navigator.DataArchNavigatorItem> result = new ArrayList<DataArch.diagram.navigator.DataArchNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof DataArch.diagram.navigator.DataArchNavigatorGroup) {
			DataArch.diagram.navigator.DataArchNavigatorGroup group = (DataArch.diagram.navigator.DataArchNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DataArch.diagram.navigator.DataArchNavigatorItem) {
			DataArch.diagram.navigator.DataArchNavigatorItem navigatorItem = (DataArch.diagram.navigator.DataArchNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {

		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup links = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_DataArchitecture_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry.getType(
							DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DataArch.diagram.part.DataArchVisualIDRegistry
					.getType(DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Audio_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Audio_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Video_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Video_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Image_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Image_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Logs_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Logs_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_WordFile_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_WordFile_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_PDFFile_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_PDFFile_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_TextFile_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_TextFile_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RelationalDB_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RelationalDB_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_XML_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_XML_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_JSON_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_JSON_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_CSV_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_CSV_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Excel_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Excel_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_HTML_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_HTML_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RDF_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RDF_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_EDI_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_EDI_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SMS_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SMS_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Email_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Email_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_GPSData_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_GPSData_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SensorData_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SensorData_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_DocumentOriented_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_DocumentOriented_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ColumnOriented_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ColumnOriented_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_GraphsDatabase_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_GraphsDatabase_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_KeyValue_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_KeyValue_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_File_System_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_File_System_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Relational_3025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Relational_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Multidimensional_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Multidimensional_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RealTime_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_RealTime_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Batch_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Batch_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Filter_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Filter_3029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Describe_3030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Describe_3030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Diagnose_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Diagnose_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Predict_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Predict_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Prescript_3033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Prescript_3033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Visualize_3034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Visualize_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Query_Report_3035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Query_Report_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_API_3036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_API_3036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Tranfrom_3037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Tranfrom_3037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Compress_3038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Compress_3038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Integrate_3039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Integrate_3039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Identify_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Identify_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Validate_3041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Validate_3041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Classify_3042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Classify_3042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Sort_3043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Sort_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Merge_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Merge_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Aggregate_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Aggregate_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Cleaning_3046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Cleaning_3046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ReduceNoise_3047_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ReduceNoise_3047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Math_Operation_3048_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Math_Operation_3048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Retrieve_3049_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Retrieve_3049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Save_3050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Save_3050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Archive_3051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Archive_3051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Govern_3052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Govern_3052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ReceiveData_3053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SendData_3054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SendData_3054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Generate_3055_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Generate_3055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Analyze_3056_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Analyze_3056_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Process_3057_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Process_3057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_InMessagePort_3058_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_OutMessagePort_3059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_OutMessagePort_3059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Cloud_3060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Cloud_3060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_On_Premise_3061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_On_Premise_3061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup incominglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Ingest_3062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup outgoinglinks = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Ingest_3062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup target = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Link_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup source = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Link_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup target = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Connection_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup source = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_Connection_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup target = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ReceiveDataFromMessagePorts_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup source = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_ReceiveDataFromMessagePorts_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID: {
			LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem> result = new LinkedList<DataArch.diagram.navigator.DataArchAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataArch.diagram.navigator.DataArchNavigatorGroup target = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SendDataToMessagePorts_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataArch.diagram.navigator.DataArchNavigatorGroup source = new DataArch.diagram.navigator.DataArchNavigatorGroup(
					DataArch.diagram.part.Messages.NavigatorGroupName_SendDataToMessagePorts_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataArch.diagram.part.DataArchVisualIDRegistry
							.getType(DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID
				.equals(DataArch.diagram.part.DataArchVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DataArch.diagram.navigator.DataArchNavigatorItem> createNavigatorItems(Collection<View> views,
			Object parent, boolean isLeafs) {
		ArrayList<DataArch.diagram.navigator.DataArchNavigatorItem> result = new ArrayList<DataArch.diagram.navigator.DataArchNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DataArch.diagram.navigator.DataArchNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DataArch.diagram.navigator.DataArchNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DataArch.diagram.navigator.DataArchAbstractNavigatorItem) {
			DataArch.diagram.navigator.DataArchAbstractNavigatorItem abstractNavigatorItem = (DataArch.diagram.navigator.DataArchAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
