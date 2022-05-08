/**
 */
package DataArch.impl;

import DataArch.BehaviouralElement;
import DataArch.Connection;
import DataArch.DataArchPackage;
import DataArch.DataNode;
import DataArch.MessagePort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.DataNodeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link DataArch.impl.DataNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link DataArch.impl.DataNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link DataArch.impl.DataNodeImpl#getBehaviouralElements <em>Behavioural Elements</em>}</li>
 *   <li>{@link DataArch.impl.DataNodeImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataNodeImpl extends EObjectImpl implements DataNode {
	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incoming;

	/**
	 * The cached value of the '{@link #getBehaviouralElements() <em>Behavioural Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviouralElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviouralElement> behaviouralElements;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MessagePort> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.DATA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeName(String newNodeName) {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.DATA_NODE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Connection>(Connection.class, this, DataArchPackage.DATA_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Connection>(Connection.class, this, DataArchPackage.DATA_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviouralElement> getBehaviouralElements() {
		if (behaviouralElements == null) {
			behaviouralElements = new EObjectContainmentEList<BehaviouralElement>(BehaviouralElement.class, this, DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS);
		}
		return behaviouralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessagePort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<MessagePort>(MessagePort.class, this, DataArchPackage.DATA_NODE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
				return ((InternalEList<?>)getBehaviouralElements()).basicRemove(otherEnd, msgs);
			case DataArchPackage.DATA_NODE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.DATA_NODE__NODE_NAME:
				return getNodeName();
			case DataArchPackage.DATA_NODE__OUTGOING:
				return getOutgoing();
			case DataArchPackage.DATA_NODE__INCOMING:
				return getIncoming();
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
				return getBehaviouralElements();
			case DataArchPackage.DATA_NODE__PORTS:
				return getPorts();
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
			case DataArchPackage.DATA_NODE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case DataArchPackage.DATA_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Connection>)newValue);
				return;
			case DataArchPackage.DATA_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Connection>)newValue);
				return;
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
				getBehaviouralElements().clear();
				getBehaviouralElements().addAll((Collection<? extends BehaviouralElement>)newValue);
				return;
			case DataArchPackage.DATA_NODE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends MessagePort>)newValue);
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
			case DataArchPackage.DATA_NODE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case DataArchPackage.DATA_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case DataArchPackage.DATA_NODE__INCOMING:
				getIncoming().clear();
				return;
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
				getBehaviouralElements().clear();
				return;
			case DataArchPackage.DATA_NODE__PORTS:
				getPorts().clear();
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
			case DataArchPackage.DATA_NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case DataArchPackage.DATA_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case DataArchPackage.DATA_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case DataArchPackage.DATA_NODE__BEHAVIOURAL_ELEMENTS:
				return behaviouralElements != null && !behaviouralElements.isEmpty();
			case DataArchPackage.DATA_NODE__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NodeName: ");
		result.append(nodeName);
		result.append(')');
		return result.toString();
	}

} //DataNodeImpl
