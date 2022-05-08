
/*
 * 
 */
package DataArch.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DataArchPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(DataArch.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAPI1CreationTool());
		paletteContainer.add(createAggregate2CreationTool());
		paletteContainer.add(createAnalyze3CreationTool());
		paletteContainer.add(createArchive4CreationTool());
		paletteContainer.add(createAudio5CreationTool());
		paletteContainer.add(createBatch6CreationTool());
		paletteContainer.add(createCSV7CreationTool());
		paletteContainer.add(createClassify8CreationTool());
		paletteContainer.add(createCleaning9CreationTool());
		paletteContainer.add(createCloud10CreationTool());
		paletteContainer.add(createColumnOriented11CreationTool());
		paletteContainer.add(createCompress12CreationTool());
		paletteContainer.add(createDataNode13CreationTool());
		paletteContainer.add(createDescribe14CreationTool());
		paletteContainer.add(createDiagnose15CreationTool());
		paletteContainer.add(createDocumentOriented16CreationTool());
		paletteContainer.add(createEDI17CreationTool());
		paletteContainer.add(createEmail18CreationTool());
		paletteContainer.add(createExcel19CreationTool());
		paletteContainer.add(createFile_System20CreationTool());
		paletteContainer.add(createFilter21CreationTool());
		paletteContainer.add(createGPSData22CreationTool());
		paletteContainer.add(createGenerate23CreationTool());
		paletteContainer.add(createGovern24CreationTool());
		paletteContainer.add(createGraphsDatabase25CreationTool());
		paletteContainer.add(createHTML26CreationTool());
		paletteContainer.add(createIdentify27CreationTool());
		paletteContainer.add(createImage28CreationTool());
		paletteContainer.add(createInMessagePort29CreationTool());
		paletteContainer.add(createIngest30CreationTool());
		paletteContainer.add(createIntegrate31CreationTool());
		paletteContainer.add(createJSON32CreationTool());
		paletteContainer.add(createKeyValue33CreationTool());
		paletteContainer.add(createLogs34CreationTool());
		paletteContainer.add(createMath_Operation35CreationTool());
		paletteContainer.add(createMerge36CreationTool());
		paletteContainer.add(createMultidimensional37CreationTool());
		paletteContainer.add(createOn_Premise38CreationTool());
		paletteContainer.add(createOutMessagePort39CreationTool());
		paletteContainer.add(createPDFFile40CreationTool());
		paletteContainer.add(createPredict41CreationTool());
		paletteContainer.add(createPrescript42CreationTool());
		paletteContainer.add(createProcess43CreationTool());
		paletteContainer.add(createQuery_Report44CreationTool());
		paletteContainer.add(createRDF45CreationTool());
		paletteContainer.add(createRealTime46CreationTool());
		paletteContainer.add(createReceiveData47CreationTool());
		paletteContainer.add(createReduceNoise48CreationTool());
		paletteContainer.add(createRelational49CreationTool());
		paletteContainer.add(createRelationalDB50CreationTool());
		paletteContainer.add(createRetrieve51CreationTool());
		paletteContainer.add(createSMS52CreationTool());
		paletteContainer.add(createSave53CreationTool());
		paletteContainer.add(createSendData54CreationTool());
		paletteContainer.add(createSensorData55CreationTool());
		paletteContainer.add(createSort56CreationTool());
		paletteContainer.add(createTextFile57CreationTool());
		paletteContainer.add(createTranfrom58CreationTool());
		paletteContainer.add(createValidate59CreationTool());
		paletteContainer.add(createVideo60CreationTool());
		paletteContainer.add(createVisualize61CreationTool());
		paletteContainer.add(createWordFile62CreationTool());
		paletteContainer.add(createXML63CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(DataArch.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDataElementLink1CreationTool());
		paletteContainer.add(createDataNodeLink2CreationTool());
		paletteContainer.add(createReceiveDataLink3CreationTool());
		paletteContainer.add(createSendDataLink4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAPI1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.API1CreationTool_title,
				DataArch.diagram.part.Messages.API1CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.API_3036));
		entry.setId("createAPI1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/API.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/API.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregate2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Aggregate2CreationTool_title,
				DataArch.diagram.part.Messages.Aggregate2CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Aggregate_3045));
		entry.setId("createAggregate2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/aggregate.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/aggregate.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnalyze3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Analyze3CreationTool_title,
				DataArch.diagram.part.Messages.Analyze3CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Analyze_3056));
		entry.setId("createAnalyze3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/analyze.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/analyze.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createArchive4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Archive4CreationTool_title,
				DataArch.diagram.part.Messages.Archive4CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Archive_3051));
		entry.setId("createArchive4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/archive.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/archive.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAudio5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Audio5CreationTool_title,
				DataArch.diagram.part.Messages.Audio5CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Audio_3001));
		entry.setId("createAudio5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/audio.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/audio.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBatch6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Batch6CreationTool_title,
				DataArch.diagram.part.Messages.Batch6CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Batch_3028));
		entry.setId("createBatch6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/batch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/batch.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCSV7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.CSV7CreationTool_title,
				DataArch.diagram.part.Messages.CSV7CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.CSV_3011));
		entry.setId("createCSV7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/CSV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/CSV.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassify8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Classify8CreationTool_title,
				DataArch.diagram.part.Messages.Classify8CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Classify_3042));
		entry.setId("createClassify8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/classify.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/classify.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaning9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Cleaning9CreationTool_title,
				DataArch.diagram.part.Messages.Cleaning9CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Cleaning_3046));
		entry.setId("createCleaning9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/clean.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/clean.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCloud10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Cloud10CreationTool_title,
				DataArch.diagram.part.Messages.Cloud10CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Cloud_3060));
		entry.setId("createCloud10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/cloud.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/cloud.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumnOriented11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.ColumnOriented11CreationTool_title,
				DataArch.diagram.part.Messages.ColumnOriented11CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.ColumnOriented_3021));
		entry.setId("createColumnOriented11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/columnarDB.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/columnarDB.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCompress12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Compress12CreationTool_title,
				DataArch.diagram.part.Messages.Compress12CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Compress_3038));
		entry.setId("createCompress12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/compress.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/compress.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataNode13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.DataNode13CreationTool_title,
				DataArch.diagram.part.Messages.DataNode13CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.DataNode_2001));
		entry.setId("createDataNode13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/datanode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/datanode.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescribe14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Describe14CreationTool_title,
				DataArch.diagram.part.Messages.Describe14CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Describe_3030));
		entry.setId("createDescribe14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/descript.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/descript.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDiagnose15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Diagnose15CreationTool_title,
				DataArch.diagram.part.Messages.Diagnose15CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Diagnose_3031));
		entry.setId("createDiagnose15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/diagnose.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/diagnose.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDocumentOriented16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.DocumentOriented16CreationTool_title,
				DataArch.diagram.part.Messages.DocumentOriented16CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.DocumentOriented_3020));
		entry.setId("createDocumentOriented16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/DocumentDB.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/DocumentDB.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEDI17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.EDI17CreationTool_title,
				DataArch.diagram.part.Messages.EDI17CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.EDI_3015));
		entry.setId("createEDI17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/edi.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/edi.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmail18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Email18CreationTool_title,
				DataArch.diagram.part.Messages.Email18CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Email_3017));
		entry.setId("createEmail18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/email.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/email.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExcel19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Excel19CreationTool_title,
				DataArch.diagram.part.Messages.Excel19CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Excel_3012));
		entry.setId("createExcel19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/Excel.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/Excel.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile_System20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.File_System20CreationTool_title,
				DataArch.diagram.part.Messages.File_System20CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.File_System_3024));
		entry.setId("createFile_System20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/fileSystem.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/fileSystem.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFilter21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Filter21CreationTool_title,
				DataArch.diagram.part.Messages.Filter21CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Filter_3029));
		entry.setId("createFilter21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/filter.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/filter.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGPSData22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.GPSData22CreationTool_title,
				DataArch.diagram.part.Messages.GPSData22CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.GPSData_3018));
		entry.setId("createGPSData22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/gps.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/gps.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGenerate23CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Generate23CreationTool_title,
				DataArch.diagram.part.Messages.Generate23CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Generate_3055));
		entry.setId("createGenerate23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/generatingData.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/generatingData.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGovern24CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Govern24CreationTool_title,
				DataArch.diagram.part.Messages.Govern24CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Govern_3052));
		entry.setId("createGovern24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataGovernance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataGovenance.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGraphsDatabase25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.GraphsDatabase25CreationTool_title,
				DataArch.diagram.part.Messages.GraphsDatabase25CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.GraphsDatabase_3022));
		entry.setId("createGraphsDatabase25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/GraphDB.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/GraphDB.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHTML26CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.HTML26CreationTool_title,
				DataArch.diagram.part.Messages.HTML26CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.HTML_3013));
		entry.setId("createHTML26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/html.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/html.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIdentify27CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Identify27CreationTool_title,
				DataArch.diagram.part.Messages.Identify27CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Identify_3040));
		entry.setId("createIdentify27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/idetify.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/idetify.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage28CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Image28CreationTool_title,
				DataArch.diagram.part.Messages.Image28CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Image_3003));
		entry.setId("createImage28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/image.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/image.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInMessagePort29CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.InMessagePort29CreationTool_title,
				DataArch.diagram.part.Messages.InMessagePort29CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3058));
		entry.setId("createInMessagePort29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.providers.DataArchElementTypes
				.getImageDescriptor(DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIngest30CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Ingest30CreationTool_title,
				DataArch.diagram.part.Messages.Ingest30CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Ingest_3062));
		entry.setId("createIngest30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/ingest.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/ingest.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrate31CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Integrate31CreationTool_title,
				DataArch.diagram.part.Messages.Integrate31CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Integrate_3039));
		entry.setId("createIntegrate31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/integrate.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/integrate.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJSON32CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.JSON32CreationTool_title,
				DataArch.diagram.part.Messages.JSON32CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.JSON_3010));
		entry.setId("createJSON32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/JSON.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/JSON.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createKeyValue33CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.KeyValue33CreationTool_title,
				DataArch.diagram.part.Messages.KeyValue33CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.KeyValue_3023));
		entry.setId("createKeyValue33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/key_value.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/key_value.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogs34CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Logs34CreationTool_title,
				DataArch.diagram.part.Messages.Logs34CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Logs_3004));
		entry.setId("createLogs34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/log.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/log.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMath_Operation35CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Math_Operation35CreationTool_title,
				DataArch.diagram.part.Messages.Math_Operation35CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Math_Operation_3048));
		entry.setId("createMath_Operation35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/mathOp.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/mathOp.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMerge36CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Merge36CreationTool_title,
				DataArch.diagram.part.Messages.Merge36CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Merge_3044));
		entry.setId("createMerge36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/merge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/merge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMultidimensional37CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Multidimensional37CreationTool_title,
				DataArch.diagram.part.Messages.Multidimensional37CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Multidimensional_3026));
		entry.setId("createMultidimensional37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/multid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/multid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOn_Premise38CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.On_Premise38CreationTool_title,
				DataArch.diagram.part.Messages.On_Premise38CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.On_Premise_3061));
		entry.setId("createOn_Premise38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/On_Premise.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/On_Premise.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutMessagePort39CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.OutMessagePort39CreationTool_title,
				DataArch.diagram.part.Messages.OutMessagePort39CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3059));
		entry.setId("createOutMessagePort39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.providers.DataArchElementTypes
				.getImageDescriptor(DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPDFFile40CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.PDFFile40CreationTool_title,
				DataArch.diagram.part.Messages.PDFFile40CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.PDFFile_3006));
		entry.setId("createPDFFile40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/pdf.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/pdf.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredict41CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Predict41CreationTool_title,
				DataArch.diagram.part.Messages.Predict41CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Predict_3032));
		entry.setId("createPredict41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/predict.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/predict.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrescript42CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Prescript42CreationTool_title,
				DataArch.diagram.part.Messages.Prescript42CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Prescript_3033));
		entry.setId("createPrescript42CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/prescriptive.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/prescriptive.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProcess43CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Process43CreationTool_title,
				DataArch.diagram.part.Messages.Process43CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Process_3057));
		entry.setId("createProcess43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/processing.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/processing.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuery_Report44CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Query_Report44CreationTool_title,
				DataArch.diagram.part.Messages.Query_Report44CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Query_Report_3035));
		entry.setId("createQuery_Report44CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/query.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/query.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRDF45CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.RDF45CreationTool_title,
				DataArch.diagram.part.Messages.RDF45CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.RDF_3014));
		entry.setId("createRDF45CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/rdf.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/rdf.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRealTime46CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.RealTime46CreationTool_title,
				DataArch.diagram.part.Messages.RealTime46CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.RealTime_3027));
		entry.setId("createRealTime46CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/realtime.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/realtime.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReceiveData47CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.ReceiveData47CreationTool_title,
				DataArch.diagram.part.Messages.ReceiveData47CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3053));
		entry.setId("createReceiveData47CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/ReceiveData.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/ReceiveData.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReduceNoise48CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.ReduceNoise48CreationTool_title,
				DataArch.diagram.part.Messages.ReduceNoise48CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.ReduceNoise_3047));
		entry.setId("createReduceNoise48CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataReduction.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataReduction.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelational49CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Relational49CreationTool_title,
				DataArch.diagram.part.Messages.Relational49CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Relational_3025));
		entry.setId("createRelational49CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/releationalDB.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/releationalDB.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelationalDB50CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.RelationalDB50CreationTool_title,
				DataArch.diagram.part.Messages.RelationalDB50CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.RelationalDB_3008));
		entry.setId("createRelationalDB50CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/releationalFormat.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/releationalFormat.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRetrieve51CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Retrieve51CreationTool_title,
				DataArch.diagram.part.Messages.Retrieve51CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Retrieve_3049));
		entry.setId("createRetrieve51CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/retrieveData.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/retrieveData.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSMS52CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.SMS52CreationTool_title,
				DataArch.diagram.part.Messages.SMS52CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.SMS_3016));
		entry.setId("createSMS52CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sms.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sms.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSave53CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Save53CreationTool_title,
				DataArch.diagram.part.Messages.Save53CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Save_3050));
		entry.setId("createSave53CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/store.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/store.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSendData54CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.SendData54CreationTool_title,
				DataArch.diagram.part.Messages.SendData54CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.SendData_3054));
		entry.setId("createSendData54CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/SendData.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/SendData.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSensorData55CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.SensorData55CreationTool_title,
				DataArch.diagram.part.Messages.SensorData55CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.SensorData_3019));
		entry.setId("createSensorData55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sensorData.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sensorData.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSort56CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Sort56CreationTool_title,
				DataArch.diagram.part.Messages.Sort56CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Sort_3043));
		entry.setId("createSort56CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/sort.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextFile57CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.TextFile57CreationTool_title,
				DataArch.diagram.part.Messages.TextFile57CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.TextFile_3007));
		entry.setId("createTextFile57CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/txt.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/txt.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTranfrom58CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Tranfrom58CreationTool_title,
				DataArch.diagram.part.Messages.Tranfrom58CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Tranfrom_3037));
		entry.setId("createTranfrom58CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/transform.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/transform.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValidate59CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Validate59CreationTool_title,
				DataArch.diagram.part.Messages.Validate59CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Validate_3041));
		entry.setId("createValidate59CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/validate.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/validate.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVideo60CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.Video60CreationTool_title,
				DataArch.diagram.part.Messages.Video60CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Video_3002));
		entry.setId("createVideo60CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/video.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/Video.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualize61CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.Visualize61CreationTool_title,
				DataArch.diagram.part.Messages.Visualize61CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Visualize_3034));
		entry.setId("createVisualize61CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataVisulization.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/dataVisulization.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWordFile62CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataArch.diagram.part.Messages.WordFile62CreationTool_title,
				DataArch.diagram.part.Messages.WordFile62CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.WordFile_3005));
		entry.setId("createWordFile62CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/word.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/word.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createXML63CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(DataArch.diagram.part.Messages.XML63CreationTool_title,
				DataArch.diagram.part.Messages.XML63CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.XML_3009));
		entry.setId("createXML63CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/xml.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/xml.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataElementLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataArch.diagram.part.Messages.DataElementLink1CreationTool_title,
				DataArch.diagram.part.Messages.DataElementLink1CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Link_4001));
		entry.setId("createDataElementLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.providers.DataArchElementTypes
				.getImageDescriptor(DataArch.diagram.providers.DataArchElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataNodeLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataArch.diagram.part.Messages.DataNodeLink2CreationTool_title,
				DataArch.diagram.part.Messages.DataNodeLink2CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.Connection_4002));
		entry.setId("createDataNodeLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/Connection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(DataArch.diagram.part.DataArchDiagramEditorPlugin
				.findImageDescriptor("/IoT_DataView/dataicons/basics/Connection.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReceiveDataLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataArch.diagram.part.Messages.ReceiveDataLink3CreationTool_title,
				DataArch.diagram.part.Messages.ReceiveDataLink3CreationTool_desc, Collections.singletonList(
						DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003));
		entry.setId("createReceiveDataLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.providers.DataArchElementTypes
				.getImageDescriptor(DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSendDataLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataArch.diagram.part.Messages.SendDataLink4CreationTool_title,
				DataArch.diagram.part.Messages.SendDataLink4CreationTool_desc,
				Collections.singletonList(DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004));
		entry.setId("createSendDataLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataArch.diagram.providers.DataArchElementTypes
				.getImageDescriptor(DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
