/**
 */
package DataArch.util;

import DataArch.API;
import DataArch.Action;
import DataArch.Aggregate;
import DataArch.Analyze;
import DataArch.Archive;
import DataArch.Audio;
import DataArch.Batch;
import DataArch.BehaviouralElement;
import DataArch.CSV;
import DataArch.Classify;
import DataArch.Cleaning;
import DataArch.Cloud;
import DataArch.ColumnOriented;
import DataArch.Compress;
import DataArch.Connection;
import DataArch.Consume;
import DataArch.DataArchPackage;
import DataArch.DataArchitecture;
import DataArch.DataFormat;
import DataArch.DataLocation;
import DataArch.DataNode;
import DataArch.DataProcessingType;
import DataArch.DataRepresentation;
import DataArch.DataStorageType;
import DataArch.Describe;
import DataArch.Diagnose;
import DataArch.DocumentOriented;
import DataArch.EDI;
import DataArch.Email;
import DataArch.Event;
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
import DataArch.LinkableElement;
import DataArch.Logs;
import DataArch.Math_Operation;
import DataArch.Merge;
import DataArch.MessagePort;
import DataArch.Multidimensional;
import DataArch.Multimedia;
import DataArch.NoSQL;
import DataArch.OfficeFile;
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
import DataArch.SemiStructuredData;
import DataArch.SendData;
import DataArch.SensorData;
import DataArch.Sort;
import DataArch.Store;
import DataArch.StructuredData;
import DataArch.Technique;
import DataArch.TextFile;
import DataArch.Tranfrom;
import DataArch.Type;
import DataArch.UnStructuredData;
import DataArch.Validate;
import DataArch.Video;
import DataArch.Visualize;
import DataArch.WordFile;
import DataArch.XML;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DataArch.DataArchPackage
 * @generated
 */
