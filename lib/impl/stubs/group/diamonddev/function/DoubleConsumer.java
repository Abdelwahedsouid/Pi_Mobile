package group.diamonddev.function;


/**
 *  Represents an operation on a {@code double}-valued input argument.
 * 
 *  @author Diamond
 *  @see Consumer
 *  @since 1.0.0
 */
public interface DoubleConsumer {

	/**
	 *  Performs operation on the given argument.
	 * 
	 *  @param value the input argument
	 */
	public void accept(double value);
}
