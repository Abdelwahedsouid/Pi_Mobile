package group.diamonddev.function;


/**
 *  Represents a predicate (function with boolean type result).
 * 
 *  @param <T> the type of the input to the function
 * 
 *  @author Diamond
 */
public interface Predicate {

	/**
	 *  Tests the value for satisfying predicate.
	 * 
	 *  @param value the value to be tested
	 * 
	 *  @return {@code true} if the value matches the predicate, otherwise {@code false}
	 */
	public boolean test(Object value);
}
