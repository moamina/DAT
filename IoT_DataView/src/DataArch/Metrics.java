/**
 */
package DataArch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metrics</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see DataArch.DataArchPackage#getMetrics()
 * @model
 * @generated
 */
public enum Metrics implements Enumerator {
	/**
	 * The '<em><b>Completeness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETENESS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETENESS(1, "Completeness", "Completeness"),

	/**
	 * The '<em><b>Consistency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSISTENCY_VALUE
	 * @generated
	 * @ordered
	 */
	CONSISTENCY(2, "Consistency", "Consistency"),

	/**
	 * The '<em><b>Validity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDITY(3, "Validity", "Validity"), /**
	 * The '<em><b>Accuracy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCURACY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCURACY(4, "Accuracy", "Accuracy"),

	/**
	 * The '<em><b>Uniqueness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUENESS_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUENESS(5, "Uniqueness", "Uniqueness"), /**
	 * The '<em><b>Timeliness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMELINESS_VALUE
	 * @generated
	 * @ordered
	 */
	TIMELINESS(6, "Timeliness", "Timeliness");

	/**
	 * The '<em><b>Completeness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETENESS
	 * @model name="Completeness"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETENESS_VALUE = 1;

	/**
	 * The '<em><b>Consistency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSISTENCY
	 * @model name="Consistency"
	 * @generated
	 * @ordered
	 */
	public static final int CONSISTENCY_VALUE = 2;

	/**
	 * The '<em><b>Validity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDITY
	 * @model name="Validity"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDITY_VALUE = 3;

	/**
	 * The '<em><b>Accuracy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCURACY
	 * @model name="Accuracy"
	 * @generated
	 * @ordered
	 */
	public static final int ACCURACY_VALUE = 4;

	/**
	 * The '<em><b>Uniqueness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUENESS
	 * @model name="Uniqueness"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUENESS_VALUE = 5;

	/**
	 * The '<em><b>Timeliness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMELINESS
	 * @model name="Timeliness"
	 * @generated
	 * @ordered
	 */
	public static final int TIMELINESS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metrics[] VALUES_ARRAY =
		new Metrics[] {
			COMPLETENESS,
			CONSISTENCY,
			VALIDITY,
			ACCURACY,
			UNIQUENESS,
			TIMELINESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metrics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metrics get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrics result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metrics getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrics result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metrics get(int value) {
		switch (value) {
			case COMPLETENESS_VALUE: return COMPLETENESS;
			case CONSISTENCY_VALUE: return CONSISTENCY;
			case VALIDITY_VALUE: return VALIDITY;
			case ACCURACY_VALUE: return ACCURACY;
			case UNIQUENESS_VALUE: return UNIQUENESS;
			case TIMELINESS_VALUE: return TIMELINESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Metrics(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Metrics
