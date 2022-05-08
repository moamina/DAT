/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.ReceiveData#getFromMessagePorts <em>From Message Ports</em>}</li>
 *   <li>{@link DataArch.ReceiveData#getDataRecipient <em>Data Recipient</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getReceiveData()
 * @model annotation="gmf.node label='name' figure='iot_DataView.figures.ReceiveDataFigure' label.placement='external' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/ReceiveData.gif' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/ReceiveData.gif'"
 * @generated
 */
public interface ReceiveData extends Event {
	/**
	 * Returns the value of the '<em><b>From Message Ports</b></em>' reference list.
	 * The list contents are of type {@link DataArch.InMessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Message Ports</em>' reference list.
	 * @see DataArch.DataArchPackage#getReceiveData_FromMessagePorts()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='none' style='dot' tool.name='Receive Data Link'"
	 * @generated
	 */
	EList<InMessagePort> getFromMessagePorts();

	/**
	 * Returns the value of the '<em><b>Data Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Recipient</em>' reference.
	 * @see #setDataRecipient(DataRepresentation)
	 * @see DataArch.DataArchPackage#getReceiveData_DataRecipient()
	 * @model
	 * @generated
	 */
	DataRepresentation getDataRecipient();

	/**
	 * Sets the value of the '{@link DataArch.ReceiveData#getDataRecipient <em>Data Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Recipient</em>' reference.
	 * @see #getDataRecipient()
	 * @generated
	 */
	void setDataRecipient(DataRepresentation value);

} // ReceiveData
