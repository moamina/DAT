/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.GPSData#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link DataArch.GPSData#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link DataArch.GPSData#getPosition <em>Position</em>}</li>
 *   <li>{@link DataArch.GPSData#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link DataArch.GPSData#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getGPSData()
 * @model annotation="gmf.node label='name' figure='iot_DataView.figures.GPSDataFigure' label.placement='external' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/gps.gif' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/gps.gif'"
 * @generated
 */
public interface GPSData extends UnStructuredData {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(String)
	 * @see DataArch.DataArchPackage#getGPSData_Latitude()
	 * @model
	 * @generated
	 */
	String getLatitude();

	/**
	 * Sets the value of the '{@link DataArch.GPSData#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(String)
	 * @see DataArch.DataArchPackage#getGPSData_Longitude()
	 * @model
	 * @generated
	 */
	String getLongitude();

	/**
	 * Sets the value of the '{@link DataArch.GPSData#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see DataArch.DataArchPackage#getGPSData_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link DataArch.GPSData#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(String)
	 * @see DataArch.DataArchPackage#getGPSData_Altitude()
	 * @model
	 * @generated
	 */
	String getAltitude();

	/**
	 * Sets the value of the '{@link DataArch.GPSData#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see DataArch.DataArchPackage#getGPSData_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link DataArch.GPSData#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

} // GPSData
