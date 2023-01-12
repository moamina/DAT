/*
 * 
 */
package DataArch.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataArchModelingAssistantProviderOfBatchEditPart
		extends DataArch.diagram.providers.DataArchModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataArch.diagram.edit.parts.BatchEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataArch.diagram.edit.parts.BatchEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataArch.diagram.edit.parts.BatchEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataArch.diagram.edit.parts.BatchEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataArch.diagram.edit.parts.AudioEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.VideoEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ImageEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.LogsEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.WordFileEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.PDFFileEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.TextFileEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.RelationalDBEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.XMLEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.JSONEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.CSVEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ExcelEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.HTMLEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.RDFEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.EDIEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.SMSEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.EmailEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.GPSDataEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.SensorDataEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.DocumentOrientedEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ColumnOrientedEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.GraphsDatabaseEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.KeyValueEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.CloudEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.On_PremiseEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.File_SystemEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.RelationalEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.MultidimensionalEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.RealTimeEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.BatchEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.FilterEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.DescribeEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.DiagnoseEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.PredictEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.PrescriptEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.VisualizeEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.Query_ReportEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.APIEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.TranfromEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.CompressEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.IntegrateEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.IdentifyEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ValidateEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ClassifyEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.SortEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.MergeEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.AggregateEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.CleaningEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ReduceNoiseEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.Math_OperationEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.RetrieveEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.SaveEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ArchiveEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.GovernEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.SendDataEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.GenerateEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.IngestEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.AnalyzeEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.ProcessEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DataArch.diagram.edit.parts.VerifyDataEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataArch.diagram.edit.parts.BatchEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataArch.diagram.edit.parts.BatchEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.Link_4001) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Audio_3001);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Video_3002);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Image_3003);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Logs_3004);
			types.add(DataArch.diagram.providers.DataArchElementTypes.WordFile_3005);
			types.add(DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006);
			types.add(DataArch.diagram.providers.DataArchElementTypes.TextFile_3007);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008);
			types.add(DataArch.diagram.providers.DataArchElementTypes.XML_3009);
			types.add(DataArch.diagram.providers.DataArchElementTypes.JSON_3010);
			types.add(DataArch.diagram.providers.DataArchElementTypes.CSV_3011);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Excel_3012);
			types.add(DataArch.diagram.providers.DataArchElementTypes.HTML_3013);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RDF_3014);
			types.add(DataArch.diagram.providers.DataArchElementTypes.EDI_3015);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SMS_3016);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Email_3017);
			types.add(DataArch.diagram.providers.DataArchElementTypes.GPSData_3018);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SensorData_3019);
			types.add(DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020);
			types.add(DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021);
			types.add(DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022);
			types.add(DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Cloud_3024);
			types.add(DataArch.diagram.providers.DataArchElementTypes.On_Premise_3025);
			types.add(DataArch.diagram.providers.DataArchElementTypes.File_System_3026);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Relational_3027);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3028);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RealTime_3029);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Batch_3030);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Filter_3031);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Describe_3032);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Diagnose_3033);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Predict_3034);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Prescript_3035);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Visualize_3036);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Query_Report_3037);
			types.add(DataArch.diagram.providers.DataArchElementTypes.API_3038);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3039);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Compress_3040);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Integrate_3041);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Identify_3042);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Validate_3043);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Classify_3044);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Sort_3045);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Merge_3046);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Aggregate_3047);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Cleaning_3048);
			types.add(DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3049);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3050);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Retrieve_3051);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Save_3052);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Archive_3053);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Govern_3054);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SendData_3056);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Generate_3057);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Ingest_3058);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Analyze_3059);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Process_3060);
			types.add(DataArch.diagram.providers.DataArchElementTypes.VerifyData_3061);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataArch.diagram.edit.parts.BatchEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataArch.diagram.edit.parts.BatchEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataArch.diagram.providers.DataArchElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataArch.diagram.edit.parts.BatchEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataArch.diagram.edit.parts.BatchEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.Link_4001) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Audio_3001);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Video_3002);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Image_3003);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Logs_3004);
			types.add(DataArch.diagram.providers.DataArchElementTypes.WordFile_3005);
			types.add(DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006);
			types.add(DataArch.diagram.providers.DataArchElementTypes.TextFile_3007);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008);
			types.add(DataArch.diagram.providers.DataArchElementTypes.XML_3009);
			types.add(DataArch.diagram.providers.DataArchElementTypes.JSON_3010);
			types.add(DataArch.diagram.providers.DataArchElementTypes.CSV_3011);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Excel_3012);
			types.add(DataArch.diagram.providers.DataArchElementTypes.HTML_3013);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RDF_3014);
			types.add(DataArch.diagram.providers.DataArchElementTypes.EDI_3015);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SMS_3016);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Email_3017);
			types.add(DataArch.diagram.providers.DataArchElementTypes.GPSData_3018);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SensorData_3019);
			types.add(DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020);
			types.add(DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021);
			types.add(DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022);
			types.add(DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Cloud_3024);
			types.add(DataArch.diagram.providers.DataArchElementTypes.On_Premise_3025);
			types.add(DataArch.diagram.providers.DataArchElementTypes.File_System_3026);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Relational_3027);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3028);
			types.add(DataArch.diagram.providers.DataArchElementTypes.RealTime_3029);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Batch_3030);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Filter_3031);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Describe_3032);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Diagnose_3033);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Predict_3034);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Prescript_3035);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Visualize_3036);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Query_Report_3037);
			types.add(DataArch.diagram.providers.DataArchElementTypes.API_3038);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3039);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Compress_3040);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Integrate_3041);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Identify_3042);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Validate_3043);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Classify_3044);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Sort_3045);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Merge_3046);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Aggregate_3047);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Cleaning_3048);
			types.add(DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3049);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3050);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Retrieve_3051);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Save_3052);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Archive_3053);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Govern_3054);
			types.add(DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3055);
			types.add(DataArch.diagram.providers.DataArchElementTypes.SendData_3056);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Generate_3057);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Ingest_3058);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Analyze_3059);
			types.add(DataArch.diagram.providers.DataArchElementTypes.Process_3060);
			types.add(DataArch.diagram.providers.DataArchElementTypes.VerifyData_3061);
		}
		return types;
	}

}
