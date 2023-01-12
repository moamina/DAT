/*
 * 
 */
package DataArch.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DataArchEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view)) {

			case DataArch.diagram.edit.parts.DataArchitectureEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DataArchitectureEditPart(view);

			case DataArch.diagram.edit.parts.DataNodeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DataNodeEditPart(view);

			case DataArch.diagram.edit.parts.DataNodeNodeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DataNodeNodeNameEditPart(view);

			case DataArch.diagram.edit.parts.AudioEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AudioEditPart(view);

			case DataArch.diagram.edit.parts.AudioNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AudioNameEditPart(view);

			case DataArch.diagram.edit.parts.VideoEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VideoEditPart(view);

			case DataArch.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VideoNameEditPart(view);

			case DataArch.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ImageEditPart(view);

			case DataArch.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ImageNameEditPart(view);

			case DataArch.diagram.edit.parts.LogsEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.LogsEditPart(view);

			case DataArch.diagram.edit.parts.LogsNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.LogsNameEditPart(view);

			case DataArch.diagram.edit.parts.WordFileEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.WordFileEditPart(view);

			case DataArch.diagram.edit.parts.WordFileNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.WordFileNameEditPart(view);

			case DataArch.diagram.edit.parts.PDFFileEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PDFFileEditPart(view);

			case DataArch.diagram.edit.parts.PDFFileNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PDFFileNameEditPart(view);

			case DataArch.diagram.edit.parts.TextFileEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.TextFileEditPart(view);

			case DataArch.diagram.edit.parts.TextFileNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.TextFileNameEditPart(view);

			case DataArch.diagram.edit.parts.RelationalDBEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RelationalDBEditPart(view);

			case DataArch.diagram.edit.parts.RelationalDBNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RelationalDBNameEditPart(view);

			case DataArch.diagram.edit.parts.XMLEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.XMLEditPart(view);

			case DataArch.diagram.edit.parts.XMLNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.XMLNameEditPart(view);

			case DataArch.diagram.edit.parts.JSONEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.JSONEditPart(view);

			case DataArch.diagram.edit.parts.JSONNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.JSONNameEditPart(view);

			case DataArch.diagram.edit.parts.CSVEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CSVEditPart(view);

			case DataArch.diagram.edit.parts.CSVNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CSVNameEditPart(view);

			case DataArch.diagram.edit.parts.ExcelEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ExcelEditPart(view);

			case DataArch.diagram.edit.parts.ExcelNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ExcelNameEditPart(view);

			case DataArch.diagram.edit.parts.HTMLEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.HTMLEditPart(view);

			case DataArch.diagram.edit.parts.HTMLNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.HTMLNameEditPart(view);

			case DataArch.diagram.edit.parts.RDFEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RDFEditPart(view);

			case DataArch.diagram.edit.parts.RDFNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RDFNameEditPart(view);

			case DataArch.diagram.edit.parts.EDIEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.EDIEditPart(view);

			case DataArch.diagram.edit.parts.EDINameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.EDINameEditPart(view);

			case DataArch.diagram.edit.parts.SMSEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SMSEditPart(view);

			case DataArch.diagram.edit.parts.SMSNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SMSNameEditPart(view);

			case DataArch.diagram.edit.parts.EmailEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.EmailEditPart(view);

			case DataArch.diagram.edit.parts.EmailNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.EmailNameEditPart(view);

			case DataArch.diagram.edit.parts.GPSDataEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GPSDataEditPart(view);

			case DataArch.diagram.edit.parts.GPSDataNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GPSDataNameEditPart(view);

			case DataArch.diagram.edit.parts.SensorDataEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SensorDataEditPart(view);

			case DataArch.diagram.edit.parts.SensorDataNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SensorDataNameEditPart(view);

			case DataArch.diagram.edit.parts.DocumentOrientedEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DocumentOrientedEditPart(view);

			case DataArch.diagram.edit.parts.DocumentOrientedNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DocumentOrientedNameEditPart(view);

			case DataArch.diagram.edit.parts.ColumnOrientedEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ColumnOrientedEditPart(view);

			case DataArch.diagram.edit.parts.ColumnOrientedNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ColumnOrientedNameEditPart(view);

			case DataArch.diagram.edit.parts.GraphsDatabaseEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GraphsDatabaseEditPart(view);

			case DataArch.diagram.edit.parts.GraphsDatabaseNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GraphsDatabaseNameEditPart(view);

			case DataArch.diagram.edit.parts.KeyValueEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.KeyValueEditPart(view);

			case DataArch.diagram.edit.parts.KeyValueNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.KeyValueNameEditPart(view);

			case DataArch.diagram.edit.parts.CloudEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CloudEditPart(view);

			case DataArch.diagram.edit.parts.CloudNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CloudNameEditPart(view);

			case DataArch.diagram.edit.parts.On_PremiseEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.On_PremiseEditPart(view);

			case DataArch.diagram.edit.parts.On_PremiseNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.On_PremiseNameEditPart(view);

			case DataArch.diagram.edit.parts.File_SystemEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.File_SystemEditPart(view);

			case DataArch.diagram.edit.parts.File_SystemNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.File_SystemNameEditPart(view);

			case DataArch.diagram.edit.parts.RelationalEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RelationalEditPart(view);

			case DataArch.diagram.edit.parts.RelationalNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RelationalNameEditPart(view);

			case DataArch.diagram.edit.parts.MultidimensionalEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.MultidimensionalEditPart(view);

			case DataArch.diagram.edit.parts.MultidimensionalNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.MultidimensionalNameEditPart(view);

			case DataArch.diagram.edit.parts.RealTimeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RealTimeEditPart(view);

			case DataArch.diagram.edit.parts.RealTimeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RealTimeNameEditPart(view);

			case DataArch.diagram.edit.parts.BatchEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.BatchEditPart(view);

			case DataArch.diagram.edit.parts.BatchNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.BatchNameEditPart(view);

			case DataArch.diagram.edit.parts.FilterEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.FilterEditPart(view);

			case DataArch.diagram.edit.parts.FilterNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.FilterNameEditPart(view);

			case DataArch.diagram.edit.parts.DescribeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DescribeEditPart(view);

			case DataArch.diagram.edit.parts.DescribeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DescribeNameEditPart(view);

			case DataArch.diagram.edit.parts.DiagnoseEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DiagnoseEditPart(view);

			case DataArch.diagram.edit.parts.DiagnoseNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DiagnoseNameEditPart(view);

			case DataArch.diagram.edit.parts.PredictEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PredictEditPart(view);

			case DataArch.diagram.edit.parts.PredictNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PredictNameEditPart(view);

			case DataArch.diagram.edit.parts.PrescriptEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PrescriptEditPart(view);

			case DataArch.diagram.edit.parts.PrescriptNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.PrescriptNameEditPart(view);

			case DataArch.diagram.edit.parts.VisualizeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VisualizeEditPart(view);

			case DataArch.diagram.edit.parts.VisualizeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VisualizeNameEditPart(view);

			case DataArch.diagram.edit.parts.Query_ReportEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.Query_ReportEditPart(view);

			case DataArch.diagram.edit.parts.Query_ReportNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.Query_ReportNameEditPart(view);

			case DataArch.diagram.edit.parts.APIEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.APIEditPart(view);

			case DataArch.diagram.edit.parts.APINameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.APINameEditPart(view);

			case DataArch.diagram.edit.parts.TranfromEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.TranfromEditPart(view);

			case DataArch.diagram.edit.parts.TranfromNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.TranfromNameEditPart(view);

			case DataArch.diagram.edit.parts.CompressEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CompressEditPart(view);

			case DataArch.diagram.edit.parts.CompressNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CompressNameEditPart(view);

			case DataArch.diagram.edit.parts.IntegrateEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IntegrateEditPart(view);

			case DataArch.diagram.edit.parts.IntegrateNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IntegrateNameEditPart(view);

			case DataArch.diagram.edit.parts.IdentifyEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IdentifyEditPart(view);

			case DataArch.diagram.edit.parts.IdentifyNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IdentifyNameEditPart(view);

			case DataArch.diagram.edit.parts.ValidateEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ValidateEditPart(view);

			case DataArch.diagram.edit.parts.ValidateNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ValidateNameEditPart(view);

			case DataArch.diagram.edit.parts.ClassifyEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ClassifyEditPart(view);

			case DataArch.diagram.edit.parts.ClassifyNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ClassifyNameEditPart(view);

			case DataArch.diagram.edit.parts.SortEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SortEditPart(view);

			case DataArch.diagram.edit.parts.SortNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SortNameEditPart(view);

			case DataArch.diagram.edit.parts.MergeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.MergeEditPart(view);

			case DataArch.diagram.edit.parts.MergeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.MergeNameEditPart(view);

			case DataArch.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AggregateEditPart(view);

			case DataArch.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AggregateNameEditPart(view);

			case DataArch.diagram.edit.parts.CleaningEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CleaningEditPart(view);

			case DataArch.diagram.edit.parts.CleaningNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.CleaningNameEditPart(view);

			case DataArch.diagram.edit.parts.ReduceNoiseEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ReduceNoiseEditPart(view);

			case DataArch.diagram.edit.parts.ReduceNoiseNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ReduceNoiseNameEditPart(view);

			case DataArch.diagram.edit.parts.Math_OperationEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.Math_OperationEditPart(view);

			case DataArch.diagram.edit.parts.Math_OperationNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.Math_OperationNameEditPart(view);

			case DataArch.diagram.edit.parts.RetrieveEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RetrieveEditPart(view);

			case DataArch.diagram.edit.parts.RetrieveNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.RetrieveNameEditPart(view);

			case DataArch.diagram.edit.parts.SaveEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SaveEditPart(view);

			case DataArch.diagram.edit.parts.SaveNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SaveNameEditPart(view);

			case DataArch.diagram.edit.parts.ArchiveEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ArchiveEditPart(view);

			case DataArch.diagram.edit.parts.ArchiveNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ArchiveNameEditPart(view);

			case DataArch.diagram.edit.parts.GovernEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GovernEditPart(view);

			case DataArch.diagram.edit.parts.GovernNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GovernNameEditPart(view);

			case DataArch.diagram.edit.parts.ReceiveDataEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ReceiveDataEditPart(view);

			case DataArch.diagram.edit.parts.ReceiveDataNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ReceiveDataNameEditPart(view);

			case DataArch.diagram.edit.parts.SendDataEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SendDataEditPart(view);

			case DataArch.diagram.edit.parts.SendDataNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SendDataNameEditPart(view);

			case DataArch.diagram.edit.parts.GenerateEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GenerateEditPart(view);

			case DataArch.diagram.edit.parts.GenerateNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.GenerateNameEditPart(view);

			case DataArch.diagram.edit.parts.IngestEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IngestEditPart(view);

			case DataArch.diagram.edit.parts.IngestNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.IngestNameEditPart(view);

			case DataArch.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AnalyzeEditPart(view);

			case DataArch.diagram.edit.parts.AnalyzeNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.AnalyzeNameEditPart(view);

			case DataArch.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ProcessEditPart(view);

			case DataArch.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ProcessNameEditPart(view);

			case DataArch.diagram.edit.parts.VerifyDataEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VerifyDataEditPart(view);

			case DataArch.diagram.edit.parts.VerifyDataNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.VerifyDataNameEditPart(view);

			case DataArch.diagram.edit.parts.InMessagePortEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.InMessagePortEditPart(view);

			case DataArch.diagram.edit.parts.InMessagePortNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.InMessagePortNameEditPart(view);

			case DataArch.diagram.edit.parts.OutMessagePortEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.OutMessagePortEditPart(view);

			case DataArch.diagram.edit.parts.OutMessagePortNameEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.OutMessagePortNameEditPart(view);

			case DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.DataNodeDataNodeBehaviouralElementsCompartmentEditPart(view);

			case DataArch.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.LinkEditPart(view);

			case DataArch.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ConnectionEditPart(view);

			case DataArch.diagram.edit.parts.ConnectionTextEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ConnectionTextEditPart(view);

			case DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.ReceiveDataFromMessagePortsEditPart(view);

			case DataArch.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.WrappingLabelEditPart(view);

			case DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.SendDataToMessagePortsEditPart(view);

			case DataArch.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new DataArch.diagram.edit.parts.WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
