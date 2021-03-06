package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.annotations.CS2JInfo;
import agi.foundation.compatibility.annotations.CS2JWarning;
import agi.foundation.compatibility.DoubleHelper;
import agi.foundation.compatibility.IEquatable;
import agi.foundation.compatibility.ImmutableValueType;
import agi.foundation.compatibility.StringHelper;

/**
 *  
 A set of rectilinear 3-dimensional coordinates.
 
 

 * 
 The corresponding 2-dimensional coordinates are  {@link Rectangular} coordinates.
 
 */
@CS2JWarning("Unhandled attribute removed: SuppressMessage")
public class Cartesian implements IEquatable<Cartesian>, ImmutableValueType {
	/**
	 * Initializes a new instance.
	 */
	public Cartesian() {}

	/**
	 *  Gets a set of  {@link Cartesian} coordinates with values of zero.
	

	 */
	public static Cartesian getZero() {
		return s_zero;
	}

	/**
	 *  Gets a set of  {@link Cartesian} coordinates with values of  {@link Double#NaN}.
	
	

	 * 
	Use <code>IsUndefined</code> ({@link Cartesian#getIsUndefined get}) to test whether a  {@link Cartesian} instance
	is undefined since it will return <see langword="true" /> if any of the coordinate values
	are  {@link Double#NaN}.
	
	 */
	public static Cartesian getUndefined() {
		return s_undefined;
	}

	/**
	 *  
	Initializes a set of  {@link Cartesian} coordinates from the provided values.
	
	
	
	

	 * @param x The linear coordinate along the positive x-axis.
	 * @param y The linear coordinate along the positive y-axis.
	 * @param z The linear coordinate along the positive z-axis.
	 */
	@CS2JWarning("Unhandled attribute removed: SuppressMessage")
	public Cartesian(double x, double y, double z) {
		m_x = x;
		m_y = y;
		m_z = z;
	}

	/**
	 *  Gets the linear coordinate along the positive x-axis.
	

	 */
	public final double getX() {
		return m_x;
	}

	/**
	 *  Gets the linear coordinate along the positive y-axis.
	

	 */
	public final double getY() {
		return m_y;
	}

	/**
	 *  Gets the linear coordinate along the positive z-axis.
	

	 */
	public final double getZ() {
		return m_z;
	}

