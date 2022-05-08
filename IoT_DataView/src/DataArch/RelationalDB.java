/**
 */
package DataArch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataArch.RelationalDB#getDbName <em>Db Name</em>}</li>
 * </ul>
 *
 * @see DataArch.DataArchPackage#getRelationalDB()
 * @model annotation="gmf.node label='name' figure='iot_DataView.figures.RelationalDBFigure' label.placement='external' tool.large.bundle='IoT_DataView' tool.large.path='dataicons/basics/releationalFormat.gif' label.icon='false' size='48,48' tool.small.bundle='IoT_DataView' tool.small.path='dataicons/basics/releationalFormat.gif'"
 * @generated
 */
public interface RelationalDB extends StructuredData {
	/**
	 * Returns the value of the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Name</em>' attribute.
	 * @see #setDbName(String)
	 * @see DataArch.DataArchPackage#getRelationalDB_DbName()
	 * @model
	 * @generated
	 */
	String getDbName();

	/**
	 * Sets the value of the '{@link DataArch.RelationalDB#getDbName <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Name</em>' attribute.
	 * @see #getDbName()
	 * @generated
	 */
	void setDbName(String value);

} // RelationalDB
