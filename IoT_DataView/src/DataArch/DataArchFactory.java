/**
 */
package DataArch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DataArch.DataArchPackage
 * @generated
 */
public interface DataArchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataArchFactory eINSTANCE = DataArch.impl.DataArchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Architecture</em>'.
	 * @generated
	 */
	DataArchitecture createDataArchitecture();

	/**
	 * Returns a new object of class '<em>Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Node</em>'.
	 * @generated
	 */
	DataNode createDataNode();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>In Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Message Port</em>'.
	 * @generated
	 */
	InMessagePort createInMessagePort();

	/**
	 * Returns a new object of class '<em>Out Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Message Port</em>'.
	 * @generated
	 */
	OutMessagePort createOutMessagePort();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>On Premise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Premise</em>'.
	 * @generated
	 */
	On_Premise createOn_Premise();

	/**
	 * Returns a new object of class '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System</em>'.
	 * @generated
	 */
	File_System createFile_System();

	/**
	 * Returns a new object of class '<em>Relational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational</em>'.
	 * @generated
	 */
	Relational createRelational();

	/**
	 * Returns a new object of class '<em>Multidimensional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multidimensional</em>'.
	 * @generated
	 */
	Multidimensional createMultidimensional();

	/**
	 * Returns a new object of class '<em>Real Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Time</em>'.
	 * @generated
	 */
	RealTime createRealTime();

	/**
	 * Returns a new object of class '<em>Batch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batch</em>'.
	 * @generated
	 */
	Batch createBatch();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Receive Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Data</em>'.
	 * @generated
	 */
	ReceiveData createReceiveData();

	/**
	 * Returns a new object of class '<em>Send Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Data</em>'.
	 * @generated
	 */
	SendData createSendData();

	/**
	 * Returns a new object of class '<em>Generate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generate</em>'.
	 * @generated
	 */
	Generate createGenerate();

	/**
	 * Returns a new object of class '<em>Ingest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingest</em>'.
	 * @generated
	 */
	Ingest createIngest();

	/**
	 * Returns a new object of class '<em>Analyze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyze</em>'.
	 * @generated
	 */
	Analyze createAnalyze();

	/**
	 * Returns a new object of class '<em>Visualize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualize</em>'.
	 * @generated
	 */
	Visualize createVisualize();

	/**
	 * Returns a new object of class '<em>Query Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Report</em>'.
	 * @generated
	 */
	Query_Report createQuery_Report();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Tranfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tranfrom</em>'.
	 * @generated
	 */
	Tranfrom createTranfrom();

	/**
	 * Returns a new object of class '<em>Compress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compress</em>'.
	 * @generated
	 */
	Compress createCompress();

	/**
	 * Returns a new object of class '<em>Integrate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integrate</em>'.
	 * @generated
	 */
	Integrate createIntegrate();

	/**
	 * Returns a new object of class '<em>Identify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identify</em>'.
	 * @generated
	 */
	Identify createIdentify();

	/**
	 * Returns a new object of class '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate</em>'.
	 * @generated
	 */
	Validate createValidate();

	/**
	 * Returns a new object of class '<em>Classify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classify</em>'.
	 * @generated
	 */
	Classify createClassify();

	/**
	 * Returns a new object of class '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort</em>'.
	 * @generated
	 */
	Sort createSort();

	/**
	 * Returns a new object of class '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge</em>'.
	 * @generated
	 */
	Merge createMerge();

	/**
	 * Returns a new object of class '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate</em>'.
	 * @generated
	 */
	Aggregate createAggregate();

	/**
	 * Returns a new object of class '<em>Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cleaning</em>'.
	 * @generated
	 */
	Cleaning createCleaning();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Reduce Noise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Noise</em>'.
	 * @generated
	 */
	ReduceNoise createReduceNoise();

	/**
	 * Returns a new object of class '<em>Describe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Describe</em>'.
	 * @generated
	 */
	Describe createDescribe();

	/**
	 * Returns a new object of class '<em>Diagnose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnose</em>'.
	 * @generated
	 */
	Diagnose createDiagnose();

	/**
	 * Returns a new object of class '<em>Predict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predict</em>'.
	 * @generated
	 */
	Predict createPredict();

	/**
	 * Returns a new object of class '<em>Prescript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prescript</em>'.
	 * @generated
	 */
	Prescript createPrescript();

	/**
	 * Returns a new object of class '<em>Math Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Operation</em>'.
	 * @generated
	 */
	Math_Operation createMath_Operation();

	/**
	 * Returns a new object of class '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational DB</em>'.
	 * @generated
	 */
	RelationalDB createRelationalDB();

	/**
	 * Returns a new object of class '<em>XML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML</em>'.
	 * @generated
	 */
	XML createXML();

	/**
	 * Returns a new object of class '<em>JSON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON</em>'.
	 * @generated
	 */
	JSON createJSON();

	/**
	 * Returns a new object of class '<em>CSV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV</em>'.
	 * @generated
	 */
	CSV createCSV();

	/**
	 * Returns a new object of class '<em>Excel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel</em>'.
	 * @generated
	 */
	Excel createExcel();

	/**
	 * Returns a new object of class '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML</em>'.
	 * @generated
	 */
	HTML createHTML();

	/**
	 * Returns a new object of class '<em>RDF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF</em>'.
	 * @generated
	 */
	RDF createRDF();

	/**
	 * Returns a new object of class '<em>EDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDI</em>'.
	 * @generated
	 */
	EDI createEDI();

	/**
	 * Returns a new object of class '<em>SMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMS</em>'.
	 * @generated
	 */
	SMS createSMS();

	/**
	 * Returns a new object of class '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email</em>'.
	 * @generated
	 */
	Email createEmail();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>GPS Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Data</em>'.
	 * @generated
	 */
	GPSData createGPSData();

	/**
	 * Returns a new object of class '<em>Logs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logs</em>'.
	 * @generated
	 */
	Logs createLogs();

	/**
	 * Returns a new object of class '<em>Word File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Word File</em>'.
	 * @generated
	 */
	WordFile createWordFile();

	/**
	 * Returns a new object of class '<em>PDF File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDF File</em>'.
	 * @generated
	 */
	PDFFile createPDFFile();

	/**
	 * Returns a new object of class '<em>Text File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text File</em>'.
	 * @generated
	 */
	TextFile createTextFile();

	/**
	 * Returns a new object of class '<em>Sensor Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Data</em>'.
	 * @generated
	 */
	SensorData createSensorData();

	/**
	 * Returns a new object of class '<em>Document Oriented</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Oriented</em>'.
	 * @generated
	 */
	DocumentOriented createDocumentOriented();

	/**
	 * Returns a new object of class '<em>Column Oriented</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Oriented</em>'.
	 * @generated
	 */
	ColumnOriented createColumnOriented();

	/**
	 * Returns a new object of class '<em>Graphs Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphs Database</em>'.
	 * @generated
	 */
	GraphsDatabase createGraphsDatabase();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns a new object of class '<em>Retrieve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retrieve</em>'.
	 * @generated
	 */
	Retrieve createRetrieve();

	/**
	 * Returns a new object of class '<em>Save</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save</em>'.
	 * @generated
	 */
	Save createSave();

	/**
	 * Returns a new object of class '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive</em>'.
	 * @generated
	 */
	Archive createArchive();

	/**
	 * Returns a new object of class '<em>Govern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Govern</em>'.
	 * @generated
	 */
	Govern createGovern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataArchPackage getDataArchPackage();

} //DataArchFactory
