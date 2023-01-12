/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.Metrics;
import DataArch.QualityMetrices;
import DataArch.VerifyData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verify Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.VerifyDataImpl#getQualityMetrics <em>Quality Metrics</em>}</li>
 *   <li>{@link DataArch.impl.VerifyDataImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerifyDataImpl extends ActionImpl implements VerifyData {
	/**
	 * The cached value of the '{@link #getQualityMetrics() <em>Quality Metrics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metrics> qualityMetrics;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifyDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.VERIFY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metrics> getQualityMetrics() {
		if (qualityMetrics == null) {
			qualityMetrics = new EDataTypeUniqueEList<Metrics>(Metrics.class, this, DataArchPackage.VERIFY_DATA__QUALITY_METRICS);
		}
		return qualityMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.VERIFY_DATA__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.VERIFY_DATA__QUALITY_METRICS:
				return getQualityMetrics();
			case DataArchPackage.VERIFY_DATA__DESC:
				return getDesc();
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
			case DataArchPackage.VERIFY_DATA__QUALITY_METRICS:
				getQualityMetrics().clear();
				getQualityMetrics().addAll((Collection<? extends Metrics>)newValue);
				return;
			case DataArchPackage.VERIFY_DATA__DESC:
				setDesc((String)newValue);
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
			case DataArchPackage.VERIFY_DATA__QUALITY_METRICS:
				getQualityMetrics().clear();
				return;
			case DataArchPackage.VERIFY_DATA__DESC:
				setDesc(DESC_EDEFAULT);
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
			case DataArchPackage.VERIFY_DATA__QUALITY_METRICS:
				return qualityMetrics != null && !qualityMetrics.isEmpty();
			case DataArchPackage.VERIFY_DATA__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
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
		result.append(" (QualityMetrics: ");
		result.append(qualityMetrics);
		result.append(", desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //VerifyDataImpl