	/**
	 *  
	Multiplies this instance by a scalar.
	
	
	

	 * @param scalar The multiplier, or value which is to multiply this instance.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the multiplication.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian multiply(double scalar) {
		return new Cartesian(m_x * scalar, m_y * scalar, m_z * scalar);
	}

	/**
	 *  
	Divides this instance by a scalar.
	
	
	

	 * @param scalar The divisor, or value which is to divide this instance.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the division.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian divide(double scalar) {
		return new Cartesian(m_x / scalar, m_y / scalar, m_z / scalar);
	}

	/**
	 *  
	Adds the specified set of  {@link Cartesian} coordinates to this instance.
	
	
	

	 * @param other The addend, or value which is to be added to this instance.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the addition.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian add(Cartesian other) {
		return new Cartesian(m_x + other.m_x, m_y + other.m_y, m_z + other.m_z);
	}

	/**
	 *  
	Subtracts the specified set of  {@link Cartesian} coordinates from this instance.
	
	
	

	 * @param other The subtrahend, or value which is to be subtracted from this instance.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the subtraction.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian subtract(Cartesian other) {
		return new Cartesian(m_x - other.m_x, m_y - other.m_y, m_z - other.m_z);
	}

	/**
	 *  
	Forms the cross product of the specified set of  {@link Cartesian} coordinates with this instance.
	
	
	

	 * @param other The set of  {@link Cartesian} coordinates to cross with this instance.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the product.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian cross(Cartesian other) {
		return new Cartesian(m_y * other.m_z - m_z * other.m_y, m_z * other.m_x - m_x * other.m_z, m_x * other.m_y - m_y * other.m_x);
	}

	/**
	 *  
	Forms the dot product of the specified set of  {@link Cartesian} coordinates with this instance.
	
	
	

	 * @param other The set of  {@link Cartesian} coordinates to dot with this instance.
	 * @return A  <code>double</code> that represents the result of the product.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final double dot(Cartesian other) {
		return m_x * other.m_x + m_y * other.m_y + m_z * other.m_z;
	}

	/**
	 *  
	Multiplies a specified set of  {@link Cartesian} coordinates by a scalar.
	
	
	
	

	 * @param left The multiplicand, or value which is to be multiplied by <code>right</code>.
	 * @param right The multiplier, or value which is to multiply <code>left</code>.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the multiplication.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian *(Cartesian,System.Double)'")
	public static Cartesian multiply(Cartesian left, double right) {
		return left.multiply(right);
	}

	/**
	 *  
	Multiplies a scalar by a specified set of set of  {@link Cartesian} coordinates.
	
	
	
	

	 * @param left The multiplicand, or value which is to be multiplied by <code>right</code>.
	 * @param right The multiplier, or value which is to multiply <code>left</code>.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the multiplication.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian *(System.Double,Cartesian)'")
	public static Cartesian multiply(double left, Cartesian right) {
		return right.multiply(left);
	}

	/**
	 *  
	Divides a specified set of  {@link Cartesian} coordinates by a scalar.
	
	
	
	

	 * @param left The dividend, or value which is to be divided by <code>right</code>.
	 * @param right The divisor, or value which is to divide <code>left</code>.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the division.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian /(Cartesian,System.Double)'")
	public static Cartesian divide(Cartesian left, double right) {
		return left.divide(right);
	}

	/**
	 *  
	Adds a specified set of  {@link Cartesian} coordinates to another specified set of  {@link Cartesian} coordinates.
	
	
	
	

	 * @param left The augend, or value to which <code>right</code> is to be added.
	 * @param right The addend, or value which is to be added to <code>left</code>.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the addition.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian +(Cartesian,Cartesian)'")
	public static Cartesian add(Cartesian left, Cartesian right) {
		return left.add(right);
	}

	/**
	 *  
	Subtracts a specified set of  {@link Cartesian} coordinates from another specified set of  {@link Cartesian} coordinates.
	
	
	
	

	 * @param left The minuend, or value from which <code>right</code> is to be subtracted.
	 * @param right The subtrahend, or value which is to be subtracted from <code>left</code>.
	 * @return A set of  {@link Cartesian} coordinates that represents the result of the subtraction.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian -(Cartesian,Cartesian)'")
	public static Cartesian subtract(Cartesian left, Cartesian right) {
		return left.subtract(right);
	}

	/**
	 *  
	Negates the specified set of  {@link Cartesian} coordinates, yielding a new set of  {@link Cartesian} coordinates.
	
	
	

	 * @param coordinates The set of coordinates.
	 * @return The result of negating the elements of the original set of  {@link Cartesian} coordinates.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Cartesian -(Cartesian)'")
	public static Cartesian negate(Cartesian coordinates) {
		return new Cartesian(-coordinates.m_x, -coordinates.m_y, -coordinates.m_z);
	}

	/**
	 *  
	<p>
	Produces a set of  {@link Cartesian} coordinates representing this instance which results from rotating
	the original axes used to represent this instance by the provided  {@link Matrix3By3} rotation. 
	This type of rotation is sometimes referred to as an "alias rotation".
	</p>
	
	
	

	 * @param rotation The  {@link Matrix3By3} rotation.
	 * @return A set of  {@link Cartesian} coordinates which is the result of the rotation.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian rotate(Matrix3By3 rotation) {
		return new Cartesian(rotation.getM11() * m_x + rotation.getM12() * m_y + rotation.getM13() * m_z, rotation.getM21() * m_x + rotation.getM22() * m_y + rotation.getM23() * m_z, rotation
				.getM31()
				* m_x + rotation.getM32() * m_y + rotation.getM33() * m_z);
	}

	/**
	 *  
	<p>
	Produces a set of  {@link Cartesian} coordinates representing this instance which results from rotating
	the original axes used to represent this instance by the provided  {@link UnitQuaternion} rotation.
	This type of rotation is sometimes referred to as an "alias rotation".
	</p>
	
	
	

	 * @param rotation The  {@link UnitQuaternion} rotation.
	 * @return A set of  {@link Cartesian} coordinates which is the result of the rotation.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Cartesian rotate(UnitQuaternion rotation) {
		double w = rotation.getW();
		double difference = w * w - rotation.getX() * rotation.getX() - rotation.getY() * rotation.getY() - rotation.getZ() * rotation.getZ();
		double dot = m_x * rotation.getX() + m_y * rotation.getY() + m_z * rotation.getZ();
		return new Cartesian(difference * m_x + 2.0 * (w * (m_y * rotation.getZ() - m_z * rotation.getY()) + dot * rotation.getX()), difference * m_y + 2.0
				* (w * (m_z * rotation.getX() - m_x * rotation.getZ()) + dot * rotation.getY()), difference * m_z + 2.0 * (w * (m_x * rotation.getY() - m_y * rotation.getX()) + dot * rotation.getZ()));
	}

	/**
	 *  Gets the axis which is most orthogonal to this instance.
	

	 */
	public final UnitCartesian getMostOrthogonalAxis() {
		double x = Math.abs(m_x);
		double y = Math.abs(m_y);
		double z = Math.abs(m_z);
		if (x <= y) {
			return x <= z ? UnitCartesian.getUnitX() : UnitCartesian.getUnitZ();
		} else {
			return y <= z ? UnitCartesian.getUnitY() : UnitCartesian.getUnitZ();
		}
	}

