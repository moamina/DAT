/**
 */
package DataArch.impl;

import DataArch.API;
import DataArch.Aggregate;
import DataArch.Analyze;
import DataArch.Archive;
import DataArch.Audio;
import DataArch.Batch;
import DataArch.CSV;
import DataArch.Classify;
import DataArch.Cleaning;
import DataArch.Cloud;
import DataArch.ColumnOriented;
import DataArch.Compress;
import DataArch.Connection;
import DataArch.DataArchFactory;
import DataArch.DataArchPackage;
import DataArch.DataArchitecture;
import DataArch.DataNode;
import DataArch.Describe;
import DataArch.Diagnose;
import DataArch.DocumentOriented;
import DataArch.EDI;
import DataArch.Email;
import DataArch.Excel;
import DataArch.File_System;
import DataArch.Filter;
import DataArch.GPSData;
import DataArch.Generate;
import DataArch.Govern;
import DataArch.GraphsDatabase;
import DataArch.HTML;
import DataArch.Identify;
import DataArch.Image;
import DataArch.InMessagePort;
import DataArch.Ingest;
import DataArch.Integrate;
import DataArch.JSON;
import DataArch.KeyValue;
import DataArch.Link;
import DataArch.Logs;
import DataArch.Math_Operation;
import DataArch.Merge;
import DataArch.Multidimensional;
import DataArch.On_Premise;
import DataArch.OutMessagePort;
import DataArch.PDFFile;
import DataArch.Predict;
import DataArch.Prescript;
import DataArch.Query_Report;
import DataArch.RDF;
import DataArch.RealTime;
import DataArch.ReceiveData;
import DataArch.ReduceNoise;
import DataArch.Relational;
import DataArch.RelationalDB;
import DataArch.Retrieve;
import DataArch.SMS;
import DataArch.Save;
import DataArch.SendData;
import DataArch.SensorData;
import DataArch.Sort;
import DataArch.TextFile;
import DataArch.Tranfrom;
import DataArch.Validate;
import DataArch.Video;
import DataArch.Visualize;
import DataArch.WordFile;
import DataArch.XML;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataArchFactoryImpl extends EFactoryImpl implements DataArchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataArchFactory init() {
		try {
			DataArchFactory theDataArchFactory = (DataArchFactory)EPackage.Registry.INSTANCE.getEFactory(DataArchPackage.eNS_URI);
			if (theDataArchFactory != null) {
				return theDataArchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataArchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataArchPackage.DATA_ARCHITECTURE: return createDataArchitecture();
			case DataArchPackage.DATA_NODE: return createDataNode();
			case DataArchPackage.CONNECTION: return createConnection();
			case DataArchPackage.IN_MESSAGE_PORT: return createInMessagePort();
			case DataArchPackage.OUT_MESSAGE_PORT: return createOutMessagePort();
			case DataArchPackage.CLOUD: return createCloud();
			case DataArchPackage.ON_PREMISE: return createOn_Premise();
			case DataArchPackage.FILE_SYSTEM: return createFile_System();
			case DataArchPackage.RELATIONAL: return createRelational();
			case DataArchPackage.MULTIDIMENSIONAL: return createMultidimensional();
			case DataArchPackage.REAL_TIME: return createRealTime();
			case DataArchPackage.BATCH: return createBatch();
			case DataArchPackage.LINK: return createLink();
			case DataArchPackage.RECEIVE_DATA: return createReceiveData();
			case DataArchPackage.SEND_DATA: return createSendData();
			case DataArchPackage.GENERATE: return createGenerate();
			case DataArchPackage.INGEST: return createIngest();
			case DataArchPackage.ANALYZE: return createAnalyze();
			case DataArchPackage.VISUALIZE: return createVisualize();
			case DataArchPackage.QUERY_REPORT: return createQuery_Report();
			case DataArchPackage.API: return createAPI();
			case DataArchPackage.PROCESS: return createProcess();
			case DataArchPackage.TRANFROM: return createTranfrom();
			case DataArchPackage.COMPRESS: return createCompress();
			case DataArchPackage.INTEGRATE: return createIntegrate();
			case DataArchPackage.IDENTIFY: return createIdentify();
			case DataArchPackage.VALIDATE: return createValidate();
			case DataArchPackage.CLASSIFY: return createClassify();
			case DataArchPackage.SORT: return createSort();
			case DataArchPackage.MERGE: return createMerge();
			case DataArchPackage.AGGREGATE: return createAggregate();
			case DataArchPackage.CLEANING: return createCleaning();
			case DataArchPackage.FILTER: return createFilter();
			case DataArchPackage.REDUCE_NOISE: return createReduceNoise();
			case DataArchPackage.DESCRIBE: return createDescribe();
			case DataArchPackage.DIAGNOSE: return createDiagnose();
			case DataArchPackage.PREDICT: return createPredict();
			case DataArchPackage.PRESCRIPT: return createPrescript();
			case DataArchPackage.MATH_OPERATION: return createMath_Operation();
			case DataArchPackage.RELATIONAL_DB: return createRelationalDB();
			case DataArchPackage.XML: return createXML();
			case DataArchPackage.JSON: return createJSON();
			case DataArchPackage.CSV: return createCSV();
			case DataArchPackage.EXCEL: return createExcel();
			case DataArchPackage.HTML: return createHTML();
			case DataArchPackage.RDF: return createRDF();
			case DataArchPackage.EDI: return createEDI();
			case DataArchPackage.SMS: return createSMS();
			case DataArchPackage.EMAIL: return createEmail();
			case DataArchPackage.AUDIO: return createAudio();
			case DataArchPackage.VIDEO: return createVideo();
			case DataArchPackage.IMAGE: return createImage();
			case DataArchPackage.GPS_DATA: return createGPSData();
			case DataArchPackage.LOGS: return createLogs();
			case DataArchPackage.WORD_FILE: return createWordFile();
			case DataArchPackage.PDF_FILE: return createPDFFile();
			case DataArchPackage.TEXT_FILE: return createTextFile();
			case DataArchPackage.SENSOR_DATA: return createSensorData();
			case DataArchPackage.DOCUMENT_ORIENTED: return createDocumentOriented();
			case DataArchPackage.COLUMN_ORIENTED: return createColumnOriented();
			case DataArchPackage.GRAPHS_DATABASE: return createGraphsDatabase();
			case DataArchPackage.KEY_VALUE: return createKeyValue();
			case DataArchPackage.RETRIEVE: return createRetrieve();
			case DataArchPackage.SAVE: return createSave();
			case DataArchPackage.ARCHIVE: return createArchive();
			case DataArchPackage.GOVERN: return createGovern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataArchitecture createDataArchitecture() {
		DataArchitectureImpl dataArchitecture = new DataArchitectureImpl();
		return dataArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataNode createDataNode() {
		DataNodeImpl dataNode = new DataNodeImpl();
		return dataNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InMessagePort createInMessagePort() {
		InMessagePortImpl inMessagePort = new InMessagePortImpl();
		return inMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutMessagePort createOutMessagePort() {
		OutMessagePortImpl outMessagePort = new OutMessagePortImpl();
		return outMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public On_Premise createOn_Premise() {
		On_PremiseImpl on_Premise = new On_PremiseImpl();
		return on_Premise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File_System createFile_System() {
		File_SystemImpl file_System = new File_SystemImpl();
		return file_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relational createRelational() {
		RelationalImpl relational = new RelationalImpl();
		return relational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multidimensional createMultidimensional() {
		MultidimensionalImpl multidimensional = new MultidimensionalImpl();
		return multidimensional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealTime createRealTime() {
		RealTimeImpl realTime = new RealTimeImpl();
		return realTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Batch createBatch() {
		BatchImpl batch = new BatchImpl();
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiveData createReceiveData() {
		ReceiveDataImpl receiveData = new ReceiveDataImpl();
		return receiveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendData createSendData() {
		SendDataImpl sendData = new SendDataImpl();
		return sendData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generate createGenerate() {
		GenerateImpl generate = new GenerateImpl();
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingest createIngest() {
		IngestImpl ingest = new IngestImpl();
		return ingest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analyze createAnalyze() {
		AnalyzeImpl analyze = new AnalyzeImpl();
		return analyze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualize createVisualize() {
		VisualizeImpl visualize = new VisualizeImpl();
		return visualize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Query_Report createQuery_Report() {
		Query_ReportImpl query_Report = new Query_ReportImpl();
		return query_Report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataArch.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tranfrom createTranfrom() {
		TranfromImpl tranfrom = new TranfromImpl();
		return tranfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Compress createCompress() {
		CompressImpl compress = new CompressImpl();
		return compress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integrate createIntegrate() {
		IntegrateImpl integrate = new IntegrateImpl();
		return integrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identify createIdentify() {
		IdentifyImpl identify = new IdentifyImpl();
		return identify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validate createValidate() {
		ValidateImpl validate = new ValidateImpl();
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classify createClassify() {
		ClassifyImpl classify = new ClassifyImpl();
		return classify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cleaning createCleaning() {
		CleaningImpl cleaning = new CleaningImpl();
		return cleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReduceNoise createReduceNoise() {
		ReduceNoiseImpl reduceNoise = new ReduceNoiseImpl();
		return reduceNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Describe createDescribe() {
		DescribeImpl describe = new DescribeImpl();
		return describe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diagnose createDiagnose() {
		DiagnoseImpl diagnose = new DiagnoseImpl();
		return diagnose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predict createPredict() {
		PredictImpl predict = new PredictImpl();
		return predict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prescript createPrescript() {
		PrescriptImpl prescript = new PrescriptImpl();
		return prescript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Math_Operation createMath_Operation() {
		Math_OperationImpl math_Operation = new Math_OperationImpl();
		return math_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalDB createRelationalDB() {
		RelationalDBImpl relationalDB = new RelationalDBImpl();
		return relationalDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XML createXML() {
		XMLImpl xml = new XMLImpl();
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSON createJSON() {
		JSONImpl json = new JSONImpl();
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSV createCSV() {
		CSVImpl csv = new CSVImpl();
		return csv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Excel createExcel() {
		ExcelImpl excel = new ExcelImpl();
		return excel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTML createHTML() {
		HTMLImpl html = new HTMLImpl();
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDF createRDF() {
		RDFImpl rdf = new RDFImpl();
		return rdf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDI createEDI() {
		EDIImpl edi = new EDIImpl();
		return edi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMS createSMS() {
		SMSImpl sms = new SMSImpl();
		return sms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Email createEmail() {
		EmailImpl email = new EmailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPSData createGPSData() {
		GPSDataImpl gpsData = new GPSDataImpl();
		return gpsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Logs createLogs() {
		LogsImpl logs = new LogsImpl();
		return logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WordFile createWordFile() {
		WordFileImpl wordFile = new WordFileImpl();
		return wordFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PDFFile createPDFFile() {
		PDFFileImpl pdfFile = new PDFFileImpl();
		return pdfFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextFile createTextFile() {
		TextFileImpl textFile = new TextFileImpl();
		return textFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorData createSensorData() {
		SensorDataImpl sensorData = new SensorDataImpl();
		return sensorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentOriented createDocumentOriented() {
		DocumentOrientedImpl documentOriented = new DocumentOrientedImpl();
		return documentOriented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnOriented createColumnOriented() {
		ColumnOrientedImpl columnOriented = new ColumnOrientedImpl();
		return columnOriented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphsDatabase createGraphsDatabase() {
		GraphsDatabaseImpl graphsDatabase = new GraphsDatabaseImpl();
		return graphsDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Retrieve createRetrieve() {
		RetrieveImpl retrieve = new RetrieveImpl();
		return retrieve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Save createSave() {
		SaveImpl save = new SaveImpl();
		return save;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Govern createGovern() {
		GovernImpl govern = new GovernImpl();
		return govern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataArchPackage getDataArchPackage() {
		return (DataArchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataArchPackage getPackage() {
		return DataArchPackage.eINSTANCE;
	}

} //DataArchFactoryImpl
