/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.DataRepresentation;
import DataArch.OutMessagePort;
import DataArch.SendData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.SendDataImpl#getToMessagePorts <em>To Message Ports</em>}</li>
 *   <li>{@link DataArch.impl.SendDataImpl#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendDataImpl extends ActionImpl implements SendData {
	/**
	 * The cached value of the '{@link #getToMessagePorts() <em>To Message Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutMessagePort> toMessagePorts;

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
	protected SendDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.SEND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutMessagePort> getToMessagePorts() {
		if (toMessagePorts == null) {
			toMessagePorts = new EObjectResolvingEList<OutMessagePort>(OutMessagePort.class, this, DataArchPackage.SEND_DATA__TO_MESSAGE_PORTS);
		}
		return toMessagePorts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataArchPackage.SEND_DATA__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SEND_DATA__DATA_RECIPIENT, oldDataRecipient, dataRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.SEND_DATA__TO_MESSAGE_PORTS:
				return getToMessagePorts();
			case DataArchPackage.SEND_DATA__DATA_RECIPIENT:
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
			case DataArchPackage.SEND_DATA__TO_MESSAGE_PORTS:
				getToMessagePorts().clear();
				getToMessagePorts().addAll((Collection<? extends OutMessagePort>)newValue);
				return;
			case DataArchPackage.SEND_DATA__DATA_RECIPIENT:
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
			case DataArchPackage.SEND_DATA__TO_MESSAGE_PORTS:
				getToMessagePorts().clear();
				return;
			case DataArchPackage.SEND_DATA__DATA_RECIPIENT:
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
			case DataArchPackage.SEND_DATA__TO_MESSAGE_PORTS:
				return toMessagePorts != null && !toMessagePorts.isEmpty();
			case DataArchPackage.SEND_DATA__DATA_RECIPIENT:
				return dataRecipient != null;
		}
		return super.eIsSet(featureID);
	}

} //SendDataImpl
