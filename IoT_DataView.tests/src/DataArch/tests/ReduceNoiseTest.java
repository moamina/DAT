/**
 */
package DataArch.tests;

import DataArch.DataArchFactory;
import DataArch.ReduceNoise;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reduce Noise</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReduceNoiseTest extends IngestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReduceNoiseTest.class);
	}

	/**
	 * Constructs a new Reduce Noise test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceNoiseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reduce Noise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReduceNoise getFixture() {
		return (ReduceNoise)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataArchFactory.eINSTANCE.createReduceNoise());
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

} //ReduceNoiseTest