	/**
	 *  Gets whether or not any of the coordinates for this instance have the value  {@link Double#NaN}.
	

	 */
	public final boolean getIsUndefined() {
		return Double.isNaN(m_x) || Double.isNaN(m_y) || Double.isNaN(m_z);
	}

	/**
	 *  
	Indicates whether another object is exactly equal to this instance.
	
	
	

	 * @param obj The object to compare to this instance.
	 * @return <see langword="true" /> if <code>obj</code> is an instance of this type and represents the same value as this instance; otherwise, <see langword="false" />.
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Cartesian && equalsType((Cartesian) obj);
	}

	/**
	 *  
	Indicates whether another instance of this type is exactly equal to this instance.
	
	
	

	 * @param other The instance to compare to this instance.
	 * @return <see langword="true" /> if <code>other</code> represents the same value as this instance; otherwise, <see langword="false" />.
	 */
	public final boolean equalsType(Cartesian other) {
		return Double.valueOf(m_x).equals(other.m_x) && Double.valueOf(m_y).equals(other.m_y) && Double.valueOf(m_z).equals(other.m_z);
	}

	/**
	 *  
	Indicates whether each coordinate value of another instance of this type
	is within the required tolerance of the corresponding coordinate value of this instance.
	
	
	
	

	 * @param other The set of  {@link Cartesian} coordinates to compare to this instance.
	 * @param epsilon The limit at which the absolute differences between the coordinate values will not be considered equal.
	 * @return 
	<see langword="true" /> if the absolute differences are less than or equal to <code>epsilon</code>; otherwise, <see langword="false" />.
	
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final boolean equalsEpsilon(Cartesian other, double epsilon) {
		return Math.abs(m_x - other.m_x) <= epsilon && Math.abs(m_y - other.m_y) <= epsilon && Math.abs(m_z - other.m_z) <= epsilon;
	}

	/**
	 *  
	Returns a hash code for this instance, which is suitable for use in hashing algorithms and data structures like a hash table.
	
	

	 * @return A hash code for the current object.
	 */
	@Override
	public int hashCode() {
		return HashCode.combine(DoubleHelper.hashCode(m_x), DoubleHelper.hashCode(m_y), DoubleHelper.hashCode(m_z));
	}

