/**
 */
package DataArch.provider;


import DataArch.DataArchFactory;
import DataArch.DataArchPackage;
import DataArch.DataNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link DataArch.DataNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataNodeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNodeNamePropertyDescriptor(object);
			addOutgoingPropertyDescriptor(object);
			addIncomingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataNode_NodeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataNode_NodeName_feature", "_UI_DataNode_type"),
				 DataArchPackage.Literals.DATA_NODE__NODE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataNode_outgoing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataNode_outgoing_feature", "_UI_DataNode_type"),
				 DataArchPackage.Literals.DATA_NODE__OUTGOING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataNode_incoming_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataNode_incoming_feature", "_UI_DataNode_type"),
				 DataArchPackage.Literals.DATA_NODE__INCOMING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS);
			childrenFeatures.add(DataArchPackage.Literals.DATA_NODE__PORTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataNode)object).getNodeName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataNode_type") :
			getString("_UI_DataNode_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataNode.class)) {
			case DataArchPackage.DATA_NODE__NODE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
			case DataArchPackage.DATA_NODE__PORTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createCloud()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createOn_Premise()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createFile_System()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createRelational()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createMultidimensional()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createRealTime()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createBatch()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createReceiveData()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createSendData()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createGenerate()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createIngest()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createAnalyze()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createVisualize()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createQuery_Report()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createAPI()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createTranfrom()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createCompress()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createIntegrate()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createIdentify()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createValidate()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createClassify()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createSort()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createMerge()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createAggregate()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createCleaning()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createReduceNoise()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createDescribe()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createDiagnose()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createPredict()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createPrescript()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createMath_Operation()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createRelationalDB()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createXML()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createJSON()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createCSV()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createExcel()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createHTML()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createRDF()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createEDI()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createSMS()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createAudio()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createVideo()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createGPSData()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createLogs()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createWordFile()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createPDFFile()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createSensorData()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createDocumentOriented()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createColumnOriented()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createGraphsDatabase()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createKeyValue()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createRetrieve()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createSave()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createArchive()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createGovern()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__BEHAVIOURAL_ELEMENTS,
				 DataArchFactory.eINSTANCE.createVerifyData()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__PORTS,
				 DataArchFactory.eINSTANCE.createInMessagePort()));

		newChildDescriptors.add
			(createChildParameter
				(DataArchPackage.Literals.DATA_NODE__PORTS,
				 DataArchFactory.eINSTANCE.createOutMessagePort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataArchEditPlugin.INSTANCE;
	}

}
