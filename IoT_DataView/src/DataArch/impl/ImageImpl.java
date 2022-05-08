/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.Image;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.ImageImpl#getNumberColor <em>Number Color</em>}</li>
 *   <li>{@link DataArch.impl.ImageImpl#isTransparency <em>Transparency</em>}</li>
 *   <li>{@link DataArch.impl.ImageImpl#isAnimation <em>Animation</em>}</li>
 *   <li>{@link DataArch.impl.ImageImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends MultimediaImpl implements Image {
	/**
	 * The default value of the '{@link #getNumberColor() <em>Number Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColor()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberColor() <em>Number Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColor()
	 * @generated
	 * @ordered
	 */
	protected int numberColor = NUMBER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPARENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransparency()
	 * @generated
	 * @ordered
	 */
	protected boolean transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnimation() <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnimation() <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimation()
	 * @generated
	 * @ordered
	 */
	protected boolean animation = ANIMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberColor() {
		return numberColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberColor(int newNumberColor) {
		int oldNumberColor = numberColor;
		numberColor = newNumberColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.IMAGE__NUMBER_COLOR, oldNumberColor, numberColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransparency(boolean newTransparency) {
		boolean oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.IMAGE__TRANSPARENCY, oldTransparency, transparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnimation() {
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnimation(boolean newAnimation) {
		boolean oldAnimation = animation;
		animation = newAnimation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.IMAGE__ANIMATION, oldAnimation, animation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(String newTimestamp) {
		String oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.IMAGE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.IMAGE__NUMBER_COLOR:
				return getNumberColor();
			case DataArchPackage.IMAGE__TRANSPARENCY:
				return isTransparency();
			case DataArchPackage.IMAGE__ANIMATION:
				return isAnimation();
			case DataArchPackage.IMAGE__TIMESTAMP:
				return getTimestamp();
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
			case DataArchPackage.IMAGE__NUMBER_COLOR:
				setNumberColor((Integer)newValue);
				return;
			case DataArchPackage.IMAGE__TRANSPARENCY:
				setTransparency((Boolean)newValue);
				return;
			case DataArchPackage.IMAGE__ANIMATION:
				setAnimation((Boolean)newValue);
				return;
			case DataArchPackage.IMAGE__TIMESTAMP:
				setTimestamp((String)newValue);
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
			case DataArchPackage.IMAGE__NUMBER_COLOR:
				setNumberColor(NUMBER_COLOR_EDEFAULT);
				return;
			case DataArchPackage.IMAGE__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case DataArchPackage.IMAGE__ANIMATION:
				setAnimation(ANIMATION_EDEFAULT);
				return;
			case DataArchPackage.IMAGE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case DataArchPackage.IMAGE__NUMBER_COLOR:
				return numberColor != NUMBER_COLOR_EDEFAULT;
			case DataArchPackage.IMAGE__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case DataArchPackage.IMAGE__ANIMATION:
				return animation != ANIMATION_EDEFAULT;
			case DataArchPackage.IMAGE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (numberColor: ");
		result.append(numberColor);
		result.append(", transparency: ");
		result.append(transparency);
		result.append(", animation: ");
		result.append(animation);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