	/**
	 *  
	Returns the string representation of the value of this instance.
	
	

	 * @return 
	A string that represents the value of this instance in the form
	"X, Y, Z".
	
	 */
	@Override
	public String toString() {
		return StringHelper.format("{0}, {1}, {2}", m_x, m_y, m_z);
	}

	/**
	 *  
	Returns <see langword="true" /> if the two instances are exactly equal.
	
	
	
	

	 * @param left The instance to compare to <code>right</code>.
	 * @param right The instance to compare to <code>left</code>.
	 * @return 
	<see langword="true" /> if <code>left</code> represents the same value as <code>right</code>; otherwise, <see langword="false" />.
	
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'System.Boolean ==(Cartesian,Cartesian)'")
	public static boolean equals(Cartesian left, Cartesian right) {
		return left.equalsType(right);
	}

	/**
	 *  
	Returns <see langword="true" /> if the two instances are not exactly equal.
	
	
	
	

	 * @param left The instance to compare to <code>right</code>.
	 * @param right The instance to compare to <code>left</code>.
	 * @return 
	<see langword="true" /> if <code>left</code> does not represent the same value as <code>right</code>; otherwise, <see langword="false" />.
	
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'System.Boolean !=(Cartesian,Cartesian)'")
	public static boolean notEquals(Cartesian left, Cartesian right) {
		return !left.equalsType(right);
	}

	/**
	 *  Gets the magnitude of this instance.
	

	 */
	public final double getMagnitude() {
		return Math.sqrt(getMagnitudeSquared());
	}

	/**
	 *  Gets the square of the <code>Magnitude</code> ({@link #getMagnitude get}) of this instance.
	

	 */
	public final double getMagnitudeSquared() {
		return m_x * m_x + m_y * m_y + m_z * m_z;
	}

	/**
	 *  
	Forms a set of  {@link UnitCartesian} coordinates from this instance.
	
	
	
	

	 * @return The resulting set of  {@link UnitCartesian} coordinates.
	 * @exception ArithmeticException 
	The magnitude of the provided coordinates must not be zero.
	
	 * @exception ArithmeticException 
	The magnitude of the provided coordinates must not be infinite.
	
	 */
	public final UnitCartesian normalize() {
		double magnitude = 0D;
		double[] out$magnitude_1 = {
			0D
		};
		UnitCartesian temp_0 = normalize(out$magnitude_1);
		magnitude = out$magnitude_1[0];
		return temp_0;
	}

	/**
	 *  
	Forms a set of  {@link UnitCartesian} coordinates from this instance
	and returns the <code>Magnitude</code> ({@link #getMagnitude get}) of the original instance in the provided parameter.
	
	
	
	
	

	 * @param magnitude 
	On input, an array with one element.  On return, the array is populated with
	
	the magnitude of the original set of  {@link Cartesian} coordinates.
	
	 * @return The resulting set of  {@link UnitCartesian} coordinates.
	 * @exception ArithmeticException 
	The magnitude of the provided coordinates must not be zero.
	
	 * @exception ArithmeticException 
	The magnitude of the provided coordinates must not be infinite.
	
	 */
	@CS2JWarning("Unhandled attribute removed: SuppressMessage")
	public final UnitCartesian normalize(double[] magnitude) {
		return new UnitCartesian(m_x, m_y, m_z, magnitude);
	}

	/**
	 *  
	Converts a set of  {@link UnitCartesian} coordinates to a set of  {@link Cartesian} coordinates.
	
	
	

	 * @param coordinates The set of  {@link UnitCartesian} coordinates.
	 * @return The resulting set of  {@link Cartesian} coordinates.
	 */
	@CS2JInfo("This method implements the functionality of the implicit conversion operation 'Cartesian <= UnitCartesian'")
	public static Cartesian toCartesian(UnitCartesian coordinates) {
		return new Cartesian(coordinates.getX(), coordinates.getY(), coordinates.getZ());
	}

	private double m_x;
	private double m_y;
	private double m_z;
	private static Cartesian s_zero = new Cartesian(0.0, 0.0, 0.0);
	private static Cartesian s_undefined = new Cartesian(Double.NaN, Double.NaN, Double.NaN);
}