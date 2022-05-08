/**
 */
package DataArch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DataArch.DataArchFactory
 * @model kind="package"
 * @generated
 */
public interface DataArchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataArch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "DataArch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataArchPackage eINSTANCE = DataArch.impl.DataArchPackageImpl.init();

	/**
	 * The meta object id for the '{@link DataArch.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataArchitectureImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataArchitecture()
	 * @generated
	 */
	int DATA_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Data Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__DATA_NODES = 0;

	/**
	 * The feature id for the '<em><b>Data Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__DATA_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Data Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataNodeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 1;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__OUTGOING = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__BEHAVIOURAL_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__PORTS = 4;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link DataArch.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ConnectionImpl
	 * @see DataArch.impl.DataArchPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DataArch.impl.MessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.MessagePortImpl
	 * @see DataArch.impl.DataArchPackageImpl#getMessagePort()
	 * @generated
	 */
	int MESSAGE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataArch.impl.InMessagePortImpl <em>In Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.InMessagePortImpl
	 * @see DataArch.impl.DataArchPackageImpl#getInMessagePort()
	 * @generated
	 */
	int IN_MESSAGE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT__NAME = MESSAGE_PORT__NAME;

	/**
	 * The number of structural features of the '<em>In Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MESSAGE_PORT_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.OutMessagePortImpl <em>Out Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.OutMessagePortImpl
	 * @see DataArch.impl.DataArchPackageImpl#getOutMessagePort()
	 * @generated
	 */
	int OUT_MESSAGE_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT__NAME = MESSAGE_PORT__NAME;

	/**
	 * The number of structural features of the '<em>Out Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_PORT_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.BehaviouralElementImpl <em>Behavioural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.BehaviouralElementImpl
	 * @see DataArch.impl.DataArchPackageImpl#getBehaviouralElement()
	 * @generated
	 */
	int BEHAVIOURAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Behavioural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOURAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DataArch.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.LinkableElementImpl
	 * @see DataArch.impl.DataArchPackageImpl#getLinkableElement()
	 * @generated
	 */
	int LINKABLE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__NAME = BEHAVIOURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT__OUTGOING = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_ELEMENT_FEATURE_COUNT = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataArch.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ActionImpl
	 * @see DataArch.impl.DataArchPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = LINKABLE_ELEMENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataRepresentationImpl <em>Data Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataRepresentationImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataRepresentation()
	 * @generated
	 */
	int DATA_REPRESENTATION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REPRESENTATION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REPRESENTATION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REPRESENTATION__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Data Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REPRESENTATION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataFormatImpl <em>Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataFormatImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__NAME = DATA_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__OUTGOING = DATA_REPRESENTATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__INCOMING = DATA_REPRESENTATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = DATA_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.StructuredDataImpl <em>Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.StructuredDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getStructuredData()
	 * @generated
	 */
	int STRUCTURED_DATA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA__NAME = DATA_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA__OUTGOING = DATA_FORMAT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA__INCOMING = DATA_FORMAT__INCOMING;

	/**
	 * The number of structural features of the '<em>Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_FEATURE_COUNT = DATA_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.SemiStructuredDataImpl <em>Semi Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SemiStructuredDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSemiStructuredData()
	 * @generated
	 */
	int SEMI_STRUCTURED_DATA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_STRUCTURED_DATA__NAME = DATA_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_STRUCTURED_DATA__OUTGOING = DATA_FORMAT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_STRUCTURED_DATA__INCOMING = DATA_FORMAT__INCOMING;

	/**
	 * The number of structural features of the '<em>Semi Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMI_STRUCTURED_DATA_FEATURE_COUNT = DATA_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.UnStructuredDataImpl <em>Un Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.UnStructuredDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getUnStructuredData()
	 * @generated
	 */
	int UN_STRUCTURED_DATA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRUCTURED_DATA__NAME = DATA_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRUCTURED_DATA__OUTGOING = DATA_FORMAT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRUCTURED_DATA__INCOMING = DATA_FORMAT__INCOMING;

	/**
	 * The number of structural features of the '<em>Un Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_STRUCTURED_DATA_FEATURE_COUNT = DATA_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataStorageTypeImpl <em>Data Storage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataStorageTypeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataStorageType()
	 * @generated
	 */
	int DATA_STORAGE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_TYPE__NAME = DATA_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_TYPE__OUTGOING = DATA_REPRESENTATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_TYPE__INCOMING = DATA_REPRESENTATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Data Storage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_TYPE_FEATURE_COUNT = DATA_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataLocationImpl <em>Data Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataLocationImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataLocation()
	 * @generated
	 */
	int DATA_LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION__NAME = DATA_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION__OUTGOING = DATA_REPRESENTATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION__INCOMING = DATA_REPRESENTATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Data Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION_FEATURE_COUNT = DATA_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.CloudImpl
	 * @see DataArch.impl.DataArchPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__NAME = DATA_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__OUTGOING = DATA_LOCATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__INCOMING = DATA_LOCATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = DATA_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.On_PremiseImpl <em>On Premise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.On_PremiseImpl
	 * @see DataArch.impl.DataArchPackageImpl#getOn_Premise()
	 * @generated
	 */
	int ON_PREMISE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISE__NAME = DATA_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISE__OUTGOING = DATA_LOCATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISE__INCOMING = DATA_LOCATION__INCOMING;

	/**
	 * The number of structural features of the '<em>On Premise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISE_FEATURE_COUNT = DATA_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.File_SystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.File_SystemImpl
	 * @see DataArch.impl.DataArchPackageImpl#getFile_System()
	 * @generated
	 */
	int FILE_SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__NAME = DATA_STORAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__OUTGOING = DATA_STORAGE_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__INCOMING = DATA_STORAGE_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_FEATURE_COUNT = DATA_STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.RelationalImpl <em>Relational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.RelationalImpl
	 * @see DataArch.impl.DataArchPackageImpl#getRelational()
	 * @generated
	 */
	int RELATIONAL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL__NAME = DATA_STORAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL__OUTGOING = DATA_STORAGE_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL__INCOMING = DATA_STORAGE_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Relational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_FEATURE_COUNT = DATA_STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.MultidimensionalImpl <em>Multidimensional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.MultidimensionalImpl
	 * @see DataArch.impl.DataArchPackageImpl#getMultidimensional()
	 * @generated
	 */
	int MULTIDIMENSIONAL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL__NAME = DATA_STORAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL__OUTGOING = DATA_STORAGE_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL__INCOMING = DATA_STORAGE_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Multidimensional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_FEATURE_COUNT = DATA_STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.NoSQLImpl <em>No SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.NoSQLImpl
	 * @see DataArch.impl.DataArchPackageImpl#getNoSQL()
	 * @generated
	 */
	int NO_SQL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__NAME = DATA_STORAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__OUTGOING = DATA_STORAGE_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__INCOMING = DATA_STORAGE_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_FEATURE_COUNT = DATA_STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DataProcessingTypeImpl <em>Data Processing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DataProcessingTypeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDataProcessingType()
	 * @generated
	 */
	int DATA_PROCESSING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE__NAME = DATA_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE__OUTGOING = DATA_REPRESENTATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE__INCOMING = DATA_REPRESENTATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Data Processing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_TYPE_FEATURE_COUNT = DATA_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.RealTimeImpl <em>Real Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.RealTimeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getRealTime()
	 * @generated
	 */
	int REAL_TIME = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME__NAME = DATA_PROCESSING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME__OUTGOING = DATA_PROCESSING_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME__INCOMING = DATA_PROCESSING_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Real Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_FEATURE_COUNT = DATA_PROCESSING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.BatchImpl <em>Batch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.BatchImpl
	 * @see DataArch.impl.DataArchPackageImpl#getBatch()
	 * @generated
	 */
	int BATCH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH__NAME = DATA_PROCESSING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH__OUTGOING = DATA_PROCESSING_TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH__INCOMING = DATA_PROCESSING_TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Batch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_FEATURE_COUNT = DATA_PROCESSING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.LinkImpl
	 * @see DataArch.impl.DataArchPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = BEHAVIOURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = BEHAVIOURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DataArch.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.EventImpl
	 * @see DataArch.impl.DataArchPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = LINKABLE_ELEMENT__OUTGOING;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ReceiveDataImpl <em>Receive Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ReceiveDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getReceiveData()
	 * @generated
	 */
	int RECEIVE_DATA = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_DATA__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_DATA__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>From Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_DATA__FROM_MESSAGE_PORTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_DATA__DATA_RECIPIENT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receive Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_DATA_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DataArch.impl.SendDataImpl <em>Send Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SendDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSendData()
	 * @generated
	 */
	int SEND_DATA = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>To Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__TO_MESSAGE_PORTS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__DATA_RECIPIENT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DataArch.impl.GenerateImpl <em>Generate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.GenerateImpl
	 * @see DataArch.impl.DataArchPackageImpl#getGenerate()
	 * @generated
	 */
	int GENERATE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Generate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.IngestImpl <em>Ingest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.IngestImpl
	 * @see DataArch.impl.DataArchPackageImpl#getIngest()
	 * @generated
	 */
	int INGEST = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGEST__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGEST__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGEST__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Ingest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGEST_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.StoreImpl
	 * @see DataArch.impl.DataArchPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.AnalyzeImpl <em>Analyze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.AnalyzeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getAnalyze()
	 * @generated
	 */
	int ANALYZE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Analyze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ConsumeImpl <em>Consume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ConsumeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getConsume()
	 * @generated
	 */
	int CONSUME = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Consume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.VisualizeImpl <em>Visualize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.VisualizeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getVisualize()
	 * @generated
	 */
	int VISUALIZE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZE__NAME = CONSUME__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZE__OUTGOING = CONSUME__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZE__INCOMING = CONSUME__INCOMING;

	/**
	 * The number of structural features of the '<em>Visualize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZE_FEATURE_COUNT = CONSUME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.Query_ReportImpl <em>Query Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.Query_ReportImpl
	 * @see DataArch.impl.DataArchPackageImpl#getQuery_Report()
	 * @generated
	 */
	int QUERY_REPORT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REPORT__NAME = CONSUME__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REPORT__OUTGOING = CONSUME__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REPORT__INCOMING = CONSUME__INCOMING;

	/**
	 * The number of structural features of the '<em>Query Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_REPORT_FEATURE_COUNT = CONSUME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.APIImpl
	 * @see DataArch.impl.DataArchPackageImpl#getAPI()
	 * @generated
	 */
	int API = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = CONSUME__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__OUTGOING = CONSUME__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__INCOMING = CONSUME__INCOMING;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = CONSUME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ProcessImpl
	 * @see DataArch.impl.DataArchPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.TranfromImpl <em>Tranfrom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.TranfromImpl
	 * @see DataArch.impl.DataArchPackageImpl#getTranfrom()
	 * @generated
	 */
	int TRANFROM = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANFROM__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANFROM__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANFROM__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Tranfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANFROM_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.CompressImpl <em>Compress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.CompressImpl
	 * @see DataArch.impl.DataArchPackageImpl#getCompress()
	 * @generated
	 */
	int COMPRESS = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESS__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESS__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESS__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Compress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESS_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.IntegrateImpl <em>Integrate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.IntegrateImpl
	 * @see DataArch.impl.DataArchPackageImpl#getIntegrate()
	 * @generated
	 */
	int INTEGRATE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATE__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATE__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATE__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Integrate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATE_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.IdentifyImpl <em>Identify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.IdentifyImpl
	 * @see DataArch.impl.DataArchPackageImpl#getIdentify()
	 * @generated
	 */
	int IDENTIFY = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Identify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ValidateImpl
	 * @see DataArch.impl.DataArchPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ClassifyImpl <em>Classify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ClassifyImpl
	 * @see DataArch.impl.DataArchPackageImpl#getClassify()
	 * @generated
	 */
	int CLASSIFY = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Classify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFY_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SortImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.MergeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.AggregateImpl
	 * @see DataArch.impl.DataArchPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.CleaningImpl <em>Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.CleaningImpl
	 * @see DataArch.impl.DataArchPackageImpl#getCleaning()
	 * @generated
	 */
	int CLEANING = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.FilterImpl
	 * @see DataArch.impl.DataArchPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ReduceNoiseImpl <em>Reduce Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ReduceNoiseImpl
	 * @see DataArch.impl.DataArchPackageImpl#getReduceNoise()
	 * @generated
	 */
	int REDUCE_NOISE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_NOISE__NAME = INGEST__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_NOISE__OUTGOING = INGEST__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_NOISE__INCOMING = INGEST__INCOMING;

	/**
	 * The number of structural features of the '<em>Reduce Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_NOISE_FEATURE_COUNT = INGEST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.TypeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = ANALYZE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING = ANALYZE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING = ANALYZE__INCOMING;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ANALYZE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.TechniqueImpl <em>Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.TechniqueImpl
	 * @see DataArch.impl.DataArchPackageImpl#getTechnique()
	 * @generated
	 */
	int TECHNIQUE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__NAME = ANALYZE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__OUTGOING = ANALYZE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE__INCOMING = ANALYZE__INCOMING;

	/**
	 * The number of structural features of the '<em>Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNIQUE_FEATURE_COUNT = ANALYZE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DescribeImpl <em>Describe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DescribeImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDescribe()
	 * @generated
	 */
	int DESCRIBE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE__INCOMING = TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Describe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.DiagnoseImpl <em>Diagnose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DiagnoseImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDiagnose()
	 * @generated
	 */
	int DIAGNOSE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSE__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSE__INCOMING = TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Diagnose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.PredictImpl <em>Predict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.PredictImpl
	 * @see DataArch.impl.DataArchPackageImpl#getPredict()
	 * @generated
	 */
	int PREDICT = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICT__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICT__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICT__INCOMING = TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Predict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.PrescriptImpl <em>Prescript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.PrescriptImpl
	 * @see DataArch.impl.DataArchPackageImpl#getPrescript()
	 * @generated
	 */
	int PRESCRIPT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPT__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPT__OUTGOING = TYPE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPT__INCOMING = TYPE__INCOMING;

	/**
	 * The number of structural features of the '<em>Prescript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.Math_OperationImpl <em>Math Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.Math_OperationImpl
	 * @see DataArch.impl.DataArchPackageImpl#getMath_Operation()
	 * @generated
	 */
	int MATH_OPERATION = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__OUTGOING = PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__INCOMING = PROCESS__INCOMING;

	/**
	 * The number of structural features of the '<em>Math Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.RelationalDBImpl
	 * @see DataArch.impl.DataArchPackageImpl#getRelationalDB()
	 * @generated
	 */
	int RELATIONAL_DB = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__NAME = STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__OUTGOING = STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__INCOMING = STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__DB_NAME = STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_FEATURE_COUNT = STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataArch.impl.XMLImpl <em>XML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.XMLImpl
	 * @see DataArch.impl.DataArchPackageImpl#getXML()
	 * @generated
	 */
	int XML = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>XML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.JSONImpl <em>JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.JSONImpl
	 * @see DataArch.impl.DataArchPackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.CSVImpl <em>CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.CSVImpl
	 * @see DataArch.impl.DataArchPackageImpl#getCSV()
	 * @generated
	 */
	int CSV = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ExcelImpl <em>Excel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ExcelImpl
	 * @see DataArch.impl.DataArchPackageImpl#getExcel()
	 * @generated
	 */
	int EXCEL = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.HTMLImpl
	 * @see DataArch.impl.DataArchPackageImpl#getHTML()
	 * @generated
	 */
	int HTML = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.RDFImpl <em>RDF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.RDFImpl
	 * @see DataArch.impl.DataArchPackageImpl#getRDF()
	 * @generated
	 */
	int RDF = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>RDF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.EDIImpl <em>EDI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.EDIImpl
	 * @see DataArch.impl.DataArchPackageImpl#getEDI()
	 * @generated
	 */
	int EDI = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The number of structural features of the '<em>EDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.SMSImpl <em>SMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SMSImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSMS()
	 * @generated
	 */
	int SMS = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__FROM = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__TO = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS__MESSAGE = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link DataArch.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.EmailImpl
	 * @see DataArch.impl.DataArchPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__NAME = SEMI_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__OUTGOING = SEMI_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__INCOMING = SEMI_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__SUBJECT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__FROM = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__TO = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__MESSAGE = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = SEMI_STRUCTURED_DATA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link DataArch.impl.MultimediaImpl <em>Multimedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.MultimediaImpl
	 * @see DataArch.impl.DataArchPackageImpl#getMultimedia()
	 * @generated
	 */
	int MULTIMEDIA = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__NAME = UN_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__OUTGOING = UN_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__INCOMING = UN_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Id Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__ID_MULTI = UN_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__SIZE = UN_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__COMMENT = UN_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__LENGTH = UN_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__FORMAT = UN_STRUCTURED_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA__URL = UN_STRUCTURED_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multimedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIMEDIA_FEATURE_COUNT = UN_STRUCTURED_DATA_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link DataArch.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.AudioImpl
	 * @see DataArch.impl.DataArchPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__OUTGOING = MULTIMEDIA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__INCOMING = MULTIMEDIA__INCOMING;

	/**
	 * The feature id for the '<em><b>Id Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ID_MULTI = MULTIMEDIA__ID_MULTI;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__SIZE = MULTIMEDIA__SIZE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__COMMENT = MULTIMEDIA__COMMENT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LENGTH = MULTIMEDIA__LENGTH;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__FORMAT = MULTIMEDIA__FORMAT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__URL = MULTIMEDIA__URL;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.VideoImpl
	 * @see DataArch.impl.DataArchPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__OUTGOING = MULTIMEDIA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__INCOMING = MULTIMEDIA__INCOMING;

	/**
	 * The feature id for the '<em><b>Id Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID_MULTI = MULTIMEDIA__ID_MULTI;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__SIZE = MULTIMEDIA__SIZE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__COMMENT = MULTIMEDIA__COMMENT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LENGTH = MULTIMEDIA__LENGTH;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FORMAT = MULTIMEDIA__FORMAT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = MULTIMEDIA__URL;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ImageImpl
	 * @see DataArch.impl.DataArchPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = MULTIMEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OUTGOING = MULTIMEDIA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__INCOMING = MULTIMEDIA__INCOMING;

	/**
	 * The feature id for the '<em><b>Id Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID_MULTI = MULTIMEDIA__ID_MULTI;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SIZE = MULTIMEDIA__SIZE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__COMMENT = MULTIMEDIA__COMMENT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LENGTH = MULTIMEDIA__LENGTH;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FORMAT = MULTIMEDIA__FORMAT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = MULTIMEDIA__URL;

	/**
	 * The feature id for the '<em><b>Number Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NUMBER_COLOR = MULTIMEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TRANSPARENCY = MULTIMEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANIMATION = MULTIMEDIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TIMESTAMP = MULTIMEDIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = MULTIMEDIA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link DataArch.impl.GPSDataImpl <em>GPS Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.GPSDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getGPSData()
	 * @generated
	 */
	int GPS_DATA = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__NAME = UN_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__OUTGOING = UN_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__INCOMING = UN_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__LATITUDE = UN_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__LONGITUDE = UN_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__POSITION = UN_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__ALTITUDE = UN_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA__TIME = UN_STRUCTURED_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GPS Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DATA_FEATURE_COUNT = UN_STRUCTURED_DATA_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link DataArch.impl.OfficeFileImpl <em>Office File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.OfficeFileImpl
	 * @see DataArch.impl.DataArchPackageImpl#getOfficeFile()
	 * @generated
	 */
	int OFFICE_FILE = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__NAME = UN_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__OUTGOING = UN_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__INCOMING = UN_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__TEXT = UN_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__FONT = UN_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__TEXTSIZE = UN_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__COLOR = UN_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__BOLD = UN_STRUCTURED_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__ITALICS = UN_STRUCTURED_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__UNDERLINE = UN_STRUCTURED_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__URL = UN_STRUCTURED_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE__SIZE = UN_STRUCTURED_DATA_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Office File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FILE_FEATURE_COUNT = UN_STRUCTURED_DATA_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link DataArch.impl.LogsImpl <em>Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.LogsImpl
	 * @see DataArch.impl.DataArchPackageImpl#getLogs()
	 * @generated
	 */
	int LOGS = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__NAME = OFFICE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__OUTGOING = OFFICE_FILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__INCOMING = OFFICE_FILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__TEXT = OFFICE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__FONT = OFFICE_FILE__FONT;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__TEXTSIZE = OFFICE_FILE__TEXTSIZE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__COLOR = OFFICE_FILE__COLOR;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__BOLD = OFFICE_FILE__BOLD;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__ITALICS = OFFICE_FILE__ITALICS;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__UNDERLINE = OFFICE_FILE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__URL = OFFICE_FILE__URL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__SIZE = OFFICE_FILE__SIZE;

	/**
	 * The number of structural features of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_FEATURE_COUNT = OFFICE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.WordFileImpl <em>Word File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.WordFileImpl
	 * @see DataArch.impl.DataArchPackageImpl#getWordFile()
	 * @generated
	 */
	int WORD_FILE = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__NAME = OFFICE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__OUTGOING = OFFICE_FILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__INCOMING = OFFICE_FILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__TEXT = OFFICE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__FONT = OFFICE_FILE__FONT;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__TEXTSIZE = OFFICE_FILE__TEXTSIZE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__COLOR = OFFICE_FILE__COLOR;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__BOLD = OFFICE_FILE__BOLD;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__ITALICS = OFFICE_FILE__ITALICS;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__UNDERLINE = OFFICE_FILE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__URL = OFFICE_FILE__URL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE__SIZE = OFFICE_FILE__SIZE;

	/**
	 * The number of structural features of the '<em>Word File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FILE_FEATURE_COUNT = OFFICE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.PDFFileImpl <em>PDF File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.PDFFileImpl
	 * @see DataArch.impl.DataArchPackageImpl#getPDFFile()
	 * @generated
	 */
	int PDF_FILE = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__NAME = OFFICE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__OUTGOING = OFFICE_FILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__INCOMING = OFFICE_FILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__TEXT = OFFICE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__FONT = OFFICE_FILE__FONT;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__TEXTSIZE = OFFICE_FILE__TEXTSIZE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__COLOR = OFFICE_FILE__COLOR;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__BOLD = OFFICE_FILE__BOLD;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__ITALICS = OFFICE_FILE__ITALICS;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__UNDERLINE = OFFICE_FILE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__URL = OFFICE_FILE__URL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__SIZE = OFFICE_FILE__SIZE;

	/**
	 * The number of structural features of the '<em>PDF File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE_FEATURE_COUNT = OFFICE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.TextFileImpl <em>Text File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.TextFileImpl
	 * @see DataArch.impl.DataArchPackageImpl#getTextFile()
	 * @generated
	 */
	int TEXT_FILE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__NAME = OFFICE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__OUTGOING = OFFICE_FILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__INCOMING = OFFICE_FILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__TEXT = OFFICE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__FONT = OFFICE_FILE__FONT;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__TEXTSIZE = OFFICE_FILE__TEXTSIZE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__COLOR = OFFICE_FILE__COLOR;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__BOLD = OFFICE_FILE__BOLD;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__ITALICS = OFFICE_FILE__ITALICS;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__UNDERLINE = OFFICE_FILE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__URL = OFFICE_FILE__URL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__SIZE = OFFICE_FILE__SIZE;

	/**
	 * The number of structural features of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_FEATURE_COUNT = OFFICE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.SensorDataImpl <em>Sensor Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SensorDataImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSensorData()
	 * @generated
	 */
	int SENSOR_DATA = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__NAME = UN_STRUCTURED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__OUTGOING = UN_STRUCTURED_DATA__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__INCOMING = UN_STRUCTURED_DATA__INCOMING;

	/**
	 * The feature id for the '<em><b>Physicalsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__PHYSICALSIZE = UN_STRUCTURED_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measuring Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__MEASURING_RANGE = UN_STRUCTURED_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__SENSIVITY = UN_STRUCTURED_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__RESOLUTION = UN_STRUCTURED_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__PRECISION = UN_STRUCTURED_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reproducibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__REPRODUCIBILITY = UN_STRUCTURED_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Linearity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__LINEARITY = UN_STRUCTURED_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__RESPONSE_TIME = UN_STRUCTURED_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__BANDWIDTH = UN_STRUCTURED_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hystersis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__HYSTERSIS = UN_STRUCTURED_DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Temperature Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA__TEMPERATURE_RANGE = UN_STRUCTURED_DATA_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Sensor Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DATA_FEATURE_COUNT = UN_STRUCTURED_DATA_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link DataArch.impl.DocumentOrientedImpl <em>Document Oriented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.DocumentOrientedImpl
	 * @see DataArch.impl.DataArchPackageImpl#getDocumentOriented()
	 * @generated
	 */
	int DOCUMENT_ORIENTED = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ORIENTED__NAME = NO_SQL__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ORIENTED__OUTGOING = NO_SQL__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ORIENTED__INCOMING = NO_SQL__INCOMING;

	/**
	 * The number of structural features of the '<em>Document Oriented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ORIENTED_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ColumnOrientedImpl <em>Column Oriented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ColumnOrientedImpl
	 * @see DataArch.impl.DataArchPackageImpl#getColumnOriented()
	 * @generated
	 */
	int COLUMN_ORIENTED = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ORIENTED__NAME = NO_SQL__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ORIENTED__OUTGOING = NO_SQL__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ORIENTED__INCOMING = NO_SQL__INCOMING;

	/**
	 * The number of structural features of the '<em>Column Oriented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ORIENTED_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.GraphsDatabaseImpl <em>Graphs Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.GraphsDatabaseImpl
	 * @see DataArch.impl.DataArchPackageImpl#getGraphsDatabase()
	 * @generated
	 */
	int GRAPHS_DATABASE = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHS_DATABASE__NAME = NO_SQL__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHS_DATABASE__OUTGOING = NO_SQL__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHS_DATABASE__INCOMING = NO_SQL__INCOMING;

	/**
	 * The number of structural features of the '<em>Graphs Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHS_DATABASE_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.KeyValueImpl
	 * @see DataArch.impl.DataArchPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__NAME = NO_SQL__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__OUTGOING = NO_SQL__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__INCOMING = NO_SQL__INCOMING;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.RetrieveImpl <em>Retrieve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.RetrieveImpl
	 * @see DataArch.impl.DataArchPackageImpl#getRetrieve()
	 * @generated
	 */
	int RETRIEVE = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__OUTGOING = STORE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__INCOMING = STORE__INCOMING;

	/**
	 * The number of structural features of the '<em>Retrieve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.SaveImpl <em>Save</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.SaveImpl
	 * @see DataArch.impl.DataArchPackageImpl#getSave()
	 * @generated
	 */
	int SAVE = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__OUTGOING = STORE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE__INCOMING = STORE__INCOMING;

	/**
	 * The number of structural features of the '<em>Save</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.ArchiveImpl
	 * @see DataArch.impl.DataArchPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__OUTGOING = STORE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__INCOMING = STORE__INCOMING;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataArch.impl.GovernImpl <em>Govern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataArch.impl.GovernImpl
	 * @see DataArch.impl.DataArchPackageImpl#getGovern()
	 * @generated
	 */
	int GOVERN = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERN__NAME = STORE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERN__OUTGOING = STORE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERN__INCOMING = STORE__INCOMING;

	/**
	 * The number of structural features of the '<em>Govern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERN_FEATURE_COUNT = STORE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DataArch.DataArchitecture <em>Data Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Architecture</em>'.
	 * @see DataArch.DataArchitecture
	 * @generated
	 */
	EClass getDataArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link DataArch.DataArchitecture#getDataNodes <em>Data Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Nodes</em>'.
	 * @see DataArch.DataArchitecture#getDataNodes()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_DataNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link DataArch.DataArchitecture#getDataConnection <em>Data Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Connection</em>'.
	 * @see DataArch.DataArchitecture#getDataConnection()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_DataConnection();

	/**
	 * Returns the meta object for class '{@link DataArch.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see DataArch.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.DataNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see DataArch.DataNode#getNodeName()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_NodeName();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.DataNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see DataArch.DataNode#getOutgoing()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.DataNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see DataArch.DataNode#getIncoming()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Incoming();

	/**
	 * Returns the meta object for the containment reference list '{@link DataArch.DataNode#getBehaviouralElements <em>Behavioural Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavioural Elements</em>'.
	 * @see DataArch.DataNode#getBehaviouralElements()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_BehaviouralElements();

	/**
	 * Returns the meta object for the containment reference list '{@link DataArch.DataNode#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see DataArch.DataNode#getPorts()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Ports();

	/**
	 * Returns the meta object for class '{@link DataArch.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see DataArch.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Connection#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see DataArch.Connection#getText()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Text();

	/**
	 * Returns the meta object for the reference '{@link DataArch.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DataArch.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link DataArch.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DataArch.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link DataArch.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see DataArch.MessagePort
	 * @generated
	 */
	EClass getMessagePort();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.MessagePort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DataArch.MessagePort#getName()
	 * @see #getMessagePort()
	 * @generated
	 */
	EAttribute getMessagePort_Name();

	/**
	 * Returns the meta object for class '{@link DataArch.InMessagePort <em>In Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Message Port</em>'.
	 * @see DataArch.InMessagePort
	 * @generated
	 */
	EClass getInMessagePort();

	/**
	 * Returns the meta object for class '{@link DataArch.OutMessagePort <em>Out Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Message Port</em>'.
	 * @see DataArch.OutMessagePort
	 * @generated
	 */
	EClass getOutMessagePort();

	/**
	 * Returns the meta object for class '{@link DataArch.BehaviouralElement <em>Behavioural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioural Element</em>'.
	 * @see DataArch.BehaviouralElement
	 * @generated
	 */
	EClass getBehaviouralElement();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.BehaviouralElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DataArch.BehaviouralElement#getName()
	 * @see #getBehaviouralElement()
	 * @generated
	 */
	EAttribute getBehaviouralElement_Name();

	/**
	 * Returns the meta object for class '{@link DataArch.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Format</em>'.
	 * @see DataArch.DataFormat
	 * @generated
	 */
	EClass getDataFormat();

	/**
	 * Returns the meta object for class '{@link DataArch.StructuredData <em>Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data</em>'.
	 * @see DataArch.StructuredData
	 * @generated
	 */
	EClass getStructuredData();

	/**
	 * Returns the meta object for class '{@link DataArch.SemiStructuredData <em>Semi Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semi Structured Data</em>'.
	 * @see DataArch.SemiStructuredData
	 * @generated
	 */
	EClass getSemiStructuredData();

	/**
	 * Returns the meta object for class '{@link DataArch.UnStructuredData <em>Un Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Structured Data</em>'.
	 * @see DataArch.UnStructuredData
	 * @generated
	 */
	EClass getUnStructuredData();

	/**
	 * Returns the meta object for class '{@link DataArch.DataStorageType <em>Data Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Storage Type</em>'.
	 * @see DataArch.DataStorageType
	 * @generated
	 */
	EClass getDataStorageType();

	/**
	 * Returns the meta object for class '{@link DataArch.DataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Location</em>'.
	 * @see DataArch.DataLocation
	 * @generated
	 */
	EClass getDataLocation();

	/**
	 * Returns the meta object for class '{@link DataArch.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see DataArch.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for class '{@link DataArch.On_Premise <em>On Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Premise</em>'.
	 * @see DataArch.On_Premise
	 * @generated
	 */
	EClass getOn_Premise();

	/**
	 * Returns the meta object for class '{@link DataArch.File_System <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see DataArch.File_System
	 * @generated
	 */
	EClass getFile_System();

	/**
	 * Returns the meta object for class '{@link DataArch.Relational <em>Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational</em>'.
	 * @see DataArch.Relational
	 * @generated
	 */
	EClass getRelational();

	/**
	 * Returns the meta object for class '{@link DataArch.Multidimensional <em>Multidimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multidimensional</em>'.
	 * @see DataArch.Multidimensional
	 * @generated
	 */
	EClass getMultidimensional();

	/**
	 * Returns the meta object for class '{@link DataArch.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL</em>'.
	 * @see DataArch.NoSQL
	 * @generated
	 */
	EClass getNoSQL();

	/**
	 * Returns the meta object for class '{@link DataArch.DataProcessingType <em>Data Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Type</em>'.
	 * @see DataArch.DataProcessingType
	 * @generated
	 */
	EClass getDataProcessingType();

	/**
	 * Returns the meta object for class '{@link DataArch.RealTime <em>Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time</em>'.
	 * @see DataArch.RealTime
	 * @generated
	 */
	EClass getRealTime();

	/**
	 * Returns the meta object for class '{@link DataArch.Batch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch</em>'.
	 * @see DataArch.Batch
	 * @generated
	 */
	EClass getBatch();

	/**
	 * Returns the meta object for class '{@link DataArch.LinkableElement <em>Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable Element</em>'.
	 * @see DataArch.LinkableElement
	 * @generated
	 */
	EClass getLinkableElement();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.LinkableElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see DataArch.LinkableElement#getOutgoing()
	 * @see #getLinkableElement()
	 * @generated
	 */
	EReference getLinkableElement_Outgoing();

	/**
	 * Returns the meta object for class '{@link DataArch.DataRepresentation <em>Data Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Representation</em>'.
	 * @see DataArch.DataRepresentation
	 * @generated
	 */
	EClass getDataRepresentation();

	/**
	 * Returns the meta object for class '{@link DataArch.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see DataArch.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.Action#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see DataArch.Action#getIncoming()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Incoming();

	/**
	 * Returns the meta object for class '{@link DataArch.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see DataArch.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link DataArch.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DataArch.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link DataArch.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DataArch.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link DataArch.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see DataArch.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link DataArch.ReceiveData <em>Receive Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Data</em>'.
	 * @see DataArch.ReceiveData
	 * @generated
	 */
	EClass getReceiveData();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.ReceiveData#getFromMessagePorts <em>From Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Message Ports</em>'.
	 * @see DataArch.ReceiveData#getFromMessagePorts()
	 * @see #getReceiveData()
	 * @generated
	 */
	EReference getReceiveData_FromMessagePorts();

	/**
	 * Returns the meta object for the reference '{@link DataArch.ReceiveData#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see DataArch.ReceiveData#getDataRecipient()
	 * @see #getReceiveData()
	 * @generated
	 */
	EReference getReceiveData_DataRecipient();

	/**
	 * Returns the meta object for class '{@link DataArch.SendData <em>Send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Data</em>'.
	 * @see DataArch.SendData
	 * @generated
	 */
	EClass getSendData();

	/**
	 * Returns the meta object for the reference list '{@link DataArch.SendData#getToMessagePorts <em>To Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Message Ports</em>'.
	 * @see DataArch.SendData#getToMessagePorts()
	 * @see #getSendData()
	 * @generated
	 */
	EReference getSendData_ToMessagePorts();

	/**
	 * Returns the meta object for the reference '{@link DataArch.SendData#getDataRecipient <em>Data Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Recipient</em>'.
	 * @see DataArch.SendData#getDataRecipient()
	 * @see #getSendData()
	 * @generated
	 */
	EReference getSendData_DataRecipient();

	/**
	 * Returns the meta object for class '{@link DataArch.Generate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generate</em>'.
	 * @see DataArch.Generate
	 * @generated
	 */
	EClass getGenerate();

	/**
	 * Returns the meta object for class '{@link DataArch.Ingest <em>Ingest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingest</em>'.
	 * @see DataArch.Ingest
	 * @generated
	 */
	EClass getIngest();

	/**
	 * Returns the meta object for class '{@link DataArch.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see DataArch.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link DataArch.Analyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyze</em>'.
	 * @see DataArch.Analyze
	 * @generated
	 */
	EClass getAnalyze();

	/**
	 * Returns the meta object for class '{@link DataArch.Consume <em>Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consume</em>'.
	 * @see DataArch.Consume
	 * @generated
	 */
	EClass getConsume();

	/**
	 * Returns the meta object for class '{@link DataArch.Visualize <em>Visualize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualize</em>'.
	 * @see DataArch.Visualize
	 * @generated
	 */
	EClass getVisualize();

	/**
	 * Returns the meta object for class '{@link DataArch.Query_Report <em>Query Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Report</em>'.
	 * @see DataArch.Query_Report
	 * @generated
	 */
	EClass getQuery_Report();

	/**
	 * Returns the meta object for class '{@link DataArch.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see DataArch.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for class '{@link DataArch.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see DataArch.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link DataArch.Tranfrom <em>Tranfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tranfrom</em>'.
	 * @see DataArch.Tranfrom
	 * @generated
	 */
	EClass getTranfrom();

	/**
	 * Returns the meta object for class '{@link DataArch.Compress <em>Compress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compress</em>'.
	 * @see DataArch.Compress
	 * @generated
	 */
	EClass getCompress();

	/**
	 * Returns the meta object for class '{@link DataArch.Integrate <em>Integrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrate</em>'.
	 * @see DataArch.Integrate
	 * @generated
	 */
	EClass getIntegrate();

	/**
	 * Returns the meta object for class '{@link DataArch.Identify <em>Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identify</em>'.
	 * @see DataArch.Identify
	 * @generated
	 */
	EClass getIdentify();

	/**
	 * Returns the meta object for class '{@link DataArch.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see DataArch.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for class '{@link DataArch.Classify <em>Classify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classify</em>'.
	 * @see DataArch.Classify
	 * @generated
	 */
	EClass getClassify();

	/**
	 * Returns the meta object for class '{@link DataArch.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see DataArch.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link DataArch.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see DataArch.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for class '{@link DataArch.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see DataArch.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for class '{@link DataArch.Cleaning <em>Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning</em>'.
	 * @see DataArch.Cleaning
	 * @generated
	 */
	EClass getCleaning();

	/**
	 * Returns the meta object for class '{@link DataArch.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see DataArch.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link DataArch.ReduceNoise <em>Reduce Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Noise</em>'.
	 * @see DataArch.ReduceNoise
	 * @generated
	 */
	EClass getReduceNoise();

	/**
	 * Returns the meta object for class '{@link DataArch.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see DataArch.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link DataArch.Technique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technique</em>'.
	 * @see DataArch.Technique
	 * @generated
	 */
	EClass getTechnique();

	/**
	 * Returns the meta object for class '{@link DataArch.Describe <em>Describe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe</em>'.
	 * @see DataArch.Describe
	 * @generated
	 */
	EClass getDescribe();

	/**
	 * Returns the meta object for class '{@link DataArch.Diagnose <em>Diagnose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnose</em>'.
	 * @see DataArch.Diagnose
	 * @generated
	 */
	EClass getDiagnose();

	/**
	 * Returns the meta object for class '{@link DataArch.Predict <em>Predict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predict</em>'.
	 * @see DataArch.Predict
	 * @generated
	 */
	EClass getPredict();

	/**
	 * Returns the meta object for class '{@link DataArch.Prescript <em>Prescript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescript</em>'.
	 * @see DataArch.Prescript
	 * @generated
	 */
	EClass getPrescript();

	/**
	 * Returns the meta object for class '{@link DataArch.Math_Operation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operation</em>'.
	 * @see DataArch.Math_Operation
	 * @generated
	 */
	EClass getMath_Operation();

	/**
	 * Returns the meta object for class '{@link DataArch.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational DB</em>'.
	 * @see DataArch.RelationalDB
	 * @generated
	 */
	EClass getRelationalDB();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.RelationalDB#getDbName <em>Db Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Name</em>'.
	 * @see DataArch.RelationalDB#getDbName()
	 * @see #getRelationalDB()
	 * @generated
	 */
	EAttribute getRelationalDB_DbName();

	/**
	 * Returns the meta object for class '{@link DataArch.XML <em>XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML</em>'.
	 * @see DataArch.XML
	 * @generated
	 */
	EClass getXML();

	/**
	 * Returns the meta object for class '{@link DataArch.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON</em>'.
	 * @see DataArch.JSON
	 * @generated
	 */
	EClass getJSON();

	/**
	 * Returns the meta object for class '{@link DataArch.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV</em>'.
	 * @see DataArch.CSV
	 * @generated
	 */
	EClass getCSV();

	/**
	 * Returns the meta object for class '{@link DataArch.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel</em>'.
	 * @see DataArch.Excel
	 * @generated
	 */
	EClass getExcel();

	/**
	 * Returns the meta object for class '{@link DataArch.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see DataArch.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for class '{@link DataArch.RDF <em>RDF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF</em>'.
	 * @see DataArch.RDF
	 * @generated
	 */
	EClass getRDF();

	/**
	 * Returns the meta object for class '{@link DataArch.EDI <em>EDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDI</em>'.
	 * @see DataArch.EDI
	 * @generated
	 */
	EClass getEDI();

	/**
	 * Returns the meta object for class '{@link DataArch.SMS <em>SMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMS</em>'.
	 * @see DataArch.SMS
	 * @generated
	 */
	EClass getSMS();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SMS#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see DataArch.SMS#getFrom()
	 * @see #getSMS()
	 * @generated
	 */
	EAttribute getSMS_From();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SMS#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see DataArch.SMS#getTo()
	 * @see #getSMS()
	 * @generated
	 */
	EAttribute getSMS_To();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SMS#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see DataArch.SMS#getMessage()
	 * @see #getSMS()
	 * @generated
	 */
	EAttribute getSMS_Message();

	/**
	 * Returns the meta object for class '{@link DataArch.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see DataArch.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Email#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see DataArch.Email#getSubject()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Subject();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Email#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see DataArch.Email#getFrom()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_From();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Email#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see DataArch.Email#getTo()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_To();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Email#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see DataArch.Email#getMessage()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Message();

	/**
	 * Returns the meta object for class '{@link DataArch.Multimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multimedia</em>'.
	 * @see DataArch.Multimedia
	 * @generated
	 */
	EClass getMultimedia();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getId_Multi <em>Id Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Multi</em>'.
	 * @see DataArch.Multimedia#getId_Multi()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Id_Multi();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see DataArch.Multimedia#getSize()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Size();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see DataArch.Multimedia#getComment()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Comment();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see DataArch.Multimedia#getLength()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Length();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see DataArch.Multimedia#getFormat()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Format();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Multimedia#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see DataArch.Multimedia#getUrl()
	 * @see #getMultimedia()
	 * @generated
	 */
	EAttribute getMultimedia_Url();

	/**
	 * Returns the meta object for class '{@link DataArch.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see DataArch.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for class '{@link DataArch.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see DataArch.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link DataArch.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see DataArch.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Image#getNumberColor <em>Number Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Color</em>'.
	 * @see DataArch.Image#getNumberColor()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_NumberColor();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Image#isTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see DataArch.Image#isTransparency()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Image#isAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation</em>'.
	 * @see DataArch.Image#isAnimation()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Animation();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.Image#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see DataArch.Image#getTimestamp()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Timestamp();

	/**
	 * Returns the meta object for class '{@link DataArch.GPSData <em>GPS Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Data</em>'.
	 * @see DataArch.GPSData
	 * @generated
	 */
	EClass getGPSData();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.GPSData#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see DataArch.GPSData#getLatitude()
	 * @see #getGPSData()
	 * @generated
	 */
	EAttribute getGPSData_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.GPSData#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see DataArch.GPSData#getLongitude()
	 * @see #getGPSData()
	 * @generated
	 */
	EAttribute getGPSData_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.GPSData#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see DataArch.GPSData#getPosition()
	 * @see #getGPSData()
	 * @generated
	 */
	EAttribute getGPSData_Position();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.GPSData#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see DataArch.GPSData#getAltitude()
	 * @see #getGPSData()
	 * @generated
	 */
	EAttribute getGPSData_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.GPSData#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see DataArch.GPSData#getTime()
	 * @see #getGPSData()
	 * @generated
	 */
	EAttribute getGPSData_Time();

	/**
	 * Returns the meta object for class '{@link DataArch.OfficeFile <em>Office File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Office File</em>'.
	 * @see DataArch.OfficeFile
	 * @generated
	 */
	EClass getOfficeFile();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see DataArch.OfficeFile#getText()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Text();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see DataArch.OfficeFile#getFont()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Font();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getTextsize <em>Textsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textsize</em>'.
	 * @see DataArch.OfficeFile#getTextsize()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Textsize();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see DataArch.OfficeFile#getColor()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Color();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see DataArch.OfficeFile#isBold()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Bold();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#isItalics <em>Italics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italics</em>'.
	 * @see DataArch.OfficeFile#isItalics()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Italics();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see DataArch.OfficeFile#isUnderline()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Underline();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see DataArch.OfficeFile#getUrl()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Url();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.OfficeFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see DataArch.OfficeFile#getSize()
	 * @see #getOfficeFile()
	 * @generated
	 */
	EAttribute getOfficeFile_Size();

	/**
	 * Returns the meta object for class '{@link DataArch.Logs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logs</em>'.
	 * @see DataArch.Logs
	 * @generated
	 */
	EClass getLogs();

	/**
	 * Returns the meta object for class '{@link DataArch.WordFile <em>Word File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word File</em>'.
	 * @see DataArch.WordFile
	 * @generated
	 */
	EClass getWordFile();

	/**
	 * Returns the meta object for class '{@link DataArch.PDFFile <em>PDF File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDF File</em>'.
	 * @see DataArch.PDFFile
	 * @generated
	 */
	EClass getPDFFile();

	/**
	 * Returns the meta object for class '{@link DataArch.TextFile <em>Text File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text File</em>'.
	 * @see DataArch.TextFile
	 * @generated
	 */
	EClass getTextFile();

	/**
	 * Returns the meta object for class '{@link DataArch.SensorData <em>Sensor Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Data</em>'.
	 * @see DataArch.SensorData
	 * @generated
	 */
	EClass getSensorData();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getPhysicalsize <em>Physicalsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physicalsize</em>'.
	 * @see DataArch.SensorData#getPhysicalsize()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Physicalsize();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getMeasuringRange <em>Measuring Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measuring Range</em>'.
	 * @see DataArch.SensorData#getMeasuringRange()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_MeasuringRange();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getSensivity <em>Sensivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensivity</em>'.
	 * @see DataArch.SensorData#getSensivity()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Sensivity();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see DataArch.SensorData#getResolution()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see DataArch.SensorData#getPrecision()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Precision();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getReproducibility <em>Reproducibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reproducibility</em>'.
	 * @see DataArch.SensorData#getReproducibility()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Reproducibility();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getLinearity <em>Linearity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linearity</em>'.
	 * @see DataArch.SensorData#getLinearity()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Linearity();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see DataArch.SensorData#getResponseTime()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_ResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see DataArch.SensorData#getBandwidth()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getHystersis <em>Hystersis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hystersis</em>'.
	 * @see DataArch.SensorData#getHystersis()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_Hystersis();

	/**
	 * Returns the meta object for the attribute '{@link DataArch.SensorData#getTemperatureRange <em>Temperature Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Range</em>'.
	 * @see DataArch.SensorData#getTemperatureRange()
	 * @see #getSensorData()
	 * @generated
	 */
	EAttribute getSensorData_TemperatureRange();

	/**
	 * Returns the meta object for class '{@link DataArch.DocumentOriented <em>Document Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Oriented</em>'.
	 * @see DataArch.DocumentOriented
	 * @generated
	 */
	EClass getDocumentOriented();

	/**
	 * Returns the meta object for class '{@link DataArch.ColumnOriented <em>Column Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Oriented</em>'.
	 * @see DataArch.ColumnOriented
	 * @generated
	 */
	EClass getColumnOriented();

	/**
	 * Returns the meta object for class '{@link DataArch.GraphsDatabase <em>Graphs Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphs Database</em>'.
	 * @see DataArch.GraphsDatabase
	 * @generated
	 */
	EClass getGraphsDatabase();

	/**
	 * Returns the meta object for class '{@link DataArch.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see DataArch.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for class '{@link DataArch.Retrieve <em>Retrieve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieve</em>'.
	 * @see DataArch.Retrieve
	 * @generated
	 */
	EClass getRetrieve();

	/**
	 * Returns the meta object for class '{@link DataArch.Save <em>Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save</em>'.
	 * @see DataArch.Save
	 * @generated
	 */
	EClass getSave();

	/**
	 * Returns the meta object for class '{@link DataArch.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see DataArch.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for class '{@link DataArch.Govern <em>Govern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Govern</em>'.
	 * @see DataArch.Govern
	 * @generated
	 */
	EClass getGovern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataArchFactory getDataArchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DataArch.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataArchitectureImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataArchitecture()
		 * @generated
		 */
		EClass DATA_ARCHITECTURE = eINSTANCE.getDataArchitecture();

		/**
		 * The meta object literal for the '<em><b>Data Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__DATA_NODES = eINSTANCE.getDataArchitecture_DataNodes();

		/**
		 * The meta object literal for the '<em><b>Data Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__DATA_CONNECTION = eINSTANCE.getDataArchitecture_DataConnection();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataNodeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__NODE_NAME = eINSTANCE.getDataNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__OUTGOING = eINSTANCE.getDataNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__INCOMING = eINSTANCE.getDataNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Behavioural Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__BEHAVIOURAL_ELEMENTS = eINSTANCE.getDataNode_BehaviouralElements();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__PORTS = eINSTANCE.getDataNode_Ports();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ConnectionImpl
		 * @see DataArch.impl.DataArchPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TEXT = eINSTANCE.getConnection_Text();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link DataArch.impl.MessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.MessagePortImpl
		 * @see DataArch.impl.DataArchPackageImpl#getMessagePort()
		 * @generated
		 */
		EClass MESSAGE_PORT = eINSTANCE.getMessagePort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_PORT__NAME = eINSTANCE.getMessagePort_Name();

		/**
		 * The meta object literal for the '{@link DataArch.impl.InMessagePortImpl <em>In Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.InMessagePortImpl
		 * @see DataArch.impl.DataArchPackageImpl#getInMessagePort()
		 * @generated
		 */
		EClass IN_MESSAGE_PORT = eINSTANCE.getInMessagePort();

		/**
		 * The meta object literal for the '{@link DataArch.impl.OutMessagePortImpl <em>Out Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.OutMessagePortImpl
		 * @see DataArch.impl.DataArchPackageImpl#getOutMessagePort()
		 * @generated
		 */
		EClass OUT_MESSAGE_PORT = eINSTANCE.getOutMessagePort();

		/**
		 * The meta object literal for the '{@link DataArch.impl.BehaviouralElementImpl <em>Behavioural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.BehaviouralElementImpl
		 * @see DataArch.impl.DataArchPackageImpl#getBehaviouralElement()
		 * @generated
		 */
		EClass BEHAVIOURAL_ELEMENT = eINSTANCE.getBehaviouralElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOURAL_ELEMENT__NAME = eINSTANCE.getBehaviouralElement_Name();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataFormatImpl <em>Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataFormatImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataFormat()
		 * @generated
		 */
		EClass DATA_FORMAT = eINSTANCE.getDataFormat();

		/**
		 * The meta object literal for the '{@link DataArch.impl.StructuredDataImpl <em>Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.StructuredDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getStructuredData()
		 * @generated
		 */
		EClass STRUCTURED_DATA = eINSTANCE.getStructuredData();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SemiStructuredDataImpl <em>Semi Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SemiStructuredDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSemiStructuredData()
		 * @generated
		 */
		EClass SEMI_STRUCTURED_DATA = eINSTANCE.getSemiStructuredData();

		/**
		 * The meta object literal for the '{@link DataArch.impl.UnStructuredDataImpl <em>Un Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.UnStructuredDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getUnStructuredData()
		 * @generated
		 */
		EClass UN_STRUCTURED_DATA = eINSTANCE.getUnStructuredData();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataStorageTypeImpl <em>Data Storage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataStorageTypeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataStorageType()
		 * @generated
		 */
		EClass DATA_STORAGE_TYPE = eINSTANCE.getDataStorageType();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataLocationImpl <em>Data Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataLocationImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataLocation()
		 * @generated
		 */
		EClass DATA_LOCATION = eINSTANCE.getDataLocation();

		/**
		 * The meta object literal for the '{@link DataArch.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.CloudImpl
		 * @see DataArch.impl.DataArchPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '{@link DataArch.impl.On_PremiseImpl <em>On Premise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.On_PremiseImpl
		 * @see DataArch.impl.DataArchPackageImpl#getOn_Premise()
		 * @generated
		 */
		EClass ON_PREMISE = eINSTANCE.getOn_Premise();

		/**
		 * The meta object literal for the '{@link DataArch.impl.File_SystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.File_SystemImpl
		 * @see DataArch.impl.DataArchPackageImpl#getFile_System()
		 * @generated
		 */
		EClass FILE_SYSTEM = eINSTANCE.getFile_System();

		/**
		 * The meta object literal for the '{@link DataArch.impl.RelationalImpl <em>Relational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.RelationalImpl
		 * @see DataArch.impl.DataArchPackageImpl#getRelational()
		 * @generated
		 */
		EClass RELATIONAL = eINSTANCE.getRelational();

		/**
		 * The meta object literal for the '{@link DataArch.impl.MultidimensionalImpl <em>Multidimensional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.MultidimensionalImpl
		 * @see DataArch.impl.DataArchPackageImpl#getMultidimensional()
		 * @generated
		 */
		EClass MULTIDIMENSIONAL = eINSTANCE.getMultidimensional();

		/**
		 * The meta object literal for the '{@link DataArch.impl.NoSQLImpl <em>No SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.NoSQLImpl
		 * @see DataArch.impl.DataArchPackageImpl#getNoSQL()
		 * @generated
		 */
		EClass NO_SQL = eINSTANCE.getNoSQL();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataProcessingTypeImpl <em>Data Processing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataProcessingTypeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataProcessingType()
		 * @generated
		 */
		EClass DATA_PROCESSING_TYPE = eINSTANCE.getDataProcessingType();

		/**
		 * The meta object literal for the '{@link DataArch.impl.RealTimeImpl <em>Real Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.RealTimeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getRealTime()
		 * @generated
		 */
		EClass REAL_TIME = eINSTANCE.getRealTime();

		/**
		 * The meta object literal for the '{@link DataArch.impl.BatchImpl <em>Batch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.BatchImpl
		 * @see DataArch.impl.DataArchPackageImpl#getBatch()
		 * @generated
		 */
		EClass BATCH = eINSTANCE.getBatch();

		/**
		 * The meta object literal for the '{@link DataArch.impl.LinkableElementImpl <em>Linkable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.LinkableElementImpl
		 * @see DataArch.impl.DataArchPackageImpl#getLinkableElement()
		 * @generated
		 */
		EClass LINKABLE_ELEMENT = eINSTANCE.getLinkableElement();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE_ELEMENT__OUTGOING = eINSTANCE.getLinkableElement_Outgoing();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DataRepresentationImpl <em>Data Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DataRepresentationImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDataRepresentation()
		 * @generated
		 */
		EClass DATA_REPRESENTATION = eINSTANCE.getDataRepresentation();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ActionImpl
		 * @see DataArch.impl.DataArchPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INCOMING = eINSTANCE.getAction_Incoming();

		/**
		 * The meta object literal for the '{@link DataArch.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.LinkImpl
		 * @see DataArch.impl.DataArchPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link DataArch.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.EventImpl
		 * @see DataArch.impl.DataArchPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ReceiveDataImpl <em>Receive Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ReceiveDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getReceiveData()
		 * @generated
		 */
		EClass RECEIVE_DATA = eINSTANCE.getReceiveData();

		/**
		 * The meta object literal for the '<em><b>From Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_DATA__FROM_MESSAGE_PORTS = eINSTANCE.getReceiveData_FromMessagePorts();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_DATA__DATA_RECIPIENT = eINSTANCE.getReceiveData_DataRecipient();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SendDataImpl <em>Send Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SendDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSendData()
		 * @generated
		 */
		EClass SEND_DATA = eINSTANCE.getSendData();

		/**
		 * The meta object literal for the '<em><b>To Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_DATA__TO_MESSAGE_PORTS = eINSTANCE.getSendData_ToMessagePorts();

		/**
		 * The meta object literal for the '<em><b>Data Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_DATA__DATA_RECIPIENT = eINSTANCE.getSendData_DataRecipient();

		/**
		 * The meta object literal for the '{@link DataArch.impl.GenerateImpl <em>Generate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.GenerateImpl
		 * @see DataArch.impl.DataArchPackageImpl#getGenerate()
		 * @generated
		 */
		EClass GENERATE = eINSTANCE.getGenerate();

		/**
		 * The meta object literal for the '{@link DataArch.impl.IngestImpl <em>Ingest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.IngestImpl
		 * @see DataArch.impl.DataArchPackageImpl#getIngest()
		 * @generated
		 */
		EClass INGEST = eINSTANCE.getIngest();

		/**
		 * The meta object literal for the '{@link DataArch.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.StoreImpl
		 * @see DataArch.impl.DataArchPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link DataArch.impl.AnalyzeImpl <em>Analyze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.AnalyzeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getAnalyze()
		 * @generated
		 */
		EClass ANALYZE = eINSTANCE.getAnalyze();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ConsumeImpl <em>Consume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ConsumeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getConsume()
		 * @generated
		 */
		EClass CONSUME = eINSTANCE.getConsume();

		/**
		 * The meta object literal for the '{@link DataArch.impl.VisualizeImpl <em>Visualize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.VisualizeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getVisualize()
		 * @generated
		 */
		EClass VISUALIZE = eINSTANCE.getVisualize();

		/**
		 * The meta object literal for the '{@link DataArch.impl.Query_ReportImpl <em>Query Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.Query_ReportImpl
		 * @see DataArch.impl.DataArchPackageImpl#getQuery_Report()
		 * @generated
		 */
		EClass QUERY_REPORT = eINSTANCE.getQuery_Report();

		/**
		 * The meta object literal for the '{@link DataArch.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.APIImpl
		 * @see DataArch.impl.DataArchPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ProcessImpl
		 * @see DataArch.impl.DataArchPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link DataArch.impl.TranfromImpl <em>Tranfrom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.TranfromImpl
		 * @see DataArch.impl.DataArchPackageImpl#getTranfrom()
		 * @generated
		 */
		EClass TRANFROM = eINSTANCE.getTranfrom();

		/**
		 * The meta object literal for the '{@link DataArch.impl.CompressImpl <em>Compress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.CompressImpl
		 * @see DataArch.impl.DataArchPackageImpl#getCompress()
		 * @generated
		 */
		EClass COMPRESS = eINSTANCE.getCompress();

		/**
		 * The meta object literal for the '{@link DataArch.impl.IntegrateImpl <em>Integrate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.IntegrateImpl
		 * @see DataArch.impl.DataArchPackageImpl#getIntegrate()
		 * @generated
		 */
		EClass INTEGRATE = eINSTANCE.getIntegrate();

		/**
		 * The meta object literal for the '{@link DataArch.impl.IdentifyImpl <em>Identify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.IdentifyImpl
		 * @see DataArch.impl.DataArchPackageImpl#getIdentify()
		 * @generated
		 */
		EClass IDENTIFY = eINSTANCE.getIdentify();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ValidateImpl
		 * @see DataArch.impl.DataArchPackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ClassifyImpl <em>Classify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ClassifyImpl
		 * @see DataArch.impl.DataArchPackageImpl#getClassify()
		 * @generated
		 */
		EClass CLASSIFY = eINSTANCE.getClassify();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SortImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link DataArch.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.MergeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '{@link DataArch.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.AggregateImpl
		 * @see DataArch.impl.DataArchPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '{@link DataArch.impl.CleaningImpl <em>Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.CleaningImpl
		 * @see DataArch.impl.DataArchPackageImpl#getCleaning()
		 * @generated
		 */
		EClass CLEANING = eINSTANCE.getCleaning();

		/**
		 * The meta object literal for the '{@link DataArch.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.FilterImpl
		 * @see DataArch.impl.DataArchPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ReduceNoiseImpl <em>Reduce Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ReduceNoiseImpl
		 * @see DataArch.impl.DataArchPackageImpl#getReduceNoise()
		 * @generated
		 */
		EClass REDUCE_NOISE = eINSTANCE.getReduceNoise();

		/**
		 * The meta object literal for the '{@link DataArch.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.TypeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link DataArch.impl.TechniqueImpl <em>Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.TechniqueImpl
		 * @see DataArch.impl.DataArchPackageImpl#getTechnique()
		 * @generated
		 */
		EClass TECHNIQUE = eINSTANCE.getTechnique();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DescribeImpl <em>Describe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DescribeImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDescribe()
		 * @generated
		 */
		EClass DESCRIBE = eINSTANCE.getDescribe();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DiagnoseImpl <em>Diagnose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DiagnoseImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDiagnose()
		 * @generated
		 */
		EClass DIAGNOSE = eINSTANCE.getDiagnose();

		/**
		 * The meta object literal for the '{@link DataArch.impl.PredictImpl <em>Predict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.PredictImpl
		 * @see DataArch.impl.DataArchPackageImpl#getPredict()
		 * @generated
		 */
		EClass PREDICT = eINSTANCE.getPredict();

		/**
		 * The meta object literal for the '{@link DataArch.impl.PrescriptImpl <em>Prescript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.PrescriptImpl
		 * @see DataArch.impl.DataArchPackageImpl#getPrescript()
		 * @generated
		 */
		EClass PRESCRIPT = eINSTANCE.getPrescript();

		/**
		 * The meta object literal for the '{@link DataArch.impl.Math_OperationImpl <em>Math Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.Math_OperationImpl
		 * @see DataArch.impl.DataArchPackageImpl#getMath_Operation()
		 * @generated
		 */
		EClass MATH_OPERATION = eINSTANCE.getMath_Operation();

		/**
		 * The meta object literal for the '{@link DataArch.impl.RelationalDBImpl <em>Relational DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.RelationalDBImpl
		 * @see DataArch.impl.DataArchPackageImpl#getRelationalDB()
		 * @generated
		 */
		EClass RELATIONAL_DB = eINSTANCE.getRelationalDB();

		/**
		 * The meta object literal for the '<em><b>Db Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__DB_NAME = eINSTANCE.getRelationalDB_DbName();

		/**
		 * The meta object literal for the '{@link DataArch.impl.XMLImpl <em>XML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.XMLImpl
		 * @see DataArch.impl.DataArchPackageImpl#getXML()
		 * @generated
		 */
		EClass XML = eINSTANCE.getXML();

		/**
		 * The meta object literal for the '{@link DataArch.impl.JSONImpl <em>JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.JSONImpl
		 * @see DataArch.impl.DataArchPackageImpl#getJSON()
		 * @generated
		 */
		EClass JSON = eINSTANCE.getJSON();

		/**
		 * The meta object literal for the '{@link DataArch.impl.CSVImpl <em>CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.CSVImpl
		 * @see DataArch.impl.DataArchPackageImpl#getCSV()
		 * @generated
		 */
		EClass CSV = eINSTANCE.getCSV();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ExcelImpl <em>Excel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ExcelImpl
		 * @see DataArch.impl.DataArchPackageImpl#getExcel()
		 * @generated
		 */
		EClass EXCEL = eINSTANCE.getExcel();

		/**
		 * The meta object literal for the '{@link DataArch.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.HTMLImpl
		 * @see DataArch.impl.DataArchPackageImpl#getHTML()
		 * @generated
		 */
		EClass HTML = eINSTANCE.getHTML();

		/**
		 * The meta object literal for the '{@link DataArch.impl.RDFImpl <em>RDF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.RDFImpl
		 * @see DataArch.impl.DataArchPackageImpl#getRDF()
		 * @generated
		 */
		EClass RDF = eINSTANCE.getRDF();

		/**
		 * The meta object literal for the '{@link DataArch.impl.EDIImpl <em>EDI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.EDIImpl
		 * @see DataArch.impl.DataArchPackageImpl#getEDI()
		 * @generated
		 */
		EClass EDI = eINSTANCE.getEDI();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SMSImpl <em>SMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SMSImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSMS()
		 * @generated
		 */
		EClass SMS = eINSTANCE.getSMS();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMS__FROM = eINSTANCE.getSMS_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMS__TO = eINSTANCE.getSMS_To();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMS__MESSAGE = eINSTANCE.getSMS_Message();

		/**
		 * The meta object literal for the '{@link DataArch.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.EmailImpl
		 * @see DataArch.impl.DataArchPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__SUBJECT = eINSTANCE.getEmail_Subject();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__FROM = eINSTANCE.getEmail_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__TO = eINSTANCE.getEmail_To();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__MESSAGE = eINSTANCE.getEmail_Message();

		/**
		 * The meta object literal for the '{@link DataArch.impl.MultimediaImpl <em>Multimedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.MultimediaImpl
		 * @see DataArch.impl.DataArchPackageImpl#getMultimedia()
		 * @generated
		 */
		EClass MULTIMEDIA = eINSTANCE.getMultimedia();

		/**
		 * The meta object literal for the '<em><b>Id Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__ID_MULTI = eINSTANCE.getMultimedia_Id_Multi();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__SIZE = eINSTANCE.getMultimedia_Size();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__COMMENT = eINSTANCE.getMultimedia_Comment();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__LENGTH = eINSTANCE.getMultimedia_Length();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__FORMAT = eINSTANCE.getMultimedia_Format();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIMEDIA__URL = eINSTANCE.getMultimedia_Url();

		/**
		 * The meta object literal for the '{@link DataArch.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.AudioImpl
		 * @see DataArch.impl.DataArchPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '{@link DataArch.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.VideoImpl
		 * @see DataArch.impl.DataArchPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ImageImpl
		 * @see DataArch.impl.DataArchPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Number Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NUMBER_COLOR = eINSTANCE.getImage_NumberColor();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TRANSPARENCY = eINSTANCE.getImage_Transparency();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ANIMATION = eINSTANCE.getImage_Animation();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TIMESTAMP = eINSTANCE.getImage_Timestamp();

		/**
		 * The meta object literal for the '{@link DataArch.impl.GPSDataImpl <em>GPS Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.GPSDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getGPSData()
		 * @generated
		 */
		EClass GPS_DATA = eINSTANCE.getGPSData();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_DATA__LATITUDE = eINSTANCE.getGPSData_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_DATA__LONGITUDE = eINSTANCE.getGPSData_Longitude();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_DATA__POSITION = eINSTANCE.getGPSData_Position();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_DATA__ALTITUDE = eINSTANCE.getGPSData_Altitude();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_DATA__TIME = eINSTANCE.getGPSData_Time();

		/**
		 * The meta object literal for the '{@link DataArch.impl.OfficeFileImpl <em>Office File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.OfficeFileImpl
		 * @see DataArch.impl.DataArchPackageImpl#getOfficeFile()
		 * @generated
		 */
		EClass OFFICE_FILE = eINSTANCE.getOfficeFile();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__TEXT = eINSTANCE.getOfficeFile_Text();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__FONT = eINSTANCE.getOfficeFile_Font();

		/**
		 * The meta object literal for the '<em><b>Textsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__TEXTSIZE = eINSTANCE.getOfficeFile_Textsize();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__COLOR = eINSTANCE.getOfficeFile_Color();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__BOLD = eINSTANCE.getOfficeFile_Bold();

		/**
		 * The meta object literal for the '<em><b>Italics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__ITALICS = eINSTANCE.getOfficeFile_Italics();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__UNDERLINE = eINSTANCE.getOfficeFile_Underline();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__URL = eINSTANCE.getOfficeFile_Url();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE_FILE__SIZE = eINSTANCE.getOfficeFile_Size();

		/**
		 * The meta object literal for the '{@link DataArch.impl.LogsImpl <em>Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.LogsImpl
		 * @see DataArch.impl.DataArchPackageImpl#getLogs()
		 * @generated
		 */
		EClass LOGS = eINSTANCE.getLogs();

		/**
		 * The meta object literal for the '{@link DataArch.impl.WordFileImpl <em>Word File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.WordFileImpl
		 * @see DataArch.impl.DataArchPackageImpl#getWordFile()
		 * @generated
		 */
		EClass WORD_FILE = eINSTANCE.getWordFile();

		/**
		 * The meta object literal for the '{@link DataArch.impl.PDFFileImpl <em>PDF File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.PDFFileImpl
		 * @see DataArch.impl.DataArchPackageImpl#getPDFFile()
		 * @generated
		 */
		EClass PDF_FILE = eINSTANCE.getPDFFile();

		/**
		 * The meta object literal for the '{@link DataArch.impl.TextFileImpl <em>Text File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.TextFileImpl
		 * @see DataArch.impl.DataArchPackageImpl#getTextFile()
		 * @generated
		 */
		EClass TEXT_FILE = eINSTANCE.getTextFile();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SensorDataImpl <em>Sensor Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SensorDataImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSensorData()
		 * @generated
		 */
		EClass SENSOR_DATA = eINSTANCE.getSensorData();

		/**
		 * The meta object literal for the '<em><b>Physicalsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__PHYSICALSIZE = eINSTANCE.getSensorData_Physicalsize();

		/**
		 * The meta object literal for the '<em><b>Measuring Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__MEASURING_RANGE = eINSTANCE.getSensorData_MeasuringRange();

		/**
		 * The meta object literal for the '<em><b>Sensivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__SENSIVITY = eINSTANCE.getSensorData_Sensivity();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__RESOLUTION = eINSTANCE.getSensorData_Resolution();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__PRECISION = eINSTANCE.getSensorData_Precision();

		/**
		 * The meta object literal for the '<em><b>Reproducibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__REPRODUCIBILITY = eINSTANCE.getSensorData_Reproducibility();

		/**
		 * The meta object literal for the '<em><b>Linearity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__LINEARITY = eINSTANCE.getSensorData_Linearity();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__RESPONSE_TIME = eINSTANCE.getSensorData_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__BANDWIDTH = eINSTANCE.getSensorData_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Hystersis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__HYSTERSIS = eINSTANCE.getSensorData_Hystersis();

		/**
		 * The meta object literal for the '<em><b>Temperature Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_DATA__TEMPERATURE_RANGE = eINSTANCE.getSensorData_TemperatureRange();

		/**
		 * The meta object literal for the '{@link DataArch.impl.DocumentOrientedImpl <em>Document Oriented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.DocumentOrientedImpl
		 * @see DataArch.impl.DataArchPackageImpl#getDocumentOriented()
		 * @generated
		 */
		EClass DOCUMENT_ORIENTED = eINSTANCE.getDocumentOriented();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ColumnOrientedImpl <em>Column Oriented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ColumnOrientedImpl
		 * @see DataArch.impl.DataArchPackageImpl#getColumnOriented()
		 * @generated
		 */
		EClass COLUMN_ORIENTED = eINSTANCE.getColumnOriented();

		/**
		 * The meta object literal for the '{@link DataArch.impl.GraphsDatabaseImpl <em>Graphs Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.GraphsDatabaseImpl
		 * @see DataArch.impl.DataArchPackageImpl#getGraphsDatabase()
		 * @generated
		 */
		EClass GRAPHS_DATABASE = eINSTANCE.getGraphsDatabase();

		/**
		 * The meta object literal for the '{@link DataArch.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.KeyValueImpl
		 * @see DataArch.impl.DataArchPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '{@link DataArch.impl.RetrieveImpl <em>Retrieve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.RetrieveImpl
		 * @see DataArch.impl.DataArchPackageImpl#getRetrieve()
		 * @generated
		 */
		EClass RETRIEVE = eINSTANCE.getRetrieve();

		/**
		 * The meta object literal for the '{@link DataArch.impl.SaveImpl <em>Save</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.SaveImpl
		 * @see DataArch.impl.DataArchPackageImpl#getSave()
		 * @generated
		 */
		EClass SAVE = eINSTANCE.getSave();

		/**
		 * The meta object literal for the '{@link DataArch.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.ArchiveImpl
		 * @see DataArch.impl.DataArchPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '{@link DataArch.impl.GovernImpl <em>Govern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataArch.impl.GovernImpl
		 * @see DataArch.impl.DataArchPackageImpl#getGovern()
		 * @generated
		 */
		EClass GOVERN = eINSTANCE.getGovern();

	}

} //DataArchPackage
