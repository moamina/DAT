/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.SendData#getToMessagePorts <em>To Message Ports</em>}</li>
 *   <li>{@link DataArch.SendData#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getSendData()
 * @model annotation="gmf.node figure='iot_DataView.figures.SendDataFigure' label.placement='external' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/SendData.gif' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/SendData.gif'"
 * @generated
 */
public interface SendData extends Action {
	/**
	 * Returns the value of the '<em><b>To Message Ports</b></em>' reference list.
	 * The list contents are of type {@link DataArch.OutMessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Message Ports</em>' reference list.
	 * @see DataArch.DataArchPackage#getSendData_ToMessagePorts()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='none' style='dot' tool.name='Send Data Link'"
	 * @generated
	 */
	EList<OutMessagePort> getToMessagePorts();

	/**
	 * Returns the value of the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Recipient</em>' reference.
	 * @see #setDataRecipient(DataRepresentation)
	 * @see DataArch.DataArchPackage#getSendData_DataRecipient()
	 * @model
	 * @generated
	 */
	DataRepresentation getDataRecipient();

	/**
	 * Sets the value of the '{@link DataArch.SendData#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataRepresentation value);

} // SendData
