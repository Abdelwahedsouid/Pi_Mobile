package group.diamonddev.function;


/**
 *  Represents a function which produces result from two input arguments.
 * 
 *  @param <T> the type of the first argument
 *  @param <U> the type of the second argument
 *  @param <R> the type of the result of the function
 * 
 *  @author Diamond
 */
public interface BiFunction {

	/**
	 *  Applies this function to the given arguments.
	 * 
	 *  @param value1 the first argument
	 *  @param value2 the second argument
	 * 
	 *  @return the function result
	 */
	public Object apply(Object value1, Object value2);
}
