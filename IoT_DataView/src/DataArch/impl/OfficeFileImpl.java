/**
 */
package DataArch.impl;

import DataArch.DataArchPackage;
import DataArch.OfficeFile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Office File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getText <em>Text</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getFont <em>Font</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getTextsize <em>Textsize</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getColor <em>Color</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#isItalics <em>Italics</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link DataArch.impl.OfficeFileImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OfficeFileImpl extends UnStructuredDataImpl implements OfficeFile {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextsize() <em>Textsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextsize()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextsize() <em>Textsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextsize()
	 * @generated
	 * @ordered
	 */
	protected String textsize = TEXTSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalics() <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalics() <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalics()
	 * @generated
	 * @ordered
	 */
	protected boolean italics = ITALICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfficeFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataArchPackage.Literals.OFFICE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextsize() {
		return textsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextsize(String newTextsize) {
		String oldTextsize = textsize;
		textsize = newTextsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__TEXTSIZE, oldTextsize, textsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isItalics() {
		return italics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItalics(boolean newItalics) {
		boolean oldItalics = italics;
		italics = newItalics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__ITALICS, oldItalics, italics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__UNDERLINE, oldUnderline, underline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataArchPackage.OFFICE_FILE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataArchPackage.OFFICE_FILE__TEXT:
				return getText();
			case DataArchPackage.OFFICE_FILE__FONT:
				return getFont();
			case DataArchPackage.OFFICE_FILE__TEXTSIZE:
				return getTextsize();
			case DataArchPackage.OFFICE_FILE__COLOR:
				return getColor();
			case DataArchPackage.OFFICE_FILE__BOLD:
				return isBold();
			case DataArchPackage.OFFICE_FILE__ITALICS:
				return isItalics();
			case DataArchPackage.OFFICE_FILE__UNDERLINE:
				return isUnderline();
			case DataArchPackage.OFFICE_FILE__URL:
				return getUrl();
			case DataArchPackage.OFFICE_FILE__SIZE:
				return getSize();
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
			case DataArchPackage.OFFICE_FILE__TEXT:
				setText((String)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__FONT:
				setFont((String)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__TEXTSIZE:
				setTextsize((String)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__COLOR:
				setColor((String)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__BOLD:
				setBold((Boolean)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__ITALICS:
				setItalics((Boolean)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__URL:
				setUrl((String)newValue);
				return;
			case DataArchPackage.OFFICE_FILE__SIZE:
				setSize((Integer)newValue);
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
			case DataArchPackage.OFFICE_FILE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__TEXTSIZE:
				setTextsize(TEXTSIZE_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__ITALICS:
				setItalics(ITALICS_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DataArchPackage.OFFICE_FILE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case DataArchPackage.OFFICE_FILE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DataArchPackage.OFFICE_FILE__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case DataArchPackage.OFFICE_FILE__TEXTSIZE:
				return TEXTSIZE_EDEFAULT == null ? textsize != null : !TEXTSIZE_EDEFAULT.equals(textsize);
			case DataArchPackage.OFFICE_FILE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case DataArchPackage.OFFICE_FILE__BOLD:
				return bold != BOLD_EDEFAULT;
			case DataArchPackage.OFFICE_FILE__ITALICS:
				return italics != ITALICS_EDEFAULT;
			case DataArchPackage.OFFICE_FILE__UNDERLINE:
				return underline != UNDERLINE_EDEFAULT;
			case DataArchPackage.OFFICE_FILE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DataArchPackage.OFFICE_FILE__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", font: ");
		result.append(font);
		result.append(", textsize: ");
		result.append(textsize);
		result.append(", color: ");
		result.append(color);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italics: ");
		result.append(italics);
		result.append(", underline: ");
		result.append(underline);
		result.append(", url: ");
		result.append(url);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //OfficeFileImpl
