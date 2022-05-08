/**
 */
package DataArch.impl;

import DataArch.Action;
import DataArch.Aggregate;
import DataArch.Analyze;
import DataArch.Archive;
import DataArch.Audio;
import DataArch.Batch;
import DataArch.BehaviouralElement;
import DataArch.Classify;
import DataArch.Cleaning;
import DataArch.Cloud;
import DataArch.ColumnOriented;
import DataArch.Compress;
import DataArch.Connection;
import DataArch.Consume;
import DataArch.DataArchFactory;
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
import DataArch.Email;
import DataArch.Event;
import DataArch.Excel;
import DataArch.File_System;
import DataArch.Filter;
import DataArch.GPSData;
import DataArch.Generate;
import DataArch.Govern;
import DataArch.GraphsDatabase;
import DataArch.Identify;
import DataArch.Image;
import DataArch.InMessagePort;
import DataArch.Ingest;
import DataArch.Integrate;
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
import DataArch.RealTime;
import DataArch.ReceiveData;
import DataArch.ReduceNoise;
import DataArch.Relational;
import DataArch.RelationalDB;
import DataArch.Retrieve;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataArchPackageImpl extends EPackageImpl implements DataArchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inMessagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outMessagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviouralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semiStructuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unStructuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStorageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass on_PremiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass file_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multidimensionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass query_ReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tranfromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceNoiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass math_OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ediEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multimediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdfFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentOrientedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnOrientedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphsDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrieveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass governEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DataArch.DataArchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataArchPackageImpl() {
		super(eNS_URI, DataArchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataArchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataArchPackage init() {
		if (isInited) return (DataArchPackage)EPackage.Registry.INSTANCE.getEPackage(DataArchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataArchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataArchPackageImpl theDataArchPackage = registeredDataArchPackage instanceof DataArchPackageImpl ? (DataArchPackageImpl)registeredDataArchPackage : new DataArchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataArchPackage.createPackageContents();

		// Initialize created meta-data
		theDataArchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataArchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataArchPackage.eNS_URI, theDataArchPackage);
		return theDataArchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataArchitecture() {
		return dataArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataArchitecture_DataNodes() {
		return (EReference)dataArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataArchitecture_DataConnection() {
		return (EReference)dataArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataNode() {
		return dataNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataNode_NodeName() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataNode_Outgoing() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataNode_Incoming() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataNode_BehaviouralElements() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataNode_Ports() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Text() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Source() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessagePort() {
		return messagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessagePort_Name() {
		return (EAttribute)messagePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInMessagePort() {
		return inMessagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutMessagePort() {
		return outMessagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviouralElement() {
		return behaviouralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviouralElement_Name() {
		return (EAttribute)behaviouralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFormat() {
		return dataFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuredData() {
		return structuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemiStructuredData() {
		return semiStructuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnStructuredData() {
		return unStructuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStorageType() {
		return dataStorageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataLocation() {
		return dataLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloud() {
		return cloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOn_Premise() {
		return on_PremiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile_System() {
		return file_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelational() {
		return relationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultidimensional() {
		return multidimensionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSQL() {
		return noSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProcessingType() {
		return dataProcessingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealTime() {
		return realTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBatch() {
		return batchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkableElement() {
		return linkableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkableElement_Outgoing() {
		return (EReference)linkableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRepresentation() {
		return dataRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Incoming() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Source() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReceiveData() {
		return receiveDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReceiveData_FromMessagePorts() {
		return (EReference)receiveDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReceiveData_DataRecipient() {
		return (EReference)receiveDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendData() {
		return sendDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendData_ToMessagePorts() {
		return (EReference)sendDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendData_DataRecipient() {
		return (EReference)sendDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerate() {
		return generateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngest() {
		return ingestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalyze() {
		return analyzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsume() {
		return consumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualize() {
		return visualizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuery_Report() {
		return query_ReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTranfrom() {
		return tranfromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompress() {
		return compressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegrate() {
		return integrateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentify() {
		return identifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidate() {
		return validateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassify() {
		return classifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMerge() {
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregate() {
		return aggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCleaning() {
		return cleaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReduceNoise() {
		return reduceNoiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnique() {
		return techniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribe() {
		return describeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagnose() {
		return diagnoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredict() {
		return predictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrescript() {
		return prescriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMath_Operation() {
		return math_OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationalDB() {
		return relationalDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationalDB_DbName() {
		return (EAttribute)relationalDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXML() {
		return xmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSON() {
		return jsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSV() {
		return csvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcel() {
		return excelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTML() {
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDF() {
		return rdfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDI() {
		return ediEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMS() {
		return smsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSMS_From() {
		return (EAttribute)smsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSMS_To() {
		return (EAttribute)smsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSMS_Message() {
		return (EAttribute)smsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmail_Subject() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmail_From() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmail_To() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmail_Message() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultimedia() {
		return multimediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Id_Multi() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Size() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Comment() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Length() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Format() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultimedia_Url() {
		return (EAttribute)multimediaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_NumberColor() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Transparency() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Animation() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Timestamp() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGPSData() {
		return gpsDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPSData_Latitude() {
		return (EAttribute)gpsDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPSData_Longitude() {
		return (EAttribute)gpsDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPSData_Position() {
		return (EAttribute)gpsDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPSData_Altitude() {
		return (EAttribute)gpsDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPSData_Time() {
		return (EAttribute)gpsDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfficeFile() {
		return officeFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Text() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Font() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Textsize() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Color() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Bold() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Italics() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Underline() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Url() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfficeFile_Size() {
		return (EAttribute)officeFileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogs() {
		return logsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWordFile() {
		return wordFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPDFFile() {
		return pdfFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextFile() {
		return textFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorData() {
		return sensorDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Physicalsize() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_MeasuringRange() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Sensivity() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Resolution() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Precision() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Reproducibility() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Linearity() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_ResponseTime() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Bandwidth() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_Hystersis() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorData_TemperatureRange() {
		return (EAttribute)sensorDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentOriented() {
		return documentOrientedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnOriented() {
		return columnOrientedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphsDatabase() {
		return graphsDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValue() {
		return keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetrieve() {
		return retrieveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSave() {
		return saveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGovern() {
		return governEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataArchFactory getDataArchFactory() {
		return (DataArchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataArchitectureEClass = createEClass(DATA_ARCHITECTURE);
		createEReference(dataArchitectureEClass, DATA_ARCHITECTURE__DATA_NODES);
		createEReference(dataArchitectureEClass, DATA_ARCHITECTURE__DATA_CONNECTION);

		dataNodeEClass = createEClass(DATA_NODE);
		createEAttribute(dataNodeEClass, DATA_NODE__NODE_NAME);
		createEReference(dataNodeEClass, DATA_NODE__OUTGOING);
		createEReference(dataNodeEClass, DATA_NODE__INCOMING);
		createEReference(dataNodeEClass, DATA_NODE__BEHAVIOURAL_ELEMENTS);
		createEReference(dataNodeEClass, DATA_NODE__PORTS);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__TEXT);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);

		messagePortEClass = createEClass(MESSAGE_PORT);
		createEAttribute(messagePortEClass, MESSAGE_PORT__NAME);

		inMessagePortEClass = createEClass(IN_MESSAGE_PORT);

		outMessagePortEClass = createEClass(OUT_MESSAGE_PORT);

		behaviouralElementEClass = createEClass(BEHAVIOURAL_ELEMENT);
		createEAttribute(behaviouralElementEClass, BEHAVIOURAL_ELEMENT__NAME);

		dataFormatEClass = createEClass(DATA_FORMAT);

		structuredDataEClass = createEClass(STRUCTURED_DATA);

		semiStructuredDataEClass = createEClass(SEMI_STRUCTURED_DATA);

		unStructuredDataEClass = createEClass(UN_STRUCTURED_DATA);

		dataStorageTypeEClass = createEClass(DATA_STORAGE_TYPE);

		dataLocationEClass = createEClass(DATA_LOCATION);

		cloudEClass = createEClass(CLOUD);

		on_PremiseEClass = createEClass(ON_PREMISE);

		file_SystemEClass = createEClass(FILE_SYSTEM);

		relationalEClass = createEClass(RELATIONAL);

		multidimensionalEClass = createEClass(MULTIDIMENSIONAL);

		noSQLEClass = createEClass(NO_SQL);

		dataProcessingTypeEClass = createEClass(DATA_PROCESSING_TYPE);

		realTimeEClass = createEClass(REAL_TIME);

		batchEClass = createEClass(BATCH);

		linkableElementEClass = createEClass(LINKABLE_ELEMENT);
		createEReference(linkableElementEClass, LINKABLE_ELEMENT__OUTGOING);

		dataRepresentationEClass = createEClass(DATA_REPRESENTATION);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__INCOMING);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__TARGET);

		eventEClass = createEClass(EVENT);

		receiveDataEClass = createEClass(RECEIVE_DATA);
		createEReference(receiveDataEClass, RECEIVE_DATA__FROM_MESSAGE_PORTS);
		createEReference(receiveDataEClass, RECEIVE_DATA__DATA_RECIPIENT);

		sendDataEClass = createEClass(SEND_DATA);
		createEReference(sendDataEClass, SEND_DATA__TO_MESSAGE_PORTS);
		createEReference(sendDataEClass, SEND_DATA__DATA_RECIPIENT);

		generateEClass = createEClass(GENERATE);

		ingestEClass = createEClass(INGEST);

		storeEClass = createEClass(STORE);

		analyzeEClass = createEClass(ANALYZE);

		consumeEClass = createEClass(CONSUME);

		visualizeEClass = createEClass(VISUALIZE);

		query_ReportEClass = createEClass(QUERY_REPORT);

		apiEClass = createEClass(API);

		processEClass = createEClass(PROCESS);

		tranfromEClass = createEClass(TRANFROM);

		compressEClass = createEClass(COMPRESS);

		integrateEClass = createEClass(INTEGRATE);

		identifyEClass = createEClass(IDENTIFY);

		validateEClass = createEClass(VALIDATE);

		classifyEClass = createEClass(CLASSIFY);

		sortEClass = createEClass(SORT);

		mergeEClass = createEClass(MERGE);

		aggregateEClass = createEClass(AGGREGATE);

		cleaningEClass = createEClass(CLEANING);

		filterEClass = createEClass(FILTER);

		reduceNoiseEClass = createEClass(REDUCE_NOISE);

		typeEClass = createEClass(TYPE);

		techniqueEClass = createEClass(TECHNIQUE);

		describeEClass = createEClass(DESCRIBE);

		diagnoseEClass = createEClass(DIAGNOSE);

		predictEClass = createEClass(PREDICT);

		prescriptEClass = createEClass(PRESCRIPT);

		math_OperationEClass = createEClass(MATH_OPERATION);

		relationalDBEClass = createEClass(RELATIONAL_DB);
		createEAttribute(relationalDBEClass, RELATIONAL_DB__DB_NAME);

		xmlEClass = createEClass(XML);

		jsonEClass = createEClass(JSON);

		csvEClass = createEClass(CSV);

		excelEClass = createEClass(EXCEL);

		htmlEClass = createEClass(HTML);

		rdfEClass = createEClass(RDF);

		ediEClass = createEClass(EDI);

		smsEClass = createEClass(SMS);
		createEAttribute(smsEClass, SMS__FROM);
		createEAttribute(smsEClass, SMS__TO);
		createEAttribute(smsEClass, SMS__MESSAGE);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__SUBJECT);
		createEAttribute(emailEClass, EMAIL__FROM);
		createEAttribute(emailEClass, EMAIL__TO);
		createEAttribute(emailEClass, EMAIL__MESSAGE);

		multimediaEClass = createEClass(MULTIMEDIA);
		createEAttribute(multimediaEClass, MULTIMEDIA__ID_MULTI);
		createEAttribute(multimediaEClass, MULTIMEDIA__SIZE);
		createEAttribute(multimediaEClass, MULTIMEDIA__COMMENT);
		createEAttribute(multimediaEClass, MULTIMEDIA__LENGTH);
		createEAttribute(multimediaEClass, MULTIMEDIA__FORMAT);
		createEAttribute(multimediaEClass, MULTIMEDIA__URL);

		audioEClass = createEClass(AUDIO);

		videoEClass = createEClass(VIDEO);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__NUMBER_COLOR);
		createEAttribute(imageEClass, IMAGE__TRANSPARENCY);
		createEAttribute(imageEClass, IMAGE__ANIMATION);
		createEAttribute(imageEClass, IMAGE__TIMESTAMP);

		gpsDataEClass = createEClass(GPS_DATA);
		createEAttribute(gpsDataEClass, GPS_DATA__LATITUDE);
		createEAttribute(gpsDataEClass, GPS_DATA__LONGITUDE);
		createEAttribute(gpsDataEClass, GPS_DATA__POSITION);
		createEAttribute(gpsDataEClass, GPS_DATA__ALTITUDE);
		createEAttribute(gpsDataEClass, GPS_DATA__TIME);

		officeFileEClass = createEClass(OFFICE_FILE);
		createEAttribute(officeFileEClass, OFFICE_FILE__TEXT);
		createEAttribute(officeFileEClass, OFFICE_FILE__FONT);
		createEAttribute(officeFileEClass, OFFICE_FILE__TEXTSIZE);
		createEAttribute(officeFileEClass, OFFICE_FILE__COLOR);
		createEAttribute(officeFileEClass, OFFICE_FILE__BOLD);
		createEAttribute(officeFileEClass, OFFICE_FILE__ITALICS);
		createEAttribute(officeFileEClass, OFFICE_FILE__UNDERLINE);
		createEAttribute(officeFileEClass, OFFICE_FILE__URL);
		createEAttribute(officeFileEClass, OFFICE_FILE__SIZE);

		logsEClass = createEClass(LOGS);

		wordFileEClass = createEClass(WORD_FILE);

		pdfFileEClass = createEClass(PDF_FILE);

		textFileEClass = createEClass(TEXT_FILE);

		sensorDataEClass = createEClass(SENSOR_DATA);
		createEAttribute(sensorDataEClass, SENSOR_DATA__PHYSICALSIZE);
		createEAttribute(sensorDataEClass, SENSOR_DATA__MEASURING_RANGE);
		createEAttribute(sensorDataEClass, SENSOR_DATA__SENSIVITY);
		createEAttribute(sensorDataEClass, SENSOR_DATA__RESOLUTION);
		createEAttribute(sensorDataEClass, SENSOR_DATA__PRECISION);
		createEAttribute(sensorDataEClass, SENSOR_DATA__REPRODUCIBILITY);
		createEAttribute(sensorDataEClass, SENSOR_DATA__LINEARITY);
		createEAttribute(sensorDataEClass, SENSOR_DATA__RESPONSE_TIME);
		createEAttribute(sensorDataEClass, SENSOR_DATA__BANDWIDTH);
		createEAttribute(sensorDataEClass, SENSOR_DATA__HYSTERSIS);
		createEAttribute(sensorDataEClass, SENSOR_DATA__TEMPERATURE_RANGE);

		documentOrientedEClass = createEClass(DOCUMENT_ORIENTED);

		columnOrientedEClass = createEClass(COLUMN_ORIENTED);

		graphsDatabaseEClass = createEClass(GRAPHS_DATABASE);

		keyValueEClass = createEClass(KEY_VALUE);

		retrieveEClass = createEClass(RETRIEVE);

		saveEClass = createEClass(SAVE);

		archiveEClass = createEClass(ARCHIVE);

		governEClass = createEClass(GOVERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inMessagePortEClass.getESuperTypes().add(this.getMessagePort());
		outMessagePortEClass.getESuperTypes().add(this.getMessagePort());
		dataFormatEClass.getESuperTypes().add(this.getDataRepresentation());
		structuredDataEClass.getESuperTypes().add(this.getDataFormat());
		semiStructuredDataEClass.getESuperTypes().add(this.getDataFormat());
		unStructuredDataEClass.getESuperTypes().add(this.getDataFormat());
		dataStorageTypeEClass.getESuperTypes().add(this.getDataRepresentation());
		dataLocationEClass.getESuperTypes().add(this.getDataRepresentation());
		cloudEClass.getESuperTypes().add(this.getDataLocation());
		on_PremiseEClass.getESuperTypes().add(this.getDataLocation());
		file_SystemEClass.getESuperTypes().add(this.getDataStorageType());
		relationalEClass.getESuperTypes().add(this.getDataStorageType());
		multidimensionalEClass.getESuperTypes().add(this.getDataStorageType());
		noSQLEClass.getESuperTypes().add(this.getDataStorageType());
		dataProcessingTypeEClass.getESuperTypes().add(this.getDataRepresentation());
		realTimeEClass.getESuperTypes().add(this.getDataProcessingType());
		batchEClass.getESuperTypes().add(this.getDataProcessingType());
		linkableElementEClass.getESuperTypes().add(this.getBehaviouralElement());
		dataRepresentationEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(this.getLinkableElement());
		linkEClass.getESuperTypes().add(this.getBehaviouralElement());
		eventEClass.getESuperTypes().add(this.getLinkableElement());
		receiveDataEClass.getESuperTypes().add(this.getEvent());
		sendDataEClass.getESuperTypes().add(this.getAction());
		generateEClass.getESuperTypes().add(this.getAction());
		ingestEClass.getESuperTypes().add(this.getAction());
		storeEClass.getESuperTypes().add(this.getAction());
		analyzeEClass.getESuperTypes().add(this.getAction());
		consumeEClass.getESuperTypes().add(this.getAction());
		visualizeEClass.getESuperTypes().add(this.getConsume());
		query_ReportEClass.getESuperTypes().add(this.getConsume());
		apiEClass.getESuperTypes().add(this.getConsume());
		processEClass.getESuperTypes().add(this.getAction());
		tranfromEClass.getESuperTypes().add(this.getIngest());
		compressEClass.getESuperTypes().add(this.getIngest());
		integrateEClass.getESuperTypes().add(this.getIngest());
		identifyEClass.getESuperTypes().add(this.getIngest());
		validateEClass.getESuperTypes().add(this.getIngest());
		classifyEClass.getESuperTypes().add(this.getProcess());
		sortEClass.getESuperTypes().add(this.getProcess());
		mergeEClass.getESuperTypes().add(this.getProcess());
		aggregateEClass.getESuperTypes().add(this.getProcess());
		cleaningEClass.getESuperTypes().add(this.getProcess());
		filterEClass.getESuperTypes().add(this.getIngest());
		filterEClass.getESuperTypes().add(this.getProcess());
		reduceNoiseEClass.getESuperTypes().add(this.getIngest());
		typeEClass.getESuperTypes().add(this.getAnalyze());
		techniqueEClass.getESuperTypes().add(this.getAnalyze());
		describeEClass.getESuperTypes().add(this.getType());
		diagnoseEClass.getESuperTypes().add(this.getType());
		predictEClass.getESuperTypes().add(this.getType());
		prescriptEClass.getESuperTypes().add(this.getType());
		math_OperationEClass.getESuperTypes().add(this.getProcess());
		relationalDBEClass.getESuperTypes().add(this.getStructuredData());
		xmlEClass.getESuperTypes().add(this.getSemiStructuredData());
		jsonEClass.getESuperTypes().add(this.getSemiStructuredData());
		csvEClass.getESuperTypes().add(this.getSemiStructuredData());
		excelEClass.getESuperTypes().add(this.getSemiStructuredData());
		htmlEClass.getESuperTypes().add(this.getSemiStructuredData());
		rdfEClass.getESuperTypes().add(this.getSemiStructuredData());
		ediEClass.getESuperTypes().add(this.getSemiStructuredData());
		smsEClass.getESuperTypes().add(this.getSemiStructuredData());
		emailEClass.getESuperTypes().add(this.getSemiStructuredData());
		multimediaEClass.getESuperTypes().add(this.getUnStructuredData());
		audioEClass.getESuperTypes().add(this.getMultimedia());
		videoEClass.getESuperTypes().add(this.getMultimedia());
		imageEClass.getESuperTypes().add(this.getMultimedia());
		gpsDataEClass.getESuperTypes().add(this.getUnStructuredData());
		officeFileEClass.getESuperTypes().add(this.getUnStructuredData());
		logsEClass.getESuperTypes().add(this.getOfficeFile());
		wordFileEClass.getESuperTypes().add(this.getOfficeFile());
		pdfFileEClass.getESuperTypes().add(this.getOfficeFile());
		textFileEClass.getESuperTypes().add(this.getOfficeFile());
		sensorDataEClass.getESuperTypes().add(this.getUnStructuredData());
		documentOrientedEClass.getESuperTypes().add(this.getNoSQL());
		columnOrientedEClass.getESuperTypes().add(this.getNoSQL());
		graphsDatabaseEClass.getESuperTypes().add(this.getNoSQL());
		keyValueEClass.getESuperTypes().add(this.getNoSQL());
		retrieveEClass.getESuperTypes().add(this.getStore());
		saveEClass.getESuperTypes().add(this.getStore());
		archiveEClass.getESuperTypes().add(this.getStore());
		governEClass.getESuperTypes().add(this.getStore());

		// Initialize classes and features; add operations and parameters
		initEClass(dataArchitectureEClass, DataArchitecture.class, "DataArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataArchitecture_DataNodes(), this.getDataNode(), null, "dataNodes", null, 0, -1, DataArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataArchitecture_DataConnection(), this.getConnection(), null, "dataConnection", null, 0, -1, DataArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeEClass, DataNode.class, "DataNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataNode_NodeName(), ecorePackage.getEString(), "NodeName", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNode_Outgoing(), this.getConnection(), null, "outgoing", null, 0, -1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNode_Incoming(), this.getConnection(), null, "incoming", null, 0, -1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNode_BehaviouralElements(), this.getBehaviouralElement(), null, "behaviouralElements", null, 0, -1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNode_Ports(), this.getMessagePort(), null, "ports", null, 0, -1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Text(), ecorePackage.getEString(), "text", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Source(), this.getOutMessagePort(), null, "source", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getInMessagePort(), null, "target", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messagePortEClass, MessagePort.class, "MessagePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessagePort_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inMessagePortEClass, InMessagePort.class, "InMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outMessagePortEClass, OutMessagePort.class, "OutMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviouralElementEClass, BehaviouralElement.class, "BehaviouralElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviouralElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviouralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFormatEClass, DataFormat.class, "DataFormat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredDataEClass, StructuredData.class, "StructuredData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semiStructuredDataEClass, SemiStructuredData.class, "SemiStructuredData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unStructuredDataEClass, UnStructuredData.class, "UnStructuredData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStorageTypeEClass, DataStorageType.class, "DataStorageType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLocationEClass, DataLocation.class, "DataLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudEClass, Cloud.class, "Cloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(on_PremiseEClass, On_Premise.class, "On_Premise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(file_SystemEClass, File_System.class, "File_System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalEClass, Relational.class, "Relational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multidimensionalEClass, Multidimensional.class, "Multidimensional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noSQLEClass, NoSQL.class, "NoSQL", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataProcessingTypeEClass, DataProcessingType.class, "DataProcessingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTimeEClass, RealTime.class, "RealTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batchEClass, Batch.class, "Batch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkableElementEClass, LinkableElement.class, "LinkableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkableElement_Outgoing(), this.getLink(), this.getLink_Source(), "outgoing", null, 0, -1, LinkableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRepresentationEClass, DataRepresentation.class, "DataRepresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Incoming(), this.getLink(), this.getLink_Target(), "incoming", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getLinkableElement(), this.getLinkableElement_Outgoing(), "source", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getAction(), this.getAction_Incoming(), "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveDataEClass, ReceiveData.class, "ReceiveData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveData_FromMessagePorts(), this.getInMessagePort(), null, "fromMessagePorts", null, 1, -1, ReceiveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveData_DataRecipient(), this.getDataRepresentation(), null, "dataRecipient", null, 0, 1, ReceiveData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendDataEClass, SendData.class, "SendData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendData_ToMessagePorts(), this.getOutMessagePort(), null, "toMessagePorts", null, 1, -1, SendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendData_DataRecipient(), this.getDataRepresentation(), null, "dataRecipient", null, 0, 1, SendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generateEClass, Generate.class, "Generate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ingestEClass, Ingest.class, "Ingest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analyzeEClass, Analyze.class, "Analyze", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumeEClass, Consume.class, "Consume", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualizeEClass, Visualize.class, "Visualize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(query_ReportEClass, Query_Report.class, "Query_Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apiEClass, DataArch.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, DataArch.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tranfromEClass, Tranfrom.class, "Tranfrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compressEClass, Compress.class, "Compress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrateEClass, Integrate.class, "Integrate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifyEClass, Identify.class, "Identify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validateEClass, Validate.class, "Validate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifyEClass, Classify.class, "Classify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortEClass, Sort.class, "Sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeEClass, Merge.class, "Merge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cleaningEClass, Cleaning.class, "Cleaning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reduceNoiseEClass, ReduceNoise.class, "ReduceNoise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(techniqueEClass, Technique.class, "Technique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(describeEClass, Describe.class, "Describe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagnoseEClass, Diagnose.class, "Diagnose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predictEClass, Predict.class, "Predict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescriptEClass, Prescript.class, "Prescript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(math_OperationEClass, Math_Operation.class, "Math_Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalDBEClass, RelationalDB.class, "RelationalDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalDB_DbName(), ecorePackage.getEString(), "dbName", null, 0, 1, RelationalDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEClass, DataArch.XML.class, "XML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonEClass, DataArch.JSON.class, "JSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csvEClass, DataArch.CSV.class, "CSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excelEClass, Excel.class, "Excel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlEClass, DataArch.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfEClass, DataArch.RDF.class, "RDF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ediEClass, DataArch.EDI.class, "EDI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smsEClass, DataArch.SMS.class, "SMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMS_From(), ecorePackage.getEString(), "from", null, 0, 1, DataArch.SMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMS_To(), ecorePackage.getEString(), "to", null, 0, 1, DataArch.SMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMS_Message(), ecorePackage.getEString(), "message", null, 0, 1, DataArch.SMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmail_From(), ecorePackage.getEString(), "from", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmail_To(), ecorePackage.getEString(), "to", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmail_Message(), ecorePackage.getEString(), "message", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multimediaEClass, Multimedia.class, "Multimedia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultimedia_Id_Multi(), ecorePackage.getEInt(), "id_Multi", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultimedia_Size(), ecorePackage.getEString(), "size", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultimedia_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultimedia_Length(), ecorePackage.getEString(), "length", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultimedia_Format(), ecorePackage.getEString(), "format", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultimedia_Url(), ecorePackage.getEString(), "url", null, 0, 1, Multimedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_NumberColor(), ecorePackage.getEInt(), "numberColor", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Transparency(), ecorePackage.getEBoolean(), "transparency", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Animation(), ecorePackage.getEBoolean(), "animation", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsDataEClass, GPSData.class, "GPSData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSData_Latitude(), ecorePackage.getEString(), "latitude", null, 0, 1, GPSData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSData_Longitude(), ecorePackage.getEString(), "longitude", null, 0, 1, GPSData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSData_Position(), ecorePackage.getEString(), "position", null, 0, 1, GPSData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSData_Altitude(), ecorePackage.getEString(), "altitude", null, 0, 1, GPSData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSData_Time(), ecorePackage.getEString(), "time", null, 0, 1, GPSData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(officeFileEClass, OfficeFile.class, "OfficeFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfficeFile_Text(), ecorePackage.getEString(), "text", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Font(), ecorePackage.getEString(), "font", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Textsize(), ecorePackage.getEString(), "textsize", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Color(), ecorePackage.getEString(), "color", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Italics(), ecorePackage.getEBoolean(), "italics", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Underline(), ecorePackage.getEBoolean(), "underline", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Url(), ecorePackage.getEString(), "url", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOfficeFile_Size(), ecorePackage.getEInt(), "size", null, 0, 1, OfficeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logsEClass, Logs.class, "Logs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wordFileEClass, WordFile.class, "WordFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdfFileEClass, PDFFile.class, "PDFFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFileEClass, TextFile.class, "TextFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorDataEClass, SensorData.class, "SensorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorData_Physicalsize(), ecorePackage.getEString(), "physicalsize", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_MeasuringRange(), ecorePackage.getEString(), "measuringRange", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Sensivity(), ecorePackage.getEString(), "sensivity", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Precision(), ecorePackage.getEString(), "precision", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Reproducibility(), ecorePackage.getEString(), "reproducibility", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Linearity(), ecorePackage.getEString(), "linearity", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_ResponseTime(), ecorePackage.getEString(), "responseTime", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Bandwidth(), ecorePackage.getEString(), "Bandwidth", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_Hystersis(), ecorePackage.getEString(), "hystersis", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorData_TemperatureRange(), ecorePackage.getEString(), "temperatureRange", null, 0, 1, SensorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentOrientedEClass, DocumentOriented.class, "DocumentOriented", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnOrientedEClass, ColumnOriented.class, "ColumnOriented", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphsDatabaseEClass, GraphsDatabase.class, "GraphsDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retrieveEClass, Retrieve.class, "Retrieve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(saveEClass, Save.class, "Save", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(governEClass, Govern.class, "Govern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.affixed
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (dataArchitectureEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (dataNodeEClass,
		   source,
		   new String[] {
			   "label", "NodeName",
			   "label.icon", "true",
			   "border.color", "0,0,0",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/datanode.png",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/datanode.gif"
		   });
		addAnnotation
		  (inMessagePortEClass,
		   source,
		   new String[] {
			   "size", "20,20",
			   "label", "name",
			   "label.icon", "false",
			   "border.color", "0,255,0"
		   });
		addAnnotation
		  (outMessagePortEClass,
		   source,
		   new String[] {
			   "size", "20,20",
			   "label", "name",
			   "label.icon", "false",
			   "border.color", "255,0,0"
		   });
		addAnnotation
		  (cloudEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.CloudFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/cloud.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/cloud.gif"
		   });
		addAnnotation
		  (on_PremiseEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.On_PremiseFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/On_Premise.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/On_Premise.gif"
		   });
		addAnnotation
		  (file_SystemEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.File_SystemFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/fileSystem.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/fileSystem.gif"
		   });
		addAnnotation
		  (relationalEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.RelationalFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/releationalDB.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/releationalDB.gif"
		   });
		addAnnotation
		  (multidimensionalEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.MultidimensionalFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/multid.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/multid.gif"
		   });
		addAnnotation
		  (realTimeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.RealTimeFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/realtime.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/realtime.gif"
		   });
		addAnnotation
		  (batchEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.BatchFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/batch.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/batch.gif"
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false"
		   });
		addAnnotation
		  (receiveDataEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ReceiveDataFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/ReceiveData.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/ReceiveData.gif"
		   });
		addAnnotation
		  (sendDataEClass,
		   source,
		   new String[] {
			   "figure", "iot_DataView.figures.SendDataFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/SendData.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/SendData.gif"
		   });
		addAnnotation
		  (generateEClass,
		   source,
		   new String[] {
			   "figure", "iot_DataView.figures.GenerateFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/generatingData.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/generatingData.gif"
		   });
		addAnnotation
		  (ingestEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.IngestFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/ingest.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/ingest.gif"
		   });
		addAnnotation
		  (analyzeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.AnalyzeFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/analyze.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/analyze.gif"
		   });
		addAnnotation
		  (consumeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ConsumeFigure",
			   "label.placement", "external"
		   });
		addAnnotation
		  (visualizeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.VisualizeFigure",
			   "label.placement", "external",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/dataVisulization.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/dataVisulization.gif"
		   });
		addAnnotation
		  (query_ReportEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.Query_ReportFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/query.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/query.gif"
		   });
		addAnnotation
		  (apiEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.APIFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/API.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/API.gif"
		   });
		addAnnotation
		  (processEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ProcessFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/processing.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/processing.gif"
		   });
		addAnnotation
		  (tranfromEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.TranformFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/transform.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/transform.gif"
		   });
		addAnnotation
		  (compressEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.CompressFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/compress.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/compress.gif"
		   });
		addAnnotation
		  (integrateEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.IntegrateFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/integrate.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/integrate.gif"
		   });
		addAnnotation
		  (identifyEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.IdentifyFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/idetify.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/idetify.gif"
		   });
		addAnnotation
		  (validateEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ValidateFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/validate.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/validate.gif"
		   });
		addAnnotation
		  (classifyEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ClassifyFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/classify.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/classify.gif"
		   });
		addAnnotation
		  (sortEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.SortFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/sort.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/sort.gif"
		   });
		addAnnotation
		  (mergeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.MergeFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/merge.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/merge.gif"
		   });
		addAnnotation
		  (aggregateEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.AggregateFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/aggregate.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/aggregate.gif"
		   });
		addAnnotation
		  (cleaningEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.CleaningFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/clean.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/clean.gif"
		   });
		addAnnotation
		  (filterEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.FilterFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/filter.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/filter.gif"
		   });
		addAnnotation
		  (reduceNoiseEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ReduceNoiseFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/dataReduction.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/dataReduction.gif"
		   });
		addAnnotation
		  (describeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.DescribeFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/descript.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/descript.gif"
		   });
		addAnnotation
		  (diagnoseEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.DiagnoseFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/diagnose.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/diagnose.gif"
		   });
		addAnnotation
		  (predictEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.PredictFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/predict.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/predict.gif"
		   });
		addAnnotation
		  (prescriptEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.PrescriptFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/prescriptive.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/prescriptive.gif"
		   });
		addAnnotation
		  (math_OperationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.MathOpFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/mathOp.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/mathOp.gif"
		   });
		addAnnotation
		  (relationalDBEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.RelationalDBFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/releationalFormat.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/releationalFormat.gif"
		   });
		addAnnotation
		  (xmlEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.XMLFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/xml.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/xml.gif"
		   });
		addAnnotation
		  (jsonEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.JSONFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/JSON.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/JSON.gif"
		   });
		addAnnotation
		  (csvEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.CSVFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/CSV.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/CSV.gif"
		   });
		addAnnotation
		  (excelEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ExcelFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/Excel.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/Excel.gif"
		   });
		addAnnotation
		  (htmlEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.HTMLFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/html.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/html.gif"
		   });
		addAnnotation
		  (rdfEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.RDFFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/rdf.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/rdf.gif"
		   });
		addAnnotation
		  (ediEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.EDIFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/edi.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/edi.gif"
		   });
		addAnnotation
		  (smsEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.SMSFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/sms.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/sms.gif"
		   });
		addAnnotation
		  (emailEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.EmailFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/email.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/email.gif"
		   });
		addAnnotation
		  (audioEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.AudioFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/audio.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/audio.gif"
		   });
		addAnnotation
		  (videoEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.VideoFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/Video.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/video.gif"
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ImageFormatFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/image.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/image.gif"
		   });
		addAnnotation
		  (gpsDataEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.GPSDataFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/gps.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/gps.gif"
		   });
		addAnnotation
		  (logsEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.LogsFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/log.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/log.gif"
		   });
		addAnnotation
		  (wordFileEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.WordFileFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/word.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/word.gif"
		   });
		addAnnotation
		  (pdfFileEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.PDFFileFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/pdf.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/pdf.gif"
		   });
		addAnnotation
		  (textFileEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.TextFileFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/txt.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/txt.gif"
		   });
		addAnnotation
		  (sensorDataEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.SensorDataFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/sensorData.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/sensorData.gif"
		   });
		addAnnotation
		  (documentOrientedEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.DocumentOrientedFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/DocumentDB.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/DocumentDB.gif"
		   });
		addAnnotation
		  (columnOrientedEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ColumnOrientedFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/columnarDB.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/columnarDB.gif"
		   });
		addAnnotation
		  (graphsDatabaseEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.GraphsDatabaseFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/GraphDB.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/GraphDB.gif"
		   });
		addAnnotation
		  (keyValueEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.KeyValueFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/key_value.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/key_value.gif"
		   });
		addAnnotation
		  (retrieveEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.RetrieveFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/retrieveData.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/retrieveData.gif"
		   });
		addAnnotation
		  (saveEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.StoreFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/store.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/store.gif"
		   });
		addAnnotation
		  (archiveEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.ArchiveFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/archive.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/archive.gif"
		   });
		addAnnotation
		  (governEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "iot_DataView.figures.GovernFigure",
			   "label.placement", "external",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/dataGovenance.gif",
			   "label.icon", "false",
			   "size", "48,48",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/dataGovernance.gif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getDataNode_BehaviouralElements(),
		   source,
		   new String[] {
			   "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.affixed";
		addAnnotation
		  (getDataNode_Ports(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (connectionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "source", "source",
			   "target", "target",
			   "target.decoration", "arrow",
			   "style", "solid",
			   "tool.name", "Data Node Link",
			   "tool.small.bundle", "IoT_DataView",
			   "tool.small.path", "dataicons/basics/Connection.gif",
			   "tool.large.bundle", "IoT_DataView",
			   "tool.large.path", "dataicons/basics/Connection.gif"
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "color", "0,0,0",
			   "target", "target",
			   "target.decoration", "arrow",
			   "style", "solid",
			   "tool.name", "Data Element Link"
		   });
		addAnnotation
		  (getReceiveData_FromMessagePorts(),
		   source,
		   new String[] {
			   "target.decoration", "none",
			   "style", "dot",
			   "tool.name", "Receive Data Link"
		   });
		addAnnotation
		  (getSendData_ToMessagePorts(),
		   source,
		   new String[] {
			   "target.decoration", "none",
			   "style", "dot",
			   "tool.name", "Send Data Link"
		   });
	}

} //DataArchPackageImpl
