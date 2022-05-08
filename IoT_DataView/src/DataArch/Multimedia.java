/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multimedia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.Multimedia#getId_Multi <em>Id Multi</em>}</li>
 *   <li>{@link DataArch.Multimedia#getSize <em>Size</em>}</li>
 *   <li>{@link DataArch.Multimedia#getComment <em>Comment</em>}</li>
 *   <li>{@link DataArch.Multimedia#getLength <em>Length</em>}</li>
 *   <li>{@link DataArch.Multimedia#getFormat <em>Format</em>}</li>
 *   <li>{@link DataArch.Multimedia#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getMultimedia()
 * @model abstract="true"
 * @generated
 */
public interface Multimedia extends UnStructuredData {
	/**
	 * Returns the value of the '<em><b>Id Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Multi</em>' attribute.
	 * @see #setId_Multi(int)
	 * @see DataArch.DataArchPackage#getMultimedia_Id_Multi()
	 * @model
	 * @generated
	 */
	int getId_Multi();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getId_Multi <em>Id Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Multi</em>' attribute.
	 * @see #getId_Multi()
	 * @generated
	 */
	void setId_Multi(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see DataArch.DataArchPackage#getMultimedia_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see DataArch.DataArchPackage#getMultimedia_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see DataArch.DataArchPackage#getMultimedia_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see DataArch.DataArchPackage#getMultimedia_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see DataArch.DataArchPackage#getMultimedia_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link DataArch.Multimedia#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Multimedia
