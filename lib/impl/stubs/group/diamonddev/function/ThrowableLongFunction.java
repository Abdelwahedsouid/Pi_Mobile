package group.diamonddev.function;


/**
 *  Represents a function which produces result from {@code long}-valued input argument.
 * 
 *  @param <R> the type of the result of the function
 *  @param <E> the type of the exception
 * 
 *  @author Diamond
 *  @see LongFunction
 *  @since 1.0.0
 */
public interface ThrowableLongFunction {

	/**
	 *  Applies this function to the given argument.
	 * 
	 *  @param value the function argument
	 * 
	 *  @return the function result
	 *  @throws E an exception
	 */
	public Object apply(long value);
}
