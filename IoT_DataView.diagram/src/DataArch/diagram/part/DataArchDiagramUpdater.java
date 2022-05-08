/*
* 
*/
package DataArch.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DataArchDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchNodeDescriptor> getSemanticChildren(View view) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			return getDataArchitecture_1000SemanticChildren(view);
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getDataNode_2001SemanticChildren(view);
		case DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID:
			return getDataNodeDataNodeBehaviouralElementsCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchNodeDescriptor> getDataArchitecture_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DataArch.DataArchitecture modelElement = (DataArch.DataArchitecture) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchNodeDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDataNodes().iterator(); it.hasNext();) {
			DataArch.DataNode childElement = (DataArch.DataNode) it.next();
			int visualID = DataArch.diagram.part.DataArchVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchNodeDescriptor> getDataNode_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DataArch.DataNode modelElement = (DataArch.DataNode) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchNodeDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			DataArch.MessagePort childElement = (DataArch.MessagePort) it.next();
			int visualID = DataArch.diagram.part.DataArchVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchNodeDescriptor> getDataNodeDataNodeBehaviouralElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataArch.DataNode modelElement = (DataArch.DataNode) containerView.getElement();
		LinkedList<DataArch.diagram.part.DataArchNodeDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBehaviouralElements().iterator(); it.hasNext();) {
			DataArch.BehaviouralElement childElement = (DataArch.BehaviouralElement) it.next();
			int visualID = DataArch.diagram.part.DataArchVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID) {
				result.add(new DataArch.diagram.part.DataArchNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getContainedLinks(View view) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			return getDataArchitecture_1000ContainedLinks(view);
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getDataNode_2001ContainedLinks(view);
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3001ContainedLinks(view);
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3002ContainedLinks(view);
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3003ContainedLinks(view);
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			return getLogs_3004ContainedLinks(view);
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			return getWordFile_3005ContainedLinks(view);
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			return getPDFFile_3006ContainedLinks(view);
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			return getTextFile_3007ContainedLinks(view);
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			return getRelationalDB_3008ContainedLinks(view);
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			return getXML_3009ContainedLinks(view);
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			return getJSON_3010ContainedLinks(view);
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			return getCSV_3011ContainedLinks(view);
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			return getExcel_3012ContainedLinks(view);
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			return getHTML_3013ContainedLinks(view);
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			return getRDF_3014ContainedLinks(view);
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			return getEDI_3015ContainedLinks(view);
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			return getSMS_3016ContainedLinks(view);
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			return getEmail_3017ContainedLinks(view);
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			return getGPSData_3018ContainedLinks(view);
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			return getSensorData_3019ContainedLinks(view);
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			return getDocumentOriented_3020ContainedLinks(view);
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			return getColumnOriented_3021ContainedLinks(view);
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			return getGraphsDatabase_3022ContainedLinks(view);
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			return getKeyValue_3023ContainedLinks(view);
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			return getCloud_3060ContainedLinks(view);
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			return getOn_Premise_3061ContainedLinks(view);
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			return getFile_System_3024ContainedLinks(view);
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			return getRelational_3025ContainedLinks(view);
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			return getMultidimensional_3026ContainedLinks(view);
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			return getRealTime_3027ContainedLinks(view);
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			return getBatch_3028ContainedLinks(view);
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			return getFilter_3029ContainedLinks(view);
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			return getDescribe_3030ContainedLinks(view);
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			return getDiagnose_3031ContainedLinks(view);
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			return getPredict_3032ContainedLinks(view);
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			return getPrescript_3033ContainedLinks(view);
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			return getVisualize_3034ContainedLinks(view);
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			return getQuery_Report_3035ContainedLinks(view);
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			return getAPI_3036ContainedLinks(view);
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			return getTranfrom_3037ContainedLinks(view);
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			return getCompress_3038ContainedLinks(view);
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			return getIntegrate_3039ContainedLinks(view);
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			return getIdentify_3040ContainedLinks(view);
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			return getValidate_3041ContainedLinks(view);
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			return getClassify_3042ContainedLinks(view);
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			return getSort_3043ContainedLinks(view);
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			return getMerge_3044ContainedLinks(view);
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_3045ContainedLinks(view);
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			return getCleaning_3046ContainedLinks(view);
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			return getReduceNoise_3047ContainedLinks(view);
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			return getMath_Operation_3048ContainedLinks(view);
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			return getRetrieve_3049ContainedLinks(view);
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			return getSave_3050ContainedLinks(view);
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			return getArchive_3051ContainedLinks(view);
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			return getGovern_3052ContainedLinks(view);
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			return getReceiveData_3053ContainedLinks(view);
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			return getSendData_3054ContainedLinks(view);
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			return getGenerate_3055ContainedLinks(view);
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			return getIngest_3062ContainedLinks(view);
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3056ContainedLinks(view);
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_3057ContainedLinks(view);
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			return getInMessagePort_3058ContainedLinks(view);
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return getOutMessagePort_3059ContainedLinks(view);
		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingLinks(View view) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getDataNode_2001IncomingLinks(view);
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3001IncomingLinks(view);
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3002IncomingLinks(view);
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3003IncomingLinks(view);
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			return getLogs_3004IncomingLinks(view);
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			return getWordFile_3005IncomingLinks(view);
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			return getPDFFile_3006IncomingLinks(view);
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			return getTextFile_3007IncomingLinks(view);
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			return getRelationalDB_3008IncomingLinks(view);
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			return getXML_3009IncomingLinks(view);
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			return getJSON_3010IncomingLinks(view);
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			return getCSV_3011IncomingLinks(view);
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			return getExcel_3012IncomingLinks(view);
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			return getHTML_3013IncomingLinks(view);
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			return getRDF_3014IncomingLinks(view);
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			return getEDI_3015IncomingLinks(view);
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			return getSMS_3016IncomingLinks(view);
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			return getEmail_3017IncomingLinks(view);
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			return getGPSData_3018IncomingLinks(view);
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			return getSensorData_3019IncomingLinks(view);
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			return getDocumentOriented_3020IncomingLinks(view);
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			return getColumnOriented_3021IncomingLinks(view);
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			return getGraphsDatabase_3022IncomingLinks(view);
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			return getKeyValue_3023IncomingLinks(view);
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			return getCloud_3060IncomingLinks(view);
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			return getOn_Premise_3061IncomingLinks(view);
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			return getFile_System_3024IncomingLinks(view);
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			return getRelational_3025IncomingLinks(view);
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			return getMultidimensional_3026IncomingLinks(view);
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			return getRealTime_3027IncomingLinks(view);
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			return getBatch_3028IncomingLinks(view);
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			return getFilter_3029IncomingLinks(view);
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			return getDescribe_3030IncomingLinks(view);
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			return getDiagnose_3031IncomingLinks(view);
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			return getPredict_3032IncomingLinks(view);
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			return getPrescript_3033IncomingLinks(view);
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			return getVisualize_3034IncomingLinks(view);
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			return getQuery_Report_3035IncomingLinks(view);
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			return getAPI_3036IncomingLinks(view);
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			return getTranfrom_3037IncomingLinks(view);
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			return getCompress_3038IncomingLinks(view);
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			return getIntegrate_3039IncomingLinks(view);
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			return getIdentify_3040IncomingLinks(view);
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			return getValidate_3041IncomingLinks(view);
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			return getClassify_3042IncomingLinks(view);
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			return getSort_3043IncomingLinks(view);
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			return getMerge_3044IncomingLinks(view);
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_3045IncomingLinks(view);
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			return getCleaning_3046IncomingLinks(view);
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			return getReduceNoise_3047IncomingLinks(view);
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			return getMath_Operation_3048IncomingLinks(view);
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			return getRetrieve_3049IncomingLinks(view);
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			return getSave_3050IncomingLinks(view);
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			return getArchive_3051IncomingLinks(view);
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			return getGovern_3052IncomingLinks(view);
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			return getReceiveData_3053IncomingLinks(view);
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			return getSendData_3054IncomingLinks(view);
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			return getGenerate_3055IncomingLinks(view);
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			return getIngest_3062IncomingLinks(view);
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3056IncomingLinks(view);
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_3057IncomingLinks(view);
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			return getInMessagePort_3058IncomingLinks(view);
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return getOutMessagePort_3059IncomingLinks(view);
		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingLinks(View view) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getDataNode_2001OutgoingLinks(view);
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3001OutgoingLinks(view);
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3002OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3003OutgoingLinks(view);
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			return getLogs_3004OutgoingLinks(view);
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			return getWordFile_3005OutgoingLinks(view);
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			return getPDFFile_3006OutgoingLinks(view);
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			return getTextFile_3007OutgoingLinks(view);
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			return getRelationalDB_3008OutgoingLinks(view);
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			return getXML_3009OutgoingLinks(view);
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			return getJSON_3010OutgoingLinks(view);
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			return getCSV_3011OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			return getExcel_3012OutgoingLinks(view);
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			return getHTML_3013OutgoingLinks(view);
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			return getRDF_3014OutgoingLinks(view);
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			return getEDI_3015OutgoingLinks(view);
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			return getSMS_3016OutgoingLinks(view);
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			return getEmail_3017OutgoingLinks(view);
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			return getGPSData_3018OutgoingLinks(view);
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			return getSensorData_3019OutgoingLinks(view);
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			return getDocumentOriented_3020OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			return getColumnOriented_3021OutgoingLinks(view);
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			return getGraphsDatabase_3022OutgoingLinks(view);
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			return getKeyValue_3023OutgoingLinks(view);
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			return getCloud_3060OutgoingLinks(view);
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			return getOn_Premise_3061OutgoingLinks(view);
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			return getFile_System_3024OutgoingLinks(view);
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			return getRelational_3025OutgoingLinks(view);
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			return getMultidimensional_3026OutgoingLinks(view);
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			return getRealTime_3027OutgoingLinks(view);
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			return getBatch_3028OutgoingLinks(view);
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			return getFilter_3029OutgoingLinks(view);
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			return getDescribe_3030OutgoingLinks(view);
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			return getDiagnose_3031OutgoingLinks(view);
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			return getPredict_3032OutgoingLinks(view);
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			return getPrescript_3033OutgoingLinks(view);
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			return getVisualize_3034OutgoingLinks(view);
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			return getQuery_Report_3035OutgoingLinks(view);
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			return getAPI_3036OutgoingLinks(view);
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			return getTranfrom_3037OutgoingLinks(view);
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			return getCompress_3038OutgoingLinks(view);
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			return getIntegrate_3039OutgoingLinks(view);
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			return getIdentify_3040OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			return getValidate_3041OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			return getClassify_3042OutgoingLinks(view);
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			return getSort_3043OutgoingLinks(view);
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			return getMerge_3044OutgoingLinks(view);
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_3045OutgoingLinks(view);
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			return getCleaning_3046OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			return getReduceNoise_3047OutgoingLinks(view);
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			return getMath_Operation_3048OutgoingLinks(view);
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			return getRetrieve_3049OutgoingLinks(view);
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			return getSave_3050OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			return getArchive_3051OutgoingLinks(view);
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			return getGovern_3052OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			return getReceiveData_3053OutgoingLinks(view);
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			return getSendData_3054OutgoingLinks(view);
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			return getGenerate_3055OutgoingLinks(view);
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			return getIngest_3062OutgoingLinks(view);
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3056OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_3057OutgoingLinks(view);
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			return getInMessagePort_3058OutgoingLinks(view);
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return getOutMessagePort_3059OutgoingLinks(view);
		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDataArchitecture_1000ContainedLinks(View view) {
		DataArch.DataArchitecture modelElement = (DataArch.DataArchitecture) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDataNode_2001ContainedLinks(View view) {
		DataArch.DataNode modelElement = (DataArch.DataNode) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAudio_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVideo_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getImage_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLogs_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getWordFile_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPDFFile_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTextFile_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelationalDB_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getXML_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getJSON_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCSV_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getExcel_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getHTML_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRDF_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEDI_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSMS_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEmail_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGPSData_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSensorData_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDocumentOriented_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getColumnOriented_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGraphsDatabase_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getKeyValue_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCloud_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOn_Premise_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFile_System_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelational_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMultidimensional_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRealTime_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getBatch_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFilter_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDescribe_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDiagnose_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPredict_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPrescript_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVisualize_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getQuery_Report_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAPI_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTranfrom_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCompress_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIntegrate_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIdentify_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getValidate_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getClassify_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSort_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMerge_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAggregate_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCleaning_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReduceNoise_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMath_Operation_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRetrieve_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSave_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getArchive_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGovern_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReceiveData_3053ContainedLinks(View view) {
		DataArch.ReceiveData modelElement = (DataArch.ReceiveData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ReceiveData_FromMessagePorts_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSendData_3054ContainedLinks(View view) {
		DataArch.SendData modelElement = (DataArch.SendData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SendData_ToMessagePorts_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGenerate_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIngest_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAnalyze_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getProcess_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getInMessagePort_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOutMessagePort_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getConnection_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDataNode_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAudio_3001IncomingLinks(View view) {
		DataArch.Audio modelElement = (DataArch.Audio) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVideo_3002IncomingLinks(View view) {
		DataArch.Video modelElement = (DataArch.Video) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getImage_3003IncomingLinks(View view) {
		DataArch.Image modelElement = (DataArch.Image) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLogs_3004IncomingLinks(View view) {
		DataArch.Logs modelElement = (DataArch.Logs) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getWordFile_3005IncomingLinks(View view) {
		DataArch.WordFile modelElement = (DataArch.WordFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPDFFile_3006IncomingLinks(View view) {
		DataArch.PDFFile modelElement = (DataArch.PDFFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTextFile_3007IncomingLinks(View view) {
		DataArch.TextFile modelElement = (DataArch.TextFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelationalDB_3008IncomingLinks(View view) {
		DataArch.RelationalDB modelElement = (DataArch.RelationalDB) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getXML_3009IncomingLinks(View view) {
		DataArch.XML modelElement = (DataArch.XML) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getJSON_3010IncomingLinks(View view) {
		DataArch.JSON modelElement = (DataArch.JSON) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCSV_3011IncomingLinks(View view) {
		DataArch.CSV modelElement = (DataArch.CSV) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getExcel_3012IncomingLinks(View view) {
		DataArch.Excel modelElement = (DataArch.Excel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getHTML_3013IncomingLinks(View view) {
		DataArch.HTML modelElement = (DataArch.HTML) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRDF_3014IncomingLinks(View view) {
		DataArch.RDF modelElement = (DataArch.RDF) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEDI_3015IncomingLinks(View view) {
		DataArch.EDI modelElement = (DataArch.EDI) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSMS_3016IncomingLinks(View view) {
		DataArch.SMS modelElement = (DataArch.SMS) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEmail_3017IncomingLinks(View view) {
		DataArch.Email modelElement = (DataArch.Email) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGPSData_3018IncomingLinks(View view) {
		DataArch.GPSData modelElement = (DataArch.GPSData) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSensorData_3019IncomingLinks(View view) {
		DataArch.SensorData modelElement = (DataArch.SensorData) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDocumentOriented_3020IncomingLinks(View view) {
		DataArch.DocumentOriented modelElement = (DataArch.DocumentOriented) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getColumnOriented_3021IncomingLinks(View view) {
		DataArch.ColumnOriented modelElement = (DataArch.ColumnOriented) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGraphsDatabase_3022IncomingLinks(View view) {
		DataArch.GraphsDatabase modelElement = (DataArch.GraphsDatabase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getKeyValue_3023IncomingLinks(View view) {
		DataArch.KeyValue modelElement = (DataArch.KeyValue) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCloud_3060IncomingLinks(View view) {
		DataArch.Cloud modelElement = (DataArch.Cloud) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOn_Premise_3061IncomingLinks(View view) {
		DataArch.On_Premise modelElement = (DataArch.On_Premise) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFile_System_3024IncomingLinks(View view) {
		DataArch.File_System modelElement = (DataArch.File_System) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelational_3025IncomingLinks(View view) {
		DataArch.Relational modelElement = (DataArch.Relational) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMultidimensional_3026IncomingLinks(View view) {
		DataArch.Multidimensional modelElement = (DataArch.Multidimensional) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRealTime_3027IncomingLinks(View view) {
		DataArch.RealTime modelElement = (DataArch.RealTime) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getBatch_3028IncomingLinks(View view) {
		DataArch.Batch modelElement = (DataArch.Batch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFilter_3029IncomingLinks(View view) {
		DataArch.Filter modelElement = (DataArch.Filter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDescribe_3030IncomingLinks(View view) {
		DataArch.Describe modelElement = (DataArch.Describe) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDiagnose_3031IncomingLinks(View view) {
		DataArch.Diagnose modelElement = (DataArch.Diagnose) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPredict_3032IncomingLinks(View view) {
		DataArch.Predict modelElement = (DataArch.Predict) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPrescript_3033IncomingLinks(View view) {
		DataArch.Prescript modelElement = (DataArch.Prescript) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVisualize_3034IncomingLinks(View view) {
		DataArch.Visualize modelElement = (DataArch.Visualize) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getQuery_Report_3035IncomingLinks(View view) {
		DataArch.Query_Report modelElement = (DataArch.Query_Report) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAPI_3036IncomingLinks(View view) {
		DataArch.API modelElement = (DataArch.API) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTranfrom_3037IncomingLinks(View view) {
		DataArch.Tranfrom modelElement = (DataArch.Tranfrom) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCompress_3038IncomingLinks(View view) {
		DataArch.Compress modelElement = (DataArch.Compress) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIntegrate_3039IncomingLinks(View view) {
		DataArch.Integrate modelElement = (DataArch.Integrate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIdentify_3040IncomingLinks(View view) {
		DataArch.Identify modelElement = (DataArch.Identify) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getValidate_3041IncomingLinks(View view) {
		DataArch.Validate modelElement = (DataArch.Validate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getClassify_3042IncomingLinks(View view) {
		DataArch.Classify modelElement = (DataArch.Classify) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSort_3043IncomingLinks(View view) {
		DataArch.Sort modelElement = (DataArch.Sort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMerge_3044IncomingLinks(View view) {
		DataArch.Merge modelElement = (DataArch.Merge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAggregate_3045IncomingLinks(View view) {
		DataArch.Aggregate modelElement = (DataArch.Aggregate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCleaning_3046IncomingLinks(View view) {
		DataArch.Cleaning modelElement = (DataArch.Cleaning) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReduceNoise_3047IncomingLinks(View view) {
		DataArch.ReduceNoise modelElement = (DataArch.ReduceNoise) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMath_Operation_3048IncomingLinks(View view) {
		DataArch.Math_Operation modelElement = (DataArch.Math_Operation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRetrieve_3049IncomingLinks(View view) {
		DataArch.Retrieve modelElement = (DataArch.Retrieve) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSave_3050IncomingLinks(View view) {
		DataArch.Save modelElement = (DataArch.Save) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getArchive_3051IncomingLinks(View view) {
		DataArch.Archive modelElement = (DataArch.Archive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGovern_3052IncomingLinks(View view) {
		DataArch.Govern modelElement = (DataArch.Govern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReceiveData_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSendData_3054IncomingLinks(View view) {
		DataArch.SendData modelElement = (DataArch.SendData) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGenerate_3055IncomingLinks(View view) {
		DataArch.Generate modelElement = (DataArch.Generate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIngest_3062IncomingLinks(View view) {
		DataArch.Ingest modelElement = (DataArch.Ingest) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAnalyze_3056IncomingLinks(View view) {
		DataArch.Analyze modelElement = (DataArch.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getProcess_3057IncomingLinks(View view) {
		DataArch.Process modelElement = (DataArch.Process) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getInMessagePort_3058IncomingLinks(View view) {
		DataArch.InMessagePort modelElement = (DataArch.InMessagePort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4002(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_ReceiveData_FromMessagePorts_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOutMessagePort_3059IncomingLinks(View view) {
		DataArch.OutMessagePort modelElement = (DataArch.OutMessagePort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SendData_ToMessagePorts_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getConnection_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDataNode_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAudio_3001OutgoingLinks(View view) {
		DataArch.Audio modelElement = (DataArch.Audio) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVideo_3002OutgoingLinks(View view) {
		DataArch.Video modelElement = (DataArch.Video) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getImage_3003OutgoingLinks(View view) {
		DataArch.Image modelElement = (DataArch.Image) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLogs_3004OutgoingLinks(View view) {
		DataArch.Logs modelElement = (DataArch.Logs) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getWordFile_3005OutgoingLinks(View view) {
		DataArch.WordFile modelElement = (DataArch.WordFile) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPDFFile_3006OutgoingLinks(View view) {
		DataArch.PDFFile modelElement = (DataArch.PDFFile) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTextFile_3007OutgoingLinks(View view) {
		DataArch.TextFile modelElement = (DataArch.TextFile) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelationalDB_3008OutgoingLinks(View view) {
		DataArch.RelationalDB modelElement = (DataArch.RelationalDB) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getXML_3009OutgoingLinks(View view) {
		DataArch.XML modelElement = (DataArch.XML) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getJSON_3010OutgoingLinks(View view) {
		DataArch.JSON modelElement = (DataArch.JSON) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCSV_3011OutgoingLinks(View view) {
		DataArch.CSV modelElement = (DataArch.CSV) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getExcel_3012OutgoingLinks(View view) {
		DataArch.Excel modelElement = (DataArch.Excel) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getHTML_3013OutgoingLinks(View view) {
		DataArch.HTML modelElement = (DataArch.HTML) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRDF_3014OutgoingLinks(View view) {
		DataArch.RDF modelElement = (DataArch.RDF) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEDI_3015OutgoingLinks(View view) {
		DataArch.EDI modelElement = (DataArch.EDI) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSMS_3016OutgoingLinks(View view) {
		DataArch.SMS modelElement = (DataArch.SMS) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getEmail_3017OutgoingLinks(View view) {
		DataArch.Email modelElement = (DataArch.Email) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGPSData_3018OutgoingLinks(View view) {
		DataArch.GPSData modelElement = (DataArch.GPSData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSensorData_3019OutgoingLinks(View view) {
		DataArch.SensorData modelElement = (DataArch.SensorData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDocumentOriented_3020OutgoingLinks(View view) {
		DataArch.DocumentOriented modelElement = (DataArch.DocumentOriented) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getColumnOriented_3021OutgoingLinks(View view) {
		DataArch.ColumnOriented modelElement = (DataArch.ColumnOriented) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGraphsDatabase_3022OutgoingLinks(View view) {
		DataArch.GraphsDatabase modelElement = (DataArch.GraphsDatabase) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getKeyValue_3023OutgoingLinks(View view) {
		DataArch.KeyValue modelElement = (DataArch.KeyValue) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCloud_3060OutgoingLinks(View view) {
		DataArch.Cloud modelElement = (DataArch.Cloud) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOn_Premise_3061OutgoingLinks(View view) {
		DataArch.On_Premise modelElement = (DataArch.On_Premise) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFile_System_3024OutgoingLinks(View view) {
		DataArch.File_System modelElement = (DataArch.File_System) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRelational_3025OutgoingLinks(View view) {
		DataArch.Relational modelElement = (DataArch.Relational) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMultidimensional_3026OutgoingLinks(View view) {
		DataArch.Multidimensional modelElement = (DataArch.Multidimensional) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRealTime_3027OutgoingLinks(View view) {
		DataArch.RealTime modelElement = (DataArch.RealTime) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getBatch_3028OutgoingLinks(View view) {
		DataArch.Batch modelElement = (DataArch.Batch) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getFilter_3029OutgoingLinks(View view) {
		DataArch.Filter modelElement = (DataArch.Filter) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDescribe_3030OutgoingLinks(View view) {
		DataArch.Describe modelElement = (DataArch.Describe) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getDiagnose_3031OutgoingLinks(View view) {
		DataArch.Diagnose modelElement = (DataArch.Diagnose) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPredict_3032OutgoingLinks(View view) {
		DataArch.Predict modelElement = (DataArch.Predict) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getPrescript_3033OutgoingLinks(View view) {
		DataArch.Prescript modelElement = (DataArch.Prescript) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getVisualize_3034OutgoingLinks(View view) {
		DataArch.Visualize modelElement = (DataArch.Visualize) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getQuery_Report_3035OutgoingLinks(View view) {
		DataArch.Query_Report modelElement = (DataArch.Query_Report) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAPI_3036OutgoingLinks(View view) {
		DataArch.API modelElement = (DataArch.API) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getTranfrom_3037OutgoingLinks(View view) {
		DataArch.Tranfrom modelElement = (DataArch.Tranfrom) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCompress_3038OutgoingLinks(View view) {
		DataArch.Compress modelElement = (DataArch.Compress) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIntegrate_3039OutgoingLinks(View view) {
		DataArch.Integrate modelElement = (DataArch.Integrate) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIdentify_3040OutgoingLinks(View view) {
		DataArch.Identify modelElement = (DataArch.Identify) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getValidate_3041OutgoingLinks(View view) {
		DataArch.Validate modelElement = (DataArch.Validate) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getClassify_3042OutgoingLinks(View view) {
		DataArch.Classify modelElement = (DataArch.Classify) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSort_3043OutgoingLinks(View view) {
		DataArch.Sort modelElement = (DataArch.Sort) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMerge_3044OutgoingLinks(View view) {
		DataArch.Merge modelElement = (DataArch.Merge) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAggregate_3045OutgoingLinks(View view) {
		DataArch.Aggregate modelElement = (DataArch.Aggregate) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getCleaning_3046OutgoingLinks(View view) {
		DataArch.Cleaning modelElement = (DataArch.Cleaning) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReduceNoise_3047OutgoingLinks(View view) {
		DataArch.ReduceNoise modelElement = (DataArch.ReduceNoise) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getMath_Operation_3048OutgoingLinks(View view) {
		DataArch.Math_Operation modelElement = (DataArch.Math_Operation) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getRetrieve_3049OutgoingLinks(View view) {
		DataArch.Retrieve modelElement = (DataArch.Retrieve) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSave_3050OutgoingLinks(View view) {
		DataArch.Save modelElement = (DataArch.Save) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getArchive_3051OutgoingLinks(View view) {
		DataArch.Archive modelElement = (DataArch.Archive) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGovern_3052OutgoingLinks(View view) {
		DataArch.Govern modelElement = (DataArch.Govern) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getReceiveData_3053OutgoingLinks(View view) {
		DataArch.ReceiveData modelElement = (DataArch.ReceiveData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ReceiveData_FromMessagePorts_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getSendData_3054OutgoingLinks(View view) {
		DataArch.SendData modelElement = (DataArch.SendData) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SendData_ToMessagePorts_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getGenerate_3055OutgoingLinks(View view) {
		DataArch.Generate modelElement = (DataArch.Generate) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getIngest_3062OutgoingLinks(View view) {
		DataArch.Ingest modelElement = (DataArch.Ingest) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getAnalyze_3056OutgoingLinks(View view) {
		DataArch.Analyze modelElement = (DataArch.Analyze) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getProcess_3057OutgoingLinks(View view) {
		DataArch.Process modelElement = (DataArch.Process) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getInMessagePort_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getOutMessagePort_3059OutgoingLinks(View view) {
		DataArch.OutMessagePort modelElement = (DataArch.OutMessagePort) view.getElement();
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataArch.diagram.part.DataArchLinkDescriptor> getConnection_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			DataArch.DataNode container) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> links = container.getBehaviouralElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataArch.Link) {
				continue;
			}
			DataArch.Link link = (DataArch.Link) linkObject;
			if (DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.Action dst = link.getTarget();
			DataArch.LinkableElement src = link.getSource();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, dst, link,
					DataArch.diagram.providers.DataArchElementTypes.Link_4001,
					DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4002(
			DataArch.DataArchitecture container) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> links = container.getDataConnection().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataArch.Connection) {
				continue;
			}
			DataArch.Connection link = (DataArch.Connection) linkObject;
			if (DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.InMessagePort dst = link.getTarget();
			DataArch.OutMessagePort src = link.getSource();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, dst, link,
					DataArch.diagram.providers.DataArchElementTypes.Connection_4002,
					DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(
			DataArch.Action target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DataArch.DataArchPackage.eINSTANCE.getLink_Target()
					|| false == setting.getEObject() instanceof DataArch.Link) {
				continue;
			}
			DataArch.Link link = (DataArch.Link) setting.getEObject();
			if (DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.LinkableElement src = link.getSource();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, target, link,
					DataArch.diagram.providers.DataArchElementTypes.Link_4001,
					DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4002(
			DataArch.InMessagePort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DataArch.DataArchPackage.eINSTANCE.getConnection_Target()
					|| false == setting.getEObject() instanceof DataArch.Connection) {
				continue;
			}
			DataArch.Connection link = (DataArch.Connection) setting.getEObject();
			if (DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.OutMessagePort src = link.getSource();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, target, link,
					DataArch.diagram.providers.DataArchElementTypes.Connection_4002,
					DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingFeatureModelFacetLinks_ReceiveData_FromMessagePorts_4003(
			DataArch.InMessagePort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataArch.DataArchPackage.eINSTANCE
					.getReceiveData_FromMessagePorts()) {
				result.add(new DataArch.diagram.part.DataArchLinkDescriptor(setting.getEObject(), target,
						DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003,
						DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingFeatureModelFacetLinks_SendData_ToMessagePorts_4004(
			DataArch.OutMessagePort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataArch.DataArchPackage.eINSTANCE.getSendData_ToMessagePorts()) {
				result.add(new DataArch.diagram.part.DataArchLinkDescriptor(setting.getEObject(), target,
						DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004,
						DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(
			DataArch.LinkableElement source) {
		DataArch.DataNode container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DataArch.DataNode) {
				container = (DataArch.DataNode) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> links = container.getBehaviouralElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataArch.Link) {
				continue;
			}
			DataArch.Link link = (DataArch.Link) linkObject;
			if (DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.Action dst = link.getTarget();
			DataArch.LinkableElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, dst, link,
					DataArch.diagram.providers.DataArchElementTypes.Link_4001,
					DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4002(
			DataArch.OutMessagePort source) {
		DataArch.DataArchitecture container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DataArch.DataArchitecture) {
				container = (DataArch.DataArchitecture) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> links = container.getDataConnection().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataArch.Connection) {
				continue;
			}
			DataArch.Connection link = (DataArch.Connection) linkObject;
			if (DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != DataArch.diagram.part.DataArchVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataArch.InMessagePort dst = link.getTarget();
			DataArch.OutMessagePort src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(src, dst, link,
					DataArch.diagram.providers.DataArchElementTypes.Connection_4002,
					DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingFeatureModelFacetLinks_ReceiveData_FromMessagePorts_4003(
			DataArch.ReceiveData source) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> destinations = source.getFromMessagePorts().iterator(); destinations.hasNext();) {
			DataArch.InMessagePort destination = (DataArch.InMessagePort) destinations.next();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(source, destination,
					DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003,
					DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingFeatureModelFacetLinks_SendData_ToMessagePorts_4004(
			DataArch.SendData source) {
		LinkedList<DataArch.diagram.part.DataArchLinkDescriptor> result = new LinkedList<DataArch.diagram.part.DataArchLinkDescriptor>();
		for (Iterator<?> destinations = source.getToMessagePorts().iterator(); destinations.hasNext();) {
			DataArch.OutMessagePort destination = (DataArch.OutMessagePort) destinations.next();
			result.add(new DataArch.diagram.part.DataArchLinkDescriptor(source, destination,
					DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004,
					DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DataArch.diagram.part.DataArchNodeDescriptor> getSemanticChildren(View view) {
			return DataArchDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataArch.diagram.part.DataArchLinkDescriptor> getContainedLinks(View view) {
			return DataArchDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataArch.diagram.part.DataArchLinkDescriptor> getIncomingLinks(View view) {
			return DataArchDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataArch.diagram.part.DataArchLinkDescriptor> getOutgoingLinks(View view) {
			return DataArchDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
