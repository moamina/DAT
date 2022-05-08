/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.Image#getNumberColor <em>Number Color</em>}</li>
 *   <li>{@link DataArch.Image#isTransparency <em>Transparency</em>}</li>
 *   <li>{@link DataArch.Image#isAnimation <em>Animation</em>}</li>
 *   <li>{@link DataArch.Image#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getImage()
 * @model annotation="gmf.node label='name' figure='iot_DataView.figures.ImageFormatFigure' label.placement='external' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/image.gif' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/image.gif'"
 * @generated
 */
public interface Image extends Multimedia {
	/**
	 * Returns the value of the '<em><b>Number Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Color</em>' attribute.
	 * @see #setNumberColor(int)
	 * @see DataArch.DataArchPackage#getImage_NumberColor()
	 * @model
	 * @generated
	 */
	int getNumberColor();

	/**
	 * Sets the value of the '{@link DataArch.Image#getNumberColor <em>Number Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Color</em>' attribute.
	 * @see #getNumberColor()
	 * @generated
	 */
	void setNumberColor(int value);

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(boolean)
	 * @see DataArch.DataArchPackage#getImage_Transparency()
	 * @model
	 * @generated
	 */
	boolean isTransparency();

	/**
	 * Sets the value of the '{@link DataArch.Image#isTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #isTransparency()
	 * @generated
	 */
	void setTransparency(boolean value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' attribute.
	 * @see #setAnimation(boolean)
	 * @see DataArch.DataArchPackage#getImage_Animation()
	 * @model
	 * @generated
	 */
	boolean isAnimation();

	/**
	 * Sets the value of the '{@link DataArch.Image#isAnimation <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' attribute.
	 * @see #isAnimation()
	 * @generated
	 */
	void setAnimation(boolean value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see DataArch.DataArchPackage#getImage_Timestamp()
	 * @model
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link DataArch.Image#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

} // Image
