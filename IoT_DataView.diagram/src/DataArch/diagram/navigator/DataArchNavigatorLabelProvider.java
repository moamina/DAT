/*
* 
*/
package DataArch.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DataArchNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DataArch.diagram.navigator.DataArchNavigatorItem
				&& !isOwnView(((DataArch.diagram.navigator.DataArchNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DataArch.diagram.navigator.DataArchNavigatorGroup) {
			DataArch.diagram.navigator.DataArchNavigatorGroup group = (DataArch.diagram.navigator.DataArchNavigatorGroup) element;
			return DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DataArch.diagram.navigator.DataArchNavigatorItem) {
			DataArch.diagram.navigator.DataArchNavigatorItem navigatorItem = (DataArch.diagram.navigator.DataArchNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?DataArch?DataArchitecture", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.DataArchitecture_1000);
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?DataArch?DataNode", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.DataNode_2001);
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Audio", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Audio_3001);
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Video", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Video_3002);
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Image", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Image_3003);
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Logs", DataArch.diagram.providers.DataArchElementTypes.Logs_3004); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?WordFile", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.WordFile_3005);
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?PDFFile", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006);
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?TextFile", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.TextFile_3007);
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?RelationalDB", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008);
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?XML", DataArch.diagram.providers.DataArchElementTypes.XML_3009); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?JSON", DataArch.diagram.providers.DataArchElementTypes.JSON_3010); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?CSV", DataArch.diagram.providers.DataArchElementTypes.CSV_3011); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Excel", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Excel_3012);
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?HTML", DataArch.diagram.providers.DataArchElementTypes.HTML_3013); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?RDF", DataArch.diagram.providers.DataArchElementTypes.RDF_3014); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?EDI", DataArch.diagram.providers.DataArchElementTypes.EDI_3015); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?SMS", DataArch.diagram.providers.DataArchElementTypes.SMS_3016); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Email", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Email_3017);
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?GPSData", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.GPSData_3018);
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?SensorData", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.SensorData_3019);
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?DocumentOriented", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020);
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?ColumnOriented", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021);
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?GraphsDatabase", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022);
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?KeyValue", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023);
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Cloud", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Cloud_3024);
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?On_Premise", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.On_Premise_3025);
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?File_System", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.File_System_3026);
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Relational", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Relational_3027);
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Multidimensional", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3028);
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?RealTime", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.RealTime_3029);
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Batch", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Batch_3030);
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Filter", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Filter_3031);
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Describe", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Describe_3032);
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Diagnose", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Diagnose_3033);
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Predict", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Predict_3034);
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Prescript", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Prescript_3035);
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Visualize", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Visualize_3036);
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Query_Report", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Query_Report_3037);
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?API", DataArch.diagram.providers.DataArchElementTypes.API_3038); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Tranfrom", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3039);
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Compress", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Compress_3040);
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Integrate", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Integrate_3041);
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Identify", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Identify_3042);
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Validate", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Validate_3043);
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Classify", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Classify_3044);
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Sort", DataArch.diagram.providers.DataArchElementTypes.Sort_3045); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Merge", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Merge_3046);
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Aggregate", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Aggregate_3047);
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Cleaning", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Cleaning_3048);
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?ReduceNoise", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3049);
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Math_Operation", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3050);
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Retrieve", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Retrieve_3051);
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Save", DataArch.diagram.providers.DataArchElementTypes.Save_3052); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Archive", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Archive_3053);
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Govern", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Govern_3054);
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?ReceiveData", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3055);
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?SendData", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.SendData_3056);
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Generate", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Generate_3057);
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Ingest", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Ingest_3058);
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Analyze", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Analyze_3059);
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?Process", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Process_3060);
		case DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?VerifyData", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.VerifyData_3061);
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?InMessagePort", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3062);
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?DataArch?OutMessagePort", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3063);
		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?DataArch?Link", DataArch.diagram.providers.DataArchElementTypes.Link_4001); //$NON-NLS-1$
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?DataArch?Connection", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.Connection_4002);
		case DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?DataArch?ReceiveData?fromMessagePorts", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003);
		case DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?DataArch?SendData?toMessagePorts", //$NON-NLS-1$
					DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DataArch.diagram.providers.DataArchElementTypes.isKnownElementType(elementType)) {
			image = DataArch.diagram.providers.DataArchElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DataArch.diagram.navigator.DataArchNavigatorGroup) {
			DataArch.diagram.navigator.DataArchNavigatorGroup group = (DataArch.diagram.navigator.DataArchNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DataArch.diagram.navigator.DataArchNavigatorItem) {
			DataArch.diagram.navigator.DataArchNavigatorItem navigatorItem = (DataArch.diagram.navigator.DataArchNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {
		case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
			return getDataArchitecture_1000Text(view);
		case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
			return getDataNode_2001Text(view);
		case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3001Text(view);
		case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3002Text(view);
		case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3003Text(view);
		case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
			return getLogs_3004Text(view);
		case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
			return getWordFile_3005Text(view);
		case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
			return getPDFFile_3006Text(view);
		case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
			return getTextFile_3007Text(view);
		case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
			return getRelationalDB_3008Text(view);
		case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
			return getXML_3009Text(view);
		case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
			return getJSON_3010Text(view);
		case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
			return getCSV_3011Text(view);
		case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
			return getExcel_3012Text(view);
		case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
			return getHTML_3013Text(view);
		case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
			return getRDF_3014Text(view);
		case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
			return getEDI_3015Text(view);
		case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
			return getSMS_3016Text(view);
		case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
			return getEmail_3017Text(view);
		case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
			return getGPSData_3018Text(view);
		case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
			return getSensorData_3019Text(view);
		case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
			return getDocumentOriented_3020Text(view);
		case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
			return getColumnOriented_3021Text(view);
		case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
			return getGraphsDatabase_3022Text(view);
		case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
			return getKeyValue_3023Text(view);
		case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
			return getCloud_3024Text(view);
		case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
			return getOn_Premise_3025Text(view);
		case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
			return getFile_System_3026Text(view);
		case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
			return getRelational_3027Text(view);
		case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
			return getMultidimensional_3028Text(view);
		case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
			return getRealTime_3029Text(view);
		case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
			return getBatch_3030Text(view);
		case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
			return getFilter_3031Text(view);
		case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
			return getDescribe_3032Text(view);
		case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
			return getDiagnose_3033Text(view);
		case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
			return getPredict_3034Text(view);
		case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
			return getPrescript_3035Text(view);
		case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
			return getVisualize_3036Text(view);
		case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
			return getQuery_Report_3037Text(view);
		case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
			return getAPI_3038Text(view);
		case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
			return getTranfrom_3039Text(view);
		case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
			return getCompress_3040Text(view);
		case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
			return getIntegrate_3041Text(view);
		case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
			return getIdentify_3042Text(view);
		case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
			return getValidate_3043Text(view);
		case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
			return getClassify_3044Text(view);
		case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
			return getSort_3045Text(view);
		case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
			return getMerge_3046Text(view);
		case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_3047Text(view);
		case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
			return getCleaning_3048Text(view);
		case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
			return getReduceNoise_3049Text(view);
		case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
			return getMath_Operation_3050Text(view);
		case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
			return getRetrieve_3051Text(view);
		case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
			return getSave_3052Text(view);
		case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
			return getArchive_3053Text(view);
		case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
			return getGovern_3054Text(view);
		case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
			return getReceiveData_3055Text(view);
		case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
			return getSendData_3056Text(view);
		case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
			return getGenerate_3057Text(view);
		case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
			return getIngest_3058Text(view);
		case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3059Text(view);
		case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return getProcess_3060Text(view);
		case DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID:
			return getVerifyData_3061Text(view);
		case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
			return getInMessagePort_3062Text(view);
		case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
			return getOutMessagePort_3063Text(view);
		case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4002Text(view);
		case DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID:
			return getReceiveDataFromMessagePorts_4003Text(view);
		case DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID:
			return getSendDataToMessagePorts_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDataArchitecture_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDataNode_2001Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.DataNode_2001,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.DataNodeNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAudio_3001Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Audio_3001,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.AudioNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVideo_3002Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Video_3002,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.VideoNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3003Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Image_3003,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ImageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLogs_3004Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Logs_3004,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.LogsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWordFile_3005Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.WordFile_3005,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.WordFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPDFFile_3006Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.PDFFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextFile_3007Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.TextFile_3007,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.TextFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelationalDB_3008Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.RelationalDBNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getXML_3009Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.XML_3009,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.XMLNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJSON_3010Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.JSON_3010,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.JSONNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCSV_3011Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.CSV_3011,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.CSVNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExcel_3012Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Excel_3012,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ExcelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHTML_3013Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.HTML_3013,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.HTMLNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRDF_3014Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.RDF_3014,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.RDFNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEDI_3015Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.EDI_3015,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.EDINameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSMS_3016Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.SMS_3016,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.SMSNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEmail_3017Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Email_3017,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.EmailNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGPSData_3018Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.GPSData_3018,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.GPSDataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSensorData_3019Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.SensorData_3019,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.SensorDataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDocumentOriented_3020Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.DocumentOrientedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumnOriented_3021Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ColumnOrientedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGraphsDatabase_3022Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.GraphsDatabaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKeyValue_3023Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.KeyValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCloud_3024Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Cloud_3024,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.CloudNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOn_Premise_3025Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.On_Premise_3025,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.On_PremiseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFile_System_3026Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.File_System_3026,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.File_SystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelational_3027Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Relational_3027,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.RelationalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMultidimensional_3028Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3028,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.MultidimensionalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRealTime_3029Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.RealTime_3029,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.RealTimeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBatch_3030Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Batch_3030,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.BatchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFilter_3031Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Filter_3031,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.FilterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescribe_3032Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Describe_3032,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.DescribeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDiagnose_3033Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Diagnose_3033,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.DiagnoseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredict_3034Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Predict_3034,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.PredictNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrescript_3035Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Prescript_3035,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.PrescriptNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualize_3036Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Visualize_3036,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.VisualizeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQuery_Report_3037Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Query_Report_3037,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.Query_ReportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAPI_3038Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.API_3038,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.APINameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTranfrom_3039Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3039,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.TranfromNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCompress_3040Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Compress_3040,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.CompressNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrate_3041Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Integrate_3041,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.IntegrateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIdentify_3042Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Identify_3042,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.IdentifyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValidate_3043Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Validate_3043,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ValidateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassify_3044Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Classify_3044,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ClassifyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSort_3045Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Sort_3045,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.SortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMerge_3046Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Merge_3046,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.MergeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregate_3047Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Aggregate_3047,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaning_3048Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Cleaning_3048,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.CleaningNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReduceNoise_3049Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3049,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ReduceNoiseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMath_Operation_3050Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3050,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.Math_OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRetrieve_3051Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Retrieve_3051,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.RetrieveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSave_3052Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Save_3052,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.SaveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArchive_3053Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Archive_3053,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ArchiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGovern_3054Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Govern_3054,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.GovernNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReceiveData_3055Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3055,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ReceiveDataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSendData_3056Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.SendData_3056,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.SendDataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGenerate_3057Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Generate_3057,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.GenerateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIngest_3058Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Ingest_3058,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.IngestNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3059Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Analyze_3059,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.AnalyzeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProcess_3060Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Process_3060,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVerifyData_3061Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.VerifyData_3061,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.VerifyDataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInMessagePort_3062Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3062,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.InMessagePortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutMessagePort_3063Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3063,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.OutMessagePortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLink_4001Text(View view) {
		DataArch.Link domainModelElement = (DataArch.Link) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnection_4002Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.Connection_4002,
				view.getElement() != null ? view.getElement() : view, DataArch.diagram.part.DataArchVisualIDRegistry
						.getType(DataArch.diagram.edit.parts.ConnectionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReceiveDataFromMessagePorts_4003Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSendDataToMessagePorts_4004Text(View view) {
		IParser parser = DataArch.diagram.providers.DataArchParserProvider.getParser(
				DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DataArch.diagram.edit.parts.DataArchitectureEditPart.MODEL_ID
				.equals(DataArch.diagram.part.DataArchVisualIDRegistry.getModelID(view));
	}

}
