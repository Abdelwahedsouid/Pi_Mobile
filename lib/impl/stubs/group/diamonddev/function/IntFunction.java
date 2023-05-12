package group.diamonddev.function;


/**
 *  Represents a function that accepts an int-valued argument and produces a
 *  result.  This is the {@code int}-consuming primitive specialization for
 *  {@link Function}.
 * 
 *  <p>This is a <a href="package-summary.html">functional interface</a>
 *  whose functional method is {@link #apply(int)}.
 * 
 *  @param <R> the type of the result of the function
 * 
 *  @author Diamond
 *  @see Function
 */
public interface IntFunction {

	/**
	 *  Applies this function to the given argument.
	 * 
	 *  @param value the function argument
	 * 
	 *  @return the function result
	 */
	public Object apply(int value);
}
