/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.VerifyData#getQualityMetrics <em>Quality Metrics</em>}</li>
 *   <li>{@link DataArch.VerifyData#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getVerifyData()
 * @model annotation="gmf.node figure='iot_DataView.figures.VerifyData' label.placement='external' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/dataquality.gif' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/dataquality.gif'"
 * @generated
 */
public interface VerifyData extends Action {
	/**
	 * Returns the value of the '<em><b>Quality Metrics</b></em>' attribute list.
	 * The list contents are of type {@link DataArch.Metrics}.
	 * The literals are from the enumeration {@link DataArch.Metrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Metrics</em>' attribute list.
	 * @see DataArch.Metrics
	 * @see DataArch.DataArchPackage#getVerifyData_QualityMetrics()
	 * @model lower="6" upper="6"
	 * @generated
	 */
	EList<Metrics> getQualityMetrics();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see DataArch.DataArchPackage#getVerifyData_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link DataArch.VerifyData#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // VerifyData
