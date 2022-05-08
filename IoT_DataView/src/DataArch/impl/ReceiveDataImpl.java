/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.DataRepresentation;
import DataArch.InMessagePort;
import DataArch.ReceiveData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.ReceiveDataImpl#getFromMessagePorts <em>From Message Ports</em>}</li>
 *   <li>{@link DataArch.impl.ReceiveDataImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveDataImpl extends EventImpl implements ReceiveData {
	/**
	 * The cached value of the '{@link #getFromMessagePorts() <em>From Message Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InMessagePort> fromMessagePorts;

	/**
	 * The cached value of the '{@link #getDataRecipient() <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRecipient()
	 * @generated
	 * @ordered
	 */
	protected DataRepresentation dataRecipient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.RECEIVE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InMessagePort> getFromMessagePorts() {
		if (fromMessagePorts == null) {
			fromMessagePorts = new EObjectResolvingEList<InMessagePort>(InMessagePort.class, this, DataArchPackage.RECEIVE_DATA__FROM_MESSAGE_PORTS);
		}
		return fromMessagePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRepresentation getDataRecipient() {
		if (dataRecipient != null && dataRecipient.eIsProxy()) {
			InternalEObject oldDataRecipient = (InternalEObject)dataRecipient;
			dataRecipient = (DataRepresentation)eResolveProxy(oldDataRecipient);
			if (dataRecipient != oldDataRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
			}
		}
		return dataRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentation basicGetDataRecipient() {
		return dataRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRecipient(DataRepresentation newDataRecipient) {
		DataRepresentation oldDataRecipient = dataRecipient;
		dataRecipient = newDataRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.RECEIVE_DATA__FROM_MESSAGE_PORTS:
				return getFromMessagePorts();
			case DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT:
				if (resolve) return getDataRecipient();
				return basicGetDataRecipient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataArchPackage.RECEIVE_DATA__FROM_MESSAGE_PORTS:
				getFromMessagePorts().clear();
				getFromMessagePorts().addAll((Collection<? extends InMessagePort>)newValue);
				return;
			case DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT:
				setDataRecipient((DataRepresentation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataArchPackage.RECEIVE_DATA__FROM_MESSAGE_PORTS:
				getFromMessagePorts().clear();
				return;
			case DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT:
				setDataRecipient((DataRepresentation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataArchPackage.RECEIVE_DATA__FROM_MESSAGE_PORTS:
				return fromMessagePorts != null && !fromMessagePorts.isEmpty();
			case DataArchPackage.RECEIVE_DATA__DATA_RECIPIENT:
				return dataRecipient != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveDataImpl
