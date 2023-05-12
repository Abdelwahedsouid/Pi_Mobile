package group.diamonddev.function;


/**
 *  Represents an operation on a {@code long}-valued input argument.
 * 
 *  @author Diamond
 *  @see Consumer
 *  @since 1.0.0
 */
public interface LongConsumer {

	/**
	 *  Performs operation on the given argument.
	 * 
	 *  @param value the input argument
	 */
	public void accept(long value);
}
