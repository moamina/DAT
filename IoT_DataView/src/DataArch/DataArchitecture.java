/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.DataArchitecture#getDataNodes <em>Data Nodes</em>}</li>
 *   <li>{@link DataArch.DataArchitecture#getDataConnection <em>Data Connection</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getDataArchitecture()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface DataArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DataArch.DataNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nodes</em>' containment reference list.
	 * @see DataArch.DataArchPackage#getDataArchitecture_DataNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataNode> getDataNodes();

	/**
	 * Returns the value of the '<em><b>Data Connection</b></em>' containment reference list.
	 * The list contents are of type {@link DataArch.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Connection</em>' containment reference list.
	 * @see DataArch.DataArchPackage#getDataArchitecture_DataConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getDataConnection();

} // DataArchitecture
