/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.OfficeFile#getText <em>Text</em>}</li>
 *   <li>{@link DataArch.OfficeFile#getFont <em>Font</em>}</li>
 *   <li>{@link DataArch.OfficeFile#getTextsize <em>Textsize</em>}</li>
 *   <li>{@link DataArch.OfficeFile#getColor <em>Color</em>}</li>
 *   <li>{@link DataArch.OfficeFile#isBold <em>Bold</em>}</li>
 *   <li>{@link DataArch.OfficeFile#isItalics <em>Italics</em>}</li>
 *   <li>{@link DataArch.OfficeFile#isUnderline <em>Underline</em>}</li>
 *   <li>{@link DataArch.OfficeFile#getUrl <em>Url</em>}</li>
 *   <li>{@link DataArch.OfficeFile#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getOfficeFile()
 * @model abstract="true"
 * @generated
 */
public interface OfficeFile extends UnStructuredData {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see DataArch.DataArchPackage#getOfficeFile_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see DataArch.DataArchPackage#getOfficeFile_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textsize</em>' attribute.
	 * @see #setTextsize(String)
	 * @see DataArch.DataArchPackage#getOfficeFile_Textsize()
	 * @model
	 * @generated
	 */
	String getTextsize();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getTextsize <em>Textsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textsize</em>' attribute.
	 * @see #getTextsize()
	 * @generated
	 */
	void setTextsize(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see DataArch.DataArchPackage#getOfficeFile_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see DataArch.DataArchPackage#getOfficeFile_Bold()
	 * @model
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italics</em>' attribute.
	 * @see #setItalics(boolean)
	 * @see DataArch.DataArchPackage#getOfficeFile_Italics()
	 * @model
	 * @generated
	 */
	boolean isItalics();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#isItalics <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italics</em>' attribute.
	 * @see #isItalics()
	 * @generated
	 */
	void setItalics(boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see DataArch.DataArchPackage#getOfficeFile_Underline()
	 * @model
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see DataArch.DataArchPackage#getOfficeFile_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see DataArch.DataArchPackage#getOfficeFile_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link DataArch.OfficeFile#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // OfficeFile
