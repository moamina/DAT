/*
* 
*/
package DataArch.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DataArchVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "IoT_DataView.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID.equals(view.getType())) {
				return DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DataArch.DataArchPackage.eINSTANCE.getDataArchitecture().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DataArch.DataArchitecture) domainElement)) {
			return DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = DataArch.diagram.part.DataArchVisualIDRegistry.getModelID(containerView);
		if (!DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataArch".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			if (DataArch.DataArchPackage.eINSTANCE.getDataNode().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID;
			}
			break;
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			if (DataArch.DataArchPackage.eINSTANCE.getInMessagePort().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getOutMessagePort().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID;
			}
			break;
		case DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID:
			if (DataArch.DataArchPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getLogs().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getWordFile().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getPDFFile().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getTextFile().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getRelationalDB().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getXML().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getJSON().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getCSV().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getExcel().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getHTML().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getRDF().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getEDI().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getSMS().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getEmail().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getGPSData().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getSensorData().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getDocumentOriented().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getColumnOriented().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getGraphsDatabase().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getKeyValue().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getCloud().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getOn_Premise().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getFile_System().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getRelational().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getMultidimensional().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getRealTime().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getBatch().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getFilter().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getDescribe().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getDiagnose().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getPredict().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getPrescript().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getVisualize().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getQuery_Report().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getAPI().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getTranfrom().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getCompress().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getIntegrate().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getIdentify().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getValidate().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getClassify().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getSort().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getMerge().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getAggregate().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getCleaning().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getReduceNoise().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getMath_Operation().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getRetrieve().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getSave().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getArchive().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getGovern().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getReceiveData().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getSendData().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getGenerate().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getIngest().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getProcess().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID;
			}
			if (DataArch.DataArchPackage.eINSTANCE.getVerifyData().isSuperTypeOf(domainElement.eClass())) {
				return DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = DataArch.diagram.part.DataArchVisualIDRegistry.getModelID(containerView);
		if (!DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataArch".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.DataNodeNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.AudioNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.VideoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ImageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.LogsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.WordFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.PDFFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.TextFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.RelationalDBNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.XMLNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.JSONNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.CSVNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ExcelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.HTMLNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.RDFNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.EDINameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.SMSNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.EmailNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.GPSDataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.SensorDataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.DocumentOrientedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ColumnOrientedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.GraphsDatabaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.KeyValueNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.CloudNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.On_PremiseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.File_SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.RelationalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.MultidimensionalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.RealTimeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.BatchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.FilterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.DescribeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.DiagnoseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.PredictNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.PrescriptNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.VisualizeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.Query_ReportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.APINameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.TranfromNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.CompressNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.IntegrateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.IdentifyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ValidateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ClassifyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.SortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.MergeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.CleaningNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ReduceNoiseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.Math_OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.RetrieveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.SaveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ArchiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.GovernNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ReceiveDataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.SendDataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.GenerateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.IngestNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.AnalyzeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.VerifyDataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.InMessagePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.OutMessagePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.ConnectionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID:
			if (DataArch.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DataArch.DataArchPackage.eINSTANCE.getLink().isSuperTypeOf(domainElement.eClass())) {
			return DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID;
		}
		if (DataArch.DataArchPackage.eINSTANCE.getConnection().isSuperTypeOf(domainElement.eClass())) {
			return DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DataArch.DataArchitecture element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			return false;
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
		case DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return DataArch.diagram.part.DataArchVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
