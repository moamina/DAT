/**
 */
package DataArch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Metrices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.QualityMetrices#getDesc <em>Desc</em>}</li>
 *   <li>{@link DataArch.QualityMetrices#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getQualityMetrices()
 * @model
 * @generated
 */
public interface QualityMetrices extends EObject {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see DataArch.DataArchPackage#getQualityMetrices_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link DataArch.QualityMetrices#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link DataArch.Metrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see DataArch.Metrics
	 * @see #setType(Metrics)
	 * @see DataArch.DataArchPackage#getQualityMetrices_Type()
	 * @model
	 * @generated
	 */
	Metrics getType();

	/**
	 * Sets the value of the '{@link DataArch.QualityMetrices#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see DataArch.Metrics
	 * @see #getType()
	 * @generated
	 */
	void setType(Metrics value);

} // QualityMetrices
