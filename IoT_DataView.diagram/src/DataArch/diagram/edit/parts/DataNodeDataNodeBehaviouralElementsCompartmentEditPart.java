/*
 * 
 */
package DataArch.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class DataNodeDataNodeBehaviouralElementsCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7001;

	/**
	* @generated
	*/
	public DataNodeDataNodeBehaviouralElementsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return DataArch.diagram.part.Messages.DataNodeDataNodeBehaviouralElementsCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DataArch.diagram.edit.policies.DataNodeDataNodeBehaviouralElementsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				DataArch.diagram.part.DataArchVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DataArch.diagram.edit.policies.DataNodeDataNodeBehaviouralElementsCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DataArch.diagram.providers.DataArchElementTypes.Audio_3001) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Video_3002) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Image_3003) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Logs_3004) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.WordFile_3005) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.TextFile_3007) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.XML_3009) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.JSON_3010) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.CSV_3011) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Excel_3012) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.HTML_3013) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.RDF_3014) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.EDI_3015) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.SMS_3016) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Email_3017) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.GPSData_3018) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.SensorData_3019) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Cloud_3024) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.On_Premise_3025) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.File_System_3026) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Relational_3027) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3028) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.RealTime_3029) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Batch_3030) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Filter_3031) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Describe_3032) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Diagnose_3033) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Predict_3034) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Prescript_3035) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Visualize_3036) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Query_Report_3037) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.API_3038) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3039) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Compress_3040) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Integrate_3041) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Identify_3042) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Validate_3043) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Classify_3044) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Sort_3045) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Merge_3046) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Aggregate_3047) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Cleaning_3048) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3049) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3050) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Retrieve_3051) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Save_3052) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Archive_3053) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Govern_3054) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3055) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.SendData_3056) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Generate_3057) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Ingest_3058) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Analyze_3059) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.Process_3060) {
				return this;
			}
			if (type == DataArch.diagram.providers.DataArchElementTypes.VerifyData_3061) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(DataArch.diagram.providers.DataArchElementTypes.Link_4001))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
