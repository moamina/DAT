/**
 */
package DataArch.tests;

import DataArch.DataArchFactory;
import DataArch.DocumentOriented;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Oriented</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentOrientedTest extends NoSQLTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentOrientedTest.class);
	}

	/**
	 * Constructs a new Document Oriented test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentOrientedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Document Oriented test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DocumentOriented getFixture() {
		return (DocumentOriented)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataArchFactory.eINSTANCE.createDocumentOriented());
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

} //DocumentOrientedTest
