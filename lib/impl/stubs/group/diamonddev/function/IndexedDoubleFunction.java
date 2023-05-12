package group.diamonddev.function;


/**
 *  Represents a function which produces result from the index and input argument.
 * 
 *  @param <R> the type of the result of the function
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public interface IndexedDoubleFunction {

	/**
	 *  Applies this function to the given argument.
	 * 
	 *  @param index the index
	 *  @param value an argument
	 * 
	 *  @return the function result
	 */
	public Object apply(int index, double value);
}
