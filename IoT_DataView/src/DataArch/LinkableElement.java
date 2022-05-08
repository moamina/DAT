/**
 */
package DataArch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.LinkableElement#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getLinkableElement()
 * @model abstract="true"
 * @generated
 */
public interface LinkableElement extends BehaviouralElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link DataArch.Link}.
	 * It is bidirectional and its opposite is '{@link DataArch.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see DataArch.DataArchPackage#getLinkableElement_Outgoing()
	 * @see DataArch.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoing();

} // LinkableElement
