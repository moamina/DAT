/*
* 
*/
package DataArch.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataNodeDataNodeBehaviouralElementsCompartmentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	* @generated
	*/
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	* @generated
	*/
	protected EStructuralFeature getFeatureToSynchronize() {
		return DataArch.DataArchPackage.eINSTANCE.getDataNode_BehaviouralElements();
	}

	/**
	* @generated
	*/
	@SuppressWarnings("rawtypes")

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<DataArch.diagram.part.DataArchNodeDescriptor> childDescriptors = DataArch.diagram.part.DataArchDiagramUpdater
				.getDataNodeDataNodeBehaviouralElementsCompartment_7001SemanticChildren(viewObject);
		for (DataArch.diagram.part.DataArchNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<DataArch.diagram.part.DataArchNodeDescriptor> childDescriptors = DataArch.diagram.part.DataArchDiagramUpdater
				.getDataNodeDataNodeBehaviouralElementsCompartment_7001SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<DataArch.diagram.part.DataArchNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			DataArch.diagram.part.DataArchNodeDescriptor next = descriptorsIterator.next();
			String hint = DataArch.diagram.part.DataArchVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (DataArch.diagram.part.DataArchNodeDescriptor next : childDescriptors) {
			String hint = DataArch.diagram.part.DataArchVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
