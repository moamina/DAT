/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.DataNode#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link DataArch.DataNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link DataArch.DataNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link DataArch.DataNode#getBehaviouralElements <em>Behavioural Elements</em>}</li>
 *   <li>{@link DataArch.DataNode#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getDataNode()
 * @model annotation="gmf.node label='NodeName' label.icon='true' border.color='0,0,0' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/datanode.png' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/datanode.gif'"
 * @generated
 */
public interface DataNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see DataArch.DataArchPackage#getDataNode_NodeName()
	 * @model
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link DataArch.DataNode#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link DataArch.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see DataArch.DataArchPackage#getDataNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Connection> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link DataArch.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see DataArch.DataArchPackage#getDataNode_Incoming()
	 * @model
	 * @generated
	 */
	EList<Connection> getIncoming();

	/**
	 * Returns the value of the '<em><b>Behavioural Elements</b></em>' containment reference list.
	 * The list contents are of type {@link DataArch.BehaviouralElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioural Elements</em>' containment reference list.
	 * @see DataArch.DataArchPackage#getDataNode_BehaviouralElements()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<BehaviouralElement> getBehaviouralElements();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link DataArch.MessagePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see DataArch.DataArchPackage#getDataNode_Ports()
	 * @model containment="true"
	 *        annotation="gmf.affixed"
	 * @generated
	 */
	EList<MessagePort> getPorts();

} // DataNode
