/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.Link#getSource <em>Source</em>}</li>
 *   <li>{@link DataArch.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getLink()
 * @model annotation="gmf.link source='source' color='0,0,0' target='target' target.decoration='arrow' style='solid' tool.name='Data Element Link'"
 * @generated
 */
public interface Link extends BehaviouralElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DataArch.LinkableElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LinkableElement)
	 * @see DataArch.DataArchPackage#getLink_Source()
	 * @see DataArch.LinkableElement#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	LinkableElement getSource();

	/**
	 * Sets the value of the '{@link DataArch.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LinkableElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DataArch.Action#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Action)
	 * @see DataArch.DataArchPackage#getLink_Target()
	 * @see DataArch.Action#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Action getTarget();

	/**
	 * Sets the value of the '{@link DataArch.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Action value);

} // Link
