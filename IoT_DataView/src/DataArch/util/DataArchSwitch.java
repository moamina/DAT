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
import DataArch.QualityMetrices;
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
import DataArch.VerifyData;
import DataArch.Video;
import DataArch.Visualize;
import DataArch.WordFile;
import DataArch.XML;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DataArch.DataArchPackage
 * @generated
 */
public class DataArchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataArchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchSwitch() {
		if (modelPackage == null) {
			modelPackage = DataArchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataArchPackage.DATA_ARCHITECTURE: {
				DataArchitecture dataArchitecture = (DataArchitecture)theEObject;
				T result = caseDataArchitecture(dataArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_NODE: {
				DataNode dataNode = (DataNode)theEObject;
				T result = caseDataNode(dataNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.MESSAGE_PORT: {
				MessagePort messagePort = (MessagePort)theEObject;
				T result = caseMessagePort(messagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.IN_MESSAGE_PORT: {
				InMessagePort inMessagePort = (InMessagePort)theEObject;
				T result = caseInMessagePort(inMessagePort);
				if (result == null) result = caseMessagePort(inMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.OUT_MESSAGE_PORT: {
				OutMessagePort outMessagePort = (OutMessagePort)theEObject;
				T result = caseOutMessagePort(outMessagePort);
				if (result == null) result = caseMessagePort(outMessagePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.BEHAVIOURAL_ELEMENT: {
				BehaviouralElement behaviouralElement = (BehaviouralElement)theEObject;
				T result = caseBehaviouralElement(behaviouralElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_FORMAT: {
				DataFormat dataFormat = (DataFormat)theEObject;
				T result = caseDataFormat(dataFormat);
				if (result == null) result = caseDataRepresentation(dataFormat);
				if (result == null) result = caseAction(dataFormat);
				if (result == null) result = caseLinkableElement(dataFormat);
				if (result == null) result = caseBehaviouralElement(dataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.STRUCTURED_DATA: {
				StructuredData structuredData = (StructuredData)theEObject;
				T result = caseStructuredData(structuredData);
				if (result == null) result = caseDataFormat(structuredData);
				if (result == null) result = caseDataRepresentation(structuredData);
				if (result == null) result = caseAction(structuredData);
				if (result == null) result = caseLinkableElement(structuredData);
				if (result == null) result = caseBehaviouralElement(structuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SEMI_STRUCTURED_DATA: {
				SemiStructuredData semiStructuredData = (SemiStructuredData)theEObject;
				T result = caseSemiStructuredData(semiStructuredData);
				if (result == null) result = caseDataFormat(semiStructuredData);
				if (result == null) result = caseDataRepresentation(semiStructuredData);
				if (result == null) result = caseAction(semiStructuredData);
				if (result == null) result = caseLinkableElement(semiStructuredData);
				if (result == null) result = caseBehaviouralElement(semiStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.UN_STRUCTURED_DATA: {
				UnStructuredData unStructuredData = (UnStructuredData)theEObject;
				T result = caseUnStructuredData(unStructuredData);
				if (result == null) result = caseDataFormat(unStructuredData);
				if (result == null) result = caseDataRepresentation(unStructuredData);
				if (result == null) result = caseAction(unStructuredData);
				if (result == null) result = caseLinkableElement(unStructuredData);
				if (result == null) result = caseBehaviouralElement(unStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_STORAGE_TYPE: {
				DataStorageType dataStorageType = (DataStorageType)theEObject;
				T result = caseDataStorageType(dataStorageType);
				if (result == null) result = caseDataRepresentation(dataStorageType);
				if (result == null) result = caseAction(dataStorageType);
				if (result == null) result = caseLinkableElement(dataStorageType);
				if (result == null) result = caseBehaviouralElement(dataStorageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_LOCATION: {
				DataLocation dataLocation = (DataLocation)theEObject;
				T result = caseDataLocation(dataLocation);
				if (result == null) result = caseDataRepresentation(dataLocation);
				if (result == null) result = caseAction(dataLocation);
				if (result == null) result = caseLinkableElement(dataLocation);
				if (result == null) result = caseBehaviouralElement(dataLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CLOUD: {
				Cloud cloud = (Cloud)theEObject;
				T result = caseCloud(cloud);
				if (result == null) result = caseDataLocation(cloud);
				if (result == null) result = caseDataRepresentation(cloud);
				if (result == null) result = caseAction(cloud);
				if (result == null) result = caseLinkableElement(cloud);
				if (result == null) result = caseBehaviouralElement(cloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.ON_PREMISE: {
				On_Premise on_Premise = (On_Premise)theEObject;
				T result = caseOn_Premise(on_Premise);
				if (result == null) result = caseDataLocation(on_Premise);
				if (result == null) result = caseDataRepresentation(on_Premise);
				if (result == null) result = caseAction(on_Premise);
				if (result == null) result = caseLinkableElement(on_Premise);
				if (result == null) result = caseBehaviouralElement(on_Premise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.FILE_SYSTEM: {
				File_System file_System = (File_System)theEObject;
				T result = caseFile_System(file_System);
				if (result == null) result = caseDataStorageType(file_System);
				if (result == null) result = caseDataRepresentation(file_System);
				if (result == null) result = caseAction(file_System);
				if (result == null) result = caseLinkableElement(file_System);
				if (result == null) result = caseBehaviouralElement(file_System);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.RELATIONAL: {
				Relational relational = (Relational)theEObject;
				T result = caseRelational(relational);
				if (result == null) result = caseDataStorageType(relational);
				if (result == null) result = caseDataRepresentation(relational);
				if (result == null) result = caseAction(relational);
				if (result == null) result = caseLinkableElement(relational);
				if (result == null) result = caseBehaviouralElement(relational);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.MULTIDIMENSIONAL: {
				Multidimensional multidimensional = (Multidimensional)theEObject;
				T result = caseMultidimensional(multidimensional);
				if (result == null) result = caseDataStorageType(multidimensional);
				if (result == null) result = caseDataRepresentation(multidimensional);
				if (result == null) result = caseAction(multidimensional);
				if (result == null) result = caseLinkableElement(multidimensional);
				if (result == null) result = caseBehaviouralElement(multidimensional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.NO_SQL: {
				NoSQL noSQL = (NoSQL)theEObject;
				T result = caseNoSQL(noSQL);
				if (result == null) result = caseDataStorageType(noSQL);
				if (result == null) result = caseDataRepresentation(noSQL);
				if (result == null) result = caseAction(noSQL);
				if (result == null) result = caseLinkableElement(noSQL);
				if (result == null) result = caseBehaviouralElement(noSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_PROCESSING_TYPE: {
				DataProcessingType dataProcessingType = (DataProcessingType)theEObject;
				T result = caseDataProcessingType(dataProcessingType);
				if (result == null) result = caseDataRepresentation(dataProcessingType);
				if (result == null) result = caseAction(dataProcessingType);
				if (result == null) result = caseLinkableElement(dataProcessingType);
				if (result == null) result = caseBehaviouralElement(dataProcessingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.REAL_TIME: {
				RealTime realTime = (RealTime)theEObject;
				T result = caseRealTime(realTime);
				if (result == null) result = caseDataProcessingType(realTime);
				if (result == null) result = caseDataRepresentation(realTime);
				if (result == null) result = caseAction(realTime);
				if (result == null) result = caseLinkableElement(realTime);
				if (result == null) result = caseBehaviouralElement(realTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.BATCH: {
				Batch batch = (Batch)theEObject;
				T result = caseBatch(batch);
				if (result == null) result = caseDataProcessingType(batch);
				if (result == null) result = caseDataRepresentation(batch);
				if (result == null) result = caseAction(batch);
				if (result == null) result = caseLinkableElement(batch);
				if (result == null) result = caseBehaviouralElement(batch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.LINKABLE_ELEMENT: {
				LinkableElement linkableElement = (LinkableElement)theEObject;
				T result = caseLinkableElement(linkableElement);
				if (result == null) result = caseBehaviouralElement(linkableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DATA_REPRESENTATION: {
				DataRepresentation dataRepresentation = (DataRepresentation)theEObject;
				T result = caseDataRepresentation(dataRepresentation);
				if (result == null) result = caseAction(dataRepresentation);
				if (result == null) result = caseLinkableElement(dataRepresentation);
				if (result == null) result = caseBehaviouralElement(dataRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseLinkableElement(action);
				if (result == null) result = caseBehaviouralElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseBehaviouralElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseLinkableElement(event);
				if (result == null) result = caseBehaviouralElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.RECEIVE_DATA: {
				ReceiveData receiveData = (ReceiveData)theEObject;
				T result = caseReceiveData(receiveData);
				if (result == null) result = caseEvent(receiveData);
				if (result == null) result = caseLinkableElement(receiveData);
				if (result == null) result = caseBehaviouralElement(receiveData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SEND_DATA: {
				SendData sendData = (SendData)theEObject;
				T result = caseSendData(sendData);
				if (result == null) result = caseAction(sendData);
				if (result == null) result = caseLinkableElement(sendData);
				if (result == null) result = caseBehaviouralElement(sendData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.GENERATE: {
				Generate generate = (Generate)theEObject;
				T result = caseGenerate(generate);
				if (result == null) result = caseAction(generate);
				if (result == null) result = caseLinkableElement(generate);
				if (result == null) result = caseBehaviouralElement(generate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.INGEST: {
				Ingest ingest = (Ingest)theEObject;
				T result = caseIngest(ingest);
				if (result == null) result = caseAction(ingest);
				if (result == null) result = caseLinkableElement(ingest);
				if (result == null) result = caseBehaviouralElement(ingest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseAction(store);
				if (result == null) result = caseLinkableElement(store);
				if (result == null) result = caseBehaviouralElement(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.ANALYZE: {
				Analyze analyze = (Analyze)theEObject;
				T result = caseAnalyze(analyze);
				if (result == null) result = caseAction(analyze);
				if (result == null) result = caseLinkableElement(analyze);
				if (result == null) result = caseBehaviouralElement(analyze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CONSUME: {
				Consume consume = (Consume)theEObject;
				T result = caseConsume(consume);
				if (result == null) result = caseAction(consume);
				if (result == null) result = caseLinkableElement(consume);
				if (result == null) result = caseBehaviouralElement(consume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.VISUALIZE: {
				Visualize visualize = (Visualize)theEObject;
				T result = caseVisualize(visualize);
				if (result == null) result = caseConsume(visualize);
				if (result == null) result = caseAction(visualize);
				if (result == null) result = caseLinkableElement(visualize);
				if (result == null) result = caseBehaviouralElement(visualize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.QUERY_REPORT: {
				Query_Report query_Report = (Query_Report)theEObject;
				T result = caseQuery_Report(query_Report);
				if (result == null) result = caseConsume(query_Report);
				if (result == null) result = caseAction(query_Report);
				if (result == null) result = caseLinkableElement(query_Report);
				if (result == null) result = caseBehaviouralElement(query_Report);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = caseConsume(api);
				if (result == null) result = caseAction(api);
				if (result == null) result = caseLinkableElement(api);
				if (result == null) result = caseBehaviouralElement(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.PROCESS: {
				DataArch.Process process = (DataArch.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseAction(process);
				if (result == null) result = caseLinkableElement(process);
				if (result == null) result = caseBehaviouralElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.TRANFROM: {
				Tranfrom tranfrom = (Tranfrom)theEObject;
				T result = caseTranfrom(tranfrom);
				if (result == null) result = caseIngest(tranfrom);
				if (result == null) result = caseAction(tranfrom);
				if (result == null) result = caseLinkableElement(tranfrom);
				if (result == null) result = caseBehaviouralElement(tranfrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.COMPRESS: {
				Compress compress = (Compress)theEObject;
				T result = caseCompress(compress);
				if (result == null) result = caseIngest(compress);
				if (result == null) result = caseAction(compress);
				if (result == null) result = caseLinkableElement(compress);
				if (result == null) result = caseBehaviouralElement(compress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.INTEGRATE: {
				Integrate integrate = (Integrate)theEObject;
				T result = caseIntegrate(integrate);
				if (result == null) result = caseIngest(integrate);
				if (result == null) result = caseAction(integrate);
				if (result == null) result = caseLinkableElement(integrate);
				if (result == null) result = caseBehaviouralElement(integrate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.IDENTIFY: {
				Identify identify = (Identify)theEObject;
				T result = caseIdentify(identify);
				if (result == null) result = caseIngest(identify);
				if (result == null) result = caseAction(identify);
				if (result == null) result = caseLinkableElement(identify);
				if (result == null) result = caseBehaviouralElement(identify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.VALIDATE: {
				Validate validate = (Validate)theEObject;
				T result = caseValidate(validate);
				if (result == null) result = caseIngest(validate);
				if (result == null) result = caseAction(validate);
				if (result == null) result = caseLinkableElement(validate);
				if (result == null) result = caseBehaviouralElement(validate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CLASSIFY: {
				Classify classify = (Classify)theEObject;
				T result = caseClassify(classify);
				if (result == null) result = caseProcess(classify);
				if (result == null) result = caseAction(classify);
				if (result == null) result = caseLinkableElement(classify);
				if (result == null) result = caseBehaviouralElement(classify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SORT: {
				Sort sort = (Sort)theEObject;
				T result = caseSort(sort);
				if (result == null) result = caseProcess(sort);
				if (result == null) result = caseAction(sort);
				if (result == null) result = caseLinkableElement(sort);
				if (result == null) result = caseBehaviouralElement(sort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = caseProcess(merge);
				if (result == null) result = caseAction(merge);
				if (result == null) result = caseLinkableElement(merge);
				if (result == null) result = caseBehaviouralElement(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.AGGREGATE: {
				Aggregate aggregate = (Aggregate)theEObject;
				T result = caseAggregate(aggregate);
				if (result == null) result = caseProcess(aggregate);
				if (result == null) result = caseAction(aggregate);
				if (result == null) result = caseLinkableElement(aggregate);
				if (result == null) result = caseBehaviouralElement(aggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CLEANING: {
				Cleaning cleaning = (Cleaning)theEObject;
				T result = caseCleaning(cleaning);
				if (result == null) result = caseProcess(cleaning);
				if (result == null) result = caseAction(cleaning);
				if (result == null) result = caseLinkableElement(cleaning);
				if (result == null) result = caseBehaviouralElement(cleaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseIngest(filter);
				if (result == null) result = caseProcess(filter);
				if (result == null) result = caseAction(filter);
				if (result == null) result = caseLinkableElement(filter);
				if (result == null) result = caseBehaviouralElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.REDUCE_NOISE: {
				ReduceNoise reduceNoise = (ReduceNoise)theEObject;
				T result = caseReduceNoise(reduceNoise);
				if (result == null) result = caseIngest(reduceNoise);
				if (result == null) result = caseAction(reduceNoise);
				if (result == null) result = caseLinkableElement(reduceNoise);
				if (result == null) result = caseBehaviouralElement(reduceNoise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseAnalyze(type);
				if (result == null) result = caseAction(type);
				if (result == null) result = caseLinkableElement(type);
				if (result == null) result = caseBehaviouralElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.TECHNIQUE: {
				Technique technique = (Technique)theEObject;
				T result = caseTechnique(technique);
				if (result == null) result = caseAnalyze(technique);
				if (result == null) result = caseAction(technique);
				if (result == null) result = caseLinkableElement(technique);
				if (result == null) result = caseBehaviouralElement(technique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DESCRIBE: {
				Describe describe = (Describe)theEObject;
				T result = caseDescribe(describe);
				if (result == null) result = caseType(describe);
				if (result == null) result = caseAnalyze(describe);
				if (result == null) result = caseAction(describe);
				if (result == null) result = caseLinkableElement(describe);
				if (result == null) result = caseBehaviouralElement(describe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DIAGNOSE: {
				Diagnose diagnose = (Diagnose)theEObject;
				T result = caseDiagnose(diagnose);
				if (result == null) result = caseType(diagnose);
				if (result == null) result = caseAnalyze(diagnose);
				if (result == null) result = caseAction(diagnose);
				if (result == null) result = caseLinkableElement(diagnose);
				if (result == null) result = caseBehaviouralElement(diagnose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.PREDICT: {
				Predict predict = (Predict)theEObject;
				T result = casePredict(predict);
				if (result == null) result = caseType(predict);
				if (result == null) result = caseAnalyze(predict);
				if (result == null) result = caseAction(predict);
				if (result == null) result = caseLinkableElement(predict);
				if (result == null) result = caseBehaviouralElement(predict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.PRESCRIPT: {
				Prescript prescript = (Prescript)theEObject;
				T result = casePrescript(prescript);
				if (result == null) result = caseType(prescript);
				if (result == null) result = caseAnalyze(prescript);
				if (result == null) result = caseAction(prescript);
				if (result == null) result = caseLinkableElement(prescript);
				if (result == null) result = caseBehaviouralElement(prescript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.MATH_OPERATION: {
				Math_Operation math_Operation = (Math_Operation)theEObject;
				T result = caseMath_Operation(math_Operation);
				if (result == null) result = caseProcess(math_Operation);
				if (result == null) result = caseAction(math_Operation);
				if (result == null) result = caseLinkableElement(math_Operation);
				if (result == null) result = caseBehaviouralElement(math_Operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.RELATIONAL_DB: {
				RelationalDB relationalDB = (RelationalDB)theEObject;
				T result = caseRelationalDB(relationalDB);
				if (result == null) result = caseStructuredData(relationalDB);
				if (result == null) result = caseDataFormat(relationalDB);
				if (result == null) result = caseDataRepresentation(relationalDB);
				if (result == null) result = caseAction(relationalDB);
				if (result == null) result = caseLinkableElement(relationalDB);
				if (result == null) result = caseBehaviouralElement(relationalDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.XML: {
				XML xml = (XML)theEObject;
				T result = caseXML(xml);
				if (result == null) result = caseSemiStructuredData(xml);
				if (result == null) result = caseDataFormat(xml);
				if (result == null) result = caseDataRepresentation(xml);
				if (result == null) result = caseAction(xml);
				if (result == null) result = caseLinkableElement(xml);
				if (result == null) result = caseBehaviouralElement(xml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.JSON: {
				JSON json = (JSON)theEObject;
				T result = caseJSON(json);
				if (result == null) result = caseSemiStructuredData(json);
				if (result == null) result = caseDataFormat(json);
				if (result == null) result = caseDataRepresentation(json);
				if (result == null) result = caseAction(json);
				if (result == null) result = caseLinkableElement(json);
				if (result == null) result = caseBehaviouralElement(json);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.CSV: {
				CSV csv = (CSV)theEObject;
				T result = caseCSV(csv);
				if (result == null) result = caseSemiStructuredData(csv);
				if (result == null) result = caseDataFormat(csv);
				if (result == null) result = caseDataRepresentation(csv);
				if (result == null) result = caseAction(csv);
				if (result == null) result = caseLinkableElement(csv);
				if (result == null) result = caseBehaviouralElement(csv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.EXCEL: {
				Excel excel = (Excel)theEObject;
				T result = caseExcel(excel);
				if (result == null) result = caseSemiStructuredData(excel);
				if (result == null) result = caseDataFormat(excel);
				if (result == null) result = caseDataRepresentation(excel);
				if (result == null) result = caseAction(excel);
				if (result == null) result = caseLinkableElement(excel);
				if (result == null) result = caseBehaviouralElement(excel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.HTML: {
				HTML html = (HTML)theEObject;
				T result = caseHTML(html);
				if (result == null) result = caseSemiStructuredData(html);
				if (result == null) result = caseDataFormat(html);
				if (result == null) result = caseDataRepresentation(html);
				if (result == null) result = caseAction(html);
				if (result == null) result = caseLinkableElement(html);
				if (result == null) result = caseBehaviouralElement(html);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.RDF: {
				RDF rdf = (RDF)theEObject;
				T result = caseRDF(rdf);
				if (result == null) result = caseSemiStructuredData(rdf);
				if (result == null) result = caseDataFormat(rdf);
				if (result == null) result = caseDataRepresentation(rdf);
				if (result == null) result = caseAction(rdf);
				if (result == null) result = caseLinkableElement(rdf);
				if (result == null) result = caseBehaviouralElement(rdf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.EDI: {
				EDI edi = (EDI)theEObject;
				T result = caseEDI(edi);
				if (result == null) result = caseSemiStructuredData(edi);
				if (result == null) result = caseDataFormat(edi);
				if (result == null) result = caseDataRepresentation(edi);
				if (result == null) result = caseAction(edi);
				if (result == null) result = caseLinkableElement(edi);
				if (result == null) result = caseBehaviouralElement(edi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SMS: {
				SMS sms = (SMS)theEObject;
				T result = caseSMS(sms);
				if (result == null) result = caseSemiStructuredData(sms);
				if (result == null) result = caseDataFormat(sms);
				if (result == null) result = caseDataRepresentation(sms);
				if (result == null) result = caseAction(sms);
				if (result == null) result = caseLinkableElement(sms);
				if (result == null) result = caseBehaviouralElement(sms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseSemiStructuredData(email);
				if (result == null) result = caseDataFormat(email);
				if (result == null) result = caseDataRepresentation(email);
				if (result == null) result = caseAction(email);
				if (result == null) result = caseLinkableElement(email);
				if (result == null) result = caseBehaviouralElement(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.MULTIMEDIA: {
				Multimedia multimedia = (Multimedia)theEObject;
				T result = caseMultimedia(multimedia);
				if (result == null) result = caseUnStructuredData(multimedia);
				if (result == null) result = caseDataFormat(multimedia);
				if (result == null) result = caseDataRepresentation(multimedia);
				if (result == null) result = caseAction(multimedia);
				if (result == null) result = caseLinkableElement(multimedia);
				if (result == null) result = caseBehaviouralElement(multimedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.AUDIO: {
				Audio audio = (Audio)theEObject;
				T result = caseAudio(audio);
				if (result == null) result = caseMultimedia(audio);
				if (result == null) result = caseUnStructuredData(audio);
				if (result == null) result = caseDataFormat(audio);
				if (result == null) result = caseDataRepresentation(audio);
				if (result == null) result = caseAction(audio);
				if (result == null) result = caseLinkableElement(audio);
				if (result == null) result = caseBehaviouralElement(audio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseMultimedia(video);
				if (result == null) result = caseUnStructuredData(video);
				if (result == null) result = caseDataFormat(video);
				if (result == null) result = caseDataRepresentation(video);
				if (result == null) result = caseAction(video);
				if (result == null) result = caseLinkableElement(video);
				if (result == null) result = caseBehaviouralElement(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseMultimedia(image);
				if (result == null) result = caseUnStructuredData(image);
				if (result == null) result = caseDataFormat(image);
				if (result == null) result = caseDataRepresentation(image);
				if (result == null) result = caseAction(image);
				if (result == null) result = caseLinkableElement(image);
				if (result == null) result = caseBehaviouralElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.GPS_DATA: {
				GPSData gpsData = (GPSData)theEObject;
				T result = caseGPSData(gpsData);
				if (result == null) result = caseUnStructuredData(gpsData);
				if (result == null) result = caseDataFormat(gpsData);
				if (result == null) result = caseDataRepresentation(gpsData);
				if (result == null) result = caseAction(gpsData);
				if (result == null) result = caseLinkableElement(gpsData);
				if (result == null) result = caseBehaviouralElement(gpsData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.OFFICE_FILE: {
				OfficeFile officeFile = (OfficeFile)theEObject;
				T result = caseOfficeFile(officeFile);
				if (result == null) result = caseUnStructuredData(officeFile);
				if (result == null) result = caseDataFormat(officeFile);
				if (result == null) result = caseDataRepresentation(officeFile);
				if (result == null) result = caseAction(officeFile);
				if (result == null) result = caseLinkableElement(officeFile);
				if (result == null) result = caseBehaviouralElement(officeFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.LOGS: {
				Logs logs = (Logs)theEObject;
				T result = caseLogs(logs);
				if (result == null) result = caseOfficeFile(logs);
				if (result == null) result = caseUnStructuredData(logs);
				if (result == null) result = caseDataFormat(logs);
				if (result == null) result = caseDataRepresentation(logs);
				if (result == null) result = caseAction(logs);
				if (result == null) result = caseLinkableElement(logs);
				if (result == null) result = caseBehaviouralElement(logs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.WORD_FILE: {
				WordFile wordFile = (WordFile)theEObject;
				T result = caseWordFile(wordFile);
				if (result == null) result = caseOfficeFile(wordFile);
				if (result == null) result = caseUnStructuredData(wordFile);
				if (result == null) result = caseDataFormat(wordFile);
				if (result == null) result = caseDataRepresentation(wordFile);
				if (result == null) result = caseAction(wordFile);
				if (result == null) result = caseLinkableElement(wordFile);
				if (result == null) result = caseBehaviouralElement(wordFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.PDF_FILE: {
				PDFFile pdfFile = (PDFFile)theEObject;
				T result = casePDFFile(pdfFile);
				if (result == null) result = caseOfficeFile(pdfFile);
				if (result == null) result = caseUnStructuredData(pdfFile);
				if (result == null) result = caseDataFormat(pdfFile);
				if (result == null) result = caseDataRepresentation(pdfFile);
				if (result == null) result = caseAction(pdfFile);
				if (result == null) result = caseLinkableElement(pdfFile);
				if (result == null) result = caseBehaviouralElement(pdfFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.TEXT_FILE: {
				TextFile textFile = (TextFile)theEObject;
				T result = caseTextFile(textFile);
				if (result == null) result = caseOfficeFile(textFile);
				if (result == null) result = caseUnStructuredData(textFile);
				if (result == null) result = caseDataFormat(textFile);
				if (result == null) result = caseDataRepresentation(textFile);
				if (result == null) result = caseAction(textFile);
				if (result == null) result = caseLinkableElement(textFile);
				if (result == null) result = caseBehaviouralElement(textFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SENSOR_DATA: {
				SensorData sensorData = (SensorData)theEObject;
				T result = caseSensorData(sensorData);
				if (result == null) result = caseUnStructuredData(sensorData);
				if (result == null) result = caseDataFormat(sensorData);
				if (result == null) result = caseDataRepresentation(sensorData);
				if (result == null) result = caseAction(sensorData);
				if (result == null) result = caseLinkableElement(sensorData);
				if (result == null) result = caseBehaviouralElement(sensorData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.DOCUMENT_ORIENTED: {
				DocumentOriented documentOriented = (DocumentOriented)theEObject;
				T result = caseDocumentOriented(documentOriented);
				if (result == null) result = caseNoSQL(documentOriented);
				if (result == null) result = caseDataStorageType(documentOriented);
				if (result == null) result = caseDataRepresentation(documentOriented);
				if (result == null) result = caseAction(documentOriented);
				if (result == null) result = caseLinkableElement(documentOriented);
				if (result == null) result = caseBehaviouralElement(documentOriented);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.COLUMN_ORIENTED: {
				ColumnOriented columnOriented = (ColumnOriented)theEObject;
				T result = caseColumnOriented(columnOriented);
				if (result == null) result = caseNoSQL(columnOriented);
				if (result == null) result = caseDataStorageType(columnOriented);
				if (result == null) result = caseDataRepresentation(columnOriented);
				if (result == null) result = caseAction(columnOriented);
				if (result == null) result = caseLinkableElement(columnOriented);
				if (result == null) result = caseBehaviouralElement(columnOriented);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.GRAPHS_DATABASE: {
				GraphsDatabase graphsDatabase = (GraphsDatabase)theEObject;
				T result = caseGraphsDatabase(graphsDatabase);
				if (result == null) result = caseNoSQL(graphsDatabase);
				if (result == null) result = caseDataStorageType(graphsDatabase);
				if (result == null) result = caseDataRepresentation(graphsDatabase);
				if (result == null) result = caseAction(graphsDatabase);
				if (result == null) result = caseLinkableElement(graphsDatabase);
				if (result == null) result = caseBehaviouralElement(graphsDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.KEY_VALUE: {
				KeyValue keyValue = (KeyValue)theEObject;
				T result = caseKeyValue(keyValue);
				if (result == null) result = caseNoSQL(keyValue);
				if (result == null) result = caseDataStorageType(keyValue);
				if (result == null) result = caseDataRepresentation(keyValue);
				if (result == null) result = caseAction(keyValue);
				if (result == null) result = caseLinkableElement(keyValue);
				if (result == null) result = caseBehaviouralElement(keyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.RETRIEVE: {
				Retrieve retrieve = (Retrieve)theEObject;
				T result = caseRetrieve(retrieve);
				if (result == null) result = caseStore(retrieve);
				if (result == null) result = caseAction(retrieve);
				if (result == null) result = caseLinkableElement(retrieve);
				if (result == null) result = caseBehaviouralElement(retrieve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.SAVE: {
				Save save = (Save)theEObject;
				T result = caseSave(save);
				if (result == null) result = caseStore(save);
				if (result == null) result = caseAction(save);
				if (result == null) result = caseLinkableElement(save);
				if (result == null) result = caseBehaviouralElement(save);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.ARCHIVE: {
				Archive archive = (Archive)theEObject;
				T result = caseArchive(archive);
				if (result == null) result = caseStore(archive);
				if (result == null) result = caseAction(archive);
				if (result == null) result = caseLinkableElement(archive);
				if (result == null) result = caseBehaviouralElement(archive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.GOVERN: {
				Govern govern = (Govern)theEObject;
				T result = caseGovern(govern);
				if (result == null) result = caseStore(govern);
				if (result == null) result = caseAction(govern);
				if (result == null) result = caseLinkableElement(govern);
				if (result == null) result = caseBehaviouralElement(govern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.VERIFY_DATA: {
				VerifyData verifyData = (VerifyData)theEObject;
				T result = caseVerifyData(verifyData);
				if (result == null) result = caseAction(verifyData);
				if (result == null) result = caseLinkableElement(verifyData);
				if (result == null) result = caseBehaviouralElement(verifyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataArchPackage.QUALITY_METRICES: {
				QualityMetrices qualityMetrices = (QualityMetrices)theEObject;
				T result = caseQualityMetrices(qualityMetrices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataArchitecture(DataArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNode(DataNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagePort(MessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInMessagePort(InMessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Message Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Message Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutMessagePort(OutMessagePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviouralElement(BehaviouralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormat(DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredData(StructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semi Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semi Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemiStructuredData(SemiStructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnStructuredData(UnStructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Storage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Storage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStorageType(DataStorageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLocation(DataLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Premise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Premise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOn_Premise(On_Premise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile_System(File_System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelational(Relational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multidimensional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multidimensional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultidimensional(Multidimensional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSQL(NoSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Processing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Processing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProcessingType(DataProcessingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTime(RealTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatch(Batch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkableElement(LinkableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRepresentation(DataRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveData(ReceiveData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendData(SendData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerate(Generate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ingest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ingest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIngest(Ingest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyze(Analyze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsume(Consume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualize(Visualize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery_Report(Query_Report object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(DataArch.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tranfrom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tranfrom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranfrom(Tranfrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompress(Compress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integrate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integrate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrate(Integrate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentify(Identify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidate(Validate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassify(Classify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregate(Aggregate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleaning(Cleaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Noise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Noise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceNoise(ReduceNoise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnique(Technique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribe(Describe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnose(Diagnose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredict(Predict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescript(Prescript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMath_Operation(Math_Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalDB(RelationalDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXML(XML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSON(JSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSV(CSV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel(Excel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTML(HTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDF(RDF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDI(EDI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMS(SMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multimedia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multimedia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultimedia(Multimedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPSData(GPSData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeFile(OfficeFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogs(Logs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWordFile(WordFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDF File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDF File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDFFile(PDFFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextFile(TextFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorData(SensorData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Oriented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Oriented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentOriented(DocumentOriented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Oriented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Oriented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnOriented(ColumnOriented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphs Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphs Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphsDatabase(GraphsDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValue(KeyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retrieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retrieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetrieve(Retrieve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSave(Save object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive(Archive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Govern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Govern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovern(Govern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verify Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verify Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifyData(VerifyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Metrices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Metrices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityMetrices(QualityMetrices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataArchSwitch
