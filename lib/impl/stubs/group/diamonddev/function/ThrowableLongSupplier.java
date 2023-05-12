package group.diamonddev.function;


/**
 *  Represents a supplier of {@code long}-valued results.
 * 
 *  @param <E> the type of the exception
 * 
 *  @author Diamond
 *  @see LongSupplier
 *  @since 1.0.0
 */
public interface ThrowableLongSupplier {

	/**
	 *  Gets a result.
	 * 
	 *  @return a result
	 *  @throws E an exception
	 */
	public long getAsLong();
}
