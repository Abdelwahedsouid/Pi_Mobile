package group.diamonddev.function;


/**
 *  Represents a supplier of {@code long}-valued results.
 * 
 *  @author Diamond
 *  @see Supplier
 *  @since 1.0.0
 */
public interface LongSupplier {

	/**
	 *  Gets a result.
	 * 
	 *  @return a result
	 */
	public long getAsLong();
}