public class DataArchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataArchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataArchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataArchSwitch<Adapter> modelSwitch =
		new DataArchSwitch<Adapter>() {
			@Override
			public Adapter caseDataArchitecture(DataArchitecture object) {
				return createDataArchitectureAdapter();
			}
			@Override
			public Adapter caseDataNode(DataNode object) {
				return createDataNodeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseMessagePort(MessagePort object) {
				return createMessagePortAdapter();
			}
			@Override
			public Adapter caseInMessagePort(InMessagePort object) {
				return createInMessagePortAdapter();
			}
			@Override
			public Adapter caseOutMessagePort(OutMessagePort object) {
				return createOutMessagePortAdapter();
			}
			@Override
			public Adapter caseBehaviouralElement(BehaviouralElement object) {
				return createBehaviouralElementAdapter();
			}
			@Override
			public Adapter caseDataFormat(DataFormat object) {
				return createDataFormatAdapter();
			}
			@Override
			public Adapter caseStructuredData(StructuredData object) {
				return createStructuredDataAdapter();
			}
			@Override
			public Adapter caseSemiStructuredData(SemiStructuredData object) {
				return createSemiStructuredDataAdapter();
			}
			@Override
			public Adapter caseUnStructuredData(UnStructuredData object) {
				return createUnStructuredDataAdapter();
			}
			@Override
			public Adapter caseDataStorageType(DataStorageType object) {
				return createDataStorageTypeAdapter();
			}
			@Override
			public Adapter caseDataLocation(DataLocation object) {
				return createDataLocationAdapter();
			}
			@Override
			public Adapter caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			@Override
			public Adapter caseOn_Premise(On_Premise object) {
				return createOn_PremiseAdapter();
			}
			@Override
			public Adapter caseFile_System(File_System object) {
				return createFile_SystemAdapter();
			}
			@Override
			public Adapter caseRelational(Relational object) {
				return createRelationalAdapter();
			}
			@Override
			public Adapter caseMultidimensional(Multidimensional object) {
				return createMultidimensionalAdapter();
			}
			@Override
			public Adapter caseNoSQL(NoSQL object) {
				return createNoSQLAdapter();
			}
			@Override
			public Adapter caseDataProcessingType(DataProcessingType object) {
				return createDataProcessingTypeAdapter();
			}
			@Override
			public Adapter caseRealTime(RealTime object) {
				return createRealTimeAdapter();
			}
			@Override
			public Adapter caseBatch(Batch object) {
				return createBatchAdapter();
			}
			@Override
			public Adapter caseLinkableElement(LinkableElement object) {
				return createLinkableElementAdapter();
			}
			@Override
			public Adapter caseDataRepresentation(DataRepresentation object) {
				return createDataRepresentationAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseReceiveData(ReceiveData object) {
				return createReceiveDataAdapter();
			}
			@Override
			public Adapter caseSendData(SendData object) {
				return createSendDataAdapter();
			}
			@Override
			public Adapter caseGenerate(Generate object) {
				return createGenerateAdapter();
			}
			@Override
			public Adapter caseIngest(Ingest object) {
				return createIngestAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseAnalyze(Analyze object) {
				return createAnalyzeAdapter();
			}
			@Override
			public Adapter caseConsume(Consume object) {
				return createConsumeAdapter();
			}
			@Override
			public Adapter caseVisualize(Visualize object) {
				return createVisualizeAdapter();
			}
			@Override
			public Adapter caseQuery_Report(Query_Report object) {
				return createQuery_ReportAdapter();
			}
			@Override
			public Adapter caseAPI(API object) {
				return createAPIAdapter();
			}
			@Override
			public Adapter caseProcess(DataArch.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseTranfrom(Tranfrom object) {
				return createTranfromAdapter();
			}
			@Override
			public Adapter caseCompress(Compress object) {
				return createCompressAdapter();
			}
			@Override
			public Adapter caseIntegrate(Integrate object) {
				return createIntegrateAdapter();
			}
			@Override
			public Adapter caseIdentify(Identify object) {
				return createIdentifyAdapter();
			}
			@Override
			public Adapter caseValidate(Validate object) {
				return createValidateAdapter();
			}
			@Override
			public Adapter caseClassify(Classify object) {
				return createClassifyAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseMerge(Merge object) {
				return createMergeAdapter();
			}
			@Override
			public Adapter caseAggregate(Aggregate object) {
				return createAggregateAdapter();
			}
			@Override
			public Adapter caseCleaning(Cleaning object) {
				return createCleaningAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseReduceNoise(ReduceNoise object) {
				return createReduceNoiseAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTechnique(Technique object) {
				return createTechniqueAdapter();
			}
			@Override
			public Adapter caseDescribe(Describe object) {
				return createDescribeAdapter();
			}
			@Override
			public Adapter caseDiagnose(Diagnose object) {
				return createDiagnoseAdapter();
			}
			@Override
			public Adapter casePredict(Predict object) {
				return createPredictAdapter();
			}
			@Override
			public Adapter casePrescript(Prescript object) {
				return createPrescriptAdapter();
			}
			@Override
			public Adapter caseMath_Operation(Math_Operation object) {
				return createMath_OperationAdapter();
			}
			@Override
			public Adapter caseRelationalDB(RelationalDB object) {
				return createRelationalDBAdapter();
			}
			@Override
			public Adapter caseXML(XML object) {
				return createXMLAdapter();
			}
			@Override
			public Adapter caseJSON(JSON object) {
				return createJSONAdapter();
			}
			@Override
			public Adapter caseCSV(CSV object) {
				return createCSVAdapter();
			}
			@Override
			public Adapter caseExcel(Excel object) {
				return createExcelAdapter();
			}
			@Override
			public Adapter caseHTML(HTML object) {
				return createHTMLAdapter();
			}
			@Override
			public Adapter caseRDF(RDF object) {
				return createRDFAdapter();
			}
			@Override
			public Adapter caseEDI(EDI object) {
				return createEDIAdapter();
			}
			@Override
			public Adapter caseSMS(SMS object) {
				return createSMSAdapter();
			}
			@Override
			public Adapter caseEmail(Email object) {
				return createEmailAdapter();
			}
			@Override
			public Adapter caseMultimedia(Multimedia object) {
				return createMultimediaAdapter();
			}
			@Override
			public Adapter caseAudio(Audio object) {
				return createAudioAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseGPSData(GPSData object) {
				return createGPSDataAdapter();
			}
			@Override
			public Adapter caseOfficeFile(OfficeFile object) {
				return createOfficeFileAdapter();
			}
			@Override
			public Adapter caseLogs(Logs object) {
				return createLogsAdapter();
			}
			@Override
			public Adapter caseWordFile(WordFile object) {
				return createWordFileAdapter();
			}
			@Override
			public Adapter casePDFFile(PDFFile object) {
				return createPDFFileAdapter();
			}
			@Override
			public Adapter caseTextFile(TextFile object) {
				return createTextFileAdapter();
			}
			@Override
			public Adapter caseSensorData(SensorData object) {
				return createSensorDataAdapter();
			}
			@Override
			public Adapter caseDocumentOriented(DocumentOriented object) {
				return createDocumentOrientedAdapter();
			}
			@Override
			public Adapter caseColumnOriented(ColumnOriented object) {
				return createColumnOrientedAdapter();
			}
			@Override
			public Adapter caseGraphsDatabase(GraphsDatabase object) {
				return createGraphsDatabaseAdapter();
			}
			@Override
			public Adapter caseKeyValue(KeyValue object) {
				return createKeyValueAdapter();
			}
			@Override
			public Adapter caseRetrieve(Retrieve object) {
				return createRetrieveAdapter();
			}
			@Override
			public Adapter caseSave(Save object) {
				return createSaveAdapter();
			}
			@Override
			public Adapter caseArchive(Archive object) {
				return createArchiveAdapter();
			}
			@Override
			public Adapter caseGovern(Govern object) {
				return createGovernAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataArchitecture <em>Data Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataArchitecture
	 * @generated
	 */
	public Adapter createDataArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataNode
	 * @generated
	 */
	public Adapter createDataNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.MessagePort
	 * @generated
	 */
	public Adapter createMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.InMessagePort <em>In Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.InMessagePort
	 * @generated
	 */
	public Adapter createInMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.OutMessagePort <em>Out Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.OutMessagePort
	 * @generated
	 */
	public Adapter createOutMessagePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.BehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.BehaviouralElement
	 * @generated
	 */
	public Adapter createBehaviouralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataFormat
	 * @generated
	 */
	public Adapter createDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.StructuredData <em>Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.StructuredData
	 * @generated
	 */
	public Adapter createStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.SemiStructuredData <em>Semi Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.SemiStructuredData
	 * @generated
	 */
	public Adapter createSemiStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.UnStructuredData <em>Un Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.UnStructuredData
	 * @generated
	 */
	public Adapter createUnStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataStorageType <em>Data Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataStorageType
	 * @generated
	 */
	public Adapter createDataStorageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataLocation
	 * @generated
	 */
	public Adapter createDataLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.On_Premise <em>On Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.On_Premise
	 * @generated
	 */
	public Adapter createOn_PremiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.File_System <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.File_System
	 * @generated
	 */
	public Adapter createFile_SystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Relational <em>Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Relational
	 * @generated
	 */
	public Adapter createRelationalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Multidimensional <em>Multidimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Multidimensional
	 * @generated
	 */
	public Adapter createMultidimensionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.NoSQL
	 * @generated
	 */
	public Adapter createNoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataProcessingType
	 * @generated
	 */
	public Adapter createDataProcessingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.RealTime <em>Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.RealTime
	 * @generated
	 */
	public Adapter createRealTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Batch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Batch
	 * @generated
	 */
	public Adapter createBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.LinkableElement
	 * @generated
	 */
	public Adapter createLinkableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DataRepresentation <em>Data Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DataRepresentation
	 * @generated
	 */
	public Adapter createDataRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.ReceiveData <em>Receive Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.ReceiveData
	 * @generated
	 */
	public Adapter createReceiveDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.SendData <em>Send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.SendData
	 * @generated
	 */
	public Adapter createSendDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Generate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Generate
	 * @generated
	 */
	public Adapter createGenerateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Ingest <em>Ingest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Ingest
	 * @generated
	 */
	public Adapter createIngestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Analyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Analyze
	 * @generated
	 */
	public Adapter createAnalyzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Consume <em>Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Consume
	 * @generated
	 */
	public Adapter createConsumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Visualize <em>Visualize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Visualize
	 * @generated
	 */
	public Adapter createVisualizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Query_Report <em>Query Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Query_Report
	 * @generated
	 */
	public Adapter createQuery_ReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Tranfrom <em>Tranfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Tranfrom
	 * @generated
	 */
	public Adapter createTranfromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Compress <em>Compress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Compress
	 * @generated
	 */
	public Adapter createCompressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Integrate <em>Integrate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Integrate
	 * @generated
	 */
	public Adapter createIntegrateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Identify <em>Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Identify
	 * @generated
	 */
	public Adapter createIdentifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Validate
	 * @generated
	 */
	public Adapter createValidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Classify <em>Classify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Classify
	 * @generated
	 */
	public Adapter createClassifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Aggregate
	 * @generated
	 */
	public Adapter createAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Cleaning <em>Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Cleaning
	 * @generated
	 */
	public Adapter createCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.ReduceNoise <em>Reduce Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.ReduceNoise
	 * @generated
	 */
	public Adapter createReduceNoiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Technique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Technique
	 * @generated
	 */
	public Adapter createTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Describe <em>Describe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Describe
	 * @generated
	 */
	public Adapter createDescribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Diagnose <em>Diagnose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Diagnose
	 * @generated
	 */
	public Adapter createDiagnoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Predict <em>Predict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Predict
	 * @generated
	 */
	public Adapter createPredictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Prescript <em>Prescript</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Prescript
	 * @generated
	 */
	public Adapter createPrescriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Math_Operation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Math_Operation
	 * @generated
	 */
	public Adapter createMath_OperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.RelationalDB
	 * @generated
	 */
	public Adapter createRelationalDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.XML <em>XML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.XML
	 * @generated
	 */
	public Adapter createXMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.JSON
	 * @generated
	 */
	public Adapter createJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.CSV
	 * @generated
	 */
	public Adapter createCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Excel
	 * @generated
	 */
	public Adapter createExcelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.HTML
	 * @generated
	 */
	public Adapter createHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.RDF <em>RDF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.RDF
	 * @generated
	 */
	public Adapter createRDFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.EDI <em>EDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.EDI
	 * @generated
	 */
	public Adapter createEDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.SMS <em>SMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.SMS
	 * @generated
	 */
	public Adapter createSMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Email
	 * @generated
	 */
	public Adapter createEmailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Multimedia
	 * @generated
	 */
	public Adapter createMultimediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Audio
	 * @generated
	 */
	public Adapter createAudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.GPSData <em>GPS Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.GPSData
	 * @generated
	 */
	public Adapter createGPSDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.OfficeFile <em>Office File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.OfficeFile
	 * @generated
	 */
	public Adapter createOfficeFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Logs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Logs
	 * @generated
	 */
	public Adapter createLogsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.WordFile <em>Word File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.WordFile
	 * @generated
	 */
	public Adapter createWordFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.PDFFile <em>PDF File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.PDFFile
	 * @generated
	 */
	public Adapter createPDFFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.TextFile <em>Text File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.TextFile
	 * @generated
	 */
	public Adapter createTextFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.SensorData
	 * @generated
	 */
	public Adapter createSensorDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.DocumentOriented <em>Document Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.DocumentOriented
	 * @generated
	 */
	public Adapter createDocumentOrientedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.ColumnOriented <em>Column Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.ColumnOriented
	 * @generated
	 */
	public Adapter createColumnOrientedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.GraphsDatabase <em>Graphs Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.GraphsDatabase
	 * @generated
	 */
	public Adapter createGraphsDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Retrieve <em>Retrieve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Retrieve
	 * @generated
	 */
	public Adapter createRetrieveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Save <em>Save</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Save
	 * @generated
	 */
	public Adapter createSaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Archive
	 * @generated
	 */
	public Adapter createArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataArch.Govern <em>Govern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataArch.Govern
	 * @generated
	 */
	public Adapter createGovernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataArchAdapterFactory
