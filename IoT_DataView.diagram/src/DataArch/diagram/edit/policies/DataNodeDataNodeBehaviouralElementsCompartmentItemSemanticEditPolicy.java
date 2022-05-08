/*
* 
*/
package DataArch.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataNodeDataNodeBehaviouralElementsCompartmentItemSemanticEditPolicy
		extends DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataNodeDataNodeBehaviouralElementsCompartmentItemSemanticEditPolicy() {
		super(DataArch.diagram.providers.DataArchElementTypes.DataNode_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataArch.diagram.providers.DataArchElementTypes.Audio_3001 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.AudioCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Video_3002 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.VideoCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Image_3003 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ImageCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Logs_3004 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.LogsCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.WordFile_3005 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.WordFileCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.PDFFileCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.TextFile_3007 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.TextFileCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.RelationalDBCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.XML_3009 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.XMLCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.JSON_3010 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.JSONCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.CSV_3011 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.CSVCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Excel_3012 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ExcelCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.HTML_3013 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.HTMLCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.RDF_3014 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.RDFCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.EDI_3015 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.EDICreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.SMS_3016 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.SMSCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Email_3017 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.EmailCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.GPSData_3018 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.GPSDataCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.SensorData_3019 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.SensorDataCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.DocumentOrientedCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ColumnOrientedCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.GraphsDatabaseCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.KeyValueCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Cloud_3060 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.CloudCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.On_Premise_3061 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.On_PremiseCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.File_System_3024 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.File_SystemCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Relational_3025 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.RelationalCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3026 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.MultidimensionalCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.RealTime_3027 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.RealTimeCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Batch_3028 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.BatchCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Filter_3029 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.FilterCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Describe_3030 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.DescribeCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Diagnose_3031 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.DiagnoseCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Predict_3032 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.PredictCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Prescript_3033 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.PrescriptCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Visualize_3034 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.VisualizeCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Query_Report_3035 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.Query_ReportCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.API_3036 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.APICreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3037 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.TranfromCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Compress_3038 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.CompressCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Integrate_3039 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.IntegrateCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Identify_3040 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.IdentifyCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Validate_3041 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ValidateCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Classify_3042 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ClassifyCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Sort_3043 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.SortCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Merge_3044 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.MergeCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Aggregate_3045 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.AggregateCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Cleaning_3046 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.CleaningCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3047 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ReduceNoiseCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3048 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.Math_OperationCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Retrieve_3049 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.RetrieveCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Save_3050 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.SaveCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Archive_3051 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ArchiveCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Govern_3052 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.GovernCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3053 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ReceiveDataCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.SendData_3054 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.SendDataCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Generate_3055 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.GenerateCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Ingest_3062 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.IngestCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Analyze_3056 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.AnalyzeCreateCommand(req));
		}
		if (DataArch.diagram.providers.DataArchElementTypes.Process_3057 == req.getElementType()) {
			return getGEFWrapper(new DataArch.diagram.edit.commands.ProcessCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
