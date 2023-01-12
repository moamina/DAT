/**
 */
package DataArch.tests;

import DataArch.DataArchFactory;
import DataArch.QualityMetrices;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Metrices</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityMetricesTest extends TestCase {

	/**
	 * The fixture for this Quality Metrices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMetrices fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualityMetricesTest.class);
	}

	/**
	 * Constructs a new Quality Metrices test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityMetricesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quality Metrices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QualityMetrices fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quality Metrices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityMetrices getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataArchFactory.eINSTANCE.createQualityMetrices());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //QualityMetricesTest
