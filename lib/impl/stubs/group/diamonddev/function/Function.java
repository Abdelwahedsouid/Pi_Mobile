package group.diamonddev.function;


/**
 *  Represents a function which produces result from input arguments.
 * 
 *  @param <T> the type of the input of the function
 *  @param <R> the type of the result of the function
 * 
 *  @author Diamond
 */
public interface Function {

	/**
	 *  Applies this function to the given argument.
	 * 
	 *  @param t an argument
	 * 
	 *  @return the function result
	 */
	public Object apply(Object t);
}
