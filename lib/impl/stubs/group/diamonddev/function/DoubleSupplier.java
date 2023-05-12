package group.diamonddev.function;


/**
 *  Represents a supplier of {@code double}-valued results.
 * 
 *  @author Diamond
 *  @see Supplier
 *  @since 1.0.0
 */
public interface DoubleSupplier {

	/**
	 *  Gets a result.
	 * 
	 *  @return a result
	 */
	public double getAsDouble();
}
