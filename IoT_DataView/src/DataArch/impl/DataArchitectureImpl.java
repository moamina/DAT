/**
 */
package DataArch.impl;

import DataArch.Connection;
import DataArch.DataArchPackage;
import DataArch.DataArchitecture;
import DataArch.DataNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.DataArchitectureImpl#getDataNodes <em>Data Nodes</em>}</li>
 *   <li>{@link DataArch.impl.DataArchitectureImpl#getDataConnection <em>Data Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataArchitectureImpl extends EObjectImpl implements DataArchitecture {
	/**
	 * The cached value of the '{@link #getDataNodes() <em>Data Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataNode> dataNodes;

	/**
	 * The cached value of the '{@link #getDataConnection() <em>Data Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> dataConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.DATA_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataNode> getDataNodes() {
		if (dataNodes == null) {
			dataNodes = new EObjectContainmentEList<DataNode>(DataNode.class, this, DataArchPackage.DATA_ARCHITECTURE__DATA_NODES);
		}
		return dataNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getDataConnection() {
		if (dataConnection == null) {
			dataConnection = new EObjectContainmentEList<Connection>(Connection.class, this, DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION);
		}
		return dataConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataArchPackage.DATA_ARCHITECTURE__DATA_NODES:
				return ((InternalEList<?>)getDataNodes()).basicRemove(otherEnd, msgs);
			case DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION:
				return ((InternalEList<?>)getDataConnection()).basicRemove(otherEnd, msgs);
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
			case DataArchPackage.DATA_ARCHITECTURE__DATA_NODES:
				return getDataNodes();
			case DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION:
				return getDataConnection();
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
			case DataArchPackage.DATA_ARCHITECTURE__DATA_NODES:
				getDataNodes().clear();
				getDataNodes().addAll((Collection<? extends DataNode>)newValue);
				return;
			case DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION:
				getDataConnection().clear();
				getDataConnection().addAll((Collection<? extends Connection>)newValue);
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
			case DataArchPackage.DATA_ARCHITECTURE__DATA_NODES:
				getDataNodes().clear();
				return;
			case DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION:
				getDataConnection().clear();
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
			case DataArchPackage.DATA_ARCHITECTURE__DATA_NODES:
				return dataNodes != null && !dataNodes.isEmpty();
			case DataArchPackage.DATA_ARCHITECTURE__DATA_CONNECTION:
				return dataConnection != null && !dataConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataArchitectureImpl
