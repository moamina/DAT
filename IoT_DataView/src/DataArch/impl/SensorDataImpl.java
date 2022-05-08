/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.SensorData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.SensorDataImpl#getPhysicalsize <em>Physicalsize</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getMeasuringRange <em>Measuring Range</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getSensivity <em>Sensivity</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getReproducibility <em>Reproducibility</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getLinearity <em>Linearity</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getHystersis <em>Hystersis</em>}</li>
 *   <li>{@link DataArch.impl.SensorDataImpl#getTemperatureRange <em>Temperature Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorDataImpl extends UnStructuredDataImpl implements SensorData {
	/**
	 * The default value of the '{@link #getPhysicalsize() <em>Physicalsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalsize()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICALSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalsize() <em>Physicalsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalsize()
	 * @generated
	 * @ordered
	 */
	protected String physicalsize = PHYSICALSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasuringRange() <em>Measuring Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuringRange()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURING_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasuringRange() <em>Measuring Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuringRange()
	 * @generated
	 * @ordered
	 */
	protected String measuringRange = MEASURING_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensivity() <em>Sensivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensivity()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensivity() <em>Sensivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensivity()
	 * @generated
	 * @ordered
	 */
	protected String sensivity = SENSIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected String precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReproducibility() <em>Reproducibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducibility()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRODUCIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReproducibility() <em>Reproducibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReproducibility()
	 * @generated
	 * @ordered
	 */
	protected String reproducibility = REPRODUCIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearity() <em>Linearity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearity()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearity() <em>Linearity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearity()
	 * @generated
	 * @ordered
	 */
	protected String linearity = LINEARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected String responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BANDWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected String bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHystersis() <em>Hystersis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHystersis()
	 * @generated
	 * @ordered
	 */
	protected static final String HYSTERSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHystersis() <em>Hystersis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHystersis()
	 * @generated
	 * @ordered
	 */
	protected String hystersis = HYSTERSIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureRange() <em>Temperature Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureRange()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperatureRange() <em>Temperature Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureRange()
	 * @generated
	 * @ordered
	 */
	protected String temperatureRange = TEMPERATURE_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.SENSOR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalsize() {
		return physicalsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalsize(String newPhysicalsize) {
		String oldPhysicalsize = physicalsize;
		physicalsize = newPhysicalsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__PHYSICALSIZE, oldPhysicalsize, physicalsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeasuringRange() {
		return measuringRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasuringRange(String newMeasuringRange) {
		String oldMeasuringRange = measuringRange;
		measuringRange = newMeasuringRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__MEASURING_RANGE, oldMeasuringRange, measuringRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensivity() {
		return sensivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensivity(String newSensivity) {
		String oldSensivity = sensivity;
		sensivity = newSensivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__SENSIVITY, oldSensivity, sensivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(String newPrecision) {
		String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReproducibility() {
		return reproducibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReproducibility(String newReproducibility) {
		String oldReproducibility = reproducibility;
		reproducibility = newReproducibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__REPRODUCIBILITY, oldReproducibility, reproducibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinearity() {
		return linearity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearity(String newLinearity) {
		String oldLinearity = linearity;
		linearity = newLinearity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__LINEARITY, oldLinearity, linearity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTime(String newResponseTime) {
		String oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBandwidth(String newBandwidth) {
		String oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__BANDWIDTH, oldBandwidth, bandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHystersis() {
		return hystersis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHystersis(String newHystersis) {
		String oldHystersis = hystersis;
		hystersis = newHystersis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__HYSTERSIS, oldHystersis, hystersis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemperatureRange() {
		return temperatureRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureRange(String newTemperatureRange) {
		String oldTemperatureRange = temperatureRange;
		temperatureRange = newTemperatureRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.SENSOR_DATA__TEMPERATURE_RANGE, oldTemperatureRange, temperatureRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.SENSOR_DATA__PHYSICALSIZE:
				return getPhysicalsize();
			case DataArchPackage.SENSOR_DATA__MEASURING_RANGE:
				return getMeasuringRange();
			case DataArchPackage.SENSOR_DATA__SENSIVITY:
				return getSensivity();
			case DataArchPackage.SENSOR_DATA__RESOLUTION:
				return getResolution();
			case DataArchPackage.SENSOR_DATA__PRECISION:
				return getPrecision();
			case DataArchPackage.SENSOR_DATA__REPRODUCIBILITY:
				return getReproducibility();
			case DataArchPackage.SENSOR_DATA__LINEARITY:
				return getLinearity();
			case DataArchPackage.SENSOR_DATA__RESPONSE_TIME:
				return getResponseTime();
			case DataArchPackage.SENSOR_DATA__BANDWIDTH:
				return getBandwidth();
			case DataArchPackage.SENSOR_DATA__HYSTERSIS:
				return getHystersis();
			case DataArchPackage.SENSOR_DATA__TEMPERATURE_RANGE:
				return getTemperatureRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataArchPackage.SENSOR_DATA__PHYSICALSIZE:
				setPhysicalsize((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__MEASURING_RANGE:
				setMeasuringRange((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__SENSIVITY:
				setSensivity((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__RESOLUTION:
				setResolution((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__PRECISION:
				setPrecision((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__REPRODUCIBILITY:
				setReproducibility((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__LINEARITY:
				setLinearity((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__RESPONSE_TIME:
				setResponseTime((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__BANDWIDTH:
				setBandwidth((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__HYSTERSIS:
				setHystersis((String)newValue);
				return;
			case DataArchPackage.SENSOR_DATA__TEMPERATURE_RANGE:
				setTemperatureRange((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataArchPackage.SENSOR_DATA__PHYSICALSIZE:
				setPhysicalsize(PHYSICALSIZE_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__MEASURING_RANGE:
				setMeasuringRange(MEASURING_RANGE_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__SENSIVITY:
				setSensivity(SENSIVITY_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__REPRODUCIBILITY:
				setReproducibility(REPRODUCIBILITY_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__LINEARITY:
				setLinearity(LINEARITY_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__HYSTERSIS:
				setHystersis(HYSTERSIS_EDEFAULT);
				return;
			case DataArchPackage.SENSOR_DATA__TEMPERATURE_RANGE:
				setTemperatureRange(TEMPERATURE_RANGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataArchPackage.SENSOR_DATA__PHYSICALSIZE:
				return PHYSICALSIZE_EDEFAULT == null ? physicalsize != null : !PHYSICALSIZE_EDEFAULT.equals(physicalsize);
			case DataArchPackage.SENSOR_DATA__MEASURING_RANGE:
				return MEASURING_RANGE_EDEFAULT == null ? measuringRange != null : !MEASURING_RANGE_EDEFAULT.equals(measuringRange);
			case DataArchPackage.SENSOR_DATA__SENSIVITY:
				return SENSIVITY_EDEFAULT == null ? sensivity != null : !SENSIVITY_EDEFAULT.equals(sensivity);
			case DataArchPackage.SENSOR_DATA__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case DataArchPackage.SENSOR_DATA__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case DataArchPackage.SENSOR_DATA__REPRODUCIBILITY:
				return REPRODUCIBILITY_EDEFAULT == null ? reproducibility != null : !REPRODUCIBILITY_EDEFAULT.equals(reproducibility);
			case DataArchPackage.SENSOR_DATA__LINEARITY:
				return LINEARITY_EDEFAULT == null ? linearity != null : !LINEARITY_EDEFAULT.equals(linearity);
			case DataArchPackage.SENSOR_DATA__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case DataArchPackage.SENSOR_DATA__BANDWIDTH:
				return BANDWIDTH_EDEFAULT == null ? bandwidth != null : !BANDWIDTH_EDEFAULT.equals(bandwidth);
			case DataArchPackage.SENSOR_DATA__HYSTERSIS:
				return HYSTERSIS_EDEFAULT == null ? hystersis != null : !HYSTERSIS_EDEFAULT.equals(hystersis);
			case DataArchPackage.SENSOR_DATA__TEMPERATURE_RANGE:
				return TEMPERATURE_RANGE_EDEFAULT == null ? temperatureRange != null : !TEMPERATURE_RANGE_EDEFAULT.equals(temperatureRange);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (physicalsize: ");
		result.append(physicalsize);
		result.append(", measuringRange: ");
		result.append(measuringRange);
		result.append(", sensivity: ");
		result.append(sensivity);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", precision: ");
		result.append(precision);
		result.append(", reproducibility: ");
		result.append(reproducibility);
		result.append(", linearity: ");
		result.append(linearity);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", Bandwidth: ");
		result.append(bandwidth);
		result.append(", hystersis: ");
		result.append(hystersis);
		result.append(", temperatureRange: ");
		result.append(temperatureRange);
		result.append(')');
		return result.toString();
	}

} //SensorDataImpl
