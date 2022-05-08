/**
 */
package DataArch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.Connection#getText <em>Text</em>}</li>
 *   <li>{@link DataArch.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link DataArch.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getConnection()
 * @model annotation="gmf.link label='text' source='source' target='target' target.decoration='arrow' style='solid' tool.name='Data Node Link' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/Connection.gif' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/Connection.gif'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see DataArch.DataArchPackage#getConnection_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link DataArch.Connection#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutMessagePort)
	 * @see DataArch.DataArchPackage#getConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	OutMessagePort getSource();

	/**
	 * Sets the value of the '{@link DataArch.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutMessagePort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InMessagePort)
	 * @see DataArch.DataArchPackage#getConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	InMessagePort getTarget();

	/**
	 * Sets the value of the '{@link DataArch.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InMessagePort value);

} // Connection
